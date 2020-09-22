# Dokumentacija za spring boot projekat
## Baze Podataka

1. Instaliraj MySQL  

2. Instaliraj MySQL Workbench

3. Napravi bazu podataka pod imenom products 

4. (OVAJ KORAK NIJE POTREBAN. SPRING BOOT PRAVI BAZU PODATAKA)Pokreni SQL skriptu(nalazi se unutar src/main/resources/SQL foldera) create_table.sql da kreiraš tabele

5. (NIJE POTREBAN KORAK)Pokreni SQL skriptu insert_table.sql da uneseš vrednosti u tabele

Veza između User i Product tabele je Many-To-Many

## Spring Boot

1. Instaliraj Spring Tool Suite  

2. Otvori projekat preko STS  

3. Podesi bazu podataka u Application.properties da bude spojena sa products bazom

4. Pokreni applikaciju ProizvodiApplication.java  

## Projekta Struktura Datoteka

Izvorni kod se nalazi u src folderu  

Imamo četiri paketa: entiteti, repozitorijumi, servisi i kontroleri.  