1. Utwórz klasę `Rakieta`, zbudowaną z pól: `String nazwa` i `int wagaPaliwa`, konstruktora inicjującego pola oraz następujących metod: `zatankuj` - ładującą losową ilość paliwa, oraz `start` - rozpoczynającą procedurę startową. W ramach kontroli przedstartowej metoda `start` sprawdzi stan paliwa i jeżeli jest on mniejszy niż 1000, podniesiony zostanie wyjątek `ZaMaloPaliwaException` z komentarzem ’start anulowany - za mało paliwa’.

2. Utwórz klasę `Drzewo` z polami `boolean wiecznieZielone`, `int wysokosc` oraz `String przekrojDrzewa`, następnie zaimplementuj konstruktory inicjujące pola i metodę `String toString()` wypisującą na konsoli informacje o drzewie.

3. Utwórz klasę `DrzewoIglaste` dziedziczącą po klasie `Drzewo`, oraz definiująca pola `int iloscIgiel` i `double dlugscSzyszki`. Następnie przygotuj konstruktor inicjujący wszystkie pola oraz metodę `String toString()` wypisującą na konsoli informacje o drzewie wraz z wartościami pól opisujących drzewo iglaste.

4. Utwórz klasę `DrzewoLisciaste` dziedziczącą po klasie `Drzewo`, oraz definiująca pole `int ksztaltLiscia` i metodę `String toString()` wypisującą na konsoli wszystkie informacje o drzewie.

5. Utwórz klasę `DrzewoOwocowe` dziedziczącą po klasie `DrzewoLisciaste`, oraz definiująca pole `String nazwaOwoca`, podobnie jak w poprzednich zadaniach uzupełnij klasę o konstruktor i funkcjonalną metodę `toString`.

6. Na koniec utwórz program, który wypełni tablicę `Drzewo[]` las drzewami takimi jak: sosny, modrzewie, dęby, osiki, morelowce czy śliwy. Wykorzystując mechanizm polimorfizmu wyświetl wszystkie informacje o wszystkich drzewach.

7. Na koniec zaimplementuj we wszystkich klasach metodę `zerwijOwoc`. Jeżeli drzewo nie będzie drzewem owocowym, przez co nie będzie miało owoców - podniesiony zostanie wyjątek `DrzewoBezOwocoweException`.

8. Przygotuj klasę `Telefon` z polami `String interfejsKomunikacyjny`, `Color color`. Następnie przygotuj metode `void zadzwon(String numer)`, która wyświetli na konsoli numer pod który dzwonimy.

9. Utwórz klasę `Komorka` dziedziczącą po klasie `Telefon` i dodającą jako pole tablicę ostatnich 10 połączeń wykonanych z tego telefonu.

10. Utwórz klasę `Smartfon` dziedziczącą po klasie `Komorka` i dodającą jako pole tablicę `Osoba[] znajomi`, gdzie klasa `Osoba` zawiera trzy pola: `String imie`, `String nazwisko`, `String numer`.

11. Zaimplementuj we wszystkich klasach metodę `void wyswietlHistoriePolaczen()`, która wyświetli:
* „brak historii” - jeśli zostanie wywołana na rzecz obiektu klasy `Telefon`;
* listę ostatnio wybieranych numerów np: „123-456-789” - jeśli zostanie wywołana na rzecz obiektu klasy Komorka;
* listę znajomych do których ostatnio dzwoniliśmy w postaci „Jan Kowalski 123-456-789” gdy osoba jest w tablicy znajomych lub sam numer w przeciwnym przypadku - jeśli zostanie wywołana na rzecz obiektu klasy `Smartfon`.

12. Utwórz tablicę przechowującą elementy klasy `Telefon` i wypełnij ją wszystkimi rodzajami telefonów. Następnie wykonaj przynajmniej 10 połączeń na każdym z telefonów z tablicy zapewniając że co drugi wybierany numer będzie dzwonił do znajomego (z listy osób w smartfonie). Na koniec wyświetl historię połączeń wszystkich telefonów.