package com.example.lambdaexpressionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.ReplaySubject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //observable
        ReplaySubject<Integer> subject = ReplaySubject.create();
        subject.onNext(1);
        subject.onNext(2);
        subject.onNext(3);

        //observer
        subject.subscribe(number -> Log.i(TAG, "Number is :" + number));

        subject.onNext(4);
        subject.onNext(5);
        subject.onNext(6);
    }

}