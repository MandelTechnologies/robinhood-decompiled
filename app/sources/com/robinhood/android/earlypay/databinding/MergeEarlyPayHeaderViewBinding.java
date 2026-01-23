package com.robinhood.android.earlypay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.earlypay.C14433R;

/* loaded from: classes7.dex */
public final class MergeEarlyPayHeaderViewBinding implements ViewBinding {
    public final RhTextView earlyPayEnrollmentDisclosure;
    private final View rootView;

    private MergeEarlyPayHeaderViewBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.earlyPayEnrollmentDisclosure = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeEarlyPayHeaderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14433R.layout.merge_early_pay_header_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeEarlyPayHeaderViewBinding bind(View view) {
        int i = C14433R.id.early_pay_enrollment_disclosure;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new MergeEarlyPayHeaderViewBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
