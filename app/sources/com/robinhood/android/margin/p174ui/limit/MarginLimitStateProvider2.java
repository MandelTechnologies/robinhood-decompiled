package com.robinhood.android.margin.p174ui.limit;

import android.content.res.Resources;
import com.robinhood.android.margin.C20999R;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginLimitStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m3636d2 = {"convertMoney", "", "amount", "Ljava/math/BigDecimal;", "fxQuote", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "resources", "Landroid/content/res/Resources;", "feature-margin_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitStateProviderKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginLimitStateProvider2 {
    public static final String convertMoney(BigDecimal amount, ApiFxQuote apiFxQuote, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (apiFxQuote != null) {
            BigDecimal offerOutrightRate = apiFxQuote.getOfferOutrightRate();
            RoundingMode roundingMode = RoundingMode.HALF_EVEN;
            BigDecimal bigDecimalDivide = amount.divide(offerOutrightRate, roundingMode);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            BigDecimal scale = bigDecimalDivide.setScale(2, roundingMode);
            Currency currency = Currencies.GBP;
            Intrinsics.checkNotNull(scale);
            String string2 = resources.getString(C20999R.string.converted_fx_rate, Money.format$default(new Money(currency, scale), null, false, null, false, 0, null, false, null, false, false, 1023, null));
            if (string2 != null) {
                return string2;
            }
        }
        String string3 = resources.getString(C20999R.string.fx_rate_unavailable);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }
}
