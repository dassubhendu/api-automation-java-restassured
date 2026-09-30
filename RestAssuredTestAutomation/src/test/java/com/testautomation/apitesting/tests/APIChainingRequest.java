package com.testautomation.apitesting.tests;

import com.testautomation.apitesting.utils.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class APIChainingRequest extends BaseTest {

    @Test
    public void createBooking(){

        //RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        JSONObject booking = new JSONObject();
        JSONObject bookingDates = new JSONObject();

        booking.put("firstname", "David1");
        booking.put("lastname", "Doe");
        booking.put("totalprice", "2000");
        booking.put("depositpaid", true);
        booking.put("additionalneeds", "breakfast");
        booking.put("bookingdates", bookingDates);

        bookingDates.put("checkin", "2026-09-02");
        bookingDates.put("checkout", "2026-09-05");

        Response response =
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(booking.toString())
                .baseUri("https://restful-booker.herokuapp.com/booking")
                //.log().body()
                //.log().headers()
                .when()
                .post()
                .then()
                .log().all()
                //.log().ifValidationFails()
                .assertThat()
                .statusCode(200)
                .body("booking.firstname", Matchers.equalTo("David1"))
                .body("booking.totalprice", Matchers.equalTo(2000))
                .body("booking.bookingdates.checkin", Matchers.equalTo("2026-09-02"))
                .extract()
                .response();

        int bookingID = response.path("bookingid");

        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .pathParam("bookingID", bookingID)
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get("{bookingID}")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("firstname", Matchers.equalTo("David1"))
                .body("lastname", Matchers.equalTo("Doe"));

    }

}






