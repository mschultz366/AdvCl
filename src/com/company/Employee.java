package com.company;

public class Employee {

    String name;
    PositionTitle position;
    boolean salary;
    double payRate;
    int shift;
    String startDate;

    public Employee() {}

    public PositionTitle getPosition() {
        return position;
    }

    public void setPosition(PositionTitle position) {
        this.position = position;
    }

    public boolean getSalary() {
        return salary;
    }

    public void setSalary(boolean salary) {
        this.salary = salary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Employee(String name, PositionTitle position, boolean salary, double payRate, int shift, String startDate) {
        setName(name);
        setPosition(position);
        setSalary(salary);
        setPayRate(payRate);
        setShift(shift);
        setStartDate(startDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void display() {
        // Use name (string) , position (string) , salary (boolean),
        // payRate (double) shift (int), and start date (string)
        System.out.print("\nName: " + getName() + "\nPosition: " + getPosition() + "\nSalary: " + getSalary()
                + "\nShift worked: " + getShift() + "\nPay Rate is: $" + String.format("%,.2f", getPayRate()) + " per hour.");
    }

    public void calculate(double hours) {

        double OT = hours - 40;

        switch (getShift()) {
            case 1: {
                System.out.print("\nEarnings this week are: $");
                System.out.format("$%,.2f", (OT * 1.5 * getPayRate() + ((hours - OT) * getPayRate())));
                System.out.print("\n");
            }
            break;

            case 2: {
                System.out.print("\nEarnings this week are: $");
                System.out.format("$%,.2f", (((OT * 1.5 * getPayRate()) + ((hours - OT) * getPayRate())) * 1.05));
                System.out.print("\n");
            }
            break;

            case 3: {
                System.out.print("\nEarnings this week are: $");
                System.out.format("$%,.2f", (((OT * 1.5 * getPayRate()) + ((hours - OT) * getPayRate())) * 1.1));
                System.out.print("\n");
            }
            break;

            default: System.out.println("Could not find appropriate shift...");
                break;
        }
    }
}
