package org.acme.unidirectional;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;
import java.util.UUID;

@Repository
public interface StartUniOneToManyRepository extends CrudRepository<UniParentOneToMany, UUID> {
}
