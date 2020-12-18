package fr.jourboon.orliamod.objects.items;

import fr.jourboon.orliamod.Main;
import fr.jourboon.orliamod.init.ItemInit;
import fr.jourboon.orliamod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSusano extends Item implements IHasModel{
	
	public ItemSusano(String name) {
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
