package org.example.libs;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Handles credential management.
 */
@ApplicationScoped
public class CredentialManager {
    /**
     * Gets a credential for an id.
     *
     * @param id the identifier
     * @return sample credential string
     */
    public String getCredential(String id) {
        return "credential-" + id;
    }
}
