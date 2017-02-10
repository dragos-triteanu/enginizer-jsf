package com.enginizer.service;

import com.enginizer.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.enginizer.entities.Person;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Implementation for {@link PersonService person service boundary}.
 */
@Service("personService")
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional(readOnly = true)
    public List<Person> findAll () {
        return personRepository.findAll ();
    }

    @Transactional(readOnly = true)
    public Page<Person> findAll ( Pageable pageable ) {
        return personRepository.findAll ( pageable );
    }

    @Transactional
    public Person save ( Person entity ) {
        return personRepository.save ( entity );
    }

    @Transactional(readOnly = true)
    public Person findOne ( Long aLong ) {
        return personRepository.findOne ( aLong );
    }

    @Transactional(readOnly = true)
    public long count () {
        return personRepository.count ();
    }

    @Transactional(readOnly = true)
    public boolean exists ( Long aLong ) {
        return personRepository.exists ( aLong );
    }

    @Transactional
    public void delete ( Long aLong ) {
        personRepository.delete ( aLong );
    }

    @Transactional
    public void deleteAll () {
        personRepository.deleteAll ();
    }
}
