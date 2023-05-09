package sg.edu.rp.c346.id22021506.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView textViewDisplay;
    Button buttonDisplay;
    EditText editTextInput;

    ToggleButton toggleButton;

    RadioGroup radioGroupGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewDisplay = findViewById(R.id.textviewDisplay);
        buttonDisplay= findViewById(R.id.buttonDisplay);
        editTextInput = findViewById(R.id.editTextInput);
        toggleButton =  findViewById(R.id.toggleButtonEnabled);
        radioGroupGender =  findViewById(R.id.radioGroupGender);

        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringResponse = editTextInput.getText().toString();

                textViewDisplay.setText(stringResponse);



            }
        });
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButton.isChecked()){
                    editTextInput.setEnabled(true);
                }else{
                    editTextInput.setEnabled(false);
                }
            }

            });
        buttonDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String said ="";
                String stringResponse = editTextInput.getText().toString();
                int checkedRadioId = radioGroupGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonMale){
                    said = "he said ";


                }
                else{
                    said = "she said ";

                }
                textViewDisplay.setText(said + stringResponse);
            }
        });





    }
}