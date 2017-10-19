package com.example.zheng.calculator;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BlankFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment newInstance(String param1, String param2) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_caidan, container, false);
        // Inflate the layout for this fragment
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final String s = "+"+"-"+"/"+"*"+"="+"."+"";
        final TextView edittexttop = getActivity().findViewById(R.id.edittexttop);
        final TextView edittextunder = getActivity().findViewById(R.id.edittextunder);
        Button bt_arccos = getActivity().findViewById(R.id.bt_arccos);
        Button bt_arcsin = getActivity().findViewById(R.id.bt_arcsin);
        Button bt_arctan = getActivity().findViewById(R.id.bt_arctan);
        Button bt_cos = getActivity().findViewById(R.id.bt_cos);
        Button bt_e = getActivity().findViewById(R.id.bt_e);
        Button bt_kaifang = getActivity().findViewById(R.id.bt_kaifang);
        Button bt_left = getActivity().findViewById(R.id.bt_left);
        Button bt_lg = getActivity().findViewById(R.id.bt_lg);
        Button bt_ln = getActivity().findViewById(R.id.bt_ln);
        Button bt_right = getActivity().findViewById(R.id.bt_right);
        Button bt_sin = getActivity().findViewById(R.id.bt_sin);
        Button bt_tan = getActivity().findViewById(R.id.bt_tan);
        Button bt_tentoeight = getActivity().findViewById(R.id.bt_tentoeight);
        Button bt_tentotwo = getActivity().findViewById(R.id.bt_tentotwo);
        Button bt_xx = getActivity().findViewById(R.id.bt_xx);
        Button bt_pi = getActivity().findViewById(R.id.bt_pi);
        bt_arccos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("arccos"+edittexttop.getText().toString()+"="+String.valueOf(Math.acos(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }

            }
        });
        bt_arcsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("arcsin"+edittexttop.getText().toString()+"="+String.valueOf(Math.asin(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_arctan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("arctan"+edittexttop.getText().toString()+"="+String.valueOf(Math.atan(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }

        });
        bt_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("cos"+edittexttop.getText().toString()+"="+String.valueOf(Math.cos(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("sin"+edittexttop.getText().toString()+"="+String.valueOf(Math.sin(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("tan"+edittexttop.getText().toString()+"="+String.valueOf(Math.tan(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+String.valueOf(Math.E));
                }
        });
        bt_kaifang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("开方后"+"="+String.valueOf(Math.sqrt(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText().toString()+"("+"");
            }
        });
        bt_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText().toString() +")"+"");
            }
        });
        bt_lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("lg"+edittexttop.getText().toString()+"="+String.valueOf(Math.log10(Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("ln"+edittexttop.getText().toString()+"="+String.valueOf(Math.log (Double.parseDouble(edittexttop.getText().toString()))));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittexttop.setText(edittexttop.getText()+""+String.valueOf(Math.PI));
            }
        });
        bt_xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText(edittexttop.getText().toString()+"的平方="+String.valueOf(Math.pow(Double.parseDouble(edittexttop.getText().toString()),2)));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_tentotwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                       edittextunder.setText("转换成二进制"+"="+decimal2Binary(Double.parseDouble(edittexttop.getText().toString())));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }
            }
        });
        bt_tentoeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edittexttop.getText().toString().length()>0) {
                    try {
                        edittextunder.setText("转换成八进制"+"="+Integer.toOctalString( Integer.parseInt(edittexttop.getText().toString())));
                    }catch (Exception e){
                        edittextunder.setText("格式错误");
                    }

                }
                else{
                    edittextunder.setText("输入为空");
                }

            }
        });
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    public static String decimal2Binary(double value) throws Exception {
        // 整数部分的值
        int in = (int) value;
        System.out.println("The integer is: " + in);
        // 小数部分的值
        double r = value - in;
        System.out.println("The decimal number is: " + r);

        StringBuilder stringBuilder = new StringBuilder();
        // 将整数部分转化为二进制
        int remainder = 0;
        int quotient = 0;
        while (in != 0) {
            // 得商
            quotient = in / 2;
            // 得余数
            remainder = in % 2;
            stringBuilder.append(remainder);
            in = quotient;
        }
        stringBuilder.reverse();
        stringBuilder.append(".");

        // 将小数部分转化为二进制
        int count = 32; // 限制小数部分位数最多为32位，如果超过32为则抛出异常
        double num = 0;
        while (r > 0.0000000001) {
            count--;
            if (count == 0) {
                throw new Exception("Cannot change the decimal number to binary!");
            }
            num = r * 2;
            if (num >= 1) {
                stringBuilder.append(1);
                r = num - 1;
            } else {
                stringBuilder.append(0);
                r = num;
            }
        }

        return stringBuilder.toString();
    }
}
