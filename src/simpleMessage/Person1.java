package simpleMessage;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Person1 extends Person{

	@Override
	public String doRegistration() {
		return("success1");
	}

}
