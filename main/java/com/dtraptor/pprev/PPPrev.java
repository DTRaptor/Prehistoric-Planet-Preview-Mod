package com.dtraptor.pprev;


//all of our fresh imports
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//the @Mod annotation, which allows our mod to be recognised by Forge
@Mod(modid = PPPrev.mod_id, name = PPPrev.name, version = PPPrev.version)

public class PPPrev {
	
	//Variables for the @Mod annotation
	
	public static final String mod_id = "pprev";
	public static final String name = "Prehistoric Planet Preview";
	public static final String version = "1.0.0";
	public static final String mcVersion = "[1.12.2]";
	
	//Logger, that will log events in the mod.
	
	public static final Logger modLogger = LogManager.getLogger(PPPrev.mod_id);
	
	//eventHandler
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		//Gives our logger a message when the mod is initializing...
		modLogger.info(PPPrev.name + " is initializing! Hold on to your butts...");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
