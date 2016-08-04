package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        displayOrder(quantity*5);
    }
    public void plusQuantity(View view){
        display(++quantity);
        displayPrice(quantity*5);
    }
    public void minusQuantity(View view){
        if(quantity>0) display(--quantity);
        displayPrice(quantity*5);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(Locale.getDefault()).format(number));
    }
    private void displayOrder(int checked){
        TextView orderTextView = (TextView) findViewById(R.id.text3);
        orderTextView.setText(NumberFormat.getCurrencyInstance(Locale.getDefault()).format(checked));
    }
}