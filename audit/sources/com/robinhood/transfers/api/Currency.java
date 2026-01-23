package com.robinhood.transfers.api;

import com.robinhood.enums.RhEnum;
import com.robinhood.utils.money.Currencies;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Currency.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/transfers/api/Currency;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UNKNOWN", "GBP", "SGD", "EUR", "USD", "moneyCurrency", "Ljava/util/Currency;", "getMoneyCurrency", "()Ljava/util/Currency;", "Companion", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class Currency implements RhEnum<Currency> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Currency[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final Currency UNKNOWN = new Currency("UNKNOWN", 0, "unknown");
    public static final Currency GBP = new Currency("GBP", 1, "gbp");
    public static final Currency SGD = new Currency("SGD", 2, "sgd");
    public static final Currency EUR = new Currency("EUR", 3, "eur");
    public static final Currency USD = new Currency("USD", 4, "usd");

    /* compiled from: Currency.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Currency.values().length];
            try {
                iArr[Currency.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Currency.GBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Currency.EUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Currency.USD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Currency.SGD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ Currency[] $values() {
        return new Currency[]{UNKNOWN, GBP, SGD, EUR, USD};
    }

    @JvmStatic
    public static Currency fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<Currency> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(Currency currency) {
        return INSTANCE.toServerValue(currency);
    }

    private Currency(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        Currency[] currencyArr$values = $values();
        $VALUES = currencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Currency.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/transfers/api/Currency$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/transfers/api/Currency;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<Currency> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(Currency.values(), Currency.UNKNOWN, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(Currency enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public Currency fromServerValue(String serverValue) {
            return (Currency) super.fromServerValue(serverValue);
        }
    }

    public final java.util.Currency getMoneyCurrency() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return Currencies.USD;
        }
        if (i == 2) {
            return Currencies.GBP;
        }
        if (i == 3) {
            return Currencies.EUR;
        }
        if (i == 4) {
            return Currencies.USD;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return Currencies.SGD;
    }

    public static Currency valueOf(String str) {
        return (Currency) Enum.valueOf(Currency.class, str);
    }

    public static Currency[] values() {
        return (Currency[]) $VALUES.clone();
    }
}
