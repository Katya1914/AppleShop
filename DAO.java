import java.util.*;

public class DAO {
	public static ArrayList<Item> getAllItems() {
		ArrayList<Item> temp =  new ArrayList<Item>();
		// Получаем и формируем список всего товара
		for (Integer i = 0; i < 10 ;i++ ) {
			Item item = new Item(i,"hello",i+2,"4");
			temp.add(item);
		}
		return temp;
	}
	public static String getInfoItemsById(Integer id_item) {
		// Получаем значение Info товара по его id
		
			return new String("");
		
	}

	// 
	public static boolean addItemsInBucket(Integer id_item, Integer count_item, ArrayList<Item> bucket) {
		Item new_item = new Item(id_item,"4",9,"6");
		bucket.add(new_item);
		return true;
	}
}