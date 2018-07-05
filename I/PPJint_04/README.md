1. [1 pkt.] Napisz program wyświetlający wszystkie parzyste liczby z przedziału od 0 do 100.

2. [1 pkt.] Dana jest następująca pętla:

``` java
int s = 0;
for (int i = 1 ; i <= 1 0; i++)
    s = s + i;
```

Zmodyfikuj powyższy kod aby wykorzystywał pętlę while

3. [1 pkt.] Napisz program wyświetlający tabliczkę mnożenia w zakresie do 100.

``` java
// 1 2 3 4 . . .
// 2 4 6 8 . . .
// 3 6 9 12 . . .
// 4 8 12 16 . . .
```

4. [1 pkt.] Utwórz program wyliczający pierwsze 10 liczb pierwszych. Najlepiej na podstawie odpowiedniego zadania z ćwiczeń 3.

5. [1 pkt.] Napisz program, który wyrysuje na konsoli klepsydrę o podstawie składającej się przynajmniej z 8 symboli.

``` java
// ∗∗∗∗∗
//  ∗∗∗
//   ∗
//  ∗∗∗
// ∗∗∗∗∗
```

6. Zadeklaruj jednowymiarową tablicę zmiennych typu `int` o rozmiarze 10 elementów.

7. Zadeklaruj jednowymiarową tablicę zmiennych typu `int` o rozmiarze 10 elementów i wypełnij ją losowo wartościami 0 lub 1.

8. Napisz program liczący ile 0 i 1 jest w tablicy zdefiniowanej w poprzednim zadaniu.

9. Zadeklaruj tablicę zmiennych typu double o rozmiarze 10 elementów zainicjowaną wartościami 0. A następnie:

* wypełnij tablicę losowymi liczbami
* wyświetl na ekranie zawartość całej tablicy
* wyświetl na ekranie tylko liczby o parzystym indeksie
* wyświetl na ekranie tylko elementy tablicy, których przekonwertowane na `int` wartości są nieparzyste.

10. Jaką wartość wypisze poniższa komenda:

``` java
int tab [];
System.out.println(tab);
```

11. Przeanalizuj poniższy program i wypisz wyświetlane wartości:

``` java
    int tab [ ] = { 789 , 678 , 567};

    for ( int i = 0 ; i < tab . length ; i++)
        for ( int j = i ; j < tab . length ; j++)
            System.out.println(tab[i] − tab[j]);
```