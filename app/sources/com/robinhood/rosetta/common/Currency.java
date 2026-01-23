package com.robinhood.rosetta.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Currency.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/common/Currency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURRENCY_UNSPECIFIED", "CURRENCY_EMPTY", "USD", "GBP", "EUR", "SGD", "Companion", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Currency implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Currency[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Currency> ADAPTER;
    public static final Currency CURRENCY_EMPTY;
    public static final Currency CURRENCY_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Currency EUR;
    public static final Currency GBP;
    public static final Currency SGD;
    public static final Currency USD;
    private final int value;

    private static final /* synthetic */ Currency[] $values() {
        return new Currency[]{CURRENCY_UNSPECIFIED, CURRENCY_EMPTY, USD, GBP, EUR, SGD};
    }

    @JvmStatic
    public static final Currency fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Currency> getEntries() {
        return $ENTRIES;
    }

    private Currency(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Currency currency = new Currency("CURRENCY_UNSPECIFIED", 0, 0);
        CURRENCY_UNSPECIFIED = currency;
        CURRENCY_EMPTY = new Currency("CURRENCY_EMPTY", 1, 0);
        USD = new Currency("USD", 2, 1);
        GBP = new Currency("GBP", 3, 2);
        EUR = new Currency("EUR", 4, 3);
        SGD = new Currency("SGD", 5, 4);
        Currency[] currencyArr$values = $values();
        $VALUES = currencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(currencyArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Currency.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Currency>(orCreateKotlinClass, syntax, currency) { // from class: com.robinhood.rosetta.common.Currency$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Currency fromValue(int value) {
                return Currency.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Currency.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/common/Currency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/common/Currency;", "fromValue", "value", "", "rosetta.common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Currency fromValue(int value) {
            if (value == 0) {
                return Currency.CURRENCY_UNSPECIFIED;
            }
            if (value == 1) {
                return Currency.USD;
            }
            if (value == 2) {
                return Currency.GBP;
            }
            if (value == 3) {
                return Currency.EUR;
            }
            if (value != 4) {
                return null;
            }
            return Currency.SGD;
        }
    }

    public static Currency valueOf(String str) {
        return (Currency) Enum.valueOf(Currency.class, str);
    }

    public static Currency[] values() {
        return (Currency[]) $VALUES.clone();
    }
}
