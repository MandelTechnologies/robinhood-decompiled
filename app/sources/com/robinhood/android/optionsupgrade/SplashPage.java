package com.robinhood.android.optionsupgrade;

import com.robinhood.android.navigation.app.keys.data.OptionPage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: OptionOnboardingSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/SplashPage;", "", "drawableResId", "", "title", "", ErrorBundle.SUMMARY_ENTRY, "optionPage", "Lcom/robinhood/android/navigation/app/keys/data/OptionPage;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/navigation/app/keys/data/OptionPage;)V", "getDrawableResId", "()I", "getTitle", "()Ljava/lang/String;", "getSummary", "getOptionPage", "()Lcom/robinhood/android/navigation/app/keys/data/OptionPage;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SplashPage {
    public static final int $stable = 0;
    private final int drawableResId;
    private final OptionPage optionPage;
    private final String summary;
    private final String title;

    public static /* synthetic */ SplashPage copy$default(SplashPage splashPage, int i, String str, String str2, OptionPage optionPage, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = splashPage.drawableResId;
        }
        if ((i2 & 2) != 0) {
            str = splashPage.title;
        }
        if ((i2 & 4) != 0) {
            str2 = splashPage.summary;
        }
        if ((i2 & 8) != 0) {
            optionPage = splashPage.optionPage;
        }
        return splashPage.copy(i, str, str2, optionPage);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDrawableResId() {
        return this.drawableResId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component4, reason: from getter */
    public final OptionPage getOptionPage() {
        return this.optionPage;
    }

    public final SplashPage copy(int drawableResId, String title, String summary, OptionPage optionPage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new SplashPage(drawableResId, title, summary, optionPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplashPage)) {
            return false;
        }
        SplashPage splashPage = (SplashPage) other;
        return this.drawableResId == splashPage.drawableResId && Intrinsics.areEqual(this.title, splashPage.title) && Intrinsics.areEqual(this.summary, splashPage.summary) && this.optionPage == splashPage.optionPage;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.drawableResId) * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31;
        OptionPage optionPage = this.optionPage;
        return iHashCode + (optionPage == null ? 0 : optionPage.hashCode());
    }

    public String toString() {
        return "SplashPage(drawableResId=" + this.drawableResId + ", title=" + this.title + ", summary=" + this.summary + ", optionPage=" + this.optionPage + ")";
    }

    public SplashPage(int i, String title, String summary, OptionPage optionPage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.drawableResId = i;
        this.title = title;
        this.summary = summary;
        this.optionPage = optionPage;
    }

    public /* synthetic */ SplashPage(int i, String str, String str2, OptionPage optionPage, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : optionPage);
    }

    public final int getDrawableResId() {
        return this.drawableResId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final OptionPage getOptionPage() {
        return this.optionPage;
    }
}
