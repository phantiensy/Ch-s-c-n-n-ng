import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cân nặng của bạn hiện tại :");
        weight = sc.nextDouble();
        System.out.println("Chiều cao của bạn hiện tại :");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", bmi, "Interpretation\n");

        if(bmi < 18){
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        }
        else if(bmi < 25.0){
            System.out.printf("%-20.2f%s", bmi, "Normal");
        }
        else if(bmi < 30.0){
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        }
        else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
