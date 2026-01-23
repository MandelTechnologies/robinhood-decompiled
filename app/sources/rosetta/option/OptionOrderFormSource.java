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
/* compiled from: OptionOrderFormSource.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00182\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, m3636d2 = {"Lrosetta/option/OptionOrderFormSource;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OPTION_ORDER_FORM_SOURCE_UNSPECIFIED", "OPTION_CHAIN", "INSTRUMENT_DETAIL", "AGGREGATE_POSITION_DETAIL", "STRATEGY_DETAIL", "ORDER_DETAIL", "ACTIVITY_ITEM", "STRATEGY_ROLL", "STRATEGY_CHAIN", "SIMULATED_RETURNS", "HOME_TAB", "ASSET_HOME", "RETIREMENT_HOME", "ORDER_FORM_FLYOVER", "SOCIAL_POST", "Companion", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class OptionOrderFormSource implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionOrderFormSource[] $VALUES;
    public static final OptionOrderFormSource ACTIVITY_ITEM;

    @JvmField
    public static final ProtoAdapter<OptionOrderFormSource> ADAPTER;
    public static final OptionOrderFormSource AGGREGATE_POSITION_DETAIL;
    public static final OptionOrderFormSource ASSET_HOME;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OptionOrderFormSource HOME_TAB;
    public static final OptionOrderFormSource INSTRUMENT_DETAIL;
    public static final OptionOrderFormSource OPTION_CHAIN;
    public static final OptionOrderFormSource OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
    public static final OptionOrderFormSource ORDER_DETAIL;
    public static final OptionOrderFormSource ORDER_FORM_FLYOVER;
    public static final OptionOrderFormSource RETIREMENT_HOME;
    public static final OptionOrderFormSource SIMULATED_RETURNS;
    public static final OptionOrderFormSource SOCIAL_POST;
    public static final OptionOrderFormSource STRATEGY_CHAIN;
    public static final OptionOrderFormSource STRATEGY_DETAIL;
    public static final OptionOrderFormSource STRATEGY_ROLL;
    private final int value;

    private static final /* synthetic */ OptionOrderFormSource[] $values() {
        return new OptionOrderFormSource[]{OPTION_ORDER_FORM_SOURCE_UNSPECIFIED, OPTION_CHAIN, INSTRUMENT_DETAIL, AGGREGATE_POSITION_DETAIL, STRATEGY_DETAIL, ORDER_DETAIL, ACTIVITY_ITEM, STRATEGY_ROLL, STRATEGY_CHAIN, SIMULATED_RETURNS, HOME_TAB, ASSET_HOME, RETIREMENT_HOME, ORDER_FORM_FLYOVER, SOCIAL_POST};
    }

    @JvmStatic
    public static final OptionOrderFormSource fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OptionOrderFormSource> getEntries() {
        return $ENTRIES;
    }

    private OptionOrderFormSource(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OptionOrderFormSource optionOrderFormSource = new OptionOrderFormSource("OPTION_ORDER_FORM_SOURCE_UNSPECIFIED", 0, 0);
        OPTION_ORDER_FORM_SOURCE_UNSPECIFIED = optionOrderFormSource;
        OPTION_CHAIN = new OptionOrderFormSource("OPTION_CHAIN", 1, 1);
        INSTRUMENT_DETAIL = new OptionOrderFormSource("INSTRUMENT_DETAIL", 2, 2);
        AGGREGATE_POSITION_DETAIL = new OptionOrderFormSource("AGGREGATE_POSITION_DETAIL", 3, 3);
        STRATEGY_DETAIL = new OptionOrderFormSource("STRATEGY_DETAIL", 4, 4);
        ORDER_DETAIL = new OptionOrderFormSource("ORDER_DETAIL", 5, 5);
        ACTIVITY_ITEM = new OptionOrderFormSource("ACTIVITY_ITEM", 6, 6);
        STRATEGY_ROLL = new OptionOrderFormSource("STRATEGY_ROLL", 7, 7);
        STRATEGY_CHAIN = new OptionOrderFormSource("STRATEGY_CHAIN", 8, 8);
        SIMULATED_RETURNS = new OptionOrderFormSource("SIMULATED_RETURNS", 9, 9);
        HOME_TAB = new OptionOrderFormSource("HOME_TAB", 10, 10);
        ASSET_HOME = new OptionOrderFormSource("ASSET_HOME", 11, 11);
        RETIREMENT_HOME = new OptionOrderFormSource("RETIREMENT_HOME", 12, 12);
        ORDER_FORM_FLYOVER = new OptionOrderFormSource("ORDER_FORM_FLYOVER", 13, 13);
        SOCIAL_POST = new OptionOrderFormSource("SOCIAL_POST", 14, 14);
        OptionOrderFormSource[] optionOrderFormSourceArr$values = $values();
        $VALUES = optionOrderFormSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionOrderFormSourceArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionOrderFormSource.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OptionOrderFormSource>(orCreateKotlinClass, syntax, optionOrderFormSource) { // from class: rosetta.option.OptionOrderFormSource$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OptionOrderFormSource fromValue(int value) {
                return OptionOrderFormSource.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OptionOrderFormSource.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/option/OptionOrderFormSource$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/option/OptionOrderFormSource;", "fromValue", "value", "", "rosetta.option_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionOrderFormSource fromValue(int value) {
            switch (value) {
                case 0:
                    return OptionOrderFormSource.OPTION_ORDER_FORM_SOURCE_UNSPECIFIED;
                case 1:
                    return OptionOrderFormSource.OPTION_CHAIN;
                case 2:
                    return OptionOrderFormSource.INSTRUMENT_DETAIL;
                case 3:
                    return OptionOrderFormSource.AGGREGATE_POSITION_DETAIL;
                case 4:
                    return OptionOrderFormSource.STRATEGY_DETAIL;
                case 5:
                    return OptionOrderFormSource.ORDER_DETAIL;
                case 6:
                    return OptionOrderFormSource.ACTIVITY_ITEM;
                case 7:
                    return OptionOrderFormSource.STRATEGY_ROLL;
                case 8:
                    return OptionOrderFormSource.STRATEGY_CHAIN;
                case 9:
                    return OptionOrderFormSource.SIMULATED_RETURNS;
                case 10:
                    return OptionOrderFormSource.HOME_TAB;
                case 11:
                    return OptionOrderFormSource.ASSET_HOME;
                case 12:
                    return OptionOrderFormSource.RETIREMENT_HOME;
                case 13:
                    return OptionOrderFormSource.ORDER_FORM_FLYOVER;
                case 14:
                    return OptionOrderFormSource.SOCIAL_POST;
                default:
                    return null;
            }
        }
    }

    public static OptionOrderFormSource valueOf(String str) {
        return (OptionOrderFormSource) Enum.valueOf(OptionOrderFormSource.class, str);
    }

    public static OptionOrderFormSource[] values() {
        return (OptionOrderFormSource[]) $VALUES.clone();
    }
}
