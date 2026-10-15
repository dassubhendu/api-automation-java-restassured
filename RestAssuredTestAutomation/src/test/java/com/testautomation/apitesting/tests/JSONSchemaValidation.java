package com.testautomation.apitesting.tests;

import com.testautomation.apitesting.pojos.Booking;
import com.testautomation.apitesting.pojos.BookingDates;
import com.testautomation.apitesting.utils.FileNameConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONSchemaValidation {

    @Test
    public void postAPIRequest() throws IOException {

        /* The below file is required for JSON schema validation  */
        String jsonSchema = FileUtils.readFileToString(new File(FileNameConstants.JSON_SCHEMA), "UTF-8");


        /* Serialization */
        BookingDates bookingDates = new BookingDates("2026-09-21", "2026-09-23");
        Booking booking = new Booking("David", "Joe", "breakfast", 2000, true, bookingDates);

        // For data binding we need to add jackson databind library in pom.xml
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        System.out.println(requestBody);

        /* Deserialization */
        Booking bookingDetails = objectMapper.readValue(requestBody, Booking.class);
        System.out.println(bookingDetails.getFirstname());
        System.out.println(bookingDetails.getTotalprice());
        System.out.println(bookingDetails.getBookingdates().getCheckin());
        System.out.println(bookingDetails.getBookingdates().getCheckout());

        /* POST request using POJO */
        Response response =
                RestAssured
                        .given()
                        .contentType(ContentType.JSON)
                        .body(requestBody)
                        .baseUri("https://restful-booker.herokuapp.com/booking")
                        .when()
                        .post()
                        .then()
                        .log().all()
                        .assertThat()
                        .statusCode(200)
                        .extract()
                        .response();

        int bookingId = response.path("bookingid");

        /* Printing the json schema */
        /* For JSON Schema validation we need add one more library in maven pom.xml */
        System.out.println(jsonSchema);

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get("/{bookingId}", bookingId)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));

    }

    /**
     * In order to validate JSON schema first we need to convert the JSON response to JSON schema.
     * We need to go to this site 'https://www.liquid-technologies.com/online-json-to-schema-converter'
     * Most of the time we get json schema from dev team
     */

}
