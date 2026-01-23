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
/* compiled from: FeeChargeEventType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeChargeEventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEE_CHARGE_EVENT_TYPE_UNSPECIFIED", "FUTURES_OUTRIGHTS_TRADE", "FUTURES_OOF_TRADE", "CASH_SETTLED_FUTURES_CONTRACT_EXPIRATION", "EVENT_CONTRACT_TRADE", "EVENT_CONTRACT_COMBO_TRADE", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class FeeChargeEventType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeeChargeEventType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeeChargeEventType> ADAPTER;
    public static final FeeChargeEventType CASH_SETTLED_FUTURES_CONTRACT_EXPIRATION;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeeChargeEventType EVENT_CONTRACT_COMBO_TRADE;
    public static final FeeChargeEventType EVENT_CONTRACT_TRADE;
    public static final FeeChargeEventType FEE_CHARGE_EVENT_TYPE_UNSPECIFIED;
    public static final FeeChargeEventType FUTURES_OOF_TRADE;
    public static final FeeChargeEventType FUTURES_OUTRIGHTS_TRADE;
    private final int value;

    private static final /* synthetic */ FeeChargeEventType[] $values() {
        return new FeeChargeEventType[]{FEE_CHARGE_EVENT_TYPE_UNSPECIFIED, FUTURES_OUTRIGHTS_TRADE, FUTURES_OOF_TRADE, CASH_SETTLED_FUTURES_CONTRACT_EXPIRATION, EVENT_CONTRACT_TRADE, EVENT_CONTRACT_COMBO_TRADE};
    }

    @JvmStatic
    public static final FeeChargeEventType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeeChargeEventType> getEntries() {
        return $ENTRIES;
    }

    private FeeChargeEventType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeeChargeEventType feeChargeEventType = new FeeChargeEventType("FEE_CHARGE_EVENT_TYPE_UNSPECIFIED", 0, 0);
        FEE_CHARGE_EVENT_TYPE_UNSPECIFIED = feeChargeEventType;
        FUTURES_OUTRIGHTS_TRADE = new FeeChargeEventType("FUTURES_OUTRIGHTS_TRADE", 1, 1);
        FUTURES_OOF_TRADE = new FeeChargeEventType("FUTURES_OOF_TRADE", 2, 2);
        CASH_SETTLED_FUTURES_CONTRACT_EXPIRATION = new FeeChargeEventType("CASH_SETTLED_FUTURES_CONTRACT_EXPIRATION", 3, 3);
        EVENT_CONTRACT_TRADE = new FeeChargeEventType("EVENT_CONTRACT_TRADE", 4, 4);
        EVENT_CONTRACT_COMBO_TRADE = new FeeChargeEventType("EVENT_CONTRACT_COMBO_TRADE", 5, 5);
        FeeChargeEventType[] feeChargeEventTypeArr$values = $values();
        $VALUES = feeChargeEventTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feeChargeEventTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeChargeEventType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeeChargeEventType>(orCreateKotlinClass, syntax, feeChargeEventType) { // from class: com.robinhood.ceres.v1.FeeChargeEventType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeeChargeEventType fromValue(int value) {
                return FeeChargeEventType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeeChargeEventType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/FeeChargeEventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/FeeChargeEventType;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeeChargeEventType fromValue(int value) {
            if (value == 0) {
                return FeeChargeEventType.FEE_CHARGE_EVENT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return FeeChargeEventType.FUTURES_OUTRIGHTS_TRADE;
            }
            if (value == 2) {
                return FeeChargeEventType.FUTURES_OOF_TRADE;
            }
            if (value == 3) {
                return FeeChargeEventType.CASH_SETTLED_FUTURES_CONTRACT_EXPIRATION;
            }
            if (value == 4) {
                return FeeChargeEventType.EVENT_CONTRACT_TRADE;
            }
            if (value != 5) {
                return null;
            }
            return FeeChargeEventType.EVENT_CONTRACT_COMBO_TRADE;
        }
    }

    public static FeeChargeEventType valueOf(String str) {
        return (FeeChargeEventType) Enum.valueOf(FeeChargeEventType.class, str);
    }

    public static FeeChargeEventType[] values() {
        return (FeeChargeEventType[]) $VALUES.clone();
    }
}
