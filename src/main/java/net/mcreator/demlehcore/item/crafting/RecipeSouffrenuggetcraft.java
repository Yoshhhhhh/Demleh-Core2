
package net.mcreator.demlehcore.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.demlehcore.item.ItemSouffreNugget;
import net.mcreator.demlehcore.block.BlockSouffre;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class RecipeSouffrenuggetcraft extends ElementsDemlehcoreMod.ModElement {
	public RecipeSouffrenuggetcraft(ElementsDemlehcoreMod instance) {
		super(instance, 82);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSouffre.block, (int) (1)), new ItemStack(ItemSouffreNugget.block, (int) (1)), 0F);
	}
}
