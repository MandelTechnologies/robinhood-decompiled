package com.robinhood.android.common.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.common.search.p087ui.RecurringCarousel;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeTopRecurringListBinding implements ViewBinding {
    public final RecurringCarousel recurringCarousel;
    private final View rootView;
    public final RhTextView topRecurringListDescription;
    public final RhTextView topRecurringListTitle;

    private MergeTopRecurringListBinding(View view, RecurringCarousel recurringCarousel, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.recurringCarousel = recurringCarousel;
        this.topRecurringListDescription = rhTextView;
        this.topRecurringListTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeTopRecurringListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11798R.layout.merge_top_recurring_list, viewGroup);
        return bind(viewGroup);
    }

    public static MergeTopRecurringListBinding bind(View view) {
        int i = C11798R.id.recurring_carousel;
        RecurringCarousel recurringCarousel = (RecurringCarousel) ViewBindings.findChildViewById(view, i);
        if (recurringCarousel != null) {
            i = C11798R.id.top_recurring_list_description;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C11798R.id.top_recurring_list_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new MergeTopRecurringListBinding(view, recurringCarousel, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
