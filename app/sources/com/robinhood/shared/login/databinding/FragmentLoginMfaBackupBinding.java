package com.robinhood.shared.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.designsystem.numpad.RdsNumpadContainerView;
import com.robinhood.shared.login.C39089R;

/* loaded from: classes6.dex */
public final class FragmentLoginMfaBackupBinding implements ViewBinding {
    public final RhEditText codeEdt;
    public final RdsNumpadContainerView numpad;
    private final LinearLayout rootView;

    private FragmentLoginMfaBackupBinding(LinearLayout linearLayout, RhEditText rhEditText, RdsNumpadContainerView rdsNumpadContainerView) {
        this.rootView = linearLayout;
        this.codeEdt = rhEditText;
        this.numpad = rdsNumpadContainerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLoginMfaBackupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentLoginMfaBackupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39089R.layout.fragment_login_mfa_backup, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentLoginMfaBackupBinding bind(View view) {
        int i = C39089R.id.code_edt;
        RhEditText rhEditText = (RhEditText) ViewBindings.findChildViewById(view, i);
        if (rhEditText != null) {
            i = C39089R.id.numpad;
            RdsNumpadContainerView rdsNumpadContainerView = (RdsNumpadContainerView) ViewBindings.findChildViewById(view, i);
            if (rdsNumpadContainerView != null) {
                return new FragmentLoginMfaBackupBinding((LinearLayout) view, rhEditText, rdsNumpadContainerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
