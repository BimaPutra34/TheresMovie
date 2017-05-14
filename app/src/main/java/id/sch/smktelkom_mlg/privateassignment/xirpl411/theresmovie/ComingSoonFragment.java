package id.sch.smktelkom_mlg.privateassignment.xirpl411.theresmovie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.privateassignment.xirpl411.theresmovie.adapter.SourceAdapter;
import id.sch.smktelkom_mlg.privateassignment.xirpl411.theresmovie.model.Source;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ComingSoonFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ComingSoonFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ComingSoonFragment extends Fragment {
    ArrayList<Source> mList = new ArrayList<>();
    SourceAdapter mAdapter;


    public ComingSoonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coming_soon, container, false);
    }

}
