# Problem tworzenia labiryntu z jedną drogą wyjścia.
Przygotuj dwuwymiarową tablicę zmiennych typu `char` o rozmiarze `N` na `M`. Następnie wypełnij ciało metody `void przygotujLabirynt(char[][] dane)` tak aby powstał labirynt z dokładnie jedną ścieżką prowadzącą z elementu o indeksie 0, 0 do elementu o indeksie N, M. Tworząc ten program należy przyjąć że:

* wartością o oznaczamy ścieżkę;
* wartością x oznaczamy ścianę po której nie można się poruszać;
* poruszając się po labiryncie można chodzić tylko w podstawowych kierunkach (góra, dół, lewo, prawo);
* elementy oznaczone jako ścieżka nie mogą występować obok siebie, np:

``` java
xoox
xoox
xoox

xxx
ooo
ooo
xxx
```

* jeżeli odcinek prosty ma więcej niż 5 elementów, wówczas należy przygotować przynajmniej jedno rozwidlenie typu T lub +;
* w całej planszy nie może być więcej niż 20% elementów x, które będą sąsiadowały tylko z innymi elementami x.