package com.robinhood.rosetta.converters.brokerage;

import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Security;
import com.robinhood.rosetta.common.Currency;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Money;
import com.robinhood.utils.money.Currencies;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Securities.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0003*\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004\u001a\u000e\u0010\u0000\u001a\u00060\u0005j\u0002`\u0006*\u00020\u0007\u001a\n\u0010\u0000\u001a\u00020\b*\u00020\t\u001a\n\u0010\u0000\u001a\u00020\n*\u00020\u000b¨\u0006\f"}, m3636d2 = {"toProtobuf", "", "Ljava/math/BigDecimal;", "", "(Ljava/lang/Integer;)I", "Lcom/robinhood/rosetta/eventlogging/Money;", "Lcom/robinhood/rosetta/eventlogging/EventMoney;", "Lcom/robinhood/models/util/Money;", "Lcom/robinhood/rosetta/common/Currency;", "Ljava/util/Currency;", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "Lcom/robinhood/models/db/Security;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.brokerage.SecuritiesKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Securities {
    public static final String toProtobuf(BigDecimal bigDecimal) {
        String plainString;
        return (bigDecimal == null || (plainString = bigDecimal.toPlainString()) == null) ? "" : plainString;
    }

    public static final int toProtobuf(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final Money toProtobuf(com.robinhood.models.util.Money money) {
        Intrinsics.checkNotNullParameter(money, "<this>");
        return new Money(toProtobuf(money.getDecimalValue()), toProtobuf(money.getCurrency()), toProtobuf(money.getCurrency()), null, 8, null);
    }

    public static final Currency toProtobuf(java.util.Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "<this>");
        String currencyCode = currency.getCurrencyCode();
        return Intrinsics.areEqual(currencyCode, Currencies.USD.getCurrencyCode()) ? Currency.USD : Intrinsics.areEqual(currencyCode, Currencies.GBP.getCurrencyCode()) ? Currency.GBP : Currency.CURRENCY_UNSPECIFIED;
    }

    public static final Asset.AssetType toProtobuf(Security security) {
        Intrinsics.checkNotNullParameter(security, "<this>");
        return security instanceof Instrument ? Asset.AssetType.INSTRUMENT : security instanceof UiCurrencyPair ? Asset.AssetType.CURRENCY_PAIR : Asset.AssetType.ASSET_TYPE_UNSPECIFIED;
    }
}
