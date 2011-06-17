package br.com.resources;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import br.com.resources.fragment.DetailFragment;
import br.com.resources.model.Music;
import br.com.resources.widget.MusicAdapter;

public class MusicListFragment extends ListFragment {
	private DetailFragment mDetailFragment;
	
	public MusicListFragment() {
		super();
		setListAdapter(new MusicAdapter(getActivity(), R.layout.music_entry, android.R.id.text1, getMusicList()));
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		Music music = (Music) getListAdapter().getItem(position);
		mDetailFragment.setMusic(music);
		if (((LinearLayout.LayoutParams)getView().getLayoutParams()).weight == 0)
			getView().setVisibility(View.GONE);
		super.onListItemClick(l, v, position, id);
	}

	public void setDetailFragment(DetailFragment detailFragment) {
		mDetailFragment = detailFragment;
	}
	
	private List<Music> getMusicList() {
		ArrayList<Music> musics = new ArrayList<Music>();
		for (int i = 0; i < 60; i++) {
			Music music = new Music();
			music.mTitle = "Mœsica " + i;
			music.mArtist = "Artista " + i;
			musics.add(music);
		}
		return musics;
	}
}
