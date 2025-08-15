package org.acme;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import java.util.UUID;

@Entity
public class ParentOneToMany {

    @Id
    private UUID id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = ChildToManyEntity_.PARENT)
    private Set<ChildToManyEntity> childToManyEntities;

    public ParentOneToMany() {
    }

    public ParentOneToMany(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setChildToManyEntities(Set<ChildToManyEntity> childToManyEntities) {
        this.childToManyEntities = childToManyEntities;
    }

    public Set<ChildToManyEntity> getChildToManyEntities() {
        return childToManyEntities;
    }
}
