package com.robinhood.android.paycheckhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.paycheckhub.C25434R;

/* loaded from: classes11.dex */
public final class FragmentManageDirectDepositBinding implements ViewBinding {
    public final FrameLayout achAccountInfoFragmentContainer;
    public final RdsButton addDirectDepositButton;
    public final RecyclerView directDepositRecyclerView;
    public final FrameLayout earlyPayToggleFragmentContainer;
    public final RhTextView moveMoneyRelationshipsSectionHeaderTxt;
    private final NestedScrollView rootView;

    private FragmentManageDirectDepositBinding(NestedScrollView nestedScrollView, FrameLayout frameLayout, RdsButton rdsButton, RecyclerView recyclerView, FrameLayout frameLayout2, RhTextView rhTextView) {
        this.rootView = nestedScrollView;
        this.achAccountInfoFragmentContainer = frameLayout;
        this.addDirectDepositButton = rdsButton;
        this.directDepositRecyclerView = recyclerView;
        this.earlyPayToggleFragmentContainer = frameLayout2;
        this.moveMoneyRelationshipsSectionHeaderTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentManageDirectDepositBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentManageDirectDepositBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25434R.layout.fragment_manage_direct_deposit, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentManageDirectDepositBinding bind(View view) {
        int i = C25434R.id.ach_account_info_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C25434R.id.add_direct_deposit_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C25434R.id.direct_deposit_recycler_view;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C25434R.id.early_pay_toggle_fragment_container;
                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout2 != null) {
                        i = C25434R.id.move_money_relationships_section_header_txt;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            return new FragmentManageDirectDepositBinding((NestedScrollView) view, frameLayout, rdsButton, recyclerView, frameLayout2, rhTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
