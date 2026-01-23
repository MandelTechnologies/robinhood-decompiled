package com.robinhood.android.support.call;

import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallStatusViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/call/Illustration;", "", "<init>", "()V", "Lottie", "Drawable", "Lcom/robinhood/android/support/call/Illustration$Drawable;", "Lcom/robinhood/android/support/call/Illustration$Lottie;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.Illustration, reason: use source file name */
/* loaded from: classes9.dex */
public abstract class SupportCallStatusViewState3 {
    public static final int $stable = 0;

    public /* synthetic */ SupportCallStatusViewState3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/support/call/Illustration$Lottie;", "Lcom/robinhood/android/support/call/Illustration;", "lottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "loopAnimation", "", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Z)V", "getLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getLoopAnimation", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.Illustration$Lottie, reason: from toString */
    public static final /* data */ class Lottie extends SupportCallStatusViewState3 {
        public static final int $stable = 0;
        private final boolean loopAnimation;
        private final LottieUrl lottieUrl;

        public static /* synthetic */ Lottie copy$default(Lottie lottie, LottieUrl lottieUrl, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                lottieUrl = lottie.lottieUrl;
            }
            if ((i & 2) != 0) {
                z = lottie.loopAnimation;
            }
            return lottie.copy(lottieUrl, z);
        }

        /* renamed from: component1, reason: from getter */
        public final LottieUrl getLottieUrl() {
            return this.lottieUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLoopAnimation() {
            return this.loopAnimation;
        }

        public final Lottie copy(LottieUrl lottieUrl, boolean loopAnimation) {
            Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
            return new Lottie(lottieUrl, loopAnimation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Lottie)) {
                return false;
            }
            Lottie lottie = (Lottie) other;
            return this.lottieUrl == lottie.lottieUrl && this.loopAnimation == lottie.loopAnimation;
        }

        public int hashCode() {
            return (this.lottieUrl.hashCode() * 31) + Boolean.hashCode(this.loopAnimation);
        }

        public String toString() {
            return "Lottie(lottieUrl=" + this.lottieUrl + ", loopAnimation=" + this.loopAnimation + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lottie(LottieUrl lottieUrl, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
            this.lottieUrl = lottieUrl;
            this.loopAnimation = z;
        }

        public final boolean getLoopAnimation() {
            return this.loopAnimation;
        }

        public final LottieUrl getLottieUrl() {
            return this.lottieUrl;
        }
    }

    private SupportCallStatusViewState3() {
    }

    /* compiled from: SupportCallStatusViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/support/call/Illustration$Drawable;", "Lcom/robinhood/android/support/call/Illustration;", "drawableRes", "", "<init>", "(I)V", "getDrawableRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.Illustration$Drawable, reason: from toString */
    public static final /* data */ class Drawable extends SupportCallStatusViewState3 {
        public static final int $stable = 0;
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
}
