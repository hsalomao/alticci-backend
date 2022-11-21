package br.com.salomao.converters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.salomao.models.Alticci;

public class AlticciConverterTest {

    @Test
     void should_convert_to_entity() {
        Long id = Long.valueOf(2);
        Long number = Long.valueOf(1);
        Alticci alticci = AlticciConverter.toEntity(id, number);
        assertEquals(alticci.getId(), id);
        assertEquals(alticci.getNumber(), number);
    }

}
