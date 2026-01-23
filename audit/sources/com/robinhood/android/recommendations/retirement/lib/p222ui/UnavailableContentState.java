package com.robinhood.android.recommendations.retirement.lib.p222ui;

import androidx.compose.p011ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecsRetirementUnavailableContent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/recommendations/retirement/lib/ui/UnavailableContentState;", "", "title", "", "subtitle", "primaryCta", "secondaryCta", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPrimaryCta", "getSecondaryCta", "getBackgroundColor-0d7_KjU", "()J", "J", "component1", "component2", "component3", "component4", "component5", "component5-0d7_KjU", "copy", "copy-xwkQ0AY", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/robinhood/android/recommendations/retirement/lib/ui/UnavailableContentState;", "equals", "", "other", "hashCode", "", "toString", "feature-lib-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UnavailableContentState {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final String primaryCta;
    private final String secondaryCta;
    private final String subtitle;
    private final String title;

    public /* synthetic */ UnavailableContentState(String str, String str2, String str3, String str4, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j);
    }

    /* renamed from: copy-xwkQ0AY$default, reason: not valid java name */
    public static /* synthetic */ UnavailableContentState m17801copyxwkQ0AY$default(UnavailableContentState unavailableContentState, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unavailableContentState.title;
        }
        if ((i & 2) != 0) {
            str2 = unavailableContentState.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = unavailableContentState.primaryCta;
        }
        if ((i & 8) != 0) {
            str4 = unavailableContentState.secondaryCta;
        }
        if ((i & 16) != 0) {
            j = unavailableContentState.backgroundColor;
        }
        long j2 = j;
        return unavailableContentState.m17803copyxwkQ0AY(str, str2, str3, str4, j2);
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
    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: copy-xwkQ0AY, reason: not valid java name */
    public final UnavailableContentState m17803copyxwkQ0AY(String title, String subtitle, String primaryCta, String secondaryCta, long backgroundColor) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        return new UnavailableContentState(title, subtitle, primaryCta, secondaryCta, backgroundColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnavailableContentState)) {
            return false;
        }
        UnavailableContentState unavailableContentState = (UnavailableContentState) other;
        return Intrinsics.areEqual(this.title, unavailableContentState.title) && Intrinsics.areEqual(this.subtitle, unavailableContentState.subtitle) && Intrinsics.areEqual(this.primaryCta, unavailableContentState.primaryCta) && Intrinsics.areEqual(this.secondaryCta, unavailableContentState.secondaryCta) && Color.m6707equalsimpl0(this.backgroundColor, unavailableContentState.backgroundColor);
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.primaryCta.hashCode()) * 31) + this.secondaryCta.hashCode()) * 31) + Color.m6713hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "UnavailableContentState(title=" + this.title + ", subtitle=" + this.subtitle + ", primaryCta=" + this.primaryCta + ", secondaryCta=" + this.secondaryCta + ", backgroundColor=" + Color.m6714toStringimpl(this.backgroundColor) + ")";
    }

    private UnavailableContentState(String title, String subtitle, String primaryCta, String secondaryCta, long j) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(secondaryCta, "secondaryCta");
        this.title = title;
        this.subtitle = subtitle;
        this.primaryCta = primaryCta;
        this.secondaryCta = secondaryCta;
        this.backgroundColor = j;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getPrimaryCta() {
        return this.primaryCta;
    }

    public final String getSecondaryCta() {
        return this.secondaryCta;
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m17804getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }
}
