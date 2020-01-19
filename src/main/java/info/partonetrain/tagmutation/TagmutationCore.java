package info.partonetrain.tagmutation;

import info.partonetrain.tagmutation.init.RegisterContainer;
import info.partonetrain.tagmutation.init.RegisterContent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(TagmutationCore.MODID)
public class TagmutationCore {
    public static final String MODID = "tagmutation";


    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public TagmutationCore() {
        LOGGER.debug("This is Tagmutation!");

        final ModLoadingContext modLoadingContext = ModLoadingContext.get();
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        RegisterContainer.CONTAINER_TYPES.register(modEventBus);
        RegisterContent.BLOCKS.register(modEventBus);


    }


}
