package com.robinhood.librobinhood.data.store;

import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p355ui.UnderlyingQuote;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData;", "", "InstrumentRow", "UnderlyingQuoteRow", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData$InstrumentRow;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData$UnderlyingQuoteRow;", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public interface OptionSideBySideChainTableRowData {

    /* compiled from: OptionSideBySideChainStore.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData$InstrumentRow;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData;", "callInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "putInstrument", "strikePrice", "Ljava/math/BigDecimal;", "<init>", "(Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OptionInstrument;Ljava/math/BigDecimal;)V", "getCallInstrument", "()Lcom/robinhood/models/db/OptionInstrument;", "getPutInstrument", "getStrikePrice", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InstrumentRow implements OptionSideBySideChainTableRowData {
        private final OptionInstrument callInstrument;
        private final OptionInstrument putInstrument;
        private final BigDecimal strikePrice;

        public static /* synthetic */ InstrumentRow copy$default(InstrumentRow instrumentRow, OptionInstrument optionInstrument, OptionInstrument optionInstrument2, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                optionInstrument = instrumentRow.callInstrument;
            }
            if ((i & 2) != 0) {
                optionInstrument2 = instrumentRow.putInstrument;
            }
            if ((i & 4) != 0) {
                bigDecimal = instrumentRow.strikePrice;
            }
            return instrumentRow.copy(optionInstrument, optionInstrument2, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final OptionInstrument getCallInstrument() {
            return this.callInstrument;
        }

        /* renamed from: component2, reason: from getter */
        public final OptionInstrument getPutInstrument() {
            return this.putInstrument;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getStrikePrice() {
            return this.strikePrice;
        }

        public final InstrumentRow copy(OptionInstrument callInstrument, OptionInstrument putInstrument, BigDecimal strikePrice) {
            Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
            return new InstrumentRow(callInstrument, putInstrument, strikePrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentRow)) {
                return false;
            }
            InstrumentRow instrumentRow = (InstrumentRow) other;
            return Intrinsics.areEqual(this.callInstrument, instrumentRow.callInstrument) && Intrinsics.areEqual(this.putInstrument, instrumentRow.putInstrument) && Intrinsics.areEqual(this.strikePrice, instrumentRow.strikePrice);
        }

        public int hashCode() {
            OptionInstrument optionInstrument = this.callInstrument;
            int iHashCode = (optionInstrument == null ? 0 : optionInstrument.hashCode()) * 31;
            OptionInstrument optionInstrument2 = this.putInstrument;
            return ((iHashCode + (optionInstrument2 != null ? optionInstrument2.hashCode() : 0)) * 31) + this.strikePrice.hashCode();
        }

        public String toString() {
            return "InstrumentRow(callInstrument=" + this.callInstrument + ", putInstrument=" + this.putInstrument + ", strikePrice=" + this.strikePrice + ")";
        }

        public InstrumentRow(OptionInstrument optionInstrument, OptionInstrument optionInstrument2, BigDecimal strikePrice) {
            Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
            this.callInstrument = optionInstrument;
            this.putInstrument = optionInstrument2;
            this.strikePrice = strikePrice;
        }

        public final OptionInstrument getCallInstrument() {
            return this.callInstrument;
        }

        public final OptionInstrument getPutInstrument() {
            return this.putInstrument;
        }

        public final BigDecimal getStrikePrice() {
            return this.strikePrice;
        }
    }

    /* compiled from: OptionSideBySideChainStore.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData$UnderlyingQuoteRow;", "Lcom/robinhood/librobinhood/data/store/OptionSideBySideChainTableRowData;", "underlyingQuote", "Lcom/robinhood/models/ui/UnderlyingQuote;", "<init>", "(Lcom/robinhood/models/ui/UnderlyingQuote;)V", "getUnderlyingQuote", "()Lcom/robinhood/models/ui/UnderlyingQuote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UnderlyingQuoteRow implements OptionSideBySideChainTableRowData {
        private final UnderlyingQuote underlyingQuote;

        public static /* synthetic */ UnderlyingQuoteRow copy$default(UnderlyingQuoteRow underlyingQuoteRow, UnderlyingQuote underlyingQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                underlyingQuote = underlyingQuoteRow.underlyingQuote;
            }
            return underlyingQuoteRow.copy(underlyingQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }

        public final UnderlyingQuoteRow copy(UnderlyingQuote underlyingQuote) {
            Intrinsics.checkNotNullParameter(underlyingQuote, "underlyingQuote");
            return new UnderlyingQuoteRow(underlyingQuote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnderlyingQuoteRow) && Intrinsics.areEqual(this.underlyingQuote, ((UnderlyingQuoteRow) other).underlyingQuote);
        }

        public int hashCode() {
            return this.underlyingQuote.hashCode();
        }

        public String toString() {
            return "UnderlyingQuoteRow(underlyingQuote=" + this.underlyingQuote + ")";
        }

        public UnderlyingQuoteRow(UnderlyingQuote underlyingQuote) {
            Intrinsics.checkNotNullParameter(underlyingQuote, "underlyingQuote");
            this.underlyingQuote = underlyingQuote;
        }

        public final UnderlyingQuote getUnderlyingQuote() {
            return this.underlyingQuote;
        }
    }
}
