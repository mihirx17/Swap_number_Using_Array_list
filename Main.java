import java.util.ArrayList;

public class Main {
    public static void swap_arrayList(ArrayList <Integer> number,int post1,int end)
    {
        int temp=number.get(post1);
        number.set(post1,number.get(end));
        number.set(end,temp);
        System.out.println(number);
    }
    public static void main(String[] args){
    ArrayList<Integer> number=new ArrayList<>();
    number.add(1);
    number.add(2);
    number.add(3);
    number.add(4);
    int post1=1;
    int end=2;
        System.out.println(number);
        swap_arrayList(number,post1,end);
    }
}