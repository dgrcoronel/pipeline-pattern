package br.com.bb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;

@QuarkusTest
public class PipelineTest {

    @Inject
    Pipeline pipeline;

    @Test
    public void test() {
        String result = pipeline.execute(5);
        System.out.println("result: " + result);
        String expected = "12";
        assertEquals(expected, result);

    }

}
