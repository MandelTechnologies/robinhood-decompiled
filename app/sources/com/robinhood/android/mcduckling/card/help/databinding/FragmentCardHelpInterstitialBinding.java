package com.robinhood.android.mcduckling.card.help.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.mcduckling.card.help.C21627R;

/* loaded from: classes8.dex */
public final class FragmentCardHelpInterstitialBinding implements ViewBinding {
    public final RdsPogView cancellationPog;
    public final RhTextView cancellationTextSubtitle;
    public final RhTextView cancellationTextTitle;
    public final ImageView cardHelpImageView;
    public final RhTextView cardHelpTitleText;
    public final RdsButton getNewCardButton;
    public final RdsPogView mailingPog;
    public final RhTextView mailingTextSubtitle;
    public final RhTextView mailingTextTitle;
    public final RdsPogView newCardPog;
    public final RhTextView newCardTextSubtitle;
    public final RhTextView newCardTextTitle;
    private final LinearLayout rootView;

    private FragmentCardHelpInterstitialBinding(LinearLayout linearLayout, RdsPogView rdsPogView, RhTextView rhTextView, RhTextView rhTextView2, ImageView imageView, RhTextView rhTextView3, RdsButton rdsButton, RdsPogView rdsPogView2, RhTextView rhTextView4, RhTextView rhTextView5, RdsPogView rdsPogView3, RhTextView rhTextView6, RhTextView rhTextView7) {
        this.rootView = linearLayout;
        this.cancellationPog = rdsPogView;
        this.cancellationTextSubtitle = rhTextView;
        this.cancellationTextTitle = rhTextView2;
        this.cardHelpImageView = imageView;
        this.cardHelpTitleText = rhTextView3;
        this.getNewCardButton = rdsButton;
        this.mailingPog = rdsPogView2;
        this.mailingTextSubtitle = rhTextView4;
        this.mailingTextTitle = rhTextView5;
        this.newCardPog = rdsPogView3;
        this.newCardTextSubtitle = rhTextView6;
        this.newCardTextTitle = rhTextView7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCardHelpInterstitialBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentCardHelpInterstitialBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C21627R.layout.fragment_card_help_interstitial, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static FragmentCardHelpInterstitialBinding bind(View view) {
        int i = C21627R.id.cancellation_pog;
        RdsPogView rdsPogView = (RdsPogView) ViewBindings.findChildViewById(view, i);
        if (rdsPogView != null) {
            i = C21627R.id.cancellation_text_subtitle;
            RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
            if (rhTextView != null) {
                i = C21627R.id.cancellation_text_title;
                RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView2 != null) {
                    i = C21627R.id.card_help_image_view;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C21627R.id.card_help_title_text;
                        RhTextView rhTextView3 = (RhTextView) ViewBindings.findChildViewById(view, i);
                        if (rhTextView3 != null) {
                            i = C21627R.id.get_new_card_button;
                            RdsButton rdsButton = (RdsButton) ViewBindings.findChildViewById(view, i);
                            if (rdsButton != null) {
                                i = C21627R.id.mailing_pog;
                                RdsPogView rdsPogView2 = (RdsPogView) ViewBindings.findChildViewById(view, i);
                                if (rdsPogView2 != null) {
                                    i = C21627R.id.mailing_text_subtitle;
                                    RhTextView rhTextView4 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                    if (rhTextView4 != null) {
                                        i = C21627R.id.mailing_text_title;
                                        RhTextView rhTextView5 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                        if (rhTextView5 != null) {
                                            i = C21627R.id.new_card_pog;
                                            RdsPogView rdsPogView3 = (RdsPogView) ViewBindings.findChildViewById(view, i);
                                            if (rdsPogView3 != null) {
                                                i = C21627R.id.new_card_text_subtitle;
                                                RhTextView rhTextView6 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                if (rhTextView6 != null) {
                                                    i = C21627R.id.new_card_text_title;
                                                    RhTextView rhTextView7 = (RhTextView) ViewBindings.findChildViewById(view, i);
                                                    if (rhTextView7 != null) {
                                                        return new FragmentCardHelpInterstitialBinding((LinearLayout) view, rdsPogView, rhTextView, rhTextView2, imageView, rhTextView3, rdsButton, rdsPogView2, rhTextView4, rhTextView5, rdsPogView3, rhTextView6, rhTextView7);
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
