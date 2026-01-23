package com.robinhood.websocket.p413md;

import com.robinhood.websocket.api.WebsocketTopic;
import com.robinhood.websocket.p413md.models.MarketData;
import com.robinhood.websocket.p413md.models.MdFeedData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MdTopic.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdTopic;", "T", "Lcom/robinhood/websocket/md/models/MarketData;", "Lcom/robinhood/websocket/api/WebsocketTopic;", "Feed", "Lcom/robinhood/websocket/md/MdTopic$Feed;", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface MdTopic<T extends MarketData> extends WebsocketTopic<T> {

    /* compiled from: MdTopic.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <T extends MarketData> boolean getCacheLatestValue(MdTopic<T> mdTopic) {
            return WebsocketTopic.DefaultImpls.getCacheLatestValue(mdTopic);
        }

        public static <T extends MarketData> long getCacheTimeoutMs(MdTopic<T> mdTopic) {
            return WebsocketTopic.DefaultImpls.getCacheTimeoutMs(mdTopic);
        }
    }

    /* compiled from: MdTopic.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0002\u0015\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdTopic$Feed;", "T", "Lcom/robinhood/websocket/md/models/MdFeedData;", "Lcom/robinhood/websocket/md/MdTopic;", "type", "", "getType", "()Ljava/lang/String;", "symbol", "getSymbol", "includeQuoteParams", "", "getIncludeQuoteParams", "()Z", "includeInactive", "getIncludeInactive", "()Ljava/lang/Boolean;", "includeBboSource", "getIncludeBboSource", "bounds", "getBounds", "EquityL2Full", "EquityQuoteQbbo", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Feed<T extends MdFeedData> extends MdTopic<T> {
        String getBounds();

        Boolean getIncludeBboSource();

        Boolean getIncludeInactive();

        boolean getIncludeQuoteParams();

        String getSymbol();

        String getType();

        /* compiled from: MdTopic.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static <T extends MdFeedData> boolean getCacheLatestValue(Feed<T> feed) {
                return DefaultImpls.getCacheLatestValue(feed);
            }

            public static <T extends MdFeedData> long getCacheTimeoutMs(Feed<T> feed) {
                return DefaultImpls.getCacheTimeoutMs(feed);
            }
        }

        /* compiled from: MdTopic.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdTopic$Feed$EquityL2Full;", "Lcom/robinhood/websocket/md/MdTopic$Feed;", "Lcom/robinhood/websocket/md/models/MdFeedData$L2Data;", "symbol", "", "includeQuoteParams", "", "includeInactive", "includeBboSource", "bounds", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getIncludeQuoteParams", "()Z", "getIncludeInactive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIncludeBboSource", "getBounds", "type", "getType", "cacheLatestValue", "getCacheLatestValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/robinhood/websocket/md/MdTopic$Feed$EquityL2Full;", "equals", "other", "", "hashCode", "", "toString", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquityL2Full implements Feed<MdFeedData.L2Data> {
            private final String bounds;
            private final Boolean includeBboSource;
            private final Boolean includeInactive;
            private final boolean includeQuoteParams;
            private final String symbol;

            public static /* synthetic */ EquityL2Full copy$default(EquityL2Full equityL2Full, String str, boolean z, Boolean bool, Boolean bool2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = equityL2Full.symbol;
                }
                if ((i & 2) != 0) {
                    z = equityL2Full.includeQuoteParams;
                }
                if ((i & 4) != 0) {
                    bool = equityL2Full.includeInactive;
                }
                if ((i & 8) != 0) {
                    bool2 = equityL2Full.includeBboSource;
                }
                if ((i & 16) != 0) {
                    str2 = equityL2Full.bounds;
                }
                String str3 = str2;
                Boolean bool3 = bool;
                return equityL2Full.copy(str, z, bool3, bool2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIncludeQuoteParams() {
                return this.includeQuoteParams;
            }

            /* renamed from: component3, reason: from getter */
            public final Boolean getIncludeInactive() {
                return this.includeInactive;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIncludeBboSource() {
                return this.includeBboSource;
            }

            /* renamed from: component5, reason: from getter */
            public final String getBounds() {
                return this.bounds;
            }

            public final EquityL2Full copy(String symbol, boolean includeQuoteParams, Boolean includeInactive, Boolean includeBboSource, String bounds) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                return new EquityL2Full(symbol, includeQuoteParams, includeInactive, includeBboSource, bounds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EquityL2Full)) {
                    return false;
                }
                EquityL2Full equityL2Full = (EquityL2Full) other;
                return Intrinsics.areEqual(this.symbol, equityL2Full.symbol) && this.includeQuoteParams == equityL2Full.includeQuoteParams && Intrinsics.areEqual(this.includeInactive, equityL2Full.includeInactive) && Intrinsics.areEqual(this.includeBboSource, equityL2Full.includeBboSource) && Intrinsics.areEqual(this.bounds, equityL2Full.bounds);
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public boolean getCacheLatestValue() {
                return true;
            }

            public int hashCode() {
                int iHashCode = ((this.symbol.hashCode() * 31) + Boolean.hashCode(this.includeQuoteParams)) * 31;
                Boolean bool = this.includeInactive;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.includeBboSource;
                int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str = this.bounds;
                return iHashCode3 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "EquityL2Full(symbol=" + this.symbol + ", includeQuoteParams=" + this.includeQuoteParams + ", includeInactive=" + this.includeInactive + ", includeBboSource=" + this.includeBboSource + ", bounds=" + this.bounds + ")";
            }

            public EquityL2Full(String symbol, boolean z, Boolean bool, Boolean bool2, String str) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.symbol = symbol;
                this.includeQuoteParams = z;
                this.includeInactive = bool;
                this.includeBboSource = bool2;
                this.bounds = str;
            }

            public /* synthetic */ EquityL2Full(String str, boolean z, Boolean bool, Boolean bool2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : str2);
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public long getCacheTimeoutMs() {
                return DefaultImpls.getCacheTimeoutMs(this);
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public String getSymbol() {
                return this.symbol;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public boolean getIncludeQuoteParams() {
                return this.includeQuoteParams;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public Boolean getIncludeInactive() {
                return this.includeInactive;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public Boolean getIncludeBboSource() {
                return this.includeBboSource;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public String getBounds() {
                return this.bounds;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public String getType() {
                return "MD_EQUITY_L2_FULL";
            }
        }

        /* compiled from: MdTopic.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000f¨\u0006&"}, m3636d2 = {"Lcom/robinhood/websocket/md/MdTopic$Feed$EquityQuoteQbbo;", "Lcom/robinhood/websocket/md/MdTopic$Feed;", "Lcom/robinhood/websocket/md/models/MdFeedData$Quote;", "symbol", "", "includeQuoteParams", "", "includeInactive", "includeBboSource", "bounds", "<init>", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getIncludeQuoteParams", "()Z", "getIncludeInactive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIncludeBboSource", "getBounds", "type", "getType", "cacheLatestValue", "getCacheLatestValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/robinhood/websocket/md/MdTopic$Feed$EquityQuoteQbbo;", "equals", "other", "", "hashCode", "", "toString", "lib-websocket-md_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class EquityQuoteQbbo implements Feed<MdFeedData.Quote> {
            private final String bounds;
            private final Boolean includeBboSource;
            private final Boolean includeInactive;
            private final boolean includeQuoteParams;
            private final String symbol;

            public static /* synthetic */ EquityQuoteQbbo copy$default(EquityQuoteQbbo equityQuoteQbbo, String str, boolean z, Boolean bool, Boolean bool2, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = equityQuoteQbbo.symbol;
                }
                if ((i & 2) != 0) {
                    z = equityQuoteQbbo.includeQuoteParams;
                }
                if ((i & 4) != 0) {
                    bool = equityQuoteQbbo.includeInactive;
                }
                if ((i & 8) != 0) {
                    bool2 = equityQuoteQbbo.includeBboSource;
                }
                if ((i & 16) != 0) {
                    str2 = equityQuoteQbbo.bounds;
                }
                String str3 = str2;
                Boolean bool3 = bool;
                return equityQuoteQbbo.copy(str, z, bool3, bool2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSymbol() {
                return this.symbol;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIncludeQuoteParams() {
                return this.includeQuoteParams;
            }

            /* renamed from: component3, reason: from getter */
            public final Boolean getIncludeInactive() {
                return this.includeInactive;
            }

            /* renamed from: component4, reason: from getter */
            public final Boolean getIncludeBboSource() {
                return this.includeBboSource;
            }

            /* renamed from: component5, reason: from getter */
            public final String getBounds() {
                return this.bounds;
            }

            public final EquityQuoteQbbo copy(String symbol, boolean includeQuoteParams, Boolean includeInactive, Boolean includeBboSource, String bounds) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                return new EquityQuoteQbbo(symbol, includeQuoteParams, includeInactive, includeBboSource, bounds);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof EquityQuoteQbbo)) {
                    return false;
                }
                EquityQuoteQbbo equityQuoteQbbo = (EquityQuoteQbbo) other;
                return Intrinsics.areEqual(this.symbol, equityQuoteQbbo.symbol) && this.includeQuoteParams == equityQuoteQbbo.includeQuoteParams && Intrinsics.areEqual(this.includeInactive, equityQuoteQbbo.includeInactive) && Intrinsics.areEqual(this.includeBboSource, equityQuoteQbbo.includeBboSource) && Intrinsics.areEqual(this.bounds, equityQuoteQbbo.bounds);
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public boolean getCacheLatestValue() {
                return true;
            }

            public int hashCode() {
                int iHashCode = ((this.symbol.hashCode() * 31) + Boolean.hashCode(this.includeQuoteParams)) * 31;
                Boolean bool = this.includeInactive;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.includeBboSource;
                int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str = this.bounds;
                return iHashCode3 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                return "EquityQuoteQbbo(symbol=" + this.symbol + ", includeQuoteParams=" + this.includeQuoteParams + ", includeInactive=" + this.includeInactive + ", includeBboSource=" + this.includeBboSource + ", bounds=" + this.bounds + ")";
            }

            public EquityQuoteQbbo(String symbol, boolean z, Boolean bool, Boolean bool2, String str) {
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                this.symbol = symbol;
                this.includeQuoteParams = z;
                this.includeInactive = bool;
                this.includeBboSource = bool2;
                this.bounds = str;
            }

            @Override // com.robinhood.websocket.api.WebsocketTopic
            public long getCacheTimeoutMs() {
                return DefaultImpls.getCacheTimeoutMs(this);
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public String getSymbol() {
                return this.symbol;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public boolean getIncludeQuoteParams() {
                return this.includeQuoteParams;
            }

            public /* synthetic */ EquityQuoteQbbo(String str, boolean z, Boolean bool, Boolean bool2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? Boolean.TRUE : bool, (i & 8) != 0 ? Boolean.TRUE : bool2, (i & 16) != 0 ? "24_5" : str2);
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public Boolean getIncludeInactive() {
                return this.includeInactive;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public Boolean getIncludeBboSource() {
                return this.includeBboSource;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public String getBounds() {
                return this.bounds;
            }

            @Override // com.robinhood.websocket.md.MdTopic.Feed
            public String getType() {
                return "MD_EQUITY_QUOTE_QBBO";
            }
        }
    }
}
