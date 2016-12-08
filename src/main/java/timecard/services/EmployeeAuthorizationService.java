package timecard.services;

import timecard.entities.Employee;

import java.util.Optional;

/**
 * Authorization Service for Employee
 *
 * Created by Shubnik on 08.12.2016.
 */
public interface EmployeeAuthorizationService {

    Optional<Employee> loginByPassword(String login, String password);

    Optional<Employee> loginByGUID(String guid);

}
