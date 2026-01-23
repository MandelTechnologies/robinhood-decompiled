package com.robinhood.android.margin.p174ui.limit;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.margin.C20999R;
import com.robinhood.android.margin.p174ui.limit.MarginLimitStateProvider3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MarginLimitStateProvider.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J0\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitDataState;", "Lcom/robinhood/android/margin/ui/limit/MarginLimitViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "getAvailableMarginText", "Lcom/robinhood/utils/resource/StringResource;", "hasNegativeBuyingPower", "", "availableMarginLimit", "Lcom/robinhood/models/util/Money;", "getValidation", "Lcom/robinhood/android/margin/ui/limit/MarginLimitValidation;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "newMarginLimit", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MarginLimitStateProvider implements StateProvider<MarginLimitDataState, MarginLimitViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public MarginLimitStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public MarginLimitViewState reduce(MarginLimitDataState dataState) throws Resources.NotFoundException {
        int i;
        int i2;
        int i3;
        String inputChars;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MarginLimitStateProvider3 validation = getValidation(dataState.getHasNegativeBuyingPower(), dataState.getUnifiedBalances(), dataState.getNewMarginLimit(), dataState.getAvailableMarginLimit());
        boolean z = dataState.getHasNegativeBuyingPower() || !(validation == null || Intrinsics.areEqual(validation, MarginLimitStateProvider3.ViewAccountDeficit.INSTANCE));
        if (dataState.getHasNegativeBuyingPower()) {
            i = C20999R.string.margin_limit_account_deficit_error;
        } else {
            i = dataState.getHasUserSetMarginLimit() ? C20999R.string.margin_limit_title_change : C20999R.string.margin_limit_title;
        }
        int i4 = i;
        if (dataState.getHasNegativeBuyingPower() && dataState.getHasUserSetMarginLimit()) {
            i2 = C20999R.string.margin_limit_description_negative_buying_power;
        } else {
            i2 = dataState.getHasNegativeBuyingPower() ? C20999R.string.no_margin_limit_description_negative_buying_power : C20999R.string.margin_limit_description_positive_buying_power;
        }
        int i5 = i2;
        if (dataState.getHasNegativeBuyingPower()) {
            i3 = C20999R.string.margin_limit_view_account_deficit_cta;
        } else {
            i3 = C20999R.string.set_margin_limit_cta;
        }
        int i6 = i3;
        BigDecimal prefillMarginLimit = dataState.getPrefillMarginLimit();
        if (prefillMarginLimit == null) {
            prefillMarginLimit = BigDecimal.ZERO;
        }
        BigDecimal userInputAmount = dataState.getAnimateInput() ? dataState.getUserInputAmount() : prefillMarginLimit;
        Intrinsics.checkNotNull(userInputAmount);
        String strConvertMoney = MarginLimitStateProvider2.convertMoney(userInputAmount, dataState.getFxQuote(), this.resources);
        if (dataState.getAnimateInput()) {
            inputChars = dataState.getInputChars();
        } else {
            NumberFormatter currencyFormatNoDecimals = Formats.getCurrencyFormatNoDecimals();
            Intrinsics.checkNotNull(prefillMarginLimit);
            inputChars = currencyFormatNoDecimals.format(prefillMarginLimit);
        }
        return new MarginLimitViewState(z, !dataState.getHasNegativeBuyingPower(), i4, i5, i6, !dataState.getHasNegativeBuyingPower() && dataState.getHasUserSetMarginLimit(), !dataState.getHasNegativeBuyingPower(), getAvailableMarginText(dataState.getHasNegativeBuyingPower(), dataState.getAvailableMarginLimit()), validation, new MarginLimitInputData(inputChars, strConvertMoney, dataState.getAnimateInput(), dataState.getShowFxBlueberry()));
    }

    private final StringResource getAvailableMarginText(boolean hasNegativeBuyingPower, Money availableMarginLimit) {
        if (hasNegativeBuyingPower) {
            return StringResource.INSTANCE.invoke(C20999R.string.margin_limit_account_deficit_error, new Object[0]);
        }
        if (availableMarginLimit == null) {
            return null;
        }
        BigDecimal decimalValue = availableMarginLimit.getDecimalValue();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        BigDecimal bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(decimalValue, ZERO);
        StringResource.Companion companion = StringResource.INSTANCE;
        int i = C20999R.string.margin_limit_total_margin_available;
        Intrinsics.checkNotNull(bigDecimal);
        return companion.invoke(i, Money.format$default(Money.copy$default(availableMarginLimit, null, bigDecimal, 1, null), null, false, null, false, 0, null, false, null, false, false, 1023, null));
    }

    private final MarginLimitStateProvider3 getValidation(boolean hasNegativeBuyingPower, UnifiedBalances unifiedBalances, Money newMarginLimit, Money availableMarginLimit) {
        BigDecimal goldUsed;
        Money money;
        if (hasNegativeBuyingPower) {
            return MarginLimitStateProvider3.ViewAccountDeficit.INSTANCE;
        }
        if (unifiedBalances == null || (goldUsed = unifiedBalances.getGoldUsed()) == null || (money = Money3.toMoney(goldUsed, Currencies.USD)) == null || newMarginLimit == null || availableMarginLimit == null) {
            return null;
        }
        if (newMarginLimit.isZero() || newMarginLimit.isNegative()) {
            return MarginLimitStateProvider3.ZeroMarginLimit.INSTANCE;
        }
        if (money.compareTo(newMarginLimit) > 0) {
            return new MarginLimitStateProvider3.BelowCurrentMarginUse(money);
        }
        if (newMarginLimit.compareTo(Money.copy$default(availableMarginLimit, null, BigDecimals7.setCurrencyScale(availableMarginLimit.getDecimalValue()), 1, null)) > 0) {
            return MarginLimitStateProvider3.AboveGoldBuyingPower.INSTANCE;
        }
        return new MarginLimitStateProvider3.Valid(newMarginLimit);
    }
}
