public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double Bmi = service.calcBmi(90,1.6);
        System.out.println(Bmi);

    }
}
