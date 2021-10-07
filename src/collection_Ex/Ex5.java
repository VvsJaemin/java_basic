package collection_Ex;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex5 {
    public static void main(String[] args) {
        //Collection
        // 만들어지는 방식 : List, Set, Map
        // 접근하는 방식 : 후입선출 LOFO(push() / pop()), 선입선출 FIFO Queue(offer() / poll())
        System.out.println("=====Stack=======");
        Stack<String> stack = new Stack<>();
        stack.push("루피");
        stack.push("조로");
        stack.push("나미");
        stack.push("상디");

        for (String s : stack) {
            System.out.println(s);
        }

        String name = stack.pop();
        System.out.println(name + "첫번째 pop");

        for (String s : stack) {
            System.out.println(s);
        }

        name = stack.pop();
        System.out.println(name + "두번째 pop");

        for (String s : stack) {
            System.out.println(s);
        }

        System.out.println("=====Queue=====");
        Queue<String> queue = new LinkedList<String>();
        queue.offer("루피");
        queue.offer("조로");
        queue.offer("나미");
        queue.offer("상디");

        for (String s : queue) {
            System.out.println(s);
        }

        String name2 = queue.poll();
        System.out.println(name2 + "첫번쨰 poll()");

        for (String s : queue) {
            System.out.println(s);
        }

         name2 =queue.poll();
        System.out.println(name2 + "두번째 poll()");

        for (String s : queue) {
            System.out.println(s);
        }
    }
}
