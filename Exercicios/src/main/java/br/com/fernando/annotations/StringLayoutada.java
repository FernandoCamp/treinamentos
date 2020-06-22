package br.com.fernando.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface StringLayoutada {

    int tamanho();
    TipoLayout tipo() default TipoLayout.STRING;

}

