package br.com.fernando.annotations;

import java.lang.reflect.Field;

public class GeraStringLayoutada {

    private GeraStringLayoutada(){
    }

    public static String geraStringLayoutada(Object objeto) throws IllegalAccessException {

        StringBuilder valor = new StringBuilder();

        for (Field declaredField : objeto.getClass().getDeclaredFields()) {
            final var declaredAnnotation = declaredField.getDeclaredAnnotation(StringLayoutada.class);

            if (declaredAnnotation == null) continue;

            declaredField.setAccessible(true);

            final var valorDoCampo = declaredField.get(objeto).toString();

            valor
                 .append((declaredAnnotation.tipo().equals(TipoLayout.NUMERAL) ? "0" :
                         " ").repeat(declaredAnnotation.tamanho() - valorDoCampo.length()))
                 .append(valorDoCampo);

        }

        return valor.toString();

    }

}
