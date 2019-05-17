package com.company;

public class Main extends Employee {

    public static void main(String[] args) {

        // Name, position, salary, rate, shift
        Employee person1 = new Employee("Captain Barbosa", PositionTitle.Administration, false,
                82.13, 1, "May 22nd, 2001");
        Employee person2 = new Employee("Velma Dinkley", PositionTitle.Sales, false,
                12.50, 3, "Today");
        Employee person3 = new Employee("Butters Leopold Stotch", PositionTitle.Maintenance, true,
                15, 2, "October 30, 2009");


        person1.display();
        person1.calculate(44);

        person2.display();
        person2.calculate(61);

        person3.display();
        person3.calculate(29);
    }
}
