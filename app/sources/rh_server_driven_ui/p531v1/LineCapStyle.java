package rh_server_driven_ui.p531v1;

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
/* compiled from: LineCapStyle.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineCapStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LINE_CAP_UNSPECIFIED", "LINE_CAP_STYLE_BUTT", "LINE_CAP_STYLE_ROUND", "LINE_CAP_STYLE_SQUARE", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class LineCapStyle implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LineCapStyle[] $VALUES;

    @JvmField
    public static final ProtoAdapter<LineCapStyle> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LineCapStyle LINE_CAP_STYLE_BUTT;
    public static final LineCapStyle LINE_CAP_STYLE_ROUND;
    public static final LineCapStyle LINE_CAP_STYLE_SQUARE;
    public static final LineCapStyle LINE_CAP_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ LineCapStyle[] $values() {
        return new LineCapStyle[]{LINE_CAP_UNSPECIFIED, LINE_CAP_STYLE_BUTT, LINE_CAP_STYLE_ROUND, LINE_CAP_STYLE_SQUARE};
    }

    @JvmStatic
    public static final LineCapStyle fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<LineCapStyle> getEntries() {
        return $ENTRIES;
    }

    private LineCapStyle(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final LineCapStyle lineCapStyle = new LineCapStyle("LINE_CAP_UNSPECIFIED", 0, 0);
        LINE_CAP_UNSPECIFIED = lineCapStyle;
        LINE_CAP_STYLE_BUTT = new LineCapStyle("LINE_CAP_STYLE_BUTT", 1, 1);
        LINE_CAP_STYLE_ROUND = new LineCapStyle("LINE_CAP_STYLE_ROUND", 2, 2);
        LINE_CAP_STYLE_SQUARE = new LineCapStyle("LINE_CAP_STYLE_SQUARE", 3, 3);
        LineCapStyle[] lineCapStyleArr$values = $values();
        $VALUES = lineCapStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lineCapStyleArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LineCapStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<LineCapStyle>(orCreateKotlinClass, syntax, lineCapStyle) { // from class: rh_server_driven_ui.v1.LineCapStyle$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public LineCapStyle fromValue(int value) {
                return LineCapStyle.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: LineCapStyle.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/LineCapStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/LineCapStyle;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LineCapStyle fromValue(int value) {
            if (value == 0) {
                return LineCapStyle.LINE_CAP_UNSPECIFIED;
            }
            if (value == 1) {
                return LineCapStyle.LINE_CAP_STYLE_BUTT;
            }
            if (value == 2) {
                return LineCapStyle.LINE_CAP_STYLE_ROUND;
            }
            if (value != 3) {
                return null;
            }
            return LineCapStyle.LINE_CAP_STYLE_SQUARE;
        }
    }

    public static LineCapStyle valueOf(String str) {
        return (LineCapStyle) Enum.valueOf(LineCapStyle.class, str);
    }

    public static LineCapStyle[] values() {
        return (LineCapStyle[]) $VALUES.clone();
    }
}
