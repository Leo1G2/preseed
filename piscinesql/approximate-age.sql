SELECT employees.FirstName, employees.LastName, STRFTIME('%Y', employees.HireDate) - employees.BirthDate AS ApproximateAge
FROM employees
ORDER BY ApproximateAge ASC