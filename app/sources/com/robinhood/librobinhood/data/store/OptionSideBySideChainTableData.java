package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p355ui.UnderlyingQuote;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionSideBySideChainStore.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JN\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData;", "quoteIndex", "", "targetInstrumentIndex", "targetRowIndexByNearestStrike", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/models/ui/UnderlyingQuote;)V", "getRows", "()Lkotlinx/collections/immutable/ImmutableList;", "getQuoteIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTargetInstrumentIndex", "getTargetRowIndexByNearestStrike", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/robinhood/models/ui/UnderlyingQuote;)Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableData;", "equals", "", "other", "hashCode", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OptionSideBySideChainTableData {
    private final Integer quoteIndex;
    private final ImmutableList<OptionSideBySideChainTableRowData> rows;
    private final Integer targetInstrumentIndex;
    private final Integer targetRowIndexByNearestStrike;
    private final UnderlyingQuote underlyingQuote;

    public static /* synthetic */ OptionSideBySideChainTableData copy$default(OptionSideBySideChainTableData optionSideBySideChainTableData, ImmutableList immutableList, Integer num, Integer num2, Integer num3, UnderlyingQuote underlyingQuote, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = optionSideBySideChainTableData.rows;
        }
        if ((i & 2) != 0) {
            num = optionSideBySideChainTableData.quoteIndex;
        }
        if ((i & 4) != 0) {
            num2 = optionSideBySideChainTableData.targetInstrumentIndex;
        }
        if ((i & 8) != 0) {
            num3 = optionSideBySideChainTableData.targetRowIndexByNearestStrike;
        }
        if ((i & 16) != 0) {
            underlyingQuote = optionSideBySideChainTableData.underlyingQuote;
        }
        UnderlyingQuote underlyingQuote2 = underlyingQuote;
        Integer num4 = num2;
        return optionSideBySideChainTableData.copy(immutableList, num, num4, num3, underlyingQuote2);
    }

    public final ImmutableList<OptionSideBySideChainTableRowData> component1() {
        return this.rows;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getQuoteIndex() {
        return this.quoteIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTargetInstrumentIndex() {
        return this.targetInstrumentIndex;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTargetRowIndexByNearestStrike() {
        return this.targetRowIndexByNearestStrike;
    }

    /* renamed from: component5, reason: from getter */
    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }

    public final OptionSideBySideChainTableData copy(ImmutableList<? extends OptionSideBySideChainTableRowData> rows, Integer quoteIndex, Integer targetInstrumentIndex, Integer targetRowIndexByNearestStrike, UnderlyingQuote underlyingQuote) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new OptionSideBySideChainTableData(rows, quoteIndex, targetInstrumentIndex, targetRowIndexByNearestStrike, underlyingQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionSideBySideChainTableData)) {
            return false;
        }
        OptionSideBySideChainTableData optionSideBySideChainTableData = (OptionSideBySideChainTableData) other;
        return Intrinsics.areEqual(this.rows, optionSideBySideChainTableData.rows) && Intrinsics.areEqual(this.quoteIndex, optionSideBySideChainTableData.quoteIndex) && Intrinsics.areEqual(this.targetInstrumentIndex, optionSideBySideChainTableData.targetInstrumentIndex) && Intrinsics.areEqual(this.targetRowIndexByNearestStrike, optionSideBySideChainTableData.targetRowIndexByNearestStrike) && Intrinsics.areEqual(this.underlyingQuote, optionSideBySideChainTableData.underlyingQuote);
    }

    public int hashCode() {
        int iHashCode = this.rows.hashCode() * 31;
        Integer num = this.quoteIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.targetInstrumentIndex;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.targetRowIndexByNearestStrike;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        UnderlyingQuote underlyingQuote = this.underlyingQuote;
        return iHashCode4 + (underlyingQuote != null ? underlyingQuote.hashCode() : 0);
    }

    public String toString() {
        return "OptionSideBySideChainTableData(rows=" + this.rows + ", quoteIndex=" + this.quoteIndex + ", targetInstrumentIndex=" + this.targetInstrumentIndex + ", targetRowIndexByNearestStrike=" + this.targetRowIndexByNearestStrike + ", underlyingQuote=" + this.underlyingQuote + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionSideBySideChainTableData(ImmutableList<? extends OptionSideBySideChainTableRowData> rows, Integer num, Integer num2, Integer num3, UnderlyingQuote underlyingQuote) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
        this.quoteIndex = num;
        this.targetInstrumentIndex = num2;
        this.targetRowIndexByNearestStrike = num3;
        this.underlyingQuote = underlyingQuote;
    }

    public final ImmutableList<OptionSideBySideChainTableRowData> getRows() {
        return this.rows;
    }

    public final Integer getQuoteIndex() {
        return this.quoteIndex;
    }

    public final Integer getTargetInstrumentIndex() {
        return this.targetInstrumentIndex;
    }

    public final Integer getTargetRowIndexByNearestStrike() {
        return this.targetRowIndexByNearestStrike;
    }

    public final UnderlyingQuote getUnderlyingQuote() {
        return this.underlyingQuote;
    }
}
