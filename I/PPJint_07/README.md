1. Dana jest dwuwymiarowa tablica zmiennych typu double opisująca położenie punktu w przestrzeni, oraz taka sama dwuwymiarowa tablica obrot:

``` java
double [][] punkt = {
    {1},
    {0},
    {0}
};

double [][] obrot = {
    {0, −1, 0},
    {1, 0, 0},
    {0, 0, 1}
};

double [][] rezultat = new double [3][1];
```

Wykonaj operację wyliczenia wartości tablicy rezultat przyjmując że wynikiem elementu 0, 0 jest suma mnożeń elementów z zerowego wiersza tablicy obrót z elementami z zerowej kolumny tablicy punkt (tj. obrot0,0 ∗ punkt0,0 + obrot0,1 ∗ punkt1,0 + obrot0,2 ∗ punkt2,0).

2. Utwórz dwuwymiarową tablicę zmiennych typu int o rozmiarach 10 na 10 i wypełnij ją losowymi liczbami. Następnie znajdź taki element tej tablicy, którego suma elementów sąsiadujących jest największa. Uwaga:
* elementami sąsiadującymi są wszystkie elementy graniczące z elementem analizowanym;
* jeżeli element sąsiadujący wychodzi poza granice tablicy, nie podlega analizie;
* parametryzacja i wypisanie wszystkich sąsiadujących elementów nie jest rozwiązaniem tego zadania;

3. Utwórz dwuwymiarową tablicę kwadratową o pseudolosowej liczbie elementów typu `char` i wypełnij ją wartościami ’a’ i ’l’ w dowolny sposób. Następnie wypisz na ekran wszystkie słowa “ala” jakie znajdą się w tej tablicy.

4. Napisz program, który utworzy tablicę N × N elementową i wypełni wartościami, tak aby kolejne obręcze miały coraz mniejsze wartości.

``` java
00000
01110
01210
01110
00000

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