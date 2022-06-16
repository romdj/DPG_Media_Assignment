package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdater;

public class Brie extends ItemUpdater {

	public Brie(Item item) {
		super(item);
	}

	@Override
	protected int quantityAdjustment() {
		return 1;
	}
}
