import java.util.*;

class NumberConverts {
    public static void main(String[] args) {  // added main method
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 digit number: ");
        n = sc.nextInt();
        if (n < 0 || n > 999) {
            System.out.println("Invalid input, please enter a number between 0 and 999."); // corrected error message
        } else {
            int last = n % 10; // last digit
            int second = (n / 10) % 10; // second digit
            int first = n / 100; // third digit
            String fn[] = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
            };
            String sn[] = {
                "", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
            };
            String tn[] = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
            };
            String big[] = {"Hundred", "Thousand"};

            if (n < 10) {
                System.out.println(fn[n]);
            } else if (n < 20) {
                System.out.println(sn[last]);
            } else if (n < 100) {
                System.out.println(tn[first] + " " + fn[last]);
            } else if (n < 1000) {
                String result = fn[first] + " " + big[0];
                if (n % 100 != 0) {
                    result += " and " + convertTwoDigit(n % 100);
                }
                System.out.println(result);
            }
        }
    }

    public static String convertTwoDigit(int n) {
        String fn[] = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        String sn[] = {
            "", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        String tn[] = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };
        String result = "";
        if (n < 10) {
            result = fn[n];
        } else if (n < 20) {
            result = sn[n % 10];
        } else if (n < 100) {
            result = tn[n / 10] + " " + fn[n % 10];
        }
        return result;
    }
}
