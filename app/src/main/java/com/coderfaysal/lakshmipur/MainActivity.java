package com.coderfaysal.lakshmipur;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleView);


        hashMap = new HashMap<>();
        hashMap.put("title", "ইতিহাস");
        hashMap.put("message", "লক্ষ্মীপুর নামে সর্বপ্রথম থানা প্রতিষ্ঠিত হয় ১৮৬০ সালে। এরপর ১৯৭৬ সালের ১ সেপ্টেম্বর তৎকালীন ৫নং বাঞ্ছানগর ইউনিয়ন লক্ষ্মীপুর পৌরসভায় রূপান্তরিত হয়। পরে এই পৌরসভাটির বিস্তৃতি ঘটে। রায়পুর, রামগঞ্জ, রামগতি ও লক্ষ্মীপুর সদর উপজেলা নিয়ে ১৯৭৯ সালের ১৯ জুলাই লক্ষ্মীপুর মহকুমা এবং একই এলাকা নিয়ে ১৯৮৪ সালের ২৮ ফেব্রুয়ারি গঠিত হয় লক্ষ্মীপুর জেলা।[");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "নামকরণ");
        hashMap.put("message", "লক্ষ্মী, হিন্দু ধর্মানুসারে ধন-সম্পদ ও সৌভাগ্যের দেবী (দুর্গা কন্যা ও বিষ্ণু পত্নী) এবং পুর হল শহর বা নগর। এ হিসাবে লক্ষ্মীপুর এর সাধারণ অর্থ দাঁড়ায় সম্পদ সমৃদ্ধ শহর বা সৌভাগ্যের নগরী। ঐতিহাসিক কৈলাশ চন্দ্র সিংহ রাজমালা বা ত্রিপুরার ইতিহাস লিখতে গিয়ে তৎকালীন নোয়াখালীর পরগণা ও মহালগুলোর নাম উল্লেখ করেছেন। এতে দেখা যায়, বাঞ্ছানগর ও সমসেরাবাদ মৌজার পশ্চিমে লক্ষ্মীপুর নামে একটি মৌজা ছিল। আজকের পশ্চিম লক্ষ্মীপুর মৌজাই তৎকালীন লক্ষ্মীপুর মৌজা।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সাধারণ ইতিহাস");
        hashMap.put("message", "ত্রয়োদশ শতাব্দীতে লক্ষ্মীপুর ভুলুয়া রাজ্যের অধীন ছিল। মুঘল ও ইস্ট ইন্ডিয়া কোম্পানির শাসনামলে লক্ষ্মীপুরে একটি সামরিক স্থাপনা ছিল। ষোড়শ থেকে ঊনবিংশ শতাব্দী পর্যন্ত এ এলাকায় প্রচুর পরিমাণে লবণ উৎপন্ন হত এবং বাইরে রপ্তানি হত। লবণের কারণে এখানে লবণ বিপ্লব ঘটে। স্বদেশী আন্দোলনে লক্ষ্মীপুরবাসী স্বতঃস্ফুর্ত অংশগ্রহণ করে। এ সময় মহাত্মা গান্ধী এ অঞ্চল ভ্রমণ করেন। তিনি তখন প্রায়ই কাফিলাতলি আখড়া ও রামগঞ্জের শ্রীরামপুর রাজবাড়ীতে অবস্থান করতেন। বিদ্রোহী কবি কাজী নজরুল ইসলাম ১৯২৬ সালের জুন মাসে লক্ষ্মীপুর সফরে আসেন।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ঘটনাবলি");
        hashMap.put("message", "১৯৭১ সালের ৬ জুলাই মুক্তিযোদ্ধারা লক্ষ্মীপুর শহরের রহমতখালি সেতুর কাছে অতর্কিত হামলা চালিয়ে ৭২ জন পাকসেনাকে হত্যা করে। ২৫ অক্টোবর সদরের মীরগঞ্জে মুক্তিযোদ্ধা ও পাকসেনাদের এক সম্মুখ লড়াইয়ে পাকবাহিনীর মেজরসহ ৭০ জন সৈন্য ও ৪১ জন রেঞ্জার নিহত হয়। রামগঞ্জ উপজেলার ফতেহপুর দীঘির পাড়ে পাকসেনাদের সঙ্গে মুক্তিযোদ্ধাদের এক লড়াই সংঘটিত হয়। এ লড়াইয়ে বহুসংখ্যক পাকসেনা নিহত হয়। পরবর্তীকালে পাকসেনারা ১৪ জন মুক্তিযোদ্ধাকে আটক করে রামগঞ্জ ক্যাম্পে এনে হত্যা করে। মুক্তিযুদ্ধ চলাকালে রামগতি উপজেলার জমিদার হাটের বাঁকে পাকসেনাদের সঙ্গে মুক্তিযোদ্ধাদের লড়াইয়ে কয়েকজন রাজাকারসহ ১৭ জন পাকসেনা নিহত হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "অবস্থান");
        hashMap.put("message", "বাংলাদেশের দক্ষিণ-পূর্বাংশে ২২°৩০´ থেকে ২৩°১০´ উত্তর অক্ষাংশ এবং ৯০°৩৮´ থেকে ৯০°০১´ পূর্ব দ্রাঘিমাংশ জুড়ে লক্ষ্মীপুর জেলার অবস্থান।[৩] রাজধানী ঢাকা থেকে এ জেলার দূরত্ব প্রায় ১৪৫ কিলোমিটার এবং চট্টগ্রাম বিভাগীয় সদর থেকে প্রায় ১৫৭ কিলোমিটার। এ জেলার উত্তরে চাঁদপুর জেলা, দক্ষিণে ভোলা জেলা ও নোয়াখালী জেলা, পূর্বে নোয়াখালী জেলা, পশ্চিমে মেঘনা নদী, ভোলা জেলা ও বরিশাল জেলা। লক্ষ্মীপুর শহর রহমতখালি নদীর তীরে অবস্থিত।");
        arrayList.add(hashMap);



        XAdapter xAdapter = new XAdapter();
        recyclerView.setAdapter(xAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }


    private class XAdapter extends RecyclerView.Adapter<XAdapter.XViewHolder>{


        @NonNull
        @Override
        public XViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.items, parent, false );
            return new XViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull XViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String message = hashMap.get("message");

            holder.textView.setText(title);

            holder.cardView.setOnClickListener(view -> {
                Details.TITLE = title;
                Details.MESSAGE = message;
                startActivity(new Intent(MainActivity.this, Details.class));
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class XViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cardView;

            public XViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.textView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }

    }






}