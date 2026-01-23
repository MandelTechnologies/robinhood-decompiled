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
/* compiled from: TransactionState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_UNSPECIFIED", "NEW", "PENDING_TRANSFER_INITIATION", "TRANSFER_INITIATED", "COMPLETE", "FAILED", "CANCELED", "PENDING_CANCEL", "PENDING_REVERSE", "CANCEL_REQUESTED_UNCONFIRMED", "Companion", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class TransactionState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransactionState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransactionState> ADAPTER;
    public static final TransactionState CANCELED;
    public static final TransactionState CANCEL_REQUESTED_UNCONFIRMED;
    public static final TransactionState COMPLETE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransactionState FAILED;
    public static final TransactionState NEW;
    public static final TransactionState PENDING_CANCEL;
    public static final TransactionState PENDING_REVERSE;
    public static final TransactionState PENDING_TRANSFER_INITIATION;
    public static final TransactionState STATUS_UNSPECIFIED;
    public static final TransactionState TRANSFER_INITIATED;
    private final int value;

    private static final /* synthetic */ TransactionState[] $values() {
        return new TransactionState[]{STATUS_UNSPECIFIED, NEW, PENDING_TRANSFER_INITIATION, TRANSFER_INITIATED, COMPLETE, FAILED, CANCELED, PENDING_CANCEL, PENDING_REVERSE, CANCEL_REQUESTED_UNCONFIRMED};
    }

    @JvmStatic
    public static final TransactionState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransactionState> getEntries() {
        return $ENTRIES;
    }

    private TransactionState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransactionState transactionState = new TransactionState("STATUS_UNSPECIFIED", 0, 0);
        STATUS_UNSPECIFIED = transactionState;
        NEW = new TransactionState("NEW", 1, 1);
        PENDING_TRANSFER_INITIATION = new TransactionState("PENDING_TRANSFER_INITIATION", 2, 2);
        TRANSFER_INITIATED = new TransactionState("TRANSFER_INITIATED", 3, 3);
        COMPLETE = new TransactionState("COMPLETE", 4, 4);
        FAILED = new TransactionState("FAILED", 5, 5);
        CANCELED = new TransactionState("CANCELED", 6, 6);
        PENDING_CANCEL = new TransactionState("PENDING_CANCEL", 7, 7);
        PENDING_REVERSE = new TransactionState("PENDING_REVERSE", 8, 8);
        CANCEL_REQUESTED_UNCONFIRMED = new TransactionState("CANCEL_REQUESTED_UNCONFIRMED", 9, 9);
        TransactionState[] transactionStateArr$values = $values();
        $VALUES = transactionStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transactionStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransactionState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransactionState>(orCreateKotlinClass, syntax, transactionState) { // from class: windsor.transactions.v1.TransactionState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransactionState fromValue(int value) {
                return TransactionState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransactionState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lwindsor/transactions/v1/TransactionState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lwindsor/transactions/v1/TransactionState;", "fromValue", "value", "", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransactionState fromValue(int value) {
            switch (value) {
                case 0:
                    return TransactionState.STATUS_UNSPECIFIED;
                case 1:
                    return TransactionState.NEW;
                case 2:
                    return TransactionState.PENDING_TRANSFER_INITIATION;
                case 3:
                    return TransactionState.TRANSFER_INITIATED;
                case 4:
                    return TransactionState.COMPLETE;
                case 5:
                    return TransactionState.FAILED;
                case 6:
                    return TransactionState.CANCELED;
                case 7:
                    return TransactionState.PENDING_CANCEL;
                case 8:
                    return TransactionState.PENDING_REVERSE;
                case 9:
                    return TransactionState.CANCEL_REQUESTED_UNCONFIRMED;
                default:
                    return null;
            }
        }
    }

    public static TransactionState valueOf(String str) {
        return (TransactionState) Enum.valueOf(TransactionState.class, str);
    }

    public static TransactionState[] values() {
        return (TransactionState[]) $VALUES.clone();
    }
}
