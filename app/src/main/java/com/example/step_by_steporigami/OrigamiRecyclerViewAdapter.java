package com.example.step_by_steporigami;

import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.step_by_steporigami.placeholder.PlaceholderContent.PlaceholderItem;
import com.example.step_by_steporigami.databinding.FragmentOrigamiItemBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class OrigamiRecyclerViewAdapter extends RecyclerView.Adapter<OrigamiRecyclerViewAdapter.ViewHolder> {

    private final List<Origami> objects;
    private final Context context;

    public OrigamiRecyclerViewAdapter(List<Origami> items, Context c) {
        objects = items;
        context = c;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(FragmentOrigamiItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.mItem = objects.get(position);
        holder.mIdView.setText(objects.get(position).getName());
        holder.mContentView.setImageResource(objects.get(position).getImage());
        holder.mContentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, InstructionsActivity.class);
                intent.putExtra(context.getString(R.string.origami_name_key), objects.get(position).getName());
                intent.putExtra(context.getString(R.string.origami_instructions_key), position);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView mIdView;
        public final ImageButton mContentView;
        public Origami mItem;

        public ViewHolder(FragmentOrigamiItemBinding binding) {
            super(binding.getRoot());
            mIdView = binding.itemNumber;
            mContentView = binding.content;
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getDrawable() + "'";
        }
    }
}