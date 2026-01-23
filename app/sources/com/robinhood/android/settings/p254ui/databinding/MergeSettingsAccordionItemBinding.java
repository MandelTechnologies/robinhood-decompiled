package com.robinhood.android.settings.p254ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.settings.p254ui.C28356R;

/* loaded from: classes5.dex */
public final class MergeSettingsAccordionItemBinding implements ViewBinding {
    public final RecyclerView recyclerView;
    private final LinearLayout rootView;
    public final RhTextView summaryTxt;

    private MergeSettingsAccordionItemBinding(LinearLayout linearLayout, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = linearLayout;
        this.recyclerView = recyclerView;
        this.summaryTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static MergeSettingsAccordionItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MergeSettingsAccordionItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28356R.layout.merge_settings_accordion_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static MergeSettingsAccordionItemBinding bind(View view) {
        int i = C28356R.id.recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C28356R.id.summary_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeSettingsAccordionItemBinding((LinearLayout) view, recyclerView, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
