package com.robinhood.android.common.onboarding.p085ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: SplashPage.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u000256BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020 J\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\nJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0018JX\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\fHÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001c\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u00067"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "", "creative", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "heading", "", "title", ErrorBundle.SUMMARY_ENTRY, "onLearnMore", "Lkotlin/Function0;", "", "loopStartFrame", "", "<init>", "(Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V", "getCreative", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "getHeading", "()Ljava/lang/CharSequence;", "getTitle", "getSummary", "getOnLearnMore", "()Lkotlin/jvm/functions/Function0;", "getLoopStartFrame", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "animationAdapter", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$AnimationAdapter;", "layoutRes", "getLayoutRes", "()I", "render", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "setupView", "view", "startAnimation", "stopAnimation", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "equals", "", "other", "hashCode", "toString", "", "Creative", "AnimationAdapter", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final /* data */ class SplashPage {
    private AnimationAdapter animationAdapter;
    private final Creative creative;
    private final CharSequence heading;
    private final Integer loopStartFrame;
    private final Function0<Unit> onLearnMore;
    private final CharSequence summary;
    private final CharSequence title;

    /* compiled from: SplashPage.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$AnimationAdapter;", "", "startAnimation", "", "stopAnimation", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private interface AnimationAdapter {
        void startAnimation();

        void stopAnimation();
    }

    public static /* synthetic */ SplashPage copy$default(SplashPage splashPage, Creative creative, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function0 function0, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            creative = splashPage.creative;
        }
        if ((i & 2) != 0) {
            charSequence = splashPage.heading;
        }
        if ((i & 4) != 0) {
            charSequence2 = splashPage.title;
        }
        if ((i & 8) != 0) {
            charSequence3 = splashPage.summary;
        }
        if ((i & 16) != 0) {
            function0 = splashPage.onLearnMore;
        }
        if ((i & 32) != 0) {
            num = splashPage.loopStartFrame;
        }
        Function0 function02 = function0;
        Integer num2 = num;
        return splashPage.copy(creative, charSequence, charSequence2, charSequence3, function02, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Creative getCreative() {
        return this.creative;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getHeading() {
        return this.heading;
    }

    /* renamed from: component3, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final CharSequence getSummary() {
        return this.summary;
    }

    public final Function0<Unit> component5() {
        return this.onLearnMore;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getLoopStartFrame() {
        return this.loopStartFrame;
    }

    public final SplashPage copy(Creative creative, CharSequence heading, CharSequence title, CharSequence summary, Function0<Unit> onLearnMore, Integer loopStartFrame) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new SplashPage(creative, heading, title, summary, onLearnMore, loopStartFrame);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplashPage)) {
            return false;
        }
        SplashPage splashPage = (SplashPage) other;
        return Intrinsics.areEqual(this.creative, splashPage.creative) && Intrinsics.areEqual(this.heading, splashPage.heading) && Intrinsics.areEqual(this.title, splashPage.title) && Intrinsics.areEqual(this.summary, splashPage.summary) && Intrinsics.areEqual(this.onLearnMore, splashPage.onLearnMore) && Intrinsics.areEqual(this.loopStartFrame, splashPage.loopStartFrame);
    }

    public int hashCode() {
        Creative creative = this.creative;
        int iHashCode = (creative == null ? 0 : creative.hashCode()) * 31;
        CharSequence charSequence = this.heading;
        int iHashCode2 = (((((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31;
        Function0<Unit> function0 = this.onLearnMore;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Integer num = this.loopStartFrame;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        Creative creative = this.creative;
        CharSequence charSequence = this.heading;
        CharSequence charSequence2 = this.title;
        CharSequence charSequence3 = this.summary;
        return "SplashPage(creative=" + creative + ", heading=" + ((Object) charSequence) + ", title=" + ((Object) charSequence2) + ", summary=" + ((Object) charSequence3) + ", onLearnMore=" + this.onLearnMore + ", loopStartFrame=" + this.loopStartFrame + ")";
    }

    public SplashPage(Creative creative, CharSequence charSequence, CharSequence title, CharSequence summary, Function0<Unit> function0, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.creative = creative;
        this.heading = charSequence;
        this.title = title;
        this.summary = summary;
        this.onLearnMore = function0;
        this.loopStartFrame = num;
    }

    public /* synthetic */ SplashPage(Creative creative, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Function0 function0, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : creative, (i & 2) != 0 ? null : charSequence, charSequence2, charSequence3, (i & 16) != 0 ? null : function0, (i & 32) != 0 ? null : num);
    }

    public final Creative getCreative() {
        return this.creative;
    }

    public final CharSequence getHeading() {
        return this.heading;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final CharSequence getSummary() {
        return this.summary;
    }

    public final Function0<Unit> getOnLearnMore() {
        return this.onLearnMore;
    }

    public final Integer getLoopStartFrame() {
        return this.loopStartFrame;
    }

    /* compiled from: SplashPage.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "", "<init>", "()V", "RemoteLottie", "Drawable", "FittedDrawable", "DrawableWithUnscaledText", "Placeholder", "Layout", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$Drawable;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$DrawableWithUnscaledText;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$FittedDrawable;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$Layout;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$Placeholder;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$RemoteLottie;", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Creative {
        public /* synthetic */ Creative(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Creative() {
        }

        /* compiled from: SplashPage.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$RemoteLottie;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "lottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;)V", "getLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RemoteLottie extends Creative {
            private final LottieUrl lottieUrl;

            public static /* synthetic */ RemoteLottie copy$default(RemoteLottie remoteLottie, LottieUrl lottieUrl, int i, Object obj) {
                if ((i & 1) != 0) {
                    lottieUrl = remoteLottie.lottieUrl;
                }
                return remoteLottie.copy(lottieUrl);
            }

            /* renamed from: component1, reason: from getter */
            public final LottieUrl getLottieUrl() {
                return this.lottieUrl;
            }

            public final RemoteLottie copy(LottieUrl lottieUrl) {
                Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
                return new RemoteLottie(lottieUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RemoteLottie) && this.lottieUrl == ((RemoteLottie) other).lottieUrl;
            }

            public int hashCode() {
                return this.lottieUrl.hashCode();
            }

            public String toString() {
                return "RemoteLottie(lottieUrl=" + this.lottieUrl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoteLottie(LottieUrl lottieUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
                this.lottieUrl = lottieUrl;
            }

            public final LottieUrl getLottieUrl() {
                return this.lottieUrl;
            }
        }

        /* compiled from: SplashPage.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$Drawable;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "drawableRes", "", "<init>", "(I)V", "getDrawableRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Drawable extends Creative {
            private final int drawableRes;

            public static /* synthetic */ Drawable copy$default(Drawable drawable, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = drawable.drawableRes;
                }
                return drawable.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDrawableRes() {
                return this.drawableRes;
            }

            public final Drawable copy(int drawableRes) {
                return new Drawable(drawableRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Drawable) && this.drawableRes == ((Drawable) other).drawableRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.drawableRes);
            }

            public String toString() {
                return "Drawable(drawableRes=" + this.drawableRes + ")";
            }

            public Drawable(int i) {
                super(null);
                this.drawableRes = i;
            }

            public final int getDrawableRes() {
                return this.drawableRes;
            }
        }

        /* compiled from: SplashPage.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$FittedDrawable;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "drawableRes", "", "<init>", "(I)V", "getDrawableRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class FittedDrawable extends Creative {
            private final int drawableRes;

            public static /* synthetic */ FittedDrawable copy$default(FittedDrawable fittedDrawable, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = fittedDrawable.drawableRes;
                }
                return fittedDrawable.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDrawableRes() {
                return this.drawableRes;
            }

            public final FittedDrawable copy(int drawableRes) {
                return new FittedDrawable(drawableRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof FittedDrawable) && this.drawableRes == ((FittedDrawable) other).drawableRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.drawableRes);
            }

            public String toString() {
                return "FittedDrawable(drawableRes=" + this.drawableRes + ")";
            }

            public FittedDrawable(int i) {
                super(null);
                this.drawableRes = i;
            }

            public final int getDrawableRes() {
                return this.drawableRes;
            }
        }

        /* compiled from: SplashPage.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$DrawableWithUnscaledText;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "drawableRes", "", "<init>", "(I)V", "getDrawableRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DrawableWithUnscaledText extends Creative {
            private final int drawableRes;

            public static /* synthetic */ DrawableWithUnscaledText copy$default(DrawableWithUnscaledText drawableWithUnscaledText, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = drawableWithUnscaledText.drawableRes;
                }
                return drawableWithUnscaledText.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getDrawableRes() {
                return this.drawableRes;
            }

            public final DrawableWithUnscaledText copy(int drawableRes) {
                return new DrawableWithUnscaledText(drawableRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DrawableWithUnscaledText) && this.drawableRes == ((DrawableWithUnscaledText) other).drawableRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.drawableRes);
            }

            public String toString() {
                return "DrawableWithUnscaledText(drawableRes=" + this.drawableRes + ")";
            }

            public DrawableWithUnscaledText(int i) {
                super(null);
                this.drawableRes = i;
            }

            public final int getDrawableRes() {
                return this.drawableRes;
            }
        }

        /* compiled from: SplashPage.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$Placeholder;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "<init>", "()V", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Placeholder extends Creative {
            public static final Placeholder INSTANCE = new Placeholder();

            private Placeholder() {
                super(null);
            }
        }

        /* compiled from: SplashPage.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative$Layout;", "Lcom/robinhood/android/common/onboarding/ui/SplashPage$Creative;", "layoutRes", "", "<init>", "(I)V", "getLayoutRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Layout extends Creative {
            private final int layoutRes;

            public static /* synthetic */ Layout copy$default(Layout layout, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = layout.layoutRes;
                }
                return layout.copy(i);
            }

            /* renamed from: component1, reason: from getter */
            public final int getLayoutRes() {
                return this.layoutRes;
            }

            public final Layout copy(int layoutRes) {
                return new Layout(layoutRes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Layout) && this.layoutRes == ((Layout) other).layoutRes;
            }

            public int hashCode() {
                return Integer.hashCode(this.layoutRes);
            }

            public String toString() {
                return "Layout(layoutRes=" + this.layoutRes + ")";
            }

            public Layout(int i) {
                super(null);
                this.layoutRes = i;
            }

            public final int getLayoutRes() {
                return this.layoutRes;
            }
        }
    }

    public final int getLayoutRes() {
        Creative creative = this.creative;
        if (creative instanceof Creative.RemoteLottie) {
            return C11287R.layout.include_splash_page_lottie;
        }
        if (creative instanceof Creative.Drawable) {
            return C11287R.layout.include_splash_page_image;
        }
        if (creative instanceof Creative.FittedDrawable) {
            return C11287R.layout.include_fitted_splash_page_image;
        }
        if (creative instanceof Creative.DrawableWithUnscaledText) {
            return C11287R.layout.include_splash_page_image_unscaled_text;
        }
        if (creative instanceof Creative.Placeholder) {
            return C11287R.layout.include_splash_page_placeholder;
        }
        if (creative instanceof Creative.Layout) {
            return C11287R.layout.include_splash_page_custom_container;
        }
        if (creative != null) {
            throw new NoWhenBranchMatchedException();
        }
        return C11287R.layout.include_splash_page_no_creative;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public final View render(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = ViewGroups.inflate(parent, getLayoutRes(), false);
        setupView(viewInflate);
        return viewInflate;
    }

    public final void setupView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(C11287R.id.splash_page_image);
        Creative creative = this.creative;
        if (creative instanceof Creative.RemoteLottie) {
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            final LottieAnimationView lottieAnimationView = (LottieAnimationView) viewFindViewById;
            LottieAnimationViewsKt.setRemoteUrl(lottieAnimationView, ((Creative.RemoteLottie) creative).getLottieUrl());
            lottieAnimationView.playAnimation();
            lottieAnimationView.removeAllAnimatorListeners();
            if (this.loopStartFrame != null) {
                lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.common.onboarding.ui.SplashPage.setupView.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animation) {
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        lottieAnimationView.setMinFrame(this.getLoopStartFrame().intValue());
                        lottieAnimationView.playAnimation();
                    }
                });
            }
        } else if (creative instanceof Creative.Drawable) {
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) viewFindViewById).setImageResource(((Creative.Drawable) creative).getDrawableRes());
        } else if (creative instanceof Creative.FittedDrawable) {
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) viewFindViewById).setImageResource(((Creative.FittedDrawable) creative).getDrawableRes());
        } else if (creative instanceof Creative.DrawableWithUnscaledText) {
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) viewFindViewById).setImageResource(((Creative.DrawableWithUnscaledText) creative).getDrawableRes());
        } else if (creative instanceof Creative.Layout) {
            View viewFindViewById2 = view.findViewById(C11287R.id.splash_page_custom_container);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ViewGroups.inflate((FrameLayout) viewFindViewById2, ((Creative.Layout) creative).getLayoutRes(), true);
        } else if (!(creative instanceof Creative.Placeholder) && creative != null) {
            throw new NoWhenBranchMatchedException();
        }
        this.animationAdapter = new AnimationAdapter(viewFindViewById) { // from class: com.robinhood.android.common.onboarding.ui.SplashPage.setupView.2
            private final LottieAnimationView lottieView;

            {
                this.lottieView = viewFindViewById instanceof LottieAnimationView ? (LottieAnimationView) viewFindViewById : null;
            }

            @Override // com.robinhood.android.common.onboarding.ui.SplashPage.AnimationAdapter
            public void startAnimation() {
                LottieAnimationView lottieAnimationView2 = this.lottieView;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setMinFrame(0);
                }
                LottieAnimationView lottieAnimationView3 = this.lottieView;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.playAnimation();
                }
            }

            @Override // com.robinhood.android.common.onboarding.ui.SplashPage.AnimationAdapter
            public void stopAnimation() {
                LottieAnimationView lottieAnimationView2 = this.lottieView;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.cancelAnimation();
                }
            }
        };
        View viewFindViewById3 = view.findViewById(C11287R.id.splash_page_heading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextViewsKt.setVisibilityText((TextView) viewFindViewById3, this.heading);
        View viewFindViewById4 = view.findViewById(C11287R.id.splash_page_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextViewsKt.setVisibilityText((TextView) viewFindViewById4, this.title);
        TextView textView = (TextView) view.findViewById(C11287R.id.splash_page_summary);
        if (this.onLearnMore != null) {
            Intrinsics.checkNotNull(textView);
            CharSequence charSequence = this.summary;
            final Function0<Unit> function0 = this.onLearnMore;
            com.robinhood.android.common.util.extensions.TextViewsKt.setTextWithLearnMore(textView, charSequence, true, true, (String) null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.onboarding.ui.SplashPage$setupView$$inlined$setTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function0.invoke();
                }
            }, 1, (DefaultConstructorMarker) null));
            return;
        }
        textView.setText(this.summary);
    }

    public final void startAnimation() {
        AnimationAdapter animationAdapter = this.animationAdapter;
        if (animationAdapter != null) {
            animationAdapter.startAnimation();
        }
    }

    public final void stopAnimation() {
        AnimationAdapter animationAdapter = this.animationAdapter;
        if (animationAdapter != null) {
            animationAdapter.stopAnimation();
        }
    }
}
