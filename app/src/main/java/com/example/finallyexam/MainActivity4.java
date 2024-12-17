package com.example.finallyexam;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity implements View.OnClickListener, SensorEventListener {
    private SensorManager sensorManager;
    private Sensor sensor;
    private TextView textView_step;
    private Button button_start;
    private int step;
    private double original_value;
    private double last_value;
    private double current_value;
    private boolean motionState=true;
    private boolean processState=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        step=0;
        original_value=0;
        last_value =0;
        current_value =0;

        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        sensor=sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this,sensor,sensorManager.SENSOR_DELAY_UI);

        textView_step=(TextView) findViewById(R.id.textview_step);
        button_start=(Button) findViewById(R.id.btn_start);
        button_start.setOnClickListener(this);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        double range=1; //设置一个精度范围
        float[] value=event.values;
        current_value =magnitude(value[0],value[1],value[2]); //计算当前的模

        //向上加速的状态
        if(motionState==true){
            if (current_value >= last_value)
                last_value = current_value;
            else {
                if(Math.abs(current_value-last_value)>range){
                    original_value=current_value;
                    motionState=false;
                }
            }
        }
        if(motionState==false){
            if (current_value <= last_value)
                last_value = current_value;
            else {
                //检测到一次峰值
                if(Math.abs(current_value-last_value)>range){
                    original_value=current_value;
                    if (processState==true){
                        step++; //检测到开始记录，步数加1
                        if(processState==true){
                            textView_step.setText(step+""); //更新读数
                        }
                    }
                    motionState=true;
                }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
    @Override
    public void onClick(View v) {
        step=0;
        textView_step.setText("0");
        if (processState==true){
            button_start.setText("開始計算");
            processState=false;
        }else{
            button_start.setText("停止計算");
            processState=true;
        }
    }
    private double magnitude(float x, float y, float z) {
        double magnitude=0;
        magnitude=Math.sqrt(x*x+y*y+z*z);
        return magnitude;
    }

}