
package net.mcreator.demlehcore.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.demlehcore.item.ItemMinium;
import net.mcreator.demlehcore.block.BlockMiniumOre;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class RecipeMiniumcraft extends ElementsDemlehcoreMod.ModElement {
	public RecipeMiniumcraft(ElementsDemlehcoreMod instance) {
		super(instance, 83);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMiniumOre.block, (int) (1)), new ItemStack(ItemMinium.block, (int) (1)), 0F);
	}
}
