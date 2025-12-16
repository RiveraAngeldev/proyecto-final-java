

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
        rainfall[0][2] = 1.23; // 2022 - March
        rainfall[0][3] = 7.31; // 2022 - April
        rainfall[0][4] = 3.21; // 2022 - May
        rainfall[0][5] = 1.34; // 2022 - June
        rainfall[0][6] = 5.53; // 2022 - July
        rainfall[0][7] = 6.31; // 2022 - Agust
        rainfall[0][8] = 1.51; // 2022 - September
        rainfall[0][9] = 2.41; // 2022 - October
        rainfall[0][10] = 8.34; // 2022 - November
        rainfall[0][11] = 1.18; // 2022 - December
//-----------------------------------------------------\\
        rainfall[1][0] = 3.25; // 2023 - January
        rainfall[1][1] = 2.13; // 2023 - February
        rainfall[1][2] = 7.32; // 2023 - March
        rainfall[1][3] = 4.44; // 2023 - April
        rainfall[1][4] = 1.18; // 2023 - May
        rainfall[1][5] = 3.46; // 2023 - June
        rainfall[1][6] = 6.42; // 2023 - July
        rainfall[1][7] = 7.51; // 2023 - August
        rainfall[1][8] = 5.46; // 2023 - September
        rainfall[1][9] = 2.38; // 2023 - October
        rainfall[1][10] = 9.24; // 2023 - November
        rainfall[1][11] = 11.48; // 2023 - December
//-----------------------------------------------------\\
        rainfall[2][0] = 4.21; // 2024 - January
        rainfall[2][1] = 3.43; // 2024 - February
        rainfall[2][2] = 1.45; // 2024 - March
        rainfall[2][3] = 9.51; // 2024 - April
        rainfall[2][4] = 3.61; // 2024 - May
        rainfall[2][5] = 2.54; // 2024 - June
        rainfall[2][6] = 5.33; // 2024 - July
        rainfall[2][7] = 7.51; // 2024 - August
        rainfall[2][8] = 11.21; // 2024 - September
        rainfall[2][9] = 1.31; // 2024 - October
        rainfall[2][10] = 2.63; // 2024 - November
        rainfall[2][11] = 4.18; // 2024 - December


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

    public void viewYearPeaks() {
        double yearTotal[] = new double[rainfall.length];
        for(int i = 0; i <rainfall.length; i++) {
            double sum = 0;
            for(int k = 0; k < 12; k++) {
                sum += rainfall[i][i];

            }
            yearTotal[i] = sum;
        }
        double max = yearTotal[0];
        double min = yearTotal[0];
        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < yearTotal.length; i++) {
            if(yearTotal[i] > max) {
                max = yearTotal[i];
                maxIndex = i;
            }
            if(yearTotal[i] < min) {
                min = yearTotal[i];
                minIndex = i;
            }
        }
        System.out.printf("Year with most rain: %d (%.2f inche)\n", years[maxIndex], max);
        System.out.printf("Year with least rain: %d (%.2f inche)\n", years[minIndex], min);
    }

}

