1. [1 pkt.] Utwórz bezrezultatową metodę wypisującą na ekranie kwadrat z naprzemiennie występujących znaków x i o. Pierwszy argument tej metody będzie określał ilość znaków w boku kwadratu, natomiast drugi od jakiego znaku należy rozpocząć wypisywanie.

2. [1 pkt.] Przygotuj dwuwymiarową tablicę zmiennych typu `char` zawierającą wylosowane znaki z przedziału ’a’ do ’z’. Następnie napisz metodę sprawdzającą czy na krawędziach (skrajnych wierszach i kolumnach) tej tablicy występują znaki takie, że sąsiadujące trzy elementy są od siebie coraz większe.

3. [1 pkt.] Utwórz metodę `jestRowna` sprawdzającą czy dostarczone jako argumenty dwie dwuwymiarowe tablice 
* mają takie same wymiary m × n,
* spełniają warunek że `a[i][j] = b[i][j]` dla `i = 0, ..., m − 1` i `j = 0, ..., n − 1`.

Metoda zwróci rezultat w postaci wartości logicznej `true` tylko gdy oba powyższe są spełnione jednocześnie.

4. [1 pkt.] Utwórz program losujący 10 par liczb rzeczywistych z przedziału 0 − 100. Utwórz metodę wyliczającą średnią wszystkich par, a następnie wyświetlającą tylko te pary liczb których pierwsze liczby będą mniejsze od średniej a drugie większe.

5. [1 pkt.] Utwórz klasę `Kwadrat` z polem bok. Zainicjuj pole w konstruktorze. Dodaj metodę `show` wyświetlającą:
* pole powierzchni tego kwadratu,
* objętość sześcianu zbudowanego na podstawie tego kwadratu

Przedstaw wykorzystanie tej klasy na przykładzie.

6. [1 pkt.] Utwórz klasę `Walec` z polami promień i wysokość. Zainicjuj pola w konstruktorze. Dodaj metodę `show` wyświetlającą:
* pole powierzchni podstawy,
* objętość walca

Przedstaw wykorzystanie tej klasy na przykładzie.

7. [1 pkt.] Zmodyfikuj klasę `Kwadrat` tak aby wyświetlała również dane walca umieszczonego w bryle sześcianu zbudowanego na podstawie tego kwadratu. Znajdź rozwiązanie nie wymagające powielania napisanego już raz kodu.