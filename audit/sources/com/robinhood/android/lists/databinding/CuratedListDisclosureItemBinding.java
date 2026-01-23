package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class CuratedListDisclosureItemBinding implements ViewBinding {
    public final RhTextView curatedListDisclosureText;
    private final FrameLayout rootView;

    private CuratedListDisclosureItemBinding(FrameLayout frameLayout, RhTextView rhTextView) {
        this.rootView = frameLayout;
        this.curatedListDisclosureText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static CuratedListDisclosureItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CuratedListDisclosureItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.curated_list_disclosure_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CuratedListDisclosureItemBinding bind(View view) {
        int i = C20839R.id.curated_list_disclosure_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new CuratedListDisclosureItemBinding((FrameLayout) view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
