package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CoinPog extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String messageSent = event.getMessage().getContentRaw();
       //retruns a message back to the user
        if(messageSent.equalsIgnoreCase("hello")){
            event.getChannel().sendMessage("Hi, how are you?").queue();
        }
        if(messageSent.equalsIgnoreCase("hi")){
            event.getChannel().sendMessage("hi").queue();
        }
    }
}
