package exception_Ex;

public class Ex3 {
    public static void main(String[] args) {
        MyDao myDao = new MyDao();
        myDao.insert();
    }
}

class MyDao{
    public void insert() {
        try{
            Class.forName("com.gdu.Goodee");
        } catch (ClassNotFoundException e) {
            System.out.println("com.gdu.Goodee라는 클래스가 없습니다. 클래스패스를 확인하세요!");
        }
    }
}