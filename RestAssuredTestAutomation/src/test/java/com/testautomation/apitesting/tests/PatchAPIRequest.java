package com.testautomation.apitesting.tests;

import com.jayway.jsonpath.JsonPath;
import com.testautomation.apitesting.utils.FileNameConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONArray;
import org.apache.commons.io.FileUtils;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PatchAPIRequest {

    @Test
    public void patchAPIRequest() throws IOException {
        String postAPIRequestBody = FileUtils.readFileToString(new File(FileNameConstants.POST_API_REQUEST_BODY), "UTF-8");
        //System.out.println(postAPIRequestBody);

        String  tokenRequestBody = FileUtils.readFileToString(new File(FileNameConstants.TOKEN_REQUEST_BODY), "UTF-8");
        String  putAPIRequestBody = FileUtils.readFileToString(new File(FileNameConstants.PUT_API_REQUEST_BODY), "UTF-8");
        String  patchAPIRequestBody = FileUtils.readFileToString(new File(FileNameConstants.PATCH_API_REQUEST_BODY), "UTF-8");

        /* POST API Call */
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

        int bookingId = JsonPath.read(response.body().asString(), "$.bookingid");

        /* GET API Call */
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

        /* Token generation */
        Response tokenAPIResponse =
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(tokenRequestBody)
                .baseUri("https://restful-booker.herokuapp.com/auth")
                .when()
                .post()
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response();

        String token = JsonPath.read(tokenAPIResponse.body().asString(), "$.token");

        /* PUT API Call */
        RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(putAPIRequestBody)
                .header("Cookie", "token="+token)
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .put("{bookingId}", bookingId)
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .body("firstname", Matchers.equalTo("Steven"))
                .body("lastname", Matchers.equalTo("Waugh"));

        /* PATCH API call */
                RestAssured
                        .given()
                        .contentType(ContentType.JSON)
                        .body(patchAPIRequestBody)
                        .header("Cookie", "token="+token)
                        .baseUri("https://restful-booker.herokuapp.com/booking")
                        .when()
                        .patch("{bookingId}", bookingId)
                        .then()
                        .log().all()
                        .assertThat()
                        .statusCode(200)
                        .body("firstname", Matchers.equalTo("Tony123"));

    }

}


