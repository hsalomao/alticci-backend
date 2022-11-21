package br.com.salomao.repositories;

import br.com.salomao.models.Alticci;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciRepository implements PanacheRepository<Alticci> {

}
