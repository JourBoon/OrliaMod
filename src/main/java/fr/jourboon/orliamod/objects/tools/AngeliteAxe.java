package fr.jourboon.orliamod.objects.tools;

import fr.jourboon.orliamod.Main;
import fr.jourboon.orliamod.init.ItemInit;
import fr.jourboon.orliamod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class AngeliteAxe extends ItemAxe implements IHasModel {
	
	public AngeliteAxe(String name, ToolMaterial material) {
		super(material, 9.5F , 1.0F);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}