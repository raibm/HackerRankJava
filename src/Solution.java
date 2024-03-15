import java.util.Scanner;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        String output = "";
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            int count = 0;

            System.out.println(calc(result, 1, n, b, a, output, count));
        }
        in.close();
    }

    public static String calc(int result, int mult, int max, int b, int a, String output, int count) {
        if (mult == 1) {
            result = a + mult * b;
            count++;
            output = result + " ";
        } else {
            count++;
            result += mult * b;
            output = output.concat(result + " ");
        }

        if (count == max) {
            return output;
        } else {
            return calc(result, mult * 2, max, b, a, output, count);
        }
    }
}

