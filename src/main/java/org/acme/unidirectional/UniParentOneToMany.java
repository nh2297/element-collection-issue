package org.acme.unidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.Set;
import java.util.UUID;

@Entity
public class UniParentOneToMany {

    @Id
    private UUID id;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "uniParentId")
    private Set<UniChildToMany> childToManyEntities;

    public UniParentOneToMany() {
    }

    public UniParentOneToMany(UUID id, Set<UniChildToMany> uniChildToManies) {
        this.id = id;
        this.childToManyEntities = uniChildToManies;
    }

    public void setChildToManyEntities(Set<UniChildToMany> uniChildToManies) {
        this.childToManyEntities = uniChildToManies;
    }

    public Set<UniChildToMany> getChildToManyEntities() {
        return childToManyEntities;
    }

}
