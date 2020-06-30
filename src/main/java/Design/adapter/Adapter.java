package Design.adapter;

//1.继承（类适配器 ，单继承）

//真正的适配器 ， 需要连接USB ，连接网线
public class Adapter extends AdapterNet implements NetToUsb {
    public void handleRequest() {
        super.request();//可以上网了
    }
}
