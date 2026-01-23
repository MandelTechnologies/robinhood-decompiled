package com.robinhood.android.education.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.p355ui.Historical;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlert.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/education/contracts/AlertHubIndicatorList;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "instrumentId", "Ljava/util/UUID;", "chartInterval", "Lcom/robinhood/models/ui/Historical$Interval;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/ui/Historical$Interval;)V", "getInstrumentId", "()Ljava/util/UUID;", "getChartInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AlertHubIndicatorList implements FragmentKey {
    public static final Parcelable.Creator<AlertHubIndicatorList> CREATOR = new Creator();
    private final Historical.Interval chartInterval;
    private final UUID instrumentId;

    /* compiled from: AdvancedAlert.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<AlertHubIndicatorList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertHubIndicatorList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlertHubIndicatorList((UUID) parcel.readSerializable(), parcel.readInt() == 0 ? null : Historical.Interval.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertHubIndicatorList[] newArray(int i) {
            return new AlertHubIndicatorList[i];
        }
    }

    public static /* synthetic */ AlertHubIndicatorList copy$default(AlertHubIndicatorList alertHubIndicatorList, UUID uuid, Historical.Interval interval, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = alertHubIndicatorList.instrumentId;
        }
        if ((i & 2) != 0) {
            interval = alertHubIndicatorList.chartInterval;
        }
        return alertHubIndicatorList.copy(uuid, interval);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final Historical.Interval getChartInterval() {
        return this.chartInterval;
    }

    public final AlertHubIndicatorList copy(UUID instrumentId, Historical.Interval chartInterval) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new AlertHubIndicatorList(instrumentId, chartInterval);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertHubIndicatorList)) {
            return false;
        }
        AlertHubIndicatorList alertHubIndicatorList = (AlertHubIndicatorList) other;
        return Intrinsics.areEqual(this.instrumentId, alertHubIndicatorList.instrumentId) && this.chartInterval == alertHubIndicatorList.chartInterval;
    }

    public int hashCode() {
        int iHashCode = this.instrumentId.hashCode() * 31;
        Historical.Interval interval = this.chartInterval;
        return iHashCode + (interval == null ? 0 : interval.hashCode());
    }

    public String toString() {
        return "AlertHubIndicatorList(instrumentId=" + this.instrumentId + ", chartInterval=" + this.chartInterval + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        Historical.Interval interval = this.chartInterval;
        if (interval == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(interval.name());
        }
    }

    public AlertHubIndicatorList(UUID instrumentId, Historical.Interval interval) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        this.instrumentId = instrumentId;
        this.chartInterval = interval;
    }

    public /* synthetic */ AlertHubIndicatorList(UUID uuid, Historical.Interval interval, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, (i & 2) != 0 ? null : interval);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final Historical.Interval getChartInterval() {
        return this.chartInterval;
    }
}
