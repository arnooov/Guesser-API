package events;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageEventListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        super.onMessageReceived(event);
        System.out.println("User sent : "+event.getMessage().getContentRaw());
        String[] st = event.getMessage().getContentRaw().split(" ");
        String wig = """
                wiggle wiggle
                 wiggle wiggle
                  wiggle wiggle
                   wiggle wiggle\s
                     wiggle wiggle
                       wiggle wiggle
                         wiggle wiggle
                            wiggle wiggle
                               wiggle wiggle
                                  wiggle wiggle
                                     wiggle wiggle
                                        wiggle wiggle
                                           wiggle wiggle
                                              wiggle wiggle
                                                 wiggle wiggle
                                                    wiggle wiggle
                                                       wiggle wiggle
                                                         wiggle wiggle
                                                           wiggle wiggle
                                                             wiggle wiggle
                                                              wiggle wiggle
                                                               wiggle wiggle
                                                                wiggle wiggle
                                                                wiggle wiggle
                                                                wiggle wiggle
                                                                wiggle wiggle
                                                               wiggle wiggle
                                                              wiggle wiggle
                                                             wiggle wiggle\s
                                                           wiggle wiggle
                                                         wiggle wiggle
                                                       wiggle wiggle
                                                    wiggle wiggle
                                                 wiggle wiggle
                                              wiggle wiggle
                                           wiggle wiggle
                                        wiggle wiggle
                                     wiggle wiggle
                                  wiggle wiggle
                               wiggle wiggle
                            wiggle wiggle
                         wiggle wiggle\s
                       wiggle wiggle
                     wiggle wiggle
                   wiggle wiggle
                  wiggle wiggle
                 wiggle wiggle
                wiggle wiggle
                """;
        if (st[0].equals("<@1095254565496037506>")){
            event.getChannel().sendMessage("*** Hi!! :wave::skin-tone-1: ***").queue();
            event.getChannel().sendMessage("*** I'm Guesser BOT  :robot: ***").queue();
            event.getChannel().sendMessage("*** I can help you play NUMBER GUESSING GAME ***").queue();
            event.getChannel().sendMessage("*** Enter***  `!help-me` ***to know more... ***").queue();
        }
        else if (st[0].equals("!wiggle")){
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
            event.getChannel().sendMessage(wig).queue();
        }
    }
}