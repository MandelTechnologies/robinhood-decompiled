package com.robinhood.android.lib.p166fx.provider;

import com.robinhood.prefs.IntPreference;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisplayCurrencyExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0002*\u00020\u0005\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007*\u00020\u0005¨\u0006\b"}, m3636d2 = {"toJavaCurrency", "Ljava/util/Currency;", "Lcom/robinhood/rosetta/common/Currency;", "Lcom/robinhood/shared/i18n/models/currency/DisplayCurrency;", "toRosettaCurrency", "Lcom/robinhood/prefs/IntPreference;", "displayCurrencyObservable", "Lio/reactivex/Observable;", "lib-fx-provider_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.fx.provider.DisplayCurrencyExtensionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class DisplayCurrencyExtensions {
    public static final Currency toJavaCurrency(com.robinhood.rosetta.common.Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        Currency currency2 = Currency.getInstance(currency.name());
        Intrinsics.checkNotNullExpressionValue(currency2, "getInstance(...)");
        return currency2;
    }

    public static final Currency toJavaCurrency(DisplayCurrency displayCurrency) {
        Intrinsics.checkNotNullParameter(displayCurrency, "<this>");
        Currency currency = Currency.getInstance(displayCurrency.getServerValue());
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return currency;
    }

    public static final com.robinhood.rosetta.common.Currency toRosettaCurrency(IntPreference intPreference) {
        Intrinsics.checkNotNullParameter(intPreference, "<this>");
        if (intPreference.isSet() && intPreference.get() != 0) {
            com.robinhood.rosetta.common.Currency currencyFromValue = com.robinhood.rosetta.common.Currency.INSTANCE.fromValue(intPreference.get());
            return currencyFromValue == null ? com.robinhood.rosetta.common.Currency.USD : currencyFromValue;
        }
        return com.robinhood.rosetta.common.Currency.USD;
    }

    public static final Observable<DisplayCurrency> displayCurrencyObservable(final IntPreference intPreference) {
        Intrinsics.checkNotNullParameter(intPreference, "<this>");
        Observable map = intPreference.getChanges().map(new Function() { // from class: com.robinhood.android.lib.fx.provider.DisplayCurrencyExtensionsKt.displayCurrencyObservable.1
            @Override // io.reactivex.functions.Function
            public final DisplayCurrency apply(Integer it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DisplayCurrency displayCurrencyFromServerValue = DisplayCurrency.INSTANCE.fromServerValue(DisplayCurrencyExtensions.toRosettaCurrency(intPreference).name());
                return displayCurrencyFromServerValue == null ? DisplayCurrency.USD : displayCurrencyFromServerValue;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
