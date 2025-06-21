package org.example.lib;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for credential manager.
 */
@QuarkusTest
class CredentialManagerTest {

    @Inject
    CredentialManager manager;

    @Test
    void credentialIsDummy() {
        assertEquals("dummy", manager.getCredential());
    }
}
