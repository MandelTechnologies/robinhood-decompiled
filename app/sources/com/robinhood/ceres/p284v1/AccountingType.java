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
/* compiled from: AccountingType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountingType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNTING_TYPE_UNSPECIFIED", "ACCOUNTING_TYPE_FEE", "ACCOUNTING_TYPE_REALIZED_PNL", "ACCOUNTING_TYPE_TOTAL_COST_BASIS", "ACCOUNTING_TYPE_RHD_CASH_TRANSFER", "ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION", "ACCOUNTING_TYPE_FUTURES_FEE", "ACCOUNTING_TYPE_FUTURES_REALIZED_PNL", "ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS", "ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER", "ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION", "ACCOUNTING_TYPE_SWAPS_FEE", "ACCOUNTING_TYPE_SWAPS_REALIZED_PNL", "ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS", "ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER", "ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION", "ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT", "ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class AccountingType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountingType[] $VALUES;
    public static final AccountingType ACCOUNTING_TYPE_FEE;
    public static final AccountingType ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER;
    public static final AccountingType ACCOUNTING_TYPE_FUTURES_FEE;
    public static final AccountingType ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
    public static final AccountingType ACCOUNTING_TYPE_FUTURES_REALIZED_PNL;
    public static final AccountingType ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS;
    public static final AccountingType ACCOUNTING_TYPE_REALIZED_PNL;
    public static final AccountingType ACCOUNTING_TYPE_RHD_CASH_TRANSFER;
    public static final AccountingType ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION;
    public static final AccountingType ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER;
    public static final AccountingType ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT;
    public static final AccountingType ACCOUNTING_TYPE_SWAPS_FEE;
    public static final AccountingType ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
    public static final AccountingType ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT;
    public static final AccountingType ACCOUNTING_TYPE_SWAPS_REALIZED_PNL;
    public static final AccountingType ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS;
    public static final AccountingType ACCOUNTING_TYPE_TOTAL_COST_BASIS;
    public static final AccountingType ACCOUNTING_TYPE_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<AccountingType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AccountingType[] $values() {
        return new AccountingType[]{ACCOUNTING_TYPE_UNSPECIFIED, ACCOUNTING_TYPE_FEE, ACCOUNTING_TYPE_REALIZED_PNL, ACCOUNTING_TYPE_TOTAL_COST_BASIS, ACCOUNTING_TYPE_RHD_CASH_TRANSFER, ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION, ACCOUNTING_TYPE_FUTURES_FEE, ACCOUNTING_TYPE_FUTURES_REALIZED_PNL, ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS, ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER, ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION, ACCOUNTING_TYPE_SWAPS_FEE, ACCOUNTING_TYPE_SWAPS_REALIZED_PNL, ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS, ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER, ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION, ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT, ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT};
    }

    @JvmStatic
    public static final AccountingType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountingType> getEntries() {
        return $ENTRIES;
    }

    private AccountingType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountingType accountingType = new AccountingType("ACCOUNTING_TYPE_UNSPECIFIED", 0, 0);
        ACCOUNTING_TYPE_UNSPECIFIED = accountingType;
        ACCOUNTING_TYPE_FEE = new AccountingType("ACCOUNTING_TYPE_FEE", 1, 1);
        ACCOUNTING_TYPE_REALIZED_PNL = new AccountingType("ACCOUNTING_TYPE_REALIZED_PNL", 2, 2);
        ACCOUNTING_TYPE_TOTAL_COST_BASIS = new AccountingType("ACCOUNTING_TYPE_TOTAL_COST_BASIS", 3, 3);
        ACCOUNTING_TYPE_RHD_CASH_TRANSFER = new AccountingType("ACCOUNTING_TYPE_RHD_CASH_TRANSFER", 4, 4);
        ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION = new AccountingType("ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION", 5, 5);
        ACCOUNTING_TYPE_FUTURES_FEE = new AccountingType("ACCOUNTING_TYPE_FUTURES_FEE", 6, 6);
        ACCOUNTING_TYPE_FUTURES_REALIZED_PNL = new AccountingType("ACCOUNTING_TYPE_FUTURES_REALIZED_PNL", 7, 7);
        ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS = new AccountingType("ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS", 8, 8);
        ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER = new AccountingType("ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER", 9, 9);
        ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION = new AccountingType("ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION", 10, 10);
        ACCOUNTING_TYPE_SWAPS_FEE = new AccountingType("ACCOUNTING_TYPE_SWAPS_FEE", 11, 11);
        ACCOUNTING_TYPE_SWAPS_REALIZED_PNL = new AccountingType("ACCOUNTING_TYPE_SWAPS_REALIZED_PNL", 12, 12);
        ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS = new AccountingType("ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS", 13, 13);
        ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER = new AccountingType("ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER", 14, 14);
        ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION = new AccountingType("ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION", 15, 15);
        ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT = new AccountingType("ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT", 16, 16);
        ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT = new AccountingType("ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT", 17, 17);
        AccountingType[] accountingTypeArr$values = $values();
        $VALUES = accountingTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountingTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountingType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountingType>(orCreateKotlinClass, syntax, accountingType) { // from class: com.robinhood.ceres.v1.AccountingType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountingType fromValue(int value) {
                return AccountingType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountingType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountingType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/AccountingType;", "fromValue", "value", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountingType fromValue(int value) {
            switch (value) {
                case 0:
                    return AccountingType.ACCOUNTING_TYPE_UNSPECIFIED;
                case 1:
                    return AccountingType.ACCOUNTING_TYPE_FEE;
                case 2:
                    return AccountingType.ACCOUNTING_TYPE_REALIZED_PNL;
                case 3:
                    return AccountingType.ACCOUNTING_TYPE_TOTAL_COST_BASIS;
                case 4:
                    return AccountingType.ACCOUNTING_TYPE_RHD_CASH_TRANSFER;
                case 5:
                    return AccountingType.ACCOUNTING_TYPE_RHD_MANUAL_CASH_CORRECTION;
                case 6:
                    return AccountingType.ACCOUNTING_TYPE_FUTURES_FEE;
                case 7:
                    return AccountingType.ACCOUNTING_TYPE_FUTURES_REALIZED_PNL;
                case 8:
                    return AccountingType.ACCOUNTING_TYPE_FUTURES_TOTAL_COST_BASIS;
                case 9:
                    return AccountingType.ACCOUNTING_TYPE_FUTURES_CASH_TRANSFER;
                case 10:
                    return AccountingType.ACCOUNTING_TYPE_FUTURES_MANUAL_CASH_CORRECTION;
                case 11:
                    return AccountingType.ACCOUNTING_TYPE_SWAPS_FEE;
                case 12:
                    return AccountingType.ACCOUNTING_TYPE_SWAPS_REALIZED_PNL;
                case 13:
                    return AccountingType.ACCOUNTING_TYPE_SWAPS_TOTAL_COST_BASIS;
                case 14:
                    return AccountingType.ACCOUNTING_TYPE_SWAPS_CASH_TRANSFER;
                case 15:
                    return AccountingType.ACCOUNTING_TYPE_SWAPS_MANUAL_CASH_CORRECTION;
                case 16:
                    return AccountingType.ACCOUNTING_TYPE_SWAPS_OPEN_POSITION_ADJUSTMENT;
                case 17:
                    return AccountingType.ACCOUNTING_TYPE_SWAPS_CLOSE_POSITION_ADJUSTMENT;
                default:
                    return null;
            }
        }
    }

    public static AccountingType valueOf(String str) {
        return (AccountingType) Enum.valueOf(AccountingType.class, str);
    }

    public static AccountingType[] values() {
        return (AccountingType[]) $VALUES.clone();
    }
}
