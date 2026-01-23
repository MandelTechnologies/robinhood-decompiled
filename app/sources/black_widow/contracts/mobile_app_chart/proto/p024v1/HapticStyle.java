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
/* compiled from: HapticStyle.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "HAPTIC_STYLE_UNSPECIFIED", "HAPTIC_STYLE_LIGHT", "HAPTIC_STYLE_MEDIUM", "HAPTIC_STYLE_HEAVY", "HAPTIC_STYLE_SUCCESS", "HAPTIC_STYLE_FAILURE", "HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED", "HAPTIC_STYLE_CUSTOM_ORDER_FILLED", "HAPTIC_STYLE_CUSTOM_Y_AXIS", "HAPTIC_STYLE_CUSTOM_LATEST_CANDLE", "Companion", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class HapticStyle implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HapticStyle[] $VALUES;

    @JvmField
    public static final ProtoAdapter<HapticStyle> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final HapticStyle HAPTIC_STYLE_CUSTOM_LATEST_CANDLE;
    public static final HapticStyle HAPTIC_STYLE_CUSTOM_ORDER_FILLED;
    public static final HapticStyle HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED;
    public static final HapticStyle HAPTIC_STYLE_CUSTOM_Y_AXIS;
    public static final HapticStyle HAPTIC_STYLE_FAILURE;
    public static final HapticStyle HAPTIC_STYLE_HEAVY;
    public static final HapticStyle HAPTIC_STYLE_LIGHT;
    public static final HapticStyle HAPTIC_STYLE_MEDIUM;
    public static final HapticStyle HAPTIC_STYLE_SUCCESS;
    public static final HapticStyle HAPTIC_STYLE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ HapticStyle[] $values() {
        return new HapticStyle[]{HAPTIC_STYLE_UNSPECIFIED, HAPTIC_STYLE_LIGHT, HAPTIC_STYLE_MEDIUM, HAPTIC_STYLE_HEAVY, HAPTIC_STYLE_SUCCESS, HAPTIC_STYLE_FAILURE, HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED, HAPTIC_STYLE_CUSTOM_ORDER_FILLED, HAPTIC_STYLE_CUSTOM_Y_AXIS, HAPTIC_STYLE_CUSTOM_LATEST_CANDLE};
    }

    @JvmStatic
    public static final HapticStyle fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<HapticStyle> getEntries() {
        return $ENTRIES;
    }

    private HapticStyle(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final HapticStyle hapticStyle = new HapticStyle("HAPTIC_STYLE_UNSPECIFIED", 0, 0);
        HAPTIC_STYLE_UNSPECIFIED = hapticStyle;
        HAPTIC_STYLE_LIGHT = new HapticStyle("HAPTIC_STYLE_LIGHT", 1, 1);
        HAPTIC_STYLE_MEDIUM = new HapticStyle("HAPTIC_STYLE_MEDIUM", 2, 2);
        HAPTIC_STYLE_HEAVY = new HapticStyle("HAPTIC_STYLE_HEAVY", 3, 3);
        HAPTIC_STYLE_SUCCESS = new HapticStyle("HAPTIC_STYLE_SUCCESS", 4, 4);
        HAPTIC_STYLE_FAILURE = new HapticStyle("HAPTIC_STYLE_FAILURE", 5, 5);
        HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED = new HapticStyle("HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED", 6, 6);
        HAPTIC_STYLE_CUSTOM_ORDER_FILLED = new HapticStyle("HAPTIC_STYLE_CUSTOM_ORDER_FILLED", 7, 7);
        HAPTIC_STYLE_CUSTOM_Y_AXIS = new HapticStyle("HAPTIC_STYLE_CUSTOM_Y_AXIS", 8, 8);
        HAPTIC_STYLE_CUSTOM_LATEST_CANDLE = new HapticStyle("HAPTIC_STYLE_CUSTOM_LATEST_CANDLE", 9, 9);
        HapticStyle[] hapticStyleArr$values = $values();
        $VALUES = hapticStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(hapticStyleArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HapticStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<HapticStyle>(orCreateKotlinClass, syntax, hapticStyle) { // from class: black_widow.contracts.mobile_app_chart.proto.v1.HapticStyle$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public HapticStyle fromValue(int value) {
                return HapticStyle.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: HapticStyle.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lblack_widow/contracts/mobile_app_chart/proto/v1/HapticStyle;", "fromValue", "value", "", "black.widow.mobile.chart_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final HapticStyle fromValue(int value) {
            switch (value) {
                case 0:
                    return HapticStyle.HAPTIC_STYLE_UNSPECIFIED;
                case 1:
                    return HapticStyle.HAPTIC_STYLE_LIGHT;
                case 2:
                    return HapticStyle.HAPTIC_STYLE_MEDIUM;
                case 3:
                    return HapticStyle.HAPTIC_STYLE_HEAVY;
                case 4:
                    return HapticStyle.HAPTIC_STYLE_SUCCESS;
                case 5:
                    return HapticStyle.HAPTIC_STYLE_FAILURE;
                case 6:
                    return HapticStyle.HAPTIC_STYLE_CUSTOM_ORDER_SUBMITTED;
                case 7:
                    return HapticStyle.HAPTIC_STYLE_CUSTOM_ORDER_FILLED;
                case 8:
                    return HapticStyle.HAPTIC_STYLE_CUSTOM_Y_AXIS;
                case 9:
                    return HapticStyle.HAPTIC_STYLE_CUSTOM_LATEST_CANDLE;
                default:
                    return null;
            }
        }
    }

    public static HapticStyle valueOf(String str) {
        return (HapticStyle) Enum.valueOf(HapticStyle.class, str);
    }

    public static HapticStyle[] values() {
        return (HapticStyle[]) $VALUES.clone();
    }
}
