

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
            System.out.printf("%s: %.2f inches\\n", months[i], rain); //referencia: https://docs.oracle.com/cd/E19253-01/817-6223/chp-fmt-1/index.html
            total += rain;

            if(rain < minRain) {
                minRain = rain;
                minMonth = i;
            }
        System.out.println("Month with most rain: " + months[maxMonth] + " (" + maxRain + " inches)");
        System.out.println("Month with least rain: " + months[minMonth] + " (" + minRain + " inches)");
        System.out.println("Total rainfall for " + year + ": " + total + " inches");

        }


    }
    
    private int getYearIndex(int year) {
        for(int i = 0; i <years.length; i++) {
            if(years[i] == year) return i;
        }
        return -1;
     }

}

