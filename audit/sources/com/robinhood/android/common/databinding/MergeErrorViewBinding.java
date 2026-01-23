package com.robinhood.android.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes2.dex */
public final class MergeErrorViewBinding implements ViewBinding {
    public final RhTextView errorDescriptionTxt;
    public final ImageView errorIconImg;
    public final RdsButton errorPrimaryBtn;
    public final RdsButton errorSecondaryBtn;
    public final RhTextView errorTitleTxt;
    private final View rootView;

    private MergeErrorViewBinding(View view, RhTextView rhTextView, ImageView imageView, RdsButton rdsButton, RdsButton rdsButton2, RhTextView rhTextView2) {
        this.rootView = view;
        this.errorDescriptionTxt = rhTextView;
        this.errorIconImg = imageView;
        this.errorPrimaryBtn = rdsButton;
        this.errorSecondaryBtn = rdsButton2;
        this.errorTitleTxt = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeErrorViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C11048R.layout.merge_error_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeErrorViewBinding bind(View view) {
        int i = C11048R.id.error_description_txt;
        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
        if (rhTextView != null) {
            i = C11048R.id.error_icon_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C11048R.id.error_primary_btn;
                RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton != null) {
                    i = C11048R.id.error_secondary_btn;
                    RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                    if (rdsButton2 != null) {
                        i = C11048R.id.error_title_txt;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new MergeErrorViewBinding(view, rhTextView, imageView, rdsButton, rdsButton2, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
