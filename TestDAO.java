import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.*;

public class TestDAO {

	ArrayList<Item> bucket = new ArrayList<Item>();

	@Before
	public void runBeforeEveryTest() {
		for (Integer i = 0; i < 10 ;i++ ) {
			Item item = new Item(i,"hello",i+2,"4");
			bucket.add(item);
		}
	}

	@Test
	public void testAddInBucket() {
		Integer count_before = bucket.size();

		assertTrue(DAO.addItemsInBucket(10,5,bucket));

		assertEquals(count_before, (Integer)(bucket.size()-1));
	}

	@Test
	public void testGetAllItems() {
		// Подключаемся к БД и забираем кол-во наименований
		Integer countItems = 10;

		ArrayList<Item> list = DAO.getAllItems();

		assertNotNull(list);

		assertFalse(list.isEmpty());

		assertEquals(countItems,(Integer)list.size());

	}

	@Test
	public void testGetInfo() {
		String info = DAO.getInfoItemsById(-1);

		assertEquals(info,"");

		info = DAO.getInfoItemsById(10);

		if (info.equals("")) {
			fail("Error");
		}
	}
}
