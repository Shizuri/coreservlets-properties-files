package exercises;

import java.util.Locale;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="rl")
public class RandomLocaleController extends One{

	public Locale getRandomLocale() {
		return(new Locale("mk"));
	}
}
