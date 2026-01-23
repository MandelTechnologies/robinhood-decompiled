package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.C14171R;

/* loaded from: classes27.dex */
public final class IncludeDirectIpoTitleTextBinding implements ViewBinding {
    private final RhTextView rootView;

    private IncludeDirectIpoTitleTextBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoTitleTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoTitleTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.include_direct_ipo_title_text, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoTitleTextBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoTitleTextBinding((RhTextView) view);
    }
}
