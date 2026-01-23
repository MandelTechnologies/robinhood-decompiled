package com.robinhood.android.lib.odyssey.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lib.odyssey.C20335R;

/* loaded from: classes8.dex */
public final class RowSdComposeViewBinding implements ViewBinding {
    private final ComposeView rootView;

    private RowSdComposeViewBinding(ComposeView composeView) {
        this.rootView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static RowSdComposeViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowSdComposeViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20335R.layout.row_sd_compose_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowSdComposeViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowSdComposeViewBinding((ComposeView) view);
    }
}
