package com.testautomation.apitesting.tests;

import com.jayway.jsonpath.JsonPath;
import com.testautomation.apitesting.utils.BaseTest;
import com.testautomation.apitesting.utils.FileNameConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;
import net.minidev.json.parser.JSONParser;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class POSTAPIRequestUsingFile extends BaseTest {

    @Test
    public void postAPIRequest() throws IOException {
        String postAPIRequestBody = FileUtils.readFileToString(new File(FileNameConstants.POST_API_REQUEST_BODY), "UTF-8");
        //System.out.println(postAPIRequestBody);

        Response response =
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(postAPIRequestBody)
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .post()
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();

        JSONArray jsonArrayFirstName = JsonPath.read(response.body().asString(), "$.booking..firstname");
        //System.out.println(jsonArray.get(0));
        String firstName = (String) jsonArrayFirstName.get(0);
        Assert.assertEquals(firstName, "John1");

        JSONArray jsonArrayLastName = JsonPath.read(response.body().asString(), "$.booking..lastname");
        //System.out.println(jsonArray.get(0));
        String lastName = (String) jsonArrayLastName.get(0);
        Assert.assertEquals(lastName, "Doe");

        JSONArray jsonArrayCheckIn = JsonPath.read(response.body().asString(), "$.booking..bookingdates..checkin");
        String checkIn = (String) jsonArrayCheckIn.get(0);
        Assert.assertEquals(checkIn, "2026-01-01");

        int bookingId = JsonPath.read(response.body().asString(), "$.bookingid");

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


