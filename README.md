# Dokumentacija za spring boot projekat
## Baze Podataka

1. Instaliraj MySQL Server

2. Instaliraj MySQL Workbench

3. Napravi bazu podataka 

Veza između User i Product tabele je Many-To-Many

Imamo tri tabele, User, Product i Log(log je vezna tabela između User i Product).

## Spring Boot

1. Instaliraj Spring Tool Suite  

2. Otvori projekat preko STS  

3. Podesi bazu podataka u Application.properties da bude spojena sa bazom podataka

4. Pokreni applikaciju ProizvodiApplication.java  

## Struktura Projekta

Izvorni kod se nalazi u src folderu  

Imamo četiri paketa: entities, repositories, services, controllers, security.  

U controllers paketu imamo dva podpaketa. U podpaketu api se nalaze kontroleri za REST API a u
mvc podpaketu se nalaze kontroleri za prikazivanje logina i userpage.

## REST API

Pročitati specifikacija zadatka šta je sve bilo zahtevano.

Jedna od putanja: /products/{id}/user/{id}

Da se dodeli proizvod koji ima id=1 korisniku koji ima id=2
slao bi se POST zahtev na putanju /products/1/user/2


## Frontend

HTML templati se nalaze u resources/templates folderu.
Koristi se Thymeleaf za renderisanje HTML-a.
Korisnik se loginuje i vuku se iz baze podataka proizvodi koji su u vezi sa tim korisnikom(ulogovanim),
tabela za proizvode se popunjava.