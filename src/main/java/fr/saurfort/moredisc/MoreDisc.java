package fr.saurfort.moredisc;

import fr.saurfort.moredisc.proxy.CommonProxy;
import fr.saurfort.moredisc.tabs.CsTab;
import fr.saurfort.moredisc.tabs.NcsTabs;
import fr.saurfort.moredisc.utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class MoreDisc {
    @Mod.Instance(Reference.MOD_ID)
    public static MoreDisc instance;

    public static final CreativeTabs NCS_TAB = new NcsTabs("ncs");
    public static final CreativeTabs CS_TAB = new CsTab("cs");


    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
    public static CommonProxy proxy;

    public static org.apache.logging.log4j.Logger logger;


    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e) {
        logger = e.getModLog();

        proxy.preInit();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e) {

    }
}
