package com.robinhood.android.embeddedDetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.embeddedDetail.C14480R;

/* loaded from: classes7.dex */
public final class FragmentEmbeddedDetailBinding implements ViewBinding {
    public final ComposeView composeView;
    private final LinearLayout rootView;

    private FragmentEmbeddedDetailBinding(LinearLayout linearLayout, ComposeView composeView) {
        this.rootView = linearLayout;
        this.composeView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentEmbeddedDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentEmbeddedDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14480R.layout.fragment_embedded_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentEmbeddedDetailBinding bind(View view) {
        int i = C14480R.id.compose_view;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            return new FragmentEmbeddedDetailBinding((LinearLayout) view, composeView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
