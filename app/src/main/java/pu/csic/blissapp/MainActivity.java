package pu.csic.blissapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    Connection connect;
    String ConnectionResult="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //設定隱藏標題
        getSupportActionBar().hide();
        //設定隱藏狀態
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);


        Button btn =findViewById(R.id.search);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SearchUI.class);
                startActivity(intent);
            }
        });
    }
    //public void GetTextFromSQL(View v){
        //TextView tx1 = (TextView) findViewById(R.id.tv1);
        //TextView tx2 = (TextView) findViewById(R.id.tv2);

        //try{
            //ConnectionHelper connectionHelper = new ConnectionHelper();
            //connect = connectionHelper.connectionclass();
            //if(connect != null){
                //String query = "Select * from 極樂資料表 Where 電腦序號='3528'";
                //Statement st = connect.createStatement();
                //ResultSet rs = st.executeQuery(query);

                //while (rs.next()){
                    //tx1.setText(rs.getString(1));
                    //tx2.setText(rs.getString(2));
                //}

                //}else{
                //ConnectionResult="Check Connection";
            //}
        //}catch (Exception ex){
//Log.e("error", ex.getMessage());
        //}
    //}
}