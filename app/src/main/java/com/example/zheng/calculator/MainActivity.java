package com.example.zheng.calculator;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener, numberFragment.OnFragmentInteractionListener {
    private final String tag="MyTag";
    // private FragmentManager fragmentManager = getFragmentManager();
    private Button[] btn = new Button[10];
    //保存原来的算式样子，为了输出时好看，因计算时，算式样子被改变
    public String str_old;
    String s = "+"+"-"+"/"+"*"+"="+"."+"";
    /* 变换样子后的式子 */
   // public String str_new;
    //char[] nums = new char[500];
    //char[]  operators = new char[500];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        // Fragment fragment = (Fragment)getFragmentManager().findFragmentById(R.id.fragment);
       // Fragment fragment2 = (Fragment)getFragmentManager().findFragmentById(R.id.fragment2);
        Button bt_clean = (Button)findViewById(R.id.bt_clean);
        btn[0] = (Button)findViewById(R.id.bt_0);
        btn[1] = (Button)findViewById(R.id.bt_1);
        btn[2] = (Button)findViewById(R.id.bt_2);
        btn[3] = (Button)findViewById(R.id.bt_3);
        btn[4] = (Button)findViewById(R.id.bt_4);
        btn[5] = (Button)findViewById(R.id.bt_5);
        btn[6] = (Button)findViewById(R.id.bt_6);
        btn[7] = (Button)findViewById(R.id.bt_7);
        btn[8] = (Button)findViewById(R.id.bt_8);
        btn[9] = (Button)findViewById(R.id.bt_9);
        Button bt_add = (Button)findViewById(R.id.bt_add);
        Button bt_cut = (Button)findViewById(R.id.bt_cut);
        Button bt_div = (Button)findViewById(R.id.bt_div);
        Button bt_equal = (Button)findViewById(R.id.bt_equal);
        Button bt_multiply = (Button)findViewById(R.id.bt_multiply);
        Button bt_percent = (Button)findViewById(R.id.bt_percent);
        Button bt_point = (Button)findViewById(R.id.bt_point);
        Button bt_remove = (Button)findViewById(R.id.bt_remove);
        final TextView edittexttop=(TextView)findViewById(R.id.edittexttop);
        final TextView edittextunder=(TextView)findViewById(R.id.edittextunder);
        btn[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    edittexttop.setText(edittexttop.getText()+""+1);}
            });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+2);
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+3);
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+4);
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+5);
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+6);
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+7);
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+8);
            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+9);
            }
        });
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+0);
            }
        });
        bt_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText("");
                edittextunder.setText("");
            }
        });
        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0){
                if(s.indexOf(edittexttop.getText().toString().charAt(edittexttop.getText().toString().length()-1))==-1)
                edittexttop.setText(edittexttop.getText()+""+"+");}
            }
        });
        bt_cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0){
                    if(s.indexOf(edittexttop.getText().toString().charAt(edittexttop.getText().toString().length()-1))==-1)
                edittexttop.setText(edittexttop.getText()+""+"-");}
                else{
                    edittexttop.setText(edittexttop.getText()+""+"-");
                }
            }
        });
        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0){
                    if(s.indexOf(edittexttop.getText().toString().charAt(edittexttop.getText().toString().length()-1))==-1)
                edittexttop.setText(edittexttop.getText()+""+"/");}
            }
        });
        bt_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0){
                    if(s.indexOf(edittexttop.getText().toString().charAt(edittexttop.getText().toString().length()-1))==-1)
                edittexttop.setText(edittexttop.getText()+""+"*");}
            }
        });
        bt_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0){
                    if(s.indexOf(edittexttop.getText().toString().charAt(edittexttop.getText().toString().length()-1))==-1){
                try {
                    edittexttop.setText(edittexttop.getText() + "" + "=");
                    str_old = edittexttop.getText() + "";
                    Calculate calc = new Calculate();
                    double result = calc.prepareParam(str_old);
                    if (String.valueOf(result) != null) {
                        // 处理结果
                        edittextunder.setText(MyUtils.formatResult(String.format("%." + MyUtils.RESULT_DECIMAL_MAX_LENGTH + "f", result)));
                    }
                }catch (Exception e) {
                    edittextunder.setText("格式错误");
                }}
                }
            }
        });
        bt_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0)
               edittexttop.setText(edittexttop.getText().toString().substring(0,edittexttop.getText().toString().length()-1));
            }
        });
        bt_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()!=0)
                {
                    try{
                        edittextunder.setText("%" + String.valueOf(Double.parseDouble(edittexttop.getText().toString())*100));
                    }catch(Exception e) {
                        edittextunder.setText("格式错误");
                    }
                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0){
                    if(s.indexOf(edittexttop.getText().toString().charAt(edittexttop.getText().toString().length()-1))==-1)
                edittexttop.setText(edittexttop.getText()+""+".");}
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //新建的xml文件
        getMenuInflater().inflate(R.menu.meau, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //根据不同的id点击不同按钮控制activity需要做的事件
        switch (item.getItemId())
        {
            case R.id.danwei_item:
                Intent intent = new Intent(MainActivity.this , ChangeActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }
    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

}
