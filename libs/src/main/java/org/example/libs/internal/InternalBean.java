package org.example.libs.internal;

import jakarta.enterprise.context.ApplicationScoped;

/**
 * Internal library bean.
 */
@ApplicationScoped
public class InternalBean {
    /**
     * Gets sample value.
     *
     * @return test value
     */
    public String value() {
        return "internal";
    }
}
