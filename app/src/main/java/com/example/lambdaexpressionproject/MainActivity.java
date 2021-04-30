package com.example.lambdaexpressionproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//1.1
        ExampleWithoutParameter exampleWithoutParameterOld = new ExampleWithoutParameter() {
            @Override
            public void myFunction() {
                System.out.println("sdfsd");
                System.out.println("sdfsd");
                System.out.println("sdfsd");
                System.out.println("sdfsd");
                System.out.println("sdfsd");
                Log.d("dsdsd", "myFunction : ");
            }
        };
//1.2
        ExampleWithoutParameter exampleWithoutParameter = () -> {
            System.out.println("asdadf");
            System.out.println("asdadf");
            System.out.println("asdadf");
            System.out.println("asdadf");

            Log.i("sdasd", "dsadad: ");

        };
//2.1
        ExampleWithParameter exampleWithParameterOld = new ExampleWithParameter() {
            @Override
            public void myFunction(int x) {

            }
        };
//2.2
        ExampleWithParameter exampleWithParameter = (x) -> System.out.println(String.valueOf(x));

//3.1
        ExampleWithReturnType exampleWithReturnTypeOld = new ExampleWithReturnType() {
            @Override
            public int myFunction(int x, int y) {
                return x * y;
            }
        };

//3.2
        ExampleWithReturnType exampleWithReturnType = (x, y) -> {
            System.out.println("dfdasf");
            System.out.println("dfdasf");
            System.out.println("dfdasf");
            System.out.println("dfdasf");

            return x * y;
        };

//4.1
        Button button = new Button(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


//4.2
        Button button2 = new Button(this);
        button2.setOnClickListener(v -> {

        });



    }


//1
interface ExampleWithoutParameter {
    void myFunction();
}

//2
interface ExampleWithParameter {
    void myFunction(int x);
}

//3
interface ExampleWithReturnType {
    int myFunction(int x, int y);
}

}