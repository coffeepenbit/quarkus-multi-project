package org.example.barservice;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

/**
 * Greeting resource tests for bar service.
 */
@QuarkusTest
class GreetingResourceTest {

    @Test
    void testHelloEndpoint() {
        RestAssured.get("/bar").then().statusCode(200).body(is("Hello from Bar dummy"));
    }
}
