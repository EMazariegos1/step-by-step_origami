package com.example.step_by_steporigami;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class InstructionListFragment extends Fragment {

    // TODO: Customize parameter argument names

    private static final String ARG_POSITION = "position";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private int mPosition;

    private List<Instruction> instructions;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public InstructionListFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static InstructionListFragment newInstance(int position) {
        InstructionListFragment fragment = new InstructionListFragment();
        Bundle args = new Bundle();

        args.putInt(ARG_POSITION, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

            mPosition = getArguments().getInt(ARG_POSITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_instruction_list, container, false);
        // Set the adapter
        getInstructionList();
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new InstructionsRecyclerViewAdapter(instructions, context));
        }
        return view;
    }

    private void getInstructionList() {
        instructions = new ArrayList<>();
        for (int i = 0; i < OrigamiDB.instructions[mPosition].length; i++) {
            instructions.add(new Instruction(OrigamiDB.instructions[mPosition][i], OrigamiDB.descriptions[mPosition][i]));
        }
    }

}