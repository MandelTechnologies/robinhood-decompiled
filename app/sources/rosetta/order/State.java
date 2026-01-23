package rosetta.order;

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
/* compiled from: State.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, m3636d2 = {"Lrosetta/order/State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "QUEUED", "NEW", "UNCONFIRMED", "CONFIRMED", "PARTIALLY_FILLED", "FILLED", "REJECTED", "CANCELED", "FAILED", "VOIDED", "PENDING_CANCELED", "PARTIALLY_FILLED_REST_CANCELED", "INACTIVE", "LOCATE_COMPLETED", "STATE_LOCATING", "STATE_LOCATE_FAILED", "Companion", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class State implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;

    @JvmField
    public static final ProtoAdapter<State> ADAPTER;
    public static final State CANCELED;
    public static final State CONFIRMED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final State FAILED;
    public static final State FILLED;
    public static final State INACTIVE;
    public static final State LOCATE_COMPLETED;
    public static final State NEW;
    public static final State PARTIALLY_FILLED;
    public static final State PARTIALLY_FILLED_REST_CANCELED;
    public static final State PENDING_CANCELED;
    public static final State QUEUED;
    public static final State REJECTED;
    public static final State STATE_LOCATE_FAILED;
    public static final State STATE_LOCATING;
    public static final State STATE_UNSPECIFIED;
    public static final State UNCONFIRMED;
    public static final State VOIDED;
    private final int value;

    private static final /* synthetic */ State[] $values() {
        return new State[]{STATE_UNSPECIFIED, QUEUED, NEW, UNCONFIRMED, CONFIRMED, PARTIALLY_FILLED, FILLED, REJECTED, CANCELED, FAILED, VOIDED, PENDING_CANCELED, PARTIALLY_FILLED_REST_CANCELED, INACTIVE, LOCATE_COMPLETED, STATE_LOCATING, STATE_LOCATE_FAILED};
    }

    @JvmStatic
    public static final State fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<State> getEntries() {
        return $ENTRIES;
    }

    private State(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final State state = new State("STATE_UNSPECIFIED", 0, 0);
        STATE_UNSPECIFIED = state;
        QUEUED = new State("QUEUED", 1, 1);
        NEW = new State("NEW", 2, 10);
        UNCONFIRMED = new State("UNCONFIRMED", 3, 2);
        CONFIRMED = new State("CONFIRMED", 4, 3);
        PARTIALLY_FILLED = new State("PARTIALLY_FILLED", 5, 4);
        FILLED = new State("FILLED", 6, 5);
        REJECTED = new State("REJECTED", 7, 6);
        CANCELED = new State("CANCELED", 8, 7);
        FAILED = new State("FAILED", 9, 8);
        VOIDED = new State("VOIDED", 10, 9);
        PENDING_CANCELED = new State("PENDING_CANCELED", 11, 11);
        PARTIALLY_FILLED_REST_CANCELED = new State("PARTIALLY_FILLED_REST_CANCELED", 12, 13);
        INACTIVE = new State("INACTIVE", 13, 14);
        LOCATE_COMPLETED = new State("LOCATE_COMPLETED", 14, 15);
        STATE_LOCATING = new State("STATE_LOCATING", 15, 16);
        STATE_LOCATE_FAILED = new State("STATE_LOCATE_FAILED", 16, 17);
        State[] stateArr$values = $values();
        $VALUES = stateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: rosetta.order.State$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public State fromValue(int value) {
                return State.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: State.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/order/State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/order/State;", "fromValue", "value", "", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final State fromValue(int value) {
            switch (value) {
                case 0:
                    return State.STATE_UNSPECIFIED;
                case 1:
                    return State.QUEUED;
                case 2:
                    return State.UNCONFIRMED;
                case 3:
                    return State.CONFIRMED;
                case 4:
                    return State.PARTIALLY_FILLED;
                case 5:
                    return State.FILLED;
                case 6:
                    return State.REJECTED;
                case 7:
                    return State.CANCELED;
                case 8:
                    return State.FAILED;
                case 9:
                    return State.VOIDED;
                case 10:
                    return State.NEW;
                case 11:
                    return State.PENDING_CANCELED;
                case 12:
                default:
                    return null;
                case 13:
                    return State.PARTIALLY_FILLED_REST_CANCELED;
                case 14:
                    return State.INACTIVE;
                case 15:
                    return State.LOCATE_COMPLETED;
                case 16:
                    return State.STATE_LOCATING;
                case 17:
                    return State.STATE_LOCATE_FAILED;
            }
        }
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }
}
