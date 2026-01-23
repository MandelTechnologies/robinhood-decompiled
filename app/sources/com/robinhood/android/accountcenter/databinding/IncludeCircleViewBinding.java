package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.accountcenter.views.circlechart.CircleView;

/* loaded from: classes24.dex */
public final class IncludeCircleViewBinding implements ViewBinding {
    private final CircleView rootView;

    private IncludeCircleViewBinding(CircleView circleView) {
        this.rootView = circleView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CircleView getRoot() {
        return this.rootView;
    }

    public static IncludeCircleViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCircleViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.include_circle_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCircleViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCircleViewBinding((CircleView) view);
    }
}
