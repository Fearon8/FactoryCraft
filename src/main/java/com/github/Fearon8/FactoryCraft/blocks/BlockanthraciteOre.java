package com.github.Fearon8.FactoryCraft.blocks;

import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockanthraciteOre extends Block
{
	public BlockanthraciteOre() 
	 {
	       super(Material.iron);
	       setBlockName("anthraciteOre");
           setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
           setStepSound(soundTypeStone);
           setHardness(2.0F);
           setResistance(9.0F);
           setHarvestLevel("pickaxe", 2);
           setCreativeTab(ModTabs.tabFactoryCraft);
	 }
}