public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 85;
        double height = 180;
        double index = service.calculate(weight, height);
        System.out.println("Индекс массы тела");
        System.out.println(index);
    }
}