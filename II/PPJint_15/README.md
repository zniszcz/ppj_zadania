1. [1 pkt.] Utwórz wyrażenie regularne, które jednoznacznie opiszę datę w formacie `yyyy-mm-dd`, gdzie dzień i miesiąc mogą być zapisane w postaci jedno lub dwu znakowej.

2. [1 pkt.] Utwórz wyrażenie regularne, które sprawdzi czy wprowadzony z klawiatury ciąg znaków jest poprawnym adresem mailowym opisanym w `RFC 2822`.

3. [1 pkt.] Wczytaj dane z pliku `serverLog.txt`. Używając wyrażeń regularnych znajdź wszystkie wystąpienia adresów w formacie IPv4. Pozyskane poprawne adresy przeliczna wartości heksadecymalne i wyświetl na ekranie w formacie: liczba porządkowa,odstęp w postaci tabulacji, adres w postaci heksadecymalnej np:

``` java
ab:5e:6a:a1
ab:5e:6a:a3
ab:5e:6a:a1
```