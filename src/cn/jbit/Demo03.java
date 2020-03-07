package cn.jbit;

/**
 * 练习三
 * @author xiehongjian
 * @create 2020-02-28 10:54
 */
public class Demo03 {
    public static void main(String[] args) {
        for(int j = 1; j < 10; j++){
            for(int i = 1; i <= j; i++){
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
