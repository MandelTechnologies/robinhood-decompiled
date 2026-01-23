package rosetta.payment_hub.p540v1.service;

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
/* compiled from: TransferType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 !2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006\""}, m3636d2 = {"Lrosetta/payment_hub/v1/service/TransferType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_TYPE__UNSPECIFIED", "TRANSFER_TYPE_ORIGINATED_ACH", "TRANSFER_TYPE_NON_ORIGINATED_ACH", "TRANSFER_TYPE_INTER_ENTITY", "TRANSFER_TYPE_DEBIT_CARD_FUNDING", "TRANSFER_TYPE_P2P", "TRANSFER_TYPE_INTERNAL", "TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT", "TRANSFER_TYPE_INSTANT_BANK_TRANSFER", "TRANSFER_TYPE_CHECK", "TRANSFER_TYPE_INCOMING_WIRE", "TRANSFER_TYPE_SEPA_CREDIT", "TRANSFER_TYPE_WALLET", "TRANSFER_TYPE_UK_BANK_TRANSFER", "TRANSFER_TYPE_OUTGOING_WIRE", "TRANSFER_TYPE_SG_BANK_DEPOSIT", "TRANSFER_TYPE_SG_BANK_WITHDRAWAL", "TRANSFER_TYPE_FX_TRANSFER", "TRANSFER_TYPE_ROLLOVER_ACH", "TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY", "TRANSFER_TYPE_SVB_ACH_TRANSFER", "TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER", "TRANSFER_TYPE_ISA_CASH_TRANSFER", "TRANSFER_TYPE_OUTGOING_CHECK", "Companion", "rosetta.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TransferType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransferType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferType TRANSFER_TYPE_CHECK;
    public static final TransferType TRANSFER_TYPE_DEBIT_CARD_FUNDING;
    public static final TransferType TRANSFER_TYPE_FX_TRANSFER;
    public static final TransferType TRANSFER_TYPE_INCOMING_WIRE;
    public static final TransferType TRANSFER_TYPE_INSTANT_BANK_TRANSFER;
    public static final TransferType TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT;
    public static final TransferType TRANSFER_TYPE_INTERNAL;
    public static final TransferType TRANSFER_TYPE_INTER_ENTITY;
    public static final TransferType TRANSFER_TYPE_ISA_CASH_TRANSFER;
    public static final TransferType TRANSFER_TYPE_NON_ORIGINATED_ACH;
    public static final TransferType TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY;
    public static final TransferType TRANSFER_TYPE_ORIGINATED_ACH;
    public static final TransferType TRANSFER_TYPE_OUTGOING_CHECK;
    public static final TransferType TRANSFER_TYPE_OUTGOING_WIRE;
    public static final TransferType TRANSFER_TYPE_P2P;
    public static final TransferType TRANSFER_TYPE_ROLLOVER_ACH;
    public static final TransferType TRANSFER_TYPE_SEPA_CREDIT;
    public static final TransferType TRANSFER_TYPE_SG_BANK_DEPOSIT;
    public static final TransferType TRANSFER_TYPE_SG_BANK_WITHDRAWAL;
    public static final TransferType TRANSFER_TYPE_SVB_ACH_TRANSFER;
    public static final TransferType TRANSFER_TYPE_UK_BANK_TRANSFER;
    public static final TransferType TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER;
    public static final TransferType TRANSFER_TYPE_WALLET;
    public static final TransferType TRANSFER_TYPE__UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TransferType[] $values() {
        return new TransferType[]{TRANSFER_TYPE__UNSPECIFIED, TRANSFER_TYPE_ORIGINATED_ACH, TRANSFER_TYPE_NON_ORIGINATED_ACH, TRANSFER_TYPE_INTER_ENTITY, TRANSFER_TYPE_DEBIT_CARD_FUNDING, TRANSFER_TYPE_P2P, TRANSFER_TYPE_INTERNAL, TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT, TRANSFER_TYPE_INSTANT_BANK_TRANSFER, TRANSFER_TYPE_CHECK, TRANSFER_TYPE_INCOMING_WIRE, TRANSFER_TYPE_SEPA_CREDIT, TRANSFER_TYPE_WALLET, TRANSFER_TYPE_UK_BANK_TRANSFER, TRANSFER_TYPE_OUTGOING_WIRE, TRANSFER_TYPE_SG_BANK_DEPOSIT, TRANSFER_TYPE_SG_BANK_WITHDRAWAL, TRANSFER_TYPE_FX_TRANSFER, TRANSFER_TYPE_ROLLOVER_ACH, TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY, TRANSFER_TYPE_SVB_ACH_TRANSFER, TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER, TRANSFER_TYPE_ISA_CASH_TRANSFER, TRANSFER_TYPE_OUTGOING_CHECK};
    }

    @JvmStatic
    public static final TransferType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransferType> getEntries() {
        return $ENTRIES;
    }

    private TransferType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransferType transferType = new TransferType("TRANSFER_TYPE__UNSPECIFIED", 0, 0);
        TRANSFER_TYPE__UNSPECIFIED = transferType;
        TRANSFER_TYPE_ORIGINATED_ACH = new TransferType("TRANSFER_TYPE_ORIGINATED_ACH", 1, 1);
        TRANSFER_TYPE_NON_ORIGINATED_ACH = new TransferType("TRANSFER_TYPE_NON_ORIGINATED_ACH", 2, 2);
        TRANSFER_TYPE_INTER_ENTITY = new TransferType("TRANSFER_TYPE_INTER_ENTITY", 3, 3);
        TRANSFER_TYPE_DEBIT_CARD_FUNDING = new TransferType("TRANSFER_TYPE_DEBIT_CARD_FUNDING", 4, 4);
        TRANSFER_TYPE_P2P = new TransferType("TRANSFER_TYPE_P2P", 5, 5);
        TRANSFER_TYPE_INTERNAL = new TransferType("TRANSFER_TYPE_INTERNAL", 6, 6);
        TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT = new TransferType("TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT", 7, 7);
        TRANSFER_TYPE_INSTANT_BANK_TRANSFER = new TransferType("TRANSFER_TYPE_INSTANT_BANK_TRANSFER", 8, 8);
        TRANSFER_TYPE_CHECK = new TransferType("TRANSFER_TYPE_CHECK", 9, 9);
        TRANSFER_TYPE_INCOMING_WIRE = new TransferType("TRANSFER_TYPE_INCOMING_WIRE", 10, 10);
        TRANSFER_TYPE_SEPA_CREDIT = new TransferType("TRANSFER_TYPE_SEPA_CREDIT", 11, 11);
        TRANSFER_TYPE_WALLET = new TransferType("TRANSFER_TYPE_WALLET", 12, 12);
        TRANSFER_TYPE_UK_BANK_TRANSFER = new TransferType("TRANSFER_TYPE_UK_BANK_TRANSFER", 13, 13);
        TRANSFER_TYPE_OUTGOING_WIRE = new TransferType("TRANSFER_TYPE_OUTGOING_WIRE", 14, 14);
        TRANSFER_TYPE_SG_BANK_DEPOSIT = new TransferType("TRANSFER_TYPE_SG_BANK_DEPOSIT", 15, 15);
        TRANSFER_TYPE_SG_BANK_WITHDRAWAL = new TransferType("TRANSFER_TYPE_SG_BANK_WITHDRAWAL", 16, 16);
        TRANSFER_TYPE_FX_TRANSFER = new TransferType("TRANSFER_TYPE_FX_TRANSFER", 17, 17);
        TRANSFER_TYPE_ROLLOVER_ACH = new TransferType("TRANSFER_TYPE_ROLLOVER_ACH", 18, 18);
        TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY = new TransferType("TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY", 19, 19);
        TRANSFER_TYPE_SVB_ACH_TRANSFER = new TransferType("TRANSFER_TYPE_SVB_ACH_TRANSFER", 20, 20);
        TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER = new TransferType("TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER", 21, 21);
        TRANSFER_TYPE_ISA_CASH_TRANSFER = new TransferType("TRANSFER_TYPE_ISA_CASH_TRANSFER", 22, 22);
        TRANSFER_TYPE_OUTGOING_CHECK = new TransferType("TRANSFER_TYPE_OUTGOING_CHECK", 23, 23);
        TransferType[] transferTypeArr$values = $values();
        $VALUES = transferTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferType>(orCreateKotlinClass, syntax, transferType) { // from class: rosetta.payment_hub.v1.service.TransferType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferType fromValue(int value) {
                return TransferType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/payment_hub/v1/service/TransferType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/payment_hub/v1/service/TransferType;", "fromValue", "value", "", "rosetta.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferType fromValue(int value) {
            switch (value) {
                case 0:
                    return TransferType.TRANSFER_TYPE__UNSPECIFIED;
                case 1:
                    return TransferType.TRANSFER_TYPE_ORIGINATED_ACH;
                case 2:
                    return TransferType.TRANSFER_TYPE_NON_ORIGINATED_ACH;
                case 3:
                    return TransferType.TRANSFER_TYPE_INTER_ENTITY;
                case 4:
                    return TransferType.TRANSFER_TYPE_DEBIT_CARD_FUNDING;
                case 5:
                    return TransferType.TRANSFER_TYPE_P2P;
                case 6:
                    return TransferType.TRANSFER_TYPE_INTERNAL;
                case 7:
                    return TransferType.TRANSFER_TYPE_INSTANT_FIRM_SETTLEMENT;
                case 8:
                    return TransferType.TRANSFER_TYPE_INSTANT_BANK_TRANSFER;
                case 9:
                    return TransferType.TRANSFER_TYPE_CHECK;
                case 10:
                    return TransferType.TRANSFER_TYPE_INCOMING_WIRE;
                case 11:
                    return TransferType.TRANSFER_TYPE_SEPA_CREDIT;
                case 12:
                    return TransferType.TRANSFER_TYPE_WALLET;
                case 13:
                    return TransferType.TRANSFER_TYPE_UK_BANK_TRANSFER;
                case 14:
                    return TransferType.TRANSFER_TYPE_OUTGOING_WIRE;
                case 15:
                    return TransferType.TRANSFER_TYPE_SG_BANK_DEPOSIT;
                case 16:
                    return TransferType.TRANSFER_TYPE_SG_BANK_WITHDRAWAL;
                case 17:
                    return TransferType.TRANSFER_TYPE_FX_TRANSFER;
                case 18:
                    return TransferType.TRANSFER_TYPE_ROLLOVER_ACH;
                case 19:
                    return TransferType.TRANSFER_TYPE_NON_ORIGINATED_ACH_EARLY_PAY;
                case 20:
                    return TransferType.TRANSFER_TYPE_SVB_ACH_TRANSFER;
                case 21:
                    return TransferType.TRANSFER_TYPE_UK_OPEN_BANKING_TRANSFER;
                case 22:
                    return TransferType.TRANSFER_TYPE_ISA_CASH_TRANSFER;
                case 23:
                    return TransferType.TRANSFER_TYPE_OUTGOING_CHECK;
                default:
                    return null;
            }
        }
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }
}
