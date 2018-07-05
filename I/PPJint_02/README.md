1. Jaki będzie rezultat poniższego fragmentu kodu:

``` java
byte a = 40, b = 5 0;
byte suma = (byte) a + b;
System.out.println(suma);
```

Zanim skompilujesz program, na kartce zapisz wynik.

2. Dana jest zmienna typu `boolean czyPada` zainicjowana wartością `true`. Napisz program sprawdzający stan tej zmiennej i wyświetlający stosowny komunikat na ekran (wykorzystaj instrukcję warunkową if).

3. Dane są następujące zbiory:

* A = (−15, −10] ∪ (−5, 0) ∪ (5, 10)
* B = (−∞, −13] ∪ (−8, −3]
* C = [−4,∞)

Napisz program weryfikujący, czy zmienna `int wrt` należy do części wspólnej tych zbiorów.

4. Dane są następujące zbiory:

* A = (−15, −10)
* B = (−∞, −13)

Napisz program sprawdzający czy zmienna `int wrt` należy tylko do jednego z tych zbiorów.

5. Zapisz jaka będzie rezultat operacji matematycznej `(Math.sqrt(2))^2 - 2`? Następnie umieść w programie następującą zmienną: `double sqTwo = Math.sqrt(2);` - wyliczającą wartość pierwiastka kwadratowego. Następnie przechowaj w innej zmiennej wynik operacji podniesienia zmiennej `sqTwo` do kwadratu i odejęcia od niej wartości 2. Dlaczego wyniki się różnią?

6. Sprawdz jaki będzie rezultat poniższego programu:

``` java
int x = 4 ;
long y = x ∗ 4 − x++;
if ( y<10) System.out.println("za mało");
else System.out.println("w sam raz");
```

Odpowiedź uzasadnij.

7. Jaki będzie rezultat poniższego programu:

``` java 
boolean x = true, z = true;
int y = 20;
x = (y!= 10)^(z=false);
System.out.println(x+", "+y+", "+z);
```

Przedstaw w komentarzu kolejne kroki wyliczenia wartości.

8. Dany jest znak typu `char` opisujący wartość liczby zapisanej w systemie heksadecymalnym. Napisz program bezpośrednio zamieniający ten znak na wartość dziesiętną. Wynik operacji operacji wyświetl na konsoli.

9. Dane są zmienne `int dzien` i `int miesiac`, które należy zainicjować bierzącą datą. Napisz program liczący ile dni upłynęło od rozpoczęcia roku do tej daty.

10. Dane są trzy zmienne zadeklarowane i zainicjowane jak następuje:

``` java
int x = (int) (Math.random() ∗ 10);
int y = (int) (Math.random() ∗ 10);
int z = (int) (Math.random() ∗ 10);
```

Utwórz program znajdujący największą wartość, wykorzystując minimalną ilości porównań.