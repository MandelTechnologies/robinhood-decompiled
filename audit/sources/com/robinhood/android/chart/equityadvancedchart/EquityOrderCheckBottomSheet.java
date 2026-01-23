package com.robinhood.android.chart.equityadvancedchart;

import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartEvent;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityAdvanceChartOrderEvent.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/chart/equityadvancedchart/EquityOrderCheckBottomSheet;", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartEvent;", "equityOrderIntent", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "tag", "", "<init>", "(Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;Lcom/robinhood/android/navigation/keys/DialogFragmentKey;Ljava/lang/String;)V", "getEquityOrderIntent", "()Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "getKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-equity-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EquityOrderCheckBottomSheet implements AdvanceChartEvent {
    public static final int $stable = 8;
    private final EquityOrderIntent equityOrderIntent;
    private final DialogFragmentKey key;
    private final String tag;

    public static /* synthetic */ EquityOrderCheckBottomSheet copy$default(EquityOrderCheckBottomSheet equityOrderCheckBottomSheet, EquityOrderIntent equityOrderIntent, DialogFragmentKey dialogFragmentKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            equityOrderIntent = equityOrderCheckBottomSheet.equityOrderIntent;
        }
        if ((i & 2) != 0) {
            dialogFragmentKey = equityOrderCheckBottomSheet.key;
        }
        if ((i & 4) != 0) {
            str = equityOrderCheckBottomSheet.tag;
        }
        return equityOrderCheckBottomSheet.copy(equityOrderIntent, dialogFragmentKey, str);
    }

    /* renamed from: component1, reason: from getter */
    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }

    /* renamed from: component2, reason: from getter */
    public final DialogFragmentKey getKey() {
        return this.key;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final EquityOrderCheckBottomSheet copy(EquityOrderIntent equityOrderIntent, DialogFragmentKey key, String tag) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        Intrinsics.checkNotNullParameter(key, "key");
        return new EquityOrderCheckBottomSheet(equityOrderIntent, key, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityOrderCheckBottomSheet)) {
            return false;
        }
        EquityOrderCheckBottomSheet equityOrderCheckBottomSheet = (EquityOrderCheckBottomSheet) other;
        return Intrinsics.areEqual(this.equityOrderIntent, equityOrderCheckBottomSheet.equityOrderIntent) && Intrinsics.areEqual(this.key, equityOrderCheckBottomSheet.key) && Intrinsics.areEqual(this.tag, equityOrderCheckBottomSheet.tag);
    }

    public int hashCode() {
        int iHashCode = ((this.equityOrderIntent.hashCode() * 31) + this.key.hashCode()) * 31;
        String str = this.tag;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EquityOrderCheckBottomSheet(equityOrderIntent=" + this.equityOrderIntent + ", key=" + this.key + ", tag=" + this.tag + ")";
    }

    public EquityOrderCheckBottomSheet(EquityOrderIntent equityOrderIntent, DialogFragmentKey key, String str) {
        Intrinsics.checkNotNullParameter(equityOrderIntent, "equityOrderIntent");
        Intrinsics.checkNotNullParameter(key, "key");
        this.equityOrderIntent = equityOrderIntent;
        this.key = key;
        this.tag = str;
    }

    public /* synthetic */ EquityOrderCheckBottomSheet(EquityOrderIntent equityOrderIntent, DialogFragmentKey dialogFragmentKey, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(equityOrderIntent, dialogFragmentKey, (i & 4) != 0 ? null : str);
    }

    public final EquityOrderIntent getEquityOrderIntent() {
        return this.equityOrderIntent;
    }

    public final DialogFragmentKey getKey() {
        return this.key;
    }

    public final String getTag() {
        return this.tag;
    }
}
