package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.util.Money;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Util.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u000eH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"RECEIPT_SHEET_HEIGHT_RATIO", "", "ARROW_ANIMATION_DURATION_MS", "", "BANNER_INITIAL_TRANSLATION_X", "BANNER_SLIDE_DURATION_MILLIS", "", "toDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "Ljava/util/Currency;", "isPlural", "", "formatWithCurrencyCode", "", "Lcom/robinhood/models/util/Money;", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UtilKt {
    public static final long ARROW_ANIMATION_DURATION_MS = 1750;
    public static final float BANNER_INITIAL_TRANSLATION_X = -1500.0f;
    public static final int BANNER_SLIDE_DURATION_MILLIS = 400;
    public static final float RECEIPT_SHEET_HEIGHT_RATIO = 0.725f;

    public static final StringResource toDisplayName(Currency currency, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        int i = z ? 2 : 1;
        if (Intrinsics.areEqual(currency, Currencies.USD)) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C21775R.plurals.usd_display_name, i), new Object[0]);
        }
        if (Intrinsics.areEqual(currency, Currencies.SGD)) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C21775R.plurals.sgd_display_name, i), new Object[0]);
        }
        if (Intrinsics.areEqual(currency, Currencies.GBP)) {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C21775R.plurals.gbp_display_name, i), new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        String currencyCode = currency.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        return companion.invoke(currencyCode);
    }

    public static final String formatWithCurrencyCode(Money money) {
        Intrinsics.checkNotNullParameter(money, "<this>");
        return Money.format$default(money, null, false, null, false, 2, 2, false, null, false, false, 967, null) + PlaceholderUtils.XXShortPlaceholderText + money.getCurrency().getCurrencyCode();
    }
}
