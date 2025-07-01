package org.acme;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Embeddable
public class ChildEmbeddedEntity {

    @NotBlank
    private String test;

    @NotNull
    private String test2;
}
