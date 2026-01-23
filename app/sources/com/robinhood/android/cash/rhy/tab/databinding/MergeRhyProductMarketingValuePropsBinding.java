package com.robinhood.android.cash.rhy.tab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.text.RhTextView;

/* loaded from: classes7.dex */
public final class MergeRhyProductMarketingValuePropsBinding implements ViewBinding {
    public final CardView productMarketingCard;
    public final LinearLayout productMarketingCardContents;
    public final RhTextView productMarketingCardTitle;
    public final RecyclerView productMarketingCardValueProps;
    private final View rootView;

    private MergeRhyProductMarketingValuePropsBinding(View view, CardView cardView, LinearLayout linearLayout, RhTextView rhTextView, RecyclerView recyclerView) {
        this.rootView = view;
        this.productMarketingCard = cardView;
        this.productMarketingCardContents = linearLayout;
        this.productMarketingCardTitle = rhTextView;
        this.productMarketingCardValueProps = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeRhyProductMarketingValuePropsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C10285R.layout.merge_rhy_product_marketing_value_props, viewGroup);
        return bind(viewGroup);
    }

    public static MergeRhyProductMarketingValuePropsBinding bind(View view) {
        int i = C10285R.id.product_marketing_card;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = C10285R.id.product_marketing_card_contents;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C10285R.id.product_marketing_card_title;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C10285R.id.product_marketing_card_value_props;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new MergeRhyProductMarketingValuePropsBinding(view, cardView, linearLayout, rhTextView, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
