package string.java;

import java.util.Scanner;
public class main
{
    public static void main(final String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = reader.nextline();
        
        sentence = sentence.toLowerCase();
        
        int vowels = 0, consonants = 0, digits = 0, space = 0;
        
        for(int i=0; i<sentence.lenght(); i++){
            char c = sentence.charAt(i);
            
            if(c =='a' || c =='e'  || c =='i' || c =='o' || c =='u' ){
                ++vowels;
            }
            else if(c >='a' && c<='z'){
                ++consonants;
            }
            else if(c >='0' && c <='9'){
                ++digits;
            }
            else if(c ==''){
                ++spaces;
            }
        }
        System.out.println("Vowels :"+ vowels);
        System.out.println("Consonants :"+ consonants);
        System.out.println("Digit :"+ digit);
        System.out.println("Spaces :"+ spaces);
    }
}
