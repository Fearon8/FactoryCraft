package com.github.Fearon8.FactoryCraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.init.ModItems;
import com.github.Fearon8.FactoryCraft.tabs.ModTabs;


public class BlockAnthraciteBlock extends Block 
{
	public BlockAnthraciteBlock()
         {
           super(Material.iron);
           setBlockName("anthraciteBlock");
           setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
           setStepSound(soundTypeMetal);
           setHardness(2.5F);
           setResistance(10.0F);
           setHarvestLevel("axe", 3);
           setCreativeTab(ModTabs.tabFactoryCraft);
         }
	
	public Item getItemDropped(int metadata, Random random, int fortune) 
        {
		    return ModItems.rawCarbonDust;
		}   

    public int quantityDropped(Random par1Random)
        {
            return 4;
        }	
}
