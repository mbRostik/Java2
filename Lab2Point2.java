import java.lang.*;
import java.util.Scanner;
public class Lab2Point2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in );
        String variable = scanner.nextLine();

        double radians = Math.toRadians(Double.parseDouble(variable));

        System.out.println("Sinys 30 gradysiv: " + Math.sin(radians));

        System.out.println("Kosinys 30 gradysiv: " + Math.cos(radians));
    }
}