import java.util.Random;
public
    class S14839_p02 {
        public static void main(String[] arg) {
            PojazdMechaniczny[] tab = S14839_p02.fill(new PojazdMechaniczny[1000]);
            PojazdMechaniczny[] tabSorted = S14839_p02.sort(tab);

            int i = 0;

            while (i < tabSorted.length) {
                System.out.println(tabSorted[i].toString() + ", \n\n");
                i++;
            }
        }

        public static PojazdMechaniczny[] sort(PojazdMechaniczny[] toSort) {
            if (toSort.length < 2 || toSort[1] == null) {
              return toSort;
            }
          
            PojazdMechaniczny pivot = toSort[0];
            PojazdMechaniczny[] left  = new PojazdMechaniczny[toSort.length - 1];
            PojazdMechaniczny[] right = new PojazdMechaniczny[toSort.length - 1];
            int left_pos = 0;
            int right_pos = 0;
            int rewrite_pos = 0;
          
            for (int i = 1; i < toSort.length && toSort[i] != null; i++) {
              if (toSort[i].compareTo(pivot) <= 0) {
                left[left_pos] = toSort[i];
                left_pos++;
              } else {
                right[right_pos] = toSort[i];
                right_pos++;
              }
            }
          
            left = S14839_p02.sort(left);
            right = S14839_p02.sort(right);
          
            for (int i = 0; i < left.length && left[i] != null; i++) {
                toSort[rewrite_pos] = left[i];
                rewrite_pos++;
            }
          
            toSort[rewrite_pos] = pivot;
            rewrite_pos++;
            
            for (int i = 0; i < right.length && right[i] != null; i++) {
                toSort[rewrite_pos] = right[i];
                rewrite_pos++;
            }

            return toSort;
          }

        public static PojazdMechaniczny[] fill(PojazdMechaniczny[] tab) {
            int i = 0;

            while (i < tab.length) {
                tab[i] = PojazdMechaniczny.createRandom();
                i++;
            }

            return tab;
        }
    }

class PojazdMechaniczny {
    int iloscMiejsc;
    String nazwa;
    Silnik silnik;

    public PojazdMechaniczny(int iloscMiejsc, String nazwa, Silnik silnik) {
        this.iloscMiejsc = iloscMiejsc;
        this.nazwa = nazwa;
        this.silnik = silnik;
    }

    public String toString() {
        return "{ \n"
            + "  iloscMiejsc: " + this.iloscMiejsc + ",\n"
            + "  nazwa: " + this.nazwa + ",\n"
            + "  silnik: " + this.silnik.toString() + "\n"
            + "}";
    }

    public int compareTo(PojazdMechaniczny that) {
        if (this.silnik.moc  == that.silnik.moc) {
            if (this.silnik.pojemnosc == that.silnik.pojemnosc) {
                if (this.iloscMiejsc == that.iloscMiejsc) {
                    if (this.nazwa.compareTo(that.nazwa) == 0) {
                        return 0;
                    } else if (this.nazwa.compareTo(that.nazwa) < 0) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (this.iloscMiejsc < that.iloscMiejsc) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (this.silnik.pojemnosc < that.silnik.pojemnosc) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.silnik.moc < that.silnik.moc) {
            return -1;
        } else {
            return 1;
        }
    }

    public static PojazdMechaniczny createRandom() {

        Random rand = new Random();

        int[] exampleIloscMiejsc = {2, 3, 5, 7};
        String[] exampleNazwa = { "Opel", "Mazda", "Jeep", "Ford", "Toyota", "Hyundai", "Fiat", "Chrystler"};
        
        int iloscMiejsc = exampleIloscMiejsc[rand.nextInt(exampleIloscMiejsc.length - 1)];
        String nazwa = exampleNazwa[rand.nextInt(exampleNazwa.length - 1)];
        Silnik silnik = Silnik.createRandom();

        return new PojazdMechaniczny(iloscMiejsc, nazwa, silnik);
    }
}

class Silnik {
    int moc;
    long pojemnosc;

    Silnik(int moc, long pojemnosc) {
        this.moc = moc;
        this.pojemnosc = pojemnosc;
    }

    public String toString() {
        return "{ \n"
            + "    moc: " + this.moc + ",\n"
            + "    pojemnosc: " + this.pojemnosc + "\n"
            + "  }";
    }

    public static Silnik createRandom() {
        Random rand = new Random();
        int moc = rand.nextInt(230) + 70;
        long pojemnosc = (long)((rand.nextInt(9) + 1) * 1000);
        return new Silnik(moc, pojemnosc);
    }
}