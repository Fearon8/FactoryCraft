package com.github.Fearon8.FactoryCraft.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.github.Fearon8.FactoryCraft.init.ModBlocks;
import com.github.Fearon8.FactoryCraft.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() 
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pureCarbonDust), new Object[]
				{new ItemStack(ModItems.rawCarbonDust), new ItemStack(Items.water_bucket)});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SteelIngot), new Object[]
				{" A ","ABA"," A ",'A',ModItems.pureCarbonDust,'B', Items.iron_ingot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SteelIngot, 9), new Object[]
				{new ItemStack(ModBlocks.steelBlock)});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.steelBlock), new Object[] 
				{"AAA", "AAA", "AAA", 'A', ModItems.SteelIngot});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SteelPickaxe), new Object[]
			    {"AAA"," B ","CBC",'A', ModItems.SteelIngot, 'B', ModItems.handleSteel,'C', Items.slime_ball});
	
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SteelAxe), new Object[]
			    {"AA ","AB ","CBC",'A', ModItems.SteelIngot, 'B', ModItems.handleSteel,'C', Items.slime_ball});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SteelSword), new Object[]
			    {" A "," A ","CBC",'A', ModItems.SteelIngot, 'B', ModItems.handleSteel,'C', Items.slime_ball});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SteelShovel), new Object[]
			    {" A "," B ","CBC",'A', ModItems.SteelIngot, 'B', ModItems.handleSteel,'C', Items.slime_ball});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.handleSteel), new Object[]
	    		{"  A", " A ", "A  ", 'A', ModItems.SteelIngot});
	}
	
}