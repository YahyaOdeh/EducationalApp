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
    private CheckBox checkBoxQ3A, checkBoxQ3B, checkBoxQ3C, checkBoxQ4A, checkBoxQ4B, checkBoxQ4C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radioQ5Third = findViewById(R.id.third_radio_q5);

        RadioButton radioQ6First = findViewById(R.id.first_radio_q6);

        q1AnswerText = findViewById(R.id.answer_q1_text);

        q2AnswerText = findViewById(R.id.answer_q2_text);

        checkBoxQ3A = findViewById(R.id.checkbox_q3_A);

        checkBoxQ3B = findViewById(R.id.checkbox_q3_B);

        checkBoxQ3C = findViewById(R.id.checkbox_q3_C);

        checkBoxQ4A = findViewById(R.id.checkbox_q4_A);

        checkBoxQ4B = findViewById(R.id.checkbox_q4_B);

        checkBoxQ4C = findViewById(R.id.checkbox_q4_C);

        Button calculate = findViewById(R.id.scoreCalculation);

        calculate.setOnClickListener(v -> {

            if (q1AnswerText.getText().toString().equalsIgnoreCase(getString(R.string.mammal))) {
                scoreCounter++;
            } else {

                Toast.makeText(getApplicationContext(), R.string.warningAtQ1, Toast.LENGTH_SHORT).show();

            }

            if (q2AnswerText.getText().toString().equals(getString(R.string.six))) {
                scoreCounter++;
            } else {

                Toast.makeText(getApplicationContext(), R.string.warningAtQ2, Toast.LENGTH_SHORT).show();

            }

            if (checkBoxQ3A.isChecked() && checkBoxQ3B.isChecked() && !checkBoxQ3C.isChecked()) {
                scoreCounter++;
            } else {

                Toast.makeText(getApplicationContext(), R.string.warningAtQ3, Toast.LENGTH_SHORT).show();

            }

            if (!checkBoxQ4A.isChecked() && checkBoxQ4B.isChecked() && checkBoxQ4C.isChecked()) {
                scoreCounter++;
            } else {

                Toast.makeText(getApplicationContext(), R.string.warningAtq4, Toast.LENGTH_SHORT).show();

            }

            if (radioQ5Third.isChecked()) {
                scoreCounter++;
            } else {

                Toast.makeText(getApplicationContext(), R.string.warningAtQ5, Toast.LENGTH_SHORT).show();

            }

            if (radioQ6First.isChecked()) {
                scoreCounter++;
            } else {

                Toast.makeText(getApplicationContext(), R.string.warningAtQ6, Toast.LENGTH_SHORT).show();

            }

            switch (scoreCounter) {

                case (1):

                case (2):
                    Toast.makeText(getApplicationContext(), getString(R.string.poor_score) + scoreCounter + getString(R.string.try_harder),
                            Toast.LENGTH_SHORT).show();
                    break;

                case (3):

                case (4):
                    Toast.makeText(getApplicationContext(), getString(R.string.not_bad) + scoreCounter + getString(R.string.try_harder),
                            Toast.LENGTH_SHORT).show();
                    break;

                case (5):

                case (6):
                    Toast.makeText(getApplicationContext(), getString(R.string.good_job) + scoreCounter + getString(R.string.you_did_it),
                            Toast.LENGTH_SHORT).show();
                    break;

            }

            scoreCounter = 0;

        });
    }
}