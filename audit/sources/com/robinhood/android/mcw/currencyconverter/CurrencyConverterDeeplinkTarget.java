package com.robinhood.android.mcw.currencyconverter;

import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.mcw.contracts.CurrencyConversionDeeplinkSource;
import com.robinhood.android.mcw.contracts.CurrencyConverterKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.McwRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.experiments.ExperimentDeclaration;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CurrencyConverterDeeplinkTarget.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/mcw/currencyconverter/CurrencyConverterDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-mcw-currency-converter_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CurrencyConverterDeeplinkTarget extends DeeplinkTarget4 {
    public static final CurrencyConverterDeeplinkTarget INSTANCE = new CurrencyConverterDeeplinkTarget();
    public static final int $stable = 8;

    private CurrencyConverterDeeplinkTarget() {
        super("convert_currency", (RegionGate) McwRegionGate.INSTANCE, (ExperimentDeclaration) null, false, false, 28, (DefaultConstructorMarker) null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("account_number");
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("direction");
        Tuples2<Currency, Currency> direction = queryParameter2 != null ? CurrencyConverterDeeplinkTarget2.parseDirection(queryParameter2) : null;
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("amount_from");
        BigDecimal bigDecimalOrNull = queryParameter3 != null ? StringsKt.toBigDecimalOrNull(queryParameter3) : null;
        String queryParameter4 = deeplinkContext.getUri().getQueryParameter("amount_to");
        BigDecimal bigDecimalOrNull2 = queryParameter4 != null ? StringsKt.toBigDecimalOrNull(queryParameter4) : null;
        String queryParameter5 = deeplinkContext.getUri().getQueryParameter("use_achromatic_theme");
        return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new CurrencyConverterKey(queryParameter, direction, bigDecimalOrNull, bigDecimalOrNull2, queryParameter5 != null ? Boolean.parseBoolean(queryParameter5) : true, false, CurrencyConversionDeeplinkSource.INSTANCE.fromQueryParam(deeplinkContext.getUri().getQueryParameter("source")), 32, null), null, false, 12, null)};
    }
}
