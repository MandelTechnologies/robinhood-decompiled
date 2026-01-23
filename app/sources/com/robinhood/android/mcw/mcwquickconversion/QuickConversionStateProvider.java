package com.robinhood.android.mcw.mcwquickconversion;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.store.mcw.data.ConversionFxRate;
import com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionDataState;
import com.robinhood.android.mcw.mcwquickconversion.models.QuickConversionViewState;
import com.robinhood.android.mcw.mcwquickconversion.models.SecondaryCtaAction;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.serverdriven.p347db.OrderCheckCta;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: QuickConversionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcw/mcwquickconversion/QuickConversionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/mcw/mcwquickconversion/models/QuickConversionDataState;", "Lcom/robinhood/android/mcw/mcwquickconversion/models/QuickConversionViewState;", "<init>", "()V", "reduce", "dataState", "feature-lib-mcw-quick-conversion_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class QuickConversionStateProvider implements StateProvider<QuickConversionDataState, QuickConversionViewState> {
    public static final int $stable = 0;

    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    @Override // com.robinhood.android.udf.StateProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QuickConversionViewState reduce(QuickConversionDataState dataState) {
        BigDecimal bidPrice;
        String str;
        String str2;
        String str3;
        SecondaryCtaAction orderCheck;
        StringResource stringResourceInvoke;
        BigDecimal feePercent;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.m16531getFxRatexLWZpok() == null || dataState.isFxFeeEnabled() == null) {
            return QuickConversionViewState.Loading.INSTANCE;
        }
        Object value = dataState.m16531getFxRatexLWZpok().getValue();
        String strReplace$default = null;
        if (Result.m28555isFailureimpl(value)) {
            value = null;
        }
        ConversionFxRate conversionFxRate = (ConversionFxRate) value;
        if (conversionFxRate == null || (bidPrice = conversionFxRate.getBidPrice()) == null || bidPrice.compareTo(BigDecimal.ZERO) <= 0) {
            bidPrice = null;
        }
        if (bidPrice != null) {
            BigDecimal bigDecimalDivide = dataState.getKey().getAmountNeeded().getDecimalValue().divide(bidPrice, 2, RoundingMode.HALF_UP);
            Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
            str = Money.format$default(Money3.toMoney(bigDecimalDivide, dataState.getKey().getSourceCurrency()), null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
        } else {
            str = null;
        }
        String str4 = Money.format$default(dataState.getKey().getCurrentBuyingPower(), null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
        String str5 = Money.format$default(dataState.getKey().getAmountNeeded().plus(dataState.getKey().getCurrentBuyingPower()), null, false, null, false, 2, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null);
        if (bidPrice != null) {
            str2 = "1 " + dataState.getKey().getSourceCurrency().getCurrencyCode() + " = " + bidPrice + PlaceholderUtils.XXShortPlaceholderText + dataState.getKey().getAmountNeeded().getCurrency().getCurrencyCode();
        } else {
            str2 = null;
        }
        Object value2 = dataState.m16531getFxRatexLWZpok().getValue();
        if (Result.m28555isFailureimpl(value2)) {
            value2 = null;
        }
        ConversionFxRate conversionFxRate2 = (ConversionFxRate) value2;
        if (conversionFxRate2 == null || (feePercent = conversionFxRate2.getFeePercent()) == null) {
            str3 = null;
        } else {
            BigDecimal bigDecimalDivide2 = feePercent.divide(new BigDecimal("100"), 4, RoundingMode.HALF_UP);
            NumberFormatter percentFormat = FormatsLocalized.getPercentFormat();
            Intrinsics.checkNotNull(bigDecimalDivide2);
            String str6 = percentFormat.format(bigDecimalDivide2);
            if (str6 != null && dataState.isFxFeeEnabled().booleanValue()) {
                str3 = str6;
            }
        }
        OrderCheckCta secondaryCta = dataState.getKey().getSecondaryCta();
        if (secondaryCta != null) {
            orderCheck = new SecondaryCtaAction.OrderCheck(secondaryCta.getAction());
        } else {
            orderCheck = SecondaryCtaAction.EditAmount.INSTANCE;
        }
        SecondaryCtaAction secondaryCtaAction = orderCheck;
        OrderCheckCta secondaryCta2 = dataState.getKey().getSecondaryCta();
        if (secondaryCta2 == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(secondaryCta2.getTitle())) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C21790R.string.edit_amount_cta, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke;
        String strReplace$default2 = StringsKt.replace$default(dataState.getKey().getTitle(), dataState.getKey().getPlaceholder(), str == null ? "" : str, false, 4, (Object) null);
        String message = dataState.getKey().getMessage();
        if (message != null) {
            strReplace$default = StringsKt.replace$default(message, dataState.getKey().getPlaceholder(), str == null ? "" : str, false, 4, (Object) null);
        }
        return new QuickConversionViewState.Loaded(strReplace$default2, strReplace$default, str, str4, str5, str2, str3, dataState.getConversionInProgress(), secondaryCtaAction, stringResource);
    }
}
