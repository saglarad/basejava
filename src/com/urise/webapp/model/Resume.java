package com.urise.webapp.model;

/**
 * Initial resume class
 */
public class Resume {

    // Unique identifier
    String uuid;

    String email;

    @Override
    public String toString() {
        return "com.urise.webapp.model.Resume{" +
                "uuid='" + uuid + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
