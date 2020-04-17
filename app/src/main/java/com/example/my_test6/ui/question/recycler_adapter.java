package com.example.my_test6.ui.question;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.my_test6.R;

import java.util.ArrayList;

public class recycler_adapter extends RecyclerView.Adapter<recycler_adapter.Myviewholder> {

    private ArrayList<list_item> list_items = new ArrayList<>();
    private Context context;

    public recycler_adapter(Context c, ArrayList<list_item> li) {
        this.context = c;
        this.list_items = li;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = View.inflate(parent.getContext(), R.layout.questionitem_view, null);
        return new Myviewholder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        holder.setdata(list_items.get(position));
    }

    @Override
    public int getItemCount() {
        if (list_items != null) return list_items.size();
        else return 0;

    }

    class Myviewholder extends RecyclerView.ViewHolder {
        private TextView title;
        private ImageView img;

        public Myviewholder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.item_img);
            title = (TextView) itemView.findViewById(R.id.item_title);
        }

        public void setdata(list_item data) {
            img.setImageResource(R.drawable.ic_launcher_foreground);
            title.setText(data.gettitle());
        }
    }
}
