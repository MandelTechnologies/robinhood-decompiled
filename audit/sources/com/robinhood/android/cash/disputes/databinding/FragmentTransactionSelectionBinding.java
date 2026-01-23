package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.view.DateSelectionView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentTransactionSelectionBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RdsButton transactionSelectionContinueButton;
    public final DateSelectionView transactionSelectionDateSelection;
    public final RhTextView transactionSelectionEmptyDescription;
    public final ImageView transactionSelectionEmptyImage;
    public final RhTextView transactionSelectionEmptyTitle;
    public final RecyclerView transactionSelectionRecyclerView;
    public final RdsButton transactionSelectionReviewButton;
    public final ConstraintLayout transactionSelectionRootLayout;
    public final CoordinatorLayout transactionSelectionSnackbarContainer;
    public final RhTextView transactionSelectionSubtitle;
    public final RhTextView transactionSelectionTitle;

    private FragmentTransactionSelectionBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, DateSelectionView dateSelectionView, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RecyclerView recyclerView, RdsButton rdsButton2, ConstraintLayout constraintLayout2, CoordinatorLayout coordinatorLayout, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.transactionSelectionContinueButton = rdsButton;
        this.transactionSelectionDateSelection = dateSelectionView;
        this.transactionSelectionEmptyDescription = rhTextView;
        this.transactionSelectionEmptyImage = imageView;
        this.transactionSelectionEmptyTitle = rhTextView2;
        this.transactionSelectionRecyclerView = recyclerView;
        this.transactionSelectionReviewButton = rdsButton2;
        this.transactionSelectionRootLayout = constraintLayout2;
        this.transactionSelectionSnackbarContainer = coordinatorLayout;
        this.transactionSelectionSubtitle = rhTextView3;
        this.transactionSelectionTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransactionSelectionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransactionSelectionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_transaction_selection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransactionSelectionBinding bind(View view) {
        int i = C10007R.id.transaction_selection_continue_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10007R.id.transaction_selection_date_selection;
            DateSelectionView dateSelectionView = (DateSelectionView) ViewBindings.findChildViewById(view, i);
            if (dateSelectionView != null) {
                i = C10007R.id.transaction_selection_empty_description;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10007R.id.transaction_selection_empty_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C10007R.id.transaction_selection_empty_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C10007R.id.transaction_selection_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C10007R.id.transaction_selection_review_button;
                                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                if (rdsButton2 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                    i = C10007R.id.transaction_selection_snackbar_container;
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                    if (coordinatorLayout != null) {
                                        i = C10007R.id.transaction_selection_subtitle;
                                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView3 != null) {
                                            i = C10007R.id.transaction_selection_title;
                                            RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView4 != null) {
                                                return new FragmentTransactionSelectionBinding(constraintLayout, rdsButton, dateSelectionView, rhTextView, imageView, rhTextView2, recyclerView, rdsButton2, constraintLayout, coordinatorLayout, rhTextView3, rhTextView4);
                                            }
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
