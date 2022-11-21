package br.com.salomao.services;

import java.util.Objects;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.salomao.converters.AlticciConverter;
import br.com.salomao.models.Alticci;
import br.com.salomao.repositories.AlticciRepository;

@Transactional
@ApplicationScoped
public class AlticciService {

    @Inject
    private AlticciRepository alticciRepository;

    public Long find(Long id) {
        Alticci alticci = findById(id);
        if (Objects.isNull(alticci)) {
            return calculate(id);
        } else {
            return alticci.getNumber();
        }
    }

    private Long calculate(Long id) {
        Long number = null;
        if (id > 1) {
            number = find(Math.abs(id - 3)) + find(Math.abs(id - 2));
        } else {
            number = id;
        }
        save(AlticciConverter.toEntity(id, number));
        return number;
    }

    private void save(Alticci alticci) {
        alticciRepository.persistAndFlush(alticci);
    }

    private Alticci findById(Long id) {
        return alticciRepository.findById(id);
    }
}
