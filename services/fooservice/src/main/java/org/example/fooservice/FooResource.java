package org.example.fooservice;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.example.libs.CredentialManager;

/**
 * Foo REST resource.
 */
@Path("/foo")
public class FooResource {

    @Inject
    CredentialManager manager;

    @GET
    public String foo() {
        return manager.getCredential("foo");
    }
}
