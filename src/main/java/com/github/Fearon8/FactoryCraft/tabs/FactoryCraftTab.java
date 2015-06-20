package com.github.Fearon8.FactoryCraft.tabs;

import com.github.Fearon8.FactoryCraft.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FactoryCraftTab extends CreativeTabs
{
    String name;
    
    public FactoryCraftTab(int par1, String par2Str)
    {
        super(par1, par2Str);
        this.name = par2Str;
    }
    
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        if (this.name == "tabFactoryCraft") 
        {
            return ModItems.SteelIngot;
        }
		return null; 
    
    }
}