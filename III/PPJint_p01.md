# 1. Treść projektu
Zadane są poniższe zmienne zainicjowane wartościami odpowiadającymi datom w kalendarzu gregoriańskim po roku 1582:

``` java
int rokPoczatek = A ;
int miesiacPoczatek = B ;
int dzienPoczatek = C ;
int godzinaPoczatek = D ;
int minutaPoczatek = E ;
int sekundaPoczatek = F ;
int milisekundaPoczatek = G ;

int rokKoniec = S ;
int miesiacKoniec = T ;
int dzienKoniec = U ;
int godzinaKoniec = W ;
int minutaKoniec = X ;
int sekundaKoniec = Y ;
int milisekundaKoniec = Z ;

```

Utwórz program, który wypisze na ekranie zbiór wszystkich dat w formacie „rok, miesiąc, dzien, godzina, minuty, sekundy, milisekundy” zawartych pomiędzy dwoma wskazanymi punktami w czasie, wypisując na ekranie np.:

```
2018 04 25 15 47 21 021
2018 04 25 15 47 21 022
2018 04 25 15 47 21 023
[ . . . ]
2018 04 26 00 00 00 001
```

# 2. Wymagania formalne
Projekt należy oddać do dnia 9.V.2018.
Prace oddawane w ramach projektu powinny być dostarczone w postaci pojedynczego
pliku .java o strukturze zgodnej z poniższym schematem:

``` java
public
  class SXXXXXX_p01 {
    public void licznikCzasu ( ) {
      // . . .
    }
}
```
gdzie jako XXXXXX należy podać numer studenta.

W projekcie nie można używać żadnych struktur danych, które nie są autorstwa oddającego. Jedynym dozwolonym wyjątkiem jest polecenie wyświetlania na ekran.
Projekt nie może zostać poddany żadnym formom zaciemniania kodu. Niespełnienie któregokolwiek z wymogów formalnych opisanych powyżej, skutkować będzie zerową liczbą punktów.
