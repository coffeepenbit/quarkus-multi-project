package org.example.libs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests credential handling.
 */
class CredentialManagerTest {
    CredentialManager manager;

    @BeforeEach
    void setup() {
        manager = new CredentialManager();
    }

    @Test
    void credentialValue() {
        assertEquals("credential-foo", manager.getCredential("foo"));
    }
}
