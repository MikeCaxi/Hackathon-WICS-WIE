package com.example.thelads.giftbasket;

        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.InputType;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.ImageButton;

        import static android.R.id.input;

public class MainActivity extends AppCompatActivity {

    Button addBtn = new Button(this);
    String m_Test;
    EditText input = new EditText(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = (Button) findViewById(R.id.addButton);

        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                EditText name
                m_Test = input.getText().toString();
                Button person = new Button(this);


            }

        });

    }

}
