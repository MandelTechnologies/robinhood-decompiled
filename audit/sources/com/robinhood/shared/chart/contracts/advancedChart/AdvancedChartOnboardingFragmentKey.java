package com.robinhood.shared.chart.contracts.advancedChart;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.rosetta.eventlogging.AdvancedChartsAboutContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedChartOnboardingFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartOnboardingFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "sourceType", "Lcom/robinhood/rosetta/eventlogging/AdvancedChartsAboutContext$SourceType;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/AdvancedChartsAboutContext$SourceType;)V", "getSourceType", "()Lcom/robinhood/rosetta/eventlogging/AdvancedChartsAboutContext$SourceType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class AdvancedChartOnboardingFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<AdvancedChartOnboardingFragmentKey> CREATOR = new Creator();
    private final AdvancedChartsAboutContext.SourceType sourceType;

    /* compiled from: AdvancedChartOnboardingFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Creator implements Parcelable.Creator<AdvancedChartOnboardingFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedChartOnboardingFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdvancedChartOnboardingFragmentKey(AdvancedChartsAboutContext.SourceType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedChartOnboardingFragmentKey[] newArray(int i) {
            return new AdvancedChartOnboardingFragmentKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sourceType.name());
    }

    public AdvancedChartOnboardingFragmentKey(AdvancedChartsAboutContext.SourceType sourceType) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        this.sourceType = sourceType;
    }

    public final AdvancedChartsAboutContext.SourceType getSourceType() {
        return this.sourceType;
    }
}
