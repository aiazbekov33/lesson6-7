package com.example.lesson6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;


public class GameFragment extends Fragment {
    GameModel model;
    TextView levelTv;
    ImageView firstIv;
    ImageView secondIv;
    ImageView thirdIv;
    ImageView fourIv;
    Button tryBtn;
    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getDataFromLevel();
        initViews(view);
        setData();
        initClicker();
    }

    private void initClicker() {
        tryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer();
            }
        });
    }

    private void checkAnswer() {
        if (editText.getText().toString().trim().equals(model.answer)){
            Toast.makeText(requireContext(), "Верно это " + model.answer, Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(requireContext(), "Не верно попробуйте еще раз", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        levelTv.setText(model.level);
        Glide.with(requireContext()).load(model.imageAddressFirst).centerCrop().into(firstIv);
        Glide.with(requireContext()).load(model.imageAddressSecond).centerCrop().into(secondIv);
        Glide.with(requireContext()).load(model.imageAddressThird).centerCrop().into(thirdIv);
        Glide.with(requireContext()).load(model.imageAddressFour).centerCrop().into(fourIv);
    }

    private void initViews(View view) {
        levelTv = view.findViewById(R.id.level_tv);
        firstIv = view.findViewById(R.id.first_iv);
        secondIv = view.findViewById(R.id.second_iv);
        thirdIv = view.findViewById(R.id.third_iv);
        fourIv = view.findViewById(R.id.four_iv);
        tryBtn = view.findViewById(R.id.try_btn);
        editText= view.findViewById(R.id.input_name_ed);
    }

    private void getDataFromLevel() {
        model = (GameModel) getArguments().getSerializable("model");

    }

}