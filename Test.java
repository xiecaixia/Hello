package alice.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {

    static ArrayList<String> letterHandle(int[] number, int n, String[] table) {
        ArrayList<String> list = new ArrayList<>();

        Queue<String> resList = new LinkedList<>();
        resList.add("");


        while (!resList.isEmpty()) {

            String s = resList.remove();

            if (s.length() == n)
                list.add(s);
            else {
                //获取数组对应的值
                String val = table[number[s.length()]];
                for (int i = 0; i < val.length(); i++) {
                    resList.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }

    static void letterBuilder(int[] number) {

        //先把所有的数字对应的字母放到数组中
        String[] table = {"", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz"};

        ArrayList<String> list =
                letterHandle(number, number.length, table);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }


    public static void main(String args[]) {
        int[] number = {3, 4, 5};

        letterBuilder(number);
    }
}

