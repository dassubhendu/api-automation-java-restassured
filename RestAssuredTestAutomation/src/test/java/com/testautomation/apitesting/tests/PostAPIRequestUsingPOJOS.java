package com.testautomation.apitesting.tests;

import com.testautomation.apitesting.pojos.Booking;
import com.testautomation.apitesting.pojos.BookingDates;
import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.testng.annotations.Test;
import tools.jackson.databind.ObjectMapper;

public class PostAPIRequestUsingPOJOS {

    @Test
    public void postAPIRequest(){
        BookingDates bookingDates = new BookingDates("2026-09-21", "2026-09-23");
        Booking booking = new Booking("David", "Joe", "breakfast", 2000, true, bookingDates);

        // For data binding we need to add jackson databind library in pom.xml
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        System.out.println(requestBody);

    }

}
