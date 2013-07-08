import java.util.*;

public class DAO {
	public static ArrayList<Item> getAllItems() {
		ArrayList<Item> temp =  new ArrayList<Item>();
		// Получаем и формируем список всего товара
		
		Item item = new Item(1,"2",3,"4");
		temp.add(item);
		return temp;
	}
	public static String getInfoItemsById(Integer id) {
		// Получаем значение Info товара по его id
		return new String("hello");
	}

	public static boolean addItemsInOrders(Integer id_user, ArrayList<Item> list) {
		// Добавялем в БД запись о заказе, используя id пользователя и выбранный товар
		return true;
	}
}