package com.ynov.oop;

import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> employees;

    // constructeur de la classe Company
    public Company() {
        this.employees = new ArrayList<Employee>();
    }

    System.out.println("Vous empruntez le livre" + this.bookTitle);
} else {
    System.out.println("Le livre " + this.boo
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public ArrayList<Employee> findEmployeeByPosition(String position) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (Employee employee : this.employees) {
            if (employee.getJob().equals(position)) {
                employees.add(employee);
            }
        }
        return employees;
    }

    public double averageSalary() {
        double total = 0;
        for (Employee employee : this.employees) {
            total += employee.getSalary();
        }
        return total / this.employees.size();
    }

    public void displayEmployees() {
        for (Employee employee : this.employees) {
            employee.displayDetails();
        }
    }

    // méthode statique permettant de trier une liste d'employés par salaire
    // nous avons décider d'utiliser une méthode statique car elle ne dépend pas d'une instance de Company
    // elle ne dépend que de la classe Company
    // on peut donc l'appeler directement depuis la classe Company
    // Company.sortBySalary(employees);
    public static void sortBySalary(ArrayList<Employee> employees) {
        // on utilise un algorithme de tri appelé "tri à bulles"
        // on parcourt la liste des employés
        for (int i = 0; i < employees.size(); i++) {
            // on parcourt la liste des employés jusqu'à l'index i
            for (int j = 0; j < i; j++) {
                // on récupère l'employé à l'index j
                Employee employee1 = employees.get(j);
                // on récupère l'employé à l'index j + 1
                Employee employee2 = employees.get(j + 1);
                // si le salaire de l'employé à l'index j est supérieur au salaire de l'employé à l'index j + 1
                if (employee1.getSalary() > employee2.getSalary()) {
                    // on échange les deux employés
                    employees.set(j, employee2);
                    employees.set(j + 1, employee1);
                }
            }
        }

        // on peut aussi utiliser la méthode sort de la classe ArrayList
        /*
        employees.sort(new Comparator<Employee>(){
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return (int) (employee1.getSalary() - employee2.getSalary());
            }
        });
         */
    }

    public Employee bestEmployeForPosition(String position) {
        // on récupère la liste des employés pour le poste donné
        ArrayList<Employee> employees = this.findEmployeeByPosition(position);
        // on trie la liste des employés par salaire
        Company.sortBySalary(employees);
        // on retourne le dernier employé de la liste
        return employees.get(employees.size() - 1);
    }
    
}
