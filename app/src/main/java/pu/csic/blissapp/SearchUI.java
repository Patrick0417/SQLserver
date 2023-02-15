package pu.csic.blissapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_ui);

        //設定隱藏標題
        getSupportActionBar().hide();
        //設定隱藏狀態
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        TextView edt = (TextView) findViewById(R.id.edit);
        Button btn1 = findViewById(R.id.btn);
        TextView t1 = (TextView) findViewById(R.id.t1);
        TextView t2 = (TextView) findViewById(R.id.t2);
        TextView t3 = (TextView) findViewById(R.id.t3);
        TextView t4 = (TextView) findViewById(R.id.t4);
        TextView t5 = (TextView) findViewById(R.id.t5);
        TextView t6 = (TextView) findViewById(R.id.t6);
        TextView t7 = (TextView) findViewById(R.id.t7);
        TextView t8 = (TextView) findViewById(R.id.t8);
        TextView t9 = (TextView) findViewById(R.id.t9);
        TextView t10 = (TextView) findViewById(R.id.t10);
        TextView t11 = (TextView) findViewById(R.id.t11);
        TextView t12 = (TextView) findViewById(R.id.t12);
        TextView t13 = (TextView) findViewById(R.id.t13);
        TextView t14 = (TextView) findViewById(R.id.t14);
        TextView t15 = (TextView) findViewById(R.id.t15);
        TextView t16 = (TextView) findViewById(R.id.t16);
        TextView t17 = (TextView) findViewById(R.id.t17);
        TextView t18 = (TextView) findViewById(R.id.t18);
        TextView t19 = (TextView) findViewById(R.id.t19);
        TextView t20 = (TextView) findViewById(R.id.t20);
        TextView t21 = (TextView) findViewById(R.id.t21);
        TextView t22 = (TextView) findViewById(R.id.t22);
        TextView t23 = (TextView) findViewById(R.id.t23);
        TextView t24 = (TextView) findViewById(R.id.t24);
        TextView t25 = (TextView) findViewById(R.id.t25);
        TextView t26 = (TextView) findViewById(R.id.t26);
        TextView t27 = (TextView) findViewById(R.id.t27);
        TextView t28 = (TextView) findViewById(R.id.t28);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Connection connection = conclass();
                try {


                if(connection != null){
                    String sqlquery = "Select * from 極樂資料表 Where 電腦序號 ='"+edt.getText().toString()+"'";
                    Statement st = connection.createStatement();
                    ResultSet resultSet = st.executeQuery(sqlquery);

                    while (resultSet.next()){
                        t1.setText(resultSet.getString(1));
                        t2.setText(resultSet.getString(2));
                        t3.setText(resultSet.getString(3));
                        t4.setText(resultSet.getString(4));
                        t5.setText(resultSet.getString(5));
                        t6.setText(resultSet.getString(6));
                        t7.setText(resultSet.getString(7));
                        t8.setText(resultSet.getString(8));
                        t9.setText(resultSet.getString(9));
                        t10.setText(resultSet.getString(10));
                        t11.setText(resultSet.getString(11));
                        t12.setText(resultSet.getString(12));
                        t13.setText(resultSet.getString(13));
                        t14.setText(resultSet.getString(14));
                        t15.setText(resultSet.getString(15));
                        t16.setText(resultSet.getString(16));
                        t17.setText(resultSet.getString(17));
                        t18.setText(resultSet.getString(18));
                        t19.setText(resultSet.getString(19));
                        t20.setText(resultSet.getString(20));
                        t21.setText(resultSet.getString(21));
                        t22.setText(resultSet.getString(22));
                        t23.setText(resultSet.getString(23));
                        t24.setText(resultSet.getString(24));
                        t25.setText(resultSet.getString(25));
                        t26.setText(resultSet.getString(26));
                        t27.setText(resultSet.getString(27));
                        t28.setText(resultSet.getString(28));

                    }
                }
            } catch (Exception ex){
                    Log.e("Error",ex.getMessage());
                }
            }
        });
    }
    @SuppressLint("NewApi")
    public Connection conclass() {
        Connection con = null;
        String ip = "10.0.2.2", port = "1433", dbname = "極樂test", un = "sa", pass = "stussy";
        StrictMode.ThreadPolicy tp = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(tp);
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            String ConURL = "jdbc:jtds:sqlserver://" + ip + ":" + port + ";" + "databasename=" + dbname + ";user=" + un + ";password=" + pass + ";";
            con = DriverManager.getConnection(ConURL);
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
        }
        return con;
    }
}


        //try{
            //ConnectionHelper connectionHelper = new ConnectionHelper();
            //connect = connectionHelper.connectionclass();
            //if(connect != null){
                //String query = "Select * from 極樂資料表 Where 電腦序號='3528'";
                //Statement st = connect.createStatement();
                //ResultSet rs = st.executeQuery(query);

                //while (rs.next()){
                    //t1.setText(rs.getString(1));
                    //t2.setText(rs.getString(2));
                    //t3.setText(rs.getString(3));
                    //t4.setText(rs.getString(4));
                    //t5.setText(rs.getString(5));
                    //t6.setText(rs.getString(6));
                    //t7.setText(rs.getString(7));
                    //t8.setText(rs.getString(8));
                    //t9.setText(rs.getString(9));
                    //t10.setText(rs.getString(10));
                    //tx11.setText(rs.getString(11));
                    //tx12.setText(rs.getString(12));
                    //tx13.setText(rs.getString(13));
                    //tx14.setText(rs.getString(14));
                    //tx15.setText(rs.getString(15));
                    //tx16.setText(rs.getString(16));
                    //tx17.setText(rs.getString(17));
                    //tx18.setText(rs.getString(18));
                    //tx19.setText(rs.getString(19));
                    //tx20.setText(rs.getString(20));
                    //tx21.setText(rs.getString(21));
                    //tx22.setText(rs.getString(22));
                    //tx23.setText(rs.getString(23));
                    //tx24.setText(rs.getString(24));
                    //tx25.setText(rs.getString(25));
                    //tx26.setText(rs.getString(26));
                    //tx27.setText(rs.getString(27));
                    //tx28.setText(rs.getString(28));
                //}

            //}else{
               // ConnectionResult="Check Connection";
            //}
        //}catch (Exception ex){
            //Log.e("error", ex.getMessage());
        //}


