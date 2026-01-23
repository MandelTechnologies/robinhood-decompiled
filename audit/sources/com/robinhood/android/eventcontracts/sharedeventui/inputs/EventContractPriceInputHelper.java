package com.robinhood.android.eventcontracts.sharedeventui.inputs;

import android.view.KeyEvent;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputHelper;
import com.robinhood.shared.common.lib.formats.currency.CurrencyInputInfo;
import com.robinhood.utils.extensions.KeyEvents2;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: EventContractPriceInputHelper.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/sharedeventui/inputs/EventContractPriceInputHelper;", "Lcom/robinhood/shared/common/lib/formats/currency/CurrencyInputHelper;", "<init>", "()V", "processKeyEvent", "Lkotlin/Pair;", "", "Ljava/math/BigDecimal;", "keyEvent", "Landroid/view/KeyEvent;", "oldString", "isSpaced", "", "showCurrencySymbol", "forceCurrencyFormatter", "allowEmpty", "lib-shared-event-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class EventContractPriceInputHelper extends CurrencyInputHelper {
    public static final EventContractPriceInputHelper INSTANCE = new EventContractPriceInputHelper();
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    private EventContractPriceInputHelper() {
        String symbol = Currencies.USD.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        super(new CurrencyInputInfo(symbol, 2, true, true), CurrencyFormatterLocale.C33329US.INSTANCE.getNumpadLocale());
    }

    @Override // com.robinhood.shared.common.lib.formats.currency.CurrencyInputHelper
    public Tuples2<String, BigDecimal> processKeyEvent(KeyEvent keyEvent, String oldString, boolean isSpaced, boolean showCurrencySymbol, boolean forceCurrencyFormatter, boolean allowEmpty) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(oldString, "oldString");
        if (oldString.length() == 0 && KeyEvents2.isDigit(keyEvent)) {
            oldString = "0" + Locales2.getMonetaryDecimalSeparator(getLocale());
        }
        Tuples2<String, BigDecimal> tuples2ProcessKeyEvent = super.processKeyEvent(keyEvent, oldString, isSpaced, showCurrencySymbol, forceCurrencyFormatter, allowEmpty);
        String strComponent1 = tuples2ProcessKeyEvent.component1();
        BigDecimal bigDecimalComponent2 = tuples2ProcessKeyEvent.component2();
        if (StringsKt.indexOf$default((CharSequence) strComponent1, Locales2.getMonetaryDecimalSeparator(getLocale()), 0, false, 6, (Object) null) < 0 || StringsKt.indexOf$default((CharSequence) strComponent1, Locales2.getMonetaryDecimalSeparator(getLocale()), 0, false, 6, (Object) null) == strComponent1.length() - 1) {
            return Tuples4.m3642to("", BigDecimal.ZERO);
        }
        return Tuples4.m3642to(strComponent1, bigDecimalComponent2);
    }
}
