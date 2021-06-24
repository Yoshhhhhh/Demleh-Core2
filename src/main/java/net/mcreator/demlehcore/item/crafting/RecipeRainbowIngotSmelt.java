
package net.mcreator.demlehcore.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.demlehcore.item.ItemRainbowIngot;
import net.mcreator.demlehcore.block.BlockRainbowOre;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class RecipeRainbowIngotSmelt extends ElementsDemlehcoreMod.ModElement {
	public RecipeRainbowIngotSmelt(ElementsDemlehcoreMod instance) {
		super(instance, 134);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockRainbowOre.block, (int) (1)), new ItemStack(ItemRainbowIngot.block, (int) (1)), 1F);
	}
}
