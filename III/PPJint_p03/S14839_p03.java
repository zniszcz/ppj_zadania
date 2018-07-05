import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public 
    class S14839_p03 {
        public static void main(String[] args) throws IOException {
            String file1 = S14839_p03.readFile("./dane01.txt");
            String file2 = S14839_p03.readFile("./dane02.txt");

            String allFile = file1 + file2;

            Record[] allRecords = S14839_p03.parseFile(allFile);

            Record[] sortedByIndex = S14839_p03.sortByIndex(allRecords);
            S14839_p03.writeFile(sortedByIndex, "./sortNum.txt");
            
            Record[] sortedByName = S14839_p03.sortByName(allRecords);
            S14839_p03.writeFile(sortedByName, "./sortName.txt");
        }

        public static String readFile(String path) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String allFile = "";
                String line;
                while ((line = br.readLine()) != null) {
                    allFile += (line + "\n");
                }

                return allFile;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return "";
        }

        public static void writeFile(Record[] file, String name) throws IOException {
  
                FileWriter fileWriter = new FileWriter(name);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                
                try {
                  for (Record record : file) {
                    bufferedWriter.write(record.index + " " + record.name);
                    bufferedWriter.newLine();
                  }
                } finally {
                  bufferedWriter.close();
                }

        }

        public static Record[] parseFile(String file) {
            String[] parts = file.split("\n");
            Record[] result = new Record[parts.length];
            
            for (int i = 0; i < parts.length; i++) {
                result[i] = new Record(parts[i]);
            }

            return result;
        }

        public static Record[] sortByIndex(Record[] toSort) {
            if (toSort.length < 2 || toSort[1] == null) {
                return toSort;
            }

            Record pivot = toSort[0];
            Record[] left = new Record[toSort.length - 1];
            Record[] right = new Record[toSort.length - 1];

            int left_pos = 0;
            int right_pos = 0;
            int rewrite_pos = 0;

            for (int i = 1; i < toSort.length && toSort[i] != null; i++) {
                if (toSort[i].compareByIndex(pivot) <= 0) {
                    left[left_pos] = toSort[i];
                    left_pos++;
                } else {
                    right[right_pos] = toSort[i];
                    right_pos++;
                }
            }

            left = S14839_p03.sortByIndex(left);
            right = S14839_p03.sortByIndex(right);

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

        public static Record[] sortByName(Record[] toSort) {
            if (toSort.length < 2 || toSort[1] == null) {
                return toSort;
            }

            Record pivot = toSort[0];
            Record[] left = new Record[toSort.length - 1];
            Record[] right = new Record[toSort.length - 1];

            int left_pos = 0;
            int right_pos = 0;
            int rewrite_pos = 0;

            for (int i = 1; i < toSort.length && toSort[i] != null; i++) {
                if (toSort[i].compareByName(pivot) <= 0) {
                    left[left_pos] = toSort[i];
                    left_pos++;
                } else {
                    right[right_pos] = toSort[i];
                    right_pos++;
                }
            }

            left = S14839_p03.sortByName(left);
            right = S14839_p03.sortByName(right);

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
    }

    class Record {
        public int index;
        public String name;

        public Record(String exp) {
            String[] parts = exp.split(" ");
            this.index = Integer.parseInt(parts[0]);
            this.name = parts[1];
        }

        public int compareByIndex(Record that) {
            if (this.index == that.index) {
                return 0;
            } else if (this.index < that.index) {
                return -1;
            } else {
                return 1;
            }
        }

        public int compareByName(Record that) {
            if (this.name.compareTo(that.name) == 0) {
                return 0;
            } else if (this.name.compareTo(that.name) < 0) {
                return 1;
            } else {
                return -1;
            }
        }

        public void toJSON() {
            System.out.println("{");
            System.out.println(" index: "+this.index+",");
            System.out.println(" name: "+this.name+", ");
            System.out.println("},");
        }
    }