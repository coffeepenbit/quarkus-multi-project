package org.example.fooservice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

/**
 * Tests foo configuration.
 */
@QuarkusTest
class FooConfigTest {
    @Test
    void defaultOverride() {
        given().when().get("/foo").then().statusCode(200).body(is("credential-foo"));
    }
}
