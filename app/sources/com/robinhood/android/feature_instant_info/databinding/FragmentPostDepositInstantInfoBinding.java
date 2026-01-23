package com.robinhood.android.feature_instant_info.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.feature_instant_info.C16914R;

/* loaded from: classes3.dex */
public final class FragmentPostDepositInstantInfoBinding implements ViewBinding {
    public final RecyclerView buttonRecyclerView;
    public final RhTextView descriptionTv;
    public final RhTextView detailTv;
    public final LottieAnimationView lottieAnimationView;
    private final ConstraintLayout rootView;
    public final RhTextView titleTv;

    private FragmentPostDepositInstantInfoBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, RhTextView rhTextView, RhTextView rhTextView2, LottieAnimationView lottieAnimationView, RhTextView rhTextView3) {
        this.rootView = constraintLayout;
        this.buttonRecyclerView = recyclerView;
        this.descriptionTv = rhTextView;
        this.detailTv = rhTextView2;
        this.lottieAnimationView = lottieAnimationView;
        this.titleTv = rhTextView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPostDepositInstantInfoBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPostDepositInstantInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C16914R.layout.fragment_post_deposit_instant_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentPostDepositInstantInfoBinding bind(View view) {
        int i = C16914R.id.button_recycler_view;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C16914R.id.description_tv;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C16914R.id.detail_tv;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C16914R.id.lottie_animation_view;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                    if (lottieAnimationView != null) {
                        i = C16914R.id.title_tv;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            return new FragmentPostDepositInstantInfoBinding((ConstraintLayout) view, recyclerView, rhTextView, rhTextView2, lottieAnimationView, rhTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
