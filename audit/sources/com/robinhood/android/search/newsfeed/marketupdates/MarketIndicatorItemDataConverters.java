package com.robinhood.android.search.newsfeed.marketupdates;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.market.updates.p332db.MarketIndicator;
import com.robinhood.models.util.Money;
import com.robinhood.utils.datetime.Durations;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: MarketIndicatorItemDataConverters.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0007¨\u0006\b"}, m3636d2 = {"toMarketIndicatorItemData", "Lcom/robinhood/android/search/newsfeed/marketupdates/MarketIndicatorItemData;", "Lcom/robinhood/models/market/updates/db/MarketIndicator;", AnnotatedPrivateKey.LABEL, "", "Lcom/robinhood/models/crypto/db/CryptoQuote;", "toDefaultMarketIndicatorItemData", "Lcom/robinhood/android/newsfeed/model/Content$MarketIndicator;", "feature-search_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.newsfeed.marketupdates.MarketIndicatorItemDataConvertersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MarketIndicatorItemDataConverters {
    public static final MarketIndicatorItemData toMarketIndicatorItemData(MarketIndicator marketIndicator, String label) {
        String value;
        Intrinsics.checkNotNullParameter(marketIndicator, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        NumberFormat numberInstance = NumberFormat.getNumberInstance(Locale.getDefault(Locale.Category.FORMAT));
        numberInstance.setMaximumFractionDigits(2);
        numberInstance.setMinimumFractionDigits(2);
        Double doubleOrNull = StringsKt.toDoubleOrNull(marketIndicator.getValue());
        if (doubleOrNull == null || (value = numberInstance.format(doubleOrNull.doubleValue())) == null) {
            value = marketIndicator.getValue();
        }
        return new MarketIndicatorItemData(marketIndicator.getKey(), label, value, marketIndicator.getPercentChange(), Durations.since(marketIndicator.getTimestamp()).compareTo(Durations.INSTANCE.getONE_MINUTE()) > 0);
    }

    public static final MarketIndicatorItemData toMarketIndicatorItemData(CryptoQuote cryptoQuote, String label) {
        Intrinsics.checkNotNullParameter(cryptoQuote, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        BigDecimal bigDecimalDiv = cryptoQuote.getMarkPrice().minus(cryptoQuote.getOpenPrice()).div(cryptoQuote.getOpenPrice());
        String string2 = cryptoQuote.getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String str = Money.format$default(cryptoQuote.getMarkPrice(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        NumberFormatter noSymbolWithHundredthDecimalPercentFormat = Formats.getNoSymbolWithHundredthDecimalPercentFormat();
        BigDecimal bigDecimalMultiply = bigDecimalDiv.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return new MarketIndicatorItemData(string2, label, str, noSymbolWithHundredthDecimalPercentFormat.format(bigDecimalMultiply), cryptoQuote.isStaleForUi());
    }

    public static final MarketIndicatorItemData toDefaultMarketIndicatorItemData(Content.MarketIndicator marketIndicator) {
        Intrinsics.checkNotNullParameter(marketIndicator, "<this>");
        return new MarketIndicatorItemData(marketIndicator.getIndicatorKey(), marketIndicator.getLabel(), "-", "-", true);
    }
}
