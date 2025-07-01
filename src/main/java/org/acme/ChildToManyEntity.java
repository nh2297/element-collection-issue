package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class ChildToManyEntity {

    @Id
    private UUID id;
}
