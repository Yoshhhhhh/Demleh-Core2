
package net.mcreator.demlehcore.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.demlehcore.creativetab.TabDemleh;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

@ElementsDemlehcoreMod.ModElement.Tag
public class ItemSouffreArmor extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:souffrearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("demlehcore:souffrearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("demlehcore:souffrearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("demlehcore:souffrearmorboots")
	public static final Item boots = null;
	public ItemSouffreArmor(ElementsDemlehcoreMod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SOUFFREARMOR", "demlehcore:ouffre2__", 50, new int[]{4, 6, 8, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2.9f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("souffrearmorhelmet")
				.setRegistryName("souffrearmorhelmet").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("souffrearmorbody")
				.setRegistryName("souffrearmorbody").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("souffrearmorlegs")
				.setRegistryName("souffrearmorlegs").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("souffrearmorboots")
				.setRegistryName("souffrearmorboots").setCreativeTab(TabDemleh.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("demlehcore:souffrearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("demlehcore:souffrearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("demlehcore:souffrearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("demlehcore:souffrearmorboots", "inventory"));
	}
}
