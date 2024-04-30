package RestaurantManager;

import exercises.NegativeIntegerException;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    public void addItem(String item, int qty) {
        if (qty < 0) throw new AddingNegativeIntegerException(item, qty);
        inventory.put(item, qty);
    //Only allow this to be called with a positive quantity
    }

    public <T extends StockItem> T removeItem(int qty) {
        return null;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
