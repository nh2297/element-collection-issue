package org.acme;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Repository;
import java.util.UUID;

@Repository
public interface StartRepository extends CrudRepository<Parent, UUID> {
}
