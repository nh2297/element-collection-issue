package org.acme.unidirectional;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class UniChildToMany {

    @Id
    private UUID id;

    @Column(name = "uniParentId")
    private UUID parentId;

    public UniChildToMany() {
        id = UUID.randomUUID();
    }

    public UniChildToMany(UUID id, UUID parentId) {
        this.id = id;
        this.parentId = parentId;
    }

    public UUID getParentId() {
        return parentId;
    }

    public void setParentId(UUID parentId) {
        this.parentId = parentId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
