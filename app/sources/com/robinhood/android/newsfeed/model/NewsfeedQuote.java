package com.robinhood.android.newsfeed.model;

import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.p320db.Quote;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewsfeedQuote.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/NewsfeedQuote;", "", "<init>", "()V", "Equity", "Crypto", "Lcom/robinhood/android/newsfeed/model/NewsfeedQuote$Crypto;", "Lcom/robinhood/android/newsfeed/model/NewsfeedQuote$Equity;", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class NewsfeedQuote {
    public static final int $stable = 0;

    public /* synthetic */ NewsfeedQuote(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NewsfeedQuote() {
    }

    /* compiled from: NewsfeedQuote.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/NewsfeedQuote$Equity;", "Lcom/robinhood/android/newsfeed/model/NewsfeedQuote;", "quote", "Lcom/robinhood/models/db/Quote;", "<init>", "(Lcom/robinhood/models/db/Quote;)V", "getQuote", "()Lcom/robinhood/models/db/Quote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Equity extends NewsfeedQuote {
        public static final int $stable = 8;
        private final Quote quote;

        public static /* synthetic */ Equity copy$default(Equity equity, Quote quote, int i, Object obj) {
            if ((i & 1) != 0) {
                quote = equity.quote;
            }
            return equity.copy(quote);
        }

        /* renamed from: component1, reason: from getter */
        public final Quote getQuote() {
            return this.quote;
        }

        public final Equity copy(Quote quote) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            return new Equity(quote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Equity) && Intrinsics.areEqual(this.quote, ((Equity) other).quote);
        }

        public int hashCode() {
            return this.quote.hashCode();
        }

        public String toString() {
            return "Equity(quote=" + this.quote + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Equity(Quote quote) {
            super(null);
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.quote = quote;
        }

        public final Quote getQuote() {
            return this.quote;
        }
    }

    /* compiled from: NewsfeedQuote.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/NewsfeedQuote$Crypto;", "Lcom/robinhood/android/newsfeed/model/NewsfeedQuote;", "quote", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "<init>", "(Lcom/robinhood/models/crypto/db/CryptoQuote;)V", "getQuote", "()Lcom/robinhood/models/crypto/db/CryptoQuote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Crypto extends NewsfeedQuote {
        public static final int $stable = 8;
        private final CryptoQuote quote;

        public static /* synthetic */ Crypto copy$default(Crypto crypto2, CryptoQuote cryptoQuote, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoQuote = crypto2.quote;
            }
            return crypto2.copy(cryptoQuote);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoQuote getQuote() {
            return this.quote;
        }

        public final Crypto copy(CryptoQuote quote) {
            Intrinsics.checkNotNullParameter(quote, "quote");
            return new Crypto(quote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Crypto) && Intrinsics.areEqual(this.quote, ((Crypto) other).quote);
        }

        public int hashCode() {
            return this.quote.hashCode();
        }

        public String toString() {
            return "Crypto(quote=" + this.quote + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Crypto(CryptoQuote quote) {
            super(null);
            Intrinsics.checkNotNullParameter(quote, "quote");
            this.quote = quote;
        }

        public final CryptoQuote getQuote() {
            return this.quote;
        }
    }
}
