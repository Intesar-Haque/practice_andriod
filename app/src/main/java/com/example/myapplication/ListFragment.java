package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.adapters.UserListAdapter;
import com.example.myapplication.databinding.FragmentListBinding;

import java.util.ArrayList;
import java.util.List;


public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private UserListAdapter adapter;

    FragmentListBinding binding;
    public ListFragment() {

    }

    public static ListFragment newInstance() {
        return new ListFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentListBinding.inflate(inflater, container, false);
        recyclerView = binding.recycler;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<String> data = new ArrayList<>();

        data.add("Item 1");
        data.add("Item 2");

        adapter = new UserListAdapter(getContext(), data);
        recyclerView.setAdapter(adapter);
        return binding.getRoot();
    }
}