package com.github.Fearon8.FactoryCraft.crafting;

import net.minecraft.item.ItemStack;
import com.github.Fearon8.FactoryCraft.init.ModBlocks;
import com.github.Fearon8.FactoryCraft.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() 
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.SteelBlock), new Object[] 
				{"AAA", "AAA", "AAA", 'A', ModItems.SteelIngot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.SteelIngot, 9), new Object[]
				{new ItemStack(ModBlocks.SteelBlock)});
	}
}
