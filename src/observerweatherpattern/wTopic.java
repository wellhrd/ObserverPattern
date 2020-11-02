//Concrete class for Weather Subject class

package observerweatherpattern;

import java.util.ArrayList;

public class wTopic implements wSubject {
    
    private ArrayList<wObserver> observers;
    private String message;
    private boolean changed;
    
    private final Object MUTEX = new Object();
    
    //Default constructor
    wTopic(){
        this.observers = new ArrayList<wObserver>();
    }

    @Override
    public void attach(wObserver user) {
        //Check if object is passed to be attached / register
        if (user == null) throw new NullPointerException("No user to add");
        
        synchronized (MUTEX) {
            //prevents duplicating users
            if (!observers.contains(user) ) observers.add(user);
        }
    }

    @Override
    public void detach(wObserver user) {
        synchronized (MUTEX) {
            observers.remove(user);
        }
    }

    @Override
    public void notifyObservers() {
        ArrayList<wObserver> observersLocal = null;
        
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (wObserver obj: observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(wObserver user) {
        return this.message;
    }
    
    public String sendMessage (String message) {
        System.out.println("The messaged have been posted: " + message + "\n");
        this.message = message;
        this.changed= true;
        notifyObservers();
        return message; //Test for void add in String
    }
    
}
