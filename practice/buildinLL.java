package practice;

import java.util.LinkedList;

public class buildinLL {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.addFirst("am");
        list.addFirst("I");
        list.addLast("Abdul");
        System.out.println(list);
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }

    }
}
