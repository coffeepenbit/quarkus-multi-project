package org.example.barservice;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.example.lib.CredentialManager;
import org.example.lib.AppLogger;

@Path("/bar")
public class GreetingResource {

    @ConfigProperty(name = "greeting.message")
    String message;

    @Inject
    CredentialManager manager;

    @Inject
    AppLogger logger;

    @GET
    public String hello() {
        logger.log("Bar greets");
        return message + " " + manager.getCredential();
    }
}
