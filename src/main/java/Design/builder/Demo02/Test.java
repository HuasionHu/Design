package Design.builder.Demo02;

public class Test {
    public static void main(String[] args) {
        //服务员
        Worker worker = new Worker();
        //链式编程
        Product product = worker.buildA("全家桶").buildB("雪碧").getProduct();
        System.out.println(product.toString());
    }
}
