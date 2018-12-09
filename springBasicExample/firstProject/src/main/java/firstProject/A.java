package firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="prototype")
public class A {
	
	
	A(){
		
	}
	@Autowired
	private B b;
	
	
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	private String name ="muni";
	private String value = "pt";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "A [b=" + b + ", name=" + name + ", value=" + value + "]";
	} 

}
