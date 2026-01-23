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
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012$\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JT\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052&\b\u0002\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0012R5\u0010\f\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00070\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b$\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV4;", "", "", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstruments", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "underlying", "Lkotlin/Pair;", "Lcom/robinhood/models/db/OptionChain;", "", "Ljava/util/UUID;", "j$/time/LocalDate", "chainToLegExpirationDatesList", "<init>", "(Ljava/util/List;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "component3", "copy", "(Ljava/util/List;Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;Ljava/util/List;)Lcom/robinhood/librobinhood/data/store/OptionSimulatedReturnMarketDataParamsRequestV4;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOptionInstruments", "Lcom/robinhood/models/ui/OptionSimulatedChartUnderlying;", "getUnderlying", "getChainToLegExpirationDatesList", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OptionSimulatedReturnMarketDataParamsRequestV4 {
    private final List<Tuples2<OptionChain, Map<UUID, LocalDate>>> chainToLegExpirationDatesList;
    private final List<OptionInstrument> optionInstruments;
    private final OptionSimulatedChartBundle5 underlying;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionSimulatedReturnMarketDataParamsRequestV4 copy$default(OptionSimulatedReturnMarketDataParamsRequestV4 optionSimulatedReturnMarketDataParamsRequestV4, List list, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionSimulatedReturnMarketDataParamsRequestV4.optionInstruments;
        }
        if ((i & 2) != 0) {
            optionSimulatedChartBundle5 = optionSimulatedReturnMarketDataParamsRequestV4.underlying;
        }
        if ((i & 4) != 0) {
            list2 = optionSimulatedReturnMarketDataParamsRequestV4.chainToLegExpirationDatesList;
        }
        return optionSimulatedReturnMarketDataParamsRequestV4.copy(list, optionSimulatedChartBundle5, list2);
    }

    public final List<OptionInstrument> component1() {
        return this.optionInstruments;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionSimulatedChartBundle5 getUnderlying() {
        return this.underlying;
    }

    public final List<Tuples2<OptionChain, Map<UUID, LocalDate>>> component3() {
        return this.chainToLegExpirationDatesList;
    }

    public final OptionSimulatedReturnMarketDataParamsRequestV4 copy(List<OptionInstrument> optionInstruments, OptionSimulatedChartBundle5 underlying, List<? extends Tuples2<OptionChain, ? extends Map<UUID, LocalDate>>> chainToLegExpirationDatesList) {
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(chainToLegExpirationDatesList, "chainToLegExpirationDatesList");
        return new OptionSimulatedReturnMarketDataParamsRequestV4(optionInstruments, underlying, chainToLegExpirationDatesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSimulatedReturnMarketDataParamsRequestV4)) {
            return false;
        }
        OptionSimulatedReturnMarketDataParamsRequestV4 optionSimulatedReturnMarketDataParamsRequestV4 = (OptionSimulatedReturnMarketDataParamsRequestV4) other;
        return Intrinsics.areEqual(this.optionInstruments, optionSimulatedReturnMarketDataParamsRequestV4.optionInstruments) && Intrinsics.areEqual(this.underlying, optionSimulatedReturnMarketDataParamsRequestV4.underlying) && Intrinsics.areEqual(this.chainToLegExpirationDatesList, optionSimulatedReturnMarketDataParamsRequestV4.chainToLegExpirationDatesList);
    }

    public int hashCode() {
        int iHashCode = this.optionInstruments.hashCode() * 31;
        OptionSimulatedChartBundle5 optionSimulatedChartBundle5 = this.underlying;
        return ((iHashCode + (optionSimulatedChartBundle5 == null ? 0 : optionSimulatedChartBundle5.hashCode())) * 31) + this.chainToLegExpirationDatesList.hashCode();
    }

    public String toString() {
        return "OptionSimulatedReturnMarketDataParamsRequestV4(optionInstruments=" + this.optionInstruments + ", underlying=" + this.underlying + ", chainToLegExpirationDatesList=" + this.chainToLegExpirationDatesList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionSimulatedReturnMarketDataParamsRequestV4(List<OptionInstrument> optionInstruments, OptionSimulatedChartBundle5 optionSimulatedChartBundle5, List<? extends Tuples2<OptionChain, ? extends Map<UUID, LocalDate>>> chainToLegExpirationDatesList) {
        Intrinsics.checkNotNullParameter(optionInstruments, "optionInstruments");
        Intrinsics.checkNotNullParameter(chainToLegExpirationDatesList, "chainToLegExpirationDatesList");
        this.optionInstruments = optionInstruments;
        this.underlying = optionSimulatedChartBundle5;
        this.chainToLegExpirationDatesList = chainToLegExpirationDatesList;
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
}
