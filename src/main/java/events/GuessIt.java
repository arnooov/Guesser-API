package events;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class GuessIt extends ListenerAdapter {
    int chances;
    List<Integer> lst=new ArrayList<Integer>();
    Random random = new Random();

    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        super.onMessageReceived(event);

        String[] st = event.getMessage().getContentRaw().split(" ");

        if (st[0].equals("!guess")) {
            chances=1;
            final int mx = Integer.parseInt(st[1]);
            int nmb = random.nextInt(mx) + 1;
            String number = Integer.toString(nmb);
            lst.add(nmb);
            System.out.println(number);

            int mlt = (random.nextInt(20) + 1) * nmb;
            event.getChannel().sendMessage(":sparkles: *** NUMBER GUESSING GAME *** :sparkles: ").queue();

            if (mx < 3) {
                event.getChannel().sendMessage("ENTER A GREATER NUMBER...").queue();
            } else {
                int l, ct;
                event.getChannel().sendMessage("Guess The Number Between 1 and " + mx).queue();
                ct = 0;
                for (l = 1; l < (nmb + 1); l++) {
                    if (nmb % l == 0) {
                        ct++;
                    }
                }
                event.getChannel().sendMessage("HINTS :-").queue();
                event.getChannel().sendMessage(":one: The Numbers Has " + ct + " Factors Between 1 and " + mx).queue();
                event.getChannel().sendMessage(":two: The Numbers Has " + mlt + " As A Multiple").queue();
            }
        }
                String[] s = event.getMessage().getContentRaw().split(" ");
                System.out.println(Arrays.toString(s));

        if (s[0].equals("!guessed")) {
                System.out.println(lst.get(lst.size()-1));
                int num=lst.get(lst.size()-1);
                    Integer guess = Integer.parseInt(s[1]);
                    event.getChannel().sendMessage("Your Guess :arrow_right: " + guess).queue();
                    if (!guess.equals(num)) {
                        event.getChannel().sendMessage("WRONG GUESS !!").queue();
                        chances++;
                        if (guess>num){
                            event.getChannel().sendMessage("Guess lower :arrow_down: , mate !!").queue();
                        }
                        else {
                            event.getChannel().sendMessage("Guess higher :arrow_up: , mate !!").queue();
                        }
                    }
                    if (guess.equals(num)) {
                        event.getChannel().sendMessage("***You Guessed IT !!*** :tada:").queue();
                        if (chances == 1){
                            event.getChannel().sendMessage("Took You Just "+ chances+" Chance... :sunglasses: ").queue();
                        }
                        else{
                            event.getChannel().sendMessage("Took You A Total Of "+ chances+" Chance(s)... :raised_hands::skin-tone-1: ").queue();
                        }
                        event.getChannel().sendMessage("***THANKS FOR PLAYING *** :heart_decoration: ").queue();
                        lst.clear();
                        chances=1;
                    }

            }
        if (st[0].equals("!give-up")) {
            event.getChannel().sendMessage("The Number Was : "+ lst.get(lst.size()-1)).queue();
            event.getChannel().sendMessage("Better Luck Next Time !!!").queue();
            event.getChannel().sendMessage("***THANKS FOR PLAYING *** :heart_decoration: ").queue();
        }
        if (st[0].equals("!help-me")){
            event.getChannel().sendMessage(":sparkles: *** NUMBER GUESSING GAME *** :sparkles: ").queue();
            event.getChannel().sendMessage(":red_circle: **`!guess`** followed by a number  will start the game with that number setting the range.").queue();
            event.getChannel().sendMessage(":blue_circle: **`!guessed`** followed by a number is the number you guess from the HINTS that you get.").queue();
            event.getChannel().sendMessage(":purple_circle: **`!give-up`** as the command says, you can say this when you give up and want to know the number.").queue();
        }
    }
}
