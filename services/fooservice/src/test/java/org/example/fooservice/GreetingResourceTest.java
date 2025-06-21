package org.example.fooservice;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.is;

/**
 * Greeting resource tests for foo service.
 */
@QuarkusTest
class GreetingResourceTest {

    @Test
    void testHelloEndpoint() {
        RestAssured.get("/foo").then().statusCode(200).body(is("Hello from Foo dummy"));
    }
}
