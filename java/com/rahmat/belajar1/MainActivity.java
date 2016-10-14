package com.rahmat.belajar1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel
    int quantity, price;
    //deklarasi textview
    TextView finalprice, finalquantity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi nilai awal variabel
        quantity = 0;
        price = 0;
        finalprice = (TextView) findViewById(R.id.price);
        finalquantity = (TextView) findViewById(R.id.quantity);

    }


    //method untuk menampilkan harga akhir
    public void displayPrice(int number){
        finalprice.setText(""+number);
    }

    //method untuk menampilkan jumlah pesanan
    public void displayQuantity(int number){
        finalquantity.setText(""+number);
    }

    //method untuk mengurangi jumlah pesanan
    public void decrement(View view) {
        quantity--;
        displayQuantity(quantity);
    }

    //method untuk order pesanan dan menampilkan harga akhir
    public void submitOrder(View view) {
        price = quantity * 10;
        displayPrice(price);
    }

    //method untuk menambah jumlah pesanan
    public void increment(View view) {
        quantity++;
        displayQuantity(quantity);
    }
}
