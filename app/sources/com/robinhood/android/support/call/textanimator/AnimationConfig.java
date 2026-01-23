package com.robinhood.android.support.call.textanimator;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextAnimator.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/AnimationConfig;", "", "text", "", "animationType", "Lcom/robinhood/android/support/call/textanimator/AnimationType;", "onAnimationStart", "Lkotlin/Function0;", "", "onAnimationEnd", "<init>", "(Ljava/lang/CharSequence;Lcom/robinhood/android/support/call/textanimator/AnimationType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getText", "()Ljava/lang/CharSequence;", "getAnimationType", "()Lcom/robinhood/android/support/call/textanimator/AnimationType;", "getOnAnimationStart", "()Lkotlin/jvm/functions/Function0;", "getOnAnimationEnd", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
final class AnimationConfig {
    private final AnimationType animationType;
    private final Function0<Unit> onAnimationEnd;
    private final Function0<Unit> onAnimationStart;
    private final CharSequence text;

    public AnimationConfig(CharSequence text, AnimationType animationType, Function0<Unit> onAnimationStart, Function0<Unit> onAnimationEnd) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        Intrinsics.checkNotNullParameter(onAnimationStart, "onAnimationStart");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        this.text = text;
        this.animationType = animationType;
        this.onAnimationStart = onAnimationStart;
        this.onAnimationEnd = onAnimationEnd;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final AnimationType getAnimationType() {
        return this.animationType;
    }

    public final Function0<Unit> getOnAnimationStart() {
        return this.onAnimationStart;
    }

    public final Function0<Unit> getOnAnimationEnd() {
        return this.onAnimationEnd;
    }
}
