package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.lib.odyssey.C20335R;

/* loaded from: classes8.dex */
public final class MergeSdSectionBinding implements ViewBinding {
    public final ComposeView composeView;
    private final View rootView;

    private MergeSdSectionBinding(View view, ComposeView composeView) {
        this.rootView = view;
        this.composeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeSdSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20335R.layout.merge_sd_section, viewGroup);
        return bind(viewGroup);
    }

    public static MergeSdSectionBinding bind(View view) {
        int i = C20335R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new MergeSdSectionBinding(view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
