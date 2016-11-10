
# Timecard

## Main capabilities

* Individual time period for employee;
* Add or edit employee time period;
* Different type for employee time period (at work, hospital, vacations, business trips, etc.);
* Edit employee data (full name, identity document, location, groups);
* For each employee group can be set working time of the day (normal employee, trainee);
* For each day can be set working time of the day (holidays, shortened days);
* REST API for enter/exit;
* Report for a specified period (day, week, month, year) with downloading it in file;

## Entities

### Admin
A user with administrator rights.
Its capabilities include:
* View the list of employees;
* Add, Edit Profile prosmatr and employee;
* Add, edit and delete accounting periods for the employee.

### Employee
A user with the rights of employees.
Its capabilities include:
* View the list of employees;
* View and edit your profile;
* Add, edit and delete accounting periods.

### Employee type (group)
employee type determines the employee belongs to a certain group.
Used for the separation of normal working hours.

### Period of time tracking (timecard)
Report an employee for a certain period.
It is used to record employee time.
When adding or editing a calculation period of time the employee or from untrusted sources - require additional confirmation.
Removal period occurs by marked as deleted.
When editing a new period is created, then the old is marked as deleted and set to the parents of a new period.

### Time period type
Types of stay employee for a period of time.
Are used to calculate the staff time for each period.

## API

### Login Employee

### Logout Employee

### Add Period

### Edit Period

### Remove Period

### Get report for period

### Get Employees
