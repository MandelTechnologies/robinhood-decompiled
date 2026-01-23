package rosetta.option;

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
/* compiled from: StrategyName.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b.\b\u0086\u0081\u0002\u0018\u0000 12\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, m3636d2 = {"Lrosetta/option/StrategyName;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STRATEGY_NAME_UNSPECIFIED", "LONG_CALL_SPREAD", "SHORT_CALL_SPREAD", "LONG_PUT_SPREAD", "SHORT_PUT_SPREAD", "LONG_CALL_CALENDAR_SPREAD", "LONG_PUT_CALENDAR_SPREAD", "LONG_STRADDLE", "LONG_STRANGLE", "SHORT_IRON_CONDOR", "LONG_CALL", "SHORT_CALL", "LONG_PUT", "SHORT_PUT", "CUSTOM", "SHORT_STRADDLE", "SHORT_STRANGLE", "LONG_IRON_CONDOR", "LONG_IRON_BUTTERFLY", "SHORT_IRON_BUTTERFLY", "LONG_BUTTERFLY_CALL", "SHORT_BUTTERFLY_CALL", "LONG_BUTTERFLY_PUT", "SHORT_BUTTERFLY_PUT", "LONG_CONDOR_CALL", "SHORT_CONDOR_CALL", "LONG_CONDOR_PUT", "SHORT_CONDOR_PUT", "BACK_SPREAD_PUT", "BACK_SPREAD_CALL", "FRONT_SPREAD_CALL", "FRONT_SPREAD_PUT", "SHORT_CALL_CALENDAR_SPREAD", "SHORT_PUT_CALENDAR_SPREAD", "CALL_CALENDAR_SPREAD", "PUT_CALENDAR_SPREAD", "STRADDLE", "STRANGLE", "IRON_CONDOR", "IRON_BUTTERFLY", "Companion", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StrategyName implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrategyName[] $VALUES;

    @JvmField
    public static final ProtoAdapter<StrategyName> ADAPTER;
    public static final StrategyName BACK_SPREAD_CALL;
    public static final StrategyName BACK_SPREAD_PUT;
    public static final StrategyName CALL_CALENDAR_SPREAD;
    public static final StrategyName CUSTOM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final StrategyName FRONT_SPREAD_CALL;
    public static final StrategyName FRONT_SPREAD_PUT;
    public static final StrategyName IRON_BUTTERFLY;
    public static final StrategyName IRON_CONDOR;
    public static final StrategyName LONG_BUTTERFLY_CALL;
    public static final StrategyName LONG_BUTTERFLY_PUT;
    public static final StrategyName LONG_CALL;
    public static final StrategyName LONG_CALL_CALENDAR_SPREAD;
    public static final StrategyName LONG_CALL_SPREAD;
    public static final StrategyName LONG_CONDOR_CALL;
    public static final StrategyName LONG_CONDOR_PUT;
    public static final StrategyName LONG_IRON_BUTTERFLY;
    public static final StrategyName LONG_IRON_CONDOR;
    public static final StrategyName LONG_PUT;
    public static final StrategyName LONG_PUT_CALENDAR_SPREAD;
    public static final StrategyName LONG_PUT_SPREAD;
    public static final StrategyName LONG_STRADDLE;
    public static final StrategyName LONG_STRANGLE;
    public static final StrategyName PUT_CALENDAR_SPREAD;
    public static final StrategyName SHORT_BUTTERFLY_CALL;
    public static final StrategyName SHORT_BUTTERFLY_PUT;
    public static final StrategyName SHORT_CALL;
    public static final StrategyName SHORT_CALL_CALENDAR_SPREAD;
    public static final StrategyName SHORT_CALL_SPREAD;
    public static final StrategyName SHORT_CONDOR_CALL;
    public static final StrategyName SHORT_CONDOR_PUT;
    public static final StrategyName SHORT_IRON_BUTTERFLY;
    public static final StrategyName SHORT_IRON_CONDOR;
    public static final StrategyName SHORT_PUT;
    public static final StrategyName SHORT_PUT_CALENDAR_SPREAD;
    public static final StrategyName SHORT_PUT_SPREAD;
    public static final StrategyName SHORT_STRADDLE;
    public static final StrategyName SHORT_STRANGLE;
    public static final StrategyName STRADDLE;
    public static final StrategyName STRANGLE;
    public static final StrategyName STRATEGY_NAME_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ StrategyName[] $values() {
        return new StrategyName[]{STRATEGY_NAME_UNSPECIFIED, LONG_CALL_SPREAD, SHORT_CALL_SPREAD, LONG_PUT_SPREAD, SHORT_PUT_SPREAD, LONG_CALL_CALENDAR_SPREAD, LONG_PUT_CALENDAR_SPREAD, LONG_STRADDLE, LONG_STRANGLE, SHORT_IRON_CONDOR, LONG_CALL, SHORT_CALL, LONG_PUT, SHORT_PUT, CUSTOM, SHORT_STRADDLE, SHORT_STRANGLE, LONG_IRON_CONDOR, LONG_IRON_BUTTERFLY, SHORT_IRON_BUTTERFLY, LONG_BUTTERFLY_CALL, SHORT_BUTTERFLY_CALL, LONG_BUTTERFLY_PUT, SHORT_BUTTERFLY_PUT, LONG_CONDOR_CALL, SHORT_CONDOR_CALL, LONG_CONDOR_PUT, SHORT_CONDOR_PUT, BACK_SPREAD_PUT, BACK_SPREAD_CALL, FRONT_SPREAD_CALL, FRONT_SPREAD_PUT, SHORT_CALL_CALENDAR_SPREAD, SHORT_PUT_CALENDAR_SPREAD, CALL_CALENDAR_SPREAD, PUT_CALENDAR_SPREAD, STRADDLE, STRANGLE, IRON_CONDOR, IRON_BUTTERFLY};
    }

    @JvmStatic
    public static final StrategyName fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<StrategyName> getEntries() {
        return $ENTRIES;
    }

    private StrategyName(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final StrategyName strategyName = new StrategyName("STRATEGY_NAME_UNSPECIFIED", 0, 0);
        STRATEGY_NAME_UNSPECIFIED = strategyName;
        LONG_CALL_SPREAD = new StrategyName("LONG_CALL_SPREAD", 1, 1);
        SHORT_CALL_SPREAD = new StrategyName("SHORT_CALL_SPREAD", 2, 2);
        LONG_PUT_SPREAD = new StrategyName("LONG_PUT_SPREAD", 3, 3);
        SHORT_PUT_SPREAD = new StrategyName("SHORT_PUT_SPREAD", 4, 4);
        LONG_CALL_CALENDAR_SPREAD = new StrategyName("LONG_CALL_CALENDAR_SPREAD", 5, 5);
        LONG_PUT_CALENDAR_SPREAD = new StrategyName("LONG_PUT_CALENDAR_SPREAD", 6, 6);
        LONG_STRADDLE = new StrategyName("LONG_STRADDLE", 7, 7);
        LONG_STRANGLE = new StrategyName("LONG_STRANGLE", 8, 8);
        SHORT_IRON_CONDOR = new StrategyName("SHORT_IRON_CONDOR", 9, 9);
        LONG_CALL = new StrategyName("LONG_CALL", 10, 10);
        SHORT_CALL = new StrategyName("SHORT_CALL", 11, 11);
        LONG_PUT = new StrategyName("LONG_PUT", 12, 12);
        SHORT_PUT = new StrategyName("SHORT_PUT", 13, 13);
        CUSTOM = new StrategyName("CUSTOM", 14, 14);
        SHORT_STRADDLE = new StrategyName("SHORT_STRADDLE", 15, 15);
        SHORT_STRANGLE = new StrategyName("SHORT_STRANGLE", 16, 16);
        LONG_IRON_CONDOR = new StrategyName("LONG_IRON_CONDOR", 17, 17);
        LONG_IRON_BUTTERFLY = new StrategyName("LONG_IRON_BUTTERFLY", 18, 18);
        SHORT_IRON_BUTTERFLY = new StrategyName("SHORT_IRON_BUTTERFLY", 19, 19);
        LONG_BUTTERFLY_CALL = new StrategyName("LONG_BUTTERFLY_CALL", 20, 20);
        SHORT_BUTTERFLY_CALL = new StrategyName("SHORT_BUTTERFLY_CALL", 21, 21);
        LONG_BUTTERFLY_PUT = new StrategyName("LONG_BUTTERFLY_PUT", 22, 22);
        SHORT_BUTTERFLY_PUT = new StrategyName("SHORT_BUTTERFLY_PUT", 23, 23);
        LONG_CONDOR_CALL = new StrategyName("LONG_CONDOR_CALL", 24, 24);
        SHORT_CONDOR_CALL = new StrategyName("SHORT_CONDOR_CALL", 25, 25);
        LONG_CONDOR_PUT = new StrategyName("LONG_CONDOR_PUT", 26, 26);
        SHORT_CONDOR_PUT = new StrategyName("SHORT_CONDOR_PUT", 27, 27);
        BACK_SPREAD_PUT = new StrategyName("BACK_SPREAD_PUT", 28, 28);
        BACK_SPREAD_CALL = new StrategyName("BACK_SPREAD_CALL", 29, 29);
        FRONT_SPREAD_CALL = new StrategyName("FRONT_SPREAD_CALL", 30, 30);
        FRONT_SPREAD_PUT = new StrategyName("FRONT_SPREAD_PUT", 31, 31);
        SHORT_CALL_CALENDAR_SPREAD = new StrategyName("SHORT_CALL_CALENDAR_SPREAD", 32, 32);
        SHORT_PUT_CALENDAR_SPREAD = new StrategyName("SHORT_PUT_CALENDAR_SPREAD", 33, 33);
        CALL_CALENDAR_SPREAD = new StrategyName("CALL_CALENDAR_SPREAD", 34, 5);
        PUT_CALENDAR_SPREAD = new StrategyName("PUT_CALENDAR_SPREAD", 35, 6);
        STRADDLE = new StrategyName("STRADDLE", 36, 7);
        STRANGLE = new StrategyName("STRANGLE", 37, 8);
        IRON_CONDOR = new StrategyName("IRON_CONDOR", 38, 9);
        IRON_BUTTERFLY = new StrategyName("IRON_BUTTERFLY", 39, 19);
        StrategyName[] strategyNameArr$values = $values();
        $VALUES = strategyNameArr$values;
        $ENTRIES = EnumEntries2.enumEntries(strategyNameArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StrategyName.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<StrategyName>(orCreateKotlinClass, syntax, strategyName) { // from class: rosetta.option.StrategyName$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public StrategyName fromValue(int value) {
                return StrategyName.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: StrategyName.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/option/StrategyName$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/option/StrategyName;", "fromValue", "value", "", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StrategyName fromValue(int value) {
            switch (value) {
                case 0:
                    return StrategyName.STRATEGY_NAME_UNSPECIFIED;
                case 1:
                    return StrategyName.LONG_CALL_SPREAD;
                case 2:
                    return StrategyName.SHORT_CALL_SPREAD;
                case 3:
                    return StrategyName.LONG_PUT_SPREAD;
                case 4:
                    return StrategyName.SHORT_PUT_SPREAD;
                case 5:
                    return StrategyName.LONG_CALL_CALENDAR_SPREAD;
                case 6:
                    return StrategyName.LONG_PUT_CALENDAR_SPREAD;
                case 7:
                    return StrategyName.LONG_STRADDLE;
                case 8:
                    return StrategyName.LONG_STRANGLE;
                case 9:
                    return StrategyName.SHORT_IRON_CONDOR;
                case 10:
                    return StrategyName.LONG_CALL;
                case 11:
                    return StrategyName.SHORT_CALL;
                case 12:
                    return StrategyName.LONG_PUT;
                case 13:
                    return StrategyName.SHORT_PUT;
                case 14:
                    return StrategyName.CUSTOM;
                case 15:
                    return StrategyName.SHORT_STRADDLE;
                case 16:
                    return StrategyName.SHORT_STRANGLE;
                case 17:
                    return StrategyName.LONG_IRON_CONDOR;
                case 18:
                    return StrategyName.LONG_IRON_BUTTERFLY;
                case 19:
                    return StrategyName.SHORT_IRON_BUTTERFLY;
                case 20:
                    return StrategyName.LONG_BUTTERFLY_CALL;
                case 21:
                    return StrategyName.SHORT_BUTTERFLY_CALL;
                case 22:
                    return StrategyName.LONG_BUTTERFLY_PUT;
                case 23:
                    return StrategyName.SHORT_BUTTERFLY_PUT;
                case 24:
                    return StrategyName.LONG_CONDOR_CALL;
                case 25:
                    return StrategyName.SHORT_CONDOR_CALL;
                case 26:
                    return StrategyName.LONG_CONDOR_PUT;
                case 27:
                    return StrategyName.SHORT_CONDOR_PUT;
                case 28:
                    return StrategyName.BACK_SPREAD_PUT;
                case 29:
                    return StrategyName.BACK_SPREAD_CALL;
                case 30:
                    return StrategyName.FRONT_SPREAD_CALL;
                case 31:
                    return StrategyName.FRONT_SPREAD_PUT;
                case 32:
                    return StrategyName.SHORT_CALL_CALENDAR_SPREAD;
                case 33:
                    return StrategyName.SHORT_PUT_CALENDAR_SPREAD;
                default:
                    return null;
            }
        }
    }

    public static StrategyName valueOf(String str) {
        return (StrategyName) Enum.valueOf(StrategyName.class, str);
    }

    public static StrategyName[] values() {
        return (StrategyName[]) $VALUES.clone();
    }
}
