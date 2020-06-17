package marwanh.aucegypt.moallemtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.LinearLayout;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mySubjects = new ArrayList<>();
    private ArrayList<Integer> myPictures = new ArrayList<Integer>();
    private ArrayList<Integer> myPictures2 = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adjustNames();
        adjustPictures();
        adjustphotos();
        adjustRecyclerView();
        adjustRecyclerView2();

    }


    private void adjustNames()
    {
        mySubjects.add("Physics");
        mySubjects.add("Biology");
        mySubjects.add("History");
        mySubjects.add("Geomtry");

    }

    private void adjustPictures()
    {
        myPictures.add(R.drawable.physics);
        myPictures.add(R.drawable.physics);
        myPictures.add(R.drawable.physics);
        myPictures.add(R.drawable.physics);

    }

    private void adjustRecyclerView()
    {
        LinearLayoutManager lin = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView rec = findViewById(R.id.recyclerView);
        rec.setLayoutManager(lin);
        myAdapter adapter = new myAdapter(mySubjects,this);
        rec.setAdapter(adapter);
    }

    private void adjustRecyclerView2()
    {
        LinearLayoutManager lin = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView rec = findViewById(R.id.recyclerView2);
        rec.setLayoutManager(lin);
        secondAdapter adapter = new secondAdapter(this);
        rec.setAdapter(adapter);
    }



    private void adjustphotos()
    {
        myPictures2.add(R.drawable.test);
        myPictures2.add(R.drawable.test);
        myPictures2.add(R.drawable.test);
        myPictures2.add(R.drawable.test);


    }
}
