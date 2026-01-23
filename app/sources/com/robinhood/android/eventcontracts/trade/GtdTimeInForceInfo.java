package com.robinhood.android.eventcontracts.trade;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;

/* compiled from: StreamGtdExpireTimestamp.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;", "", "j$/time/Instant", "expireTime", "Lcom/robinhood/utils/resource/StringResource;", "displayString", "<init>", "(Lj$/time/Instant;Lcom/robinhood/utils/resource/StringResource;)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/utils/resource/StringResource;", "copy", "(Lj$/time/Instant;Lcom/robinhood/utils/resource/StringResource;)Lcom/robinhood/android/eventcontracts/trade/GtdTimeInForceInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getExpireTime", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayString", "lib-event-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GtdTimeInForceInfo {
    private final StringResource displayString;
    private final Instant expireTime;

    public static /* synthetic */ GtdTimeInForceInfo copy$default(GtdTimeInForceInfo gtdTimeInForceInfo, Instant instant, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = gtdTimeInForceInfo.expireTime;
        }
        if ((i & 2) != 0) {
            stringResource = gtdTimeInForceInfo.displayString;
        }
        return gtdTimeInForceInfo.copy(instant, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final Instant getExpireTime() {
        return this.expireTime;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getDisplayString() {
        return this.displayString;
    }

    public final GtdTimeInForceInfo copy(Instant expireTime, StringResource displayString) {
        Intrinsics.checkNotNullParameter(expireTime, "expireTime");
        Intrinsics.checkNotNullParameter(displayString, "displayString");
        return new GtdTimeInForceInfo(expireTime, displayString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GtdTimeInForceInfo)) {
            return false;
        }
        GtdTimeInForceInfo gtdTimeInForceInfo = (GtdTimeInForceInfo) other;
        return Intrinsics.areEqual(this.expireTime, gtdTimeInForceInfo.expireTime) && Intrinsics.areEqual(this.displayString, gtdTimeInForceInfo.displayString);
    }

    public int hashCode() {
        return (this.expireTime.hashCode() * 31) + this.displayString.hashCode();
    }

    public String toString() {
        return "GtdTimeInForceInfo(expireTime=" + this.expireTime + ", displayString=" + this.displayString + ")";
    }

    public GtdTimeInForceInfo(Instant expireTime, StringResource displayString) {
        Intrinsics.checkNotNullParameter(expireTime, "expireTime");
        Intrinsics.checkNotNullParameter(displayString, "displayString");
        this.expireTime = expireTime;
        this.displayString = displayString;
    }

    public final Instant getExpireTime() {
        return this.expireTime;
    }

    public final StringResource getDisplayString() {
        return this.displayString;
    }
}
