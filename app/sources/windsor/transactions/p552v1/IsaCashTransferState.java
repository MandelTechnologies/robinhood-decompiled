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
/* compiled from: IsaCashTransferState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ISA_STATUS_UNSPECIFIED", "PENDING_FILE_GENERATION", "FILE_GENERATED", "PENDING_QUAI_UPLOAD", "FILE_UPLOADED", "PENDING_MORE_INFORMATION", "LANDED", "PENDING_REVERSAL", "SUCCESS", "PENDING_CANCELLATION", "ISA_CASH_TRANSFER_FAILED", "CANCELLED", "RETURNED", "CANCEL_REQUESTED", "Companion", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class IsaCashTransferState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IsaCashTransferState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<IsaCashTransferState> ADAPTER;
    public static final IsaCashTransferState CANCELLED;
    public static final IsaCashTransferState CANCEL_REQUESTED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IsaCashTransferState FILE_GENERATED;
    public static final IsaCashTransferState FILE_UPLOADED;
    public static final IsaCashTransferState ISA_CASH_TRANSFER_FAILED;
    public static final IsaCashTransferState ISA_STATUS_UNSPECIFIED;
    public static final IsaCashTransferState LANDED;
    public static final IsaCashTransferState PENDING_CANCELLATION;
    public static final IsaCashTransferState PENDING_FILE_GENERATION;
    public static final IsaCashTransferState PENDING_MORE_INFORMATION;
    public static final IsaCashTransferState PENDING_QUAI_UPLOAD;
    public static final IsaCashTransferState PENDING_REVERSAL;
    public static final IsaCashTransferState RETURNED;
    public static final IsaCashTransferState SUCCESS;
    private final int value;

    private static final /* synthetic */ IsaCashTransferState[] $values() {
        return new IsaCashTransferState[]{ISA_STATUS_UNSPECIFIED, PENDING_FILE_GENERATION, FILE_GENERATED, PENDING_QUAI_UPLOAD, FILE_UPLOADED, PENDING_MORE_INFORMATION, LANDED, PENDING_REVERSAL, SUCCESS, PENDING_CANCELLATION, ISA_CASH_TRANSFER_FAILED, CANCELLED, RETURNED, CANCEL_REQUESTED};
    }

    @JvmStatic
    public static final IsaCashTransferState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<IsaCashTransferState> getEntries() {
        return $ENTRIES;
    }

    private IsaCashTransferState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final IsaCashTransferState isaCashTransferState = new IsaCashTransferState("ISA_STATUS_UNSPECIFIED", 0, 0);
        ISA_STATUS_UNSPECIFIED = isaCashTransferState;
        PENDING_FILE_GENERATION = new IsaCashTransferState("PENDING_FILE_GENERATION", 1, 1);
        FILE_GENERATED = new IsaCashTransferState("FILE_GENERATED", 2, 2);
        PENDING_QUAI_UPLOAD = new IsaCashTransferState("PENDING_QUAI_UPLOAD", 3, 3);
        FILE_UPLOADED = new IsaCashTransferState("FILE_UPLOADED", 4, 4);
        PENDING_MORE_INFORMATION = new IsaCashTransferState("PENDING_MORE_INFORMATION", 5, 5);
        LANDED = new IsaCashTransferState("LANDED", 6, 6);
        PENDING_REVERSAL = new IsaCashTransferState("PENDING_REVERSAL", 7, 7);
        SUCCESS = new IsaCashTransferState("SUCCESS", 8, 8);
        PENDING_CANCELLATION = new IsaCashTransferState("PENDING_CANCELLATION", 9, 9);
        ISA_CASH_TRANSFER_FAILED = new IsaCashTransferState("ISA_CASH_TRANSFER_FAILED", 10, 10);
        CANCELLED = new IsaCashTransferState("CANCELLED", 11, 11);
        RETURNED = new IsaCashTransferState("RETURNED", 12, 12);
        CANCEL_REQUESTED = new IsaCashTransferState("CANCEL_REQUESTED", 13, 13);
        IsaCashTransferState[] isaCashTransferStateArr$values = $values();
        $VALUES = isaCashTransferStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(isaCashTransferStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IsaCashTransferState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<IsaCashTransferState>(orCreateKotlinClass, syntax, isaCashTransferState) { // from class: windsor.transactions.v1.IsaCashTransferState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public IsaCashTransferState fromValue(int value) {
                return IsaCashTransferState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: IsaCashTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lwindsor/transactions/v1/IsaCashTransferState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lwindsor/transactions/v1/IsaCashTransferState;", "fromValue", "value", "", "windsor.v1.transactions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IsaCashTransferState fromValue(int value) {
            switch (value) {
                case 0:
                    return IsaCashTransferState.ISA_STATUS_UNSPECIFIED;
                case 1:
                    return IsaCashTransferState.PENDING_FILE_GENERATION;
                case 2:
                    return IsaCashTransferState.FILE_GENERATED;
                case 3:
                    return IsaCashTransferState.PENDING_QUAI_UPLOAD;
                case 4:
                    return IsaCashTransferState.FILE_UPLOADED;
                case 5:
                    return IsaCashTransferState.PENDING_MORE_INFORMATION;
                case 6:
                    return IsaCashTransferState.LANDED;
                case 7:
                    return IsaCashTransferState.PENDING_REVERSAL;
                case 8:
                    return IsaCashTransferState.SUCCESS;
                case 9:
                    return IsaCashTransferState.PENDING_CANCELLATION;
                case 10:
                    return IsaCashTransferState.ISA_CASH_TRANSFER_FAILED;
                case 11:
                    return IsaCashTransferState.CANCELLED;
                case 12:
                    return IsaCashTransferState.RETURNED;
                case 13:
                    return IsaCashTransferState.CANCEL_REQUESTED;
                default:
                    return null;
            }
        }
    }

    public static IsaCashTransferState valueOf(String str) {
        return (IsaCashTransferState) Enum.valueOf(IsaCashTransferState.class, str);
    }

    public static IsaCashTransferState[] values() {
        return (IsaCashTransferState[]) $VALUES.clone();
    }
}
