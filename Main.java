import java.util.*;

public class Main {
	public static void main(String[] args) {
		Integer id_user = 111;
		ArrayList<Item> list = DAO.getAllItems();
		System.out.println(list.get(0).get_name());

		System.out.println(DAO.getInfoItemsById(12));
	}
}