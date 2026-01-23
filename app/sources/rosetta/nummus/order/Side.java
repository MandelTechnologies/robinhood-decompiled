package rosetta.nummus.order;

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
/* compiled from: Side.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrosetta/nummus/order/Side;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SIDE__UNSPECIFIED", "SIDE_BUY", "SIDE_SELL", "Companion", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Side implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Side[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Side> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Side SIDE_BUY;
    public static final Side SIDE_SELL;
    public static final Side SIDE__UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ Side[] $values() {
        return new Side[]{SIDE__UNSPECIFIED, SIDE_BUY, SIDE_SELL};
    }

    @JvmStatic
    public static final Side fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Side> getEntries() {
        return $ENTRIES;
    }

    private Side(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Side side = new Side("SIDE__UNSPECIFIED", 0, 0);
        SIDE__UNSPECIFIED = side;
        SIDE_BUY = new Side("SIDE_BUY", 1, 1);
        SIDE_SELL = new Side("SIDE_SELL", 2, 2);
        Side[] sideArr$values = $values();
        $VALUES = sideArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sideArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Side.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Side>(orCreateKotlinClass, syntax, side) { // from class: rosetta.nummus.order.Side$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Side fromValue(int value) {
                return Side.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Side.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/order/Side$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/order/Side;", "fromValue", "value", "", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Side fromValue(int value) {
            if (value == 0) {
                return Side.SIDE__UNSPECIFIED;
            }
            if (value == 1) {
                return Side.SIDE_BUY;
            }
            if (value != 2) {
                return null;
            }
            return Side.SIDE_SELL;
        }
    }

    public static Side valueOf(String str) {
        return (Side) Enum.valueOf(Side.class, str);
    }

    public static Side[] values() {
        return (Side[]) $VALUES.clone();
    }
}
