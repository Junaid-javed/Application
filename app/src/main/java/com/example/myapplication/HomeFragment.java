package com.example.myapplication;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.squareup.picasso.Picasso;

public class HomeFragment extends Fragment {

    String url ="http://i.imgur.com/DvpvklR.png";
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button button = view.findViewById(R.id.home);


        ImageView imageView1 = view.findViewById(R.id.img1);
        ImageView imageView2 = view.findViewById(R.id.img2);
        ImageView imageView3= view.findViewById(R.id.img3);
        Toolbar toolbar = view.findViewById(R.id.toolbar_payment);
        Toolbar tool = view.findViewById(R.id.toolbar_service);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Payment History");
        ((AppCompatActivity) getActivity()).setSupportActionBar(tool);
       ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Government Services");
        Picasso.with(getActivity()).load(url).resize(200,200).into(imageView1);
        imageView1.setPadding(4, 4, 4, 4);
        Picasso.with(getActivity()).load(url).resize(200,200).into(imageView2);
        imageView2.setPadding(4, 4, 4, 4);
        Picasso.with(getActivity()).load(url).resize(200,200).into(imageView3);
        imageView3.setPadding(4, 4, 4, 4);


        setHasOptionsMenu(true);
        LinearLayout layout = view.findViewById(R.id.linear);
            for (int i = 0; i < 10; i++) {
                ImageView imageView = new ImageView(getActivity());
                imageView.setId(i);
                imageView.setPadding(2, 2, 2, 2);
                imageView.setImageBitmap(BitmapFactory.decodeResource(
                        getResources(), R.drawable.scene));
                layout.addView(imageView);

        }
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(),MainActivity.class);
                    startActivity(intent);
                }
            });

        return view;
}
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        // TODO Add your menu entries here
        inflater.inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.home:
                break;

            case R.id.service:
                break;
        }
        return true;

    }
}
