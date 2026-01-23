package com.robinhood.android.advisory.portfolio.restrictstocks;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictStocksViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/portfolio/restrictstocks/RestrictStocksDisclosure;", "", "title", "", "subtitle", "ctaText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCtaText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-advisory-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RestrictStocksDisclosure {
    public static final int $stable = 0;
    private final String ctaText;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ RestrictStocksDisclosure copy$default(RestrictStocksDisclosure restrictStocksDisclosure, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = restrictStocksDisclosure.title;
        }
        if ((i & 2) != 0) {
            str2 = restrictStocksDisclosure.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = restrictStocksDisclosure.ctaText;
        }
        return restrictStocksDisclosure.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    public final RestrictStocksDisclosure copy(String title, String subtitle, String ctaText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        return new RestrictStocksDisclosure(title, subtitle, ctaText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictStocksDisclosure)) {
            return false;
        }
        RestrictStocksDisclosure restrictStocksDisclosure = (RestrictStocksDisclosure) other;
        return Intrinsics.areEqual(this.title, restrictStocksDisclosure.title) && Intrinsics.areEqual(this.subtitle, restrictStocksDisclosure.subtitle) && Intrinsics.areEqual(this.ctaText, restrictStocksDisclosure.ctaText);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.ctaText.hashCode();
    }

    public String toString() {
        return "RestrictStocksDisclosure(title=" + this.title + ", subtitle=" + this.subtitle + ", ctaText=" + this.ctaText + ")";
    }

    public RestrictStocksDisclosure(String title, String subtitle, String ctaText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        this.title = title;
        this.subtitle = subtitle;
        this.ctaText = ctaText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getCtaText() {
        return this.ctaText;
    }
}
