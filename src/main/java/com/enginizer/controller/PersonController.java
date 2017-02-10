package com.enginizer.controller;

import com.enginizer.beans.PersonBean;
import com.enginizer.entities.Person;
import com.enginizer.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Controller to create and store {@link Person person entities}.
 */
@Controller("personController")
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonBean createNewPersonFormBean () {
        return new PersonBean();
    }

    public String savePerson(PersonBean personFormBean ) {
        personService.save ( new Person ( personFormBean.getFirstName (), personFormBean.getLastName () ) );
        return "success";
    }

}
