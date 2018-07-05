public
    class S14839_09 {
        public static void main(String[] arg) {
            System.out.println("\n Zadanie 1.");
            S14839_09.cwiczenie_01();
            S14839_09.cwiczenie_02();
            System.out.println("\n Zadanie 3.");
            S14839_09.cwiczenie_03();
        }

        public static void cwiczenie_01() {
            Dzem pierwszy = new Dzem(250.0);
            Dzem drugi = new Dzem("Sliwkowy");
            Dzem trzeci = new Dzem("Truskawkowy", 250.0);

            System.out.println("pierwszy:");
            System.out.println("smak to: " + pierwszy.smak);
            System.out.println("waga to: " + pierwszy.waga);
            System.out.println("drugi:");
            System.out.println("smak to: " + drugi.smak);
            System.out.println("smak to: " + drugi.waga);
            System.out.println("trzeci:");
            System.out.println("smak to: " + trzeci.smak);
            System.out.println("smak to: " + trzeci.waga);
        }

        public static void cwiczenie_02() {
            Dzem pierwszy = new Dzem(250.0);
            Sloik pierwszySloik = new Sloik(true, pierwszy);
            pierwszySloik.zamknij();

            Dzem drugi = new Dzem("Sliwkowy");
            Sloik drugiSloik = new Sloik(true, drugi);
            drugiSloik.zamknij();

            Dzem trzeci = new Dzem("Truskawkowy", 250.0);
            Sloik trzeciSloik = new Sloik(true, trzeci);
            trzeciSloik.zamknij();
        }

        public static void cwiczenie_03() {
            Wyraz[] zdanie = {
                new Wyraz("Ala"),
                new Wyraz("ma"),
                new Wyraz("kota"),
                new Wyraz("a"),
                new Wyraz("kot"),
                new Wyraz("ma"),
                new Wyraz("Ale")
            };

            for (int i = 0; i < (zdanie.length - 1); i++) {
                zdanie[i].setNastepnyWyraz(zdanie[i+1]);
            }

            System.out.println(zdanie[0].show());
        }
    }

class Dzem {
    public String smak;
    public double waga;

    Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    Dzem(double waga) {
        this.waga = -100.0;
        this.smak = "No name";
    }

    Dzem(String smak) {
        this.waga = -100.0;
        this.smak = "No name";
    }
}

class Sloik {
    Dzem dzem;
    boolean czyOtwarty;

    Sloik(boolean czyOtwarty, Dzem dzem) {
        this.czyOtwarty = czyOtwarty;

        if (czyOtwarty) {
            this.dzem = dzem;
        }
    }

    public void otworz() {
        this.czyOtwarty = true;
    }

    public void zamknij() {
        this.czyOtwarty = false;
    }
}

class Wyraz {
    String base;
    Wyraz rest;

    Wyraz(String base) {
        this.base = base;
    }

    public void setNastepnyWyraz(Wyraz rest) {
        this.rest = rest;
    }

    public String show() {
        return (this.rest == null)
            ? this.base
            : this.base + this.rest.show();
    }
}