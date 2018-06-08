# Tým: Odvez mě (ČT 16.15) 
### Seznam členů týmu:
* Kolesár Matej
* Loseeva Julia
* Stanová Ivana
* Šťastná Lenka
### Zadání úlohy:
Aplikace slouží na podporu činnosti agentury zajišťující odvozy aut a případně řidičů, kteří nemohou své auto odvézt. Agentura si drží data o klientech, kteří požadují odvoz. (Údaje klienta specifikujte sami.) Dále je třeba zaznamenat informace o autu. (Údaje také specifikujte sami.). Agentura má v evidenci poskytovatele odvozu. Údaje také specifikujte sami a nezapomeňte, že je třeba evidovat typ řidičského průkazu a disponibilní čas. Odvozy se objednávají telefonicky, je třeba zaznamenat přesné místo od, kam, čas, zda je to odvoz i osob nebo jen auta. 
### Seznam úkolů:
* model případů užití – Stanová
* diagram tříd - Loseeva, Šťastná
* struktura souborů - Kolesár 
* konvence - Loseeva, Šťastná
* návrh uživatelského rozhraní - Stanová
* implementace třídy Osoba - Loseeva
* implementace třídy Auto, Klient - Šťastná
* implementace třídy Odvoz - Kolesár
* implementace třídy Vodič - Stanová
### Use Case Diagram
![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/usecase.jpg "Use Case Diagram")
Obrázek 1 Diagram užití

### Class Diagram
![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/classKoniec.jpg "Class Diagram")
Obrázek 2 Diagram tříd

### Struktura souborů
Projektový adresář aplikace má strukturu klasického Maven projektu v kontextu architektury MVC, jazyka Java a frameworku JavaFX.

| Adresář | Popis |
| ------------- | ------------- |
| kořenový adresář | obsahuje soubor pom.xml a ostatní adresáře |
| src/main/java | obsahuje kompilovatelné .java soubory, mimo jiné i třídu Controller |
| src/main/resources | obsahuje pomocné soubory pro projekt, například .fxml soubor nebo obrázky |
| src/test/java | obsahuje třídy testů |
| src/test/resources | obsahuje zdroje nezbytné pro testy |
### Návrh uživatelského rozhraní

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/59E18C07-5293-4E91-81B2-F367704906F4.png)
Obrázek 3 Přihlášení

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/ACB2C566-ADB9-4C0D-B381-1003C3248687.png)
Obrázek 4 Úvodní obrazovka pro pracovníka agentury

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/0EE5B609-DAA3-4DAB-8991-9B060AB02CBF.png)
Obrázek 5 Vytvořit objednávku, zobrazit objednávku

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/7FD5FC99-794D-48FA-89E6-B0EC29CF61B8.png)
Obrázek 6 Změnit objednávku, odstranit objednávku

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/C9213C33-B0B7-4278-8C3C-2165C1E98330.png)
Obrázek 7 Zobrazit daného poskytovatele odvozu

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/89CE885C-E851-4006-999B-8AC3581EB973.png)
Obrázek 8 Vytvořit poskytovatele odvozu

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/AE63B77E-A909-4505-88BA-7441F4EBB20E.png)
Obrázek 9 Upravit poskytovatele odvozu, odstranit poskytovatele odvozu

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/C2C76AE9-BC67-4104-952F-63A9C6CE31C2.png)
Obrázek 10 Vytvořit, upravit, zobrazit, odstranit auto

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/C6052128-1579-4411-B1DA-72509B97F6F3.png)
Obrázek 11 Vytvořit, upravit, zobrazit, odstranit klienta

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/21E13B35-0659-4BFD-93B5-AC26FAE21167.png)
Obrázek 12 Zobrazit objednávky pro daného poskytovatele odvozu

![Alt text](https://github.com/kolesko/semestralna_uloha_2/blob/master/n%C3%A1vrh/39B488D0-A270-4A09-B373-56CA602F28F6.png)
Obrázek 13 Zobrazit výsledky vyhledávání

### Konvence
 * Konvence formátu, konvence pojmenovávání tříd, metod, proměnných a konvence tvorby komentářů a dokumentace budeme čerpat z https://java.vse.cz/4it101/Konvence.
 * Aplikace i zdrojový kód budou v anglickém jazyce.
 * Dokumentaci budeme psát přímo s psaním metod.
 



