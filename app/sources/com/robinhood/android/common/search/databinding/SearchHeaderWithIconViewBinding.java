package com.robinhood.android.common.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class SearchHeaderWithIconViewBinding implements ViewBinding {
    public final ImageView headerIcon;
    public final RhTextView headerText;
    private final LinearLayout rootView;

    private SearchHeaderWithIconViewBinding(LinearLayout linearLayout, ImageView imageView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.headerIcon = imageView;
        this.headerText = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static SearchHeaderWithIconViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static SearchHeaderWithIconViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11798R.layout.search_header_with_icon_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static SearchHeaderWithIconViewBinding bind(View view) {
        int i = C11798R.id.header_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C11798R.id.header_text;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new SearchHeaderWithIconViewBinding((LinearLayout) view, imageView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
