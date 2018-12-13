package com.it3.missingparts;

import com.it3.missingparts.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MissingParts.MODID, name = MissingParts.MODNAME, version = MissingParts.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class MissingParts {

    public static final String MODID = "missingparts";
    public static final String MODNAME = "Missing Parts";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "com.it3.missingparts.proxy.ClientProxy", serverSide = "com.it3.missingparts.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs( "Missing Parts") {
        @Override
        public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.blockFastFurnace);   }
    };

    @Mod.Instance
    public static MissingParts instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}