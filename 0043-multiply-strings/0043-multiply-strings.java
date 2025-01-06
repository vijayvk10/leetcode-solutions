import java.util.Scanner;

public class Solution {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m]; 
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = product + result[i + j + 1];

                result[i + j + 1] = sum % 10; 
                result[i + j] += sum / 10;   
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) { 
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("num1 =  ");
        String num1 = sc.nextLine();

        System.out.print("num2 = ");
        String num2 = sc.nextLine();

        
        String product = multiply(num1, num2);

        
        System.out.println(product);

        sc.close();
    }
}