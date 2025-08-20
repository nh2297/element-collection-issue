package org.acme.unidirectional;


import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.UUID;

@QuarkusTest
public class UniParentOneToManyTest {

    @Inject
    StartUniOneToManyRepository startUniOneToManyRepository;


    @Test
    @TestTransaction
    void save() {
        UUID parentId = UUID.randomUUID();
        UUID childId = UUID.randomUUID();

        UniChildToMany child = new UniChildToMany(childId, parentId);
        UniParentOneToMany parent = new UniParentOneToMany(parentId, Set.of(child));

        startUniOneToManyRepository.save(parent);

        Assertions.assertEquals(1, startUniOneToManyRepository.findAll().count());
        UniParentOneToMany result = startUniOneToManyRepository.findById(parentId).orElseThrow();


        assert result.getChildToManyEntities().size() == 1;
        assert result.getChildToManyEntities().contains(child);
    }

    @Test
    @TestTransaction
    void insert() {
        UUID parentId = UUID.randomUUID();
        UUID childId = UUID.randomUUID();

        UniChildToMany child = new UniChildToMany(childId, parentId);
        UniParentOneToMany parent = new UniParentOneToMany(parentId, Set.of(child));

        startUniOneToManyRepository.insert(parent);

        Assertions.assertEquals(1, startUniOneToManyRepository.findAll().count());
        UniParentOneToMany result = startUniOneToManyRepository.findById(parentId).orElseThrow();


        assert result.getChildToManyEntities().size() == 1;
        assert result.getChildToManyEntities().contains(child);
    }
}
