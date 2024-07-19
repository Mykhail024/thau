package thau;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import thau.blocks.ThaulitBlock;
import thau.blocks.ThaulitOre;
import thau.blocks.TinBlock;
import thau.blocks.TinOre;

public final class BlocksHandler {
	private BlocksHandler() {}
	
	//Blocks
	public static final Block TIN_ORE = new TinOre();
	public static final Block TIN_BLOCK = new TinBlock();
	public static final Block THAULIT_ORE = new ThaulitOre();
	public static final Block THAULIT_BLOCK = new ThaulitBlock();
	
	//Registers
	public static void initialize() {
		register(TIN_ORE, "tin_ore", true);
		register(TIN_BLOCK, "tin_block", true);
		register(THAULIT_ORE, "thaulit_ore", true);
		register(THAULIT_BLOCK, "thaulit_block", true);
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
