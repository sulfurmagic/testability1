public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double heightM = 1.69;
        int weightKg = 80;
        int bmi = service.calculate(heightM, weightKg);
        System.out.println(bmi);

    }
}