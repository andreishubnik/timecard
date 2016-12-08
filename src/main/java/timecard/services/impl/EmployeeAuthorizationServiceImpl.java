package timecard.services.impl;

import timecard.entities.Employee;
import timecard.services.EmployeeAuthorizationService;

import java.util.Date;
import java.util.Optional;

/**
 * Authorization Service for Employee (Implementation)
 *
 * Created by Shubnik on 08.12.2016.
 */
public class EmployeeAuthorizationServiceImpl implements EmployeeAuthorizationService {

    @Override
    public Optional<Employee> loginByPassword(String login, String password) {
        Employee employee = null;
        if (login != null && !login.isEmpty() && password != null && !password.isEmpty()) {
            employee = new Employee(login, password, "Иван", "Иванов", "Иванович", new Date());
        }

        return Optional.ofNullable(employee);
    }

    @Override
    public Optional<Employee> loginByGUID(String guid) {
        Employee employee = null;
        if (guid != null && !guid.isEmpty()) {
            employee = new Employee(guid, null, "Иван", "Иванов", "Иванович", new Date());
        }

        return Optional.ofNullable(employee);
    }

}
