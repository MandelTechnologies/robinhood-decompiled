package com.robinhood.android.common.margin.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.view.ProgressChecklistView;

/* loaded from: classes2.dex */
public final class FragmentMarginEligibilityChecklistGoldBinding implements ViewBinding {
    public final ProgressChecklistView checklist;
    private final ScrollView rootView;
    public final LinearLayout scrimLayout;

    private FragmentMarginEligibilityChecklistGoldBinding(ScrollView scrollView, ProgressChecklistView progressChecklistView, LinearLayout linearLayout) {
        this.rootView = scrollView;
        this.checklist = progressChecklistView;
        this.scrimLayout = linearLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentMarginEligibilityChecklistGoldBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMarginEligibilityChecklistGoldBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C11223R.layout.fragment_margin_eligibility_checklist_gold, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMarginEligibilityChecklistGoldBinding bind(View view) {
        int i = C11223R.id.checklist;
        ProgressChecklistView progressChecklistView = (ProgressChecklistView) ViewBindings.findChildViewById(view, i);
        if (progressChecklistView != null) {
            i = C11223R.id.scrim_layout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                return new FragmentMarginEligibilityChecklistGoldBinding((ScrollView) view, progressChecklistView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
