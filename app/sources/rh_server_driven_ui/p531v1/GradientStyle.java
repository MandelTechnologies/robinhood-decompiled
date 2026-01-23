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
/* compiled from: GradientStyle.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GRADIENT_STYLE_UNSPECIFIED", "GRADIENT_STYLE_LEFT_TO_RIGHT", "GRADIENT_STYLE_RIGHT_TO_LEFT", "GRADIENT_STYLE_TOP_TO_BOTTOM", "GRADIENT_STYLE_BOTTOM_TO_TOP", "GRADIENT_STYLE_UNKNOWN", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GradientStyle implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GradientStyle[] $VALUES;

    @JvmField
    public static final ProtoAdapter<GradientStyle> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GradientStyle GRADIENT_STYLE_BOTTOM_TO_TOP;
    public static final GradientStyle GRADIENT_STYLE_LEFT_TO_RIGHT;
    public static final GradientStyle GRADIENT_STYLE_RIGHT_TO_LEFT;
    public static final GradientStyle GRADIENT_STYLE_TOP_TO_BOTTOM;
    public static final GradientStyle GRADIENT_STYLE_UNKNOWN;
    public static final GradientStyle GRADIENT_STYLE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ GradientStyle[] $values() {
        return new GradientStyle[]{GRADIENT_STYLE_UNSPECIFIED, GRADIENT_STYLE_LEFT_TO_RIGHT, GRADIENT_STYLE_RIGHT_TO_LEFT, GRADIENT_STYLE_TOP_TO_BOTTOM, GRADIENT_STYLE_BOTTOM_TO_TOP, GRADIENT_STYLE_UNKNOWN};
    }

    @JvmStatic
    public static final GradientStyle fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<GradientStyle> getEntries() {
        return $ENTRIES;
    }

    private GradientStyle(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final GradientStyle gradientStyle = new GradientStyle("GRADIENT_STYLE_UNSPECIFIED", 0, 0);
        GRADIENT_STYLE_UNSPECIFIED = gradientStyle;
        GRADIENT_STYLE_LEFT_TO_RIGHT = new GradientStyle("GRADIENT_STYLE_LEFT_TO_RIGHT", 1, 1);
        GRADIENT_STYLE_RIGHT_TO_LEFT = new GradientStyle("GRADIENT_STYLE_RIGHT_TO_LEFT", 2, 2);
        GRADIENT_STYLE_TOP_TO_BOTTOM = new GradientStyle("GRADIENT_STYLE_TOP_TO_BOTTOM", 3, 3);
        GRADIENT_STYLE_BOTTOM_TO_TOP = new GradientStyle("GRADIENT_STYLE_BOTTOM_TO_TOP", 4, 4);
        GRADIENT_STYLE_UNKNOWN = new GradientStyle("GRADIENT_STYLE_UNKNOWN", 5, 5);
        GradientStyle[] gradientStyleArr$values = $values();
        $VALUES = gradientStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(gradientStyleArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GradientStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<GradientStyle>(orCreateKotlinClass, syntax, gradientStyle) { // from class: rh_server_driven_ui.v1.GradientStyle$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public GradientStyle fromValue(int value) {
                return GradientStyle.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: GradientStyle.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/GradientStyle;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GradientStyle fromValue(int value) {
            if (value == 0) {
                return GradientStyle.GRADIENT_STYLE_UNSPECIFIED;
            }
            if (value == 1) {
                return GradientStyle.GRADIENT_STYLE_LEFT_TO_RIGHT;
            }
            if (value == 2) {
                return GradientStyle.GRADIENT_STYLE_RIGHT_TO_LEFT;
            }
            if (value == 3) {
                return GradientStyle.GRADIENT_STYLE_TOP_TO_BOTTOM;
            }
            if (value == 4) {
                return GradientStyle.GRADIENT_STYLE_BOTTOM_TO_TOP;
            }
            if (value != 5) {
                return null;
            }
            return GradientStyle.GRADIENT_STYLE_UNKNOWN;
        }
    }

    public static GradientStyle valueOf(String str) {
        return (GradientStyle) Enum.valueOf(GradientStyle.class, str);
    }

    public static GradientStyle[] values() {
        return (GradientStyle[]) $VALUES.clone();
    }
}
