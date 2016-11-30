package timecard.repositories;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import timecard.entities.Employee;

import java.util.Date;

/**
 * Test for EmployeeRepository
 *
 * Created by Shubnik on 30.11.2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void testFindEmployeeByLogin() throws Exception {
        final String temp = "testLogin";
        repository.save(new Employee(temp, "name", "password", "surname", "patrname", new Date()));
        repository.findEmployeeByLogin(temp)
                .map(Employee::getId)
                .orElseThrow(() -> new Exception("Can not find Employee by login"));
    }

}
