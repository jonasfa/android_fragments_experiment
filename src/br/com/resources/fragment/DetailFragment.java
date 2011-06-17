package br.com.resources.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import br.com.resources.R;
import br.com.resources.model.Music;

public class DetailFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.detail, container);
	}

	public void setMusic(Music music) {
		((TextView)getView().findViewById(android.R.id.text1)).setText(music.mTitle);
		
	}
}
