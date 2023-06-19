package br.com.bb.Steps;

import java.util.function.Function;
import jakarta.inject.Singleton;

@Singleton
public class ToString implements Function<Integer, String> {

    @Override
    public String apply(Integer number) {
        return number.toString();
    }



}
