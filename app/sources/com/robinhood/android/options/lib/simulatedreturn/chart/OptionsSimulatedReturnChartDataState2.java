package com.robinhood.android.options.lib.simulatedreturn.chart;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionLegBundle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionsSimulatedReturnChartDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "Landroid/os/Parcelable;", "<init>", "()V", "AggregatePosition", "InstrumentPosition", "Watchlist", "PreTrade", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$AggregatePosition;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$InstrumentPosition;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$PreTrade;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$Watchlist;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsSimulatedReturnChartDataState2 implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ OptionsSimulatedReturnChartDataState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsSimulatedReturnChartDataState2() {
    }

    /* compiled from: OptionsSimulatedReturnChartDataState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$AggregatePosition;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$AggregatePosition */
    public static final /* data */ class AggregatePosition extends OptionsSimulatedReturnChartDataState2 {
        public static final int $stable = 0;
        public static final AggregatePosition INSTANCE = new AggregatePosition();
        public static final Parcelable.Creator<AggregatePosition> CREATOR = new Creator();

        /* compiled from: OptionsSimulatedReturnChartDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$AggregatePosition$Creator */
        public static final class Creator implements Parcelable.Creator<AggregatePosition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AggregatePosition createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AggregatePosition.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AggregatePosition[] newArray(int i) {
                return new AggregatePosition[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AggregatePosition);
        }

        public int hashCode() {
            return -1585471743;
        }

        public String toString() {
            return "AggregatePosition";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private AggregatePosition() {
            super(null);
        }
    }

    /* compiled from: OptionsSimulatedReturnChartDataState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$InstrumentPosition;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$InstrumentPosition */
    public static final /* data */ class InstrumentPosition extends OptionsSimulatedReturnChartDataState2 {
        public static final int $stable = 0;
        public static final InstrumentPosition INSTANCE = new InstrumentPosition();
        public static final Parcelable.Creator<InstrumentPosition> CREATOR = new Creator();

        /* compiled from: OptionsSimulatedReturnChartDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$InstrumentPosition$Creator */
        public static final class Creator implements Parcelable.Creator<InstrumentPosition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentPosition createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstrumentPosition.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentPosition[] newArray(int i) {
                return new InstrumentPosition[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof InstrumentPosition);
        }

        public int hashCode() {
            return 1835144791;
        }

        public String toString() {
            return "InstrumentPosition";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private InstrumentPosition() {
            super(null);
        }
    }

    /* compiled from: OptionsSimulatedReturnChartDataState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$Watchlist;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$Watchlist */
    public static final /* data */ class Watchlist extends OptionsSimulatedReturnChartDataState2 {
        public static final int $stable = 0;
        public static final Watchlist INSTANCE = new Watchlist();
        public static final Parcelable.Creator<Watchlist> CREATOR = new Creator();

        /* compiled from: OptionsSimulatedReturnChartDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$Watchlist$Creator */
        public static final class Creator implements Parcelable.Creator<Watchlist> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Watchlist createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Watchlist.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Watchlist[] newArray(int i) {
                return new Watchlist[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Watchlist);
        }

        public int hashCode() {
            return -1112845850;
        }

        public String toString() {
            return "Watchlist";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        private Watchlist() {
            super(null);
        }
    }

    /* compiled from: OptionsSimulatedReturnChartDataState.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode$PreTrade;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "legs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/OptionLegBundle;", "<init>", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;Lkotlinx/collections/immutable/ImmutableList;)V", "getDefaultPricingSetting", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getLegs", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$PreTrade, reason: from toString */
    public static final /* data */ class PreTrade extends OptionsSimulatedReturnChartDataState2 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PreTrade> CREATOR = new Creator();
        private final OptionSettings.DefaultPricingSetting defaultPricingSetting;
        private final ImmutableList<OptionLegBundle> legs;

        /* compiled from: OptionsSimulatedReturnChartDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartLaunchMode$PreTrade$Creator */
        public static final class Creator implements Parcelable.Creator<PreTrade> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreTrade createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OptionSettings.DefaultPricingSetting defaultPricingSettingValueOf = OptionSettings.DefaultPricingSetting.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(PreTrade.class.getClassLoader()));
                }
                return new PreTrade(defaultPricingSettingValueOf, extensions2.toPersistentList(arrayList));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreTrade[] newArray(int i) {
                return new PreTrade[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PreTrade copy$default(PreTrade preTrade, OptionSettings.DefaultPricingSetting defaultPricingSetting, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                defaultPricingSetting = preTrade.defaultPricingSetting;
            }
            if ((i & 2) != 0) {
                immutableList = preTrade.legs;
            }
            return preTrade.copy(defaultPricingSetting, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
            return this.defaultPricingSetting;
        }

        public final ImmutableList<OptionLegBundle> component2() {
            return this.legs;
        }

        public final PreTrade copy(OptionSettings.DefaultPricingSetting defaultPricingSetting, ImmutableList<OptionLegBundle> legs) {
            Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
            Intrinsics.checkNotNullParameter(legs, "legs");
            return new PreTrade(defaultPricingSetting, legs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreTrade)) {
                return false;
            }
            PreTrade preTrade = (PreTrade) other;
            return this.defaultPricingSetting == preTrade.defaultPricingSetting && Intrinsics.areEqual(this.legs, preTrade.legs);
        }

        public int hashCode() {
            return (this.defaultPricingSetting.hashCode() * 31) + this.legs.hashCode();
        }

        public String toString() {
            return "PreTrade(defaultPricingSetting=" + this.defaultPricingSetting + ", legs=" + this.legs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.defaultPricingSetting.name());
            ImmutableList<OptionLegBundle> immutableList = this.legs;
            dest.writeInt(immutableList.size());
            Iterator<OptionLegBundle> it = immutableList.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }

        public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
            return this.defaultPricingSetting;
        }

        public final ImmutableList<OptionLegBundle> getLegs() {
            return this.legs;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreTrade(OptionSettings.DefaultPricingSetting defaultPricingSetting, ImmutableList<OptionLegBundle> legs) {
            super(null);
            Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
            Intrinsics.checkNotNullParameter(legs, "legs");
            this.defaultPricingSetting = defaultPricingSetting;
            this.legs = legs;
        }
    }
}
