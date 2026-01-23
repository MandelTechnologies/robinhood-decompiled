package com.robinhood.android.employment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.employment.C14481R;

/* loaded from: classes7.dex */
public final class FragmentChooseEmploymentStatusBinding implements ViewBinding {
    public final RecyclerView employmentStatusRecyclerView;
    public final RhTextView employmentStatusSubtitle;
    public final RhTextView employmentStatusTitle;
    private final LinearLayout rootView;

    private FragmentChooseEmploymentStatusBinding(LinearLayout linearLayout, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.employmentStatusRecyclerView = recyclerView;
        this.employmentStatusSubtitle = rhTextView;
        this.employmentStatusTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseEmploymentStatusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentChooseEmploymentStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14481R.layout.fragment_choose_employment_status, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentChooseEmploymentStatusBinding bind(View view) {
        int i = C14481R.id.employment_status_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C14481R.id.employment_status_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C14481R.id.employment_status_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    return new FragmentChooseEmploymentStatusBinding((LinearLayout) view, recyclerView, rhTextView, rhTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
