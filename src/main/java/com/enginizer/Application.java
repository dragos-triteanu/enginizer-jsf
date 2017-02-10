package com.enginizer;

import com.enginizer.entities.Address;
import com.enginizer.entities.Country;
import com.enginizer.entities.Person;
import com.enginizer.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private PersonService personService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run ( String... args ) throws Exception {
        Person person = new Person ( "Hans", "Mustermann" );
        Address address = new Address ( "Hauptstrasse 12", "70179", "Stuttgart", Country.GERMANY, "12345", "test@example.com" );
        person.getAddresses ().add ( address );
        personService.save ( person );
        person = new Person ( "Sabine", "Huber" );
        address = new Address ( "Mainstreet 1a", "55555", "London", Country.GB, "12345", "dummy@example.com" );
        person.getAddresses ().add ( address );
        personService.save ( person );
    }
}
