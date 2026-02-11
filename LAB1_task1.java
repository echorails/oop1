import java.util.Scanner;

class Data {
    private double sum;       
    private double maximum;   
    private int count;        

    public Data() {
        this.sum = 0.0;
        this.maximum = 0; 
        this.count = 0;
    }

    public void add(double value) {
        sum += value;
        count++;
        if (value > maximum) {
            maximum = value;
        }
    }

    public double getAverage() {
        if (count == 0) {
            return 0.0;
        }
        return sum / count;
    }

    public double getMaximum() {
        if (count == 0) {
            return 0.0;
        }
        return maximum;
    }
}

class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number (Q to quit): ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("Q")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                data.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: пожалуйста, введите число или Q");
            }
        }

        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());

        sc.close();
    }
}