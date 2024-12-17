package com.example.finallyexam;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
public class MainActivity5 extends AppCompatActivity {
    TextView tv_p1,tv_p2;

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
    Integer[]CardArray={101,102,103,104,105,106,201,202,203,204,205,206};
    int im101,im102,im103,im104,im105,im106,im201,im202,im203,im204,im205,im206;
    int first,second;
    int fircli,seccli;
    int cardnumber=1;

    int turn=1;
    int pair=0,unpair=6;
    String nowdate1,nowdate2;
    private Chronometer chronometer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        i1=findViewById(R.id.iv11);i2=findViewById(R.id.iv12);i3=findViewById(R.id.iv13);i4=findViewById(R.id.iv14);
        i5=findViewById(R.id.iv15);i6=findViewById(R.id.iv16);i7=findViewById(R.id.iv17);i8=findViewById(R.id.iv18);
        i9=findViewById(R.id.iv19);i10=findViewById(R.id.iv20);i11=findViewById(R.id.iv21);i12=findViewById(R.id.iv22);
        tv_p1=findViewById(R.id.textView);
        tv_p2=findViewById(R.id.textView2);
        chronometer=findViewById(R.id.chronometer);



        i1.setTag("0");i2.setTag("1");i3.setTag("2");i4.setTag("3");
        i5.setTag("4");i6.setTag("5");i7.setTag("6");i8.setTag("7");
        i9.setTag("8");i10.setTag("9");i11.setTag("10");i12.setTag("11");

