package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class IncludeMatchaSearchShareQrRowBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RhTextView shareQrText;

    private IncludeMatchaSearchShareQrRowBinding(LinearLayout linearLayout, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.shareQrText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeMatchaSearchShareQrRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeMatchaSearchShareQrRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.include_matcha_search_share_qr_row, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeMatchaSearchShareQrRowBinding bind(View view) {
        int i = C21284R.id.share_qr_text;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new IncludeMatchaSearchShareQrRowBinding((LinearLayout) view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
