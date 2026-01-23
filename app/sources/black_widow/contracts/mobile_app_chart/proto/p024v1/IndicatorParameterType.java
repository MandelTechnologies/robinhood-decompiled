package black_widow.contracts.mobile_app_chart.proto.p024v1;

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
/* compiled from: IndicatorParameterType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INDICATOR_PARAMETER_TYPE_UNSPECIFIED", "INDICATOR_PARAMETER_TYPE_INTEGER_RANGE", "INDICATOR_PARAMETER_TYPE_DOUBLE_RANGE", "INDICATOR_PARAMETER_TYPE_BOOLEAN", "INDICATOR_PARAMETER_TYPE_STRING", "INDICATOR_PARAMETER_TYPE_PRICE_RANGE", "INDICATOR_PARAMETER_TYPE_SELECT_INPUT", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IndicatorParameterType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IndicatorParameterType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<IndicatorParameterType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IndicatorParameterType INDICATOR_PARAMETER_TYPE_BOOLEAN;
    public static final IndicatorParameterType INDICATOR_PARAMETER_TYPE_DOUBLE_RANGE;
    public static final IndicatorParameterType INDICATOR_PARAMETER_TYPE_INTEGER_RANGE;
    public static final IndicatorParameterType INDICATOR_PARAMETER_TYPE_PRICE_RANGE;
    public static final IndicatorParameterType INDICATOR_PARAMETER_TYPE_SELECT_INPUT;
    public static final IndicatorParameterType INDICATOR_PARAMETER_TYPE_STRING;
    public static final IndicatorParameterType INDICATOR_PARAMETER_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ IndicatorParameterType[] $values() {
        return new IndicatorParameterType[]{INDICATOR_PARAMETER_TYPE_UNSPECIFIED, INDICATOR_PARAMETER_TYPE_INTEGER_RANGE, INDICATOR_PARAMETER_TYPE_DOUBLE_RANGE, INDICATOR_PARAMETER_TYPE_BOOLEAN, INDICATOR_PARAMETER_TYPE_STRING, INDICATOR_PARAMETER_TYPE_PRICE_RANGE, INDICATOR_PARAMETER_TYPE_SELECT_INPUT};
    }

    @JvmStatic
    public static final IndicatorParameterType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<IndicatorParameterType> getEntries() {
        return $ENTRIES;
    }

    private IndicatorParameterType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final IndicatorParameterType indicatorParameterType = new IndicatorParameterType("INDICATOR_PARAMETER_TYPE_UNSPECIFIED", 0, 0);
        INDICATOR_PARAMETER_TYPE_UNSPECIFIED = indicatorParameterType;
        INDICATOR_PARAMETER_TYPE_INTEGER_RANGE = new IndicatorParameterType("INDICATOR_PARAMETER_TYPE_INTEGER_RANGE", 1, 1);
        INDICATOR_PARAMETER_TYPE_DOUBLE_RANGE = new IndicatorParameterType("INDICATOR_PARAMETER_TYPE_DOUBLE_RANGE", 2, 2);
        INDICATOR_PARAMETER_TYPE_BOOLEAN = new IndicatorParameterType("INDICATOR_PARAMETER_TYPE_BOOLEAN", 3, 6);
        INDICATOR_PARAMETER_TYPE_STRING = new IndicatorParameterType("INDICATOR_PARAMETER_TYPE_STRING", 4, 7);
        INDICATOR_PARAMETER_TYPE_PRICE_RANGE = new IndicatorParameterType("INDICATOR_PARAMETER_TYPE_PRICE_RANGE", 5, 14);
        INDICATOR_PARAMETER_TYPE_SELECT_INPUT = new IndicatorParameterType("INDICATOR_PARAMETER_TYPE_SELECT_INPUT", 6, 15);
        IndicatorParameterType[] indicatorParameterTypeArr$values = $values();
        $VALUES = indicatorParameterTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(indicatorParameterTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IndicatorParameterType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<IndicatorParameterType>(orCreateKotlinClass, syntax, indicatorParameterType) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.IndicatorParameterType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public IndicatorParameterType fromValue(int value) {
                return IndicatorParameterType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: IndicatorParameterType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/IndicatorParameterType;", "fromValue", "value", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IndicatorParameterType fromValue(int value) {
            if (value == 0) {
                return IndicatorParameterType.INDICATOR_PARAMETER_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return IndicatorParameterType.INDICATOR_PARAMETER_TYPE_INTEGER_RANGE;
            }
            if (value == 2) {
                return IndicatorParameterType.INDICATOR_PARAMETER_TYPE_DOUBLE_RANGE;
            }
            if (value == 6) {
                return IndicatorParameterType.INDICATOR_PARAMETER_TYPE_BOOLEAN;
            }
            if (value == 7) {
                return IndicatorParameterType.INDICATOR_PARAMETER_TYPE_STRING;
            }
            if (value == 14) {
                return IndicatorParameterType.INDICATOR_PARAMETER_TYPE_PRICE_RANGE;
            }
            if (value != 15) {
                return null;
            }
            return IndicatorParameterType.INDICATOR_PARAMETER_TYPE_SELECT_INPUT;
        }
    }

    public static IndicatorParameterType valueOf(String str) {
        return (IndicatorParameterType) Enum.valueOf(IndicatorParameterType.class, str);
    }

    public static IndicatorParameterType[] values() {
        return (IndicatorParameterType[]) $VALUES.clone();
    }
}
