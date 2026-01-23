package com.robinhood.websocket.p410dx;

import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.p410dx.models.DxData;
import com.robinhood.websocket.p410dx.models.DxFeedData;
import com.robinhood.websocket.p410dx.models.DxResponse;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DxTopic.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxTopic;", "T", "Lcom/robinhood/websocket/dx/models/DxData;", "Lcom/robinhood/websocket/api/WebsocketTopic;", "DepthOfMarket", "Feed", "InstrumentType", "Lcom/robinhood/websocket/dx/DxTopic$DepthOfMarket;", "Lcom/robinhood/websocket/dx/DxTopic$Feed;", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface DxTopic<T extends DxData> extends WebsocketTopic<T> {

    /* compiled from: DxTopic.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <T extends DxData> boolean getCacheLatestValue(DxTopic<T> dxTopic) {
            return WebsocketTopic.DefaultImpls.getCacheLatestValue(dxTopic);
        }

        public static <T extends DxData> long getCacheTimeoutMs(DxTopic<T> dxTopic) {
            return WebsocketTopic.DefaultImpls.getCacheTimeoutMs(dxTopic);
        }
    }

    /* compiled from: DxTopic.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxTopic$DepthOfMarket;", "Lcom/robinhood/websocket/dx/DxTopic;", "Lcom/robinhood/websocket/dx/models/DxResponse$DomSnapshot;", "contractSymbol", "", "instrumentType", "Lcom/robinhood/websocket/dx/DxTopic$InstrumentType;", "<init>", "(Ljava/lang/String;Lcom/robinhood/websocket/dx/DxTopic$InstrumentType;)V", "getContractSymbol", "()Ljava/lang/String;", "getInstrumentType", "()Lcom/robinhood/websocket/dx/DxTopic$InstrumentType;", "cacheLatestValue", "", "getCacheLatestValue", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DepthOfMarket implements DxTopic<DxResponse.DomSnapshot> {
        private final String contractSymbol;
        private final InstrumentType instrumentType;

        public static /* synthetic */ DepthOfMarket copy$default(DepthOfMarket depthOfMarket, String str, InstrumentType instrumentType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depthOfMarket.contractSymbol;
            }
            if ((i & 2) != 0) {
                instrumentType = depthOfMarket.instrumentType;
            }
            return depthOfMarket.copy(str, instrumentType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContractSymbol() {
            return this.contractSymbol;
        }

        /* renamed from: component2, reason: from getter */
        public final InstrumentType getInstrumentType() {
            return this.instrumentType;
        }

        public final DepthOfMarket copy(String contractSymbol, InstrumentType instrumentType) {
            Intrinsics.checkNotNullParameter(contractSymbol, "contractSymbol");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            return new DepthOfMarket(contractSymbol, instrumentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DepthOfMarket)) {
                return false;
            }
            DepthOfMarket depthOfMarket = (DepthOfMarket) other;
            return Intrinsics.areEqual(this.contractSymbol, depthOfMarket.contractSymbol) && this.instrumentType == depthOfMarket.instrumentType;
        }

        @Override // com.robinhood.websocket.api.WebsocketTopic
        public boolean getCacheLatestValue() {
            return true;
        }

        public int hashCode() {
            return (this.contractSymbol.hashCode() * 31) + this.instrumentType.hashCode();
        }

        public String toString() {
            return "DepthOfMarket(contractSymbol=" + this.contractSymbol + ", instrumentType=" + this.instrumentType + ")";
        }

        public DepthOfMarket(String contractSymbol, InstrumentType instrumentType) {
            Intrinsics.checkNotNullParameter(contractSymbol, "contractSymbol");
            Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
            this.contractSymbol = contractSymbol;
            this.instrumentType = instrumentType;
        }

        @Override // com.robinhood.websocket.api.WebsocketTopic
        public long getCacheTimeoutMs() {
            return DefaultImpls.getCacheTimeoutMs(this);
        }

        public final String getContractSymbol() {
            return this.contractSymbol;
        }

        public final InstrumentType getInstrumentType() {
            return this.instrumentType;
        }
    }

    /* compiled from: DxTopic.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\n\u000bR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxTopic$Feed;", "T", "Lcom/robinhood/websocket/dx/models/DxFeedData;", "Lcom/robinhood/websocket/dx/DxTopic;", "type", "", "getType", "()Ljava/lang/String;", "symbol", "getSymbol", DxFeedData.TYPE_QUOTE, "LastTrade", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Feed<T extends DxFeedData> extends DxTopic<T> {
        String getSymbol();

        String getType();

        /* compiled from: DxTopic.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static <T extends DxFeedData> boolean getCacheLatestValue(Feed<T> feed) {
                return DefaultImpls.getCacheLatestValue(feed);
            }

            public static <T extends DxFeedData> long getCacheTimeoutMs(Feed<T> feed) {
                return DefaultImpls.getCacheTimeoutMs(feed);
            }
        }

        /* compiled from: DxTopic.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxTopic$Feed$Quote;", "Lcom/robinhood/websocket/dx/DxTopic$Feed;", "Lcom/robinhood/websocket/dx/models/DxFeedData$Quote;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "type", "getType", "cacheLatestValue", "", "getCacheLatestValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Quote implements Feed<DxFeedData.Quote> {
            private final String symbol;

            public static /* synthetic */ Quote copy$default(Quote quote, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = quote.symbol;
                }
                return quote.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            public final Quote copy(String symbol) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                return new Quote(symbol);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Quote) && Intrinsics.areEqual(this.symbol, ((Quote) other).symbol);
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public boolean getCacheLatestValue() {
                return true;
            }

            public int hashCode() {
                return this.symbol.hashCode();
            }

            public String toString() {
                return "Quote(symbol=" + this.symbol + ")";
            }

            public Quote(String symbol) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.symbol = symbol;
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public long getCacheTimeoutMs() {
                return DefaultImpls.getCacheTimeoutMs(this);
            }

            @Override // com.robinhood.websocket.dx.DxTopic.Feed
            public String getSymbol() {
                return this.symbol;
            }

            @Override // com.robinhood.websocket.dx.DxTopic.Feed
            public String getType() {
                return DxFeedData.TYPE_QUOTE;
            }
        }

        /* compiled from: DxTopic.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxTopic$Feed$LastTrade;", "Lcom/robinhood/websocket/dx/DxTopic$Feed;", "Lcom/robinhood/websocket/dx/models/DxFeedData$Trade;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "type", "getType", "cacheLatestValue", "", "getCacheLatestValue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LastTrade implements Feed<DxFeedData.Trade> {
            private final String symbol;

            public static /* synthetic */ LastTrade copy$default(LastTrade lastTrade, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = lastTrade.symbol;
                }
                return lastTrade.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            public final LastTrade copy(String symbol) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                return new LastTrade(symbol);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LastTrade) && Intrinsics.areEqual(this.symbol, ((LastTrade) other).symbol);
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public boolean getCacheLatestValue() {
                return true;
            }

            public int hashCode() {
                return this.symbol.hashCode();
            }

            public String toString() {
                return "LastTrade(symbol=" + this.symbol + ")";
            }

            public LastTrade(String symbol) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.symbol = symbol;
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public long getCacheTimeoutMs() {
                return DefaultImpls.getCacheTimeoutMs(this);
            }

            @Override // com.robinhood.websocket.dx.DxTopic.Feed
            public String getSymbol() {
                return this.symbol;
            }

            @Override // com.robinhood.websocket.dx.DxTopic.Feed
            public String getType() {
                return DxFeedData.TYPE_TRADE;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DxTopic.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/websocket/dx/DxTopic$InstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "FUTURES", "CRYPTO", "PERPETUALS", "lib-websocket-dx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InstrumentType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InstrumentType[] $VALUES;
        public static final InstrumentType FUTURES = new InstrumentType("FUTURES", 0);
        public static final InstrumentType CRYPTO = new InstrumentType("CRYPTO", 1);
        public static final InstrumentType PERPETUALS = new InstrumentType("PERPETUALS", 2);

        private static final /* synthetic */ InstrumentType[] $values() {
            return new InstrumentType[]{FUTURES, CRYPTO, PERPETUALS};
        }

        public static EnumEntries<InstrumentType> getEntries() {
            return $ENTRIES;
        }

        private InstrumentType(String str, int i) {
        }

        static {
            InstrumentType[] instrumentTypeArr$values = $values();
            $VALUES = instrumentTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(instrumentTypeArr$values);
        }

        public static InstrumentType valueOf(String str) {
            return (InstrumentType) Enum.valueOf(InstrumentType.class, str);
        }

        public static InstrumentType[] values() {
            return (InstrumentType[]) $VALUES.clone();
        }
    }
}
