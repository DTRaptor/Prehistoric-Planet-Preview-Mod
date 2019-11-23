package com.dtraptor.pprev.init;

//again, our fresh imports
import com.dtraptor.pprev.PPPrev;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

//Item
@ObjectHolder(PPPrev.mod_id)
public class ModItems {
	
	public static final Item VELOCIRAPTOR_SKULL = null;
	
	@EventBusSubscriber(modid = PPPrev.mod_id)
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(Register<Item> event) {
			final Item[] items = {
					new Item().setRegistryName(PPPrev.mod_id, "velociraptor_skull").setUnlocalizedName(PPPrev.mod_id + "." + "velociraptor_skull").setCreativeTab(CreativeTabs.MISC)
			};

			event.getRegistry().registerAll(items);
		}
		
	}
}
