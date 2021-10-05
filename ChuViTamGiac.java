import java.util.Scanner;

public class ChuViTamGiac {
    public static class Triangle {
        double x1, x2, x3, y1, y2, y3;

        public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.y1 = y1;
            this.y2 = y2;
            this.y3 = y3;
        }

        public void perimeter() {
            double s = (1.0/2)*Math.abs((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1));
            if(s==0.0){
                System.out.println("INVALID");
                return;
            }
            double l1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            double l2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
            double l3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
            System.out.printf("%.3f", l1 + l2 + l3);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Triangle triangle = new Triangle(
                    scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()
            );
            triangle.perimeter();
        }
    }
}
