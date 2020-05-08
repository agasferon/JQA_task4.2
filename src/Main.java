public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 75;
        int height = 175;
        float bim = (service.calculate(weight, height))/10;
        System.out.println(bim);
    }
}