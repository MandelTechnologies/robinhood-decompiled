package com.robinhood.android.rhymigration.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhymigration.C27577R;

/* loaded from: classes5.dex */
public final class ActivityRhyFeatureDisclosureBinding implements ViewBinding {
    public final ScrollView rhyFeatureDisclosureContainer;
    public final RdsButton rhyFeatureDisclosureOkBtn;
    public final RhTextView rhyFeatureDisclosureTxt;
    private final ConstraintLayout rootView;

    private ActivityRhyFeatureDisclosureBinding(ConstraintLayout constraintLayout, ScrollView scrollView, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.rhyFeatureDisclosureContainer = scrollView;
        this.rhyFeatureDisclosureOkBtn = rdsButton;
        this.rhyFeatureDisclosureTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityRhyFeatureDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityRhyFeatureDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C27577R.layout.activity_rhy_feature_disclosure, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static ActivityRhyFeatureDisclosureBinding bind(View view) {
        int i = C27577R.id.rhy_feature_disclosure_container;
        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
        if (scrollView != null) {
            i = C27577R.id.rhy_feature_disclosure_ok_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C27577R.id.rhy_feature_disclosure_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new ActivityRhyFeatureDisclosureBinding((ConstraintLayout) view, scrollView, rdsButton, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
