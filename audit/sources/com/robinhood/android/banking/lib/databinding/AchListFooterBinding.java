package com.robinhood.android.banking.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class AchListFooterBinding implements ViewBinding {
    public final RhTextView achRelationshipListFooter;
    private final RhTextView rootView;

    private AchListFooterBinding(RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = rhTextView;
        this.achRelationshipListFooter = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RhTextView getRoot() {
        return this.rootView;
    }

    public static AchListFooterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AchListFooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C9631R.layout.ach_list_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static AchListFooterBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RhTextView rhTextView = (RhTextView) view;
        return new AchListFooterBinding(rhTextView, rhTextView);
    }
}
