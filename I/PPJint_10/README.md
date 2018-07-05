1. Zadeklaruj klasę `Dzem` zawierającą prywatne pola:
* `String smak`,
* `double waga`

Utwórz konstruktory przyjmujące jako parametry zmienne:
* `(String smak, double waga)`,
* `(double waga)`,
* `(String smak)`.

Dostarczone parametry konstruktorów powinny zainicjalizować pola klasy. W przypadku gdy konstruktor nie dostarcza niezbędnego parametru należy przyjąć, że pole `smak` musi przyjąć wartość “No name”, natomiast `waga` – 100.0. Przedstaw wykorzystanie wszystkich konstruktorów tworząc obiekty reprezentujące trzy rodzaje dżemów. Uwaga: należy założyć, że tylko konstruktor z dwoma parametrami może przypisać wartości polom klasy.

2. Zadeklaruj klasę `Sloik` zawierającą pole `Dzem dzem`, dedykowany konstruktor inicjujący wszystkie zadeklarowane pola i metody:
* `otworz`
* `zamknij`
* `czyOtwarty`

Następnie utwórz obiekt klasy `Sloik` i napełnij go wybranym rodzajem dżemu, operacje powtórz dla wszystkich rodzajów dżemów. Uwaga: nakladanie dzemu do zamkniętego słoika lub pozostawienie słoika nie zamkniętego może prowadzić do zepsucia się produktu!

3. Zdefiniuj klasę Cukierek z polami:
• `String smak`,
• `double waga`.

Utwórz konstruktor inicjujący te pola i metodę `show()` wyświetlającą stan wszystkich pól cukierka.

4. Zdefiniuj klasę `Fabryka` implementującą statyczną metodę `make`. Metoda ta będzie przyjmować jako parametr wartość typu `int` określającą jaki rodzaj cukierków należy produkować, a zwracać obiekt reprezentujący ten cukierek. Jeżeli cukierek określonego typu był już produkowany w tej fabryce, należy zwrócić jego obiekt. W przeciwnym przypadku metoda `make` poprzedzi zwrócenie obiektu jego fabrykacją.

5. Utwórz klasę `Wyraz` zawierającą pola:

* typu String – inicjowane przez konstruktor,
* typu Wyraz – inicjowane przez metodę setNastepnyWyraz.

Ponadto klasa będzie implementowała bezparametrową metodę `show`, celem której będzie wyświetlenie na ekranie słowa przechowywanego przez obiekt oraz wywołanie metody `show` na rzecz obiektu przechowywanego w drugim polu (o ile istnieje). Przedstaw użycie klasy `Wyraz` w programie, wykorzystując w tym celu zdanie “Ala ma kota a kot ma Ale”.