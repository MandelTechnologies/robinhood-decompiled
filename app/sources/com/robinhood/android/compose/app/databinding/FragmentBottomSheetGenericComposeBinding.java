package com.robinhood.android.compose.app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.compose.app.C11918R;

/* loaded from: classes2.dex */
public final class FragmentBottomSheetGenericComposeBinding implements ViewBinding {
    private final ComposeView rootView;

    private FragmentBottomSheetGenericComposeBinding(ComposeView composeView) {
        this.rootView = composeView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ComposeView getRoot() {
        return this.rootView;
    }

    public static FragmentBottomSheetGenericComposeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentBottomSheetGenericComposeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11918R.layout.fragment_bottom_sheet_generic_compose, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentBottomSheetGenericComposeBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new FragmentBottomSheetGenericComposeBinding((ComposeView) view);
    }
}
