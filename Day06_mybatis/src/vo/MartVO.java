package vo;

public class MartVO {
	private int mart_num;
	private String name;
	private int price;
	private String type;
	private int count;
	
	/////////////////////////////////////////////
	public int getMart_num() {
		return mart_num;
	}

	public void setMart_num(int mart_num) {
		this.mart_num = mart_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "MartVO [name=" + name + ", price=" + price + ", type=" + type + ", count=" + count + "]";
	}
}
