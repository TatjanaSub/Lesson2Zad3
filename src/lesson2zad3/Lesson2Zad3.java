/*
Дан текст. Определите содержит ли данный текст
все буквы алфавита. Например, Съешь ещё этих
французских булок и галет, да выпей же чаю с
молоком, как и я. – содержит все буквы русского
алфавита
 */
package lesson2zad3;

import java.util.Arrays;

public class Lesson2Zad3 {

    public static void main(String[] args) {
        int index1;
        boolean log = true;
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщьыъэюя";
        String text = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";
 //       String text = "Съешь ещё этих ранцузских булок и галет, да выпей же ча с молоком, как и я.";
        System.out.println("Исходный текст: '"+text+"'");
        text = text.toLowerCase();
        int[] massYes = new int[33];
        for(int i = 0; i < 33; i++){
            index1 = text.indexOf(alphabet.charAt(i));
            if(index1 == -1) {
                log = false;
            }else{
                massYes[i] = 1;
            }
        }
        if(log){
            System.out.println("Данный текст содержит все буквы русского алфавита!");
        }else{
            System.out.print("Данный текст не содержит следующие буквы русского алфавита: ");
            for(int i = 0; i < 33; i++){
                if(massYes[i] == 0) System.out.print(alphabet.charAt(i)+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
