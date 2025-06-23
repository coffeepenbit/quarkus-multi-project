package org.example.lib;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests shared configuration defaults.
 */
@QuarkusTest
class ConfigTest {
    @Test
    void checkDefaultMessage() {
        String value = ConfigProvider.getConfig().getValue("greeting.message", String.class);
        assertEquals("Hello from root", value);
    }
}
