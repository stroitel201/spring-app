package com.stroitel.spring.dao;

import com.stroitel.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int PEOPLE_COUNT;

    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Jim"));
        people.add(new Person(++PEOPLE_COUNT,"john"));
        people.add(new Person(++PEOPLE_COUNT,"Kate"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(long id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(Person person){
        show(person.getId()).setName(person.getName());
    }

    public void delete(long id){
        people.removeIf(person -> person.getId() == id);
    }
}
