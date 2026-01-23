package com.robinhood.iac.statusbanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.iac.statusbanner.C33353R;

/* loaded from: classes15.dex */
public final class MergeIacStatusBannerViewBinding implements ViewBinding {
    public final View iacStatusBannerRuleLine;
    public final RhTextView iacStatusBannerTxt;
    private final View rootView;

    private MergeIacStatusBannerViewBinding(View view, View view2, RhTextView rhTextView) {
        this.rootView = view;
        this.iacStatusBannerRuleLine = view2;
        this.iacStatusBannerTxt = rhTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIacStatusBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C33353R.layout.merge_iac_status_banner_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIacStatusBannerViewBinding bind(View view) {
        int i = C33353R.id.iac_status_banner_rule_line;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C33353R.id.iac_status_banner_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                return new MergeIacStatusBannerViewBinding(view, viewFindChildViewById, rhTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
