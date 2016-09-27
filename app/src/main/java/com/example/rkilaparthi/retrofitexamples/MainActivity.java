package com.example.rkilaparthi.retrofitexamples;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.rkilaparthi.retrofitexamples.Pojo.MyPojo;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;


public class MainActivity extends AppCompatActivity {
    String url = "http://api.androidhive.info";
    TextView txt_id, txt_name, txt_email, txt_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_id = (TextView) findViewById(R.id.txt_id);
        txt_name = (TextView) findViewById(R.id.txt_name);
        txt_email = (TextView) findViewById(R.id.txt_email);
        txt_gender = (TextView) findViewById(R.id.txt_gender);

        getReport();
    }

    void getReport() {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();

        RestApi service = retrofit.create(RestApi.class);

        Call < MyPojo > call = service.getReportData();

        call.enqueue(new Callback < MyPojo > () {@
                Override
        public void onResponse(Response < MyPojo > response, Retrofit retrofit) {
            try {
                for (int i = 0; i < response.body().getContacts().length; i++) {
                    String id = response.body().getContacts()[i].getId();
                    String name = response.body().getContacts()[i].getName();
                    String email = response.body().getContacts()[i].getAddress();
                    String gender = response.body().getContacts()[i].getGender();
                    txt_id.setText("id  :  " + id);
                    txt_name.setText("name  :  " + name);
                    txt_email.setText("email  : " + email);
                    txt_gender.setText("gender  :  " + gender);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}