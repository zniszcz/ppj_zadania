1. Dane są poniższe ciągi znaków, utwórz wyrażenie regularne akceptujące wszystkie z poniższych ciągów:

* aaaabbcch
* bbaaaacch
* ccaaacch
* bbaaaabbh
* abch

2. Dany jest tekst: `wieś w Polsce położona w województwie wielkopolskim, w powiecie kolskim, w gminie Olszówka. W latach 1975-1998 miejscowość położona była w województwie konińskim.` Wykorzystując wyrażenia regularne zdiagnozuj ile par liczb wystąpiło w tym tekście.

3. Utwórz w notatniku plik `1.txt` i skopuj do niego wybrany fragment z wikipedii. Następnie napisz program, który używając klasy `FileInputStream` wczytaj wszystkie dane z pliku do zmiennej typu `StringBuilder`. Używając wyrażeń regularnych policz ile razy wystąpiły elementy będące słowami.

4. Dany jest plik `serverLog.txt`, wczytaj jego zawartość do `StringBuilder` a następnie używając wyrażeń regularnych znajdź w nim: adres IP, datę, wiadomość. Pozyskane dane przechowaj w tablicy 100 × 3.

5. Przygotuj klasę `Wiadomosc` z polami:
* `int dzien, int miesiac, int rok`
* `String godzina`
* `String user`
* `String ip`
* `String tekst`

Zaimplementuj konstruktor i przeciąż metodę `toString`.

6. Wczytaj zawartość pliku `serverLog.txt`. Podziel odczytane dane tak, aby każda linia inicjowała obiekt klasy `Wiadomosc`, a następnie umieść obiekty w kolekcji `ArrayList`. Następnie utwórz metody które pozwolą na:
* wyświetlenie wszystkich wiadomości z zadanego dnia
* wyświetlenie wszystkich wiadomości z zadanego miesiąca
* wyświetlenie wszystkich wiadomości z zadanego adresu ip