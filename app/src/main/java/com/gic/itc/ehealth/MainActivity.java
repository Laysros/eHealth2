package com.gic.itc.ehealth;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.gic.itc.ehealth.fragment.FragmentCompititions;
import com.gic.itc.ehealth.fragment.FragmentDrawer;
import com.gic.itc.ehealth.fragment.FragmentFood;
import com.gic.itc.ehealth.fragment.FragmentHome;
import com.gic.itc.ehealth.fragment.FragmentMainTab;
import com.gic.itc.ehealth.fragment.FragmentMyProgress;
import com.gic.itc.ehealth.fragment.FragmentUserProfile;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener{


    private FragmentDrawer mDrawerFragment;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        mDrawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        mDrawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        mDrawerFragment.setDrawerListener(this);
        displayView(0);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        Log.d("Pi", "pos" + position);
        switch (position) {
            case -2:
            case -1:
                //Profile
                fragment = new FragmentUserProfile();
                title = "Profile";
                break;
            case 0:
                //Home
                fragment = new FragmentHome();
                title = getString(R.string.home);
                break;
            case 1:
                //Food
                fragment = new FragmentMainTab();
                title = getString(R.string.food);
                break;
            case 2:
                //My progress
                fragment = new FragmentMyProgress();
                title = getString(R.string.my_progress);
                break;
            case 3:
                //Competitors
                fragment = new FragmentCompititions();
                title = getString(R.string.competitions);
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return super.onOptionsItemSelected(item);
    }
}