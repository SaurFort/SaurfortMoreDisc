package fr.saurfort.moredisc.loot;

import com.mojang.serialization.Codec;
import fr.saurfort.moredisc.Reference;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIERS_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, Reference.MOD_ID);

   public static final RegistryObject<Codec<AddItemModifier>> ADD_ITEM = LOOT_MODIFIERS_SERIALIZERS.register("add_item", () -> AddItemModifier.CODEC);

    public static void register(IEventBus bus) {
        LOOT_MODIFIERS_SERIALIZERS.register(bus);
    }
}
