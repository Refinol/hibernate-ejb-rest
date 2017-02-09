package ru.test.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ru.test.People;

@Stateless
public class PeopleServiceImpl implements PeopleService {

    @PersistenceContext(unitName = "hibernate-ejb-rest-unit")
    private EntityManager em;

    @Override
    public People getPeople() {
        People people = new People();
        people.setName("Иван");
        people.setAge(18);
        em.persist(people);
        return people;
    }
}
