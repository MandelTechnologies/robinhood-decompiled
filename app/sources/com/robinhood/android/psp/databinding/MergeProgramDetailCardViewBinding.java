package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.psp.C25966R;

/* loaded from: classes11.dex */
public final class MergeProgramDetailCardViewBinding implements ViewBinding {
    public final RdsRowView footerRow;
    public final RhTextView headerLabel;
    public final RdsCardView headerLogoCard;
    public final ImageView headerLogoImg;
    public final RhTextView headerValue;
    public final RhTextView middleLabelTxt;
    public final RhTextView middleValueTxt;
    private final View rootView;

    private MergeProgramDetailCardViewBinding(View view, RdsRowView rdsRowView, RhTextView rhTextView, RdsCardView rdsCardView, ImageView imageView, RhTextView rhTextView2, RhTextView rhTextView3, RhTextView rhTextView4) {
        this.rootView = view;
        this.footerRow = rdsRowView;
        this.headerLabel = rhTextView;
        this.headerLogoCard = rdsCardView;
        this.headerLogoImg = imageView;
        this.headerValue = rhTextView2;
        this.middleLabelTxt = rhTextView3;
        this.middleValueTxt = rhTextView4;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeProgramDetailCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C25966R.layout.merge_program_detail_card_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeProgramDetailCardViewBinding bind(View view) {
        int i = C25966R.id.footer_row;
        RdsRowView rdsRowView = (RdsRowView) ViewBindings.findChildViewById(view, i);
        if (rdsRowView != null) {
            i = C25966R.id.header_label;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C25966R.id.header_logo_card;
                RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
                if (rdsCardView != null) {
                    i = C25966R.id.header_logo_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C25966R.id.header_value;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            i = C25966R.id.middle_label_txt;
                            RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView3 != null) {
                                i = C25966R.id.middle_value_txt;
                                RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                if (rhTextView4 != null) {
                                    return new MergeProgramDetailCardViewBinding(view, rdsRowView, rhTextView, rdsCardView, imageView, rhTextView2, rhTextView3, rhTextView4);
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
