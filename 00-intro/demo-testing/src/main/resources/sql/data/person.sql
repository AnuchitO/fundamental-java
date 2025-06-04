INSERT INTO person (person_id, name, age)
VALUES ('P001', 'Laumcing', 30) ON CONFLICT (person_id) DO NOTHING;

INSERT INTO person (person_id, name, age)
VALUES ('P002', 'Zothanmawia', 28) ON CONFLICT (person_id) DO NOTHING;