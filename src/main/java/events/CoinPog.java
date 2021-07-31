package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CoinPog extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String messageSent = event.getMessage().getContentRaw();
        if(messageSent.equalsIgnoreCase("hello")){
            event.getChannel().sendMessage("Hi tuna").queue();
        }
        if(messageSent.equalsIgnoreCase("hi")){
            event.getChannel().sendMessage("hi").queue();
        }
    }
}
