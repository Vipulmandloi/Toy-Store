import java.util.Scanner;

class consumer{
    public int age;
    public int maxpri;
    consumer(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter your amount");
        maxpri=sc.nextInt();
    }

}

class toys extends consumer{
    public int boardprice;
    public int boardage;
    public int gaemcollprice;
    public int gaemcolage;
    toys(int boardprice,int boardage,int gaemcollprice,int gaemcolage){
        this.boardprice=boardprice;
        this.boardage=boardage;
        this.gaemcollprice=gaemcollprice;
        this.gaemcolage=gaemcolage;
    }
    public void checkage(){
        if(age>gaemcolage){
            if(age>boardage && maxpri>=boardprice){
                System.out.println("Board game Monoploy is best choice for you ");
                
                System.out.println("Your balance amount is " + (maxpri-boardprice));
            }else if(maxpri<gaemcollprice){
                System.out.println("Sorry we dont have toys for you ");

            }
            else{
                System.out.println("You can buy Game collection like chedd and card");
                System.out.println("Your balance amount is " + (maxpri-gaemcolage));
            }
        }else{
            System.out.println("Sorry the age is too small");
        }

    }
}



public class Toystores {
    public static void main(String[] args) {
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name");
        name=sc.nextLine();
        System.out.println("Welcome to the Store "+name);
        toys toy=new toys(30,8,40,5);
        toy.checkage();

    }
}
