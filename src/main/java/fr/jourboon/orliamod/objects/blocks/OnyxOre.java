package fr.jourboon.orliamod.objects.blocks;

import fr.jourboon.orliamod.init.BlockInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class OnyxOre extends BlockBase{
	public OnyxOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(8.0F);
		setResistance(18.0F);
		setHarvestLevel("pickaxe", 2);
		
		
	}
}
