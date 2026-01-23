package com.robinhood.shared.chart.contracts.advancedChart;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlackWidowAdvancedChartFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/BlackWidowAdvancedChartFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "source", "", "showNuxLoading", "", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;Ljava/lang/String;Z)V", "getInstrumentId", "()Ljava/util/UUID;", "getInstrumentType", "()Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "getSource", "()Ljava/lang/String;", "getShowNuxLoading", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final /* data */ class BlackWidowAdvancedChartFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<BlackWidowAdvancedChartFragmentKey> CREATOR = new Creator();
    private final UUID instrumentId;
    private final BlackWidowAdvancedChartFragmentKey2 instrumentType;
    private final boolean showNuxLoading;
    private final String source;

    /* compiled from: BlackWidowAdvancedChartFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<BlackWidowAdvancedChartFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackWidowAdvancedChartFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BlackWidowAdvancedChartFragmentKey((UUID) parcel.readSerializable(), BlackWidowAdvancedChartFragmentKey2.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BlackWidowAdvancedChartFragmentKey[] newArray(int i) {
            return new BlackWidowAdvancedChartFragmentKey[i];
        }
    }

    public static /* synthetic */ BlackWidowAdvancedChartFragmentKey copy$default(BlackWidowAdvancedChartFragmentKey blackWidowAdvancedChartFragmentKey, UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = blackWidowAdvancedChartFragmentKey.instrumentId;
        }
        if ((i & 2) != 0) {
            blackWidowAdvancedChartFragmentKey2 = blackWidowAdvancedChartFragmentKey.instrumentType;
        }
        if ((i & 4) != 0) {
            str = blackWidowAdvancedChartFragmentKey.source;
        }
        if ((i & 8) != 0) {
            z = blackWidowAdvancedChartFragmentKey.showNuxLoading;
        }
        return blackWidowAdvancedChartFragmentKey.copy(uuid, blackWidowAdvancedChartFragmentKey2, str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final BlackWidowAdvancedChartFragmentKey2 getInstrumentType() {
        return this.instrumentType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowNuxLoading() {
        return this.showNuxLoading;
    }

    public final BlackWidowAdvancedChartFragmentKey copy(UUID instrumentId, BlackWidowAdvancedChartFragmentKey2 instrumentType, String source, boolean showNuxLoading) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(source, "source");
        return new BlackWidowAdvancedChartFragmentKey(instrumentId, instrumentType, source, showNuxLoading);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackWidowAdvancedChartFragmentKey)) {
            return false;
        }
        BlackWidowAdvancedChartFragmentKey blackWidowAdvancedChartFragmentKey = (BlackWidowAdvancedChartFragmentKey) other;
        return Intrinsics.areEqual(this.instrumentId, blackWidowAdvancedChartFragmentKey.instrumentId) && this.instrumentType == blackWidowAdvancedChartFragmentKey.instrumentType && Intrinsics.areEqual(this.source, blackWidowAdvancedChartFragmentKey.source) && this.showNuxLoading == blackWidowAdvancedChartFragmentKey.showNuxLoading;
    }

    public int hashCode() {
        return (((((this.instrumentId.hashCode() * 31) + this.instrumentType.hashCode()) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.showNuxLoading);
    }

    public String toString() {
        return "BlackWidowAdvancedChartFragmentKey(instrumentId=" + this.instrumentId + ", instrumentType=" + this.instrumentType + ", source=" + this.source + ", showNuxLoading=" + this.showNuxLoading + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        dest.writeString(this.instrumentType.name());
        dest.writeString(this.source);
        dest.writeInt(this.showNuxLoading ? 1 : 0);
    }

    public BlackWidowAdvancedChartFragmentKey(UUID instrumentId, BlackWidowAdvancedChartFragmentKey2 instrumentType, String source, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.instrumentId = instrumentId;
        this.instrumentType = instrumentType;
        this.source = source;
        this.showNuxLoading = z;
    }

    public /* synthetic */ BlackWidowAdvancedChartFragmentKey(UUID uuid, BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, blackWidowAdvancedChartFragmentKey2, str, (i & 8) != 0 ? false : z);
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final BlackWidowAdvancedChartFragmentKey2 getInstrumentType() {
        return this.instrumentType;
    }

    public final String getSource() {
        return this.source;
    }

    public final boolean getShowNuxLoading() {
        return this.showNuxLoading;
    }
}
