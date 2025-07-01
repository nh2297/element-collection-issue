package org.acme;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;
import java.util.UUID;

@Repository
public interface StartOneToManyRepository extends CrudRepository<ParentOneToMany, UUID> {
}
