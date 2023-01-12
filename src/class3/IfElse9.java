package class3;

public class IfElse9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M')
        {
            System.out.println("Male");
        }

        String name="Sam";
        //with non-prim. we can't  use ==
        if(name.equals("Sam")){
            System.out.println("Amazing student");
        }

        if(!name.equals("Sam")){
            System.out.println("Super Amazing student");
        }

       int money=150;

        if(money>300){
            System.out.println("let's go for shopping");
        }else{
            System.out.println("Let's save some money");
        }



    }
}
