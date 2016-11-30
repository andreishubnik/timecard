package timecard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import timecard.entities.Employee;
import timecard.repositories.EmployeeRepository;

import java.util.Date;

/**
 * Main application class
 *
 * Created by Shubnik on 09.11.2016.
 */
@SpringBootApplication
public class Application {

    @Autowired
    private final EmployeeRepository repository;

    public Application(EmployeeRepository repository) {
        this.repository = repository;
        // add mock data
        this.repository.save(new Employee("login", "password", "name", "surname", "patrname", new Date()));
    }

    public static void main(String[] args) {
        SpringApplication.run(timecard.Application.class, args);
    }

}