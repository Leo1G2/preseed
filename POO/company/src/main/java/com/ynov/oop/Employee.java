
package com.ynov.oop;

import java.util.Calendar;

public class Employee {
    private String name;
    private String job;
    private double salary;
    private Calendar hiringDate;

    // constructeur de la classe Employee permettant d'initialiser les attributs
    public Employee(String name, String job, double salary, Calendar hiringDate) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.hiringDate = hiringDate;
    }

    public void raiseSalary(double percentage) {
        // on augmente le salaire de 30%
        // on aurait pu écrire this.salary = this.salary + this.salary * 30 / 100;
        this.salary += this.salary * percentage / 100;
    }

    public int calculateSeniority() {
        // on récupère la date actuelle
        Calendar now = Calendar.getInstance();
        // on calcule l'ancienneté en soustrayant l'année d'embauche à l'année actuelle
        int seniority = now.get(Calendar.YEAR) - this.hiringDate.get(Calendar.YEAR);
        // si le mois d'embauche est supérieur au mois actuel, on retire 1 à l'ancienneté
        if (now.get(Calendar.MONTH) < this.hiringDate.get(Calendar.MONTH)) {
            seniority--;
            // si le mois d'embauche est égal au mois actuel et que le jour d'embauche est supérieur au jour actuel, on retire 1 à l'ancienneté
        } else if (now.get(Calendar.MONTH) == this.hiringDate.get(Calendar.MONTH)
                && now.get(Calendar.DAY_OF_MONTH) < this.hiringDate.get(Calendar.DAY_OF_MONTH)) {
            seniority--;
        }
        // on retourne l'ancienneté
        return seniority;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Job: " + this.job);
        System.out.println("Salary: " + this.salary);
        System.out.println("Seniority: " + this.calculateSeniority());
    }

    public void promotion(String newJob) {
        if(this.job.equals("Principal")) {
            System.out.println("On ne peut pas promouvoir un Principal");
            return;
        }
        // calcule le niveau du job actuel
        int oldJobLevel = this.getJobLevel(this.job);
        // calcule le niveau du nouveau job
        int newJobLevel = this.getJobLevel(newJob);
        // si le nouveau job est inférieur au job actuel, on ne peut pas promouvoir
        if(newJobLevel < oldJobLevel) {
            System.out.println("On ne peut pas rétrograder");
            return;
        }
        // si le nouveau job est égal au job actuel, on ne peut pas promouvoir
        if(newJobLevel == oldJobLevel) {
            System.out.println("On ne peut pas rester au même niveau");
            return;
        }
        // mais si le nouveau job est supérieur au job actuel, on peut promouvoir
        
        // on calcule la différence de niveau entre le nouveau job et l'ancien job
        int levelDifference = newJobLevel - oldJobLevel;
        // on met à jour le job
        this.job = newJob;
        // on augmente le salaire de 30% pour chaque niveau de différence
        for (int i = 0; i < levelDifference; i++) {
            // on utilise la méthode raiseSalary pour augmenter le salaire de 30%
            // on aurait pu écrire this.salary += this.salary * 30 / 100;
            this.raiseSalary(30);
        }
    }

    /*
     * permet de calculer le niveau d'un job
     * le niveau d'un job est calculé de la façon suivante:
     * Junior = 1
     * Senior = 2
     * Staff = 3
     * Principal = 4
     */
    private int getJobLevel(String job) {
        // un switch est une structure de contrôle qui permet de tester une variable
        // et d'exécuter un bloc de code en fonction de la valeur de la variable
        // dans notre cas, on teste la valeur de la variable job
        // si la valeur est "Junior", on retourne 1
        // si la valeur est "Senior", on retourne 2
        // etc ...
        // dans une structure switch il faut toujours mettre un break ou un return à la fin de chaque case
        // sinon le code continue à s'exécuter dans les cases suivantes
        // on aurait pu aussi utiliser une structure if/else if/else
        // mais le switch est plus lisible
        switch (job) {
            case "Junior":
                return 1;
            case "Senior":
                return 2;
            case "Staff":
                return 3;
            case "Principal":
                return 4;
                // si la valeur ne correspond à aucun des cas, on retourne 0
            default:
                return 0;
        }
    }

    // getters necessaires pour accéder aux attributs de la classe Employee dans la classe Company
    public String getJob() {
        return job;
    }

    public double getSalary() {
        return salary;
    }
}
