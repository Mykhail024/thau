package thau;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import thau.items.RawTin;
import thau.items.TinIngot;

public final class ItemsHandler {
	private ItemsHandler() {}
	
	//Items
	public static final Item TIN_INGOT = new TinIngot();
	public static final Item RAW_TIN = new RawTin();
	
	//Register
    public static void initialize() {
    		register(TIN_INGOT, "tin_ingot");
    		register(RAW_TIN, "raw_tin");
    }
    
    public static Item register(Item instance, String name) {
        return Registry.register(Registries.ITEM, Identifier.of("thau", name), instance);
    }
}
