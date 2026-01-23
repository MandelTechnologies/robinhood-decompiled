package com.robinhood.cards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.cards.C31879R;

/* loaded from: classes3.dex */
public final class CardCompletionAnimationViewBinding implements ViewBinding {
    public final ImageView animationIcon;
    private final RdsCardView rootView;

    private CardCompletionAnimationViewBinding(RdsCardView rdsCardView, ImageView imageView) {
        this.rootView = rdsCardView;
        this.animationIcon = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RdsCardView getRoot() {
        return this.rootView;
    }

    public static CardCompletionAnimationViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CardCompletionAnimationViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C31879R.layout.card_completion_animation_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CardCompletionAnimationViewBinding bind(View view) {
        int i = C31879R.id.animation_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            return new CardCompletionAnimationViewBinding((RdsCardView) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
