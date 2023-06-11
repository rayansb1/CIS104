
public class Prodect {
private String name;
private String type;
private double price;
public Prodect(String nn, String tt, double pp) {
	name=nn;
	type=tt;
	price=pp;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean AddVAT() {
	price+=price*0.15;
	return true;
}
@Override
public String toString() {
	return "Prodect [name=" + name + ", type=" + type + ", price=" + price + "]";
}
public void Display() {
		System.out.println("Prodect [name=" + name + ", type=" + type + ", price=" + price + "]");
	}
}
