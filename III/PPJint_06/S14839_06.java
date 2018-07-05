public
    class S14839_06 {
        public static void main(String[] arg) {
            System.out.println();

            System.out.println(" --- Zadanie 1 --- ");
            S14839_06.cwiczenie_01();
            System.out.println();

            System.out.println(" --- Zadanie 2 --- ");
            S14839_06.cwiczenie_02();
            System.out.println();
        }
        public static void cwiczenie_01() {
            MethodCurrier test = new MethodCurrier();

            test.setValue((int) 0);
            test.setValue((float) 0);
            test.setValue((char) 0);
            test.setValue((byte) 0);

            // Decyzja podejmowana jest na podstawie sygnatury metody.
            // Metoda wywołana z wartością `char` i `byte` jest wyko-
            // nywana przez metodę z sygnaturą parametru `int ze względu
            // na `widening primitive conversion`.
        }
        public static void cwiczenie_02() {
            MethodCurrier test = new MethodCurrier();
            Liczba liczba = new Liczba();

            liczba.przypiszWartosc(0);

            test.setValue((int) 0);
            test.setValue((float) 0);
            test.setValue(liczba);
        }
        public static void cwiczenie_03() {
            // Parameters required by exercise 04
            Osoba osoba = new Osoba("", "", 0);

            osoba.imie = "Jan";
            osoba.nazwisko = "Kowalski";
            osoba.rokUrodzenia = 1939;
        }
        public static void cwiczenie_04() {
            Osoba osoba = new Osoba("Jan", "Kowalski", 19);
            osoba.show();
        }
}

class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    Osoba(String imie, String nazwisko, int rokUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public void show() {
        System.out.println("Imie osoby to: "+this.imie);
        System.out.println("Nazwisko osoby to: "+this.nazwisko);
        System.out.println("Rok urodzenia osoby to: "+this.rokUrodzenia);
    }
}

class MethodCurrier {
    public void setValue(int var) {
        var += var;
        System.out.println("Zmienna była typu int, o wartości "+var);
    }
    public void setValue(float var){
        var += var;
        System.out.println("Zmienna była typu float, o wartości "+var);
    }
    public void setValue(Liczba var) {
        var.przypiszWartosc(1);
        var.wyswietlWartosc();
    }
}

class Liczba {
    int var;
    
    public void przypiszWartosc(int var) {
        this.var = var;
    }

    public void wyswietlWartosc() {
        System.out.println("Zmienna była typu Liczba, o wartości "+this.var);
    }
}

