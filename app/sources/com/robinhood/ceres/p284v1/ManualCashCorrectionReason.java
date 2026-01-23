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
/* compiled from: ManualCashCorrectionReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualCashCorrectionReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED", "FUTURES_ADJUSTMENT", "FUTURES_COMMISSION_AND_FEE_CREDIT", "FUTURES_CREDIT", "FUTURES_WRITE_OFF", "EVENT_CONTRACT_ADJUSTMENT", "EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT", "EVENT_CONTRACT_CREDIT", "EVENT_CONTRACT_WRITE_OFF", "FUTURES_FEDERAL_TAX_WITHHOLDING", "FUTURES_NRA_TAX_WITHHOLDING", "FUTURES_CA_STATE_TAX_WITHHOLDING", "FUTURES_ME_STATE_TAX_WITHHOLDING", "FUTURES_VT_STATE_TAX_WITHHOLDING", "EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING", "EVENT_CONTRACT_NRA_TAX_WITHHOLDING", "EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING", "EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING", "EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ManualCashCorrectionReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ManualCashCorrectionReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ManualCashCorrectionReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_ADJUSTMENT;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_CREDIT;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_NRA_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason EVENT_CONTRACT_WRITE_OFF;
    public static final ManualCashCorrectionReason FUTURES_ADJUSTMENT;
    public static final ManualCashCorrectionReason FUTURES_CA_STATE_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason FUTURES_COMMISSION_AND_FEE_CREDIT;
    public static final ManualCashCorrectionReason FUTURES_CREDIT;
    public static final ManualCashCorrectionReason FUTURES_FEDERAL_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason FUTURES_ME_STATE_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason FUTURES_NRA_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason FUTURES_VT_STATE_TAX_WITHHOLDING;
    public static final ManualCashCorrectionReason FUTURES_WRITE_OFF;
    public static final ManualCashCorrectionReason MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ ManualCashCorrectionReason[] $values() {
        return new ManualCashCorrectionReason[]{MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED, FUTURES_ADJUSTMENT, FUTURES_COMMISSION_AND_FEE_CREDIT, FUTURES_CREDIT, FUTURES_WRITE_OFF, EVENT_CONTRACT_ADJUSTMENT, EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT, EVENT_CONTRACT_CREDIT, EVENT_CONTRACT_WRITE_OFF, FUTURES_FEDERAL_TAX_WITHHOLDING, FUTURES_NRA_TAX_WITHHOLDING, FUTURES_CA_STATE_TAX_WITHHOLDING, FUTURES_ME_STATE_TAX_WITHHOLDING, FUTURES_VT_STATE_TAX_WITHHOLDING, EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING, EVENT_CONTRACT_NRA_TAX_WITHHOLDING, EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING, EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING, EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING};
    }

    @JvmStatic
    public static final ManualCashCorrectionReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ManualCashCorrectionReason> getEntries() {
        return $ENTRIES;
    }

    private ManualCashCorrectionReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ManualCashCorrectionReason manualCashCorrectionReason = new ManualCashCorrectionReason("MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED", 0, 0);
        MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED = manualCashCorrectionReason;
        FUTURES_ADJUSTMENT = new ManualCashCorrectionReason("FUTURES_ADJUSTMENT", 1, 1);
        FUTURES_COMMISSION_AND_FEE_CREDIT = new ManualCashCorrectionReason("FUTURES_COMMISSION_AND_FEE_CREDIT", 2, 2);
        FUTURES_CREDIT = new ManualCashCorrectionReason("FUTURES_CREDIT", 3, 3);
        FUTURES_WRITE_OFF = new ManualCashCorrectionReason("FUTURES_WRITE_OFF", 4, 4);
        EVENT_CONTRACT_ADJUSTMENT = new ManualCashCorrectionReason("EVENT_CONTRACT_ADJUSTMENT", 5, 5);
        EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT = new ManualCashCorrectionReason("EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT", 6, 6);
        EVENT_CONTRACT_CREDIT = new ManualCashCorrectionReason("EVENT_CONTRACT_CREDIT", 7, 7);
        EVENT_CONTRACT_WRITE_OFF = new ManualCashCorrectionReason("EVENT_CONTRACT_WRITE_OFF", 8, 8);
        FUTURES_FEDERAL_TAX_WITHHOLDING = new ManualCashCorrectionReason("FUTURES_FEDERAL_TAX_WITHHOLDING", 9, 9);
        FUTURES_NRA_TAX_WITHHOLDING = new ManualCashCorrectionReason("FUTURES_NRA_TAX_WITHHOLDING", 10, 10);
        FUTURES_CA_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReason("FUTURES_CA_STATE_TAX_WITHHOLDING", 11, 11);
        FUTURES_ME_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReason("FUTURES_ME_STATE_TAX_WITHHOLDING", 12, 12);
        FUTURES_VT_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReason("FUTURES_VT_STATE_TAX_WITHHOLDING", 13, 13);
        EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING = new ManualCashCorrectionReason("EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING", 14, 14);
        EVENT_CONTRACT_NRA_TAX_WITHHOLDING = new ManualCashCorrectionReason("EVENT_CONTRACT_NRA_TAX_WITHHOLDING", 15, 15);
        EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReason("EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING", 16, 16);
        EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReason("EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING", 17, 17);
        EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING = new ManualCashCorrectionReason("EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING", 18, 18);
        ManualCashCorrectionReason[] manualCashCorrectionReasonArr$values = $values();
        $VALUES = manualCashCorrectionReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(manualCashCorrectionReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManualCashCorrectionReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ManualCashCorrectionReason>(orCreateKotlinClass, syntax, manualCashCorrectionReason) { // from class: com.robinhood.ceres.v1.ManualCashCorrectionReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ManualCashCorrectionReason fromValue(int value) {
                return ManualCashCorrectionReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ManualCashCorrectionReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ManualCashCorrectionReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/ManualCashCorrectionReason;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ManualCashCorrectionReason fromValue(int value) {
            switch (value) {
                case 0:
                    return ManualCashCorrectionReason.MANUAL_CASH_CORRECTION_REASON_UNSPECIFIED;
                case 1:
                    return ManualCashCorrectionReason.FUTURES_ADJUSTMENT;
                case 2:
                    return ManualCashCorrectionReason.FUTURES_COMMISSION_AND_FEE_CREDIT;
                case 3:
                    return ManualCashCorrectionReason.FUTURES_CREDIT;
                case 4:
                    return ManualCashCorrectionReason.FUTURES_WRITE_OFF;
                case 5:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_ADJUSTMENT;
                case 6:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_COMMISSION_AND_FEE_CREDIT;
                case 7:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_CREDIT;
                case 8:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_WRITE_OFF;
                case 9:
                    return ManualCashCorrectionReason.FUTURES_FEDERAL_TAX_WITHHOLDING;
                case 10:
                    return ManualCashCorrectionReason.FUTURES_NRA_TAX_WITHHOLDING;
                case 11:
                    return ManualCashCorrectionReason.FUTURES_CA_STATE_TAX_WITHHOLDING;
                case 12:
                    return ManualCashCorrectionReason.FUTURES_ME_STATE_TAX_WITHHOLDING;
                case 13:
                    return ManualCashCorrectionReason.FUTURES_VT_STATE_TAX_WITHHOLDING;
                case 14:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_FEDERAL_TAX_WITHHOLDING;
                case 15:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_NRA_TAX_WITHHOLDING;
                case 16:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_CA_STATE_TAX_WITHHOLDING;
                case 17:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_ME_STATE_TAX_WITHHOLDING;
                case 18:
                    return ManualCashCorrectionReason.EVENT_CONTRACT_VT_STATE_TAX_WITHHOLDING;
                default:
                    return null;
            }
        }
    }

    public static ManualCashCorrectionReason valueOf(String str) {
        return (ManualCashCorrectionReason) Enum.valueOf(ManualCashCorrectionReason.class, str);
    }

    public static ManualCashCorrectionReason[] values() {
        return (ManualCashCorrectionReason[]) $VALUES.clone();
    }
}
