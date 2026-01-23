package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class MergeDirectIpoOrderConfirmationBinding implements ViewBinding {
    public final RdsCardView cardView;
    public final LinearLayout orderContentContainer;
    public final RhTextView orderDescriptionTxt;
    public final RhTextView orderTitleTxt;
    public final RecyclerView recyclerView;
    private final View rootView;

    private MergeDirectIpoOrderConfirmationBinding(View view, RdsCardView rdsCardView, LinearLayout linearLayout, RhTextView rhTextView, RhTextView rhTextView2, RecyclerView recyclerView) {
        this.rootView = view;
        this.cardView = rdsCardView;
        this.orderContentContainer = linearLayout;
        this.orderDescriptionTxt = rhTextView;
        this.orderTitleTxt = rhTextView2;
        this.recyclerView = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeDirectIpoOrderConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29323R.layout.merge_direct_ipo_order_confirmation, viewGroup);
        return bind(viewGroup);
    }

    public static MergeDirectIpoOrderConfirmationBinding bind(View view) {
        int i = C29323R.id.card_view;
        RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
        if (rdsCardView != null) {
            i = C29323R.id.order_content_container;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C29323R.id.order_description_txt;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C29323R.id.order_title_txt;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C29323R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new MergeDirectIpoOrderConfirmationBinding(view, rdsCardView, linearLayout, rhTextView, rhTextView2, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
