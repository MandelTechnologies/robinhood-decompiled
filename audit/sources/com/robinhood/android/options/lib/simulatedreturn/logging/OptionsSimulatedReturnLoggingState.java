package com.robinhood.android.options.lib.simulatedreturn.logging;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p355ui.OptionChainSettingsPnlChartType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsSimulatedReturnLoggingState.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\bHÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\bHÆ\u0003J\t\u0010L\u001a\u00020\fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010O\u001a\u00020\u0011HÆ\u0003J\t\u0010P\u001a\u00020\u0013HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010+J\t\u0010R\u001a\u00020\u0017HÆ\u0003J\u0096\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010TJ\u0013\u0010U\u001a\u00020\b2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020\fHÖ\u0001J\t\u0010X\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u000200¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u00103\u001a\u000204¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u00107\u001a\u000608j\u0002`9¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010D\u001a\u00020A¢\u0006\b\n\u0000\u001a\u0004\bE\u0010C¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "", "accountNumber", "", "chartType", "Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "strategyCode", "isWatching", "", "hasPosition", "isLegContext", "numLegs", "", "aggregateOptionPositionId", "Ljava/util/UUID;", "optionInstrumentPositionId", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "lastAppearEventTimestamp", "", "estimatedContractPrice", "", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Ljava/lang/String;ZZZILjava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/BrokerageAccountType;JLjava/lang/Double;Lcom/robinhood/rosetta/eventlogging/Screen$Name;)V", "getAccountNumber", "()Ljava/lang/String;", "getChartType", "()Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;", "getStrategyCode", "()Z", "getHasPosition", "getNumLegs", "()I", "getAggregateOptionPositionId", "()Ljava/util/UUID;", "getOptionInstrumentPositionId", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getLastAppearEventTimestamp", "()J", "getEstimatedContractPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "optionStrategyContext", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "getOptionStrategyContext", "()Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "brokerageAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "getBrokerageAccountContext", "()Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventChartComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getEventChartComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "eventSliderComponent", "getEventSliderComponent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Lcom/robinhood/models/ui/OptionChainSettingsPnlChartType;Ljava/lang/String;ZZZILjava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/BrokerageAccountType;JLjava/lang/Double;Lcom/robinhood/rosetta/eventlogging/Screen$Name;)Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "equals", "other", "hashCode", "toString", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnLoggingState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final UUID aggregateOptionPositionId;
    private final BrokerageAccountContext brokerageAccountContext;
    private final BrokerageAccountType brokerageAccountType;
    private final OptionChainSettingsPnlChartType chartType;
    private final Double estimatedContractPrice;
    private final Component eventChartComponent;
    private final Context eventContext;
    private final Screen eventScreen;
    private final Component eventSliderComponent;
    private final boolean hasPosition;
    private final boolean isLegContext;
    private final boolean isWatching;
    private final long lastAppearEventTimestamp;
    private final int numLegs;
    private final UUID optionInstrumentPositionId;
    private final OptionStrategyContext optionStrategyContext;
    private final Screen.Name screenName;
    private final String strategyCode;

    /* compiled from: OptionsSimulatedReturnLoggingState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChainSettingsPnlChartType.values().length];
            try {
                iArr[OptionChainSettingsPnlChartType.OVER_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChainSettingsPnlChartType.BY_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component11, reason: from getter */
    public final long getLastAppearEventTimestamp() {
        return this.lastAppearEventTimestamp;
    }

    /* renamed from: component12, reason: from getter */
    public final Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    /* renamed from: component13, reason: from getter */
    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainSettingsPnlChartType getChartType() {
        return this.chartType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsWatching() {
        return this.isWatching;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLegContext() {
        return this.isLegContext;
    }

    /* renamed from: component7, reason: from getter */
    public final int getNumLegs() {
        return this.numLegs;
    }

    /* renamed from: component8, reason: from getter */
    public final UUID getAggregateOptionPositionId() {
        return this.aggregateOptionPositionId;
    }

    /* renamed from: component9, reason: from getter */
    public final UUID getOptionInstrumentPositionId() {
        return this.optionInstrumentPositionId;
    }

    public final OptionsSimulatedReturnLoggingState copy(String accountNumber, OptionChainSettingsPnlChartType chartType, String strategyCode, boolean isWatching, boolean hasPosition, boolean isLegContext, int numLegs, UUID aggregateOptionPositionId, UUID optionInstrumentPositionId, BrokerageAccountType brokerageAccountType, long lastAppearEventTimestamp, Double estimatedContractPrice, Screen.Name screenName) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        return new OptionsSimulatedReturnLoggingState(accountNumber, chartType, strategyCode, isWatching, hasPosition, isLegContext, numLegs, aggregateOptionPositionId, optionInstrumentPositionId, brokerageAccountType, lastAppearEventTimestamp, estimatedContractPrice, screenName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnLoggingState)) {
            return false;
        }
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = (OptionsSimulatedReturnLoggingState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsSimulatedReturnLoggingState.accountNumber) && this.chartType == optionsSimulatedReturnLoggingState.chartType && Intrinsics.areEqual(this.strategyCode, optionsSimulatedReturnLoggingState.strategyCode) && this.isWatching == optionsSimulatedReturnLoggingState.isWatching && this.hasPosition == optionsSimulatedReturnLoggingState.hasPosition && this.isLegContext == optionsSimulatedReturnLoggingState.isLegContext && this.numLegs == optionsSimulatedReturnLoggingState.numLegs && Intrinsics.areEqual(this.aggregateOptionPositionId, optionsSimulatedReturnLoggingState.aggregateOptionPositionId) && Intrinsics.areEqual(this.optionInstrumentPositionId, optionsSimulatedReturnLoggingState.optionInstrumentPositionId) && this.brokerageAccountType == optionsSimulatedReturnLoggingState.brokerageAccountType && this.lastAppearEventTimestamp == optionsSimulatedReturnLoggingState.lastAppearEventTimestamp && Intrinsics.areEqual((Object) this.estimatedContractPrice, (Object) optionsSimulatedReturnLoggingState.estimatedContractPrice) && this.screenName == optionsSimulatedReturnLoggingState.screenName;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.accountNumber.hashCode() * 31) + this.chartType.hashCode()) * 31) + this.strategyCode.hashCode()) * 31) + Boolean.hashCode(this.isWatching)) * 31) + Boolean.hashCode(this.hasPosition)) * 31) + Boolean.hashCode(this.isLegContext)) * 31) + Integer.hashCode(this.numLegs)) * 31;
        UUID uuid = this.aggregateOptionPositionId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.optionInstrumentPositionId;
        int iHashCode3 = (((((iHashCode2 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31) + this.brokerageAccountType.hashCode()) * 31) + Long.hashCode(this.lastAppearEventTimestamp)) * 31;
        Double d = this.estimatedContractPrice;
        return ((iHashCode3 + (d != null ? d.hashCode() : 0)) * 31) + this.screenName.hashCode();
    }

    public String toString() {
        return "OptionsSimulatedReturnLoggingState(accountNumber=" + this.accountNumber + ", chartType=" + this.chartType + ", strategyCode=" + this.strategyCode + ", isWatching=" + this.isWatching + ", hasPosition=" + this.hasPosition + ", isLegContext=" + this.isLegContext + ", numLegs=" + this.numLegs + ", aggregateOptionPositionId=" + this.aggregateOptionPositionId + ", optionInstrumentPositionId=" + this.optionInstrumentPositionId + ", brokerageAccountType=" + this.brokerageAccountType + ", lastAppearEventTimestamp=" + this.lastAppearEventTimestamp + ", estimatedContractPrice=" + this.estimatedContractPrice + ", screenName=" + this.screenName + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsSimulatedReturnLoggingState(String accountNumber, OptionChainSettingsPnlChartType chartType, String strategyCode, boolean z, boolean z2, boolean z3, int i, UUID uuid, UUID uuid2, BrokerageAccountType brokerageAccountType, long j, Double d, Screen.Name screenName) {
        Component.ComponentType componentType;
        Component.ComponentType componentType2;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(chartType, "chartType");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        this.accountNumber = accountNumber;
        this.chartType = chartType;
        this.strategyCode = strategyCode;
        this.isWatching = z;
        this.hasPosition = z2;
        this.isLegContext = z3;
        this.numLegs = i;
        this.aggregateOptionPositionId = uuid;
        this.optionInstrumentPositionId = uuid2;
        this.brokerageAccountType = brokerageAccountType;
        this.lastAppearEventTimestamp = j;
        this.estimatedContractPrice = d;
        this.screenName = screenName;
        OptionStrategyContext optionStrategyContext = new OptionStrategyContext(z, z2, i, z3, (uuid == null || (string3 = uuid.toString()) == null) ? "" : string3, (uuid2 == null || (string2 = uuid2.toString()) == null) ? "" : string2, null, 64, null);
        this.optionStrategyContext = optionStrategyContext;
        BrokerageAccountContext brokerageAccountContext = new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), accountNumber, null, null, false, false, null, null, null, null, 1020, null);
        this.brokerageAccountContext = brokerageAccountContext;
        this.eventContext = new Context(0, 0, 0, null, null, null, null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionStrategyContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, brokerageAccountContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -8388609, -1, -257, -1, -1, 16383, null);
        this.eventScreen = new Screen(screenName, null, strategyCode, null, 10, null);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[chartType.ordinal()];
        if (i2 == 1) {
            componentType = Component.ComponentType.OPTION_SIMULATED_RETURNS_CHART;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            componentType = Component.ComponentType.OPTION_PNL_CHART;
        }
        this.eventChartComponent = new Component(componentType, null, null, 6, null);
        int i3 = iArr[chartType.ordinal()];
        if (i3 == 1) {
            componentType2 = Component.ComponentType.OPTION_SIMULATED_RETURNS_SLIDER;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            componentType2 = Component.ComponentType.OPTION_PROFIT_AND_LOSS_SLIDER;
        }
        this.eventSliderComponent = new Component(componentType2, null, null, 6, null);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final OptionChainSettingsPnlChartType getChartType() {
        return this.chartType;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final boolean isWatching() {
        return this.isWatching;
    }

    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    public final boolean isLegContext() {
        return this.isLegContext;
    }

    public final int getNumLegs() {
        return this.numLegs;
    }

    public final UUID getAggregateOptionPositionId() {
        return this.aggregateOptionPositionId;
    }

    public final UUID getOptionInstrumentPositionId() {
        return this.optionInstrumentPositionId;
    }

    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    public final long getLastAppearEventTimestamp() {
        return this.lastAppearEventTimestamp;
    }

    public final Double getEstimatedContractPrice() {
        return this.estimatedContractPrice;
    }

    public final Screen.Name getScreenName() {
        return this.screenName;
    }

    public final OptionStrategyContext getOptionStrategyContext() {
        return this.optionStrategyContext;
    }

    public final BrokerageAccountContext getBrokerageAccountContext() {
        return this.brokerageAccountContext;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }

    public final Component getEventChartComponent() {
        return this.eventChartComponent;
    }

    public final Component getEventSliderComponent() {
        return this.eventSliderComponent;
    }
}
