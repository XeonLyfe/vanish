package me.fobba.vanish;



import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;


/**
 * Created by 086 on 7/11/2017.
 * Updated by S-B99 on 25/03/19
 * Updated by Dewy on 09/04/2020
 */
@Mod(
        modid = Vanish.MODID,
        name = Vanish.MODNAME,
        version = Vanish.MODVER
)
public class Vanish {

    public static final String MODNAME = "Vanish";
    public static final String MODID = "vanish";
    public static final String MODVER = "v0.0.1"; 
    public static final String MCVER = "1.12.2";

   // public static final String APP_ID = null; //for discord rpc

    public static final Logger log = LogManager.getLogger("Vanish");


    @Mod.Instance
    private static Vanish INSTANCE;
    
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        Display.setTitle(MODNAME + " " + MODVER);
    }
}
