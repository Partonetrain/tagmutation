package info.partonetrain.tagmutation.init;

import info.partonetrain.tagmutation.TagmutationCore;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = TagmutationCore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegisterContent {

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, TagmutationCore.MODID);


    public static final RegistryObject<Block> CONVERTER_BLOCK = BLOCKS.register("converter", () -> new Block(Block.Properties.create(Material.GLASS).hardnessAndResistance(1.5F, 6.0F).lightValue(0).sound(SoundType.STONE)));


    /*Old way of doing it apparently (?)

    new ConverterBlock(CONVERTER_PROPERTIES).setRegistryName("converter");
    public static Block.Properties CONVERTER_PROPERTIES = Block.Properties.create(Material.GLASS).hardnessAndResistance(1.5F, 6.0F).lightValue(0).sound(SoundType.STONE);

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(CONVERTER_BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            new BlockItem(CONVERTER_BLOCK, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(CONVERTER_BLOCK.getRegistryName())
        );
    }
    */
}
