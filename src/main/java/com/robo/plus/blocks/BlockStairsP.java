package com.robo.plus.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockStairsP extends BlockStairs {

	public BlockStairsP(String name, Block block, int meta) {
		super(block, meta);
		this.setBlockName(name);
		this.useNeighborBrightness = true;
	}

}
