public class BmiService {
    public float calculate(int weight, int height) {
        return (weight * 100000) / (height * height);
    }
}
