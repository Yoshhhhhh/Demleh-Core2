
package net.mcreator.demlehcore.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.demlehcore.creativetab.TabDemleh;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Set;
import java.util.HashMap;

@ElementsDemlehcoreMod.ModElement.Tag
public class ItemSouffreShovel extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:souffre_shovel")
	public static final Item block = null;
	public ItemSouffreShovel(ElementsDemlehcoreMod instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("SOUFFRE_SHOVEL", 5, 2500, 11f, 1.5f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 5);
				return ret.keySet();
			}
		}.setUnlocalizedName("souffre_shovel").setRegistryName("souffre_shovel").setCreativeTab(TabDemleh.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("demlehcore:souffre_shovel", "inventory"));
	}
}
