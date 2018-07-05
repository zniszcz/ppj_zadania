1. Jaki będzie wynik operacji matematycznej (√2^2)2 − 2?

2. Umieść w programie następującą zmienną: `double sqTwo = Math.sqrt(2);` - wyliczającą wartość pierwiastka kwadratowego. Następnie przechowaj w innej zmiennej wynik operacji podniesienia zmiennej `sqTwo` do kwadratu i odjęcia od niej wartości 2. Napisz instrukcję warunkową sprawdzającą czy przewidywania z poprzedniego ćwiczenia się sprawdziły?

3. Poniższy fragment kodu pozwoli na podanie do programu liczby wprowadzonej z klawiatury, a następnie przechowa pozyskaną wartość w zmiennej wrt:
``` java
java.util.Scanner in = new java.util.Scanner(System.in);
byte wrt = in.nextByte();
```

Utwórz program, który wypisze na ekran wartości potęg dwójki lub wartości 0, dla wszystkich bitów z których składa się ta liczba. Przykładowa dla liczby 5 oczekiwany jest ciąg wynikowy:

``` java
0
4
0
1
```

4. Korzystając tylko z operatora ? : dokonaj optymalnej i jednoznacznej klasyfikacji zmiennej `int wrt` do zbiorów:
* A = [0, ∞)
* B = (−∞, 1]
* C = [0, 1]

5. Dane są następujące zbiory:
* A = (−15, −10] ∪ (−5, 0) ∪ (5, 10)
* B = (−∞, −13] ∪ (−8, −3]
* C = [−4,∞)

Napisz program weryfikujący, czy zmienna `int wrt` należy do części wspólnej tych zbiorów.

6. Dane są zmienne opisujące różne rodzaje dzemów truskawkowy, malinowy, brzoskwiniowy, agrestowy zainicjowane dowolnymi wartościami. Ponadto dana jest zmienna sloik, której wartość opisuje zawartość słoika. Napisz program wykorzystujący instrukcję `switch` klasyfikującą jakiego rodzaju dzem został opisuje zmienna słoik.

7. Jaki będzie rezultat poniższego fragmentu kodu:

``` java
byte a = 40, b = 50;
byte suma = (byte) a + b;
System.out.println(suma);
```

Zanim skompilujesz program, na kartce zapisz wynik.

8. Sprawdz jaki będzie rezultat poniższego programu:

``` java
int x = 4;
long y = x ∗ 4 − x++;
if ( y<12) System.out.println("za mało");
else System.out.println("w sam raz");
```
Odpowiedź uzasadnij.

9. Jaki będzie rezultat poniższego programu:

``` java
boolean x = true , z = true;
int y = 20;
x = ( y!= 10 ) ^ ( z=false );
System.out.println(x+", "+y+", "+z);
```

10. Zadanie dla chętnych
Dana jest zmienna typu `char` o nazwie typ, która może zostać zainicjowana jedną z trzech wartości:
* b - od zapisu binarnego,
* d - od zapisu decymalnego,
* h - od zapisu heksadecymalnego.

Utwórz program sprawdzający stan zmiennej typ i na podstawie jej wartości wyświetlający komunikat, jaki zapis został użyty przy kodowaniu liczby. Jeżeli ustalono dowolny inny znak należy wyświetlić na ekranie “Error”. Następnie zadeklaruj dwie zmienne `char rzad1, rzad0` zakładając że będą one odwzorowywały rzędy liczby, przykładowo dla liczby czternaście zmienna `rzad1` będzie miała wartość 1 a zmienna `rzad0` będzie miała wartość `4`. Uzupełnij program tak aby sprawdzał czy warości podane jako zmienne `rzad1` i `rzad0` spełniają kryteria określonego w zmiennej typ systemu liczbowego. Mając pewność że mamy określony obsługiwany system liczbowy, a wprowadzone wartości są zgodne z zadanym systemem, utwórz program zamieniający liczbę na pozostałe (dwa) systemy liczbowe.