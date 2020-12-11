package fr.jourboon.orliamod.objects.tools;

import fr.jourboon.orliamod.Main;
import fr.jourboon.orliamod.init.ItemInit;
import fr.jourboon.orliamod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class NecrotiquePickaxe extends ItemPickaxe implements IHasModel{

	public NecrotiquePickaxe(String name, ToolMaterial material) {
		super(material);
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
