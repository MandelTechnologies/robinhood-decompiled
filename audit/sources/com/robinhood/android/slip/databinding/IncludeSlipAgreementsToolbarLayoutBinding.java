package com.robinhood.android.slip.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.slip.C28532R;

/* loaded from: classes5.dex */
public final class IncludeSlipAgreementsToolbarLayoutBinding implements ViewBinding {
    public final RhTextView agreementTitle;
    public final RhTextView page;
    private final LinearLayout rootView;

    private IncludeSlipAgreementsToolbarLayoutBinding(LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.agreementTitle = rhTextView;
        this.page = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static IncludeSlipAgreementsToolbarLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static IncludeSlipAgreementsToolbarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C28532R.layout.include_slip_agreements_toolbar_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static IncludeSlipAgreementsToolbarLayoutBinding bind(View view) {
        int i = C28532R.id.agreement_title;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C28532R.id.page;
            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView2 != null) {
                return new IncludeSlipAgreementsToolbarLayoutBinding((LinearLayout) view, rhTextView, rhTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
