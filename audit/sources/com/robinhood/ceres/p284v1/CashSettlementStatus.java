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
/* compiled from: CashSettlementStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CASH_SETTLEMENT_STATUS_UNSPECIFIED", "CASH_SETTLEMENT_STATUS_INITIATED", "CASH_SETTLEMENT_STATUS_COMPLETED", "CASH_SETTLEMENT_STATUS_REVERSION_INITIATED", "CASH_SETTLEMENT_STATUS_REVERTED", "CASH_SETTLEMENT_STATUS_COMPLETED_WITH_ERROR", "CASH_SETTLEMENT_STATUS_REVERTED_WITH_ERROR", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CashSettlementStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CashSettlementStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CashSettlementStatus> ADAPTER;
    public static final CashSettlementStatus CASH_SETTLEMENT_STATUS_COMPLETED;
    public static final CashSettlementStatus CASH_SETTLEMENT_STATUS_COMPLETED_WITH_ERROR;
    public static final CashSettlementStatus CASH_SETTLEMENT_STATUS_INITIATED;
    public static final CashSettlementStatus CASH_SETTLEMENT_STATUS_REVERSION_INITIATED;
    public static final CashSettlementStatus CASH_SETTLEMENT_STATUS_REVERTED;
    public static final CashSettlementStatus CASH_SETTLEMENT_STATUS_REVERTED_WITH_ERROR;
    public static final CashSettlementStatus CASH_SETTLEMENT_STATUS_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CashSettlementStatus[] $values() {
        return new CashSettlementStatus[]{CASH_SETTLEMENT_STATUS_UNSPECIFIED, CASH_SETTLEMENT_STATUS_INITIATED, CASH_SETTLEMENT_STATUS_COMPLETED, CASH_SETTLEMENT_STATUS_REVERSION_INITIATED, CASH_SETTLEMENT_STATUS_REVERTED, CASH_SETTLEMENT_STATUS_COMPLETED_WITH_ERROR, CASH_SETTLEMENT_STATUS_REVERTED_WITH_ERROR};
    }

    @JvmStatic
    public static final CashSettlementStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CashSettlementStatus> getEntries() {
        return $ENTRIES;
    }

    private CashSettlementStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CashSettlementStatus cashSettlementStatus = new CashSettlementStatus("CASH_SETTLEMENT_STATUS_UNSPECIFIED", 0, 0);
        CASH_SETTLEMENT_STATUS_UNSPECIFIED = cashSettlementStatus;
        CASH_SETTLEMENT_STATUS_INITIATED = new CashSettlementStatus("CASH_SETTLEMENT_STATUS_INITIATED", 1, 1);
        CASH_SETTLEMENT_STATUS_COMPLETED = new CashSettlementStatus("CASH_SETTLEMENT_STATUS_COMPLETED", 2, 2);
        CASH_SETTLEMENT_STATUS_REVERSION_INITIATED = new CashSettlementStatus("CASH_SETTLEMENT_STATUS_REVERSION_INITIATED", 3, 3);
        CASH_SETTLEMENT_STATUS_REVERTED = new CashSettlementStatus("CASH_SETTLEMENT_STATUS_REVERTED", 4, 4);
        CASH_SETTLEMENT_STATUS_COMPLETED_WITH_ERROR = new CashSettlementStatus("CASH_SETTLEMENT_STATUS_COMPLETED_WITH_ERROR", 5, 5);
        CASH_SETTLEMENT_STATUS_REVERTED_WITH_ERROR = new CashSettlementStatus("CASH_SETTLEMENT_STATUS_REVERTED_WITH_ERROR", 6, 6);
        CashSettlementStatus[] cashSettlementStatusArr$values = $values();
        $VALUES = cashSettlementStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cashSettlementStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashSettlementStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CashSettlementStatus>(orCreateKotlinClass, syntax, cashSettlementStatus) { // from class: com.robinhood.ceres.v1.CashSettlementStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CashSettlementStatus fromValue(int value) {
                return CashSettlementStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CashSettlementStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashSettlementStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/CashSettlementStatus;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CashSettlementStatus fromValue(int value) {
            switch (value) {
                case 0:
                    return CashSettlementStatus.CASH_SETTLEMENT_STATUS_UNSPECIFIED;
                case 1:
                    return CashSettlementStatus.CASH_SETTLEMENT_STATUS_INITIATED;
                case 2:
                    return CashSettlementStatus.CASH_SETTLEMENT_STATUS_COMPLETED;
                case 3:
                    return CashSettlementStatus.CASH_SETTLEMENT_STATUS_REVERSION_INITIATED;
                case 4:
                    return CashSettlementStatus.CASH_SETTLEMENT_STATUS_REVERTED;
                case 5:
                    return CashSettlementStatus.CASH_SETTLEMENT_STATUS_COMPLETED_WITH_ERROR;
                case 6:
                    return CashSettlementStatus.CASH_SETTLEMENT_STATUS_REVERTED_WITH_ERROR;
                default:
                    return null;
            }
        }
    }

    public static CashSettlementStatus valueOf(String str) {
        return (CashSettlementStatus) Enum.valueOf(CashSettlementStatus.class, str);
    }

    public static CashSettlementStatus[] values() {
        return (CashSettlementStatus[]) $VALUES.clone();
    }
}
