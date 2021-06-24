
package net.mcreator.demlehcore.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.demlehcore.item.ItemEbonite;
import net.mcreator.demlehcore.block.BlockEboniteOre;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class RecipeEbonitecraft extends ElementsDemlehcoreMod.ModElement {
	public RecipeEbonitecraft(ElementsDemlehcoreMod instance) {
		super(instance, 11);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockEboniteOre.block, (int) (1)), new ItemStack(ItemEbonite.block, (int) (1)), 0F);
	}
}
