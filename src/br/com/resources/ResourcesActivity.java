package br.com.resources;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import br.com.resources.fragment.DetailFragment;

public class ResourcesActivity extends FragmentActivity {
    private MusicListFragment listFragment;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.container);
        listFragment = (MusicListFragment) getSupportFragmentManager().findFragmentById(R.id.listFragment);
        DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        listFragment.setDetailFragment(detailFragment);
    }
    
    @Override
    public void onBackPressed() {
    	if (listFragment.getView().getVisibility() == View.GONE)
    		listFragment.getView().setVisibility(View.VISIBLE);
    	else
	    	super.onBackPressed();
    }


}