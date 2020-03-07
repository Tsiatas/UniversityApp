package com.example.elmepa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TodayMenuList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_menu_list);

       try {
 setFood();
       }
       catch(Exception e){
           Toast.makeText(this,"Something Went Wrong",Toast.LENGTH_SHORT).show();
    }}

    public int findWeek() {

        int numOfWeek;
        Date date = Calendar.getInstance().getTime();
        @SuppressLint("SimpleDateFormat")
        SimpleDateFormat dateFormat = new SimpleDateFormat("www");
        String formattedDate = dateFormat.format(date);
        numOfWeek = Integer.parseInt(formattedDate);
        return numOfWeek;
    }

    public int findDay() {
        int numOfDay;
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(now);
        numOfDay = calendar.get(Calendar.DAY_OF_WEEK);
        return numOfDay;
    }

    void setFood() {

        int numofweek=findWeek();
        TodayMenuList food= new TodayMenuList();



        TextView prwto_geuma = findViewById(R.id.prwtoItem);

        TextView kirios_geuma = findViewById(R.id.kiriosPrwtoItem);
        TextView kiriosSec_geuma = findViewById(R.id.kiriosDefteroItem);
        TextView kiriosThird_geuma=findViewById(R.id.kiriosTritoItem);


        TextView garnitoura_geuma = findViewById(R.id.granitouraItem);


        TextView prwto_deipno = findViewById(R.id.prwtoItemDipno);

        TextView kirios_deipno = findViewById(R.id.kiriosPrwtoItemDipno);
        TextView kiriosSec_deipno=findViewById(R.id.kiriosDefteroItemDipno);
        TextView kiriosThird_deipno=findViewById(R.id.kiriosTritoItemDipno);

        TextView granitoura_deipno = findViewById(R.id.granitouraItemDipno);
        TextView day = findViewById(R.id.day);



                if (numofweek % 2 != 0) {
            switch (findDay()) {
                case 1:

                    day.setText(getResources().getString(R.string.kiriaki));

                    prwto_geuma.setText(getResources().getString(R.string.pkmp));

                    kirios_geuma.setText(getResources().getString(R.string.pkmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.pkmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.pkmk3));


                    garnitoura_geuma.setText(getResources().getString(R.string.pkmg));



                    prwto_deipno.setText(getResources().getString(R.string.pkvp));

                    kirios_deipno.setText(getResources().getString(R.string.pkvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.pkvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.pkvk3));

                    granitoura_deipno.setText(getResources().getString(R.string.pkvg));

                    break;

                case 2:
                    day.setText(getResources().getString(R.string.deftera));

                    prwto_geuma.setText(getResources().getString(R.string.pdmp));


                    kirios_geuma.setText(getResources().getString(R.string.pdmk1));
                    kiriosSec_geuma.setText(R.string.pdmk2);
                    kiriosThird_geuma.setText(R.string.pdmk3);


                    garnitoura_geuma.setText(getResources().getString(R.string.pdmg));


                    prwto_deipno.setText(getResources().getString(R.string.pdvp));

                    kirios_deipno.setText(getResources().getString(R.string.pdvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.pdvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.pdvk3));
                    granitoura_deipno.setText(getResources().getString(R.string.pdvg));

                    break;
                case 3:
                    day.setText(getResources().getString(R.string.triti));

                    prwto_geuma.setText(getResources().getString(R.string.ptmp));

                    kirios_geuma.setText(getResources().getString(R.string.ptmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.ptmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.ptmk3));


                    garnitoura_geuma.setText(getResources().getString(R.string.ptmg));



                    prwto_deipno.setText(getResources().getString(R.string.ptvp));

                    kirios_deipno.setText(getResources().getString(R.string.ptvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.ptvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.ptvk3));


                    granitoura_deipno.setText(getResources().getString(R.string.ptvg));
                    break;
                case 4:
                    day.setText(getResources().getString(R.string.tetarti));

                    prwto_geuma.setText(getResources().getString(R.string.ptetmp));
                    kirios_geuma.setText(getResources().getString(R.string.ptetmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.ptetmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.ptetmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.ptetmg));



                    prwto_deipno.setText(getResources().getString(R.string.ptetvp));

                    kirios_deipno.setText(getResources().getString(R.string.ptetvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.ptetvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.ptetvk3));


                    granitoura_deipno.setText(getResources().getString(R.string.ptetvg));
                    break;
                case 5:
                    day.setText(getResources().getString(R.string.pempti));

                    prwto_geuma.setText(getResources().getString(R.string.ppmp));


                    kirios_geuma.setText(getResources().getString(R.string.ppmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.ppmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.ppmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.ppmg));


                    prwto_deipno.setText(getResources().getString(R.string.ppvp));

                    kirios_deipno.setText(getResources().getString(R.string.ppvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.ppvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.ppvk3));
                    granitoura_deipno.setText(getResources().getString(R.string.ppvg));
                    break;
                case 6:
                    day.setText(getResources().getString(R.string.paraskevi));
                    prwto_geuma.setText(getResources().getString(R.string.pparmp));

                    kirios_geuma.setText(getResources().getString(R.string.pparmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.pparmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.pparmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.pparmg));


                    prwto_deipno.setText(getResources().getString(R.string.pparvp));

                    kirios_deipno.setText(getResources().getString(R.string.pparvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.pparvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.pparvk3));


                    granitoura_deipno.setText(getResources().getString(R.string.pparvg));
                    break;
                case 7:
                    day.setText(getResources().getString(R.string.savvato));
                    prwto_geuma.setText(getResources().getString(R.string.psmp));
                    kirios_geuma.setText(getResources().getString(R.string.psmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.psmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.psmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.psmg));


                    prwto_deipno.setText(getResources().getString(R.string.psvp));

                    kirios_deipno.setText(getResources().getString(R.string.psvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.psvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.psvk3));
                    granitoura_deipno.setText(getResources().getString(R.string.psvg));
                    break;
                default:
                    break;
            }

        } else {
            switch (food.findDay()) {

                case 1:

                    day.setText(getResources().getString(R.string.kiriaki));

                    prwto_geuma.setText(getResources().getString(R.string.dkmp));

                    kirios_geuma.setText(getResources().getString(R.string.dkmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.pkmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.dkmk3));


                    garnitoura_geuma.setText(getResources().getString(R.string.dkmg));



                    prwto_deipno.setText(getResources().getString(R.string.dkvp));

                    kirios_deipno.setText(getResources().getString(R.string.dkvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.dkvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.dkvk3));

                    granitoura_deipno.setText(getResources().getString(R.string.dkvg));

                    break;

                case 2:
                    day.setText(getResources().getString(R.string.deftera));

                    prwto_geuma.setText(getResources().getString(R.string.ddmp));


                    kirios_geuma.setText(getResources().getString(R.string.ddmk1));
                    kiriosSec_geuma.setText(R.string.ddmk2);
                    kiriosThird_geuma.setText(R.string.ddmk3);


                    garnitoura_geuma.setText(getResources().getString(R.string.ddmg));


                    prwto_deipno.setText(getResources().getString(R.string.ddvp));

                    kirios_deipno.setText(getResources().getString(R.string.ddvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.ddvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.ddvk3));
                    granitoura_deipno.setText(getResources().getString(R.string.ddvg));

                    break;
                case 3:
                    day.setText(getResources().getString(R.string.triti));

                    prwto_geuma.setText(getResources().getString(R.string.dtmp));

                    kirios_geuma.setText(getResources().getString(R.string.dtmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.dtmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.dtmk3));


                    garnitoura_geuma.setText(getResources().getString(R.string.dtmg));



                    prwto_deipno.setText(getResources().getString(R.string.dtvp));

                    kirios_deipno.setText(getResources().getString(R.string.dtvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.dtvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.dtvk3));


                    granitoura_deipno.setText(getResources().getString(R.string.dtvg));
                    break;
                case 4:
                    day.setText(getResources().getString(R.string.tetarti));

                    prwto_geuma.setText(getResources().getString(R.string.dtetmp));
                    kirios_geuma.setText(getResources().getString(R.string.ptetmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.dtetmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.dtetmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.dtetmg));



                    prwto_deipno.setText(getResources().getString(R.string.dtetvp));

                    kirios_deipno.setText(getResources().getString(R.string.dtetvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.dtetvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.dtetvk3));


                    granitoura_deipno.setText(getResources().getString(R.string.dtetvg));
                    break;
                case 5:
                    day.setText(getResources().getString(R.string.pempti));

                    prwto_geuma.setText(getResources().getString(R.string.ppmp));


                    kirios_geuma.setText(getResources().getString(R.string.dpmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.dpmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.dpmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.dpmg));


                    prwto_deipno.setText(getResources().getString(R.string.dpvp));

                    kirios_deipno.setText(getResources().getString(R.string.dpvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.dpvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.dpvk3));
                    granitoura_deipno.setText(getResources().getString(R.string.dpvg));
                    break;
                case 6:
                    day.setText(getResources().getString(R.string.paraskevi));
                    prwto_geuma.setText(getResources().getString(R.string.dparmp));

                    kirios_geuma.setText(getResources().getString(R.string.dparmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.dparmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.dparmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.dparmg));


                    prwto_deipno.setText(getResources().getString(R.string.dparvp));

                    kirios_deipno.setText(getResources().getString(R.string.dparvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.dparvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.dparvk3));


                    granitoura_deipno.setText(getResources().getString(R.string.dparvg));
                    break;
                case 7:
                    day.setText(getResources().getString(R.string.savvato));
                    prwto_geuma.setText(getResources().getString(R.string.dsmp));
                    kirios_geuma.setText(getResources().getString(R.string.dsmk1));
                    kiriosSec_geuma.setText(getResources().getString(R.string.dsmk2));
                    kiriosThird_geuma.setText(getResources().getString(R.string.dsmk3));

                    garnitoura_geuma.setText(getResources().getString(R.string.dsmg));


                    prwto_deipno.setText(getResources().getString(R.string.dsvp));

                    kirios_deipno.setText(getResources().getString(R.string.dsvk1));
                    kiriosSec_deipno.setText(getResources().getString(R.string.dsvk2));
                    kiriosThird_deipno.setText(getResources().getString(R.string.dsvk3));
                    granitoura_deipno.setText(getResources().getString(R.string.dsvg));
                    break;
                default:
                    break;
            }


        }




    }


}
