package com.robinhood.android.optionsrolling.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.optionsrolling.C24772R;

/* loaded from: classes11.dex */
public final class MergeRollingContractCardViewBinding implements ViewBinding {
    public final TextView optionsRollingCardSubtitle;
    public final TextView optionsRollingCardTitle;
    public final View optionsRollingColoredBackground;
    public final Group optionsRollingContractCardGroup;
    public final TextView optionsRollingCurrentPrice;
    public final TextView optionsRollingCurrentPriceTitle;
    public final View optionsRollingDivider;
    public final TextView optionsRollingHeader;
    public final ImageView optionsRollingPlusIcon;
    public final TextView optionsRollingSelectNewContract;
    public final Group optionsRollingSelectNewContractGroup;
    public final TextView optionsRollingTimeLeft;
    public final TextView optionsRollingTimeLeftTitle;
    private final View rootView;

    private MergeRollingContractCardViewBinding(View view, TextView textView, TextView textView2, View view2, Group group, TextView textView3, TextView textView4, View view3, TextView textView5, ImageView imageView, TextView textView6, Group group2, TextView textView7, TextView textView8) {
        this.rootView = view;
        this.optionsRollingCardSubtitle = textView;
        this.optionsRollingCardTitle = textView2;
        this.optionsRollingColoredBackground = view2;
        this.optionsRollingContractCardGroup = group;
        this.optionsRollingCurrentPrice = textView3;
        this.optionsRollingCurrentPriceTitle = textView4;
        this.optionsRollingDivider = view3;
        this.optionsRollingHeader = textView5;
        this.optionsRollingPlusIcon = imageView;
        this.optionsRollingSelectNewContract = textView6;
        this.optionsRollingSelectNewContractGroup = group2;
        this.optionsRollingTimeLeft = textView7;
        this.optionsRollingTimeLeftTitle = textView8;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRollingContractCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C24772R.layout.merge_rolling_contract_card_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRollingContractCardViewBinding bind(View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = C24772R.id.options_rolling_card_subtitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C24772R.id.options_rolling_card_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C24772R.id.options_rolling_colored_background))) != null) {
                i = C24772R.id.options_rolling_contract_card_group;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = C24772R.id.options_rolling_current_price;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C24772R.id.options_rolling_current_price_title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C24772R.id.options_rolling_divider))) != null) {
                            i = C24772R.id.options_rolling_header;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = C24772R.id.options_rolling_plus_icon;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = C24772R.id.options_rolling_select_new_contract;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = C24772R.id.options_rolling_select_new_contract_group;
                                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                                        if (group2 != null) {
                                            i = C24772R.id.options_rolling_time_left;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView7 != null) {
                                                i = C24772R.id.options_rolling_time_left_title;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView8 != null) {
                                                    return new MergeRollingContractCardViewBinding(view, textView, textView2, viewFindChildViewById, group, textView3, textView4, viewFindChildViewById2, textView5, imageView, textView6, group2, textView7, textView8);
                                                }
                                            }
                                        }
                                    }
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
