package cashier_protos.payment_hub.p046v1;

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
/* compiled from: FXTransferState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FX_TRANSFER_STATE_UNSPECIFIED", "FX_TRANSFER_STATE_NEW", "FX_TRANSFER_STATE_READY", "FX_TRANSFER_STATE_PENDING", "FX_TRANSFER_STATE_CONFIRMED", "FX_TRANSFER_STATE_SETTLED", "FX_TRANSFER_STATE_FAILED", "FX_TRANSFER_STATE_PAUSED", "FX_TRANSFER_STATE_PENDING_FX_REQ", "Companion", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class FXTransferState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FXTransferState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FXTransferState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FXTransferState FX_TRANSFER_STATE_CONFIRMED;
    public static final FXTransferState FX_TRANSFER_STATE_FAILED;
    public static final FXTransferState FX_TRANSFER_STATE_NEW;
    public static final FXTransferState FX_TRANSFER_STATE_PAUSED;
    public static final FXTransferState FX_TRANSFER_STATE_PENDING;
    public static final FXTransferState FX_TRANSFER_STATE_PENDING_FX_REQ;
    public static final FXTransferState FX_TRANSFER_STATE_READY;
    public static final FXTransferState FX_TRANSFER_STATE_SETTLED;
    public static final FXTransferState FX_TRANSFER_STATE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ FXTransferState[] $values() {
        return new FXTransferState[]{FX_TRANSFER_STATE_UNSPECIFIED, FX_TRANSFER_STATE_NEW, FX_TRANSFER_STATE_READY, FX_TRANSFER_STATE_PENDING, FX_TRANSFER_STATE_CONFIRMED, FX_TRANSFER_STATE_SETTLED, FX_TRANSFER_STATE_FAILED, FX_TRANSFER_STATE_PAUSED, FX_TRANSFER_STATE_PENDING_FX_REQ};
    }

    @JvmStatic
    public static final FXTransferState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FXTransferState> getEntries() {
        return $ENTRIES;
    }

    private FXTransferState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FXTransferState fXTransferState = new FXTransferState("FX_TRANSFER_STATE_UNSPECIFIED", 0, 0);
        FX_TRANSFER_STATE_UNSPECIFIED = fXTransferState;
        FX_TRANSFER_STATE_NEW = new FXTransferState("FX_TRANSFER_STATE_NEW", 1, 1);
        FX_TRANSFER_STATE_READY = new FXTransferState("FX_TRANSFER_STATE_READY", 2, 2);
        FX_TRANSFER_STATE_PENDING = new FXTransferState("FX_TRANSFER_STATE_PENDING", 3, 3);
        FX_TRANSFER_STATE_CONFIRMED = new FXTransferState("FX_TRANSFER_STATE_CONFIRMED", 4, 4);
        FX_TRANSFER_STATE_SETTLED = new FXTransferState("FX_TRANSFER_STATE_SETTLED", 5, 5);
        FX_TRANSFER_STATE_FAILED = new FXTransferState("FX_TRANSFER_STATE_FAILED", 6, 6);
        FX_TRANSFER_STATE_PAUSED = new FXTransferState("FX_TRANSFER_STATE_PAUSED", 7, 7);
        FX_TRANSFER_STATE_PENDING_FX_REQ = new FXTransferState("FX_TRANSFER_STATE_PENDING_FX_REQ", 8, 8);
        FXTransferState[] fXTransferStateArr$values = $values();
        $VALUES = fXTransferStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fXTransferStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FXTransferState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FXTransferState>(orCreateKotlinClass, syntax, fXTransferState) { // from class: cashier_protos.payment_hub.v1.FXTransferState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FXTransferState fromValue(int value) {
                return FXTransferState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FXTransferState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcashier_protos/payment_hub/v1/FXTransferState;", "fromValue", "value", "", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FXTransferState fromValue(int value) {
            switch (value) {
                case 0:
                    return FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED;
                case 1:
                    return FXTransferState.FX_TRANSFER_STATE_NEW;
                case 2:
                    return FXTransferState.FX_TRANSFER_STATE_READY;
                case 3:
                    return FXTransferState.FX_TRANSFER_STATE_PENDING;
                case 4:
                    return FXTransferState.FX_TRANSFER_STATE_CONFIRMED;
                case 5:
                    return FXTransferState.FX_TRANSFER_STATE_SETTLED;
                case 6:
                    return FXTransferState.FX_TRANSFER_STATE_FAILED;
                case 7:
                    return FXTransferState.FX_TRANSFER_STATE_PAUSED;
                case 8:
                    return FXTransferState.FX_TRANSFER_STATE_PENDING_FX_REQ;
                default:
                    return null;
            }
        }
    }

    public static FXTransferState valueOf(String str) {
        return (FXTransferState) Enum.valueOf(FXTransferState.class, str);
    }

    public static FXTransferState[] values() {
        return (FXTransferState[]) $VALUES.clone();
    }
}
