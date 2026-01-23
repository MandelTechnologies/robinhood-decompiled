package com.robinhood.android.options.history.detail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.options.history.detail.C23086R;

/* loaded from: classes11.dex */
public final class FragmentOptionOrderDetailBinding implements ViewBinding {
    private final ComposeView rootView;

    private FragmentOptionOrderDetailBinding(ComposeView composeView) {
        this.rootView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static FragmentOptionOrderDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionOrderDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C23086R.layout.fragment_option_order_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionOrderDetailBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentOptionOrderDetailBinding((ComposeView) view);
    }
}
