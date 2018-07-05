1. [1 pkt.] Omówioną na wykładzie klasę `Owoc` rozszerz o pole `double waga`. Zainicjuj to pole w konstruktorze losową wartością z przedziału 0.5- 0.8, i uzupełnij metodę `toString` aby wyświetlała informacje o wadze owocu.

2. [1 pkt.] Zadeklaruj klasę `Dzem` zawierającą prywatne pola:
* `String smak`,
* `double waga`

Utwórz konstruktory przyjmujące jako parametry zmienne:
* `(String smak, double waga)`,
* `(double waga)`,
* `(String smak)`.

Dostarczone parametry konstruktorów powinny zainicjalizować pola klasy. W przypadku gdy konstruktor nie dostarcza niezbędnego parametru należy przyjąć, że pole smak musi przyjąć wartość “No name”, natomiast waga – 100.0. Przedstaw wykorzystanie wszystkich konstruktorów tworząc obiekty reprezentujące trzy rodzaje dżemów. Uwaga: należy założyć, że tylko konstruktor z dwoma parametrami może przypisać wartości polom klasy.

3. [1 pkt.] Zadeklaruj klasę `Sloik` zawierającą pole `Dzem dzem`, dedykowany konstruktor inicjujący wszystkie zadeklarowane pola i metody:
* `otworz`
* `zamknij`
* `czyOtwarty`

Następnie utwórz obiekt klasy `Sloik` i napełnij go wybranym rodzajem dżemu, operacje powtórz dla wszystkich rodzajów dżemów. Uwaga: nakladanie dzemu do zamkniętego słoika lub pozostawienie słoika nie zamkniętego może prowadzić do zepsucia się produktu!

4. [1 pkt.] Utwórz klasę `Fabryka`, która przez metodę `przyjmij` będzie skupowała owoce, następnie gdy zbierze się 10 kg owoców, fabryka będzie mogła wytworzyć 10 słoików dżemu.