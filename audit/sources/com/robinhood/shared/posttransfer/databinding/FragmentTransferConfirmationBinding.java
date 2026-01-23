package com.robinhood.shared.posttransfer.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.shared.posttransfer.C39496R;

/* loaded from: classes6.dex */
public final class FragmentTransferConfirmationBinding implements ViewBinding {
    public final RhTextView additionalDetailTxt;
    public final RdsInfoBannerView banner;
    public final ClientComponentButtonView detailBtn;
    public final RhTextView detailTxt;
    public final RdsButton primaryBtn;
    private final LinearLayout rootView;
    public final RhTextView titleTxt;

    private FragmentTransferConfirmationBinding(LinearLayout linearLayout, RhTextView rhTextView, RdsInfoBannerView rdsInfoBannerView, ClientComponentButtonView clientComponentButtonView, RhTextView rhTextView2, RdsButton rdsButton, RhTextView rhTextView3) {
        this.rootView = linearLayout;
        this.additionalDetailTxt = rhTextView;
        this.banner = rdsInfoBannerView;
        this.detailBtn = clientComponentButtonView;
        this.detailTxt = rhTextView2;
        this.primaryBtn = rdsButton;
        this.titleTxt = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTransferConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentTransferConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C39496R.layout.fragment_transfer_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentTransferConfirmationBinding bind(View view) {
        int i = C39496R.id.additional_detail_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C39496R.id.banner;
            RdsInfoBannerView rdsInfoBannerView = (RdsInfoBannerView) ViewBindings.findChildViewById(view, i);
            if (rdsInfoBannerView != null) {
                i = C39496R.id.detail_btn;
                ClientComponentButtonView clientComponentButtonView = (ClientComponentButtonView) ViewBindings.findChildViewById(view, i);
                if (clientComponentButtonView != null) {
                    i = C39496R.id.detail_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C39496R.id.primary_btn;
                        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton != null) {
                            i = C39496R.id.title_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                return new FragmentTransferConfirmationBinding((LinearLayout) view, rhTextView, rdsInfoBannerView, clientComponentButtonView, rhTextView2, rdsButton, rhTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
