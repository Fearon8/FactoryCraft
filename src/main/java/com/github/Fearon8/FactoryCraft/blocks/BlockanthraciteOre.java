package com.github.Fearon8.FactoryCraft.blocks;

import java.util.Random;

import com.github.Fearon8.FactoryCraft.help.Reference;
import com.github.Fearon8.FactoryCraft.init.ModItems;
import com.github.Fearon8.FactoryCraft.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.World;

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
	
	public Item getItemDropped(int metadata, Random random, int fortune) 
	    {
           return ModItems.anthracite;
        }
	
	 public int quantityDropped(Random par1Random)
	    {
	       return 1 + par1Random.nextInt(4);
	    }
        
	 public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
	    {
		   this.dropXpOnBlockBreak(par1World, par2, par3, par4, 1);
		}
}