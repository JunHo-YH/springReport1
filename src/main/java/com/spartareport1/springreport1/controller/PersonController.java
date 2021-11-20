package com.spartareport1.springreport1.controller;


import com.spartareport1.springreport1.models.Person;
import com.spartareport1.springreport1.models.PersonRequestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person("강준호", 20, "서버 개발자");
        return person;
    }

}
