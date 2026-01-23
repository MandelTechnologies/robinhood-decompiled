package com.robinhood.android.equitydetail.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.p088ui.view.DisclosureView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;

/* loaded from: classes3.dex */
public final class FragmentDirectIpoIndicationOfInterestBottomSheetBinding implements ViewBinding {
    public final RdsButton buttonAccept;
    public final RdsButton buttonDismiss;
    public final RhTextView footer;
    public final LinearLayout fragmentDirectIpoIndicationOfInterest;
    public final RecyclerView list;
    private final LinearLayout rootView;
    public final DisclosureView scrollView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentDirectIpoIndicationOfInterestBottomSheetBinding(LinearLayout linearLayout, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView, LinearLayout linearLayout2, RecyclerView recyclerView, DisclosureView disclosureView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.buttonAccept = rdsButton;
        this.buttonDismiss = rdsButton2;
        this.footer = rhTextView;
        this.fragmentDirectIpoIndicationOfInterest = linearLayout2;
        this.list = recyclerView;
        this.scrollView = disclosureView;
        this.subtitle = rhTextView2;
        this.title = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoIndicationOfInterestBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoIndicationOfInterestBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C15314R.layout.fragment_direct_ipo_indication_of_interest_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoIndicationOfInterestBottomSheetBinding bind(View view) {
        int i = C15314R.id.button_accept;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C15314R.id.button_dismiss;
            RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton2 != null) {
                i = C15314R.id.footer;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i = C15314R.id.list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C15314R.id.scroll_view;
                        DisclosureView disclosureView = (DisclosureView) ViewBindings.findChildViewById(view, i);
                        if (disclosureView != null) {
                            i = C15314R.id.subtitle;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                i = C15314R.id.title;
                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView3 != null) {
                                    return new FragmentDirectIpoIndicationOfInterestBottomSheetBinding(linearLayout, rdsButton, rdsButton2, rhTextView, linearLayout, recyclerView, disclosureView, rhTextView2, rhTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
