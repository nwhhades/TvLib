package com.nwhhades.tvlib.common.base;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class BaseActivity<V extends ViewBinding> extends AppCompatActivity {

    protected V binding;

    protected abstract V getBinding();

    protected abstract void init();


}
