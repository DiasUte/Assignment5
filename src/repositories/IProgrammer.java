package repositories;

import entities.Developer;

public interface IProgrammer{
    // Programs in department
    String programs();
    // Works as ...
    String work();
    // Gets salary
    String getSalary();
}