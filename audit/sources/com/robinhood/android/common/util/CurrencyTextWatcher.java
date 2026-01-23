package com.robinhood.android.common.util;

import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyTextWatcher.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/util/CurrencyTextWatcher;", "Lcom/robinhood/android/common/util/DecimalLimitTextWatcher;", "currency", "Ljava/util/Currency;", "<init>", "(Ljava/util/Currency;)V", "getAllowedScale", "", "input", "Ljava/math/BigDecimal;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CurrencyTextWatcher extends DecimalLimitTextWatcher {
    public static final int $stable = 8;
    private final Currency currency;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyTextWatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ CurrencyTextWatcher(Currency currency, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Currencies.USD : currency);
    }

    public CurrencyTextWatcher(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
    }

    @Override // com.robinhood.android.common.util.DecimalLimitTextWatcher
    public int getAllowedScale(BigDecimal input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.currency.getDefaultFractionDigits();
    }
}
