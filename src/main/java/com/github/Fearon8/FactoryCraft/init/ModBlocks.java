package com.github.Fearon8.FactoryCraft.init;

import com.github.Fearon8.FactoryCraft.blocks.BlockAnthraciteBlock;
import com.github.Fearon8.FactoryCraft.blocks.BlockAnthraciteOre;
import com.github.Fearon8.FactoryCraft.blocks.BlockBlastFurnace;
import com.github.Fearon8.FactoryCraft.blocks.BlockSteelBlock;
import com.github.Fearon8.FactoryCraft.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks {
	public static Block steelBlock = new BlockSteelBlock();
	public static Block anthraciteOre = new BlockAnthraciteOre();
	public static Block anthraciteBlock = new BlockAnthraciteBlock();
	public static Block blastFurnace = new BlockBlastFurnace();
	  public static void init()
      {
            RegisterHelper.registerBlock(steelBlock);
            RegisterHelper.registerBlock(anthraciteOre);
            RegisterHelper.registerBlock(blastFurnace);
            RegisterHelper.registerBlock(anthraciteBlock);
      }

}
