package com.gildedrose.items;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdater;

public class Conjured extends ItemUpdater {
    public Conjured(Item item) {
        super(item);
    }
    @Override
    protected int quantityAdjustment() {
        return super.quantityAdjustment() * 2;
    }
}
