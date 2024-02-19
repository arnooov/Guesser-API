import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import javax.security.auth.login.LoginException;

public class GuesserAPI {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdab= JDABuilder.createDefault("MTA5NTI1NDU2NTQ5NjAzNzUwNg.GK-xDp.WTkFhP-KZfoT7MCSkvobbrRUBJigUO-Am6ZvO8");
        JDA jda = jdab
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyEventListener(), new GuessIt(), new MessageEventListener())
                .build();
    }
}
