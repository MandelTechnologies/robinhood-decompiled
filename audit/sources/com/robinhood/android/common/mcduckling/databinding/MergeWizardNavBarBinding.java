package com.robinhood.android.common.mcduckling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeWizardNavBarBinding implements ViewBinding {
    public final RhTextView navBarBackBtn;
    public final RhTextView navBarContinueBtn;
    private final View rootView;

    private MergeWizardNavBarBinding(View view, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.navBarBackBtn = rhTextView;
        this.navBarContinueBtn = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeWizardNavBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11257R.layout.merge_wizard_nav_bar, viewGroup);
        return bind(viewGroup);
    }

    public static MergeWizardNavBarBinding bind(View view) {
        int i = C11257R.id.nav_bar_back_btn;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11257R.id.nav_bar_continue_btn;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new MergeWizardNavBarBinding(view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
