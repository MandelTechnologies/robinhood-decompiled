package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class IncludeEditOrderToolbarContentBinding implements ViewBinding {
    public final RhTextView editTxt;
    public final FrameLayout recsOrderToolbarContent;
    private final FrameLayout rootView;

    private IncludeEditOrderToolbarContentBinding(FrameLayout frameLayout, RhTextView rhTextView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.editTxt = rhTextView;
        this.recsOrderToolbarContent = frameLayout2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static IncludeEditOrderToolbarContentBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeEditOrderToolbarContentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29895R.layout.include_edit_order_toolbar_content, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeEditOrderToolbarContentBinding bind(View view) {
        int i = C29895R.id.edit_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new IncludeEditOrderToolbarContentBinding(frameLayout, rhTextView, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
