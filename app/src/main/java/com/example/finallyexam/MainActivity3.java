package com.example.finallyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText KG,ML,Name;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    int ans=0;
    public void onclick(View view){
        Name=findViewById(R.id.editTextText);
        KG=findViewById(R.id.editTextNumberDecimal3);
        ML=findViewById(R.id.editTextNumberDecimal4);
        result=findViewById(R.id.textView9);
        result.setTextSize(20);
        if(Name.getText().toString().isEmpty()||KG.getText().toString().isEmpty()||ML.getText().toString().isEmpty()){
            result.setText("您有資料未輸入，請確認好再按送出");
        }
        else{
            int KG1=Integer.valueOf(KG.getText().toString());
            int ML1=Integer.valueOf(ML.getText().toString());
            int low=KG1*30;
            int hi=KG1*40;
            ans+=ML1;

            if(ans>=low &&ans<=hi){
                ML.setText("");
                result.setText("您當下喝了"+ML1+"毫升的水\n目前喝水量為"+ans+"毫升\n您已經達到今天的目標水量了");
            }
            if(ans<low){
                ML.setText("");
                result.setText("您當下喝了"+ML1+"毫升的水\n目前喝水量為"+ans+"毫升\n您還差"+(low-ans)+"毫升就達到今天的目標水量了");
            }
            if(ans>hi){
                ML.setText("");
                result.setText("您當下喝了"+ML1+"毫升的水\n目前喝水量為"+ans+"毫升\n您已經超過今天的目標水量"+(ans-hi)+"毫升");
            }
        }

    }
}