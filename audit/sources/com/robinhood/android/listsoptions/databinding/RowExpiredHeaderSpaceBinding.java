package com.robinhood.android.listsoptions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.listsoptions.C20943R;

/* loaded from: classes8.dex */
public final class RowExpiredHeaderSpaceBinding implements ViewBinding {
    private final Space rootView;

    private RowExpiredHeaderSpaceBinding(Space space) {
        this.rootView = space;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Space getRoot() {
        return this.rootView;
    }

    public static RowExpiredHeaderSpaceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static RowExpiredHeaderSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20943R.layout.row_expired_header_space, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static RowExpiredHeaderSpaceBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new RowExpiredHeaderSpaceBinding((Space) view);
    }
}
