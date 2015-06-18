package com.github.Fearon8.FactoryCraft.items;

import com.github.Fearon8.FactoryCraft.help.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class FactoryCraftItem extends Item 
{
	public FactoryCraftItem()
    {
        super();
        setCreativeTab(CreativeTabs.tabMisc);
    }
	@SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IIconRegister par1IconRegister)
    {
        itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

}
