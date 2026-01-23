package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.row.component.RdsRowMetadataContainerView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;

/* loaded from: classes7.dex */
public final class MergeTransactionSingleSelectionRowViewBinding implements ViewBinding {
    private final View rootView;
    public final View transactionSingleSelectionBottomDivider;
    public final RdsRowMetadataContainerView transactionSingleSelectionMetadataContainer;
    public final ImageView transactionSingleSelectionRadioButton;
    public final RdsRowTextContainerView transactionSingleSelectionTextContainer;

    private MergeTransactionSingleSelectionRowViewBinding(View view, View view2, RdsRowMetadataContainerView rdsRowMetadataContainerView, ImageView imageView, RdsRowTextContainerView rdsRowTextContainerView) {
        this.rootView = view;
        this.transactionSingleSelectionBottomDivider = view2;
        this.transactionSingleSelectionMetadataContainer = rdsRowMetadataContainerView;
        this.transactionSingleSelectionRadioButton = imageView;
        this.transactionSingleSelectionTextContainer = rdsRowTextContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeTransactionSingleSelectionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10007R.layout.merge_transaction_single_selection_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeTransactionSingleSelectionRowViewBinding bind(View view) {
        int i = C10007R.id.transaction_single_selection_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C10007R.id.transaction_single_selection_metadata_container;
            RdsRowMetadataContainerView rdsRowMetadataContainerView = (RdsRowMetadataContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsRowMetadataContainerView != null) {
                i = C10007R.id.transaction_single_selection_radio_button;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C10007R.id.transaction_single_selection_text_container;
                    RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowTextContainerView != null) {
                        return new MergeTransactionSingleSelectionRowViewBinding(view, viewFindChildViewById, rdsRowMetadataContainerView, imageView, rdsRowTextContainerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
