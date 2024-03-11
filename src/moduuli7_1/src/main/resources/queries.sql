use convertdatabase;
SELECT * FROM currencies;
SELECT * FROM currencies WHERE abbreviation = 'EUR';
SELECT COUNT(*) FROM currencies;
SELECT * FROM currencies ORDER BY rate DESC LIMIT 1;