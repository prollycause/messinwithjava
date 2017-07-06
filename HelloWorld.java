import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {

    	Date now = new Date();
        System.out.println("It is currently " + now);
        
        //   E (day of week): 3E or fewer (in text xxx), >3E (in full text)
        //   M (month): M (in number), MM (in number with leading zero)
        //              3M: (in text xxx), >3M: (in full text full)
        //   h (hour): h, hh (with leading zero)
        //   m (minute)
        //   s (second)
        //   a (AM/PM)
        //   H (hour in 0 to 23)
        //   z (time zone)
        
        SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        System.out.println("Format 1:   " + dateFormatter.format(now));

        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Format 2:   " + dateFormatter.format(now));
        
        dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        System.out.println("Format 3:   " + dateFormatter.format(now));
        
        int bornIn = 1985;
        int year = 2017;
        int myAge = year - bornIn;
        // int year = Calendar.getInstance().get(Calendar.YEAR);
        if (year < 2017 || year > 2017 ) {
        	System.out.println("This wont work.");
        }
        
        System.out.println("I am " + myAge +", meaning I was born in " + bornIn);
    }

}