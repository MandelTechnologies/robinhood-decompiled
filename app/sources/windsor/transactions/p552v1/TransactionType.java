package windsor.transactions.p552v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
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
/* compiled from: TransactionType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "CONTRIBUTION_REGULAR", "CONTRIBUTION_ROLLOVER", "DISTRIBUTION_REGULAR", "DISTRIBUTION_EARLY", "DISTRIBUTION_CORRECTION", "CASH_TRANSFER", "Companion", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class TransactionType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransactionType> ADAPTER;
    public static final TransactionType CASH_TRANSFER;
    public static final TransactionType CONTRIBUTION_REGULAR;
    public static final TransactionType CONTRIBUTION_ROLLOVER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransactionType DISTRIBUTION_CORRECTION;
    public static final TransactionType DISTRIBUTION_EARLY;
    public static final TransactionType DISTRIBUTION_REGULAR;
    public static final TransactionType TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{TYPE_UNSPECIFIED, CONTRIBUTION_REGULAR, CONTRIBUTION_ROLLOVER, DISTRIBUTION_REGULAR, DISTRIBUTION_EARLY, DISTRIBUTION_CORRECTION, CASH_TRANSFER};
    }

    @JvmStatic
    public static final TransactionType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransactionType> getEntries() {
        return $ENTRIES;
    }

    private TransactionType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransactionType transactionType = new TransactionType("TYPE_UNSPECIFIED", 0, 0);
        TYPE_UNSPECIFIED = transactionType;
        CONTRIBUTION_REGULAR = new TransactionType("CONTRIBUTION_REGULAR", 1, 1);
        CONTRIBUTION_ROLLOVER = new TransactionType("CONTRIBUTION_ROLLOVER", 2, 2);
        DISTRIBUTION_REGULAR = new TransactionType("DISTRIBUTION_REGULAR", 3, 501);
        DISTRIBUTION_EARLY = new TransactionType("DISTRIBUTION_EARLY", 4, HttpStatusCode.BAD_GATEWAY_502);
        DISTRIBUTION_CORRECTION = new TransactionType("DISTRIBUTION_CORRECTION", 5, 503);
        CASH_TRANSFER = new TransactionType("CASH_TRANSFER", 6, 1000);
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transactionTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransactionType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransactionType>(orCreateKotlinClass, syntax, transactionType) { // from class: windsor.transactions.v1.TransactionType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransactionType fromValue(int value) {
                return TransactionType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransactionType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lwindsor/transactions/v1/TransactionType;", "fromValue", "value", "", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransactionType fromValue(int value) {
            if (value == 0) {
                return TransactionType.TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return TransactionType.CONTRIBUTION_REGULAR;
            }
            if (value == 2) {
                return TransactionType.CONTRIBUTION_ROLLOVER;
            }
            if (value != 1000) {
                switch (value) {
                    case 501:
                        return TransactionType.DISTRIBUTION_REGULAR;
                    case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                        return TransactionType.DISTRIBUTION_EARLY;
                    case 503:
                        return TransactionType.DISTRIBUTION_CORRECTION;
                    default:
                        return null;
                }
            }
            return TransactionType.CASH_TRANSFER;
        }
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
