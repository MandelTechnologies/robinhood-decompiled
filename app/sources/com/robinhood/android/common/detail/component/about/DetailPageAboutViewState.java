package com.robinhood.android.common.detail.component.about;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageAboutViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/about/DetailPageAboutViewState;", "", "instrumentTitle", "", "description", "showThisSection", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getInstrumentTitle", "()Ljava/lang/String;", "getDescription", "getShowThisSection", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DetailPageAboutViewState {
    public static final int $stable = 0;
    private final String description;
    private final String instrumentTitle;
    private final boolean showThisSection;

    public static /* synthetic */ DetailPageAboutViewState copy$default(DetailPageAboutViewState detailPageAboutViewState, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailPageAboutViewState.instrumentTitle;
        }
        if ((i & 2) != 0) {
            str2 = detailPageAboutViewState.description;
        }
        if ((i & 4) != 0) {
            z = detailPageAboutViewState.showThisSection;
        }
        return detailPageAboutViewState.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentTitle() {
        return this.instrumentTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowThisSection() {
        return this.showThisSection;
    }

    public final DetailPageAboutViewState copy(String instrumentTitle, String description, boolean showThisSection) {
        Intrinsics.checkNotNullParameter(instrumentTitle, "instrumentTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        return new DetailPageAboutViewState(instrumentTitle, description, showThisSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailPageAboutViewState)) {
            return false;
        }
        DetailPageAboutViewState detailPageAboutViewState = (DetailPageAboutViewState) other;
        return Intrinsics.areEqual(this.instrumentTitle, detailPageAboutViewState.instrumentTitle) && Intrinsics.areEqual(this.description, detailPageAboutViewState.description) && this.showThisSection == detailPageAboutViewState.showThisSection;
    }

    public int hashCode() {
        return (((this.instrumentTitle.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.showThisSection);
    }

    public String toString() {
        return "DetailPageAboutViewState(instrumentTitle=" + this.instrumentTitle + ", description=" + this.description + ", showThisSection=" + this.showThisSection + ")";
    }

    public DetailPageAboutViewState(String instrumentTitle, String description, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentTitle, "instrumentTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.instrumentTitle = instrumentTitle;
        this.description = description;
        this.showThisSection = z;
    }

    public final String getInstrumentTitle() {
        return this.instrumentTitle;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getShowThisSection() {
        return this.showThisSection;
    }
}
