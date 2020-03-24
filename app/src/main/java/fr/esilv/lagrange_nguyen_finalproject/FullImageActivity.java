package fr.esilv.lagrange_nguyen_finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FullImageActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        // get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        WhichCharacter_Adapter imageAdapter = new WhichCharacter_Adapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.icons[position]);

        TextView character_name = (TextView)findViewById(R.id.character_name);
        TextView description = (TextView)findViewById(R.id.character_description);

        // If the Serena icon is clicked on
        if(position==0){
            character_name.setText(getString(R.string.serena));
            description.setText(getString(R.string.serena_description));
        }

        // If the Blair icon is clicked on
        if(position==1){
            character_name.setText(getString(R.string.blair));
            description.setText(getString(R.string.blair_description));
        }

        // If the Dan icon is clicked on
        if(position==2){
            character_name.setText(getString(R.string.dan));
            description.setText(getString(R.string.dan_description));
        }

        // If the Nate icon is clicked on
        if(position==3){
            character_name.setText(getString(R.string.nate));
            description.setText(getString(R.string.nate_description));
        }

        // If the Chuck icon is clicked on
        if(position==4){
            character_name.setText(getString(R.string.chuck));
            description.setText(getString(R.string.chuck_description));
        }

        // If the Jenny icon is clicked on
        if(position==5){
            character_name.setText(getString(R.string.jenny));
            description.setText(getString(R.string.jenny_description));
        }

        // If the Eric icon is clicked on
        if(position==6){
            character_name.setText(getString(R.string.eric));
            description.setText(getString(R.string.eric_description));
        }

        // If the Vanessa icon is clicked on
        if(position==7){
            character_name.setText(getString(R.string.vanessa));
            description.setText(getString(R.string.vanessa_description));
        }

        // If the Georgina icon is clicked on
        if(position==8){
            character_name.setText(getString(R.string.georgina));
            description.setText(getString(R.string.georgina_description));
        }

        // If the Carter icon is clicked on
        if(position==9){
            character_name.setText(getString(R.string.carter));
            description.setText(getString(R.string.carter_description));
        }

        // If the Lily icon is clicked on
        if(position==10){
            character_name.setText(getString(R.string.lily));
            description.setText(getString(R.string.lily_description));
        }

        // If the Rufus icon is clicked on
        if(position==11){
            character_name.setText(getString(R.string.rufus));
            description.setText(getString(R.string.rufus_description));
        }

        // If the Bart icon is clicked on
        if(position==12){
            character_name.setText(getString(R.string.bart));
            description.setText(getString(R.string.bart_description));
        }

        // If the Eleanor icon is clicked on
        if(position==13){
            character_name.setText(getString(R.string.eleanor));
            description.setText(getString(R.string.eleanor_description));
        }

        // If the Dorota icon is clicked on
        if(position==14){
            character_name.setText(getString(R.string.dorota));
            description.setText(getString(R.string.dorota_description));
        }
    }
}
