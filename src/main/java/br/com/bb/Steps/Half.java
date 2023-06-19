package br.com.bb.Steps;

import java.util.function.Function;
import jakarta.inject.Singleton;

@Singleton
public class Half implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer number) {
        return number / 2;
    }



}
