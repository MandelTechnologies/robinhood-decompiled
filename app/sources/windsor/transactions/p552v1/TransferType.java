package windsor.transactions.p552v1;

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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m3636d2 = {"Lwindsor/transactions/v1/TransferType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_TYPE_UNSPECIFIED", "ACH_TRANSFER", "CHECK", "WIRE_TRANSFER", "RECURRING_ACH", "INTERNAL_ACCOUNT_TRANSFER", "INTERNAL_ASSET_TRANSFER", "ACAT_IN", "ROLLOVER_ACH", "UK_BANK_TRANSFER", "ISA_CASH_TRANSFER", "UK_OPEN_BANKING_TRANSFER", "Companion", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class TransferType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferType[] $VALUES;
    public static final TransferType ACAT_IN;
    public static final TransferType ACH_TRANSFER;

    @JvmField
    public static final ProtoAdapter<TransferType> ADAPTER;
    public static final TransferType CHECK;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferType INTERNAL_ACCOUNT_TRANSFER;
    public static final TransferType INTERNAL_ASSET_TRANSFER;
    public static final TransferType ISA_CASH_TRANSFER;
    public static final TransferType RECURRING_ACH;
    public static final TransferType ROLLOVER_ACH;
    public static final TransferType TRANSFER_TYPE_UNSPECIFIED;
    public static final TransferType UK_BANK_TRANSFER;
    public static final TransferType UK_OPEN_BANKING_TRANSFER;
    public static final TransferType WIRE_TRANSFER;
    private final int value;

    private static final /* synthetic */ TransferType[] $values() {
        return new TransferType[]{TRANSFER_TYPE_UNSPECIFIED, ACH_TRANSFER, CHECK, WIRE_TRANSFER, RECURRING_ACH, INTERNAL_ACCOUNT_TRANSFER, INTERNAL_ASSET_TRANSFER, ACAT_IN, ROLLOVER_ACH, UK_BANK_TRANSFER, ISA_CASH_TRANSFER, UK_OPEN_BANKING_TRANSFER};
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
        final TransferType transferType = new TransferType("TRANSFER_TYPE_UNSPECIFIED", 0, 0);
        TRANSFER_TYPE_UNSPECIFIED = transferType;
        ACH_TRANSFER = new TransferType("ACH_TRANSFER", 1, 1);
        CHECK = new TransferType("CHECK", 2, 2);
        WIRE_TRANSFER = new TransferType("WIRE_TRANSFER", 3, 3);
        RECURRING_ACH = new TransferType("RECURRING_ACH", 4, 4);
        INTERNAL_ACCOUNT_TRANSFER = new TransferType("INTERNAL_ACCOUNT_TRANSFER", 5, 5);
        INTERNAL_ASSET_TRANSFER = new TransferType("INTERNAL_ASSET_TRANSFER", 6, 6);
        ACAT_IN = new TransferType("ACAT_IN", 7, 7);
        ROLLOVER_ACH = new TransferType("ROLLOVER_ACH", 8, 8);
        UK_BANK_TRANSFER = new TransferType("UK_BANK_TRANSFER", 9, 10);
        ISA_CASH_TRANSFER = new TransferType("ISA_CASH_TRANSFER", 10, 11);
        UK_OPEN_BANKING_TRANSFER = new TransferType("UK_OPEN_BANKING_TRANSFER", 11, 12);
        TransferType[] transferTypeArr$values = $values();
        $VALUES = transferTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferType>(orCreateKotlinClass, syntax, transferType) { // from class: windsor.transactions.v1.TransferType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferType fromValue(int value) {
                return TransferType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lwindsor/transactions/v1/TransferType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lwindsor/transactions/v1/TransferType;", "fromValue", "value", "", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return TransferType.TRANSFER_TYPE_UNSPECIFIED;
                case 1:
                    return TransferType.ACH_TRANSFER;
                case 2:
                    return TransferType.CHECK;
                case 3:
                    return TransferType.WIRE_TRANSFER;
                case 4:
                    return TransferType.RECURRING_ACH;
                case 5:
                    return TransferType.INTERNAL_ACCOUNT_TRANSFER;
                case 6:
                    return TransferType.INTERNAL_ASSET_TRANSFER;
                case 7:
                    return TransferType.ACAT_IN;
                case 8:
                    return TransferType.ROLLOVER_ACH;
                case 9:
                default:
                    return null;
                case 10:
                    return TransferType.UK_BANK_TRANSFER;
                case 11:
                    return TransferType.ISA_CASH_TRANSFER;
                case 12:
                    return TransferType.UK_OPEN_BANKING_TRANSFER;
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
