package com.robinhood.android.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.history.C18359R;

/* loaded from: classes10.dex */
public final class MergeAcatsDetailBannerViewBinding implements ViewBinding {
    public final RdsTextButton bannerButton;
    public final RhTextView bannerContent;
    public final RhTextView bannerDate;
    public final RhTextView bannerTitle;
    private final View rootView;

    private MergeAcatsDetailBannerViewBinding(View view, RdsTextButton rdsTextButton, RhTextView rhTextView, RhTextView rhTextView2, RhTextView rhTextView3) {
        this.rootView = view;
        this.bannerButton = rdsTextButton;
        this.bannerContent = rhTextView;
        this.bannerDate = rhTextView2;
        this.bannerTitle = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeAcatsDetailBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C18359R.layout.merge_acats_detail_banner_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeAcatsDetailBannerViewBinding bind(View view) {
        int i = C18359R.id.banner_button;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C18359R.id.banner_content;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C18359R.id.banner_date;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C18359R.id.banner_title;
                    RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView3 != null) {
                        return new MergeAcatsDetailBannerViewBinding(view, rdsTextButton, rhTextView, rhTextView2, rhTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
