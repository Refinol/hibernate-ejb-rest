package ru.test;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Stateless
public class PeopleServiceImpl implements PeopleService {

    @PersistenceUnit(unitName = "hibernate-ejb-rest-unit")
    private EntityManagerFactory emf;

    @Override
    public People getPeople() {
        EntityManager em = emf.createEntityManager();
        People people = new People();
        people.setName("Иван");
        people.setAge(18);
        em.persist(people);
        return people;
    }
}
