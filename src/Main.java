public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightkg = 98;
        double heightmeter = 1.87;
        int bmi = service.calculate(weightkg, heightmeter);
        System.out.println(bmi);
    }
}
