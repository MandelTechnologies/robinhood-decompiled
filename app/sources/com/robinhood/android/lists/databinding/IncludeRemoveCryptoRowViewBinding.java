package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.lists.p173ui.RemoveCryptoRowView;

/* loaded from: classes8.dex */
public final class IncludeRemoveCryptoRowViewBinding implements ViewBinding {
    private final RemoveCryptoRowView rootView;

    private IncludeRemoveCryptoRowViewBinding(RemoveCryptoRowView removeCryptoRowView) {
        this.rootView = removeCryptoRowView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RemoveCryptoRowView getRoot() {
        return this.rootView;
    }

    public static IncludeRemoveCryptoRowViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeRemoveCryptoRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.include_remove_crypto_row_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeRemoveCryptoRowViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeRemoveCryptoRowViewBinding((RemoveCryptoRowView) view);
    }
}
