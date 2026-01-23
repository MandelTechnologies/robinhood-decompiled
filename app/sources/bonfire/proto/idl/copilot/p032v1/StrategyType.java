package bonfire.proto.idl.copilot.p032v1;

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
/* compiled from: StrategyType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/StrategyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STRATEGY_UNSPECIFIED", "LONG_CALL", "SHORT_CALL", "LONG_PUT", "SHORT_PUT", "LONG_CALL_SPREAD", "SHORT_CALL_SPREAD", "LONG_PUT_SPREAD", "SHORT_PUT_SPREAD", "LONG_IRON_BUTTERFLY", "SHORT_IRON_BUTTERFLY", "LONG_IRON_CONDOR", "SHORT_IRON_CONDOR", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class StrategyType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrategyType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<StrategyType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final StrategyType LONG_CALL;
    public static final StrategyType LONG_CALL_SPREAD;
    public static final StrategyType LONG_IRON_BUTTERFLY;
    public static final StrategyType LONG_IRON_CONDOR;
    public static final StrategyType LONG_PUT;
    public static final StrategyType LONG_PUT_SPREAD;
    public static final StrategyType SHORT_CALL;
    public static final StrategyType SHORT_CALL_SPREAD;
    public static final StrategyType SHORT_IRON_BUTTERFLY;
    public static final StrategyType SHORT_IRON_CONDOR;
    public static final StrategyType SHORT_PUT;
    public static final StrategyType SHORT_PUT_SPREAD;
    public static final StrategyType STRATEGY_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ StrategyType[] $values() {
        return new StrategyType[]{STRATEGY_UNSPECIFIED, LONG_CALL, SHORT_CALL, LONG_PUT, SHORT_PUT, LONG_CALL_SPREAD, SHORT_CALL_SPREAD, LONG_PUT_SPREAD, SHORT_PUT_SPREAD, LONG_IRON_BUTTERFLY, SHORT_IRON_BUTTERFLY, LONG_IRON_CONDOR, SHORT_IRON_CONDOR};
    }

    @JvmStatic
    public static final StrategyType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<StrategyType> getEntries() {
        return $ENTRIES;
    }

    private StrategyType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final StrategyType strategyType = new StrategyType("STRATEGY_UNSPECIFIED", 0, 0);
        STRATEGY_UNSPECIFIED = strategyType;
        LONG_CALL = new StrategyType("LONG_CALL", 1, 1);
        SHORT_CALL = new StrategyType("SHORT_CALL", 2, 2);
        LONG_PUT = new StrategyType("LONG_PUT", 3, 3);
        SHORT_PUT = new StrategyType("SHORT_PUT", 4, 4);
        LONG_CALL_SPREAD = new StrategyType("LONG_CALL_SPREAD", 5, 5);
        SHORT_CALL_SPREAD = new StrategyType("SHORT_CALL_SPREAD", 6, 6);
        LONG_PUT_SPREAD = new StrategyType("LONG_PUT_SPREAD", 7, 7);
        SHORT_PUT_SPREAD = new StrategyType("SHORT_PUT_SPREAD", 8, 8);
        LONG_IRON_BUTTERFLY = new StrategyType("LONG_IRON_BUTTERFLY", 9, 9);
        SHORT_IRON_BUTTERFLY = new StrategyType("SHORT_IRON_BUTTERFLY", 10, 10);
        LONG_IRON_CONDOR = new StrategyType("LONG_IRON_CONDOR", 11, 11);
        SHORT_IRON_CONDOR = new StrategyType("SHORT_IRON_CONDOR", 12, 12);
        StrategyType[] strategyTypeArr$values = $values();
        $VALUES = strategyTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(strategyTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StrategyType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<StrategyType>(orCreateKotlinClass, syntax, strategyType) { // from class: bonfire.proto.idl.copilot.v1.StrategyType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public StrategyType fromValue(int value) {
                return StrategyType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: StrategyType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/StrategyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/copilot/v1/StrategyType;", "fromValue", "value", "", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StrategyType fromValue(int value) {
            switch (value) {
                case 0:
                    return StrategyType.STRATEGY_UNSPECIFIED;
                case 1:
                    return StrategyType.LONG_CALL;
                case 2:
                    return StrategyType.SHORT_CALL;
                case 3:
                    return StrategyType.LONG_PUT;
                case 4:
                    return StrategyType.SHORT_PUT;
                case 5:
                    return StrategyType.LONG_CALL_SPREAD;
                case 6:
                    return StrategyType.SHORT_CALL_SPREAD;
                case 7:
                    return StrategyType.LONG_PUT_SPREAD;
                case 8:
                    return StrategyType.SHORT_PUT_SPREAD;
                case 9:
                    return StrategyType.LONG_IRON_BUTTERFLY;
                case 10:
                    return StrategyType.SHORT_IRON_BUTTERFLY;
                case 11:
                    return StrategyType.LONG_IRON_CONDOR;
                case 12:
                    return StrategyType.SHORT_IRON_CONDOR;
                default:
                    return null;
            }
        }
    }

    public static StrategyType valueOf(String str) {
        return (StrategyType) Enum.valueOf(StrategyType.class, str);
    }

    public static StrategyType[] values() {
        return (StrategyType[]) $VALUES.clone();
    }
}
