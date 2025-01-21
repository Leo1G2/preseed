SELECT SUM(invoices.Total) AS AllInvoicesTotalPrice
FROM customers
JOIN invoices ON customers.CustomerId = invoices.CustomerId
WHERE customers.FirstName = 'Tim' AND customers.LastName = 'Goyer';
