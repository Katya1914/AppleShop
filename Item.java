public class Item {
	// id товара из БД
	private Integer id_item;

	private String name_item;
	//Характеристика товара
	private String info_item;

	private Integer price_item;
	// Категория товара
	private String category_item;

	public Integer Get_id() {
		return id_item;
	}
	public String Get_name() {
		return name_item;
	}
	public String Get_info() {
		return info_item;
	}
	public Integer Get_price() {
		return price_item;
	}
	public String Get_category() {
		return category_item;
	}
}