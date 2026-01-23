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
import com.robinhood.android.cash.disputes.view.transaction.TransactionSingleSelectionRowView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class FragmentDuplicateAuthorizedTransactionBinding implements ViewBinding {
    public final RdsButton duplicateTransactionContinueButton;
    public final DateSelectionView duplicateTransactionDateSelection;
    public final RhTextView duplicateTransactionEmptyDescription;
    public final ImageView duplicateTransactionEmptyImage;
    public final RhTextView duplicateTransactionEmptyTitle;
    public final View duplicateTransactionPreviousSelectionDivider;
    public final TransactionSingleSelectionRowView duplicateTransactionPreviousSelectionRow;
    public final RecyclerView duplicateTransactionRecyclerView;
    public final RdsButton duplicateTransactionReviewButton;
    public final ConstraintLayout duplicateTransactionRootLayout;
    public final CoordinatorLayout duplicateTransactionSnackbarContainer;
    public final RhTextView duplicateTransactionSubtitle;
    public final RhTextView duplicateTransactionTitle;
    private final ConstraintLayout rootView;

    private FragmentDuplicateAuthorizedTransactionBinding(ConstraintLayout constraintLayout, RdsButton rdsButton, DateSelectionView dateSelectionView, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, View view, TransactionSingleSelectionRowView transactionSingleSelectionRowView, RecyclerView recyclerView, RdsButton rdsButton2, ConstraintLayout constraintLayout2, CoordinatorLayout coordinatorLayout, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = constraintLayout;
        this.duplicateTransactionContinueButton = rdsButton;
        this.duplicateTransactionDateSelection = dateSelectionView;
        this.duplicateTransactionEmptyDescription = rhTextView;
        this.duplicateTransactionEmptyImage = imageView;
        this.duplicateTransactionEmptyTitle = rhTextView2;
        this.duplicateTransactionPreviousSelectionDivider = view;
        this.duplicateTransactionPreviousSelectionRow = transactionSingleSelectionRowView;
        this.duplicateTransactionRecyclerView = recyclerView;
        this.duplicateTransactionReviewButton = rdsButton2;
        this.duplicateTransactionRootLayout = constraintLayout2;
        this.duplicateTransactionSnackbarContainer = coordinatorLayout;
        this.duplicateTransactionSubtitle = rhTextView3;
        this.duplicateTransactionTitle = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDuplicateAuthorizedTransactionBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDuplicateAuthorizedTransactionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10007R.layout.fragment_duplicate_authorized_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDuplicateAuthorizedTransactionBinding bind(View view) {
        View viewFindChildViewById;
        int i = C10007R.id.duplicate_transaction_continue_button;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C10007R.id.duplicate_transaction_date_selection;
            DateSelectionView dateSelectionView = (DateSelectionView) ViewBindings.findChildViewById(view, i);
            if (dateSelectionView != null) {
                i = C10007R.id.duplicate_transaction_empty_description;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10007R.id.duplicate_transaction_empty_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C10007R.id.duplicate_transaction_empty_title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C10007R.id.duplicate_transaction_previous_selection_divider))) != null) {
                            i = C10007R.id.duplicate_transaction_previous_selection_row;
                            TransactionSingleSelectionRowView transactionSingleSelectionRowView = (TransactionSingleSelectionRowView) ViewBindings.findChildViewById(view, i);
                            if (transactionSingleSelectionRowView != null) {
                                i = C10007R.id.duplicate_transaction_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = C10007R.id.duplicate_transaction_review_button;
                                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                                    if (rdsButton2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = C10007R.id.duplicate_transaction_snackbar_container;
                                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                        if (coordinatorLayout != null) {
                                            i = C10007R.id.duplicate_transaction_subtitle;
                                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                            if (rhTextView3 != null) {
                                                i = C10007R.id.duplicate_transaction_title;
                                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView4 != null) {
                                                    return new FragmentDuplicateAuthorizedTransactionBinding(constraintLayout, rdsButton, dateSelectionView, rhTextView, imageView, rhTextView2, viewFindChildViewById, transactionSingleSelectionRowView, recyclerView, rdsButton2, constraintLayout, coordinatorLayout, rhTextView3, rhTextView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
