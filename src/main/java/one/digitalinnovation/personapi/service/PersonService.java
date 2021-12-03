package one.digitalinnovation.personapi.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.model.Person;
import one.digitalinnovation.personapi.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private PersonRepository personRepository;

    public Person create(Person person) {
        return personRepository.save(person);
    }
}
