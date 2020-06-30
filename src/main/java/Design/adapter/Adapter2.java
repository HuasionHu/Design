package Design.adapter;

//2.组合（对象适配器：常用）

public class Adapter2 implements NetToUsb{
    private AdapterNet adapterNet;

    public Adapter2(AdapterNet adapterNet) {
        this.adapterNet = adapterNet;
    }

    public void handleRequest() {
        adapterNet.request();//可以上网了

    }
}
