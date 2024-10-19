SELECT U.unique_id, E.name
FROM Employees E
LEFT OUTER JOIN EmployeeUNI U on U.id = E.id;
