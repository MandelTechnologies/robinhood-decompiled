package com.robinhood.android.psp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.psp.C25966R;
import com.robinhood.android.psp.HoldToActionButtonView;

/* loaded from: classes11.dex */
public final class FragmentProgramDetailBinding implements ViewBinding {
    public final View alphaGradientView;
    public final RecyclerView buttonRecyclerView;
    public final ConstraintLayout contentContainer;
    public final RhTextView expirationTxt;
    public final LinearLayout footer;
    public final LinearLayout headerContainer;
    public final HoldToActionButtonView holdToActionButtonView;
    public final FrameLayout holdToActionContainer;
    public final RhTextView introDescription;
    public final ImageView introHeaderImg;
    public final RhTextView introHeaderTxt;
    public final RhTextView introSubtitle;
    public final RhTextView introTitle;
    public final ShimmerLoadingView loadingView;
    public final LottieAnimationView lottieAnimationView;
    public final LottieAnimationView lottieCubesAnimationView;
    private final FrameLayout rootView;
    public final RecyclerView sectionRecyclerView;
    public final LinearLayout textContainer;

    private FragmentProgramDetailBinding(FrameLayout frameLayout, View view, RecyclerView recyclerView, ConstraintLayout constraintLayout, RhTextView rhTextView, LinearLayout linearLayout, LinearLayout linearLayout2, HoldToActionButtonView holdToActionButtonView, FrameLayout frameLayout2, RhTextView rhTextView2, ImageView imageView, RhTextView rhTextView3, RhTextView rhTextView4, RhTextView rhTextView5, ShimmerLoadingView shimmerLoadingView, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, RecyclerView recyclerView2, LinearLayout linearLayout3) {
        this.rootView = frameLayout;
        this.alphaGradientView = view;
        this.buttonRecyclerView = recyclerView;
        this.contentContainer = constraintLayout;
        this.expirationTxt = rhTextView;
        this.footer = linearLayout;
        this.headerContainer = linearLayout2;
        this.holdToActionButtonView = holdToActionButtonView;
        this.holdToActionContainer = frameLayout2;
        this.introDescription = rhTextView2;
        this.introHeaderImg = imageView;
        this.introHeaderTxt = rhTextView3;
        this.introSubtitle = rhTextView4;
        this.introTitle = rhTextView5;
        this.loadingView = shimmerLoadingView;
        this.lottieAnimationView = lottieAnimationView;
        this.lottieCubesAnimationView = lottieAnimationView2;
        this.sectionRecyclerView = recyclerView2;
        this.textContainer = linearLayout3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProgramDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentProgramDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C25966R.layout.fragment_program_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentProgramDetailBinding bind(View view) {
        int i = C25966R.id.alpha_gradient_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C25966R.id.button_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C25966R.id.content_container;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C25966R.id.expiration_txt;
                    RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView != null) {
                        i = C25966R.id.footer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C25966R.id.header_container;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C25966R.id.hold_to_action_button_view;
                                HoldToActionButtonView holdToActionButtonView = (HoldToActionButtonView) ViewBindings.findChildViewById(view, i);
                                if (holdToActionButtonView != null) {
                                    i = C25966R.id.hold_to_action_container;
                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout != null) {
                                        i = C25966R.id.intro_description;
                                        RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView2 != null) {
                                            i = C25966R.id.intro_header_img;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = C25966R.id.intro_header_txt;
                                                RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView3 != null) {
                                                    i = C25966R.id.intro_subtitle;
                                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView4 != null) {
                                                        i = C25966R.id.intro_title;
                                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                        if (rhTextView5 != null) {
                                                            i = C25966R.id.loading_view;
                                                            ShimmerLoadingView shimmerLoadingView = (ShimmerLoadingView) ViewBindings.findChildViewById(view, i);
                                                            if (shimmerLoadingView != null) {
                                                                i = C25966R.id.lottie_animation_view;
                                                                LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                                if (lottieAnimationView != null) {
                                                                    i = C25966R.id.lottie_cubes_animation_view;
                                                                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                                                                    if (lottieAnimationView2 != null) {
                                                                        i = C25966R.id.section_recycler_view;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView2 != null) {
                                                                            i = C25966R.id.text_container;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout3 != null) {
                                                                                return new FragmentProgramDetailBinding((FrameLayout) view, viewFindChildViewById, recyclerView, constraintLayout, rhTextView, linearLayout, linearLayout2, holdToActionButtonView, frameLayout, rhTextView2, imageView, rhTextView3, rhTextView4, rhTextView5, shimmerLoadingView, lottieAnimationView, lottieAnimationView2, recyclerView2, linearLayout3);
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
