package org.acme;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "parent_one_to_many")
public class ParentOneToMany {

    @Id
    private UUID id;

    @OneToMany
    private Set<ChildToManyEntity> childToManyEntities;

}
