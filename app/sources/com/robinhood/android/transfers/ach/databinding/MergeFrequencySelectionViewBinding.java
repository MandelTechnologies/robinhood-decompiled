package com.robinhood.android.transfers.ach.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.transfers.ach.C30082R;

/* loaded from: classes9.dex */
public final class MergeFrequencySelectionViewBinding implements ViewBinding {
    private final View rootView;
    public final View rowBottomDivider;
    public final RdsRowTextContainerView rowTextContainer;
    public final ViewStub rowTrailingIcon;

    private MergeFrequencySelectionViewBinding(View view, View view2, RdsRowTextContainerView rdsRowTextContainerView, ViewStub viewStub) {
        this.rootView = view;
        this.rowBottomDivider = view2;
        this.rowTextContainer = rdsRowTextContainerView;
        this.rowTrailingIcon = viewStub;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeFrequencySelectionViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C30082R.layout.merge_frequency_selection_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeFrequencySelectionViewBinding bind(View view) {
        int i = C30082R.id.row_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C30082R.id.row_text_container;
            RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsRowTextContainerView != null) {
                i = C30082R.id.row_trailing_icon;
                ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(view, i);
                if (viewStub != null) {
                    return new MergeFrequencySelectionViewBinding(view, viewFindChildViewById, rdsRowTextContainerView, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
