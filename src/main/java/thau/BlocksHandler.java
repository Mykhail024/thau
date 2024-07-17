package thau;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import thau.blocks.TinOre;

public final class BlocksHandler {
	private BlocksHandler() {}
	
	//Blocks
	public static final Block TIN_ORE = new TinOre();
	
	//Registers
	public static void initialize() {
		register(TIN_ORE, "tin_ore", true);
	}
	
	public static Block register(Block block, String name, boolean shouldRegisterItem) {
		Identifier id = Identifier.of("thau", name);

		if (shouldRegisterItem) {
			BlockItem blockItem = new BlockItem(block, new Item.Settings());
			Registry.register(Registries.ITEM, id, blockItem);
		}

		return Registry.register(Registries.BLOCK, id, block);
	}
}
