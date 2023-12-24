package ru.mirea.task16;
import java.util.Scanner;
public class Client {
        Chair chair;
        Client(){}
        public void setChair(Chair chair){
            this.chair=chair;
        }

        public void Sit(){
            ChairFactory newChair=new ChairFactory();
            boolean flag=true;
            while(flag){
                System.out.println("1-Викторианский стул\n2-Многофункциональный стул\n3-Магический стул\n4- Выход из фабрики");
                Scanner scan=new Scanner(System.in);
                int input=scan.nextInt();
                if(input==1){
                    this.setChair((Chair) newChair.createVictorianChair());
                    break;
                }
                else if(input==2) {
                    this.setChair((Chair) newChair.createMultufunctionalChair());
                    System.out.println("Хотите ли вы посчитать сумму чисел? Ответье да или нет");
                    String answer=scan.nextLine();
                }else if(input==3){
                    this.setChair((Chair) newChair.createMagicChair());
                    break;
                }else if(input==4){
                    flag=false;
                    break;
                }else{
                    System.out.println("Неверное число");
                }

            }
        }
    }

