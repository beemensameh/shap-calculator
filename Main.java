import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("input.txt");
            Scanner fromfile = new Scanner(f);
            String num = fromfile.nextLine();
            int numberofobject = Integer.parseInt(num);
            String[] allobject = new String[numberofobject];
            double[] allarea = new double[numberofobject];
            for (int i = 0; i < numberofobject; i++) {
                String line = fromfile.nextLine();
                String[] allwords = line.split(" ");
                if (allwords[0].equalsIgnoreCase("Rectangle")) {
                    String n = allwords[0];
                    double h = Double.parseDouble(allwords[3]);
                    double w = Double.parseDouble(allwords[4]);
                    Rectangle recobject = new Rectangle(n, h, w);
                    allarea[i] = recobject.getarea();
                    allobject[i] = recobject.showdetails();
                } else if (allwords[0].equalsIgnoreCase("Triangle")) {
                    String n = allwords[0];
                    double s1 = Double.parseDouble(allwords[3]);
                    double s2 = Double.parseDouble(allwords[4]);
                    double s3 = Double.parseDouble(allwords[5]);
                    Triangle triobject = new Triangle(n, s1, s2, s3);
                    allarea[i] = triobject.getarea();
                    allobject[i] = triobject.showdetails();
                } else if (allwords[0].equalsIgnoreCase("Square")) {
                    String n = allwords[0];
                    double l = Double.parseDouble(allwords[3]);
                    Square sqrobject = new Square(n, l);
                    allarea[i] = sqrobject.getarea();
                    allobject[i] = sqrobject.showdetails();
                } else if (allwords[0].equalsIgnoreCase("Circle")) {
                    String n = allwords[0];
                    double r = Double.parseDouble(allwords[3]);
                    Circle cirobject = new Circle(n, r);
                    allarea[i] = cirobject.getarea();
                    allobject[i] = cirobject.showdetails();
                }
            }
            fromfile.close();
            double largarea = allarea[0];
            for (int i = 0; i < numberofobject; i++) {
                if (allarea[i] > largarea) {
                    largarea = allarea[i];
                }
            }
            File s = new File("output.txt");
            PrintWriter out = new PrintWriter(s);
            for (int i = 0; i < numberofobject; i++) {
                out.println(allobject[i]);
            }
            out.println("**************************");
            out.println("Max Area= " + largarea);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.print("File not exist or Empty");
        } catch (NoSuchElementException e) {
            System.out.print("File is Empty");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("input Error");
        } catch (NumberFormatException e) {
            System.out.print("input write wrong");
        } catch (Exception e) {
            System.out.print("Error");
        }
    }
}
