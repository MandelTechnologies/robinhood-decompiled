package com.robinhood.android.recurring.hub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.recurring.hub.C26221R;

/* loaded from: classes11.dex */
public final class IncludeHistoryListHeaderRowIconBinding implements ViewBinding {
    public final ImageView headerIcon;
    public final RhTextView headerText;
    private final LinearLayout rootView;

    private IncludeHistoryListHeaderRowIconBinding(LinearLayout linearLayout, ImageView imageView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.headerIcon = imageView;
        this.headerText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeHistoryListHeaderRowIconBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeHistoryListHeaderRowIconBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C26221R.layout.include_history_list_header_row_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeHistoryListHeaderRowIconBinding bind(View view) {
        int i = C26221R.id.header_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C26221R.id.header_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new IncludeHistoryListHeaderRowIconBinding((LinearLayout) view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
