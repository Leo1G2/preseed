UPDATE employees
SET Title = 'IT Manager', 
    ReportsTo = (SELECT EmployeeId FROM employees WHERE FirstName = 'Andrew' AND LastName = 'Adams')
WHERE FirstName = 'Robert' AND LastName = 'King';



