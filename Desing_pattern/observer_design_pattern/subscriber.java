package Desing_pattern.observer_design_pattern;


class Subscriber implements Observer{

    private String name;
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String channelName,String VedioTitle){
        System.out.println(name + "got notification : " + channelName + "Uploaded" + VedioTitle);
    }

    
}

class NonSubscriber implements Observer {
    private int vesitorId;

    public NonSubscriber(int vesitorId){
        this.vesitorId = vesitorId;
    }

    @Override
    public void update(String chanelName,String vedioTitle){
        System.out.println("visitor" +vesitorId + "saw trendind vedio" + vedioTitle);
    }

    
}
