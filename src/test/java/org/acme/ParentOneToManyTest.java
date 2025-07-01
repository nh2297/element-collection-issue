package org.acme;


import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ParentOneToManyTest {

    @Inject
    StartOneToManyRepository startOneToManyRepository;


    @Test
    @TestTransaction
    void save() {
        startOneToManyRepository.save(new ParentOneToMany());
    }
}
