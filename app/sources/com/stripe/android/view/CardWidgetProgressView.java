package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.stripe.android.R$anim;
import com.stripe.android.R$dimen;
import com.stripe.android.R$drawable;
import com.stripe.android.databinding.StripeCardWidgetProgressViewBinding;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardWidgetProgressView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u0006\u0010\u0010\u001a\u00020\u000eR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/stripe/android/view/CardWidgetProgressView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fadeIn", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "fadeOut", "hide", "", "onAttachedToWindow", "show", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CardWidgetProgressView extends FrameLayout {
    private final Animation fadeIn;
    private final Animation fadeOut;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardWidgetProgressView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R$anim.stripe_card_widget_progress_fade_in);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.view.CardWidgetProgressView$fadeIn$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation p0) {
                this.this$0.setVisibility(0);
            }
        });
        this.fadeIn = animationLoadAnimation;
        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R$anim.stripe_card_widget_progress_fade_out);
        animationLoadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.view.CardWidgetProgressView$fadeOut$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation p0) {
                this.this$0.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation p0) {
                this.this$0.setVisibility(4);
            }
        });
        this.fadeOut = animationLoadAnimation2;
        StripeCardWidgetProgressViewBinding.inflate(LayoutInflater.from(context), this);
        setBackgroundResource(R$drawable.stripe_card_progress_background);
        setClipToOutline(true);
        setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.stripe_card_widget_progress_size);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void show() {
        startAnimation(this.fadeIn);
    }

    public final void hide() {
        startAnimation(this.fadeOut);
    }
}
