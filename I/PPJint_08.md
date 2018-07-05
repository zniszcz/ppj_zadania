1. Utwórz bezrezultatową funkcję show przyjmującą parametr typu `int`, której celem będzie wyświetlenie na ekran dostarczonej wartości. Działanie utworzonej metody przedstaw w programie.

2. Dana jest zmienna typu `int` o wartości 5 i nazwie wrt. Napisz bezrezultatową funkcję `modifyValue` przyjmującą jako parametr zmienną typu `int`. Zadaniem funkcji będzie:

* wyświetlenie wartości dostarczonej zmiennej,
* modyfikacja zmiennej przez zapisanie w niej wyniku mnożenia przez 5,
* wyświetlenie wartości zmodyfikowanej zmiennej

Utwórz program wyświetlający stan zmiennej `wrt` przed i po wywołaniu funkcji `modifyValue`. Jaki jest powód uzyskanego rezultatu?

3. Dana jest tablica zmiennych typu `char` przechowująca napis Ala ma kota. Napisz metodę, która policzy ile razy wystąpiły znaki składające się na ciąg dostarczony jako argument.

4. Zakładając że tablica dwuwymiarowa ma rozmiar x kolumn na y wierszy napisz metody:
* `display` – wyświetlającą w konsoli wszystkie elementy dowolnej tablicy dwuwymiarowej dostarczonej jako argument
* `void fillRow(int[][] tab, int row, int val)` – wypełniającą wskazany rząd `row` wartością dostarczoną jako parametr `val`;
* `void fillCol(int[][] tab, int col, int val)` – wypełniającą wskazaną kolumnę `col` wartością `val`;
* `void fillRowFromTo(int[][] tab, int row, int from, int to, int val)` – przypisującą wartości val w rzędzie row od elementu from do elementu to;
* `void fillColFromTo(int[][] tab, int col, int from, int to, int val)` – przypisującą wartości val w kolumnie row od elementu from do elementu to;

Wykorzystując przygotowane narzędzia utwórz program wypełniający tablicę 20×20 wypełnioną zerami, a następnie wypełnij tablicę tak aby utworzyła wzór spirali jak na rysunku poniżej:

``` java
1011111111
1010000001
1010111101
1010100101
1010100101
1010:)0101
1010000101
1011111101
1000000001
1111111111
```

5. Utwórz bezrezultatową metodę wypisującą na ekranie kwadrat z naprzemiennie występujących znaków x i o. Pierwszy argument tej metody będzie określał ilość znaków w boku kwadratu, natomiast drugi od jakiego znaku należy rozpocząć wypisywanie.

``` java
xoxoxoxoxoxox
oxoxoxoxoxoxo
xoxoxoxoxoxox
oxoxoxoxoxoxo
xoxoxoxoxoxox
oxoxoxoxoxoxo
xoxoxoxoxoxox
oxoxoxoxoxoxo
```

6. Przygotuj dwuwymiarową tablicę zmiennych typu `char` zawierającą wylosowane znaki z przedziału ’a’ do ’z’. Następnie napisz metodę liczącą ile wyrazów “ala” wystąpiło w tablicy dostarczonej jako argument.

7. Utwórz metodę `isDiagonal` sprawdzającą czy dostarczona jako argument dwuwymiarowa tablica:

* ma taką samą ilość wierszy i kolumn,
* spełnia warunek że `a[i][j] = 0` dla `i != j` gdzie `i` i `j` są indeksami tej tablicy.

Metoda zwróci rezultat w postaci wartości logicznej true tylko gdy oba powyższe są spełnione.