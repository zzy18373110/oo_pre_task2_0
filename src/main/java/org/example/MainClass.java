package main;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextInt();
        double width = scanner.nextInt();
        double height = scanner.nextInt();
        CuboidBox mybox = new CuboidBox(length, width, height);
        int n = scanner.nextInt();
        int way;
        for (int i = 0;i < n;i++) {
            way = scanner.nextInt();
            switch (way) {
                case 1:
                    System.out.printf("%f\n", mybox.getLength());
                    break;
                case 2:
                    System.out.printf("%f\n", mybox.getWidth());
                    break;
                case 3:
                    System.out.printf("%f\n", mybox.getHeight());
                    break;
                case 4:
                    mybox.setLength(scanner.nextInt());
                    break;
                case 5:
                    mybox.setWidth(scanner.nextInt());
                    break;
                case 6:
                    mybox.setHeight(scanner.nextInt());
                    break;
                case 7:
                    System.out.printf("%f\n", mybox.getVolume());
                    break;
                default:
                    break;

            }
        }
    }
}

class CuboidBox {
    private double length;
    private double width;
    private double height;

    public CuboidBox(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * width * height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}