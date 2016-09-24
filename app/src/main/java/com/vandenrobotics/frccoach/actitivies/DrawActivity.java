package com.vandenrobotics.frccoach.actitivies;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.vandenrobotics.frccoach.R;
import com.vandenrobotics.frccoach.utilities.ExternalTools;
import com.vandenrobotics.frccoach.views.DrawableView;

public class DrawActivity extends AppCompatActivity {

    private DrawableView strategyDrawableView;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        strategyDrawableView = (DrawableView) findViewById(R.id.stragetyImageView);
        relativeLayout = (RelativeLayout) findViewById(R.id.activity_draw);
    }

    public void Save(View view){
        ExternalTools.saveViewToPictures(relativeLayout, this);
    }

    public void changeColor(View view) {
        if(view == findViewById(R.id.redButton)){
            strategyDrawableView.setDrawColor(Color.RED);
        }
        else if(view == findViewById(R.id.whiteButton)){
            strategyDrawableView.setDrawColor(Color.WHITE);
        }
        else if(view == findViewById(R.id.greenButton)){
            strategyDrawableView.setDrawColor(Color.GREEN);
        }
        else if(view == findViewById(R.id.blueButton)){
            strategyDrawableView.setDrawColor(Color.BLUE);
        }
    }
}
