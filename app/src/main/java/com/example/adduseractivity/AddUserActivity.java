package com.example.adduseractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddUserActivity extends AppCompatActivity {
    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;
    private Button addUserButton;

    private RadioGroup radioDegreeProgram;
    private RadioButton seRadioButton;
    private RadioButton imRadioButton;
    private RadioButton ceRadioButton;
    private RadioButton eeRadioButton;

//    private CheckBox bcCheckBox;
 //   private CheckBox msCheckBox;
   // private CheckBox lciCheckBox;
    //private CheckBox phdCheckBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        editFirstName = findViewById(R.id.editFirstName);
        editLastName = findViewById(R.id.editLastName);
        editEmail = findViewById(R.id.editEmail);

        addUserButton = findViewById(R.id.addUserButton);

        radioDegreeProgram = findViewById(R.id.radioDegreeProgram);
        ceRadioButton = findViewById(R.id.ceRadioButton);
        seRadioButton = findViewById(R.id.seRadioButton);
        eeRadioButton = findViewById(R.id.eeRadioButton);
        imRadioButton = findViewById(R.id.imRadioButton);

 //       bcCheckBox = findViewById(R.id.bcCheckBox);
 //       msCheckBox = findViewById(R.id.msCheckBox);
 //       lciCheckBox = findViewById(R.id.lciCheckBox);
 //       phdCheckBox = findViewById(R.id.phdCheckBox);
    }

    public void addUser(View view) {
        String firstName = editFirstName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email = editEmail.getText().toString();
        int selectedId = radioDegreeProgram.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(selectedId);
        String major = radioButton.getText().toString();
        String degree = "";

        User user = new User(firstName, lastName, email, major, degree);
        UserStorage.getInstance().addUser(user,this);

        finish();
    }
    }

