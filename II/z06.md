1. Zadeklaruj jednowymiarową tablicę zmiennych typu `int` o rozmiarze 10 elementów i wypełnij ją losowo wartościami 0 lub 1.

2. Napisz program liczący ile 0 i 1 jest w tablicy zdefiniowanej w poprzednim zadaniu.

3. Dana jest jednowymiarowa tablica zmiennych typu `int` o wielkości losowanej przy każdym uruchomieniu programu. Napisz program sprawdzający i wyświetlający informację jaka jest długość tej tablicy.

4. Zadeklaruj tablicę zmiennych typu double o rozmiarze 10 elementów. A następnie:
* wypełnij tablicę losowymi liczbami
* wyświetl na ekranie zawartość całej tablicy
* wyświetl na ekranie tylko liczby o parzystym indeksie
* wyświetl na ekranie tylko elementy tablicy, których przekonwertowane na `int` wartości są nieparzyste

5. Dana jest jednowymiarowa tablica zdefiniowana jak poniżej:

``` java
int tab [] = {1, 0, 0, 0, 2, 0, 0, 0, 3};
```
Napisz program, który wyświetli wartosi tej tablicy w następujący sposób:

``` java
1 0 0
0 2 0
0 0 3
0 0 3
0 2 0
1 0 0
3 0 0
0 2 0
0 0 1
```

6. Jaką wartość wypisze poniższa komenda:
``` java
int tab [];
System.out.println(tab);
```

7. Przeanalizuj poniższy program i wypisz wyświetlane wartości:

``` java
int tab [] = { 789, 678, 567};

for (int i = 0; i < tab . length ; i++)
    for (int j = i; j < tab . length; j++)
        System.out.println(tab[i] − tab[j]);
```

8. Dana jest tablica

``` java
int [][] tab = {
    {1 ,0, 0},
    {0 ,1, 0},
    {0 ,0, 1}
};
```

Napisz program sprawdzający czy jest to tablica diagonalna, czyli taka której wszystkie wartości leżące poza główną przekątną są zerowe.

9. Zadeklaruj dwuwymiarową tablicę zmiennych typu int o rozmiarach 5 na 5 elementów. Następnie wypełnij jej pola losowymi wartościami i sprawdź czy na którejkolwiek z przekątnych tej tablicy są przynajmniej dwie takie same wartości.

10. Sprawdź w tablicy z poprzedniego zadania, czy suma elementów dowolnego wiersza jest taka sama jak suma elementów dowolnej kolumny.