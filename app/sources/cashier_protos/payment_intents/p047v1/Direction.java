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
/* compiled from: Direction.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/Direction;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIRECTION_UNSPECIFIED", "DIRECTION_DEPOSIT", "DIRECTION_WITHDRAW", "Companion", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Direction implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Direction> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Direction DIRECTION_DEPOSIT;
    public static final Direction DIRECTION_UNSPECIFIED;
    public static final Direction DIRECTION_WITHDRAW;
    private final int value;

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{DIRECTION_UNSPECIFIED, DIRECTION_DEPOSIT, DIRECTION_WITHDRAW};
    }

    @JvmStatic
    public static final Direction fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Direction> getEntries() {
        return $ENTRIES;
    }

    private Direction(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Direction direction = new Direction("DIRECTION_UNSPECIFIED", 0, 0);
        DIRECTION_UNSPECIFIED = direction;
        DIRECTION_DEPOSIT = new Direction("DIRECTION_DEPOSIT", 1, 1);
        DIRECTION_WITHDRAW = new Direction("DIRECTION_WITHDRAW", 2, 2);
        Direction[] directionArr$values = $values();
        $VALUES = directionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(directionArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Direction.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Direction>(orCreateKotlinClass, syntax, direction) { // from class: cashier_protos.payment_intents.v1.Direction$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Direction fromValue(int value) {
                return Direction.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Direction.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/Direction$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcashier_protos/payment_intents/v1/Direction;", "fromValue", "value", "", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Direction fromValue(int value) {
            if (value == 0) {
                return Direction.DIRECTION_UNSPECIFIED;
            }
            if (value == 1) {
                return Direction.DIRECTION_DEPOSIT;
            }
            if (value != 2) {
                return null;
            }
            return Direction.DIRECTION_WITHDRAW;
        }
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
