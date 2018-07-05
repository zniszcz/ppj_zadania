1. [1 pkt.] Dana jest tablica `char[] tab = {’a’, ’b’, ’c’, ’e’, ’f’};` Napisz program wyświetlający wszystkie elementy tej tablicy wraz z ich lewym i prawym sąsiadem, przyjmując że wychodząc poza tablicę (z dowolnej strony) sąsiadującymi elementami są wartości z początku lub końca tablicy.

2. [1 pkt.] Przygotuj jednowymiarową tablicę zmiennych typu `int` o rozmiarze 100 elementów i wypełnioną losowymi wartościami. Następnie oblicz średnią arytmetyczną dla wartości w tablicy, po czym utwórz dwie tablice w jednej przechowaj wszystkie wartości mniejsze od średniej, a w drugiej wszystkie większe lub równe od średniej.

3. [1 pkt.] Dana jest przykładowa tablica:
``` java
int [][] tab = {
    {1, 0, 0, 0, 0},
    {0, 1, 0, 0},
    {0, 0, 1}
};
```

Napisz program, który zamieni `tab` na tablicę jednowymiarową.

4. [1 pkt.] Dana jest dwuwymiarowa tablica zmiennych typu `double` opisująca położenie punktu w przestrzeni, oraz taka sama dwuwymiarowa tablica odbicie:

``` java
double [][] punkt = {
    {1},
    {0},
    {0}
};

double [][] odbicie = {
    {1, 0, 0},
    {0, −1, 0},
    {0, 0, 1}
};
double [][] rezultat = new double [3][1]; 
```

Wykonaj operację wyliczenia wartości tablicy rezultat przyjmując że wynikiem elementu o indeksach 0, 0 jest suma mnożeń elementów z zerowego wiersza tablicy odbicie z elementami z zerowej kolumny tablicy punkt.

5. [1 pkt.] Napisz program, który utworzy tablicę N × N elementową i wypełni wartościami, tak aby kolejne obręcze miały coraz mniejsze wartości.

``` java
00000
01110
01210
01110
00000
```

``` java
0000000000
0111111110
0122222210
0123333210
0123443210
0123443210
0123333210
0122222210
0111111110
0000000000
```