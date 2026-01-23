package com.robinhood.android.directipo.p106ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.directipo.p106ui.C14228R;

/* loaded from: classes27.dex */
public final class MergeIpoAnnouncementCardHookViewBinding implements ViewBinding {
    public final RdsTextButton cardHookCtaButton;
    public final ImageView cardHookImage;
    public final RhTextView cardHookSubtitle;
    public final RhTextView cardHookTitle;
    private final View rootView;
    public final Guideline verticalGuideline;

    private MergeIpoAnnouncementCardHookViewBinding(View view, RdsTextButton rdsTextButton, ImageView imageView, RhTextView rhTextView, RhTextView rhTextView2, Guideline guideline) {
        this.rootView = view;
        this.cardHookCtaButton = rdsTextButton;
        this.cardHookImage = imageView;
        this.cardHookSubtitle = rhTextView;
        this.cardHookTitle = rhTextView2;
        this.verticalGuideline = guideline;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static MergeIpoAnnouncementCardHookViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C14228R.layout.merge_ipo_announcement_card_hook_view, viewGroup);
        return bind(viewGroup);
    }

    public static MergeIpoAnnouncementCardHookViewBinding bind(View view) {
        int i = C14228R.id.card_hook_cta_button;
        RdsTextButton rdsTextButton = (RdsTextButton) ViewBindings.findChildViewById(view, i);
        if (rdsTextButton != null) {
            i = C14228R.id.card_hook_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C14228R.id.card_hook_subtitle;
                RhTextView rhTextView = (RhTextView) ViewBindings.findChildViewById(view, i);
                if (rhTextView != null) {
                    i = C14228R.id.card_hook_title;
                    RhTextView rhTextView2 = (RhTextView) ViewBindings.findChildViewById(view, i);
                    if (rhTextView2 != null) {
                        i = C14228R.id.vertical_guideline;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            return new MergeIpoAnnouncementCardHookViewBinding(view, rdsTextButton, imageView, rhTextView, rhTextView2, guideline);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
