package android.example.educationalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public int scoreCounter = 0;
    private EditText q1AnswerText, q2AnswerText;
    private CheckBox q3Y, q4N;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton q5Third = findViewById(R.id.third_radio_q5);

        RadioButton q6First = findViewById(R.id.first_radio_q6);

        q1AnswerText = findViewById(R.id.answer_q1_text);

        q2AnswerText = findViewById(R.id.answer_q2_text);

        q3Y = findViewById(R.id.yes_checkbox_q3);

        q4N = findViewById(R.id.no_checkbox_q4);

        Button calculate = findViewById(R.id.scoreCalculation);

        calculate.setOnClickListener(v -> {

            if (q1AnswerText.getText().toString().contains("Binturong") || q1AnswerText.getText().toString().contains("binturong"))
                scoreCounter++;

            if (q2AnswerText.getText().toString().contains("6"))
                scoreCounter++;

            if (q3Y.isChecked())
                scoreCounter++;

            if (q4N.isChecked())
                scoreCounter++;

            if (q5Third.isChecked())
                scoreCounter++;

            if (q6First.isChecked())
                scoreCounter++;

            switch (scoreCounter) {

                case (1):

                case (2):
                    Toast.makeText(getApplicationContext(), "Poor Score of " + scoreCounter + " Try Harder",
                            Toast.LENGTH_SHORT).show();
                    break;

                case (3):

                case (4):
                    Toast.makeText(getApplicationContext(), "Not bad you Scored " + scoreCounter + " But Try Harder",
                            Toast.LENGTH_SHORT).show();
                    break;

                case (5):

                case (6):
                    Toast.makeText(getApplicationContext(), "Good Job you Scored " + scoreCounter + " You did IT!",
                            Toast.LENGTH_SHORT).show();
                    break;

            }

            scoreCounter = 0;

        });
    }

}