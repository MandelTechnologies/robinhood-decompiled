package bff_money_movement.service.p019v1;

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
/* compiled from: BillState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/BillState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BILL_STATE_UNSPECIFIED", "BILL_STATE_PENDING", "BILL_STATE_INTERRUPTED", "BILL_STATE_SUCCEEDED", "BILL_STATE_FAILED", "BILL_STATE_CANCELED", "BILL_STATE_EXPIRED", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BillState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BillState> ADAPTER;
    public static final BillState BILL_STATE_CANCELED;
    public static final BillState BILL_STATE_EXPIRED;
    public static final BillState BILL_STATE_FAILED;
    public static final BillState BILL_STATE_INTERRUPTED;
    public static final BillState BILL_STATE_PENDING;
    public static final BillState BILL_STATE_SUCCEEDED;
    public static final BillState BILL_STATE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BillState[] $values() {
        return new BillState[]{BILL_STATE_UNSPECIFIED, BILL_STATE_PENDING, BILL_STATE_INTERRUPTED, BILL_STATE_SUCCEEDED, BILL_STATE_FAILED, BILL_STATE_CANCELED, BILL_STATE_EXPIRED};
    }

    @JvmStatic
    public static final BillState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BillState> getEntries() {
        return $ENTRIES;
    }

    private BillState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BillState billState = new BillState("BILL_STATE_UNSPECIFIED", 0, 0);
        BILL_STATE_UNSPECIFIED = billState;
        BILL_STATE_PENDING = new BillState("BILL_STATE_PENDING", 1, 1);
        BILL_STATE_INTERRUPTED = new BillState("BILL_STATE_INTERRUPTED", 2, 2);
        BILL_STATE_SUCCEEDED = new BillState("BILL_STATE_SUCCEEDED", 3, 3);
        BILL_STATE_FAILED = new BillState("BILL_STATE_FAILED", 4, 4);
        BILL_STATE_CANCELED = new BillState("BILL_STATE_CANCELED", 5, 5);
        BILL_STATE_EXPIRED = new BillState("BILL_STATE_EXPIRED", 6, 6);
        BillState[] billStateArr$values = $values();
        $VALUES = billStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(billStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BillState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BillState>(orCreateKotlinClass, syntax, billState) { // from class: bff_money_movement.service.v1.BillState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BillState fromValue(int value) {
                return BillState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BillState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/BillState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/BillState;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BillState fromValue(int value) {
            switch (value) {
                case 0:
                    return BillState.BILL_STATE_UNSPECIFIED;
                case 1:
                    return BillState.BILL_STATE_PENDING;
                case 2:
                    return BillState.BILL_STATE_INTERRUPTED;
                case 3:
                    return BillState.BILL_STATE_SUCCEEDED;
                case 4:
                    return BillState.BILL_STATE_FAILED;
                case 5:
                    return BillState.BILL_STATE_CANCELED;
                case 6:
                    return BillState.BILL_STATE_EXPIRED;
                default:
                    return null;
            }
        }
    }

    public static BillState valueOf(String str) {
        return (BillState) Enum.valueOf(BillState.class, str);
    }

    public static BillState[] values() {
        return (BillState[]) $VALUES.clone();
    }
}
