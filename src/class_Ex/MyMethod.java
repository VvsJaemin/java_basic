package class_Ex;

import java.util.ArrayList;

public class MyMethod {
    public String[] addMember(String n1, String n2, String n3) {
        String [] arr = new String[3];
        arr[0]= n1;
        arr[1]= n2;
        arr[2]= n3;
        return arr;
    }

    public ArrayList<String> addUser(String n1, String n2, String n3) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        return list;
    }

}
