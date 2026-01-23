package com.robinhood.android.lists.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.lists.C20839R;

/* loaded from: classes8.dex */
public final class FragmentIpoNotificationBottomSheetBinding implements ViewBinding {
    public final RdsButton noBtn;
    private final LinearLayout rootView;
    public final RdsButton yesBtn;

    private FragmentIpoNotificationBottomSheetBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.noBtn = rdsButton;
        this.yesBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentIpoNotificationBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentIpoNotificationBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C20839R.layout.fragment_ipo_notification_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentIpoNotificationBottomSheetBinding bind(View view) {
        int i = C20839R.id.no_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C20839R.id.yes_btn;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                return new FragmentIpoNotificationBottomSheetBinding((LinearLayout) view, rdsButton, rdsButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
