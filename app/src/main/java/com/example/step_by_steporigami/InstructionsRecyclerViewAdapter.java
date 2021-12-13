package com.example.step_by_steporigami;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Instruction}.
 * TODO: Replace the implementation with code for your data type.
 */
public class InstructionsRecyclerViewAdapter extends RecyclerView.Adapter<InstructionsRecyclerViewAdapter.ViewHolder> {

    private final List<Instruction> mValues;

    public InstructionsRecyclerViewAdapter(List<Instruction> items, Context context) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_instruction_list_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        holder.stepImage.setImageResource(mValues.get(position).getImage());
        holder.stepDescription.setText(mValues.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final ImageView stepImage;
        public final TextView stepDescription;
        public Instruction mItem;

        public ViewHolder(View view) {
            super(view);
            stepImage = view.findViewById(R.id.step);
            stepDescription = view.findViewById(R.id.step_description);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + stepDescription.getText() + "'";
        }
    }
}