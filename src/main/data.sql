-- Inserimento dei dati nella tabella "Projects"
INSERT INTO PROJECT(id, name) VALUES
                                  (1, 'Mars Rover'),
                                  (2, 'Manhattan');

-- Inserimento dei dati nella tabella "Employees"
INSERT INTO EMPLOYEE(id, name) VALUES
                                   (1, 'Mario'),
                                   (2, 'Giovanni'),
                                   (3, 'Lucia');

-- Inserimento dei dati nella tabella "TimeEntries"
INSERT INTO TIME_ENTRY(project_id, employee_id, date, hours) VALUES
                                                                 (1, 1, '2021-08-26 22:00:00', 5),
                                                                 (2, 2, '2021-08-30 22:00:00', 3),
                                                                 (1, 1, '2021-08-31 22:00:00', 3),
                                                                 (1, 3, '2021-08-31 22:00:00', 3),
                                                                 (2, 1, '2021-08-26 22:00:00', 2),
                                                                 (2, 2, '2021-08-31 22:00:00', 4);