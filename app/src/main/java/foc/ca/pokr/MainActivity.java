package foc.ca.pokr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ca.foc.pokr.Deck;
import ca.foc.pokr.Hand;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Deck deck = Deck.micholsonStack();
    }

    private static String formatHand(final Hand h, final int players) {
        return h.toString() + ", " + players + " players";
    }

    public void doNothing(final View view) {
        System.out.println(view.getId());
    }

    public void pressKey(final View key) {
        final Button b = (Button) key;
        final TextView t = (TextView)findViewById(R.id.txt1);
        t.setText(t.getText().toString() + b.getText().toString());
    }
}
