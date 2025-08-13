package org.acme;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import java.util.UUID;

@Entity
@Getter
public class ChildToManyEntity {

    @Id
    private UUID id;

    @Column(name = "parentId")
    private UUID parentId;

    public ChildToManyEntity() {
        id = UUID.randomUUID();
    }

    public ChildToManyEntity(UUID id, UUID parentId) {
        this.id = id;
        this.parentId = parentId;
    }

}
