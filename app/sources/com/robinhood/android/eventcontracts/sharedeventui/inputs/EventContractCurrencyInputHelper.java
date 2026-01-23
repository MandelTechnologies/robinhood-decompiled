package com.robinhood.android.eventcontracts.sharedeventui.inputs;

import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputHelper;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputInfo;
import com.robinhood.utils.money.Currencies;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventContractCurrencyInputHelper.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/inputs/EventContractCurrencyInputHelper;", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "<init>", "()V", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventContractCurrencyInputHelper extends CurrencyInputHelper {
    public static final EventContractCurrencyInputHelper INSTANCE = new EventContractCurrencyInputHelper();
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    private EventContractCurrencyInputHelper() {
        String symbol = Currencies.USD.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        super(new CurrencyInputInfo(symbol, 2, true, true), CurrencyFormatterLocale.C33329US.INSTANCE.getNumpadLocale());
    }
}
