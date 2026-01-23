package com.robinhood.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.robinhood.cards.C31879R;
import com.robinhood.shared.cards.Stack;

/* loaded from: classes3.dex */
public final class IncludeCardStackBinding implements ViewBinding {
    private final Stack rootView;

    private IncludeCardStackBinding(Stack stack) {
        this.rootView = stack;
    }

    @Override // androidx.viewbinding.ViewBinding
    public Stack getRoot() {
        return this.rootView;
    }

    public static IncludeCardStackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeCardStackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31879R.layout.include_card_stack, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeCardStackBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        return new IncludeCardStackBinding((Stack) view);
    }
}
