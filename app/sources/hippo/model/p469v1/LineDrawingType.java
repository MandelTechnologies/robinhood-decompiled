package hippo.model.p469v1;

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
/* compiled from: LineDrawingType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lhippo/model/v1/LineDrawingType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LINE_DRAWING_TYPE_UNSPECIFIED", "LINE_DRAWING_TYPE_LINE", "LINE_DRAWING_TYPE_TREND_CHANNEL", "LINE_DRAWING_TYPE_RAY", "LINE_DRAWING_TYPE_EXTENDED_LINE", "LINE_DRAWING_TYPE_INFO_LINE", "LINE_DRAWING_TYPE_HORIZONTAL_LINE", "LINE_DRAWING_TYPE_HORIZONTAL_RAY", "LINE_DRAWING_TYPE_VERTICAL_LINE", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LineDrawingType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LineDrawingType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<LineDrawingType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LineDrawingType LINE_DRAWING_TYPE_EXTENDED_LINE;
    public static final LineDrawingType LINE_DRAWING_TYPE_HORIZONTAL_LINE;
    public static final LineDrawingType LINE_DRAWING_TYPE_HORIZONTAL_RAY;
    public static final LineDrawingType LINE_DRAWING_TYPE_INFO_LINE;
    public static final LineDrawingType LINE_DRAWING_TYPE_LINE;
    public static final LineDrawingType LINE_DRAWING_TYPE_RAY;
    public static final LineDrawingType LINE_DRAWING_TYPE_TREND_CHANNEL;
    public static final LineDrawingType LINE_DRAWING_TYPE_UNSPECIFIED;
    public static final LineDrawingType LINE_DRAWING_TYPE_VERTICAL_LINE;
    private final int value;

    private static final /* synthetic */ LineDrawingType[] $values() {
        return new LineDrawingType[]{LINE_DRAWING_TYPE_UNSPECIFIED, LINE_DRAWING_TYPE_LINE, LINE_DRAWING_TYPE_TREND_CHANNEL, LINE_DRAWING_TYPE_RAY, LINE_DRAWING_TYPE_EXTENDED_LINE, LINE_DRAWING_TYPE_INFO_LINE, LINE_DRAWING_TYPE_HORIZONTAL_LINE, LINE_DRAWING_TYPE_HORIZONTAL_RAY, LINE_DRAWING_TYPE_VERTICAL_LINE};
    }

    @JvmStatic
    public static final LineDrawingType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<LineDrawingType> getEntries() {
        return $ENTRIES;
    }

    private LineDrawingType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final LineDrawingType lineDrawingType = new LineDrawingType("LINE_DRAWING_TYPE_UNSPECIFIED", 0, 0);
        LINE_DRAWING_TYPE_UNSPECIFIED = lineDrawingType;
        LINE_DRAWING_TYPE_LINE = new LineDrawingType("LINE_DRAWING_TYPE_LINE", 1, 1);
        LINE_DRAWING_TYPE_TREND_CHANNEL = new LineDrawingType("LINE_DRAWING_TYPE_TREND_CHANNEL", 2, 2);
        LINE_DRAWING_TYPE_RAY = new LineDrawingType("LINE_DRAWING_TYPE_RAY", 3, 3);
        LINE_DRAWING_TYPE_EXTENDED_LINE = new LineDrawingType("LINE_DRAWING_TYPE_EXTENDED_LINE", 4, 4);
        LINE_DRAWING_TYPE_INFO_LINE = new LineDrawingType("LINE_DRAWING_TYPE_INFO_LINE", 5, 5);
        LINE_DRAWING_TYPE_HORIZONTAL_LINE = new LineDrawingType("LINE_DRAWING_TYPE_HORIZONTAL_LINE", 6, 6);
        LINE_DRAWING_TYPE_HORIZONTAL_RAY = new LineDrawingType("LINE_DRAWING_TYPE_HORIZONTAL_RAY", 7, 7);
        LINE_DRAWING_TYPE_VERTICAL_LINE = new LineDrawingType("LINE_DRAWING_TYPE_VERTICAL_LINE", 8, 8);
        LineDrawingType[] lineDrawingTypeArr$values = $values();
        $VALUES = lineDrawingTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lineDrawingTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LineDrawingType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<LineDrawingType>(orCreateKotlinClass, syntax, lineDrawingType) { // from class: hippo.model.v1.LineDrawingType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public LineDrawingType fromValue(int value) {
                return LineDrawingType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: LineDrawingType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/LineDrawingType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/LineDrawingType;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LineDrawingType fromValue(int value) {
            switch (value) {
                case 0:
                    return LineDrawingType.LINE_DRAWING_TYPE_UNSPECIFIED;
                case 1:
                    return LineDrawingType.LINE_DRAWING_TYPE_LINE;
                case 2:
                    return LineDrawingType.LINE_DRAWING_TYPE_TREND_CHANNEL;
                case 3:
                    return LineDrawingType.LINE_DRAWING_TYPE_RAY;
                case 4:
                    return LineDrawingType.LINE_DRAWING_TYPE_EXTENDED_LINE;
                case 5:
                    return LineDrawingType.LINE_DRAWING_TYPE_INFO_LINE;
                case 6:
                    return LineDrawingType.LINE_DRAWING_TYPE_HORIZONTAL_LINE;
                case 7:
                    return LineDrawingType.LINE_DRAWING_TYPE_HORIZONTAL_RAY;
                case 8:
                    return LineDrawingType.LINE_DRAWING_TYPE_VERTICAL_LINE;
                default:
                    return null;
            }
        }
    }

    public static LineDrawingType valueOf(String str) {
        return (LineDrawingType) Enum.valueOf(LineDrawingType.class, str);
    }

    public static LineDrawingType[] values() {
        return (LineDrawingType[]) $VALUES.clone();
    }
}
