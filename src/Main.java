import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static java.lang.Math.*;

public class Main {
    static Scanner scanner;
    public static void main(String[] args)
    {

        scanner = new Scanner(System.in);

        System.out.print("""
                Welcome to Mithy Calculator.\r
                Would you like to do Arithmetic +,-,/,* (1) \r
                Would you like to do Scientific (Sin, Cos, Tan, Log, Ln) (2) \r
                """);
        String Ans = scanner.nextLine();

        if (!Objects.equals(Ans, "1") && !Objects.equals(Ans, "2")) {
            System.out.println("\n\n");
            main(args);
        }

        if (Objects.equals(Ans, "1")) {
            Arith();
        }
        else if (Objects.equals(Ans, "2")) {
            Scien();
        }



    }

    public static void Arith()
    {
        float fnum = 0;
        String op = "";
        float snum = 0;

        System.out.println("First Number:");
        fnum = parseFloat(scanner.nextLine());
        System.out.println("Operation:");
        op = scanner.nextLine();
        System.out.println("Second Number:");
        snum = parseFloat(scanner.nextLine());

        float ans = 0;

        if (op.equals("+")) {
            ans = fnum + snum;
        }
        if (op.equals("-")) {
            ans = fnum - snum;
        }
        if (op.equals("/")) {
            ans = fnum / snum;
        }
        if (op.equals("*")) {
            ans = fnum * snum;
        }
        System.out.println(ans);


    }

    public static void Scien() {
        float fnum = 0;
        float op = 0;

        System.out.println("Number:\r\n");
        fnum = parseFloat(scanner.nextLine());

        System.out.println("Would you like to do (All in Radians): \r\n" +
                            "Sin (1) \r\n" +
                            "Cos (2) \r\n" +
                            "Tan (3) \r\n" +
                            "Log (Base 10) (4) \r\n" +
                            "Ln (Base e) (5) \r\n");
        op = parseFloat(scanner.nextLine());

        if (op == 1) {
            System.out.println(sin(fnum));

        }
        else if (op == 2) {
            System.out.println(cos(fnum));
        }
        else if (op == 3) {
            System.out.println(tan(fnum));
        }
        else if (op == 4) {
            System.out.println(log10(fnum));
        }
        else if (op == 5) {
            System.out.println((log(fnum)));

        }
        else {
            Scien();
        }






    }

}