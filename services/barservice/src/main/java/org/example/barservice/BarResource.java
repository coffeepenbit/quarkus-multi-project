package org.example.barservice;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.example.libs.CredentialManager;

/**
 * Bar REST resource.
 */
@Path("/bar")
public class BarResource {

    @Inject
    CredentialManager manager;

    @GET
    public String bar() {
        return manager.getCredential("bar");
    }
}
