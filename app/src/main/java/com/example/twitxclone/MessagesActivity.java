package com.example.twitxclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.twitxclone.model.Message;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class MessagesActivity extends AppCompatActivity {

    private final List<Message> messageList = new ArrayList<>();
    private MessageAdapter adapter;

    EditText messageField;
    TextView userTextView;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageField = findViewById(R.id.message_input);
        userTextView = findViewById(R.id.username);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new MessageAdapter(this, messageList);
        listView.setAdapter(adapter);
    }

    public void submitMessage(View view) {
        String message = messageField.getText().toString();
        String username = userTextView.getText().toString();

        Message newMessage = new Message();
        newMessage.setAuthor(username);
        newMessage.setMessage(message);
        newMessage.setPublishedAt(new GregorianCalendar().getTimeInMillis());
//        mDatabase.child(mDatabase.push().getKey()).setValue(newMessage);

        messageField.getText().clear();
    }
}