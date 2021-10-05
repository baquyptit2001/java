import java.util.Scanner;

public class DienTichTamGiac {
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

        public void area() {
            double s = (1.0/2)*Math.abs((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1));
            if(s==0.0){
                System.out.println("INVALID");
            }else{
                System.out.printf("%.2f", Math.round(s * 100.0) / 100.0);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            Triangle triangle = new Triangle(
                    scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()
            );
            triangle.area();
        }
    }
}
