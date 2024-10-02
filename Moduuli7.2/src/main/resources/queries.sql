SELECT * FROM Currency.current;
SELECT * FROM Currency.current WHERE abbreviation = 'EUR';
SELECT COUNT(Currency.current.abbreviation) FROM Currency.current;
SELECT MAX(Currency.current.rate) FROM Currency.current;