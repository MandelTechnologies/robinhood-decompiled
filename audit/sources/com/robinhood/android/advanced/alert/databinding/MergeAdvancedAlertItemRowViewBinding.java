package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.selectioncontrol.RdsSwitch;

/* loaded from: classes24.dex */
public final class MergeAdvancedAlertItemRowViewBinding implements ViewBinding {
    private final View rootView;
    public final View rowBottomDivider;
    public final ImageView rowEditIcon;
    public final RdsRowTextContainerView rowTextContainer;
    public final RdsSwitch rowToggleSwitch;

    private MergeAdvancedAlertItemRowViewBinding(View view, View view2, ImageView imageView, RdsRowTextContainerView rdsRowTextContainerView, RdsSwitch rdsSwitch) {
        this.rootView = view;
        this.rowBottomDivider = view2;
        this.rowEditIcon = imageView;
        this.rowTextContainer = rdsRowTextContainerView;
        this.rowToggleSwitch = rdsSwitch;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeAdvancedAlertItemRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C8387R.layout.merge_advanced_alert_item_row_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeAdvancedAlertItemRowViewBinding bind(View view) {
        int i = C8387R.id.row_bottom_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C8387R.id.row_edit_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C8387R.id.row_text_container;
                RdsRowTextContainerView rdsRowTextContainerView = (RdsRowTextContainerView) ViewBindings.findChildViewById(view, i);
                if (rdsRowTextContainerView != null) {
                    i = C8387R.id.row_toggle_switch;
                    RdsSwitch rdsSwitch = (RdsSwitch) ViewBindings.findChildViewById(view, i);
                    if (rdsSwitch != null) {
                        return new MergeAdvancedAlertItemRowViewBinding(view, viewFindChildViewById, imageView, rdsRowTextContainerView, rdsSwitch);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
