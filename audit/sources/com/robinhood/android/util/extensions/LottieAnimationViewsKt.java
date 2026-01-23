package com.robinhood.android.util.extensions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: LottieAnimationViews.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000b\u001a%\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u000fH\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0013¨\u0006\u0014"}, m3636d2 = {"addEndingInfiniteLoop", "", "Lcom/airbnb/lottie/LottieAnimationView;", "loopStartMarkerName", "", "loopEndMarkerName", "repeatMode", "", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "minFrame", "maxFrame", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateViewBeforeInfiniteLoop", "update", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "setRemoteUrl", "remoteUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "Lokhttp3/HttpUrl;", "lib-common_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LottieAnimationViewsKt {
    public static /* synthetic */ void addEndingInfiniteLoop$default(LottieAnimationView lottieAnimationView, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        addEndingInfiniteLoop(lottieAnimationView, str, str2, num);
    }

    public static final void addEndingInfiniteLoop(LottieAnimationView lottieAnimationView, final String str, final String str2, final Integer num) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        updateViewBeforeInfiniteLoop(lottieAnimationView, new Function1() { // from class: com.robinhood.android.util.extensions.LottieAnimationViewsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LottieAnimationViewsKt.addEndingInfiniteLoop$lambda$0(str, str2, num, (LottieAnimationView) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addEndingInfiniteLoop$lambda$0(String str, String str2, Integer num, LottieAnimationView updateViewBeforeInfiniteLoop) {
        Intrinsics.checkNotNullParameter(updateViewBeforeInfiniteLoop, "$this$updateViewBeforeInfiniteLoop");
        if (str != null) {
            updateViewBeforeInfiniteLoop.setMinFrame(str);
        }
        if (str2 != null) {
            updateViewBeforeInfiniteLoop.setMaxFrame(str2);
        }
        if (num != null) {
            updateViewBeforeInfiniteLoop.setRepeatMode(num.intValue());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void addEndingInfiniteLoop$default(LottieAnimationView lottieAnimationView, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        addEndingInfiniteLoop(lottieAnimationView, num, num2);
    }

    public static final void addEndingInfiniteLoop(LottieAnimationView lottieAnimationView, final Integer num, final Integer num2) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        updateViewBeforeInfiniteLoop(lottieAnimationView, new Function1() { // from class: com.robinhood.android.util.extensions.LottieAnimationViewsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LottieAnimationViewsKt.addEndingInfiniteLoop$lambda$1(num, num2, (LottieAnimationView) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addEndingInfiniteLoop$lambda$1(Integer num, Integer num2, LottieAnimationView updateViewBeforeInfiniteLoop) {
        Intrinsics.checkNotNullParameter(updateViewBeforeInfiniteLoop, "$this$updateViewBeforeInfiniteLoop");
        if (num != null) {
            updateViewBeforeInfiniteLoop.setMinFrame(num.intValue());
        }
        if (num2 != null) {
            updateViewBeforeInfiniteLoop.setMaxFrame(num2.intValue());
        }
        return Unit.INSTANCE;
    }

    private static final void updateViewBeforeInfiniteLoop(final LottieAnimationView lottieAnimationView, final Function1<? super LottieAnimationView, Unit> function1) {
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.util.extensions.LottieAnimationViewsKt.updateViewBeforeInfiniteLoop.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                if (lottieAnimationView.getRepeatCount() == -1) {
                    return;
                }
                lottieAnimationView.setRepeatCount(-1);
                function1.invoke(lottieAnimationView);
                lottieAnimationView.playAnimation();
            }
        });
    }

    public static final void setRemoteUrl(LottieAnimationView lottieAnimationView, LottieUrl remoteUrl) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        lottieAnimationView.setAnimationFromUrl(remoteUrl.getUrl().getUrl());
    }

    public static final void setRemoteUrl(LottieAnimationView lottieAnimationView, HttpUrl remoteUrl) {
        Intrinsics.checkNotNullParameter(lottieAnimationView, "<this>");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        lottieAnimationView.setAnimationFromUrl(remoteUrl.getUrl());
    }
}
