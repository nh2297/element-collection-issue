package org.acme;


import io.quarkus.test.TestTransaction;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ParentTest {

    @Inject
    StartRepository startRepository;


    @Test
    @TestTransaction
    void save() {
        startRepository.save(new Parent());
    }
}
