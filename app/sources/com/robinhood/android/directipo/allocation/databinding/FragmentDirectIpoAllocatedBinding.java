package com.robinhood.android.directipo.allocation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoAllocatedCardView;

/* loaded from: classes27.dex */
public final class FragmentDirectIpoAllocatedBinding implements ViewBinding {
    public final LinearLayout fragmentDirectIpoAllocatedButtonAndTextContainer;
    public final RecyclerView fragmentDirectIpoAllocatedButtonRecyclerView;
    public final DirectIpoAllocatedCardView fragmentDirectIpoAllocatedCard;
    public final FrameLayout fragmentDirectIpoAllocatedCardContainer;
    public final LinearLayout fragmentDirectIpoAllocatedContent;
    public final RhTextView fragmentDirectIpoAllocatedDescription;
    public final LottieAnimationView fragmentDirectIpoAllocatedLottieAnimation;
    public final FrameLayout fragmentDirectIpoAllocatedRoot;
    private final FrameLayout rootView;

    private FragmentDirectIpoAllocatedBinding(FrameLayout frameLayout, LinearLayout linearLayout, RecyclerView recyclerView, DirectIpoAllocatedCardView directIpoAllocatedCardView, FrameLayout frameLayout2, LinearLayout linearLayout2, RhTextView rhTextView, LottieAnimationView lottieAnimationView, FrameLayout frameLayout3) {
        this.rootView = frameLayout;
        this.fragmentDirectIpoAllocatedButtonAndTextContainer = linearLayout;
        this.fragmentDirectIpoAllocatedButtonRecyclerView = recyclerView;
        this.fragmentDirectIpoAllocatedCard = directIpoAllocatedCardView;
        this.fragmentDirectIpoAllocatedCardContainer = frameLayout2;
        this.fragmentDirectIpoAllocatedContent = linearLayout2;
        this.fragmentDirectIpoAllocatedDescription = rhTextView;
        this.fragmentDirectIpoAllocatedLottieAnimation = lottieAnimationView;
        this.fragmentDirectIpoAllocatedRoot = frameLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentDirectIpoAllocatedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentDirectIpoAllocatedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C14171R.layout.fragment_direct_ipo_allocated, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentDirectIpoAllocatedBinding bind(View view) {
        int i = C14171R.id.fragment_direct_ipo_allocated_button_and_text_container;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C14171R.id.fragment_direct_ipo_allocated_button_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C14171R.id.fragment_direct_ipo_allocated_card;
                DirectIpoAllocatedCardView directIpoAllocatedCardView = (DirectIpoAllocatedCardView) ViewBindings.findChildViewById(view, i);
                if (directIpoAllocatedCardView != null) {
                    i = C14171R.id.fragment_direct_ipo_allocated_card_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = C14171R.id.fragment_direct_ipo_allocated_content;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C14171R.id.fragment_direct_ipo_allocated_description;
                            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                            if (rhTextView != null) {
                                i = C14171R.id.fragment_direct_ipo_allocated_lottie_animation;
                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                if (lottieAnimationView != null) {
                                    FrameLayout frameLayout2 = (FrameLayout) view;
                                    return new FragmentDirectIpoAllocatedBinding(frameLayout2, linearLayout, recyclerView, directIpoAllocatedCardView, frameLayout, linearLayout2, rhTextView, lottieAnimationView, frameLayout2);
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
