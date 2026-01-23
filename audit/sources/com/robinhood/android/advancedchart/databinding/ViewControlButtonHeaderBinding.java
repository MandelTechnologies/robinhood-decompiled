package com.robinhood.android.advancedchart.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.advancedchart.C8502R;

/* loaded from: classes24.dex */
public final class ViewControlButtonHeaderBinding implements ViewBinding {
    private final ImageButton rootView;

    private ViewControlButtonHeaderBinding(ImageButton imageButton) {
        this.rootView = imageButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageButton getRoot() {
        return this.rootView;
    }

    public static ViewControlButtonHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ViewControlButtonHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8502R.layout.view_control_button_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ViewControlButtonHeaderBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new ViewControlButtonHeaderBinding((ImageButton) view);
    }
}
