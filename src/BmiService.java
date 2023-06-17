public class BmiService {
    public int calculate(int weightkg, double heightmeter) {
        double index;
        if (heightmeter > 0.1) {
            index = heightmeter * heightmeter;
        } else {
            index = 0;
        }
        int println;
        if (weightkg > 0) {
            println = weightkg / (int) index;
        } else {
            println = 0;
        }
        return println;
    }
}
