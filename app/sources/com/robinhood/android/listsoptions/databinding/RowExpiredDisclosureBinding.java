package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.listsoptions.C20943R;

/* loaded from: classes8.dex */
public final class RowExpiredDisclosureBinding implements ViewBinding {
    private final RhTextView rootView;

    private RowExpiredDisclosureBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static RowExpiredDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowExpiredDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.row_expired_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowExpiredDisclosureBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowExpiredDisclosureBinding((RhTextView) view);
    }
}
