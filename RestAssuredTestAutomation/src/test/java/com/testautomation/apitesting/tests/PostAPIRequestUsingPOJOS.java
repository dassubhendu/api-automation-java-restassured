package com.testautomation.apitesting.tests;

import com.testautomation.apitesting.pojos.Booking;
import com.testautomation.apitesting.pojos.BookingDates;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import tools.jackson.databind.ObjectMapper;

import java.awt.print.Book;

public class PostAPIRequestUsingPOJOS {
    /**
     * Serialization using POJO
     * While we are converting JAVA class object to JSON object
     */
    @Test
    public void postAPIRequest(){
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

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get("/{bookingId}", bookingId)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200);

    }

}


