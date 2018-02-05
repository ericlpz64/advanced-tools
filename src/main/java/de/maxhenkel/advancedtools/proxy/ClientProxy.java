package de.maxhenkel.advancedtools.proxy;

import de.maxhenkel.advancedtools.Main;
import de.maxhenkel.advancedtools.ModItems;
import de.maxhenkel.advancedtools.render.AdvancedToolModel;
import de.maxhenkel.advancedtools.render.base.UniversalModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
 
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);

        ModelLoaderRegistry.registerLoader(new UniversalModel(new AdvancedToolModel(
                new ResourceLocation(Main.MODID, "items/pickaxe/empty_pickaxe"),
                new ResourceLocation(Main.MODID, "items/pickaxe/pickaxe_handle"),
                ModItems.PICKAXE)));

		ModelLoaderRegistry.registerLoader(new UniversalModel(new AdvancedToolModel(
                new ResourceLocation(Main.MODID, "items/axe/empty_axe"),
                new ResourceLocation(Main.MODID, "items/axe/axe_handle"),
                ModItems.AXE)));

        ModelLoaderRegistry.registerLoader(new UniversalModel(new AdvancedToolModel(
                new ResourceLocation(Main.MODID, "items/shovel/empty_shovel"),
                new ResourceLocation(Main.MODID, "items/shovel/shovel_handle"),
                ModItems.SHOVEL)));
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}

}
