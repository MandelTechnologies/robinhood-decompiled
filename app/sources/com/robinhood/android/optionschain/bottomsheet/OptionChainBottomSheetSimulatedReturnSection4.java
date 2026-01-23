package com.robinhood.android.optionschain.bottomsheet;

import com.robinhood.android.options.lib.simulatedreturn.chart.OptionsSimulatedReturnChartDataState2;
import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.OptionOrderBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainBottomSheetSimulatedReturnSection.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B+\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;", "", "accountNumber", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "simulatedReturnSliderLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;Lcom/robinhood/models/ui/OptionOrderBundle;)V", "getAccountNumber", "()Ljava/lang/String;", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getSimulatedReturnSliderLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "PnlChart", "SimulatedReturn", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState$PnlChart;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState$SimulatedReturn;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedChartSectionState, reason: use source file name */
/* loaded from: classes11.dex */
public abstract class OptionChainBottomSheetSimulatedReturnSection4 {
    public static final int $stable = 8;
    private final String accountNumber;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final OptionOrderBundle optionOrderBundle;
    private final OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode;

    public /* synthetic */ OptionChainBottomSheetSimulatedReturnSection4(String str, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, optionsSimulatedReturnLoggingState, optionsSimulatedReturnSliderLaunchMode, optionOrderBundle);
    }

    private OptionChainBottomSheetSimulatedReturnSection4(String str, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle) {
        this.accountNumber = str;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.simulatedReturnSliderLaunchMode = optionsSimulatedReturnSliderLaunchMode;
        this.optionOrderBundle = optionOrderBundle;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public OptionsSimulatedReturnSliderLaunchMode getSimulatedReturnSliderLaunchMode() {
        return this.simulatedReturnSliderLaunchMode;
    }

    public OptionOrderBundle getOptionOrderBundle() {
        return this.optionOrderBundle;
    }

    /* compiled from: OptionChainBottomSheetSimulatedReturnSection.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState$PnlChart;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;", "accountNumber", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "simulatedReturnSliderLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "defaultPricingSetting", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;Lcom/robinhood/models/ui/OptionOrderBundle;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;)V", "getAccountNumber", "()Ljava/lang/String;", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getSimulatedReturnSliderLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getDefaultPricingSetting", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedChartSectionState$PnlChart, reason: from toString */
    public static final /* data */ class PnlChart extends OptionChainBottomSheetSimulatedReturnSection4 {
        public static final int $stable = 8;
        private final String accountNumber;
        private final OptionSettings.DefaultPricingSetting defaultPricingSetting;
        private final OptionsSimulatedReturnLoggingState loggingState;
        private final OptionOrderBundle optionOrderBundle;
        private final OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode;

        public static /* synthetic */ PnlChart copy$default(PnlChart pnlChart, String str, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle, OptionSettings.DefaultPricingSetting defaultPricingSetting, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pnlChart.accountNumber;
            }
            if ((i & 2) != 0) {
                optionsSimulatedReturnLoggingState = pnlChart.loggingState;
            }
            if ((i & 4) != 0) {
                optionsSimulatedReturnSliderLaunchMode = pnlChart.simulatedReturnSliderLaunchMode;
            }
            if ((i & 8) != 0) {
                optionOrderBundle = pnlChart.optionOrderBundle;
            }
            if ((i & 16) != 0) {
                defaultPricingSetting = pnlChart.defaultPricingSetting;
            }
            OptionSettings.DefaultPricingSetting defaultPricingSetting2 = defaultPricingSetting;
            OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode2 = optionsSimulatedReturnSliderLaunchMode;
            return pnlChart.copy(str, optionsSimulatedReturnLoggingState, optionsSimulatedReturnSliderLaunchMode2, optionOrderBundle, defaultPricingSetting2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionsSimulatedReturnSliderLaunchMode getSimulatedReturnSliderLaunchMode() {
            return this.simulatedReturnSliderLaunchMode;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
            return this.defaultPricingSetting;
        }

        public final PnlChart copy(String accountNumber, OptionsSimulatedReturnLoggingState loggingState, OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(simulatedReturnSliderLaunchMode, "simulatedReturnSliderLaunchMode");
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
            return new PnlChart(accountNumber, loggingState, simulatedReturnSliderLaunchMode, optionOrderBundle, defaultPricingSetting);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PnlChart)) {
                return false;
            }
            PnlChart pnlChart = (PnlChart) other;
            return Intrinsics.areEqual(this.accountNumber, pnlChart.accountNumber) && Intrinsics.areEqual(this.loggingState, pnlChart.loggingState) && Intrinsics.areEqual(this.simulatedReturnSliderLaunchMode, pnlChart.simulatedReturnSliderLaunchMode) && Intrinsics.areEqual(this.optionOrderBundle, pnlChart.optionOrderBundle) && this.defaultPricingSetting == pnlChart.defaultPricingSetting;
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
            return ((((((iHashCode + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31) + this.simulatedReturnSliderLaunchMode.hashCode()) * 31) + this.optionOrderBundle.hashCode()) * 31) + this.defaultPricingSetting.hashCode();
        }

        public String toString() {
            return "PnlChart(accountNumber=" + this.accountNumber + ", loggingState=" + this.loggingState + ", simulatedReturnSliderLaunchMode=" + this.simulatedReturnSliderLaunchMode + ", optionOrderBundle=" + this.optionOrderBundle + ", defaultPricingSetting=" + this.defaultPricingSetting + ")";
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public OptionsSimulatedReturnSliderLaunchMode getSimulatedReturnSliderLaunchMode() {
            return this.simulatedReturnSliderLaunchMode;
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        public final OptionSettings.DefaultPricingSetting getDefaultPricingSetting() {
            return this.defaultPricingSetting;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PnlChart(String accountNumber, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle, OptionSettings.DefaultPricingSetting defaultPricingSetting) {
            super(accountNumber, optionsSimulatedReturnLoggingState, simulatedReturnSliderLaunchMode, optionOrderBundle, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(simulatedReturnSliderLaunchMode, "simulatedReturnSliderLaunchMode");
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            Intrinsics.checkNotNullParameter(defaultPricingSetting, "defaultPricingSetting");
            this.accountNumber = accountNumber;
            this.loggingState = optionsSimulatedReturnLoggingState;
            this.simulatedReturnSliderLaunchMode = simulatedReturnSliderLaunchMode;
            this.optionOrderBundle = optionOrderBundle;
            this.defaultPricingSetting = defaultPricingSetting;
        }
    }

    /* compiled from: OptionChainBottomSheetSimulatedReturnSection.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState$SimulatedReturn;", "Lcom/robinhood/android/optionschain/bottomsheet/OptionChainBottomSheetSimulatedChartSectionState;", "accountNumber", "", "loggingState", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "simulatedReturnSliderLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "simulatedReturnChartLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;Lcom/robinhood/models/ui/OptionOrderBundle;Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;)V", "getAccountNumber", "()Ljava/lang/String;", "getLoggingState", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getSimulatedReturnSliderLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode;", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getSimulatedReturnChartLaunchMode", "()Lcom/robinhood/android/options/lib/simulatedreturn/chart/OptionsSimulatedReturnChartLaunchMode;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedChartSectionState$SimulatedReturn, reason: from toString */
    public static final /* data */ class SimulatedReturn extends OptionChainBottomSheetSimulatedReturnSection4 {
        public static final int $stable = 8;
        private final String accountNumber;
        private final OptionsSimulatedReturnLoggingState loggingState;
        private final OptionOrderBundle optionOrderBundle;
        private final OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode;
        private final OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode;

        public static /* synthetic */ SimulatedReturn copy$default(SimulatedReturn simulatedReturn, String str, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle, OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = simulatedReturn.accountNumber;
            }
            if ((i & 2) != 0) {
                optionsSimulatedReturnLoggingState = simulatedReturn.loggingState;
            }
            if ((i & 4) != 0) {
                optionsSimulatedReturnSliderLaunchMode = simulatedReturn.simulatedReturnSliderLaunchMode;
            }
            if ((i & 8) != 0) {
                optionOrderBundle = simulatedReturn.optionOrderBundle;
            }
            if ((i & 16) != 0) {
                optionsSimulatedReturnChartDataState2 = simulatedReturn.simulatedReturnChartLaunchMode;
            }
            OptionsSimulatedReturnChartDataState2 optionsSimulatedReturnChartDataState22 = optionsSimulatedReturnChartDataState2;
            OptionsSimulatedReturnSliderLaunchMode optionsSimulatedReturnSliderLaunchMode2 = optionsSimulatedReturnSliderLaunchMode;
            return simulatedReturn.copy(str, optionsSimulatedReturnLoggingState, optionsSimulatedReturnSliderLaunchMode2, optionOrderBundle, optionsSimulatedReturnChartDataState22);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        /* renamed from: component3, reason: from getter */
        public final OptionsSimulatedReturnSliderLaunchMode getSimulatedReturnSliderLaunchMode() {
            return this.simulatedReturnSliderLaunchMode;
        }

        /* renamed from: component4, reason: from getter */
        public final OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionsSimulatedReturnChartDataState2 getSimulatedReturnChartLaunchMode() {
            return this.simulatedReturnChartLaunchMode;
        }

        public final SimulatedReturn copy(String accountNumber, OptionsSimulatedReturnLoggingState loggingState, OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle, OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(simulatedReturnSliderLaunchMode, "simulatedReturnSliderLaunchMode");
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            Intrinsics.checkNotNullParameter(simulatedReturnChartLaunchMode, "simulatedReturnChartLaunchMode");
            return new SimulatedReturn(accountNumber, loggingState, simulatedReturnSliderLaunchMode, optionOrderBundle, simulatedReturnChartLaunchMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimulatedReturn)) {
                return false;
            }
            SimulatedReturn simulatedReturn = (SimulatedReturn) other;
            return Intrinsics.areEqual(this.accountNumber, simulatedReturn.accountNumber) && Intrinsics.areEqual(this.loggingState, simulatedReturn.loggingState) && Intrinsics.areEqual(this.simulatedReturnSliderLaunchMode, simulatedReturn.simulatedReturnSliderLaunchMode) && Intrinsics.areEqual(this.optionOrderBundle, simulatedReturn.optionOrderBundle) && Intrinsics.areEqual(this.simulatedReturnChartLaunchMode, simulatedReturn.simulatedReturnChartLaunchMode);
        }

        public int hashCode() {
            int iHashCode = this.accountNumber.hashCode() * 31;
            OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
            return ((((((iHashCode + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31) + this.simulatedReturnSliderLaunchMode.hashCode()) * 31) + this.optionOrderBundle.hashCode()) * 31) + this.simulatedReturnChartLaunchMode.hashCode();
        }

        public String toString() {
            return "SimulatedReturn(accountNumber=" + this.accountNumber + ", loggingState=" + this.loggingState + ", simulatedReturnSliderLaunchMode=" + this.simulatedReturnSliderLaunchMode + ", optionOrderBundle=" + this.optionOrderBundle + ", simulatedReturnChartLaunchMode=" + this.simulatedReturnChartLaunchMode + ")";
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public String getAccountNumber() {
            return this.accountNumber;
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public OptionsSimulatedReturnLoggingState getLoggingState() {
            return this.loggingState;
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public OptionsSimulatedReturnSliderLaunchMode getSimulatedReturnSliderLaunchMode() {
            return this.simulatedReturnSliderLaunchMode;
        }

        @Override // com.robinhood.android.optionschain.bottomsheet.OptionChainBottomSheetSimulatedReturnSection4
        public OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        public final OptionsSimulatedReturnChartDataState2 getSimulatedReturnChartLaunchMode() {
            return this.simulatedReturnChartLaunchMode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimulatedReturn(String accountNumber, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, OptionsSimulatedReturnSliderLaunchMode simulatedReturnSliderLaunchMode, OptionOrderBundle optionOrderBundle, OptionsSimulatedReturnChartDataState2 simulatedReturnChartLaunchMode) {
            super(accountNumber, optionsSimulatedReturnLoggingState, simulatedReturnSliderLaunchMode, optionOrderBundle, null);
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(simulatedReturnSliderLaunchMode, "simulatedReturnSliderLaunchMode");
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            Intrinsics.checkNotNullParameter(simulatedReturnChartLaunchMode, "simulatedReturnChartLaunchMode");
            this.accountNumber = accountNumber;
            this.loggingState = optionsSimulatedReturnLoggingState;
            this.simulatedReturnSliderLaunchMode = simulatedReturnSliderLaunchMode;
            this.optionOrderBundle = optionOrderBundle;
            this.simulatedReturnChartLaunchMode = simulatedReturnChartLaunchMode;
        }
    }
}
