package com.ynov.oop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App 
{
    public static void main( String[] args )
    {
        // on test toutes les méthodes des classes Employee et Company
        System.out.println("Création de plusieurs employés");
        Employee employee1 = new Employee("John Doe", "Junior", 100, new GregorianCalendar(2010, Calendar.FEBRUARY, 1));
        Employee employee2 = new Employee("Jane Doe", "Senior", 200, new GregorianCalendar(2015, Calendar.JANUARY, 1));
        Employee employee3 = new Employee("Jack Doe", "Principal", 300, new GregorianCalendar(2018, Calendar.JANUARY, 1));


        System.out.println("Augmentation du salaire de 30%");
        employee1.raiseSalary(30);

        System.out.println("Affichage des détails de l'employé");
        employee1.displayDetails();

        System.out.println("Promotion de l'employé");
        employee1.promotion("Senior");

        System.out.println("Affichage des détails de l'employé");
        employee1.displayDetails();

        System.out.println("Création d'une entreprise");
        Company company = new Company();

        System.out.println("Ajout des l'employés à l'entreprise");
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);

        System.out.println("Affichage des employés de l'entreprise");
        company.displayEmployees();

        System.out.println("Recherche des employés Senior de l'entreprise");
        ArrayList<Employee> employees = company.findEmployeeByPosition("Senior");
        for (Employee employee : employees) {
            employee.displayDetails();
        }

        System.out.println("Calcul du salaire moyen de l'entreprise");
        System.out.println(company.averageSalary());

        System.out.println("Recherche du meilleur employé de l'entreprise au poste de Senior");
        Employee bestEmployee = company.bestEmployeForPosition("Senior");
        bestEmployee.displayDetails();
    }
}
