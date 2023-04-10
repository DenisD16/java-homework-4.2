public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightkg = 98;
        int heightMeters = (int) 1.87;
        int bmi = service.calculate(weightkg,heightMeters); // должно получиться 28
        System.out.println(bmi);
    }
}