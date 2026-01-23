package com.robinhood.android.search.newsfeed.marketupdates;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: MarketIndicatorItemData.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemData;", "", "key", "", AnnotatedPrivateKey.LABEL, "value", "percentChange", "isStale", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getLabel", "getValue", "getPercentChange", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "feature-search_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MarketIndicatorItemData {
    public static final int $stable = 0;
    private final boolean isStale;
    private final String key;
    private final String label;
    private final String percentChange;
    private final String value;

    public static /* synthetic */ MarketIndicatorItemData copy$default(MarketIndicatorItemData marketIndicatorItemData, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketIndicatorItemData.key;
        }
        if ((i & 2) != 0) {
            str2 = marketIndicatorItemData.label;
        }
        if ((i & 4) != 0) {
            str3 = marketIndicatorItemData.value;
        }
        if ((i & 8) != 0) {
            str4 = marketIndicatorItemData.percentChange;
        }
        if ((i & 16) != 0) {
            z = marketIndicatorItemData.isStale;
        }
        boolean z2 = z;
        String str5 = str3;
        return marketIndicatorItemData.copy(str, str2, str5, str4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPercentChange() {
        return this.percentChange;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsStale() {
        return this.isStale;
    }

    public final MarketIndicatorItemData copy(String key, String label, String value, String percentChange, boolean isStale) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(percentChange, "percentChange");
        return new MarketIndicatorItemData(key, label, value, percentChange, isStale);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketIndicatorItemData)) {
            return false;
        }
        MarketIndicatorItemData marketIndicatorItemData = (MarketIndicatorItemData) other;
        return Intrinsics.areEqual(this.key, marketIndicatorItemData.key) && Intrinsics.areEqual(this.label, marketIndicatorItemData.label) && Intrinsics.areEqual(this.value, marketIndicatorItemData.value) && Intrinsics.areEqual(this.percentChange, marketIndicatorItemData.percentChange) && this.isStale == marketIndicatorItemData.isStale;
    }

    public int hashCode() {
        return (((((((this.key.hashCode() * 31) + this.label.hashCode()) * 31) + this.value.hashCode()) * 31) + this.percentChange.hashCode()) * 31) + Boolean.hashCode(this.isStale);
    }

    public String toString() {
        return "MarketIndicatorItemData(key=" + this.key + ", label=" + this.label + ", value=" + this.value + ", percentChange=" + this.percentChange + ", isStale=" + this.isStale + ")";
    }

    public MarketIndicatorItemData(String key, String label, String value, String percentChange, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(percentChange, "percentChange");
        this.key = key;
        this.label = label;
        this.value = value;
        this.percentChange = percentChange;
        this.isStale = z;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getValue() {
        return this.value;
    }

    public final String getPercentChange() {
        return this.percentChange;
    }

    public final boolean isStale() {
        return this.isStale;
    }
}
