package exercises;

import java.util.Locale;
import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="rl")
public class RandomLocaleController extends One{

	public Locale getRandomLocale() {
		Random r = new Random();
		int result = r.nextInt(3);
		System.out.println("Result is: " + result);
		if(result == 0) {
			return(new Locale("en"));
		} else if (result == 1) {
			return(new Locale("es"));
		} else {
			return(new Locale("mk"));
		}
	}
}
