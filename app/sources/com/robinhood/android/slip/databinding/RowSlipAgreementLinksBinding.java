package com.robinhood.android.slip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.slip.C28532R;

/* loaded from: classes5.dex */
public final class RowSlipAgreementLinksBinding implements ViewBinding {
    public final RhTextView agreementLink;
    private final View rootView;

    private RowSlipAgreementLinksBinding(View view, RhTextView rhTextView) {
        this.rootView = view;
        this.agreementLink = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static RowSlipAgreementLinksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C28532R.layout.row_slip_agreement_links, viewGroup);
        return bind(viewGroup);
    }

    public static RowSlipAgreementLinksBinding bind(View view) {
        int i = C28532R.id.agreement_link;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            return new RowSlipAgreementLinksBinding(view, rhTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
