package au.net.euclid.modid

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import org.apache.logging.log4j.{LogManager, Logger}

@Mod(ExampleMod.modId)
object ExampleMod {
  final val modId = "examplemod"
  val LOGGER: Logger = LogManager.getLogger(modId)

  // The way to get mod event bus. You can't use Mod.EventBusSubscriber.
  FMLJavaModLoadingContext.get().getModEventBus.addListener(this.init)

  def init(event: FMLCommonSetupEvent): Unit = {
    LOGGER.debug(s"Mod $modId is loaded.")
  }

}
