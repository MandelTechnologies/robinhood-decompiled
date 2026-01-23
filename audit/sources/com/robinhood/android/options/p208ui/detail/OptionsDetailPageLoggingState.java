package com.robinhood.android.options.p208ui.detail;

import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageLoggingState.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00104\u001a\u00020\u000eHÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003Jg\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\u0013\u00107\u001a\u00020\u00052\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\tHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010$\u001a\u00060%j\u0002`&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/options/ui/detail/OptionsDetailPageLoggingState;", "", "strategyCode", "", "isWatching", "", "hasPosition", "isLegContext", "numLegs", "", "aggregateOptionPositionId", "Ljava/util/UUID;", "optionInstrumentPositionId", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "optionChainId", "<init>", "(Ljava/lang/String;ZZZILjava/util/UUID;Ljava/util/UUID;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/UUID;)V", "getStrategyCode", "()Ljava/lang/String;", "()Z", "getHasPosition", "getNumLegs", "()I", "getAggregateOptionPositionId", "()Ljava/util/UUID;", "getOptionInstrumentPositionId", "getBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getOptionChainId", "optionsContext", "Lcom/robinhood/rosetta/eventlogging/OptionsContext;", "optionStrategyContext", "Lcom/robinhood/rosetta/eventlogging/OptionStrategyContext;", "brokerageAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "feature-options-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsDetailPageLoggingState {
    public static final int $stable = 8;
    private final UUID aggregateOptionPositionId;
    private final BrokerageAccountContext brokerageAccountContext;
    private final BrokerageAccountType brokerageAccountType;
    private final Context eventContext;
    private final Screen eventScreen;
    private final boolean hasPosition;
    private final boolean isLegContext;
    private final boolean isWatching;
    private final int numLegs;
    private final UUID optionChainId;
    private final UUID optionInstrumentPositionId;
    private final OptionStrategyContext optionStrategyContext;
    private final OptionsContext optionsContext;
    private final String strategyCode;

    public static /* synthetic */ OptionsDetailPageLoggingState copy$default(OptionsDetailPageLoggingState optionsDetailPageLoggingState, String str, boolean z, boolean z2, boolean z3, int i, UUID uuid, UUID uuid2, BrokerageAccountType brokerageAccountType, UUID uuid3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = optionsDetailPageLoggingState.strategyCode;
        }
        if ((i2 & 2) != 0) {
            z = optionsDetailPageLoggingState.isWatching;
        }
        if ((i2 & 4) != 0) {
            z2 = optionsDetailPageLoggingState.hasPosition;
        }
        if ((i2 & 8) != 0) {
            z3 = optionsDetailPageLoggingState.isLegContext;
        }
        if ((i2 & 16) != 0) {
            i = optionsDetailPageLoggingState.numLegs;
        }
        if ((i2 & 32) != 0) {
            uuid = optionsDetailPageLoggingState.aggregateOptionPositionId;
        }
        if ((i2 & 64) != 0) {
            uuid2 = optionsDetailPageLoggingState.optionInstrumentPositionId;
        }
        if ((i2 & 128) != 0) {
            brokerageAccountType = optionsDetailPageLoggingState.brokerageAccountType;
        }
        if ((i2 & 256) != 0) {
            uuid3 = optionsDetailPageLoggingState.optionChainId;
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        UUID uuid4 = uuid3;
        UUID uuid5 = uuid;
        UUID uuid6 = uuid2;
        int i3 = i;
        boolean z4 = z2;
        return optionsDetailPageLoggingState.copy(str, z, z4, z3, i3, uuid5, uuid6, brokerageAccountType2, uuid4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWatching() {
        return this.isWatching;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasPosition() {
        return this.hasPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLegContext() {
        return this.isLegContext;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNumLegs() {
        return this.numLegs;
    }

    /* renamed from: component6, reason: from getter */
    public final UUID getAggregateOptionPositionId() {
        return this.aggregateOptionPositionId;
    }

    /* renamed from: component7, reason: from getter */
    public final UUID getOptionInstrumentPositionId() {
        return this.optionInstrumentPositionId;
    }

    /* renamed from: component8, reason: from getter */
    public final BrokerageAccountType getBrokerageAccountType() {
        return this.brokerageAccountType;
    }

    /* renamed from: component9, reason: from getter */
    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final OptionsDetailPageLoggingState copy(String strategyCode, boolean isWatching, boolean hasPosition, boolean isLegContext, int numLegs, UUID aggregateOptionPositionId, UUID optionInstrumentPositionId, BrokerageAccountType brokerageAccountType, UUID optionChainId) {
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        return new OptionsDetailPageLoggingState(strategyCode, isWatching, hasPosition, isLegContext, numLegs, aggregateOptionPositionId, optionInstrumentPositionId, brokerageAccountType, optionChainId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsDetailPageLoggingState)) {
            return false;
        }
        OptionsDetailPageLoggingState optionsDetailPageLoggingState = (OptionsDetailPageLoggingState) other;
        return Intrinsics.areEqual(this.strategyCode, optionsDetailPageLoggingState.strategyCode) && this.isWatching == optionsDetailPageLoggingState.isWatching && this.hasPosition == optionsDetailPageLoggingState.hasPosition && this.isLegContext == optionsDetailPageLoggingState.isLegContext && this.numLegs == optionsDetailPageLoggingState.numLegs && Intrinsics.areEqual(this.aggregateOptionPositionId, optionsDetailPageLoggingState.aggregateOptionPositionId) && Intrinsics.areEqual(this.optionInstrumentPositionId, optionsDetailPageLoggingState.optionInstrumentPositionId) && this.brokerageAccountType == optionsDetailPageLoggingState.brokerageAccountType && Intrinsics.areEqual(this.optionChainId, optionsDetailPageLoggingState.optionChainId);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.strategyCode.hashCode() * 31) + Boolean.hashCode(this.isWatching)) * 31) + Boolean.hashCode(this.hasPosition)) * 31) + Boolean.hashCode(this.isLegContext)) * 31) + Integer.hashCode(this.numLegs)) * 31;
        UUID uuid = this.aggregateOptionPositionId;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 31;
        UUID uuid2 = this.optionInstrumentPositionId;
        return ((((iHashCode2 + (uuid2 != null ? uuid2.hashCode() : 0)) * 31) + this.brokerageAccountType.hashCode()) * 31) + this.optionChainId.hashCode();
    }

    public String toString() {
        return "OptionsDetailPageLoggingState(strategyCode=" + this.strategyCode + ", isWatching=" + this.isWatching + ", hasPosition=" + this.hasPosition + ", isLegContext=" + this.isLegContext + ", numLegs=" + this.numLegs + ", aggregateOptionPositionId=" + this.aggregateOptionPositionId + ", optionInstrumentPositionId=" + this.optionInstrumentPositionId + ", brokerageAccountType=" + this.brokerageAccountType + ", optionChainId=" + this.optionChainId + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsDetailPageLoggingState(String strategyCode, boolean z, boolean z2, boolean z3, int i, UUID uuid, UUID uuid2, BrokerageAccountType brokerageAccountType, UUID optionChainId) {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(optionChainId, "optionChainId");
        this.strategyCode = strategyCode;
        this.isWatching = z;
        this.hasPosition = z2;
        this.isLegContext = z3;
        this.numLegs = i;
        this.aggregateOptionPositionId = uuid;
        this.optionInstrumentPositionId = uuid2;
        this.brokerageAccountType = brokerageAccountType;
        this.optionChainId = optionChainId;
        String string4 = optionChainId.toString();
        Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
        OptionsContext optionsContext = new OptionsContext(string4, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
        this.optionsContext = optionsContext;
        OptionStrategyContext optionStrategyContext = new OptionStrategyContext(z, z2, i, z3, (uuid == null || (string3 = uuid.toString()) == null) ? "" : string3, (uuid2 == null || (string2 = uuid2.toString()) == null) ? "" : string2, null, 64, null);
        this.optionStrategyContext = optionStrategyContext;
        String str = null;
        BrokerageAccountContext brokerageAccountContext = new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(brokerageAccountType), null, null, str, false, false, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, 1022, null);
        this.brokerageAccountContext = brokerageAccountContext;
        this.eventContext = new Context(0, 0, 0, null, null, null, null, null, 0, 0 == true ? 1 : 0, str, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, optionsContext, optionStrategyContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, brokerageAccountContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -12582913, -1, -257, -1, -1, 16383, null);
        this.eventScreen = new Screen(Screen.Name.OPTION_STRATEGY_DETAIL, null, strategyCode, null, 10, null);
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

    public final UUID getOptionChainId() {
        return this.optionChainId;
    }

    public final Context getEventContext() {
        return this.eventContext;
    }

    public final Screen getEventScreen() {
        return this.eventScreen;
    }
}
