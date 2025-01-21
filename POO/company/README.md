Exercice Company
Imaginons un système de gestion d'une entreprise avec des employés.

Classe Employee :
Attributs :

Nom de l'employé (String)
Poste occupé (String)
Salaire (double)
Date d'embauche (Calendar) (n'oubliez pas d'importer la classe Calendar)


Constructeur :

Un constructeur pour initialiser les attributs lors de la création d'un employé.


Méthode raiseSalary :

Cette méthode prendrait un pourcentage en paramètre et augmenterait le salaire de l'employé en conséquence.


Méthode calculateSeniority :

Cette méthode calculerait le nombre d'années d'ancienneté de l'employé en fonction de la date d'embauche par rapport à la date actuelle.


Méthode displayDetails :

Cette méthode afficherait les détails de l'employé, y compris le nom, le poste, le salaire et l'ancienneté.


Méthode promotion :

Cette méthode permettrait de promouvoir un employé en changeant son poste. Vous pourriez passer en paramètre le nouveau poste et ajuster le salaire en conséquence.
les postes possibles sont Junior > Senior > Staff > Principal
à chaques promotion le salaire est augmenté de 30%.


Classe Company :
Attributs :

Liste d'employés (utilisez une collection appropriée, par exemple, ArrayList)


Constructeur :

Un constructeur pour initialiser l'entreprise sans employés.


Méthode addEmployee :

Cette méthode permettrait d'ajouter un employé à la liste des employés de l'entreprise.


Méthode findEmployeeByPosition :

Cette méthode prendrait un poste en paramètre et renverrait une liste des employés occupant ce poste dans l'entreprise.


Méthode averageSalary :

Cette méthode calculerait le salaire moyen de tous les employés de l'entreprise.


Méthode displayEmployees :

Cette méthode afficherait les détails de tous les employés de l'entreprise.

Bonus:
Classe Employee :
Méthode calculateYearlyBonus :

Cette méthode prendrait en compte l'ancienneté et le salaire de l'employé pour calculer une prime annuelle. A vous de définir les règles spécifiques en fonction de l'ancienneté et du salaire.


Méthode compareSalary :

Cette méthode comparerait le salaire de l'employé avec celui d'un autre employé passé en paramètre. Elle renverrait un message indiquant si l'employé a un salaire supérieur, inférieur ou égal à l'autre employé.

Classe Company :
Méthode sortBySalary :

Cette méthode trierait la liste des employés de l'entreprise par ordre croissant de salaire. Vous pourriez utiliser une méthode de tri ou implémenter votre propre algorithme de tri.


Méthode bestEmployeForPosition :

Cette méthode identifierait l'employé ayant le salaire le plus élevé par poste dans l'entreprise et le renverrait.