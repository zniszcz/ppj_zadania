1. [1 pkt.] Dana jest jednowymiarowa tablica zmiennych typu `int` wypełniona wartościami 1, 2, 3. Napisz program liczący ilość wystąpień każdej z tych wartości w tej tablicy.

2. [1 pkt.] Dana jest jednowymiarowa tablica zmiennych typu `char` wypełniona elementami o losowych wartościach z przedziału ’A’ do ’Z’. Napisz program tworzący tablicę o rozmiarze identycznym do danej tablicy i wypełnij ją tak, aby było to lustrzane odbicie.

3. [1 pkt.] Dana jest tablica:

``` java
int [][] tab = {
    {1, 0, 0},
    {0, 1, 0},
    {0, 0, 1}
};
```

Napisz program, który zamieni `tab` na tablicę jednowymiarową.

4. [1 pkt.] Dana jest dwuwymiarowa tablica zmiennych typu `double` opisująca położenie punktu w przestrzeni, oraz taka sama dwuwymiarowa tablica przesuniecie:

``` java
double [][] punkt = {
    {1},
    {0},
    {0}
};

double [][] przesuniecie = {
    {1 , 0, 2},
    {0 , 1, 2},
    {0 , 0, 1}
};

double [][] rezultat = new double [3][1]; 
```

Wykonaj operację wyliczenia wartości tablicy rezultat przyjmując że wynikiem elementu o indeksach 0, 0 jest suma mnożeń elementów z zerowego wiersza tablicy przesuniecie z elementami z zerowej kolumny tablicy punkt.

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