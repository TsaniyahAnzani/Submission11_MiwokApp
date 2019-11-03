package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class PhrasesActivity extends AppCompatActivity {   @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.word_list);

    // Create a list of words
    ArrayList<Word> words = new ArrayList<Word>();
    words.add(new Word("Where are you going?", "minto wuksus"));
    words.add(new Word("What is your name?", "tinnÓ™ oyaase'nÓ™"));
    words.add(new Word("My name is...", "oyaaset..."));
    words.add(new Word("How are you feeling?", "michÓ™ksÓ™s?"));
    words.add(new Word("Iâ€™m feeling good.", "kuchi achit"));
    words.add(new Word("Are you coming?", "Ó™Ó™nÓ™s'aa?"));
    words.add(new Word("Yes, Iâ€™m coming.", "hÓ™Ó™â€™ Ó™Ó™nÓ™m"));
    words.add(new Word("Iâ€™m coming.", "Ó™Ó™nÓ™m"));
    words.add(new Word("Letâ€™s go.", "yoowutis"));
    words.add(new Word("Come here.", "Ó™nni'nem"));

    // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
    // adapter knows how to create list items for each item in the list.
    WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
    // There should be a {@link ListView} with the view ID called list, which is declared in the
    // word_list.xml layout file.
    ListView listView = (ListView) findViewById(R.id.list);

    // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
    // {@link ListView} will display list items for each {@link Word} in the list.
    listView.setAdapter(adapter);
}
}
