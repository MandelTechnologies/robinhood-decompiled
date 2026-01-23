package com.robinhood.android.support.call.channelavailability;

import com.robinhood.models.api.ChannelAvailabilityReason;
import com.robinhood.models.p355ui.AlertDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnavailableChannelData.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/support/call/channelavailability/UnavailableChannelData;", "", "alertDetails", "Lcom/robinhood/models/ui/AlertDetails;", "reason", "Lcom/robinhood/models/api/ChannelAvailabilityReason;", "<init>", "(Lcom/robinhood/models/ui/AlertDetails;Lcom/robinhood/models/api/ChannelAvailabilityReason;)V", "getAlertDetails", "()Lcom/robinhood/models/ui/AlertDetails;", "getReason", "()Lcom/robinhood/models/api/ChannelAvailabilityReason;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class UnavailableChannelData {
    public static final int $stable = 8;
    private final AlertDetails alertDetails;
    private final ChannelAvailabilityReason reason;

    public static /* synthetic */ UnavailableChannelData copy$default(UnavailableChannelData unavailableChannelData, AlertDetails alertDetails, ChannelAvailabilityReason channelAvailabilityReason, int i, Object obj) {
        if ((i & 1) != 0) {
            alertDetails = unavailableChannelData.alertDetails;
        }
        if ((i & 2) != 0) {
            channelAvailabilityReason = unavailableChannelData.reason;
        }
        return unavailableChannelData.copy(alertDetails, channelAvailabilityReason);
    }

    /* renamed from: component1, reason: from getter */
    public final AlertDetails getAlertDetails() {
        return this.alertDetails;
    }

    /* renamed from: component2, reason: from getter */
    public final ChannelAvailabilityReason getReason() {
        return this.reason;
    }

    public final UnavailableChannelData copy(AlertDetails alertDetails, ChannelAvailabilityReason reason) {
        Intrinsics.checkNotNullParameter(alertDetails, "alertDetails");
        return new UnavailableChannelData(alertDetails, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnavailableChannelData)) {
            return false;
        }
        UnavailableChannelData unavailableChannelData = (UnavailableChannelData) other;
        return Intrinsics.areEqual(this.alertDetails, unavailableChannelData.alertDetails) && this.reason == unavailableChannelData.reason;
    }

    public int hashCode() {
        int iHashCode = this.alertDetails.hashCode() * 31;
        ChannelAvailabilityReason channelAvailabilityReason = this.reason;
        return iHashCode + (channelAvailabilityReason == null ? 0 : channelAvailabilityReason.hashCode());
    }

    public String toString() {
        return "UnavailableChannelData(alertDetails=" + this.alertDetails + ", reason=" + this.reason + ")";
    }

    public UnavailableChannelData(AlertDetails alertDetails, ChannelAvailabilityReason channelAvailabilityReason) {
        Intrinsics.checkNotNullParameter(alertDetails, "alertDetails");
        this.alertDetails = alertDetails;
        this.reason = channelAvailabilityReason;
    }

    public final AlertDetails getAlertDetails() {
        return this.alertDetails;
    }

    public final ChannelAvailabilityReason getReason() {
        return this.reason;
    }
}
