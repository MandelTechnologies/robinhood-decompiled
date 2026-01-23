package com.robinhood.android.trade.directipo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.trade.directipo.C29323R;

/* loaded from: classes9.dex */
public final class FragmentDirectIpoAccessBinding implements ViewBinding {
    public final RdsButton continueCtaBtn;
    public final LottieAnimationView lottieView;
    public final RdsButton neverShowAgainCtaBtn;
    private final LinearLayout rootView;
    public final RecyclerView sectionList;
    public final RhTextView subtitle;
    public final RhTextView title;

    private FragmentDirectIpoAccessBinding(LinearLayout linearLayout, RdsButton rdsButton, LottieAnimationView lottieAnimationView, RdsButton rdsButton2, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2) {
        this.rootView = linearLayout;
        this.continueCtaBtn = rdsButton;
        this.lottieView = lottieAnimationView;
        this.neverShowAgainCtaBtn = rdsButton2;
        this.sectionList = recyclerView;
        this.subtitle = rhTextView;
        this.title = rhTextView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoAccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoAccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C29323R.layout.fragment_direct_ipo_access, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoAccessBinding bind(View view) {
        int i = C29323R.id.continue_cta_btn;
        RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
        if (rdsButton != null) {
            i = C29323R.id.lottie_view;
            LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
            if (lottieAnimationView != null) {
                i = C29323R.id.never_show_again_cta_btn;
                RdsButton rdsButton2 = (RdsButton) ViewBindings.findChildViewById(view, i);
                if (rdsButton2 != null) {
                    i = C29323R.id.section_list;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C29323R.id.subtitle;
                        RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView != null) {
                            i = C29323R.id.title;
                            RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView2 != null) {
                                return new FragmentDirectIpoAccessBinding((LinearLayout) view, rdsButton, lottieAnimationView, rdsButton2, recyclerView, rhTextView, rhTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
