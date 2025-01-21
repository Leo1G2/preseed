SELECT FirstName || ' ' || Upper(LastName) AS FullName, SUM(invoices.Total) AS AllInvoices
FROM customers
INNER JOIN invoices ON customers.CustomerId = invoices.CustomerId
GROUP BY customers.CustomerId
HAVING AllInvoices > 38
ORDER BY FirstName ASC
