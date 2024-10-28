package encasulation;

public class Specs {
	private int price;
	private String color;

	public void setPrice(int price) {
		this.price = price;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;

	}

	public String getdata() {
		return color;
	}

	public static void main(String[] args) {
		Specs sp = new Specs();
		sp.setPrice(2000);
		sp.setColor("white");
		
		System.out.println(sp.getPrice());
		System.out.println(sp.getColor());
		
	}
}
