package org.example.barservice;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Configuration tests for bar service.
 */
@QuarkusTest
class ConfigTest {
    @Test
    void checkMessageOverride() {
        String value = ConfigProvider.getConfig().getValue("greeting.message", String.class);
        assertEquals("Hello from Bar", value);
    }
}
