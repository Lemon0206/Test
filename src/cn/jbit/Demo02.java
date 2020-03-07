package cn.jbit;

import java.util.Scanner;

/**
 * 练习二
 * @author xiehongjian
 * @create 2020-02-28 10:48
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入三个数：");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if(x > y) {
            x = x + y;
            y = x - y;
            x = x - y;
        } else if(x > z) {
            x = x + z;
            z = x - z;
            x = x - z;
        } else if(y > z) {
            y = y + z;
            z = y - z;
            y = y - z;
        }

        System.out.println("三个数由小到大的顺序是：" + x + " " + y + " " + z);
    }
}
