package info.partonetrain.tagmutation.init;

import info.partonetrain.tagmutation.TagmutationCore;
import info.partonetrain.tagmutation.container.ConverterContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterContainer {
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, TagmutationCore.MODID);

    public static final RegistryObject<ContainerType<ConverterContainer>> CONVERTER_CONTAINER = CONTAINER_TYPES.register("converter_container", () -> IForgeContainerType.create(ConverterContainer::new));
}
