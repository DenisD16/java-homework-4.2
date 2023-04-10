public class BmiService {
    public int calculate(int weightkg, double heightMeters) {
    return (int) (weightkg / heightMeters / heightMeters);
    }

}