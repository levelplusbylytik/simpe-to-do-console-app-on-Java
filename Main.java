import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.*;

public class Main{
    public static void main(String[] arg) {
        Scanner scan = new Scanner(in);
        boolean can_be_govnocode = true;
        boolean is_already_exist = false;
        ArrayList<String> tasks = new ArrayList<>();
        while (can_be_govnocode == true){
            for (String i : tasks) {
                out.println(i);
            }
            System.out.println("Введите ваше задания , либо deleteTask для того что бы перейти на экран удаления заданий");
            String input = scan.nextLine();
            for(String i : tasks){
                if(input.equals(i)){
                    can_be_govnocode = false;
                    System.out.println("Такое задание уже существует !");
                    is_already_exist = true;
                    can_be_govnocode = true;
                }
            }
            if(is_already_exist == true){
                tasks.remove(input);
            }
            if(input.equals("deleteTask")){
                System.out.println("Напишите задание которое хотите удалить");
                String input2 = scan.nextLine();
                tasks.remove(String.valueOf(input2));

            }
            else {
                tasks.add(input);
            }
            out.println("Вы написали " + input);

        }


    }
}
