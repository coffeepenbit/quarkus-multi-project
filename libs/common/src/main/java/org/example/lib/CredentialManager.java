package org.example.lib;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Provides credential information.
 */
@ApplicationScoped
public class CredentialManager {
    /**
     * Gets a dummy credential.
     *
     * @return credential string
     */
    public String getCredential() {
        return "dummy";
    }
}
