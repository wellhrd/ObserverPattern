
package observerweatherpattern;

public interface wSubject {
    
    public void attach (wObserver user);
    public void detach (wObserver user);
    public void notifyObservers ();
    
    public Object getUpdate (wObserver user);
}
