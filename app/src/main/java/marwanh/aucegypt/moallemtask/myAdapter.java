package marwanh.aucegypt.moallemtask;

import android.content.Context;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {


    private ArrayList<String> mySubjects = new ArrayList<>();
    private Context context;
    public myAdapter(ArrayList<String> subjects, Context hcontext)
    {
    mySubjects=subjects;
    context=hcontext;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.mycardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
holder.name.setText(mySubjects.get(position));



holder.image.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(context, "clicked on image" + mySubjects.get(position), Toast.LENGTH_SHORT).show();
    }
});

    }

    @Override
    public int getItemCount() {
        return mySubjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
    ImageView image;
    TextView name;
     public ViewHolder(View itemView)
     {
         super(itemView);
         image= itemView.findViewById(R.id.myimg);
         name=itemView.findViewById(R.id.mysubject);
     }
    }
}
