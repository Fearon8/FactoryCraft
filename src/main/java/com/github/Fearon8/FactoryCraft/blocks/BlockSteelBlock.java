package com.github.Fearon8.FactoryCraft.blocks;

import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.tabs.ModTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteelBlock extends Block
{ 
	public BlockSteelBlock()
    {
            super(Material.iron);
            setBlockName("SteelBlock");
            setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
            setStepSound(soundTypeMetal);
            setHardness(2.5F);
            setResistance(10.0F);
            setHarvestLevel("pickaxe", 2);
            setCreativeTab(ModTabs.tabFactoryCraft);
     }

}
