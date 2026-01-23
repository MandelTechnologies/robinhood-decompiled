package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.p245ui.review.ExpandableTitleAndBodyView;

/* loaded from: classes5.dex */
public final class IncludeExpandableTitleAndBodyViewBinding implements ViewBinding {
    private final ExpandableTitleAndBodyView rootView;

    private IncludeExpandableTitleAndBodyViewBinding(ExpandableTitleAndBodyView expandableTitleAndBodyView) {
        this.rootView = expandableTitleAndBodyView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ExpandableTitleAndBodyView getRoot() {
        return this.rootView;
    }

    public static IncludeExpandableTitleAndBodyViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeExpandableTitleAndBodyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.include_expandable_title_and_body_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeExpandableTitleAndBodyViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeExpandableTitleAndBodyViewBinding((ExpandableTitleAndBodyView) view);
    }
}
