package com.robinhood.android.cash.transaction.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;

/* loaded from: classes7.dex */
public final class FragmentForcePostBottomSheetBinding implements ViewBinding {
    public final RhTextView forcePostDescription;
    public final RdsButton forcePostPrimaryBtn;
    public final RdsButton forcePostSecondaryBtn;
    public final RhTextView forcePostTitle;
    private final FocusSafeNestedScrollView rootView;

    private FragmentForcePostBottomSheetBinding(FocusSafeNestedScrollView focusSafeNestedScrollView, RhTextView rhTextView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = focusSafeNestedScrollView;
        this.forcePostDescription = rhTextView;
        this.forcePostPrimaryBtn = rdsButton;
        this.forcePostSecondaryBtn = rdsButton2;
        this.forcePostTitle = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FocusSafeNestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentForcePostBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentForcePostBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10421R.layout.fragment_force_post_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentForcePostBottomSheetBinding bind(View view) {
        int i = C10421R.id.force_post_description;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C10421R.id.force_post_primary_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C10421R.id.force_post_secondary_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C10421R.id.force_post_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        return new FragmentForcePostBottomSheetBinding((FocusSafeNestedScrollView) view, rhTextView, rdsButton, rdsButton2, rhTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
