package StaticMembers;
public class Main {
    public static void main(String[] args){
        new Counter();
        new Counter();
        System.out.println(Counter.getCount());
    }
}
