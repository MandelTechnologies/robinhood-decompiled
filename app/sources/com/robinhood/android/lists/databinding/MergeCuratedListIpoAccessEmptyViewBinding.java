package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class MergeCuratedListIpoAccessEmptyViewBinding implements ViewBinding {
    public final RhTextView curatedListIpoAccessEmptySubtitle;
    public final RhTextView curatedListIpoAccessEmptyTitle;
    private final View rootView;

    private MergeCuratedListIpoAccessEmptyViewBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.curatedListIpoAccessEmptySubtitle = rhTextView;
        this.curatedListIpoAccessEmptyTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeCuratedListIpoAccessEmptyViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C20839R.layout.merge_curated_list_ipo_access_empty_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeCuratedListIpoAccessEmptyViewBinding bind(View view) {
        int i = C20839R.id.curated_list_ipo_access_empty_subtitle;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C20839R.id.curated_list_ipo_access_empty_title;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeCuratedListIpoAccessEmptyViewBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
