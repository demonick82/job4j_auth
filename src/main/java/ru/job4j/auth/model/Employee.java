package ru.job4j.auth.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int inn;
    private Timestamp dateOfEmployment;
    List<Person> persons = new ArrayList<>();
    public static Employee of(String name, String surname, int inn) {
        Employee employee = new Employee();
        employee.name = name;
        employee.surname = surname;
        employee.inn = inn;
        employee.dateOfEmployment = new Timestamp(System.currentTimeMillis());
        return employee;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    public Timestamp getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Timestamp dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
