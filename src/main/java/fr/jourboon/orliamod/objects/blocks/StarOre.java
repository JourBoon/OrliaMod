package fr.jourboon.orliamod.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StarOre extends BlockBase{
	
	public StarOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(18.0F);
		setResistance(19.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}

}
