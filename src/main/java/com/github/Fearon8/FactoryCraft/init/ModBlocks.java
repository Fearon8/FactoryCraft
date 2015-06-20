package com.github.Fearon8.FactoryCraft.init;

import com.github.Fearon8.FactoryCraft.blocks.BlockSteelBlock;
import com.github.Fearon8.FactoryCraft.blocks.BlockanthraciteOre;
import com.github.Fearon8.FactoryCraft.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	public static Block steelBlock = new BlockSteelBlock();
	public static Block anthraciteOre = new BlockanthraciteOre();
	  public static void init()
      {
            RegisterHelper.registerBlock(steelBlock);
            RegisterHelper.registerBlock(anthraciteOre);
      }

}
