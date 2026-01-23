package com.robinhood.shared.pathfinder.corepages.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.pathfinder.corepages.C39352R;

/* loaded from: classes6.dex */
public final class FragmentSupportLandingAccountSelectionBottomSheetBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton supportLandingAccountSelectionSheetCloseBtn;
    public final RecyclerView supportLandingAccountSelectionSheetList;
    public final RhTextView supportLandingAccountSelectionSheetTitle;

    private FragmentSupportLandingAccountSelectionBottomSheetBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView) {
        this.rootView = constraintLayout;
        this.supportLandingAccountSelectionSheetCloseBtn = rdsButton;
        this.supportLandingAccountSelectionSheetList = recyclerView;
        this.supportLandingAccountSelectionSheetTitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSupportLandingAccountSelectionBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentSupportLandingAccountSelectionBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39352R.layout.fragment_support_landing_account_selection_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentSupportLandingAccountSelectionBottomSheetBinding bind(View view) {
        int i = C39352R.id.support_landing_account_selection_sheet_close_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C39352R.id.support_landing_account_selection_sheet_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C39352R.id.support_landing_account_selection_sheet_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    return new FragmentSupportLandingAccountSelectionBottomSheetBinding((ConstraintLayout) view, rdsButton, recyclerView, rhTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
