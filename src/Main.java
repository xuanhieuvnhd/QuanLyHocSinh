import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        School school = new School();

        school.add(new Student("Hieu",23,"DN",0622));

        school.getStudent20YearOld();

        school.countStudent23YearOldInDN();
        System.out.println(school);
    }
}
