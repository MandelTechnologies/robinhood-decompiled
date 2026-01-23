package com.robinhood.android.crypto.tab.util;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.newsfeed.C20334R;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.android.newsfeed.model.RelatedInstrument;
import com.robinhood.models.p320db.Quote;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoNewsArticle.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u0012*\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÂ\u0003J+\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/util/CryptoNewsArticle;", "", "article", "Lcom/robinhood/android/newsfeed/model/Content$Article;", "firstRelatedInstrumentQuote", "Lcom/robinhood/models/db/Quote;", "secondRelatedInstrumentQuote", "<init>", "(Lcom/robinhood/android/newsfeed/model/Content$Article;Lcom/robinhood/models/db/Quote;Lcom/robinhood/models/db/Quote;)V", "getArticle", "()Lcom/robinhood/android/newsfeed/model/Content$Article;", "firstFormattedQuote", "Lcom/robinhood/utils/resource/StringResource;", "getFirstFormattedQuote", "()Lcom/robinhood/utils/resource/StringResource;", "secondFormattedQuote", "getSecondFormattedQuote", "isFirstQuotePositive", "", "()Z", "isSecondQuotePositive", "isDirectionPositive", "formatQuote", "quote", "instrument", "Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoNewsArticle {
    public static final int $stable = 8;
    private final Content.Article article;
    private final StringResource firstFormattedQuote;
    private final Quote firstRelatedInstrumentQuote;
    private final boolean isFirstQuotePositive;
    private final boolean isSecondQuotePositive;
    private final StringResource secondFormattedQuote;
    private final Quote secondRelatedInstrumentQuote;

    /* renamed from: component2, reason: from getter */
    private final Quote getFirstRelatedInstrumentQuote() {
        return this.firstRelatedInstrumentQuote;
    }

    /* renamed from: component3, reason: from getter */
    private final Quote getSecondRelatedInstrumentQuote() {
        return this.secondRelatedInstrumentQuote;
    }

    public static /* synthetic */ CryptoNewsArticle copy$default(CryptoNewsArticle cryptoNewsArticle, Content.Article article, Quote quote, Quote quote2, int i, Object obj) {
        if ((i & 1) != 0) {
            article = cryptoNewsArticle.article;
        }
        if ((i & 2) != 0) {
            quote = cryptoNewsArticle.firstRelatedInstrumentQuote;
        }
        if ((i & 4) != 0) {
            quote2 = cryptoNewsArticle.secondRelatedInstrumentQuote;
        }
        return cryptoNewsArticle.copy(article, quote, quote2);
    }

    /* renamed from: component1, reason: from getter */
    public final Content.Article getArticle() {
        return this.article;
    }

    public final CryptoNewsArticle copy(Content.Article article, Quote firstRelatedInstrumentQuote, Quote secondRelatedInstrumentQuote) {
        Intrinsics.checkNotNullParameter(article, "article");
        return new CryptoNewsArticle(article, firstRelatedInstrumentQuote, secondRelatedInstrumentQuote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoNewsArticle)) {
            return false;
        }
        CryptoNewsArticle cryptoNewsArticle = (CryptoNewsArticle) other;
        return Intrinsics.areEqual(this.article, cryptoNewsArticle.article) && Intrinsics.areEqual(this.firstRelatedInstrumentQuote, cryptoNewsArticle.firstRelatedInstrumentQuote) && Intrinsics.areEqual(this.secondRelatedInstrumentQuote, cryptoNewsArticle.secondRelatedInstrumentQuote);
    }

    public int hashCode() {
        int iHashCode = this.article.hashCode() * 31;
        Quote quote = this.firstRelatedInstrumentQuote;
        int iHashCode2 = (iHashCode + (quote == null ? 0 : quote.hashCode())) * 31;
        Quote quote2 = this.secondRelatedInstrumentQuote;
        return iHashCode2 + (quote2 != null ? quote2.hashCode() : 0);
    }

    public String toString() {
        return "CryptoNewsArticle(article=" + this.article + ", firstRelatedInstrumentQuote=" + this.firstRelatedInstrumentQuote + ", secondRelatedInstrumentQuote=" + this.secondRelatedInstrumentQuote + ")";
    }

    public CryptoNewsArticle(Content.Article article, Quote quote, Quote quote2) {
        Intrinsics.checkNotNullParameter(article, "article");
        this.article = article;
        this.firstRelatedInstrumentQuote = quote;
        this.secondRelatedInstrumentQuote = quote2;
        this.firstFormattedQuote = formatQuote(quote, article.getFirstInstrument());
        this.secondFormattedQuote = formatQuote(quote2, article.getSecondInstrument());
        this.isFirstQuotePositive = isDirectionPositive(quote);
        this.isSecondQuotePositive = isDirectionPositive(quote2);
    }

    public final Content.Article getArticle() {
        return this.article;
    }

    public final StringResource getFirstFormattedQuote() {
        return this.firstFormattedQuote;
    }

    public final StringResource getSecondFormattedQuote() {
        return this.secondFormattedQuote;
    }

    /* renamed from: isFirstQuotePositive, reason: from getter */
    public final boolean getIsFirstQuotePositive() {
        return this.isFirstQuotePositive;
    }

    /* renamed from: isSecondQuotePositive, reason: from getter */
    public final boolean getIsSecondQuotePositive() {
        return this.isSecondQuotePositive;
    }

    private final boolean isDirectionPositive(Quote quote) {
        return quote == null || quote.getTodaysPercentChange().compareTo(BigDecimal.ZERO) >= 0;
    }

    private final StringResource formatQuote(Quote quote, RelatedInstrument instrument) {
        if (quote == null || instrument == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(C20334R.string.news_feed_related_instrument_display_text, instrument.getSymbol(), Formats.getPercentDeltaFormat().format(quote.getTodaysPercentChange()));
    }
}
