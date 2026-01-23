package com.robinhood.android.accountcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes24.dex */
public final class MergeProfileInsightItemViewBinding implements ViewBinding {
    public final RdsCardView profileInsightCardView;
    public final RhTextView profileInsightDescriptionTxt;
    public final RhTextView profileInsightHeaderTxt;
    public final ImageView profileInsightIconImg;
    private final View rootView;

    private MergeProfileInsightItemViewBinding(View view, RdsCardView rdsCardView, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView) {
        this.rootView = view;
        this.profileInsightCardView = rdsCardView;
        this.profileInsightDescriptionTxt = rhTextView;
        this.profileInsightHeaderTxt = rhTextView2;
        this.profileInsightIconImg = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProfileInsightItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C8293R.layout.merge_profile_insight_item_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProfileInsightItemViewBinding bind(View view) {
        int i = C8293R.id.profile_insight_card_view;
        RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
        if (rdsCardView != null) {
            i = C8293R.id.profile_insight_description_txt;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C8293R.id.profile_insight_header_txt;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C8293R.id.profile_insight_icon_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        return new MergeProfileInsightItemViewBinding(view, rdsCardView, rhTextView, rhTextView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
