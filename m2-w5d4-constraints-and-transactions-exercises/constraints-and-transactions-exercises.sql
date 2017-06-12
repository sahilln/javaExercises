-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

INSERT INTO actor(first_name, last_name) VALUES('HAMPTON', 'AVENUE')
INSERT INTO actor(first_name, last_name) VALUES('LISA', 'BYWAY');

SELECT * FROM actor
WHERE first_name = 'HAMPTON';

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

INSERT INTO film(title, description, release_year, language_id, length) 
VALUES('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancience Greece', 2008, 1, 198);

SELECT film.title, film.film_id
FROM film
WHERE film.title = 'EUCLIDEAN PI';

--SELECT * FROM film
--WHERE title = 'Euclidean PI'

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

INSERT INTO film_actor(film_id, actor_id) VALUES(1001, 201)
INSERT INTO film_actor(film_id, actor_id) VALUES(1001, 202)

-- 4. Add Mathmagical to the category table.

INSERT INTO category(name) VALUES('Mathmagical')

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

UPDATE film_category
SET category_id = 17
WHERE film_id = 1001 OR film_id = 274 OR film_id = 494 OR film_id = 714 OR film_id = 996;

SELECT film.title, category.name, film.rating
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE film.film_id = 1001 OR film.film_id = 274 OR film.film_id = 494 OR film.film_id = 714 OR film.film_id = 996;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

UPDATE film
SET rating = 'G'
WHERE film.film_id IN (SELECT film.film_id
          FROM film
          JOIN film_category ON film.film_id = film_category.film_id
          JOIN category ON film_category.category_id = category.category_id
          WHERE category.name = 'Mathmagical');

-- 7. Add a copy of "Euclidean PI" to all the stores.

INSERT INTO inventory(inventory_id, film_id, store_id) VALUES(4582, 1001, 1);
INSERT INTO inventory(inventory_id, film_id, store_id) VALUES(4583, 1001, 2);

-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?) Did not succeed because other tables are using it.

DELETE FROM film
WHERE film.title = 'EUCLIDEAN PI';

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?) No, because other tables are using this category

DELETE FROM category
WHERE category.category_id = 17;

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?) Yes, because it takes out the link.

DELETE FROM film_category
WHERE category_id = 17;

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?) Yes, because it is no longer linked to other movies.

DELETE FROM category
WHERE category.category_id = 17;


-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table. Needs to be deleted from film_actor link because it is linked. Also, needs to be deleted from inventory.

DELETE FROM film_actor
WHERE film_actor.film_id = 1001;

DELETE FROM inventory
WHERE inventory.film_id = 1001;

DELETE FROM film
WHERE film.title = 'EUCLIDEAN PI';
