package com.robinhood.android.marketdatadisclosure;

import com.robinhood.android.lib.formats.Formats;
import java.math.BigDecimal;
import kotlin.Metadata;

/* compiled from: MarketDataDisclosureStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0001¨\u0006\u0004"}, m3636d2 = {"formatPriceOrLoading", "", "Ljava/math/BigDecimal;", "formatIntOrLoading", "lib-market-data-disclosure_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureStateProviderKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarketDataDisclosureStateProvider2 {
    public static final String formatPriceOrLoading(BigDecimal bigDecimal) {
        String str;
        return (bigDecimal == null || (str = Formats.getPriceFormat().format(bigDecimal)) == null) ? "-" : str;
    }

    public static final String formatIntOrLoading(BigDecimal bigDecimal) {
        String str;
        return (bigDecimal == null || (str = Formats.getIntegerFormat().format(bigDecimal)) == null) ? "-" : str;
    }
}
