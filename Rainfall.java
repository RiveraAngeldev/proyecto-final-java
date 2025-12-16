

public class Rainfall {
    private double rainfall[][]; // [años][meses]
    private int years[];
    private String[] months; 

    public Rainfall() {
        rainfall = new double[3][12];
        years = new int[] {2022, 2023, 2024};
        months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        initData();
    }
    private void initData() {
        rainfall[0][0] = 2.11; // 2022 - January
        rainfall[0][1] = 1.13; // 2022 - February

    }

    public void displayYearData(int year) {
        int index = getYearIndex(year);
        if(index == -1) {
            System.out.println("Year not found");
            return;
        }
        double total = 0;
        double maxRain = rainfall[index][0];
        double minRain = rainfall[index][0];
        int maxMonth = 0;
        int minMonth = 0;
        System.out.println("\nRianfall for " + year + ":");
        for(int i = 0; i < 12; i++) {
            double rain = rainfall[index][i];
            System.out.println(months[i] + ": " + String.format("%.2f", rain) + " inches"); //referencia: https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
            total += rain;

            if(rain > maxRain) {
                maxRain = rain;
                maxMonth = i;
            }
            if(rain < minRain) {
                minRain = rain;
                minMonth = i;
            }
        }
        System.out.println("\nMonth with most rain: " + months[maxMonth] + " (" + String.format("%.2f", maxRain) + " inches)");
        System.out.println("Month with least rain: " + months[minMonth] + " (" + String.format("%.2f", minRain) + " inches)");
        System.out.println("\nTotal rainfall for " + year + ": " + String.format("%.2f", total) + " inches");


    }
    
    private int getYearIndex(int year) {
        for(int i = 0; i <years.length; i++) {
            if(years[i] == year) return i;
        }
        return -1;
     }
    
    public void viewTotals() {
        double total = 0;
        int count = 0;
        for(int i = 0; i < rainfall.length; i++) {
            for(int k = 0; k < 12; k++) {
                total += rainfall[i][i];
                count++;
            }
        }
        double avg = total/ count;
        System.out.printf("Total rainfall over all years: %.2f inches\n", total);
        System.out.printf("Average rainfall: .%2f inches\n", avg);
    }

}

