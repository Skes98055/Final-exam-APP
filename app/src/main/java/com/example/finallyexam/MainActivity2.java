package com.example.finallyexam;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Switch aSwitch;
    TextView type;
    EditText weight,height;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        type=findViewById(R.id.textView6);
        aSwitch=findViewById(R.id.switch1);
        ans=findViewById(R.id.textView5);
        ans.setTextSize(20);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                type.setText(b?"新式":"舊式");
                Toast.makeText(MainActivity2.this,"BMI計算方法:"+type.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void button(View view){
        weight=findViewById(R.id.editTextNumberDecimal);
        height=findViewById(R.id.editTextNumberDecimal2);
        if(weight.getText().toString().isEmpty()||height.getText().toString().isEmpty()){
            ans.setText("您有資料未輸入，請確認好再按計算");
        }
        else{
            if(aSwitch.isChecked()){
                double weight1=Double.valueOf(weight.getText().toString());
                double height1=Double.valueOf(height.getText().toString());
                double bmi=Math.round(((weight1*1.3)/(height1/100*2.5))*10.0)/10.0;
                if(bmi<18.5){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:過輕");
                }
                if(bmi>=18.5&bmi<24){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:正常");
                }
                if(bmi>=24&bmi<27){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:過重");
                }
                if(bmi>=27&bmi<30){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:輕度肥胖");
                }
                if(bmi>=30&bmi<35){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:中度肥胖");
                }
                if(bmi>=35){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:重度肥胖");
                }
            }
            else{
                double weight1=Double.valueOf(weight.getText().toString());
                double height1=Double.valueOf(height.getText().toString());
                double bmi=Math.round((weight1/(height1/100)/(height1/100))*10.0)/10.0;
                if(bmi<18.5){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:過輕");
                }
                if(bmi>=18.5&bmi<24){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:正常");
                }
                if(bmi>=24&bmi<27){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:過重");
                }
                if(bmi>=27&bmi<30){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:輕度肥胖");
                }
                if(bmi>=30&bmi<35){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:中度肥胖");
                }
                if(bmi>=35){
                    ans.setText("您的BMI值為 "+bmi+"\n\n體位指數:重度肥胖");
                }
            }
        }

    }
}