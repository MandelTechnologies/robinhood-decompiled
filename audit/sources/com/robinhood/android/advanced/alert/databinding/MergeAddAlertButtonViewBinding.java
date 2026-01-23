package com.robinhood.android.advanced.alert.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class MergeAddAlertButtonViewBinding implements ViewBinding {
    public final RdsButton addAlertBtn;
    public final RhTextView addAlertSubtitle;
    private final View rootView;

    private MergeAddAlertButtonViewBinding(View view, RdsButton rdsButton, RhTextView rhTextView) {
        this.rootView = view;
        this.addAlertBtn = rdsButton;
        this.addAlertSubtitle = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeAddAlertButtonViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C8387R.layout.merge_add_alert_button_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeAddAlertButtonViewBinding bind(View view) {
        int i = C8387R.id.add_alert_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C8387R.id.add_alert_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeAddAlertButtonViewBinding(view, rdsButton, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
