public class Item {

	// id товара из БД
	private Integer id_item;

	private String name_item;
	//Характеристика товара
	private String info_item;

	private Integer price_item;
	// Категория товара
	private String category_item;


	public Item(Integer id, String name, Integer price, String category) {
		id_item = id;
		name_item = name;
		info_item = null;
		price_item = price;
		category_item = category;
	}

	public Integer get_id() {
		return id_item;
	}
	public String get_name() {
		return name_item;
	}
	public String get_info() {
		return info_item;
	}
	public Integer get_price() {
		return price_item;
	}
	public String get_category() {
		return category_item;
	}
	public void set_info(String info) {
		info_item = info;
	}
}