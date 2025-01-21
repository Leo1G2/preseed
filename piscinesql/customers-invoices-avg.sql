SELECT
    customers.FirstName,
    customers.LastName,
    AVG(invoices.Total) AS InvoicesAverage
FROM customers
    JOIN invoices ON customers.CustomerId = invoices.CustomerId
GROUP BY customers.CustomerId
ORDER BY FirstName ASC;