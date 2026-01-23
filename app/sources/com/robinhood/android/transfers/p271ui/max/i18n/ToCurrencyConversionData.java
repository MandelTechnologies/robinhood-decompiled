package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.transfers.util.GetRate;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p325fx.api.ApiFxQuote;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.money.Currencies;
import java.math.RoundingMode;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ToCurrencyConversionData.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m3636d2 = {"toCurrencyConversionData", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$CurrencyConversionData;", "Lcom/robinhood/models/fx/api/ApiFxQuote;", "localCurrency", "Ljava/util/Currency;", "amount", "Lcom/robinhood/models/util/Money;", "direction", "Lcom/robinhood/models/db/TransferDirection;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.ToCurrencyConversionDataKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ToCurrencyConversionData {

    /* compiled from: ToCurrencyConversionData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.ToCurrencyConversionDataKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferDirection.values().length];
            try {
                iArr[TransferDirection.DEPOSIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferDirection.WITHDRAW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MAXTransferContext.CurrencyConversionData toCurrencyConversionData(ApiFxQuote apiFxQuote, Currency currency, Money amount, TransferDirection direction) {
        String string2;
        com.robinhood.rosetta.common.Currency currency2;
        Currency currency3;
        Intrinsics.checkNotNullParameter(apiFxQuote, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (amount.isPositive() && currency != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
            if (i == 1) {
                currency3 = Currencies.USD;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                currency3 = currency;
            }
            string2 = InternationalTransferCurrencyUtils.toTargetCurrency(currency, direction, amount, apiFxQuote, currency3).getDecimalValue().setScale(2, RoundingMode.HALF_EVEN).toString();
        } else {
            string2 = "";
        }
        String str = string2;
        Intrinsics.checkNotNull(str);
        if (currency != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
            if (i2 == 1) {
                currency2 = com.robinhood.rosetta.common.Currency.USD;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.areEqual(currency, Currencies.GBP)) {
                    currency2 = com.robinhood.rosetta.common.Currency.GBP;
                } else {
                    currency2 = Intrinsics.areEqual(currency, Currencies.SGD) ? com.robinhood.rosetta.common.Currency.SGD : com.robinhood.rosetta.common.Currency.CURRENCY_UNSPECIFIED;
                }
            }
            if (currency2 == null) {
            }
        } else {
            currency2 = com.robinhood.rosetta.common.Currency.CURRENCY_UNSPECIFIED;
        }
        com.robinhood.rosetta.common.Currency currency4 = currency2;
        String string3 = GetRate.getRate(apiFxQuote, direction).toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return new MAXTransferContext.CurrencyConversionData(str, currency4, string3, String.valueOf(apiFxQuote.getRateSetId()), null, 16, null);
    }
}
