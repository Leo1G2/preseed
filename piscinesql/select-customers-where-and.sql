SELECT customers.FirstName, customers.LastName
FROM customers
JOIN employees ON customers.SupportRepId = employees.EmployeeId
WHERE customers.Country = 'USA'
  AND employees.FirstName = 'Jane'
  AND employees.LastName = 'Peacock';
