package Design.adapter;


//客户端：想上网，插不上线
public class Computer {
    //我们的电脑需要连接上转接器才可以上网
    public void net(NetToUsb adapter){
        //上网的具体实现 ，找一个转接头
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        //电脑，适配器，网线
        Computer computer = new Computer();//电脑
        AdapterNet adapterNet = new AdapterNet();//
        Adapter2 adapter = new Adapter2(adapterNet);//适配器


        computer.net(adapter);
    }
}
