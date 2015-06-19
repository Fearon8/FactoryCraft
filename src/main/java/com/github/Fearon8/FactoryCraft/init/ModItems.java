package com.github.Fearon8.FactoryCraft.init;

import com.github.Fearon8.FactoryCraft.help.RegisterHelper;
import com.github.Fearon8.FactoryCraft.items.FactoryCraftItem;

import net.minecraft.item.Item;

public class ModItems {
	
	public static Item SteelIngot = new FactoryCraftItem().setUnlocalizedName("SteelIngot");
	
		public static void init()
     {
		 RegisterHelper.registerItem(SteelIngot);
     }
}
