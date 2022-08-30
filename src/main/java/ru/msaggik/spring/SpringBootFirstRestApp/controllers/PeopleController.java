package ru.msaggik.spring.SpringBootFirstRestApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.msaggik.spring.SpringBootFirstRestApp.model.Person;
import ru.msaggik.spring.SpringBootFirstRestApp.services.PeopleService;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;
    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    // метод возврата данных всех пользователей
    @GetMapping()
    public List<Person> getPeople() {
        // Jackson конвертирует возвращаемые объекты в JSON
        return peopleService.findAll();
    }
    // метод возврата данных одного пользователя по id
    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        // Jackson конвертирует возвращаемый объект в JSON
        return peopleService.findOne(id);
    }
}
