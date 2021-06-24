package net.mcreator.demlehcore.procedure;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.demlehcore.item.ItemEpeeInterdite;
import net.mcreator.demlehcore.ElementsDemlehcoreMod;

import java.util.Random;
import java.util.Map;

@ElementsDemlehcoreMod.ModElement.Tag
public class ProcedureEpeeInterditeProcedure3 extends ElementsDemlehcoreMod.ModElement {
	public ProcedureEpeeInterditeProcedure3(ElementsDemlehcoreMod instance) {
		super(instance, 215);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			System.err.println("Failed to load dependency sourceentity for procedure EpeeInterditeProcedure3!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemEpeeInterdite.block, (int) (1)).getItem())) {
			{
				ItemStack _ist = ((sourceentity instanceof EntityLivingBase)
						? ((EntityLivingBase) sourceentity).getHeldItemMainhand()
						: ItemStack.EMPTY);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setItemDamage(0);
				}
			}
		} else if ((((sourceentity instanceof EntityLivingBase) ? ((EntityLivingBase) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemEpeeInterdite.block, (int) (1)).getItem())) {
			{
				ItemStack _ist = ((sourceentity instanceof EntityLivingBase)
						? ((EntityLivingBase) sourceentity).getHeldItemOffhand()
						: ItemStack.EMPTY);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setItemDamage(0);
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			int i = (int) entity.posX;
			int j = (int) entity.posY;
			int k = (int) entity.posZ;
			World world = entity.world;
			java.util.HashMap<String, Object> dependencies = new java.util.HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
