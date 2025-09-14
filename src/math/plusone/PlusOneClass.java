package math.plusone;

import java.util.Arrays;

public class PlusOneClass {

    public static void main(String[] args) {
        int[] digits = new int[]{1, 9, 9};

        int[] digitsResult = plusOne(digits);

        System.out.println(Arrays.toString(digitsResult));
    }

    public static int[] plusOne(int[] digits){

        int[] digitsResult = digits;
        int carry = 1;

        for(int i = digitsResult.length - 1; i >= 0; i--){
            digitsResult[i] += carry;

            if (digitsResult[i] > 9) {
                digitsResult[i] = 0;
            }else{
                carry = 0;
                break;
            }
        }

        if (carry == 1) {
            digitsResult = new int[digits.length + 1];
            digitsResult[0] = carry;
            
            for(int i = 1; i < digitsResult.length; i++){
                digitsResult[i] = digits[i - 1];
            }
        }


        return digitsResult;
    }
    
}