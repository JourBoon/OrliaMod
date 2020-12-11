package fr.jourboon.orliamod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AngeliteBlock extends BlockBase {

	public AngeliteBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(16.0F);
		setResistance(13.0F);
		setHarvestLevel("pickaxe", 3);
		
		
	}
}
