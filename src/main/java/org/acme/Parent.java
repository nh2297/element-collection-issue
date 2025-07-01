package org.acme;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "parent")
public class Parent {

    @Id
    private UUID id;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "parent_child_embedded_entity", joinColumns = @JoinColumn(name = "parent_id"))
    private Set<ChildEmbeddedEntity> childEmbeddedEntities;

}
