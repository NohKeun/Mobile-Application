package nkpark.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import nkpark.myapplication.R;


public class MainActivity extends Activity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btn;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btn = (Button) findViewById(R.id.Btn);

        textResult = (TextView) findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "숫자 입력", Toast.LENGTH_SHORT).show();
                else if( Double.parseDouble(num2) == 0)
                    Toast.makeText(getApplicationContext(), "0으로 나누기 불가능", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener()

        {

            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if (num2.isEmpty())
                    Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                else if( Double.parseDouble(num2) == 0)
                    Toast.makeText(getApplicationContext(), "0으로 나누기 불가능", Toast.LENGTH_SHORT).show();
                else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });
    }
}
