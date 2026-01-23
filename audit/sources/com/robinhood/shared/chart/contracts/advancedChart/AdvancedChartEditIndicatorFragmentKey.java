package com.robinhood.shared.chart.contracts.advancedChart;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartEditIndicatorFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "instrumentId", "Ljava/util/UUID;", "launchMode", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;)V", "getInstrumentId", "()Ljava/util/UUID;", "getLaunchMode", "()Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartEditIndicatorLaunchMode;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AdvancedChartEditIndicatorFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<AdvancedChartEditIndicatorFragmentKey> CREATOR = new Creator();
    private final UUID instrumentId;
    private final AdvancedChartEditIndicatorLaunchMode launchMode;

    /* compiled from: AdvancedChartEditIndicatorFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<AdvancedChartEditIndicatorFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedChartEditIndicatorFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvancedChartEditIndicatorFragmentKey((UUID) parcel.readSerializable(), (AdvancedChartEditIndicatorLaunchMode) parcel.readParcelable(AdvancedChartEditIndicatorFragmentKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedChartEditIndicatorFragmentKey[] newArray(int i) {
            return new AdvancedChartEditIndicatorFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.instrumentId);
        dest.writeParcelable(this.launchMode, flags);
    }

    public AdvancedChartEditIndicatorFragmentKey(UUID instrumentId, AdvancedChartEditIndicatorLaunchMode launchMode) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.instrumentId = instrumentId;
        this.launchMode = launchMode;
    }

    public final UUID getInstrumentId() {
        return this.instrumentId;
    }

    public final AdvancedChartEditIndicatorLaunchMode getLaunchMode() {
        return this.launchMode;
    }
}
