package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class MergeDirectIpoOrderSplashSectionBinding implements ViewBinding {
    private final View rootView;
    public final RecyclerView sectionList;
    public final RhTextView sectionTitle;

    private MergeDirectIpoOrderSplashSectionBinding(View view, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = view;
        this.sectionList = recyclerView;
        this.sectionTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDirectIpoOrderSplashSectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29323R.layout.merge_direct_ipo_order_splash_section, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDirectIpoOrderSplashSectionBinding bind(View view) {
        int i = C29323R.id.section_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C29323R.id.section_title;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeDirectIpoOrderSplashSectionBinding(view, recyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
