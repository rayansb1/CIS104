
public class Prodect {
private String name;
private double price;
public Prodect(String nn, double pp) {
	name=nn;
	price=pp;
}
public Prodect(Prodect pp) {
	this.name=(pp.name);
	this.price=(pp.price);
}
public String getName() {
	return name;
}
@Override
public String toString() {
	return "Prodect [name=" + name + ", price=" + price + "]";
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
}
