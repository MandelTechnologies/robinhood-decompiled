package cashier_protos.payment_intents.p047v1;

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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/State;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "STATE_NEW", "STATE_SCHEDULED", "STATE_PENDING", "STATE_FAILED", "STATE_CANCELED", "STATE_REVERSED", "STATE_COMPLETED", "STATE_PAUSED", "STATE_PENDING_REVERSE", "Companion", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class State implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ State[] $VALUES;

    @JvmField
    public static final ProtoAdapter<State> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final State STATE_CANCELED;
    public static final State STATE_COMPLETED;
    public static final State STATE_FAILED;
    public static final State STATE_NEW;
    public static final State STATE_PAUSED;
    public static final State STATE_PENDING;
    public static final State STATE_PENDING_REVERSE;
    public static final State STATE_REVERSED;
    public static final State STATE_SCHEDULED;
    public static final State STATE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ State[] $values() {
        return new State[]{STATE_UNSPECIFIED, STATE_NEW, STATE_SCHEDULED, STATE_PENDING, STATE_FAILED, STATE_CANCELED, STATE_REVERSED, STATE_COMPLETED, STATE_PAUSED, STATE_PENDING_REVERSE};
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
        STATE_NEW = new State("STATE_NEW", 1, 1);
        STATE_SCHEDULED = new State("STATE_SCHEDULED", 2, 2);
        STATE_PENDING = new State("STATE_PENDING", 3, 3);
        STATE_FAILED = new State("STATE_FAILED", 4, 4);
        STATE_CANCELED = new State("STATE_CANCELED", 5, 5);
        STATE_REVERSED = new State("STATE_REVERSED", 6, 6);
        STATE_COMPLETED = new State("STATE_COMPLETED", 7, 7);
        STATE_PAUSED = new State("STATE_PAUSED", 8, 8);
        STATE_PENDING_REVERSE = new State("STATE_PENDING_REVERSE", 9, 9);
        State[] stateArr$values = $values();
        $VALUES = stateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(State.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<State>(orCreateKotlinClass, syntax, state) { // from class: cashier_protos.payment_intents.v1.State$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public State fromValue(int value) {
                return State.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: State.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/State$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcashier_protos/payment_intents/v1/State;", "fromValue", "value", "", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    return State.STATE_NEW;
                case 2:
                    return State.STATE_SCHEDULED;
                case 3:
                    return State.STATE_PENDING;
                case 4:
                    return State.STATE_FAILED;
                case 5:
                    return State.STATE_CANCELED;
                case 6:
                    return State.STATE_REVERSED;
                case 7:
                    return State.STATE_COMPLETED;
                case 8:
                    return State.STATE_PAUSED;
                case 9:
                    return State.STATE_PENDING_REVERSE;
                default:
                    return null;
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
