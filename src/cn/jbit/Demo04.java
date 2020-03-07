package cn.jbit;

/**
 * 练习四
 * @author xiehongjian
 * @create 2020-02-28 10:58
 */
public class Demo04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <=4; k++) {
                    if (i != j && i != k && j != k) {
                        sum++;
                        System.out.println(i * 100 + j * 10 + k);
                    }
                }
            }
        }
        System.out.println("有" + sum + "个无重复的三位数！");
    }
}
