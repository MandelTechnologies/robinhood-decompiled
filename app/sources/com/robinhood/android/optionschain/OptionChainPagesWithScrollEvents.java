package com.robinhood.android.optionschain;

import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.optionschain.OptionChainViewState;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionChainViewState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\u001a\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u0006\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006HÆ\u0003J\u001d\u0010\u001f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u0006HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006HÆ\u0003J\u0085\u0001\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u00062\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000eHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R%\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainPagesWithScrollEvents;", "", "optionChainPages", "", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage;", "targetExpirationPageFromTargetLegsEvent", "Lcom/robinhood/udf/UiEvent;", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/UiOptionStrategyLegDisplay;", "targetExpirationPageFromSbsChainEvent", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "targetStrikePriceEvent", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "", "rollingExpirationDateEvent", "Lcom/robinhood/models/db/OptionInstrument;", "defaultToNearestExpirationDateEvent", "<init>", "(Ljava/util/List;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getOptionChainPages", "()Ljava/util/List;", "getTargetExpirationPageFromTargetLegsEvent", "()Lcom/robinhood/udf/UiEvent;", "getTargetExpirationPageFromSbsChainEvent", "getTargetStrikePriceEvent", "getRollingExpirationDateEvent", "getDefaultToNearestExpirationDateEvent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainPagesWithScrollEvents {
    public static final int $stable = 8;
    private final UiEvent<Integer> defaultToNearestExpirationDateEvent;
    private final List<OptionChainViewState.OptionChainPage> optionChainPages;
    private final UiEvent<OptionInstrument> rollingExpirationDateEvent;
    private final UiEvent<OptionChainExpirationDateState> targetExpirationPageFromSbsChainEvent;
    private final UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> targetExpirationPageFromTargetLegsEvent;
    private final UiEvent<Tuples2<BigDecimal, Integer>> targetStrikePriceEvent;

    public static /* synthetic */ OptionChainPagesWithScrollEvents copy$default(OptionChainPagesWithScrollEvents optionChainPagesWithScrollEvents, List list, UiEvent uiEvent, UiEvent uiEvent2, UiEvent uiEvent3, UiEvent uiEvent4, UiEvent uiEvent5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionChainPagesWithScrollEvents.optionChainPages;
        }
        if ((i & 2) != 0) {
            uiEvent = optionChainPagesWithScrollEvents.targetExpirationPageFromTargetLegsEvent;
        }
        if ((i & 4) != 0) {
            uiEvent2 = optionChainPagesWithScrollEvents.targetExpirationPageFromSbsChainEvent;
        }
        if ((i & 8) != 0) {
            uiEvent3 = optionChainPagesWithScrollEvents.targetStrikePriceEvent;
        }
        if ((i & 16) != 0) {
            uiEvent4 = optionChainPagesWithScrollEvents.rollingExpirationDateEvent;
        }
        if ((i & 32) != 0) {
            uiEvent5 = optionChainPagesWithScrollEvents.defaultToNearestExpirationDateEvent;
        }
        UiEvent uiEvent6 = uiEvent4;
        UiEvent uiEvent7 = uiEvent5;
        return optionChainPagesWithScrollEvents.copy(list, uiEvent, uiEvent2, uiEvent3, uiEvent6, uiEvent7);
    }

    public final List<OptionChainViewState.OptionChainPage> component1() {
        return this.optionChainPages;
    }

    public final UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> component2() {
        return this.targetExpirationPageFromTargetLegsEvent;
    }

    public final UiEvent<OptionChainExpirationDateState> component3() {
        return this.targetExpirationPageFromSbsChainEvent;
    }

    public final UiEvent<Tuples2<BigDecimal, Integer>> component4() {
        return this.targetStrikePriceEvent;
    }

    public final UiEvent<OptionInstrument> component5() {
        return this.rollingExpirationDateEvent;
    }

    public final UiEvent<Integer> component6() {
        return this.defaultToNearestExpirationDateEvent;
    }

    public final OptionChainPagesWithScrollEvents copy(List<? extends OptionChainViewState.OptionChainPage> optionChainPages, UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> targetExpirationPageFromTargetLegsEvent, UiEvent<OptionChainExpirationDateState> targetExpirationPageFromSbsChainEvent, UiEvent<Tuples2<BigDecimal, Integer>> targetStrikePriceEvent, UiEvent<OptionInstrument> rollingExpirationDateEvent, UiEvent<Integer> defaultToNearestExpirationDateEvent) {
        Intrinsics.checkNotNullParameter(optionChainPages, "optionChainPages");
        return new OptionChainPagesWithScrollEvents(optionChainPages, targetExpirationPageFromTargetLegsEvent, targetExpirationPageFromSbsChainEvent, targetStrikePriceEvent, rollingExpirationDateEvent, defaultToNearestExpirationDateEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainPagesWithScrollEvents)) {
            return false;
        }
        OptionChainPagesWithScrollEvents optionChainPagesWithScrollEvents = (OptionChainPagesWithScrollEvents) other;
        return Intrinsics.areEqual(this.optionChainPages, optionChainPagesWithScrollEvents.optionChainPages) && Intrinsics.areEqual(this.targetExpirationPageFromTargetLegsEvent, optionChainPagesWithScrollEvents.targetExpirationPageFromTargetLegsEvent) && Intrinsics.areEqual(this.targetExpirationPageFromSbsChainEvent, optionChainPagesWithScrollEvents.targetExpirationPageFromSbsChainEvent) && Intrinsics.areEqual(this.targetStrikePriceEvent, optionChainPagesWithScrollEvents.targetStrikePriceEvent) && Intrinsics.areEqual(this.rollingExpirationDateEvent, optionChainPagesWithScrollEvents.rollingExpirationDateEvent) && Intrinsics.areEqual(this.defaultToNearestExpirationDateEvent, optionChainPagesWithScrollEvents.defaultToNearestExpirationDateEvent);
    }

    public int hashCode() {
        int iHashCode = this.optionChainPages.hashCode() * 31;
        UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> uiEvent = this.targetExpirationPageFromTargetLegsEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<OptionChainExpirationDateState> uiEvent2 = this.targetExpirationPageFromSbsChainEvent;
        int iHashCode3 = (iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31;
        UiEvent<Tuples2<BigDecimal, Integer>> uiEvent3 = this.targetStrikePriceEvent;
        int iHashCode4 = (iHashCode3 + (uiEvent3 == null ? 0 : uiEvent3.hashCode())) * 31;
        UiEvent<OptionInstrument> uiEvent4 = this.rollingExpirationDateEvent;
        int iHashCode5 = (iHashCode4 + (uiEvent4 == null ? 0 : uiEvent4.hashCode())) * 31;
        UiEvent<Integer> uiEvent5 = this.defaultToNearestExpirationDateEvent;
        return iHashCode5 + (uiEvent5 != null ? uiEvent5.hashCode() : 0);
    }

    public String toString() {
        return "OptionChainPagesWithScrollEvents(optionChainPages=" + this.optionChainPages + ", targetExpirationPageFromTargetLegsEvent=" + this.targetExpirationPageFromTargetLegsEvent + ", targetExpirationPageFromSbsChainEvent=" + this.targetExpirationPageFromSbsChainEvent + ", targetStrikePriceEvent=" + this.targetStrikePriceEvent + ", rollingExpirationDateEvent=" + this.rollingExpirationDateEvent + ", defaultToNearestExpirationDateEvent=" + this.defaultToNearestExpirationDateEvent + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionChainPagesWithScrollEvents(List<? extends OptionChainViewState.OptionChainPage> optionChainPages, UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> uiEvent, UiEvent<OptionChainExpirationDateState> uiEvent2, UiEvent<Tuples2<BigDecimal, Integer>> uiEvent3, UiEvent<OptionInstrument> uiEvent4, UiEvent<Integer> uiEvent5) {
        Intrinsics.checkNotNullParameter(optionChainPages, "optionChainPages");
        this.optionChainPages = optionChainPages;
        this.targetExpirationPageFromTargetLegsEvent = uiEvent;
        this.targetExpirationPageFromSbsChainEvent = uiEvent2;
        this.targetStrikePriceEvent = uiEvent3;
        this.rollingExpirationDateEvent = uiEvent4;
        this.defaultToNearestExpirationDateEvent = uiEvent5;
    }

    public final List<OptionChainViewState.OptionChainPage> getOptionChainPages() {
        return this.optionChainPages;
    }

    public final UiEvent<ImmutableList<UiOptionStrategyLegDisplay>> getTargetExpirationPageFromTargetLegsEvent() {
        return this.targetExpirationPageFromTargetLegsEvent;
    }

    public final UiEvent<OptionChainExpirationDateState> getTargetExpirationPageFromSbsChainEvent() {
        return this.targetExpirationPageFromSbsChainEvent;
    }

    public final UiEvent<Tuples2<BigDecimal, Integer>> getTargetStrikePriceEvent() {
        return this.targetStrikePriceEvent;
    }

    public final UiEvent<OptionInstrument> getRollingExpirationDateEvent() {
        return this.rollingExpirationDateEvent;
    }

    public final UiEvent<Integer> getDefaultToNearestExpirationDateEvent() {
        return this.defaultToNearestExpirationDateEvent;
    }
}
