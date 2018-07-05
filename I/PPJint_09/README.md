1. Zadeklaruj klasę `MethodCurrier` implementującą dwie nic nie zwracające metody `setValue`. Pierwsza przyjmie jako parametr zmienną typu prostego `int`, natomiast druga przyjmie jako parametr zmienną typu `float`. Obie metody wyświetlą na ekranie wartości dostarczonych zmiennych z informacją jakiego typu był parametr. Następnie należy utwórzyć obiekt klasy `MethodCurrier` i wywołać obie metody dostarczając jako parametry literały typu:

* `int`
* `float`
* `char`
* `byte`

Na jakiej podstawie podejmowana jest decyzja którą z metod należy wywołać?

2. Zdefiniuj klasę `Liczba` z polem typu `int`, oraz metodami `przypiszWartosc` (przypisującą polu wartość dostarczoną jako parametr metody) i `wyswietlWartosc` (wyświetlającą wartość pola). Następnie rozszerz definicję klasy `MethodCurrier` z poprzedniego zadania o metodę `setValue` akceptującą jako parametr klasę `Liczba`. Przedefiniuj wszystkie metody `setValue` tak aby wykonywały następujące czynności:

* wyświetlały stan zmiennej dostarczonej jako parametr,
* modyfikowały wartość dostarczonej zmiennej,
* wyświetlały stan zmodyfikowanej zmiennej.

Na koniec przedstaw wywołanie wszystkich metod `setValue` i odpowiedz co zmieniły wywołane metody? Przedstaw poprawne definicje i wywołania obu metod.

3. Zadefiniuj klasę `B` której konstruktor wyświetli na ekran wartość `this`. Dodaj definicje statycznej metody `staticShowThis` i nie statycznej metody `staticShowThis`. Celem obu metod jest wyświetlenie na ekran stanu słowa kluczowego `this`.

4. Przedstaw definicję klasy `B` popierającą tezę, jakoby obiekt istniał w momencie wywołania konstruktora.

5. Utwórz klasę `Osoba` zawierającą publiczne pola:

* `String imie`
* `String nazwisko`
* `int rokUrodzenia`

Utwórz obiekt klasy Osoba i przechowaj go w zmiennej osoba. Wykorzystaj możliwość dostępu do publicznych pól tej klasy i przypisz im literały lub wartości opisujące tworzoną osobę.

6. Utwórz konstruktor dla klasy `Osoba` który zainicjuje wszystkie jej pola. Ponadto utwórz metodę `show` wypisującą na ekran stan wszystkich pól. Działanie obu składowych klasy przedstaw w programie.

7. Liczby zespolone składają się z części rzeczywistej i urojonej opisanych przez zmienne typu `double`. Napisz klasę Cplx implementującą:

* prywatne pola obu liczb
* dwuparametrowy konstruktor
* funkcję dodawania (`add(Cplx)`)
* funkcję odejmowania (`sub(Cplx)`)
* funkcję mnożenia (`mul(Cplx)`)
* funkcję zwiększającą część rzeczywistą o jeden (`inc()`)
* funkcję show wyświetlającą daną liczbę zespoloną w formacie `4 + 5i`

Działanie zdefiniowanej klasy przedstaw na przykładach przynajmniej trzech różnych liczb.