package com.github.Fearon8.FactoryCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.tabs.ModTabs;

public class BlockBlastFurnace extends Block
{
	public BlockBlastFurnace()
    {
           super(Material.iron);
           setBlockName("blastFurnace");
           setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
           setStepSound(soundTypeMetal);
           setHardness(2.5F);
           setResistance(10.0F);
           setHarvestLevel("pickaxe", 2);
           setCreativeTab(ModTabs.tabFactoryCraft);
    }
	
	
}
