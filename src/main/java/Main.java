import events.CoinPog;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    public static JDA jda;
    //login token for discord
    public static void main(String[] args) {
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODE3MjI4NzU4NzEyNTgyMTc1.YEGdlw.oiIx8rYOlh_F6LlDwG-KrirBLII");

        try {
            jda = jdaBuilder.build();
        } catch (LoginException e){
            e.printStackTrace();
        }
        //Shows status on discord and the activity.
        jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
        jda.getPresence().setActivity(Activity.playing("Pogging"));

        jda.addEventListener(new CoinPog());
    }
}
