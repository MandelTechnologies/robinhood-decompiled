package com.robinhood.android.optionsupgrade.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.optionsupgrade.C25121R;

/* loaded from: classes11.dex */
public final class FragmentOptionUpgradeDeniedBinding implements ViewBinding {
    public final RdsButton negativeBtn;
    public final RhTextView optionUpgradeStatusDetailTxt;
    public final ImageView optionUpgradeStatusImg;
    public final RhTextView optionUpgradeStatusTitleTxt;
    public final RdsButton positiveBtn;
    private final LinearLayout rootView;

    private FragmentOptionUpgradeDeniedBinding(LinearLayout linearLayout, RdsButton rdsButton, RhTextView rhTextView, ImageView imageView, RhTextView rhTextView2, RdsButton rdsButton2) {
        this.rootView = linearLayout;
        this.negativeBtn = rdsButton;
        this.optionUpgradeStatusDetailTxt = rhTextView;
        this.optionUpgradeStatusImg = imageView;
        this.optionUpgradeStatusTitleTxt = rhTextView2;
        this.positiveBtn = rdsButton2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOptionUpgradeDeniedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentOptionUpgradeDeniedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25121R.layout.fragment_option_upgrade_denied, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentOptionUpgradeDeniedBinding bind(View view) {
        int i = C25121R.id.negative_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C25121R.id.option_upgrade_status_detail_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25121R.id.option_upgrade_status_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C25121R.id.option_upgrade_status_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C25121R.id.positive_btn;
                        RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                        if (rdsButton2 != null) {
                            return new FragmentOptionUpgradeDeniedBinding((LinearLayout) view, rdsButton, rhTextView, imageView, rhTextView2, rdsButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
