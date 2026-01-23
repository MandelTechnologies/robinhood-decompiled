package com.robinhood.android.compose.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.compose.app.C11918R;

/* loaded from: classes17.dex */
public final class FragmentGenericComposeBinding implements ViewBinding {
    private final ComposeView rootView;

    private FragmentGenericComposeBinding(ComposeView composeView) {
        this.rootView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static FragmentGenericComposeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentGenericComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11918R.layout.fragment_generic_compose, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentGenericComposeBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentGenericComposeBinding((ComposeView) view);
    }
}
