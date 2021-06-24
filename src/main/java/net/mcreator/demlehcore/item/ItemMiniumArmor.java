
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
public class ItemMiniumArmor extends ElementsDemlehcoreMod.ModElement {
	@GameRegistry.ObjectHolder("demlehcore:miniumarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("demlehcore:miniumarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("demlehcore:miniumarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("demlehcore:miniumarmorboots")
	public static final Item boots = null;
	public ItemMiniumArmor(ElementsDemlehcoreMod instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MINIUMARMOR", "demlehcore:minium__", 55, new int[]{4, 7, 8, 4}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3.4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("miniumarmorhelmet")
				.setRegistryName("miniumarmorhelmet").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("miniumarmorbody")
				.setRegistryName("miniumarmorbody").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("miniumarmorlegs")
				.setRegistryName("miniumarmorlegs").setCreativeTab(TabDemleh.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("miniumarmorboots")
				.setRegistryName("miniumarmorboots").setCreativeTab(TabDemleh.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("demlehcore:miniumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("demlehcore:miniumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("demlehcore:miniumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("demlehcore:miniumarmorboots", "inventory"));
	}
}
