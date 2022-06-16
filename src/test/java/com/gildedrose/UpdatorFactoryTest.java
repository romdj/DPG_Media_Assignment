package com.gildedrose;

import static org.junit.Assert.*;
import static org.junit.Test;


public class UpdatorFactoryTest {
	@Test
	public void should_get_brie() {
		Item agedBrie = new Item("Aged Brie", 10, 25);

		assertTrue(item instanceof Brie);
	}
}
