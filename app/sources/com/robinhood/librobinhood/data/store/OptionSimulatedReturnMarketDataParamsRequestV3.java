package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.OptionSimulatedChartBundle5;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.LocalDate;

/* compiled from: OptionSimulatedReturnsStore.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012$\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t0\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJj\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072&\b\u0002\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t0\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0018R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\t0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010\u001b¨\u0006-"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;", "", "", "isLateClosing", "", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstruments", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "underlying", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OptionChain;", "", "Ljava/util/UUID;", "j$/time/LocalDate", "chainToLegExpirationDatesList", "", "strategyCode", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/util/List;", "component3", "()Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "component4", "component5", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Ljava/util/List;Ljava/lang/String;)Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV3;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "Ljava/util/List;", "getOptionInstruments", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "getUnderlying", "getChainToLegExpirationDatesList", "Ljava/lang/String;", "getStrategyCode", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OptionSimulatedReturnMarketDataParamsRequestV3 {
    private final List<Tuples2<OptionChain, Map<UUID, LocalDate>>> chainToLegExpirationDatesList;
    private final Boolean isLateClosing;
    private final List<OptionInstrument> optionInstruments;
    private final String strategyCode;
    private final OptionSimulatedChartBundle5 underlying;

    public static /* synthetic */ OptionSimulatedReturnMarketDataParamsRequestV3 copy$default(OptionSimulatedReturnMarketDataParamsRequestV3 optionSimulatedReturnMarketDataParamsRequestV3, Boolean bool, List list, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = optionSimulatedReturnMarketDataParamsRequestV3.isLateClosing;
        }
        if ((i & 2) != 0) {
            list = optionSimulatedReturnMarketDataParamsRequestV3.optionInstruments;
        }
        if ((i & 4) != 0) {
            optionSimulatedChartBundle5 = optionSimulatedReturnMarketDataParamsRequestV3.underlying;
        }
        if ((i & 8) != 0) {
            list2 = optionSimulatedReturnMarketDataParamsRequestV3.chainToLegExpirationDatesList;
        }
        if ((i & 16) != 0) {
            str = optionSimulatedReturnMarketDataParamsRequestV3.strategyCode;
        }
        String str2 = str;
        OptionSimulatedChartBundle5 optionSimulatedChartBundle52 = optionSimulatedChartBundle5;
        return optionSimulatedReturnMarketDataParamsRequestV3.copy(bool, list, optionSimulatedChartBundle52, list2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsLateClosing() {
        return this.isLateClosing;
    }

    public final List<OptionInstrument> component2() {
        return this.optionInstruments;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    public final List<Tuples2<OptionChain, Map<UUID, LocalDate>>> component4() {
        return this.chainToLegExpirationDatesList;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStrategyCode() {
        return this.strategyCode;
    }

    public final OptionSimulatedReturnMarketDataParamsRequestV3 copy(Boolean isLateClosing, List<OptionInstrument> optionInstruments, OptionSimulatedChartBundle5 underlying, List<? extends Tuples2<OptionChain, ? extends Map<UUID, LocalDate>>> chainToLegExpirationDatesList, String strategyCode) {
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(chainToLegExpirationDatesList, "chainToLegExpirationDatesList");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        return new OptionSimulatedReturnMarketDataParamsRequestV3(isLateClosing, optionInstruments, underlying, chainToLegExpirationDatesList, strategyCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSimulatedReturnMarketDataParamsRequestV3)) {
            return false;
        }
        OptionSimulatedReturnMarketDataParamsRequestV3 optionSimulatedReturnMarketDataParamsRequestV3 = (OptionSimulatedReturnMarketDataParamsRequestV3) other;
        return Intrinsics.areEqual(this.isLateClosing, optionSimulatedReturnMarketDataParamsRequestV3.isLateClosing) && Intrinsics.areEqual(this.optionInstruments, optionSimulatedReturnMarketDataParamsRequestV3.optionInstruments) && Intrinsics.areEqual(this.underlying, optionSimulatedReturnMarketDataParamsRequestV3.underlying) && Intrinsics.areEqual(this.chainToLegExpirationDatesList, optionSimulatedReturnMarketDataParamsRequestV3.chainToLegExpirationDatesList) && Intrinsics.areEqual(this.strategyCode, optionSimulatedReturnMarketDataParamsRequestV3.strategyCode);
    }

    public int hashCode() {
        Boolean bool = this.isLateClosing;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.optionInstruments.hashCode()) * 31;
        OptionSimulatedChartBundle5 optionSimulatedChartBundle5 = this.underlying;
        return ((((iHashCode + (optionSimulatedChartBundle5 != null ? optionSimulatedChartBundle5.hashCode() : 0)) * 31) + this.chainToLegExpirationDatesList.hashCode()) * 31) + this.strategyCode.hashCode();
    }

    public String toString() {
        return "OptionSimulatedReturnMarketDataParamsRequestV3(isLateClosing=" + this.isLateClosing + ", optionInstruments=" + this.optionInstruments + ", underlying=" + this.underlying + ", chainToLegExpirationDatesList=" + this.chainToLegExpirationDatesList + ", strategyCode=" + this.strategyCode + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionSimulatedReturnMarketDataParamsRequestV3(Boolean bool, List<OptionInstrument> optionInstruments, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, List<? extends Tuples2<OptionChain, ? extends Map<UUID, LocalDate>>> chainToLegExpirationDatesList, String strategyCode) {
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(chainToLegExpirationDatesList, "chainToLegExpirationDatesList");
        Intrinsics.checkNotNullParameter(strategyCode, "strategyCode");
        this.isLateClosing = bool;
        this.optionInstruments = optionInstruments;
        this.underlying = optionSimulatedChartBundle5;
        this.chainToLegExpirationDatesList = chainToLegExpirationDatesList;
        this.strategyCode = strategyCode;
    }

    public final Boolean isLateClosing() {
        return this.isLateClosing;
    }

    public final List<OptionInstrument> getOptionInstruments() {
        return this.optionInstruments;
    }

    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    public final List<Tuples2<OptionChain, Map<UUID, LocalDate>>> getChainToLegExpirationDatesList() {
        return this.chainToLegExpirationDatesList;
    }

    public final String getStrategyCode() {
        return this.strategyCode;
    }
}
