package ir.touristland.Activities.Flight;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;

import ir.touristland.Activities.BaseActivity;
import ir.touristland.Classes.HSH;
import ir.touristland.Fragments.CategoriesFilterFragment;
import ir.touristland.R;

public class CategoriesFilterDialog extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_filter_categories);

        Toolbar t = findViewById(R.id.toolbar);
        setSupportActionBar(t);
        replaceFragment(new CategoriesFilterFragment());
    }

    public void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.layoutFragment, fragment).commit();
    }


    public void animateRevealClose() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            HSH.hide(CategoriesFilterDialog.this, findViewById(R.id.ll_filter));
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    finish();
                }
            }, 500);

        } else {
            CategoriesFilterDialog.super.onBackPressed();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {

            if (getSupportFragmentManager()
                    .getBackStackEntryCount() > 0)
                getSupportFragmentManager().popBackStack();
            else
                animateRevealClose();
        }
        return false;

    }
}