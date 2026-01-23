package com.robinhood.android.cash.lib.atm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.lib.atm.C10113R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class IncludeAtmMapClusterIconBinding implements ViewBinding {
    public final ImageView atmMapClusterIconImage;
    public final RhTextView atmMapClusterIconText;
    private final FrameLayout rootView;

    private IncludeAtmMapClusterIconBinding(FrameLayout frameLayout, ImageView imageView, RhTextView rhTextView) {
        this.rootView = frameLayout;
        this.atmMapClusterIconImage = imageView;
        this.atmMapClusterIconText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeAtmMapClusterIconBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeAtmMapClusterIconBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10113R.layout.include_atm_map_cluster_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeAtmMapClusterIconBinding bind(View view) {
        int i = C10113R.id.atm_map_cluster_icon_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C10113R.id.atm_map_cluster_icon_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new IncludeAtmMapClusterIconBinding((FrameLayout) view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
