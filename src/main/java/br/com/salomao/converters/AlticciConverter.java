package br.com.salomao.converters;

import br.com.salomao.models.Alticci;

public class AlticciConverter {
    private AlticciConverter() {

    }

    public static Alticci toEntity(Long id, Long number) {
        return Alticci.builder()
                .withId(id)
                .withNumber(number)
                .build();
    }
}
