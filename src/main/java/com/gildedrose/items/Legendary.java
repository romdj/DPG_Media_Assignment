package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdater;

public class Legendary extends ItemUpdater {

	public Legendary(Item item) {
		super(item);
	}

	@Override
	protected int adjustQuantity() {
		return 0;
	}

	@Override
	public void adjustSellIn() {
	}
}
