import java.util.Scanner;

public class romanNumerals {
    
    static String to_roman_number(int number) {

        String[] roman_table = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numerical_table = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String result = " ";
        int my_number = number;

        for(int i=0; i < numerical_table.length; i++){

            if(number / numerical_table[i] !=0 && number != 0){

                int rec = number / numerical_table[i];
                result += roman_table[i].repeat(rec);
                number -= rec * numerical_table[i];
            }
            else{
                continue;
            }
        }

        return Integer.toString(my_number) + " ->" + result;
      }
    public static void main(String[] args) {

        while(true){
            
            Scanner in = new Scanner(System.in);
            System.out.println("Please choose a number: ");
            int number = in.nextInt();

            if(number > 3000){
                System.out.println("Please choose a number smaller or equal to 3000");
            }
            else{
                System.out.println(to_roman_number(number));
            }
        
        }
        
    }
  }
  