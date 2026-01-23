package com.robinhood.android.redesign.model;

import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesClosePrices;
import com.robinhood.android.models.futures.marketdata.p191db.FuturesQuote;
import com.robinhood.models.Decimals4;
import com.robinhood.models.crypto.p314db.CryptoDescription;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.p320db.AggregateOptionStrategyQuote;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.models.p355ui.UiOptionStrategyInfo;
import com.robinhood.models.p355ui.UiOptionStrategyLeg;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AssetQuote.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u001b\u001c\u001d\u001e\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0012\u0010\u0019\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011\u0082\u0001\u0005 !\"#$¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/AssetQuote;", "", "<init>", "()V", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "symbol", "getSymbol", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "isUp", "", "()Z", "percentChange", "Ljava/math/BigDecimal;", "getPercentChange", "()Ljava/math/BigDecimal;", "previousCloseReference", "getPreviousCloseReference", "Equity", "Crypto", "Future", "Index", "Option", "Lcom/robinhood/android/redesign/model/AssetQuote$Crypto;", "Lcom/robinhood/android/redesign/model/AssetQuote$Equity;", "Lcom/robinhood/android/redesign/model/AssetQuote$Future;", "Lcom/robinhood/android/redesign/model/AssetQuote$Index;", "Lcom/robinhood/android/redesign/model/AssetQuote$Option;", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class AssetQuote {
    private final String displayName;

    public /* synthetic */ AssetQuote(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract UUID getId();

    public abstract Money getLastTradePrice();

    public abstract BigDecimal getPercentChange();

    public abstract Money getPreviousCloseReference();

    public abstract String getSymbol();

    /* renamed from: isUp */
    public abstract boolean getIsUp();

    private AssetQuote() {
    }

    public String getDisplayName() {
        return this.displayName;
    }

    /* compiled from: AssetQuote.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/AssetQuote$Equity;", "Lcom/robinhood/android/redesign/model/AssetQuote;", "quote", "Lcom/robinhood/models/db/Quote;", "instrument", "Lcom/robinhood/models/db/Instrument;", "<init>", "(Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Instrument;)V", "getQuote", "()Lcom/robinhood/models/db/Quote;", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "displayName", "getDisplayName", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "isUp", "", "()Z", "percentChange", "Ljava/math/BigDecimal;", "getPercentChange", "()Ljava/math/BigDecimal;", "previousCloseReference", "getPreviousCloseReference", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Equity extends AssetQuote {
        private final Instrument instrument;
        private final Quote quote;

        public static /* synthetic */ Equity copy$default(Equity equity, Quote quote, Instrument instrument, int i, Object obj) {
            if ((i & 1) != 0) {
                quote = equity.quote;
            }
            if ((i & 2) != 0) {
                instrument = equity.instrument;
            }
            return equity.copy(quote, instrument);
        }

        /* renamed from: component1, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        /* renamed from: component2, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Equity copy(Quote quote, Instrument instrument) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            return new Equity(quote, instrument);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Equity)) {
                return false;
            }
            Equity equity = (Equity) other;
            return Intrinsics.areEqual(this.quote, equity.quote) && Intrinsics.areEqual(this.instrument, equity.instrument);
        }

        public int hashCode() {
            int iHashCode = this.quote.hashCode() * 31;
            Instrument instrument = this.instrument;
            return iHashCode + (instrument == null ? 0 : instrument.hashCode());
        }

        public String toString() {
            return "Equity(quote=" + this.quote + ", instrument=" + this.instrument + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Equity(Quote quote, Instrument instrument) {
            super(null);
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.quote = quote;
            this.instrument = instrument;
        }

        public /* synthetic */ Equity(Quote quote, Instrument instrument, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(quote, (i & 2) != 0 ? null : instrument);
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Quote getQuote() {
            return this.quote;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public String getSymbol() {
            return this.quote.getSymbol();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public String getDisplayName() {
            Instrument instrument = this.instrument;
            if (instrument != null) {
                return instrument.getDisplayName();
            }
            return null;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public UUID getId() {
            return this.quote.getInstrumentId();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getLastTradePrice() {
            return this.quote.getLastTradePrice();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        /* renamed from: isUp */
        public boolean getIsUp() {
            return this.quote.isUpForTheDay();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public BigDecimal getPercentChange() {
            return this.quote.getTodaysPercentChange();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getPreviousCloseReference() {
            return this.quote.getPreviousClose();
        }
    }

    /* compiled from: AssetQuote.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/AssetQuote$Crypto;", "Lcom/robinhood/android/redesign/model/AssetQuote;", "quote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "description", "Lcom/robinhood/models/crypto/db/CryptoDescription;", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoQuote;Lcom/robinhood/models/crypto/db/CryptoDescription;Lcom/robinhood/models/crypto/db/Currency;)V", "getQuote", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "getDescription", "()Lcom/robinhood/models/crypto/db/CryptoDescription;", "getCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "displayName", "getDisplayName", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "isUp", "", "()Z", "percentChange", "Ljava/math/BigDecimal;", "getPercentChange", "()Ljava/math/BigDecimal;", "previousCloseReference", "getPreviousCloseReference", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Crypto extends AssetQuote {
        private final Currency currency;
        private final CryptoDescription description;
        private final CryptoQuote quote;

        public static /* synthetic */ Crypto copy$default(Crypto crypto2, CryptoQuote cryptoQuote, CryptoDescription cryptoDescription, Currency currency, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoQuote = crypto2.quote;
            }
            if ((i & 2) != 0) {
                cryptoDescription = crypto2.description;
            }
            if ((i & 4) != 0) {
                currency = crypto2.currency;
            }
            return crypto2.copy(cryptoQuote, cryptoDescription, currency);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoQuote getQuote() {
            return this.quote;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoDescription getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        public final Crypto copy(CryptoQuote quote, CryptoDescription description, Currency currency) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            return new Crypto(quote, description, currency);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Crypto)) {
                return false;
            }
            Crypto crypto2 = (Crypto) other;
            return Intrinsics.areEqual(this.quote, crypto2.quote) && Intrinsics.areEqual(this.description, crypto2.description) && Intrinsics.areEqual(this.currency, crypto2.currency);
        }

        public int hashCode() {
            int iHashCode = this.quote.hashCode() * 31;
            CryptoDescription cryptoDescription = this.description;
            int iHashCode2 = (iHashCode + (cryptoDescription == null ? 0 : cryptoDescription.hashCode())) * 31;
            Currency currency = this.currency;
            return iHashCode2 + (currency != null ? currency.hashCode() : 0);
        }

        public String toString() {
            return "Crypto(quote=" + this.quote + ", description=" + this.description + ", currency=" + this.currency + ")";
        }

        public /* synthetic */ Crypto(CryptoQuote cryptoQuote, CryptoDescription cryptoDescription, Currency currency, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cryptoQuote, (i & 2) != 0 ? null : cryptoDescription, (i & 4) != 0 ? null : currency);
        }

        public final CryptoQuote getQuote() {
            return this.quote;
        }

        public final CryptoDescription getDescription() {
            return this.description;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(CryptoQuote quote, CryptoDescription cryptoDescription, Currency currency) {
            super(null);
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.quote = quote;
            this.description = cryptoDescription;
            this.currency = currency;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public String getSymbol() {
            String symbol;
            CryptoDescription cryptoDescription = this.description;
            return (cryptoDescription == null || (symbol = cryptoDescription.getSymbol()) == null) ? this.quote.getSymbol() : symbol;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public String getDisplayName() {
            String symbol;
            String name;
            Currency currency = this.currency;
            String str = null;
            if (currency != null && (name = currency.getName()) != null) {
                if (StringsKt.isBlank(name)) {
                    name = null;
                }
                if (name != null) {
                    return name;
                }
            }
            CryptoDescription cryptoDescription = this.description;
            if (cryptoDescription != null && (symbol = cryptoDescription.getSymbol()) != null && !StringsKt.isBlank(symbol)) {
                str = symbol;
            }
            return str == null ? getSymbol() : str;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public UUID getId() {
            return this.quote.getId();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getLastTradePrice() {
            return this.quote.getMarkPrice();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        /* renamed from: isUp */
        public boolean getIsUp() {
            return this.quote.getMarkPrice().compareTo(this.quote.getOpenPrice()) >= 0;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public BigDecimal getPercentChange() {
            return this.quote.getPercentChange();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getPreviousCloseReference() {
            return this.quote.getOpenPrice();
        }
    }

    /* compiled from: AssetQuote.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J'\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0019¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/AssetQuote$Future;", "Lcom/robinhood/android/redesign/model/AssetQuote;", "contractId", "Ljava/util/UUID;", "quote", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "futuresClosePrice", "Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;)V", "getContractId", "()Ljava/util/UUID;", "getQuote", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesQuote;", "getFuturesClosePrice", "()Lcom/robinhood/android/models/futures/marketdata/db/FuturesClosePrices;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "id", "getId", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "isUp", "", "()Z", "percentChange", "Ljava/math/BigDecimal;", "getPercentChange", "()Ljava/math/BigDecimal;", "previousCloseReference", "getPreviousCloseReference", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Future extends AssetQuote {
        private final UUID contractId;
        private final FuturesClosePrices futuresClosePrice;
        private final FuturesQuote quote;

        public static /* synthetic */ Future copy$default(Future future, UUID uuid, FuturesQuote futuresQuote, FuturesClosePrices futuresClosePrices, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = future.contractId;
            }
            if ((i & 2) != 0) {
                futuresQuote = future.quote;
            }
            if ((i & 4) != 0) {
                futuresClosePrices = future.futuresClosePrice;
            }
            return future.copy(uuid, futuresQuote, futuresClosePrices);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getContractId() {
            return this.contractId;
        }

        /* renamed from: component2, reason: from getter */
        public final FuturesQuote getQuote() {
            return this.quote;
        }

        /* renamed from: component3, reason: from getter */
        public final FuturesClosePrices getFuturesClosePrice() {
            return this.futuresClosePrice;
        }

        public final Future copy(UUID contractId, FuturesQuote quote, FuturesClosePrices futuresClosePrice) {
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(futuresClosePrice, "futuresClosePrice");
            return new Future(contractId, quote, futuresClosePrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Future)) {
                return false;
            }
            Future future = (Future) other;
            return Intrinsics.areEqual(this.contractId, future.contractId) && Intrinsics.areEqual(this.quote, future.quote) && Intrinsics.areEqual(this.futuresClosePrice, future.futuresClosePrice);
        }

        public int hashCode() {
            return (((this.contractId.hashCode() * 31) + this.quote.hashCode()) * 31) + this.futuresClosePrice.hashCode();
        }

        public String toString() {
            return "Future(contractId=" + this.contractId + ", quote=" + this.quote + ", futuresClosePrice=" + this.futuresClosePrice + ")";
        }

        public final UUID getContractId() {
            return this.contractId;
        }

        public final FuturesClosePrices getFuturesClosePrice() {
            return this.futuresClosePrice;
        }

        public final FuturesQuote getQuote() {
            return this.quote;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Future(UUID contractId, FuturesQuote quote, FuturesClosePrices futuresClosePrice) {
            super(null);
            Intrinsics.checkNotNullParameter(contractId, "contractId");
            Intrinsics.checkNotNullParameter(quote, "quote");
            Intrinsics.checkNotNullParameter(futuresClosePrice, "futuresClosePrice");
            this.contractId = contractId;
            this.quote = quote;
            this.futuresClosePrice = futuresClosePrice;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public String getSymbol() {
            return this.quote.getSymbol();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public UUID getId() {
            return this.contractId;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getLastTradePrice() {
            Money money$default;
            BigDecimal lastTradePrice = this.quote.getLastTradePrice();
            return (lastTradePrice == null || (money$default = Money3.toMoney$default(lastTradePrice, null, 1, null)) == null) ? Money3.toMoney$default(new BigDecimal(0), null, 1, null) : money$default;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        /* renamed from: isUp */
        public boolean getIsUp() {
            return getLastTradePrice().compareTo(getPreviousCloseReference()) >= 0;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public BigDecimal getPercentChange() {
            BigDecimal bigDecimalSubtract = getLastTradePrice().getDecimalValue().subtract(getPreviousCloseReference().getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return BigDecimals7.safeDivide(bigDecimalSubtract, getPreviousCloseReference().getDecimalValue());
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getPreviousCloseReference() {
            Money money$default;
            BigDecimal previousClosePrice = this.futuresClosePrice.getPreviousClosePrice();
            return (previousClosePrice == null || (money$default = Money3.toMoney$default(previousClosePrice, null, 1, null)) == null) ? Money3.toMoney$default(new BigDecimal(0), null, 1, null) : money$default;
        }
    }

    /* compiled from: AssetQuote.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u001d\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0017¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/AssetQuote$Index;", "Lcom/robinhood/android/redesign/model/AssetQuote;", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "<init>", "(Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;)V", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getIndexCloseValue", "()Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "isUp", "", "()Z", "percentChange", "Ljava/math/BigDecimal;", "getPercentChange", "()Ljava/math/BigDecimal;", "previousCloseReference", "getPreviousCloseReference", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Index extends AssetQuote {
        private final IndexCloseValue indexCloseValue;
        private final IndexValue indexValue;

        public static /* synthetic */ Index copy$default(Index index, IndexValue indexValue, IndexCloseValue indexCloseValue, int i, Object obj) {
            if ((i & 1) != 0) {
                indexValue = index.indexValue;
            }
            if ((i & 2) != 0) {
                indexCloseValue = index.indexCloseValue;
            }
            return index.copy(indexValue, indexCloseValue);
        }

        /* renamed from: component1, reason: from getter */
        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        /* renamed from: component2, reason: from getter */
        public final IndexCloseValue getIndexCloseValue() {
            return this.indexCloseValue;
        }

        public final Index copy(IndexValue indexValue, IndexCloseValue indexCloseValue) {
            Intrinsics.checkNotNullParameter(indexValue, "indexValue");
            Intrinsics.checkNotNullParameter(indexCloseValue, "indexCloseValue");
            return new Index(indexValue, indexCloseValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Index)) {
                return false;
            }
            Index index = (Index) other;
            return Intrinsics.areEqual(this.indexValue, index.indexValue) && Intrinsics.areEqual(this.indexCloseValue, index.indexCloseValue);
        }

        public int hashCode() {
            return (this.indexValue.hashCode() * 31) + this.indexCloseValue.hashCode();
        }

        public String toString() {
            return "Index(indexValue=" + this.indexValue + ", indexCloseValue=" + this.indexCloseValue + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Index(IndexValue indexValue, IndexCloseValue indexCloseValue) {
            super(null);
            Intrinsics.checkNotNullParameter(indexValue, "indexValue");
            Intrinsics.checkNotNullParameter(indexCloseValue, "indexCloseValue");
            this.indexValue = indexValue;
            this.indexCloseValue = indexCloseValue;
        }

        public final IndexCloseValue getIndexCloseValue() {
            return this.indexCloseValue;
        }

        public final IndexValue getIndexValue() {
            return this.indexValue;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public String getSymbol() {
            return this.indexValue.getSymbol();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public UUID getId() {
            return this.indexValue.getInstrumentId();
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getLastTradePrice() {
            return Money3.toMoney$default(this.indexValue.getTrimmedValue(), null, 1, null);
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        /* renamed from: isUp */
        public boolean getIsUp() {
            return getLastTradePrice().compareTo(getPreviousCloseReference()) >= 0;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public BigDecimal getPercentChange() {
            BigDecimal bigDecimalSubtract = getLastTradePrice().getDecimalValue().subtract(getPreviousCloseReference().getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            return BigDecimals7.safeDivide(bigDecimalSubtract, getPreviousCloseReference().getDecimalValue());
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getPreviousCloseReference() {
            return Money3.toMoney$default(this.indexCloseValue.getCloseValue(), null, 1, null);
        }
    }

    /* compiled from: AssetQuote.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u001d\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/redesign/model/AssetQuote$Option;", "Lcom/robinhood/android/redesign/model/AssetQuote;", "uiStrategyInfo", "Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "quote", "Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "<init>", "(Lcom/robinhood/models/ui/UiOptionStrategyInfo;Lcom/robinhood/models/db/AggregateOptionStrategyQuote;)V", "getUiStrategyInfo", "()Lcom/robinhood/models/ui/UiOptionStrategyInfo;", "getQuote", "()Lcom/robinhood/models/db/AggregateOptionStrategyQuote;", "optionInstrument", "Lcom/robinhood/models/db/OptionInstrument;", "symbol", "", "getSymbol", "()Ljava/lang/String;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "lastTradePrice", "Lcom/robinhood/models/util/Money;", "getLastTradePrice", "()Lcom/robinhood/models/util/Money;", "isUp", "", "()Z", "percentChange", "Ljava/math/BigDecimal;", "getPercentChange", "()Ljava/math/BigDecimal;", "previousCloseReference", "getPreviousCloseReference", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib-db-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Option extends AssetQuote {
        private final UUID id;
        private final boolean isUp;
        private final Money lastTradePrice;
        private final OptionInstrument optionInstrument;
        private final BigDecimal percentChange;
        private final Money previousCloseReference;
        private final AggregateOptionStrategyQuote quote;
        private final String symbol;
        private final UiOptionStrategyInfo uiStrategyInfo;

        public static /* synthetic */ Option copy$default(Option option, UiOptionStrategyInfo uiOptionStrategyInfo, AggregateOptionStrategyQuote aggregateOptionStrategyQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                uiOptionStrategyInfo = option.uiStrategyInfo;
            }
            if ((i & 2) != 0) {
                aggregateOptionStrategyQuote = option.quote;
            }
            return option.copy(uiOptionStrategyInfo, aggregateOptionStrategyQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final UiOptionStrategyInfo getUiStrategyInfo() {
            return this.uiStrategyInfo;
        }

        /* renamed from: component2, reason: from getter */
        public final AggregateOptionStrategyQuote getQuote() {
            return this.quote;
        }

        public final Option copy(UiOptionStrategyInfo uiStrategyInfo, AggregateOptionStrategyQuote quote) {
            Intrinsics.checkNotNullParameter(uiStrategyInfo, "uiStrategyInfo");
            Intrinsics.checkNotNullParameter(quote, "quote");
            return new Option(uiStrategyInfo, quote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.areEqual(this.uiStrategyInfo, option.uiStrategyInfo) && Intrinsics.areEqual(this.quote, option.quote);
        }

        public int hashCode() {
            return (this.uiStrategyInfo.hashCode() * 31) + this.quote.hashCode();
        }

        public String toString() {
            return "Option(uiStrategyInfo=" + this.uiStrategyInfo + ", quote=" + this.quote + ")";
        }

        public final UiOptionStrategyInfo getUiStrategyInfo() {
            return this.uiStrategyInfo;
        }

        public final AggregateOptionStrategyQuote getQuote() {
            return this.quote;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Option(UiOptionStrategyInfo uiStrategyInfo, AggregateOptionStrategyQuote quote) {
            BigDecimal rawValue;
            Money money$default;
            super(null);
            Intrinsics.checkNotNullParameter(uiStrategyInfo, "uiStrategyInfo");
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.uiStrategyInfo = uiStrategyInfo;
            this.quote = quote;
            OptionInstrument optionInstrument = ((UiOptionStrategyLeg) CollectionsKt.single((List) uiStrategyInfo.getLegs())).getOptionInstrument();
            this.optionInstrument = optionInstrument;
            this.symbol = optionInstrument.getChainSymbol();
            this.id = uiStrategyInfo.getId();
            Decimals4 lastTradePrice = quote.getLastTradePrice();
            this.lastTradePrice = (lastTradePrice == null || (rawValue = lastTradePrice.getRawValue()) == null || (money$default = Money3.toMoney$default(rawValue, null, 1, null)) == null) ? Money3.toMoney$default(new BigDecimal(0), null, 1, null) : money$default;
            this.isUp = quote.getIsUpForTheDay();
            this.percentChange = quote.getTodaysPercentChange();
            this.previousCloseReference = Money3.toMoney$default(quote.getPreviousClosePrice().getRawValue(), null, 1, null);
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public String getSymbol() {
            return this.symbol;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getLastTradePrice() {
            return this.lastTradePrice;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        /* renamed from: isUp, reason: from getter */
        public boolean getIsUp() {
            return this.isUp;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public BigDecimal getPercentChange() {
            return this.percentChange;
        }

        @Override // com.robinhood.android.redesign.model.AssetQuote
        public Money getPreviousCloseReference() {
            return this.previousCloseReference;
        }
    }
}
