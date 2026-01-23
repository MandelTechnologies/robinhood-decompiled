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
/* compiled from: Type.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/nummus/order/Type;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE__UNSPECIFIED", "TYPE_LIMIT", "TYPE_MARKET", "TYPE_STOP_LOSS", "TYPE_STOP_LIMIT", "Companion", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Type implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Type> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Type TYPE_LIMIT;
    public static final Type TYPE_MARKET;
    public static final Type TYPE_STOP_LIMIT;
    public static final Type TYPE_STOP_LOSS;
    public static final Type TYPE__UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ Type[] $values() {
        return new Type[]{TYPE__UNSPECIFIED, TYPE_LIMIT, TYPE_MARKET, TYPE_STOP_LOSS, TYPE_STOP_LIMIT};
    }

    @JvmStatic
    public static final Type fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Type> getEntries() {
        return $ENTRIES;
    }

    private Type(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Type type2 = new Type("TYPE__UNSPECIFIED", 0, 0);
        TYPE__UNSPECIFIED = type2;
        TYPE_LIMIT = new Type("TYPE_LIMIT", 1, 1);
        TYPE_MARKET = new Type("TYPE_MARKET", 2, 2);
        TYPE_STOP_LOSS = new Type("TYPE_STOP_LOSS", 3, 3);
        TYPE_STOP_LIMIT = new Type("TYPE_STOP_LIMIT", 4, 4);
        Type[] typeArr$values = $values();
        $VALUES = typeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(typeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Type.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Type>(orCreateKotlinClass, syntax, type2) { // from class: rosetta.nummus.order.Type$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Type fromValue(int value) {
                return Type.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Type.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/order/Type$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/order/Type;", "fromValue", "value", "", "rosetta.nummus.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Type fromValue(int value) {
            if (value == 0) {
                return Type.TYPE__UNSPECIFIED;
            }
            if (value == 1) {
                return Type.TYPE_LIMIT;
            }
            if (value == 2) {
                return Type.TYPE_MARKET;
            }
            if (value == 3) {
                return Type.TYPE_STOP_LOSS;
            }
            if (value != 4) {
                return null;
            }
            return Type.TYPE_STOP_LIMIT;
        }
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }
}
