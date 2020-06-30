package Design.proxy.demo01;

/**
 * 代理模式的好处
 * 1、可以使真实角色的操作更加纯粹！不用去关注一些公共的业务
 * 2、公共业务就交给了代理角色！实现了业务的分工！
 * 3、公共业务发生扩展的时候，方便集中管理！
 *
 * 缺点
 * 一个真实角色就会产生一个代理角色；代码量会翻倍~开发效率会变低
 */
public class Client {
    public static void main(String[] args) {
//        Host host = new Host();
//        host.rent();
        //代理模式
        Host host = new Host();
        //中介帮房东租房子，但是呢，代理一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
