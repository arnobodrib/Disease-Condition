package mylocation.example.diseaseandcondition;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.BreakIterator;

public class Chestpain extends AppCompatActivity {
    Spinner Sitedrop,Onsetdrop,characterdrop,radiationdrop,associatedrop,timingdrop,exacerbatingdrop,severitydrop,causedrop;
    Button button;
    String[] listItems;
    boolean[] Spinner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chestpain);





        Sitedrop = (Spinner) findViewById(R.id.sitedrop);
        Onsetdrop = (Spinner) findViewById(R.id.onsetdrop);
        characterdrop = (Spinner) findViewById(R.id.characterdrop);
        radiationdrop = (Spinner) findViewById(R.id.radiationdrop);
        associatedrop = (Spinner) findViewById(R.id.associatedrop);
        timingdrop = (Spinner) findViewById(R.id.timingdrop);
        exacerbatingdrop = (Spinner) findViewById(R.id.exacerbatingdrop);
        severitydrop = (Spinner) findViewById(R.id.severitydrop);
        causedrop = (Spinner) findViewById(R.id.causedrop);

        button = (Button) findViewById(R.id.continuebtn);


        String txtFromSpinner1 = Sitedrop.getSelectedItem().toString();
        String txtFromSpinner2 = Onsetdrop.getSelectedItem().toString();
        String txtFromSpinner3 = characterdrop.getSelectedItem().toString();
        String txtFromSpinner4 = radiationdrop.getSelectedItem().toString();
        String txtFromSpinner5 = associatedrop.getSelectedItem().toString();
        String txtFromSpinner6 = timingdrop.getSelectedItem().toString();
        String txtFromSpinner7 = exacerbatingdrop.getSelectedItem().toString();
        String txtFromSpinner8 = severitydrop.getSelectedItem().toString();
        String txtFromSpinner9 = causedrop.getSelectedItem().toString();









        if (txtFromSpinner1.equals("Retrosternal")&& txtFromSpinner2.equals("Intensity over 1-2 minutes")&&
                txtFromSpinner3.equals("Heavy") && txtFromSpinner4.equals("Epigastrium")&& txtFromSpinner5.equals("Breathlessness")&&
                txtFromSpinner6.equals("Intermittent")&& txtFromSpinner7.equals("Trigered by Emotion")&& txtFromSpinner8.equals("Mild to Moderate")
                && txtFromSpinner9.equals("Aortic Stenosis"));







        {

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Intent intent=new Intent(Chestpain.this,Angina.class);
                    startActivity(intent);
                }
            });



        } }




}
