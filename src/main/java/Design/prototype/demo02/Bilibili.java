package Design.prototype.demo02;


import java.util.Date;

/**
 * Spring Bean： 单例模式 原型模式
 * 原型模式+工厂模式==> new => 原型模式
 *
 */
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {
        //原型对象 v1
        Date date = new Date();
        Video v1 = new Video("Java", date);
        Video v2 = (Video) v1.clone();


        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);

        System.out.println("=====================");



        //v2 克隆 v1
        //Video v2 = new Video("Java1",date);
        date.setTime(222333);
        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);

    }

}
