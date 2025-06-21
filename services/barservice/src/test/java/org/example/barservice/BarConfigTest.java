package org.example.barservice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

/**
 * Tests bar configuration.
 */
@QuarkusTest
class BarConfigTest {
    @Test
    void defaultOverride() {
        given().when().get("/bar").then().statusCode(200).body(is("credential-bar"));
    }
}
