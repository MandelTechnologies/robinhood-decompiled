package com.robinhood.shared.history.compose;

import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey;
import com.robinhood.android.indexes.contracts.IndexDetailPageFragmentKey2;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Underlying.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/history/compose/Underlying;", "", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "toFragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "accountNumber", "Equity", "Index", "Crypto", "Lcom/robinhood/shared/history/compose/Underlying$Crypto;", "Lcom/robinhood/shared/history/compose/Underlying$Equity;", "Lcom/robinhood/shared/history/compose/Underlying$Index;", "lib-history-compose_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class Underlying {
    public static final int $stable = 0;
    private final String symbol;

    public /* synthetic */ Underlying(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private Underlying(String str) {
        this.symbol = str;
    }

    public String getSymbol() {
        return this.symbol;
    }

    /* compiled from: Underlying.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/history/compose/Underlying$Equity;", "Lcom/robinhood/shared/history/compose/Underlying;", "symbol", "", "instrumentId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getSymbol", "()Ljava/lang/String;", "getInstrumentId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-history-compose_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Equity extends Underlying {
        public static final int $stable = 8;
        private final UUID instrumentId;
        private final String symbol;

        public static /* synthetic */ Equity copy$default(Equity equity, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = equity.symbol;
            }
            if ((i & 2) != 0) {
                uuid = equity.instrumentId;
            }
            return equity.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        public final Equity copy(String symbol, UUID instrumentId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            return new Equity(symbol, instrumentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Equity)) {
                return false;
            }
            Equity equity = (Equity) other;
            return Intrinsics.areEqual(this.symbol, equity.symbol) && Intrinsics.areEqual(this.instrumentId, equity.instrumentId);
        }

        public int hashCode() {
            int iHashCode = this.symbol.hashCode() * 31;
            UUID uuid = this.instrumentId;
            return iHashCode + (uuid == null ? 0 : uuid.hashCode());
        }

        public String toString() {
            return "Equity(symbol=" + this.symbol + ", instrumentId=" + this.instrumentId + ")";
        }

        public /* synthetic */ Equity(String str, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : uuid);
        }

        @Override // com.robinhood.shared.history.compose.Underlying
        public String getSymbol() {
            return this.symbol;
        }

        public final UUID getInstrumentId() {
            return this.instrumentId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Equity(String symbol, UUID uuid) {
            super(symbol, null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.symbol = symbol;
            this.instrumentId = uuid;
        }
    }

    /* compiled from: Underlying.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/history/compose/Underlying$Index;", "Lcom/robinhood/shared/history/compose/Underlying;", "symbol", "", "indexId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getSymbol", "()Ljava/lang/String;", "getIndexId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-history-compose_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Index extends Underlying {
        public static final int $stable = 8;
        private final UUID indexId;
        private final String symbol;

        public static /* synthetic */ Index copy$default(Index index, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = index.symbol;
            }
            if ((i & 2) != 0) {
                uuid = index.indexId;
            }
            return index.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getIndexId() {
            return this.indexId;
        }

        public final Index copy(String symbol, UUID indexId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(indexId, "indexId");
            return new Index(symbol, indexId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Index)) {
                return false;
            }
            Index index = (Index) other;
            return Intrinsics.areEqual(this.symbol, index.symbol) && Intrinsics.areEqual(this.indexId, index.indexId);
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + this.indexId.hashCode();
        }

        public String toString() {
            return "Index(symbol=" + this.symbol + ", indexId=" + this.indexId + ")";
        }

        @Override // com.robinhood.shared.history.compose.Underlying
        public String getSymbol() {
            return this.symbol;
        }

        public final UUID getIndexId() {
            return this.indexId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Index(String symbol, UUID indexId) {
            super(symbol, null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(indexId, "indexId");
            this.symbol = symbol;
            this.indexId = indexId;
        }
    }

    /* compiled from: Underlying.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/history/compose/Underlying$Crypto;", "Lcom/robinhood/shared/history/compose/Underlying;", "symbol", "", "currencyPairId", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getSymbol", "()Ljava/lang/String;", "getCurrencyPairId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-history-compose_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Crypto extends Underlying {
        public static final int $stable = 8;
        private final UUID currencyPairId;
        private final String symbol;

        public static /* synthetic */ Crypto copy$default(Crypto crypto2, String str, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                str = crypto2.symbol;
            }
            if ((i & 2) != 0) {
                uuid = crypto2.currencyPairId;
            }
            return crypto2.copy(str, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final Crypto copy(String symbol, UUID currencyPairId) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            return new Crypto(symbol, currencyPairId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Crypto)) {
                return false;
            }
            Crypto crypto2 = (Crypto) other;
            return Intrinsics.areEqual(this.symbol, crypto2.symbol) && Intrinsics.areEqual(this.currencyPairId, crypto2.currencyPairId);
        }

        public int hashCode() {
            return (this.symbol.hashCode() * 31) + this.currencyPairId.hashCode();
        }

        public String toString() {
            return "Crypto(symbol=" + this.symbol + ", currencyPairId=" + this.currencyPairId + ")";
        }

        @Override // com.robinhood.shared.history.compose.Underlying
        public String getSymbol() {
            return this.symbol;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(String symbol, UUID currencyPairId) {
            super(symbol, null);
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            this.symbol = symbol;
            this.currencyPairId = currencyPairId;
        }
    }

    public final FragmentKey toFragmentKey(String accountNumber) {
        if (this instanceof Crypto) {
            return new CryptoDetailFragmentKey(((Crypto) this).getCurrencyPairId(), null, true, null, null, null, 58, null);
        }
        if (this instanceof Equity) {
            Equity equity = (Equity) this;
            if (equity.getInstrumentId() != null) {
                return new LegacyFragmentKey.EquityInstrumentDetail(equity.getInstrumentId(), null, accountNumber, InstrumentDetailSource.HISTORY_DETAIL, false, 18, null);
            }
            return new LegacyFragmentKey.EquityInstrumentDetail(equity.getSymbol(), InstrumentDetailSource.HISTORY_DETAIL, accountNumber);
        }
        if (!(this instanceof Index)) {
            throw new NoWhenBranchMatchedException();
        }
        return new IndexDetailPageFragmentKey(((Index) this).getIndexId(), accountNumber, IndexDetailPageFragmentKey2.OptionEventDetail.INSTANCE);
    }
}
