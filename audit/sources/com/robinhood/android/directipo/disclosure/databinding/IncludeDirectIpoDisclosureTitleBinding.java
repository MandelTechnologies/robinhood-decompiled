package com.robinhood.android.directipo.disclosure.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.disclosure.C14217R;

/* loaded from: classes27.dex */
public final class IncludeDirectIpoDisclosureTitleBinding implements ViewBinding {
    private final RhTextView rootView;

    private IncludeDirectIpoDisclosureTitleBinding(RhTextView rhTextView) {
        this.rootView = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static IncludeDirectIpoDisclosureTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeDirectIpoDisclosureTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14217R.layout.include_direct_ipo_disclosure_title, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeDirectIpoDisclosureTitleBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeDirectIpoDisclosureTitleBinding((RhTextView) view);
    }
}
