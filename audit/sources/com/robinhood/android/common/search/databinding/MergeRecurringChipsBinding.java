package com.robinhood.android.common.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeRecurringChipsBinding implements ViewBinding {
    public final CuratedListChipRecyclerView recurringChipsRecyclerView;
    public final RhTextView recurringChipsTitleTxt;
    private final View rootView;

    private MergeRecurringChipsBinding(View view, CuratedListChipRecyclerView curatedListChipRecyclerView, RhTextView rhTextView) {
        this.rootView = view;
        this.recurringChipsRecyclerView = curatedListChipRecyclerView;
        this.recurringChipsTitleTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRecurringChipsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11798R.layout.merge_recurring_chips, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRecurringChipsBinding bind(View view) {
        int i = C11798R.id.recurring_chips_recycler_view;
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) ViewBindings.findChildViewById(view, i);
        if (curatedListChipRecyclerView != null) {
            i = C11798R.id.recurring_chips_title_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeRecurringChipsBinding(view, curatedListChipRecyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
