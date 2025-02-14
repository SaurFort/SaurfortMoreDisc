package fr.saurfort.moredisc.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class StructureLootModifier extends LootModifier {
    public static final Supplier<Codec<StructureLootModifier>> CODEC =
            Suppliers.memoize(() -> RecordCodecBuilder.create(inst -> codecStart(inst)
                    .and(ForgeRegistries.ITEMS.getCodec().fieldOf("addition").forGetter(modifier -> modifier.addition))
                    .and(Codec.FLOAT.fieldOf("probability").forGetter(modifier -> modifier.probability))
                    .apply(inst, StructureLootModifier::new)
    ));

    private final Item addition;
    private final float probability;

    public StructureLootModifier(LootItemCondition[] conditionsIn, Item item, float probability) {
        super(conditionsIn);
        this.addition = item;
        this.probability = probability;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> objectArrayList, LootContext lootContext) {
        if (lootContext.getRandom().nextFloat() < probability) {
            objectArrayList.add(new ItemStack(addition, 1));
        }

        return objectArrayList;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return CODEC.get();
    }
}
