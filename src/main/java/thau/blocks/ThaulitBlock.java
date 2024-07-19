package thau.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class ThaulitBlock extends Block {
	public ThaulitBlock() {
		super(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK));
	}
}
