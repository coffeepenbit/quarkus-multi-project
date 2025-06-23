package org.example.lib.impl;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Internal bean not exposed to services.
 */
@ApplicationScoped
public class InternalBean {
    /**
     * Indicates internal behavior.
     *
     * @return message text
     */
    public String ping() {
        return "internal";
    }
}
