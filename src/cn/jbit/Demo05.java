package cn.jbit;

/**
 * @author xiehongjian
 * @create 2020-02-28 11:07
 */
public class Demo05 {
    public static void main(String[] args) {

        //第一种方法
        int x1 = 10;
        int x2 = x1 + 2;
        int x3 = x2 + 2;
        int x4 = x3 + 2;
        int x5 = x4 + 2;
        System.out.println("第五个人年龄是" + x5);

        System.out.println("=====================");

        //第二种方法
        int x = 10;
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            if(i == 4) {
                sum = x + i * 2;
            }
        }
        System.out.println("第五个人年龄是" + sum);
    }
}
