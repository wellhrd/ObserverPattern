
package observerweatherpattern;

/*
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
*/
/**
 * @author Mickael Walters
 */
public class ObserverWeatherPattern {

    public static void main(String[] args) {
        
        
        //GUI START
        WeatherMain TTW = new WeatherMain();
        TTW.setVisible(true);
        //GUI END
        
/*        
        //Create subject
        wTopic topic = new wTopic();
        Scanner input = new Scanner(System.in);
        
        //Variables
        String a,b,c;
        
        System.out.println("Enter Subscriber names: ");
        
        System.out.print("\t Type 1st name here:");
            a = input.next();
        System.out.print("\t Type 2nd name here:");
            b = input.next();
        System.out.print("\t Type 3rd name here:");
            c = input.next();
        
        //Create observers
        wObserver A = new wTopicSubscriber(a);
        wObserver B = new wTopicSubscriber(b);
        wObserver C = new wTopicSubscriber(c);
        
        //Register all obervers to subject
        topic.attach(A);
        topic.attach(B);
        topic.attach(C);
       
        
        //Add observer to subject
        A.setSubject(topic);
        B.setSubject(topic);
        C.setSubject(topic);
        
        //Test for Weather by days
        System.out.println("Select days to see the weather"
                + "\n 1 \t Monday"
                + "\n 2 \t Tuesday"
                + "\n 3 \t Wednesday \n");
        
        System.out.print("Day selection: ");
        int pick = input.nextInt();
        DateFormatSymbols symbols = new DateFormatSymbols();
        Date date = new Date();
        DateFormat full = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        
        switch (pick) {
            case 1:
                System.out.println("\t Monday's weather as at " + full.format(date));
                topic.sendMessage("30% chance of rain 🌧 | 🌫 SSE 10 km/h ");
            break;
            
            case 2: 
                System.out.println("\t Tuesday's weather as at " + full.format(date));
                topic.sendMessage("25 degrees | ⛅ | 🌫  E 5 km/h");
            break;
            
            case 3:
                System.out.println("Wednesday's weather as at " + full.format(date));
                topic.sendMessage("Mostly cloudy ☁☁ | 🌫 NE 12 km/h");
            break;
            
            default:
                System.err.println("Invalid day selecetion in range!");
        }
        
        
        
        
        //Send weather message
        //topic.sendMessage("Today's weather is rainning");
        //topic.sendMessage(null);
        
        
*/        
        
        
        
    }
    
}
