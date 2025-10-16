package fr.saurfort.moredisc;

import fr.saurfort.moredisc.item.ModItem;
import fr.saurfort.moredisc.item.ModItemCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDisc.MODID);

    public static final RegistryObject<CreativeModeTab> MORE_DISC = TABS.register("moredisc", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .title(Component.translatable("itemGroup.moredisc"))
            .icon(() -> ModItemCraft.BLANK_DISC.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                ModItem.DISC.getEntries().forEach(registryObject -> output.accept(registryObject.get()));
            }).build());
}
