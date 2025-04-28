package employee;

import exceptions.Homework7;

/**
 * Create 3 employees (2 boys and 1 girl), two of whom work in the same department and are the same age.
 * @author aveth
 */
public class Employee  {

public int id;
public int departmentNumber;
public int age;
public char gender;

    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.id = 121;
    employee.departmentNumber = 1;
    employee.age = 20;
    employee.gender = 'm';
    employee.printEmploye();

    Employee employee1 = new Employee();
    employee1.id = 123;
    employee1.departmentNumber = 1;
    employee1.age = 34;
    employee1.gender = 'm';
    employee1.printEmploye();

    Employee employee2 = new Employee();
    employee2.id = 142;
    employee2.departmentNumber = 4;
    employee2.age = 31;
    employee2.gender = 'w';
    employee2.printEmploye();

    }
    /**
     * Print all Employees
     */
    public void printEmploye(){
        System.out.println("Employee: id " + id
                + ", DepartmentNumber " + departmentNumber
                + ", Age " + age
                + ", Gender " + gender);
    }
}
