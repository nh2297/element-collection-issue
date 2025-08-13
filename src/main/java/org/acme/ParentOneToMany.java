package org.acme;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
public class ParentOneToMany {

    @Id
    private UUID id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "parentId")
    private Set<ChildToManyEntity> childToManyEntities;

    public ParentOneToMany() {
    }

    public ParentOneToMany(UUID id, Set<ChildToManyEntity> childToManyEntities) {
        this.id = id;
        this.childToManyEntities = childToManyEntities;
    }


}
