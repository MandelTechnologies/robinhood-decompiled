package com.robinhood.android.options.lib.simulatedreturn.chart;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.util.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsProfitAndLossChartDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "Landroid/os/Parcelable;", "<init>", "()V", "PreTrade", "PortfolioRiskAnalyzer", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode$PortfolioRiskAnalyzer;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode$PreTrade;", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartLaunchMode, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionsProfitAndLossChartDataState4 implements Parcelable {
    public static final int $stable = 0;

    public /* synthetic */ OptionsProfitAndLossChartDataState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OptionsProfitAndLossChartDataState4() {
    }

    /* compiled from: OptionsProfitAndLossChartDataState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode$PreTrade;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "<init>", "(Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;)V", "getDefaultPricingSetting", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartLaunchMode$PreTrade, reason: from toString */
    public static final /* data */ class PreTrade extends OptionsProfitAndLossChartDataState4 {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PreTrade> CREATOR = new Creator();
        private final OptionSettings.DefaultPricingSetting defaultPricingSetting;

        /* compiled from: OptionsProfitAndLossChartDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartLaunchMode$PreTrade$Creator */
        public static final class Creator implements Parcelable.Creator<PreTrade> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreTrade createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreTrade(OptionSettings.DefaultPricingSetting.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreTrade[] newArray(int i) {
                return new PreTrade[i];
            }
        }

        public static /* synthetic */ PreTrade copy$default(PreTrade preTrade, OptionSettings.DefaultPricingSetting defaultPricingSetting, int i, Object obj) {
            if ((i & 1) != 0) {
                defaultPricingSetting = preTrade.defaultPricingSetting;
            }
            return preTrade.copy(defaultPricingSetting);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
            return this.defaultPricingSetting;
        }

        public final PreTrade copy(OptionSettings.DefaultPricingSetting defaultPricingSetting) {
            Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
            return new PreTrade(defaultPricingSetting);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PreTrade) && this.defaultPricingSetting == ((PreTrade) other).defaultPricingSetting;
        }

        public int hashCode() {
            return this.defaultPricingSetting.hashCode();
        }

        public String toString() {
            return "PreTrade(defaultPricingSetting=" + this.defaultPricingSetting + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.defaultPricingSetting.name());
        }

        public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
            return this.defaultPricingSetting;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreTrade(OptionSettings.DefaultPricingSetting defaultPricingSetting) {
            super(null);
            Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
            this.defaultPricingSetting = defaultPricingSetting;
        }
    }

    /* compiled from: OptionsProfitAndLossChartDataState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode$PortfolioRiskAnalyzer;", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsProfitAndLossChartLaunchMode;", "totalCostForPercentageCalculation", "Lcom/robinhood/models/util/Money;", "optionOrderPrice", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;)V", "getTotalCostForPercentageCalculation", "()Lcom/robinhood/models/util/Money;", "getOptionOrderPrice", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartLaunchMode$PortfolioRiskAnalyzer, reason: from toString */
    public static final /* data */ class PortfolioRiskAnalyzer extends OptionsProfitAndLossChartDataState4 {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PortfolioRiskAnalyzer> CREATOR = new Creator();
        private final Money optionOrderPrice;
        private final Money totalCostForPercentageCalculation;

        /* compiled from: OptionsProfitAndLossChartDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.options.lib.simulatedreturn.chart.OptionsProfitAndLossChartLaunchMode$PortfolioRiskAnalyzer$Creator */
        public static final class Creator implements Parcelable.Creator<PortfolioRiskAnalyzer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PortfolioRiskAnalyzer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioRiskAnalyzer((Money) parcel.readParcelable(PortfolioRiskAnalyzer.class.getClassLoader()), (Money) parcel.readParcelable(PortfolioRiskAnalyzer.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PortfolioRiskAnalyzer[] newArray(int i) {
                return new PortfolioRiskAnalyzer[i];
            }
        }

        public static /* synthetic */ PortfolioRiskAnalyzer copy$default(PortfolioRiskAnalyzer portfolioRiskAnalyzer, Money money, Money money2, int i, Object obj) {
            if ((i & 1) != 0) {
                money = portfolioRiskAnalyzer.totalCostForPercentageCalculation;
            }
            if ((i & 2) != 0) {
                money2 = portfolioRiskAnalyzer.optionOrderPrice;
            }
            return portfolioRiskAnalyzer.copy(money, money2);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getTotalCostForPercentageCalculation() {
            return this.totalCostForPercentageCalculation;
        }

        /* renamed from: component2, reason: from getter */
        public final Money getOptionOrderPrice() {
            return this.optionOrderPrice;
        }

        public final PortfolioRiskAnalyzer copy(Money totalCostForPercentageCalculation, Money optionOrderPrice) {
            Intrinsics.checkNotNullParameter(totalCostForPercentageCalculation, "totalCostForPercentageCalculation");
            Intrinsics.checkNotNullParameter(optionOrderPrice, "optionOrderPrice");
            return new PortfolioRiskAnalyzer(totalCostForPercentageCalculation, optionOrderPrice);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PortfolioRiskAnalyzer)) {
                return false;
            }
            PortfolioRiskAnalyzer portfolioRiskAnalyzer = (PortfolioRiskAnalyzer) other;
            return Intrinsics.areEqual(this.totalCostForPercentageCalculation, portfolioRiskAnalyzer.totalCostForPercentageCalculation) && Intrinsics.areEqual(this.optionOrderPrice, portfolioRiskAnalyzer.optionOrderPrice);
        }

        public int hashCode() {
            return (this.totalCostForPercentageCalculation.hashCode() * 31) + this.optionOrderPrice.hashCode();
        }

        public String toString() {
            return "PortfolioRiskAnalyzer(totalCostForPercentageCalculation=" + this.totalCostForPercentageCalculation + ", optionOrderPrice=" + this.optionOrderPrice + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.totalCostForPercentageCalculation, flags);
            dest.writeParcelable(this.optionOrderPrice, flags);
        }

        public final Money getTotalCostForPercentageCalculation() {
            return this.totalCostForPercentageCalculation;
        }

        public final Money getOptionOrderPrice() {
            return this.optionOrderPrice;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PortfolioRiskAnalyzer(Money totalCostForPercentageCalculation, Money optionOrderPrice) {
            super(null);
            Intrinsics.checkNotNullParameter(totalCostForPercentageCalculation, "totalCostForPercentageCalculation");
            Intrinsics.checkNotNullParameter(optionOrderPrice, "optionOrderPrice");
            this.totalCostForPercentageCalculation = totalCostForPercentageCalculation;
            this.optionOrderPrice = optionOrderPrice;
        }
    }
}
