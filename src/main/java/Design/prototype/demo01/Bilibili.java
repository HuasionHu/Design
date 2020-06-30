package Design.prototype.demo01;


import java.util.Date;

/**
 * 客户端： 克隆
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