        frontOfCardsResource();
        Collections.shuffle(Arrays.asList(CardArray));

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i1,theCard);
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i2,theCard);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i3,theCard);
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i4,theCard);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i5,theCard);
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i6,theCard);
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i7,theCard);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i8,theCard);
            }
        });
        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i9,theCard);
            }
        });
        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i10,theCard);
            }
        });
        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i11,theCard);
            }
        });
        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(i12,theCard);
            }
        });

    }
    public void onClick(View view){
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();
        nowdate1 = new SimpleDateFormat("HH:mm:ss").format(new Date());
    }

    public void onClick2(View view){
        chronometer.stop();
        chronometer.setBase(SystemClock.elapsedRealtime());
        Intent intent=new Intent(getApplicationContext(),MainActivity5.class);
        startActivity(intent);
        finish();
    }

    private void doStuff(ImageView iv,int card){
        if(CardArray[card]==101){
            iv.setImageResource(im101);
        }
        else if(CardArray[card]==102){
            iv.setImageResource(im102);
        }
        else if(CardArray[card]==103){
            iv.setImageResource(im103);
        }
        else if(CardArray[card]==104){
            iv.setImageResource(im104);
        }
        else if(CardArray[card]==105){
            iv.setImageResource(im105);
        }
        else if(CardArray[card]==106){
            iv.setImageResource(im106);
        }
        else if(CardArray[card]==201){
            iv.setImageResource(im201);
        }
        else if(CardArray[card]==202){
            iv.setImageResource(im202);
        }
        else if(CardArray[card]==203){
            iv.setImageResource(im203);
        }
        else if(CardArray[card]==204){
            iv.setImageResource(im204);
        }
        else if(CardArray[card]==205){
            iv.setImageResource(im205);
        }
        else if(CardArray[card]==206){
            iv.setImageResource(im206);
        }
        if (cardnumber==1){
            first=CardArray[card];
            if(first>200){
                first=first-100;
            }
            cardnumber=2;
            fircli=card;

            iv.setEnabled(false);
        }
        else if(cardnumber==2)  {
            second=CardArray[card];
            if(second>200){
                second=second-100;
            }
            cardnumber=1;
            seccli=card;

            i1.setEnabled(false);
            i2.setEnabled(false);
            i3.setEnabled(false);
            i4.setEnabled(false);
            i5.setEnabled(false);
            i6.setEnabled(false);
            i7.setEnabled(false);
            i8.setEnabled(false);
            i9.setEnabled(false);
            i10.setEnabled(false);
            i11.setEnabled(false);
            i12.setEnabled(false);

            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }
    private void calculate(){
        if(first==second){
            if(fircli==0){
                i1.setVisibility(View.INVISIBLE);
            }
            else if(fircli==1){
                i2.setVisibility(View.INVISIBLE);
            }
            else if(fircli==2){
                i3.setVisibility(View.INVISIBLE);
            }
            else if(fircli==3){
                i4.setVisibility(View.INVISIBLE);
            }
            else if(fircli==4){
                i5.setVisibility(View.INVISIBLE);
            }
            else if(fircli==5){
                i6.setVisibility(View.INVISIBLE);
            }
            else if(fircli==6){
                i7.setVisibility(View.INVISIBLE);
            }
            else if(fircli==7){
                i8.setVisibility(View.INVISIBLE);
            }
            else if(fircli==8){
                i9.setVisibility(View.INVISIBLE);
            }
            else if(fircli==9){
                i10.setVisibility(View.INVISIBLE);
            }
            else if(fircli==10){
                i11.setVisibility(View.INVISIBLE);
            }
            else if(fircli==11){
                i12.setVisibility(View.INVISIBLE);
            }

            if(seccli==0){
                i1.setVisibility(View.INVISIBLE);
            }
            else if(seccli==1){
                i2.setVisibility(View.INVISIBLE);
            }
            else if(seccli==2){
                i3.setVisibility(View.INVISIBLE);
            }
            else if(seccli==3){
                i4.setVisibility(View.INVISIBLE);
            }
            else if(seccli==4){
                i5.setVisibility(View.INVISIBLE);
            }
            else if(seccli==5){
                i6.setVisibility(View.INVISIBLE);
            }
            else if(seccli==6){
                i7.setVisibility(View.INVISIBLE);
            }
            else if(seccli==7){
                i8.setVisibility(View.INVISIBLE);
            }
            else if(seccli==8){
                i9.setVisibility(View.INVISIBLE);
            }
            else if(seccli==9){
                i10.setVisibility(View.INVISIBLE);
            }
            else if(seccli==10){
                i11.setVisibility(View.INVISIBLE);
            }
            else if(seccli==11){
                i12.setVisibility(View.INVISIBLE);
            }

            if(turn==1){
                pair++;
                unpair--;
                tv_p1.setText("已配對: "+pair);
                tv_p2.setText("未配對: "+unpair);
            }
        } else{
            i1.setImageResource(R.drawable.back);
            i2.setImageResource(R.drawable.back);
            i3.setImageResource(R.drawable.back);
            i4.setImageResource(R.drawable.back);
            i5.setImageResource(R.drawable.back);
            i6.setImageResource(R.drawable.back);
            i7.setImageResource(R.drawable.back);
            i8.setImageResource(R.drawable.back);
            i9.setImageResource(R.drawable.back);
            i10.setImageResource(R.drawable.back);
            i11.setImageResource(R.drawable.back);
            i12.setImageResource(R.drawable.back);


        }
        i1.setEnabled(true);
        i2.setEnabled(true);
        i3.setEnabled(true);
        i4.setEnabled(true);
        i5.setEnabled(true);
        i6.setEnabled(true);
        i7.setEnabled(true);
        i8.setEnabled(true);
        i9.setEnabled(true);
        i10.setEnabled(true);
        i11.setEnabled(true);
        i12.setEnabled(true);
        checkEnd();
    }

    private void checkEnd(){
        if(i1.getVisibility()==View.INVISIBLE&
                i2.getVisibility()==View.INVISIBLE&
                i3.getVisibility()==View.INVISIBLE&
                i4.getVisibility()==View.INVISIBLE&
                i5.getVisibility()==View.INVISIBLE&
                i6.getVisibility()==View.INVISIBLE&
                i7.getVisibility()==View.INVISIBLE&
                i8.getVisibility()==View.INVISIBLE&
                i9.getVisibility()==View.INVISIBLE&
                i10.getVisibility()==View.INVISIBLE&
                i11.getVisibility()==View.INVISIBLE&
                i12.getVisibility()==View.INVISIBLE){
            chronometer.stop();
            nowdate2 = new SimpleDateFormat("HH:mm:ss").format(new Date());
            AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainActivity5.this);
            alertDialogBuilder
                    .setMessage("遊戲結束\n使用時間: "+chronometer.getText().toString()+"\n開始時間: "+nowdate1+"\n結束時間: "+nowdate2)
                    .setCancelable(false)
                    .setPositiveButton("新的一局", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent=new Intent(getApplicationContext(),MainActivity5.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("離開遊戲", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog=alertDialogBuilder.create();
            alertDialog.show();
        }
    }


    private void frontOfCardsResource() {
        im101=R.drawable.image101;
        im102=R.drawable.image102;
        im103=R.drawable.image103;
        im104=R.drawable.image104;
        im105=R.drawable.image105;
        im106=R.drawable.image106;
        im201=R.drawable.image201;
        im202=R.drawable.image202;
        im203=R.drawable.image203;
        im204=R.drawable.image204;
        im205=R.drawable.image205;
        im206=R.drawable.image206;
    }
}