package thau.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class TinOre extends Block {
	public TinOre() {
		super(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE));
	}
}
