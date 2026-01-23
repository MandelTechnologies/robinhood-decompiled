package com.robinhood.android.cash.disputes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.designsystem.row.component.RdsRowMetadataContainerView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.selectioncontrol.NewRdsCheckBox;

/* loaded from: classes7.dex */
public final class MergeTransactionMultiSelectionRowViewBinding implements ViewBinding {
    private final View rootView;
    public final View transactionMultiSelectionBottomDivider;
    public final NewRdsCheckBox transactionMultiSelectionCheckBox;
    public final RdsRowMetadataContainerView transactionMultiSelectionMetadataContainer;
    public final RdsRowTextContainerView transactionMultiSelectionTextContainer;

    private MergeTransactionMultiSelectionRowViewBinding(View view, View view2, NewRdsCheckBox newRdsCheckBox, RdsRowMetadataContainerView rdsRowMetadataContainerView, RdsRowTextContainerView rdsRowTextContainerView) {
        this.rootView = view;
        this.transactionMultiSelectionBottomDivider = view2;
        this.transactionMultiSelectionCheckBox = newRdsCheckBox;
        this.transactionMultiSelectionMetadataContainer = rdsRowMetadataContainerView;
        this.transactionMultiSelectionTextContainer = rdsRowTextContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeTransactionMultiSelectionRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10007R.layout.merge_transaction_multi_selection_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeTransactionMultiSelectionRowViewBinding bind(View view) {
        int i = C10007R.id.transaction_multi_selection_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C10007R.id.transaction_multi_selection_check_box;
            NewRdsCheckBox newRdsCheckBox = (NewRdsCheckBox) ViewBindings.findChildViewById(view, i);
            if (newRdsCheckBox != null) {
                i = C10007R.id.transaction_multi_selection_metadata_container;
                RdsRowMetadataContainerView rdsRowMetadataContainerView = (RdsRowMetadataContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsRowMetadataContainerView != null) {
                    i = C10007R.id.transaction_multi_selection_text_container;
                    RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowTextContainerView != null) {
                        return new MergeTransactionMultiSelectionRowViewBinding(view, viewFindChildViewById, newRdsCheckBox, rdsRowMetadataContainerView, rdsRowTextContainerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
