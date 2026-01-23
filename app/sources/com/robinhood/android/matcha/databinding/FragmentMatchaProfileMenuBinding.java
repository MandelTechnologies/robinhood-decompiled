package com.robinhood.android.matcha.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.matcha.C21284R;

/* loaded from: classes8.dex */
public final class FragmentMatchaProfileMenuBinding implements ViewBinding {
    public final RdsRowView blockRow;
    public final RdsButton closeButton;
    public final RdsRowView reportRow;
    private final LinearLayout rootView;
    public final RdsRowView viewProfileRow;

    private FragmentMatchaProfileMenuBinding(LinearLayout linearLayout, RdsRowView rdsRowView, RdsButton rdsButton, RdsRowView rdsRowView2, RdsRowView rdsRowView3) {
        this.rootView = linearLayout;
        this.blockRow = rdsRowView;
        this.closeButton = rdsButton;
        this.reportRow = rdsRowView2;
        this.viewProfileRow = rdsRowView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchaProfileMenuBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentMatchaProfileMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21284R.layout.fragment_matcha_profile_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentMatchaProfileMenuBinding bind(View view) {
        int i = C21284R.id.block_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C21284R.id.close_button;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C21284R.id.report_row;
                RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                if (rdsRowView2 != null) {
                    i = C21284R.id.view_profile_row;
                    RdsRowView rdsRowView3 = (RdsRowView) ViewBindings.findChildViewById(view, i);
                    if (rdsRowView3 != null) {
                        return new FragmentMatchaProfileMenuBinding((LinearLayout) view, rdsRowView, rdsButton, rdsRowView2, rdsRowView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
