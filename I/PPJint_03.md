1. Napisz program wyświetlający trzykrotnie wartości od 1 do 10, wykorzystując wszystkie rodzaje pętli.

2. Dana jest zmienna `int wrt`. Zmodyfikuj poprzedni program, tak aby wyświetlał wartości będące wynikiem mnożenia kolejnej wartości zmiennej pętli i zmiennej wrt.

3. Przedstaw program ilustrujący podstawową różnicę pomiędzy pętlami while i do–while.

4. Utwórz program wyświetlający na ekran pierwsze 10 elementów szeregu geometrycznego inf Sum n=0 1/(2^n) (do wyliczenia potęgi nie można użyć funkcji pow).

5. Napisz program, który wykorzystując pętle utworzy trójkąt składający się z literału `*`:

``` bash
*
**
***
****
*****
```

6. Przeanalizuj poniższy kod i udziel odpowiedzi jaki będzie rezultat wykonania go.

```java
int x = 0;
while (x++ < 10) {}
String msg = x > 10 ? "Większe niż" : false;
System.out.println(msg + "," + x);
```

7. Jaki będzie rezultat poniższego kodu:

``` java
do {
    int y = 3 ;
    System . out . println(++y + " ");
} while ( y <= 10 );
```

8. Jaki będzie rezultat poniższego kodu:

``` java
boolean wykonuj = true;
int res = 15, i = 10;
do {
  i−−;
  if (i == 6)
      wykonuj = false;
  res −= 2;
} while (wykonuj);
System.out.println(res);
```