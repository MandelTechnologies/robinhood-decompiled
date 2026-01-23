package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.designsystem.sparkle.SparkleButton;
import com.robinhood.android.profiles.p218ui.view.ProfileReferralView;

/* loaded from: classes24.dex */
public final class FragmentAccountCenterBinding implements ViewBinding {
    public final RecyclerView accountCenterRecyclerView;
    public final View profileReferralShadowView;
    public final ProfileReferralView profileReferralView;
    public final Barrier profileTransferBottomBarrier;
    public final Space profileTransferBottomSpace;
    public final SparkleButton profileTransferButton;
    public final ConstraintLayout profileTransferContent;
    public final Barrier profileTransferTopBarrier;
    public final Space profileTransferTopSpace;
    private final ConstraintLayout rootView;
    public final CoordinatorLayout snackbarContainer;

    private FragmentAccountCenterBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, ProfileReferralView profileReferralView, Barrier barrier, Space space, SparkleButton sparkleButton, ConstraintLayout constraintLayout2, Barrier barrier2, Space space2, CoordinatorLayout coordinatorLayout) {
        this.rootView = constraintLayout;
        this.accountCenterRecyclerView = recyclerView;
        this.profileReferralShadowView = view;
        this.profileReferralView = profileReferralView;
        this.profileTransferBottomBarrier = barrier;
        this.profileTransferBottomSpace = space;
        this.profileTransferButton = sparkleButton;
        this.profileTransferContent = constraintLayout2;
        this.profileTransferTopBarrier = barrier2;
        this.profileTransferTopSpace = space2;
        this.snackbarContainer = coordinatorLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAccountCenterBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentAccountCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C8293R.layout.fragment_account_center, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentAccountCenterBinding bind(View view) {
        View viewFindChildViewById;
        int i = C8293R.id.account_center_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C8293R.id.profile_referral_shadow_view))) != null) {
            i = C8293R.id.profile_referral_view;
            ProfileReferralView profileReferralView = (ProfileReferralView) ViewBindings.findChildViewById(view, i);
            if (profileReferralView != null) {
                i = C8293R.id.profile_transfer_bottom_barrier;
                Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                if (barrier != null) {
                    i = C8293R.id.profile_transfer_bottom_space;
                    Space space = (Space) ViewBindings.findChildViewById(view, i);
                    if (space != null) {
                        i = C8293R.id.profile_transfer_button;
                        SparkleButton sparkleButton = (SparkleButton) ViewBindings.findChildViewById(view, i);
                        if (sparkleButton != null) {
                            i = C8293R.id.profile_transfer_content;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = C8293R.id.profile_transfer_top_barrier;
                                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(view, i);
                                if (barrier2 != null) {
                                    i = C8293R.id.profile_transfer_top_space;
                                    Space space2 = (Space) ViewBindings.findChildViewById(view, i);
                                    if (space2 != null) {
                                        i = C8293R.id.snackbar_container;
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                        if (coordinatorLayout != null) {
                                            return new FragmentAccountCenterBinding((ConstraintLayout) view, recyclerView, viewFindChildViewById, profileReferralView, barrier, space, sparkleButton, constraintLayout, barrier2, space2, coordinatorLayout);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
