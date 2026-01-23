package com.robinhood.utils.money;

import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Currencies.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/money/Currencies;", "", "<init>", "()V", "USD", "Ljava/util/Currency;", "GBP", "EUR", "JPY", "SGD", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Currencies {

    @JvmField
    public static final Currency EUR;

    @JvmField
    public static final Currency GBP;
    public static final Currencies INSTANCE = new Currencies();

    @JvmField
    public static final Currency JPY;

    @JvmField
    public static final Currency SGD;

    @JvmField
    public static final Currency USD;

    private Currencies() {
    }

    static {
        Currency currency = Currency.getInstance("USD");
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        USD = currency;
        Currency currency2 = Currency.getInstance("GBP");
        Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
        GBP = currency2;
        Currency currency3 = Currency.getInstance("EUR");
        Intrinsics.checkNotNullExpressionValue(currency3, "getInstance(...)");
        EUR = currency3;
        Currency currency4 = Currency.getInstance("JPY");
        Intrinsics.checkNotNullExpressionValue(currency4, "getInstance(...)");
        JPY = currency4;
        Currency currency5 = Currency.getInstance("SGD");
        Intrinsics.checkNotNullExpressionValue(currency5, "getInstance(...)");
        SGD = currency5;
    }
}
