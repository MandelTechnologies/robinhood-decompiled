package com.robinhood.android.trade.recommendations.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.recommendations.C29895R;

/* loaded from: classes9.dex */
public final class FragmentRecommendationsOrderConfirmationBinding implements ViewBinding {
    public final RdsCardView cardView;
    public final RdsButton doneBtn;
    public final RecyclerView list;
    private final View rootView;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentRecommendationsOrderConfirmationBinding(View view, RdsCardView rdsCardView, RdsButton rdsButton, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = view;
        this.cardView = rdsCardView;
        this.doneBtn = rdsButton;
        this.list = recyclerView;
        this.subtitle = rhTextView;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static FragmentRecommendationsOrderConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C29895R.layout.fragment_recommendations_order_confirmation, viewGroup);
        return bind(viewGroup);
    }

    public static FragmentRecommendationsOrderConfirmationBinding bind(View view) {
        int i = C29895R.id.card_view;
        RdsCardView rdsCardView = (RdsCardView) ViewBindings.findChildViewById(view, i);
        if (rdsCardView != null) {
            i = C29895R.id.done_btn;
            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
            if (rdsButton != null) {
                i = C29895R.id.list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C29895R.id.subtitle;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C29895R.id.title;
                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView2 != null) {
                            return new FragmentRecommendationsOrderConfirmationBinding(view, rdsCardView, rdsButton, recyclerView, rhTextView, rhTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
