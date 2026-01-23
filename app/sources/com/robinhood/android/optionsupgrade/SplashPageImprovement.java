package com.robinhood.android.optionsupgrade;

import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OptionOnboardingImprovementSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SplashPageImprovement;", "", "creative", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;", "title", "", ErrorBundle.SUMMARY_ENTRY, "<init>", "(Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;Ljava/lang/String;Ljava/lang/String;)V", "getCreative", "()Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;", "getTitle", "()Ljava/lang/String;", "getSummary", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Creative", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SplashPageImprovement {
    public static final int $stable = 0;
    private final Creative creative;
    private final String summary;
    private final String title;

    public static /* synthetic */ SplashPageImprovement copy$default(SplashPageImprovement splashPageImprovement, Creative creative, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            creative = splashPageImprovement.creative;
        }
        if ((i & 2) != 0) {
            str = splashPageImprovement.title;
        }
        if ((i & 4) != 0) {
            str2 = splashPageImprovement.summary;
        }
        return splashPageImprovement.copy(creative, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Creative getCreative() {
        return this.creative;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final SplashPageImprovement copy(Creative creative, String title, String summary) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new SplashPageImprovement(creative, title, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplashPageImprovement)) {
            return false;
        }
        SplashPageImprovement splashPageImprovement = (SplashPageImprovement) other;
        return Intrinsics.areEqual(this.creative, splashPageImprovement.creative) && Intrinsics.areEqual(this.title, splashPageImprovement.title) && Intrinsics.areEqual(this.summary, splashPageImprovement.summary);
    }

    public int hashCode() {
        return (((this.creative.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode();
    }

    public String toString() {
        return "SplashPageImprovement(creative=" + this.creative + ", title=" + this.title + ", summary=" + this.summary + ")";
    }

    public SplashPageImprovement(Creative creative, String title, String summary) {
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.creative = creative;
        this.title = title;
        this.summary = summary;
    }

    public final Creative getCreative() {
        return this.creative;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSummary() {
        return this.summary;
    }

    /* compiled from: OptionOnboardingImprovementSplashComposable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;", "", "<init>", "()V", "RemoteLottie", "Drawable", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative$Drawable;", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative$RemoteLottie;", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Creative {
        public static final int $stable = 0;

        public /* synthetic */ Creative(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Creative() {
        }

        /* compiled from: OptionOnboardingImprovementSplashComposable.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative$RemoteLottie;", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;", "lottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;)V", "getLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RemoteLottie extends Creative {
            public static final int $stable = 0;
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

        /* compiled from: OptionOnboardingImprovementSplashComposable.kt */
        @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative$Drawable;", "Lcom/robinhood/android/optionsupgrade/SplashPageImprovement$Creative;", "drawableRes", "", "<init>", "(I)V", "getDrawableRes", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Drawable extends Creative {
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
}
