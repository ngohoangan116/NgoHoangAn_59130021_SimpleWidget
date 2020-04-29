package vn.edu.ntu.hoangan.ngohoangan_59130021_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ename, engaysinh, esothich;
    RadioGroup radiogioitinh;
    RadioButton radionam, radionu;
    Button buttom1;
    CheckBox film, nhac, cafe, nha, nauan;
    String khongnhapgi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }
    private void addView()
    {
        ename = findViewById(R.id.ename);
        engaysinh = findViewById(R.id.engaysinh);
        esothich = findViewById(R.id.esothich);
        radiogioitinh = findViewById(R.id.radiogiotinh);
        radionam = findViewById(R.id.radionam);
        radionu = findViewById(R.id.radionu);
        buttom1 = findViewById(R.id.buttom1);
        film = findViewById(R.id.film);
        nhac = findViewById(R.id.nhac);
        cafe = findViewById(R.id.cafe);
        nha = findViewById(R.id.nha);
        nauan = findViewById(R.id.nauan);

    }
    private void addEvent()
    {
        buttom1.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {

                KQ();
            }
        });

    }
    private void KQ()
    {
        khongnhapgi = ename.getText().toString() + "\n" +
                "Ngày sinh: " + engaysinh.getText().toString() + "\n " +
                "Giới tính: ";
        if (radiogioitinh.getCheckedRadioButtonId() == R.id.radionam)
            khongnhapgi += "Nam" + "\n" + "Sở thích: ";
        else
            khongnhapgi += "Nữ   " + "\n" + "Sở thích: ";

        if (film.isChecked())
            khongnhapgi += "xem phim , ";
        if (nhac.isChecked())
            khongnhapgi += "nghe nhạc ,";
        if (cafe.isChecked())
            khongnhapgi += "Đi cafe với bạn bè ,";
        if (nha.isChecked())
            khongnhapgi += "ở nhà một mình ,";
        if (nauan.isChecked())
            khongnhapgi += "vào bếp nấu ăn ,";
        khongnhapgi += esothich.getText().toString();
        Toast.makeText(getApplicationContext(), khongnhapgi , Toast.LENGTH_SHORT).show();
    }
}
