1. Utwórz bezrezultatową funkcję `show` przyjmującą parametr typu `int`, której celem będzie wyświetlenie na ekran dostarczonej wartości. Działanie utworzonej metody przedstaw w programie.

2. Dana jest tablica zmiennych typu `char` przechowująca napis Ala ma kota. Napisz metodę, która policzy ile razy wystąpiły znaki składające się na ciąg dostarczony jako argument.

3. Zakładając że tablica dwuwymiarowa ma rozmiar x kolumn na y wierszy napisz metody:
* `display` – wyświetlającą w konsoli wszystkie elementy dowolnej tablicy dwuwymiarowej dostarczonej jako argument
* `void fillRow(int[][] tab, int row, int val)` – wypełniającą wskazany rząd `row` wartością dostarczoną jako parametr `val`;
* `void fillCol(int[][] tab, int col, int val)` – wypełniającą wskazaną kolumnę `col` wartością `val`;
* `void fillRowFromTo(int[][] tab, int row, int from, int to, int val)` – przypisującą wartości `val` w rzędzie `row` od elementu `from` do elementu `to`;
* `void fillColFromTo(int[][] tab, int col, int from, int to, int val)` – przypisującą wartości `val` w kolumnie `col` od elementu `from` do elementu `to`;

Wykorzystując przygotowane narzędzia utwórz program wypełniający tablicę 20×20 wypełnioną zerami, a następnie wypełnij tablicę tak aby utworzyła wzór spirali jak na rysunku poniżej:

``` java
1011111111
1010000001
1010111101
1010100101
1010110101
1010110101
1010000101
1011111101
1000000001
1111111111
```

4. Zadeklaruj klasę `ZbiorMetod` implementującą dwie nic nie zwracające metody `ustalWartosc`. Pierwsza przyjmie jako parametr zmienną typu prostego `int`, natomiast druga przyjmie jako parametr zmienną typu `float`. Obie metody wyświetlą na ekranie wartości dostarczonych zmiennych z informacją jakiego typu był parametr. Następnie należy utwórzyć obiekt klasy `ZbiorMetod` i wywołać obie metody dostarczając jako parametry literały typu:
* `int`
* `float`
* `char`
* `byte`

Na jakiej podstawie podejmowana jest decyzja którą z metod należy wywołać?

5. Zdefiniuj klasę `Liczba` z polem typu `int`, oraz metodami `przypiszWartosc` (przypisującą polu wartość dostarczoną jako parametr metody) i `wyswietlWartosc` (wyświetlającą wartość pola). Następnie rozszerz definicję klasy `ZbiorMetod` z poprzedniego zadania o metodę `ustalWartosc` akceptującą jako parametr klasę `Liczba`. Przedefiniuj wszystkie metody `ustalWartosc` tak aby wykonywały następujące czynności:
* wyświetlały stan zmiennej dostarczonej jako parametr,
* modyfikowały wartość dostarczonej zmiennej,
* wyświetlały stan zmodyfikowanej zmiennej.

Na koniec przedstaw wywołanie wszystkich metod `ustalWartosc` i odpowiedz co zmieniły wywołane metody?

6. Liczby zespolone składają się z części rzeczywistej i urojonej opisanych przez zmienne typu `double`. Napisz klasę `LiczbaZespolona` implementującą:
* prywatne pola obu liczb
* dwuparametrowy konstruktor
* funkcję dodawania (`dodaj(LiczbaZespolona)`)
* funkcję odejmowania (`odejmij(LiczbaZespolona)`)
* funkcję mnożenia (`pomnoz(LiczbaZespolona)`)
* funkcję zwiększającą część rzeczywistą o jeden (`zwieksz()`)
* funkcję wyswietl wyświetlającą daną liczbę zespoloną w formacie 4 + 5i

Działanie zdefiniowanej klasy przedstaw na przykładach przynajmniej trzech różnych liczb.