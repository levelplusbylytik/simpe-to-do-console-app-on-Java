import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.*;

public class Main{
    public static void main(String[] arg) {
        Scanner scan = new Scanner(in);
        boolean can_be_govnocode = true;
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
                    tasks.remove(input);
                    can_be_govnocode = true;
                }
            }
            if(input.equals("deleteTask")){
                System.out.println("Напишите задание которое хотите удалить");
                String input2 = scan.nextLine();
                for(String i : tasks){
                    if(input2.equals(i)){
                        String finnalDeleteIput = String.valueOf(input2);
                        tasks.remove(finnalDeleteIput);
                        System.out.println("Ваш обьект удачно удален");
                        can_be_govnocode = true;
                    }
                    else {
                        System.out.println("Такого обьекта не существует !");
                        can_be_govnocode = true;
                    }
                }
            }
            else {
                tasks.add(input);
            }
            out.println("Вы написали " + input);

        }


    }
}