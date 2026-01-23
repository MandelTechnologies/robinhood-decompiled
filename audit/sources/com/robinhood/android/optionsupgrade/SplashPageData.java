package com.robinhood.android.optionsupgrade;

import com.robinhood.shared.remote.assets.LottieUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OptionOnboardingSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SplashPageData;", "", "lottieUrl", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "title", "", ErrorBundle.SUMMARY_ENTRY, "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Ljava/lang/String;Ljava/lang/String;)V", "getLottieUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "getTitle", "()Ljava/lang/String;", "getSummary", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SplashPageData {
    public static final int $stable = 0;
    private final LottieUrl lottieUrl;
    private final String summary;
    private final String title;

    public static /* synthetic */ SplashPageData copy$default(SplashPageData splashPageData, LottieUrl lottieUrl, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            lottieUrl = splashPageData.lottieUrl;
        }
        if ((i & 2) != 0) {
            str = splashPageData.title;
        }
        if ((i & 4) != 0) {
            str2 = splashPageData.summary;
        }
        return splashPageData.copy(lottieUrl, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final LottieUrl getLottieUrl() {
        return this.lottieUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final SplashPageData copy(LottieUrl lottieUrl, String title, String summary) {
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new SplashPageData(lottieUrl, title, summary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplashPageData)) {
            return false;
        }
        SplashPageData splashPageData = (SplashPageData) other;
        return this.lottieUrl == splashPageData.lottieUrl && Intrinsics.areEqual(this.title, splashPageData.title) && Intrinsics.areEqual(this.summary, splashPageData.summary);
    }

    public int hashCode() {
        return (((this.lottieUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.summary.hashCode();
    }

    public String toString() {
        return "SplashPageData(lottieUrl=" + this.lottieUrl + ", title=" + this.title + ", summary=" + this.summary + ")";
    }

    public SplashPageData(LottieUrl lottieUrl, String title, String summary) {
        Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.lottieUrl = lottieUrl;
        this.title = title;
        this.summary = summary;
    }

    public final LottieUrl getLottieUrl() {
        return this.lottieUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSummary() {
        return this.summary;
    }
}
