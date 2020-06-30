package Design.bridge;

//桥接模式
public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Computer computer = new Laptop(new Apple());
        computer.info();
        //联想台式机
        Desktop desktop = new Desktop(new Lenovo());
        desktop.info();
    }
}
