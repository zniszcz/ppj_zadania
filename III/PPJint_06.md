1. Zadeklaruj klasę `MethodCurrier` implementującą dwie nic nie zwracające metody `setValue`. Pierwsza przyjmie jako parametr zmienną typu prostego `int`, natomiast druga przyjmie jako parametr zmienną typu `float`. Obie metody wyświetlą na ekranie wartości dostarczonych zmiennych z informacją jakiego typu był parametr. Następnie należy utwórzyć obiekt klasy `MethodCurrier` i wywołać obie metody dostarczając jako parametry literały typu:

    - `int`
    - `float`
    - `char`
    - `byte`

Na jakiej podstawie podejmowana jest decyzja którą z metod należy wywołać?

2. Zdefiniuj klasę `Liczba` z polem typu `int`, oraz metodami `przypiszWartosc` (przypisującą polu wartość dostarczoną jako parametr metody) i `wyswietlWartosc` (wyświetlającą wartość pola). Następnie rozszerz definicję klasy `MethodCurrier` z poprzedniego zadania o metodę `setValue` akceptującą jako parametr klasę Liczba. Przedefiniuj wszystkie metody `setValue` tak aby wykonywały następujące czynności:

    - wyświetlały stan zmiennej dostarczonej jako parametr,
    - modyfikowały wartość dostarczonej zmiennej,
    - wyświetlały stan zmodyfikowanej zmiennej.

Na koniec przedstaw wywołanie wszystkich metod `setValue` i odpowiedz co zmieniły wywołane metody?

Przedstaw poprawne definicje i wywołania obu metod.

3. Utwórz klasę `Osoba` zawierającą publiczne pola:

    - `String imie`
    - `String nazwisko`
    - `int rokUrodzenia`

Utwórz obiekt klasy `Osoba` i przechowaj go w zmiennej `osoba`. Wykorzystaj możliwość dostępu do publicznych pól tej klasy i przypisz im literały lub wartości opisujące tworzoną osobę.

4. Utwórz konstruktor dla klasy `Osoba` który zainicjuje wszystkie jej pola. Ponadto utwórz metodę `show` wypisującą na ekran stan wszystkich pól. Działanie obu składowych klasy przedstaw w programie.