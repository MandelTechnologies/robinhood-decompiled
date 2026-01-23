package com.robinhood.android.challenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.designsystem.row.RdsRowView;

/* loaded from: classes7.dex */
public final class FragmentUpdateMfaMethodBinding implements ViewBinding {
    private final ScrollView rootView;
    public final RdsRowView updateMfaAuthenticatorAppRow;
    public final RdsRowView updateMfaTextMessageRow;

    private FragmentUpdateMfaMethodBinding(ScrollView scrollView, RdsRowView rdsRowView, RdsRowView rdsRowView2) {
        this.rootView = scrollView;
        this.updateMfaAuthenticatorAppRow = rdsRowView;
        this.updateMfaTextMessageRow = rdsRowView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentUpdateMfaMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentUpdateMfaMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C10497R.layout.fragment_update_mfa_method, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentUpdateMfaMethodBinding bind(View view) {
        int i = C10497R.id.update_mfa_authenticator_app_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C10497R.id.update_mfa_text_message_row;
            RdsRowView rdsRowView2 = (RdsRowView) ViewBindings.findChildViewById(view, i);
            if (rdsRowView2 != null) {
                return new FragmentUpdateMfaMethodBinding((ScrollView) view, rdsRowView, rdsRowView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
