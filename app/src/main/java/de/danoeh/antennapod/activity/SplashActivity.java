package de.danoeh.antennapod.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Creator: vbarad
 * Date: 2016-12-03
 * Project: AntennaPod
 */

public class SplashActivity extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    Context context = this;

    new Handler().postDelayed(new Runnable(){
      @Override
      public void run() {
          Intent intent = new Intent(context, MainActivity.class);
          startActivity(intent);
          finish();
      }
    }, 3000);
  }
}
