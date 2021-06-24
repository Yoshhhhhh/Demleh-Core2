
package net.mcreator.demlehcore.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.demlehcore.creativetab.TabDemleh;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Set;
import java.util.HashMap;

@ElementsDemlehcoreMod.ModElement.Tag
public class ItemMiniumPickaxe extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:miniumpickaxe")
	public static final Item block = null;
	public ItemMiniumPickaxe(ElementsDemlehcoreMod instance) {
		super(instance, 34);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("MINIUMPICKAXE", 6, 3000, 12.5f, 2f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 6);
				return ret.keySet();
			}
		}.setUnlocalizedName("miniumpickaxe").setRegistryName("miniumpickaxe").setCreativeTab(TabDemleh.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("demlehcore:miniumpickaxe", "inventory"));
	}
}
