package session6;
import java.util.ArrayList;
import session6.StaticMember;
public class UserClass {
    ArrayList myCart=new ArrayList();

    public void createList() {
        myCart.add("doll");
        myCart.add("Bus");
        myCart.add("Teddy");
        System.out.println("Cart contents are : "+myCart);
    }

    public static void main(String[] args) {
        UserClass objUser = new UserClass();
        objUser.createList();
        StaticMember objStatic = new StaticMember();
        objStatic.displayCount();
    }
}
