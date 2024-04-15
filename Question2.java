public class Question2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Question2 <height_in_meters> <weight_in_kilograms>");
            return;
        }

        double height = Double.parseDouble(args[0]);
        double weight = Double.parseDouble(args[1]);

        double bmi = weight / (height * height);

        System.out.println(bmi);
    }
}
