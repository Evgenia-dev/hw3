import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    int y = 4 ;
    byte q = 5 ;
    short s = 6;
    long m = 7L;
    float f = 8.9f;
    double d = 9.1;

    double n = 27.12;
    long t = 987678965549L;
    double u = 2.786;
    short i = 569;
    short o = -159;
    long x = 27897L;
    Short v = 67;

    public static class PaperDistribution {
        public static void main(String[] args) {
            // Объявление переменных
            int studentsLyudmila = 23;
            int studentsAnna = 27;
            int studentsEkaterina = 30;
            int totalPaperSheets = 480;
            int totalStudents = studentsLyudmila + studentsAnna + studentsEkaterina;
            double sheetsPerStudent = (double) totalPaperSheets / totalStudents;
            System.out.printf("На каждого ученика рассчитано %.2f листов бумаги%n", sheetsPerStudent);
        }
    }
        public class BottleProduction {
        public static void main(String[] args) {
            int bottlesPerTwoMinutes = 16;
            int minutesInHour = 60;
            int hoursInDay = 24;
            int daysInMonth = 30;
            double bottlesPerMinute = (double) bottlesPerTwoMinutes / 2;
            int production20Minutes = (int) (bottlesPerMinute * 20);
            System.out.printf("За 20 минут машина произвела %d штук бутылок%n", production20Minutes);
            int productionPerDay = (int) (bottlesPerMinute * minutesInHour * hoursInDay);
            System.out.printf("За сутки машина произвела %d штук бутылок%n", productionPerDay);
            int productionForThreeDays = productionPerDay * 3;
            System.out.printf("За 3 дня машина произвела %d штук бутылок%n", productionForThreeDays);
            int productionForOneMonth = productionPerDay * daysInMonth;
            System.out.printf("За 1 месяц машина произвела %d штук бутылок%n", productionForOneMonth);
        }
    }

 public class SchoolPaint {
  public static void main(String[] args) {
     int totalCans = 120;
            int classes = totalCans / 6;
            int whiteCans = 2 * classes;
            int brownCans = 4 * classes;
            System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски.%n", classes, whiteCans, brownCans);
        }
    }
}