package br.com.resources.widget;

import java.util.List;

import br.com.resources.model.Music;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MusicAdapter extends ArrayAdapter<Music> {

	public MusicAdapter(Context context, int resource, int textViewResourceId,
			List<Music> objects) {
		super(context, resource, textViewResourceId, objects);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = super.getView(position, convertView, parent);
		Music music = getItem(position);
		((TextView)view.findViewById(android.R.id.text2)).setText(music.mArtist);
		return view;
	}

}
