package br.com.bb;

import java.util.function.Function;
import br.com.bb.Steps.Half;
import br.com.bb.Steps.Square;
import br.com.bb.Steps.ToString;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Pipeline {

    @Inject
    Square square;

    @Inject
    Half half;

    @Inject
    ToString toString;

    public String execute(Integer valor) {
        Function<Integer, String> pipeline = square.andThen(half).andThen(toString);
        String result = pipeline.apply(valor);
        return result;
    }

}
