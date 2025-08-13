package org.acme;


import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.UUID;

@QuarkusTest
public class ParentOneToManyTest {

    @Inject
    StartOneToManyRepository startOneToManyRepository;


    @Test
    @TestTransaction
    void save() {
        UUID parentId = UUID.randomUUID();
        UUID childId = UUID.randomUUID();


        ChildToManyEntity child = new ChildToManyEntity(childId, parentId);
        ParentOneToMany parent = new ParentOneToMany(parentId, Set.of(child));

        startOneToManyRepository.save(parent);

        Assertions.assertEquals(1, startOneToManyRepository.findAll().count());
        ParentOneToMany result = startOneToManyRepository.findById(parentId).orElseThrow();


        assert result.getChildToManyEntities().size() == 1;
        assert result.getChildToManyEntities().contains(child);
    }
}
