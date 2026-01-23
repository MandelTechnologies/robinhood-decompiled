package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.view.RhToolbar;

/* loaded from: classes2.dex */
public final class IncludeToolbarBinding implements ViewBinding {
    private final RhToolbar rootView;
    public final RhToolbar toolbarWrapper;

    private IncludeToolbarBinding(RhToolbar rhToolbar, RhToolbar rhToolbar2) {
        this.rootView = rhToolbar;
        this.toolbarWrapper = rhToolbar2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhToolbar getRoot() {
        return this.rootView;
    }

    public static IncludeToolbarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11048R.layout.include_toolbar, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeToolbarBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhToolbar rhToolbar = (RhToolbar) view;
        return new IncludeToolbarBinding(rhToolbar, rhToolbar);
    }
}
