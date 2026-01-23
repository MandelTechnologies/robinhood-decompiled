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
/* compiled from: CashTransferStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashTransferStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CASH_TRANSFER_STATUS_UNSPECIFIED", "CASH_TRANSFER_STATUS_CONFIRMED", "CASH_TRANSFER_STATUS_PENDING", "CASH_TRANSFER_STATUS_REJECTED", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CashTransferStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CashTransferStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CashTransferStatus> ADAPTER;
    public static final CashTransferStatus CASH_TRANSFER_STATUS_CONFIRMED;
    public static final CashTransferStatus CASH_TRANSFER_STATUS_PENDING;
    public static final CashTransferStatus CASH_TRANSFER_STATUS_REJECTED;
    public static final CashTransferStatus CASH_TRANSFER_STATUS_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CashTransferStatus[] $values() {
        return new CashTransferStatus[]{CASH_TRANSFER_STATUS_UNSPECIFIED, CASH_TRANSFER_STATUS_CONFIRMED, CASH_TRANSFER_STATUS_PENDING, CASH_TRANSFER_STATUS_REJECTED};
    }

    @JvmStatic
    public static final CashTransferStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CashTransferStatus> getEntries() {
        return $ENTRIES;
    }

    private CashTransferStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CashTransferStatus cashTransferStatus = new CashTransferStatus("CASH_TRANSFER_STATUS_UNSPECIFIED", 0, 0);
        CASH_TRANSFER_STATUS_UNSPECIFIED = cashTransferStatus;
        CASH_TRANSFER_STATUS_CONFIRMED = new CashTransferStatus("CASH_TRANSFER_STATUS_CONFIRMED", 1, 1);
        CASH_TRANSFER_STATUS_PENDING = new CashTransferStatus("CASH_TRANSFER_STATUS_PENDING", 2, 2);
        CASH_TRANSFER_STATUS_REJECTED = new CashTransferStatus("CASH_TRANSFER_STATUS_REJECTED", 3, 3);
        CashTransferStatus[] cashTransferStatusArr$values = $values();
        $VALUES = cashTransferStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cashTransferStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CashTransferStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CashTransferStatus>(orCreateKotlinClass, syntax, cashTransferStatus) { // from class: com.robinhood.ceres.v1.CashTransferStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CashTransferStatus fromValue(int value) {
                return CashTransferStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CashTransferStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CashTransferStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/CashTransferStatus;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CashTransferStatus fromValue(int value) {
            if (value == 0) {
                return CashTransferStatus.CASH_TRANSFER_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return CashTransferStatus.CASH_TRANSFER_STATUS_CONFIRMED;
            }
            if (value == 2) {
                return CashTransferStatus.CASH_TRANSFER_STATUS_PENDING;
            }
            if (value != 3) {
                return null;
            }
            return CashTransferStatus.CASH_TRANSFER_STATUS_REJECTED;
        }
    }

    public static CashTransferStatus valueOf(String str) {
        return (CashTransferStatus) Enum.valueOf(CashTransferStatus.class, str);
    }

    public static CashTransferStatus[] values() {
        return (CashTransferStatus[]) $VALUES.clone();
    }
}
