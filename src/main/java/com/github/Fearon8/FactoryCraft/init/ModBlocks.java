package com.github.Fearon8.FactoryCraft.init;

import com.github.Fearon8.FactoryCraft.blocks.BlockSteelBlock;
import com.github.Fearon8.FactoryCraft.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	public static Block SteelBlock = new BlockSteelBlock();  
	  public static void init()
      {
            RegisterHelper.registerBlock(SteelBlock);
      }

}
