package sptv21string;

import java.util.Scanner;

public class SPTV21String {

   
    public static void main(String[] args) {
        System.out.println("-------String-------");
        System.out.print("Введите строку: "); 
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        do{
            System.out.println("Функции программы: ");
            System.out.println("0. Выйти из программы: ");
            System.out.println("1. Посчитать кол-во символов в строке: ");
            System.out.println("2. Посчитать кол-во слов в строке: ");
            System.out.println("3. Найти подстроку в строке: ");
            System.out.println("4. Заменить подстроку в строке на указанную: ");
            System.out.println("Выберите номер функции: ");
            int numFunc = scanner.nextInt();
            scanner.nextLine();
            if (numFunc == 0){
                break;
            }else if(numFunc == 1){
                System.out.println("Вы выбрали пункт: " +numFunc);
                int countCharInStr=0;
                char[] chars = str.toCharArray();
                for (int i = 0; i <chars.length; i++){
                    if(chars[i] != ' '){
                        countCharInStr++;                 
                    }
                }
                 System.out.println("В строке: " + countCharInStr+ " символов");
            }else if(numFunc == 2){
                System.out.println("Вы выбрали пункт: " +numFunc);
                String[] words = str.split(" ");
                System.out.println("В строке " +words.length+ " слов");

            }else if(numFunc == 3){
                System.out.println("Вы выбрали пункт: " +numFunc);
                System.out.println("Введите искомую строку: ");
                String findStr = scanner.nextLine();
                int index = str.indexOf(findStr);
                if(index<0){
                    System.out.println("Такой строки в тексте нет");
                }else{
                    index++;
                    System.out.println("Искомая строке находится на " + index + " позиции");
                }

            }else if(numFunc == 4){
                System.out.println("Вы выбрали пункт: " +numFunc);
                System.out.println("Введите заменяемую строку: ");
                String removeString = scanner.nextLine();
                String newStr;
                int index = str.indexOf(removeString);
                if(index < 0 ){
                    System.out.println("Такой строки в тексте нет");
                }else{
                    System.out.println("На какую строку заменить: ");
                    newStr = scanner.nextLine();
                    System.out.println("Измененная строка выглядит так: ");
                    System.out.println(str.replace(removeString, newStr));
                }
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        }while(true);
        
    }
}