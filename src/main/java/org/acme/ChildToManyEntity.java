package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class ChildToManyEntity {

    @Id
    private UUID id;

    @ManyToOne(fetch = jakarta.persistence.FetchType.LAZY)
    private ParentOneToMany parent;

    public ChildToManyEntity() {
        id = UUID.randomUUID();
    }

    public ChildToManyEntity(UUID id, ParentOneToMany parent) {
        this.id = id;
        this.parent = parent;
    }

    public UUID getId() {
        return id;
    }

    public ParentOneToMany getParent() {
        return parent;
    }
}
