
package observerweatherpattern;

public class wTopicSubscriber implements wObserver {
    private final String name;
    private wSubject topic;
    
    //Consructor
    wTopicSubscriber (String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this); //Type-casted
        
        if (msg == null) {
            System.out.println("\t Hello, " + name + " no new weather updates... \n" );
        } 
        else {
            System.out.println("\t Congratuations " + name + ", " + msg + "\n");
        }
    }

    @Override
    public void setSubject(wSubject sub) {
        this.topic = sub;
    }
    
}
