public
    class S14839_08 {
        public static void main(String[] arg) {
            System.out.println("\n Zadanie 1.");
            S14839_08.cwiczenie01();
            System.out.println("\n Zadanie 2.");
            S14839_08.cwiczenie02();
            System.out.println("\n Zadanie 3.");
            S14839_08.cwiczenie03();
            System.out.println("\n Zadanie 4.");
            S14839_08.cwiczenie04();
        }

        public static void cwiczenie01() {
            B b = new B();
        }

        public static void cwiczenie02() {
            Kwadrat kwadrat = new Kwadrat(1);
            Walec walec = new Walec(1, 1);

            KulaW kula1 = new KulaW(kwadrat);
            KulaW kula2 = new KulaW(walec);
        }

        public static void cwiczenie03() {
            Kwadrat kwadrat = new Kwadrat(1);
            Walec walec = new Walec(1, 1);

            KulaNa kula1 = new KulaNa(kwadrat);
            KulaNa kula2 = new KulaNa(walec);
        }

        public static void cwiczenie04() {
            String str = "Ala ma kota";

            char char1 = str.charAt(2);
            char char2 = str.charAt(4);

            System.out.println("Trzeci i piąty znak to:");
            System.out.println(char1);
            System.out.println(char2);

            int indexOfK = str.indexOf('k');

            System.out.println("Index znaku `k` to:");
            System.out.println(indexOfK);

            String[] words = str.split(" ");

            System.out.println("Słowa to:");
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
            }
        }
    }

class Kwadrat {

    int bok;

    Kwadrat(int bok){
        this.bok = bok;
    }

    void show() {
        System.out.println("Pole kwadratu: " + (bok * bok));
        System.out.println("Objetosc szescianu: " + (bok * bok * bok));
        System.out.println("Pole podstawy walca: " + ((Math.PI) * (bok/2) * (bok/2)));
        System.out.println("Objetosc walca: " + ((Math.PI) * (bok/2) * (bok/2) * bok));
    }
}

class KulaW {
    double promien;

    KulaW(Walec walec) {
        this.promien = (walec.wysokosc < (2 * walec.promien))
            ? walec.promien
            : (walec.wysokosc / 2);
    }

    KulaW(Kwadrat kwadrat) {
        this.promien = (kwadrat.bok / 2);
    }
}

class KulaNa {
    double promien;

    KulaNa(Walec walec) {
        this.promien = Math.sqrt((walec.promien * walec.promien) + (walec.wysokosc * walec.wysokosc / 4));
    }

    KulaNa(Kwadrat kwadrat) {
        this.promien = (kwadrat.bok * Math.sqrt(2)) / 2;
    }
}

class B {
    B() {
        if (!(this == null)) {
            System.out.println("Instancja istnieje");
        } else {
            System.out.println("Instancja nie istnieje");
        }
    }
}

class Walec {

    int promien;
    int wysokosc;

    Walec(int promien, int wysokosc) {
        this.promien = promien;
        this.wysokosc = wysokosc;
    }

    void show() {
        System.out.println("Pole powierzchni podstawy: " + ((Math.PI) * promien * promien));
        System.out.println("Objetosc walca: " + ((Math.PI) * promien * promien * wysokosc));
    }
}