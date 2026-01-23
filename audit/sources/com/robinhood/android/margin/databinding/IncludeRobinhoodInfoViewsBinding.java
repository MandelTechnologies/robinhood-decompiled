package com.robinhood.android.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.margin.C20999R;

/* loaded from: classes8.dex */
public final class IncludeRobinhoodInfoViewsBinding implements ViewBinding {
    private final View rootView;

    private IncludeRobinhoodInfoViewsBinding(View view) {
        this.rootView = view;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static IncludeRobinhoodInfoViewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20999R.layout.include_robinhood_info_views, viewGroup);
        return bind(viewGroup);
    }

    public static IncludeRobinhoodInfoViewsBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRobinhoodInfoViewsBinding(view);
    }
}
