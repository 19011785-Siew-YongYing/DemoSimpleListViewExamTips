package sg.edu.rp.c346.id19011785.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//import android.widget.TextView;
//import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
//    TextView textView, textView2; // recap for array and arraylist
//    String[] fruits; // recap for array and arraylist
//    ArrayList<String> alFruits;
    String[] examTipsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.listViewExamTips);

        examTipsArray = new String[5];
        examTipsArray[0] = "Don't just read the code, code it as much as possible during each practical session";
        examTipsArray[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examTipsArray[2] = "Prepare your template source code for each topic";
        examTipsArray[3] = "Create a few empty Android projects to speed up your coding during the exam";
        examTipsArray[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, examTipsArray);
        lvExamTips.setAdapter(adapter);

        // RECAP ON ARRAY
//        textView = findViewById(R.id.demo);
//        fruits = new String[3];
//        fruits[0] = "apple";
//        fruits[1] = "banana";
//        fruits[2] = "cherry";
//        String display = "Fruits\n";
//        display += "==========\n";
//        for (int i = 0; i < fruits.length; i++){
//            display += fruits[i] + "\n";
//        }
//        textView.setText(display);

        // RECAP ON ARRAYLIST
//        textView2 = findViewById(R.id.demo2);
//        alFruits = new ArrayList<String>();
//        alFruits.add("Orange");
//        alFruits.add("Durian");
//        alFruits.add("Apple");
//        String show = "Fruits from ArrayList\n";
//        show += "==========\n";
//        for(int i = 0; i<alFruits.size(); i++){
//            show += alFruits.get(i) + "\n";
//        }
//        textView2.setText(show);
    }
}