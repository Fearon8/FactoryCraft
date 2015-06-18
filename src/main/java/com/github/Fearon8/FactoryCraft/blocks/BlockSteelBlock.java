package com.github.Fearon8.FactoryCraft.blocks;

import com.github.Fearon8.FactoryCraft.help.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSteelBlock extends Block
{
	public BlockSteelBlock()
    {
            super(Material.iron);
            setBlockName("SteelBlock");
            setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
            setCreativeTab(CreativeTabs.tabBlock); 
    }

}
