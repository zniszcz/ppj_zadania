public
  class S14839_p01 {

    int[] firstDay = new int[7];
    int[] lastDay = new int[7];

    boolean isNotFinished = true;

    final int[] NORM_MONTH_DAYS = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    final int[] LEAP_MONTH_DAYS = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Add constructor for writing unit tests
    S14839_p01(int rokPoczatek, int miesiacPoczatek, int dzienPoczatek,
      int godzinaPoczatek, int minutaPoczatek, int sekundaPoczatek,
      int milisekundaPoczatek, int rokKoniec, int miesiacKoniec,
      int dzienKoniec, int godzinaKoniec, int minutaKoniec,
      int sekundaKoniec, int milisekundaKoniec) {
        // Declare start values
        this.firstDay[0] = rokPoczatek;
        this.firstDay[1] = miesiacPoczatek;
        this.firstDay[2] = dzienPoczatek;
        this.firstDay[3] = godzinaPoczatek;
        this.firstDay[4] = minutaPoczatek;
        this.firstDay[5] = sekundaPoczatek;
        this.firstDay[6] = milisekundaPoczatek;

        this.lastDay[0] = rokKoniec;
        this.lastDay[1] = miesiacKoniec;
        this.lastDay[2] = dzienKoniec;
        this.lastDay[3] = godzinaKoniec;
        this.lastDay[4] = minutaKoniec;
        this.lastDay[5] = sekundaKoniec;
        this.lastDay[6] = milisekundaKoniec;
    }

    public void licznikCzasu() {
      //
      int[] now = this.firstDay;

      while (this.isNotFinished) {
        boolean isLeap = (now[0]%4 == 0 && now[0]%100 != 0) || 
          now[0]%400 == 0;

        if (S14839_p01.isEqual(now, this.lastDay)) {
          this.isNotFinished = false;
        }

        System.out.println(now[0] + " " + now[1] + " " + now[2] +
          " " + now[3] + " " + now[4] + " " + now[5] + " " + now[6]);

        now[6]++;

        if (now[6] >= 1000) {
          now[6] -= 1000;
          now[5]++;
        }

        if (now[5] >= 60) {
          now[5] -= 60;
          now[4]++;
        }

        if (now[4] >= 60) {
          now[4] -= 60;
          now[3]++;
        }

        if (now[3] >= 24) {
          now[3] -= 24;
          now[2]++;
        }

        if (!isLeap && now[2] > this.NORM_MONTH_DAYS[now[1]]) {
          now[2] -= this.NORM_MONTH_DAYS[now[1]];
          now[1]++;
        }

        if (isLeap && now[2] > this.LEAP_MONTH_DAYS[now[1]]) {
          now[2] -= this.NORM_MONTH_DAYS[now[1]];
          now[1]++;
        }

        if (now[1] >= 13) {
          now[1] -= 12;
          now[0]++;
        }
      }
    }

    private static boolean isEqual(int[] a, int[] b) {
      for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) {
          return false;
        }
      }
      return true;
    }
}