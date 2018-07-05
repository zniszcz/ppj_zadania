1. Utwórz klasę `Kontener` zawierającą:
* pole `Cukierek ladunek`,
* pole `double masaLadunku`,
* pole `int dniPrzydatnosci`,
* konstruktor – inicjujący pole dopuszczalną masą ładunku,
* metodę – załaduj przyjmującą argumenty:
    * `Cukierek` - wyprodukowany przez fabrykę z poprzednich ćwiczeń,
    * `dniPrzydatności` - przypisującą ile dni cukierki mogą być przechowywane;
* metodę `sprawdzPrzydatnosc` – zwracającą wartość logiczną czy produkt nadaje się jeszcze do spożycia.

2. Utwórz klasę `Magazyn` przechowującą Kontenery na pięcioelementowym stosie, implementującą metody `przyjmijKontener` i `wydajKontener`. Przedstaw przykład pokazujący poprawne działanie magazynu.

3. Zadbaj aby kontenery przechowywane w magazynie zawsze poukładane były w kolejności ilości dni przydatności produktu.

4. Utwórz własną klasę wyjątku `MyException`. Następnie napisz program przedstawiający podniesienie i obsłużenie tego wyjątku.

5. Korzystając z rozwiązań ćwiczeń 19, zadbaj aby nalewanie dzemu do zakręconego słoika powodowało podniesienie i obsłużenie wyjątku.

6. Utwórz 3 klasy opisujące trzy różne wyjątki, a następnie napisz zapętlony program losujący który z wyjątków ma zostać podniesiony. Wykorzystaj obsługę wyjątków aby nigdy nie wystąpiły po sobie dwa takie same wyjątki.