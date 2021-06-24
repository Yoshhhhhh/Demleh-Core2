
package net.mcreator.demlehcore.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.demlehcore.item.ItemEbonite;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class TabDemleh extends ElementsDemlehcoreMod.ModElement {
	public TabDemleh(ElementsDemlehcoreMod instance) {
		super(instance, 141);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabdemleh") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemEbonite.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
