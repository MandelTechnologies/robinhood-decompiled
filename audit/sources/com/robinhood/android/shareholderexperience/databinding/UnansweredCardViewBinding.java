package com.robinhood.android.shareholderexperience.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.robinhood.android.shareholderexperience.C28477R;

/* loaded from: classes5.dex */
public final class UnansweredCardViewBinding implements ViewBinding {
    private final FrameLayout rootView;

    private UnansweredCardViewBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static UnansweredCardViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static UnansweredCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28477R.layout.unanswered_card_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static UnansweredCardViewBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new UnansweredCardViewBinding((FrameLayout) view);
    }
}
