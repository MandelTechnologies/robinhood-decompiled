package com.robinhood.android.snacks.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.snacks.C28692R;

/* loaded from: classes5.dex */
public final class IncludeSnacksSplashPage2Binding implements ViewBinding {
    private final ImageView rootView;

    private IncludeSnacksSplashPage2Binding(ImageView imageView) {
        this.rootView = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }

    public static IncludeSnacksSplashPage2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSnacksSplashPage2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28692R.layout.include_snacks_splash_page_2, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSnacksSplashPage2Binding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeSnacksSplashPage2Binding((ImageView) view);
    }
}
