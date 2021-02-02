package theencapsulation;

public class Trypolymorphism {
	public static void main(String[] args) {
		polymorphism p = new polymorphism();
		Overwritten o = new Overwritten();
		Overwrittensquared o2 = new Overwrittensquared();
		p.anymethod();
		o.anymethod();
		o2.anymethod();
	}

}
