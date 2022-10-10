package fr.saurfort.moredisc.item;

import fr.saurfort.moredisc.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

public class ModItemTabs {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> NCS = ITEMS.register("ncs_logo", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CS = ITEMS.register("cs_logo", () -> new Item(new Item.Properties().stacksTo(1)));
}
