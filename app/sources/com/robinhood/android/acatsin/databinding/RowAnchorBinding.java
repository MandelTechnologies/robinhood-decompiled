package com.robinhood.android.acatsin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.acatsin.C7725R;

/* loaded from: classes24.dex */
public final class RowAnchorBinding implements ViewBinding {
    private final Space rootView;

    private RowAnchorBinding(Space space) {
        this.rootView = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Space getRoot() {
        return this.rootView;
    }

    public static RowAnchorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowAnchorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C7725R.layout.row_anchor, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowAnchorBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowAnchorBinding((Space) view);
    }
}
