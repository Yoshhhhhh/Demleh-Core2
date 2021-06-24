
package net.mcreator.demlehcore.fuel;

import net.minecraft.item.ItemStack;

import net.mcreator.demlehcore.item.ItemMagmaNugget;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class FuelMagmaFuel extends ElementsDemlehcoreMod.ModElement {
	public FuelMagmaFuel(ElementsDemlehcoreMod instance) {
		super(instance, 180);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(ItemMagmaNugget.block, (int) (1)).getItem())
			return 18000;
		return 0;
	}
}
