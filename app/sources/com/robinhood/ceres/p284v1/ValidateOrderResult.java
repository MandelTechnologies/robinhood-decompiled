package com.robinhood.ceres.p284v1;

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
/* compiled from: ValidateOrderResult.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResult;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VALIDATE_ORDER_RESULT_UNSPECIFIED", "VALIDATE_ORDER_RESULT_SUCCESS", "VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP", "VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE", "VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY", "VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK", "VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE", "VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY", "VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY", "VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER", "VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY", "VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO", "VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO", "VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION", "VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY", "VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS", "VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD", "VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION", "VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE", "VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS", "VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE", "VALIDATE_ORDER_RESULT_FAILURE_OTHER", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ValidateOrderResult implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ValidateOrderResult[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ValidateOrderResult> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_OTHER;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_SUCCESS;
    public static final ValidateOrderResult VALIDATE_ORDER_RESULT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ ValidateOrderResult[] $values() {
        return new ValidateOrderResult[]{VALIDATE_ORDER_RESULT_UNSPECIFIED, VALIDATE_ORDER_RESULT_SUCCESS, VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP, VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE, VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY, VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK, VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE, VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY, VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY, VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER, VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY, VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO, VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO, VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION, VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY, VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS, VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD, VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION, VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE, VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS, VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE, VALIDATE_ORDER_RESULT_FAILURE_OTHER};
    }

    @JvmStatic
    public static final ValidateOrderResult fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ValidateOrderResult> getEntries() {
        return $ENTRIES;
    }

    private ValidateOrderResult(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ValidateOrderResult validateOrderResult = new ValidateOrderResult("VALIDATE_ORDER_RESULT_UNSPECIFIED", 0, 0);
        VALIDATE_ORDER_RESULT_UNSPECIFIED = validateOrderResult;
        VALIDATE_ORDER_RESULT_SUCCESS = new ValidateOrderResult("VALIDATE_ORDER_RESULT_SUCCESS", 1, 1);
        VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP", 2, 2);
        VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE", 3, 12);
        VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY", 4, 3);
        VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK", 5, 4);
        VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE", 6, 5);
        VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY", 7, 6);
        VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY", 8, 7);
        VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER", 9, 8);
        VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY", 10, 9);
        VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO", 11, 10);
        VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO", 12, 11);
        VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION", 13, 13);
        VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY", 14, 14);
        VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS", 15, 16);
        VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD", 16, 17);
        VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION", 17, 18);
        VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE", 18, 19);
        VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS", 19, 20);
        VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE", 20, 21);
        VALIDATE_ORDER_RESULT_FAILURE_OTHER = new ValidateOrderResult("VALIDATE_ORDER_RESULT_FAILURE_OTHER", 21, 15);
        ValidateOrderResult[] validateOrderResultArr$values = $values();
        $VALUES = validateOrderResultArr$values;
        $ENTRIES = EnumEntries2.enumEntries(validateOrderResultArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ValidateOrderResult.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ValidateOrderResult>(orCreateKotlinClass, syntax, validateOrderResult) { // from class: com.robinhood.ceres.v1.ValidateOrderResult$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ValidateOrderResult fromValue(int value) {
                return ValidateOrderResult.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ValidateOrderResult.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResult$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/ValidateOrderResult;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ValidateOrderResult fromValue(int value) {
            switch (value) {
                case 0:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED;
                case 1:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_SUCCESS;
                case 2:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP;
                case 3:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY;
                case 4:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK;
                case 5:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE;
                case 6:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY;
                case 7:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY;
                case 8:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER;
                case 9:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY;
                case 10:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO;
                case 11:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO;
                case 12:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE;
                case 13:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION;
                case 14:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY;
                case 15:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_OTHER;
                case 16:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS;
                case 17:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD;
                case 18:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION;
                case 19:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE;
                case 20:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS;
                case 21:
                    return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE;
                default:
                    return null;
            }
        }
    }

    public static ValidateOrderResult valueOf(String str) {
        return (ValidateOrderResult) Enum.valueOf(ValidateOrderResult.class, str);
    }

    public static ValidateOrderResult[] values() {
        return (ValidateOrderResult[]) $VALUES.clone();
    }
}
