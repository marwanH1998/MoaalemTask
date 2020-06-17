package marwanh.aucegypt.moallemtask;

import android.content.Context;
import android.content.Intent;
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

public class secondAdapter extends RecyclerView.Adapter<secondAdapter.ViewHolder> {


    private Context context;

    public secondAdapter(Context hcontext)
    {
        context=hcontext;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.videocardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {


        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,  "open video "+ position, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(context,videoActivity.class);
                i.putExtra("video",position);
                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image;
        public ViewHolder(View itemView)
        {
            super(itemView);
            image= itemView.findViewById(R.id.myimg2);
        }
    }
}
