package br.com.nilles;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SoundAct extends Fragment {

    public SoundAct(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // O layout vai ser inflado a partir daqui
        return inflater.inflate(R.layout.sound_frag, container, false);
    }
}