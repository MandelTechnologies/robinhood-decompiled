package com.robinhood.android.history.p153ui;

import com.robinhood.android.equities.taxlots.viewLots.ViewLotsKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderDetailViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/history/ui/TaxLotData;", "", "title", "", "subtitle", "viewLotsKey", "Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsKey;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsKey;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getViewLotsKey", "()Lcom/robinhood/android/equities/taxlots/viewLots/ViewLotsKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TaxLotData {
    public static final int $stable = ViewLotsKey.$stable;
    private final String subtitle;
    private final String title;
    private final ViewLotsKey viewLotsKey;

    public static /* synthetic */ TaxLotData copy$default(TaxLotData taxLotData, String str, String str2, ViewLotsKey viewLotsKey, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotData.title;
        }
        if ((i & 2) != 0) {
            str2 = taxLotData.subtitle;
        }
        if ((i & 4) != 0) {
            viewLotsKey = taxLotData.viewLotsKey;
        }
        return taxLotData.copy(str, str2, viewLotsKey);
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
    public final ViewLotsKey getViewLotsKey() {
        return this.viewLotsKey;
    }

    public final TaxLotData copy(String title, String subtitle, ViewLotsKey viewLotsKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(viewLotsKey, "viewLotsKey");
        return new TaxLotData(title, subtitle, viewLotsKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxLotData)) {
            return false;
        }
        TaxLotData taxLotData = (TaxLotData) other;
        return Intrinsics.areEqual(this.title, taxLotData.title) && Intrinsics.areEqual(this.subtitle, taxLotData.subtitle) && Intrinsics.areEqual(this.viewLotsKey, taxLotData.viewLotsKey);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.viewLotsKey.hashCode();
    }

    public String toString() {
        return "TaxLotData(title=" + this.title + ", subtitle=" + this.subtitle + ", viewLotsKey=" + this.viewLotsKey + ")";
    }

    public TaxLotData(String title, String subtitle, ViewLotsKey viewLotsKey) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(viewLotsKey, "viewLotsKey");
        this.title = title;
        this.subtitle = subtitle;
        this.viewLotsKey = viewLotsKey;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ViewLotsKey getViewLotsKey() {
        return this.viewLotsKey;
    }
}
