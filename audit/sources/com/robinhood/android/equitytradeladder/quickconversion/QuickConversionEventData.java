package com.robinhood.android.equitytradeladder.quickconversion;

import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuickConversionEventHandler.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equitytradeladder/quickconversion/QuickConversionEventData;", "", "key", "Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "equityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "<init>", "(Lcom/robinhood/android/mcw/contracts/QuickConversionKey;Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;)V", "getKey", "()Lcom/robinhood/android/mcw/contracts/QuickConversionKey;", "getEquityOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-equity-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
final /* data */ class QuickConversionEventData {
    private final EquityOrderIntent equityOrderIntent;
    private final QuickConversionKey key;

    public static /* synthetic */ QuickConversionEventData copy$default(QuickConversionEventData quickConversionEventData, QuickConversionKey quickConversionKey, EquityOrderIntent equityOrderIntent, int i, Object obj) {
        if ((i & 1) != 0) {
            quickConversionKey = quickConversionEventData.key;
        }
        if ((i & 2) != 0) {
            equityOrderIntent = quickConversionEventData.equityOrderIntent;
        }
        return quickConversionEventData.copy(quickConversionKey, equityOrderIntent);
    }

    /* renamed from: component1, reason: from getter */
    public final QuickConversionKey getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }

    public final QuickConversionEventData copy(QuickConversionKey key, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        return new QuickConversionEventData(key, equityOrderIntent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickConversionEventData)) {
            return false;
        }
        QuickConversionEventData quickConversionEventData = (QuickConversionEventData) other;
        return Intrinsics.areEqual(this.key, quickConversionEventData.key) && Intrinsics.areEqual(this.equityOrderIntent, quickConversionEventData.equityOrderIntent);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.equityOrderIntent.hashCode();
    }

    public String toString() {
        return "QuickConversionEventData(key=" + this.key + ", equityOrderIntent=" + this.equityOrderIntent + ")";
    }

    public QuickConversionEventData(QuickConversionKey key, EquityOrderIntent equityOrderIntent) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        this.key = key;
        this.equityOrderIntent = equityOrderIntent;
    }

    public final QuickConversionKey getKey() {
        return this.key;
    }

    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }
}
