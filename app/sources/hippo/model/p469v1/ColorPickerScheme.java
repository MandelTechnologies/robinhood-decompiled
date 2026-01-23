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
/* compiled from: ColorPickerScheme.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 (2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006)"}, m3636d2 = {"Lhippo/model/v1/ColorPickerScheme;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "COLOR_PICKER_SCHEME_UNSPECIFIED", "COLOR_PICKER_SCHEME_JOULE_LIGHT", "COLOR_PICKER_SCHEME_JOULE", "COLOR_PICKER_SCHEME_JOULE_DARK", "COLOR_PICKER_SCHEME_SOL_LIGHT", "COLOR_PICKER_SCHEME_SOL", "COLOR_PICKER_SCHEME_SOL_DARK", "COLOR_PICKER_SCHEME_CLASSIC_POSITIVE", "COLOR_PICKER_SCHEME_XRAY", "COLOR_PICKER_SCHEME_XRAY_DARK", "COLOR_PICKER_SCHEME_PRIME_LIGHT", "COLOR_PICKER_SCHEME_PRIME", "COLOR_PICKER_SCHEME_PRIME_DARK", "COLOR_PICKER_SCHEME_DOT_LIGHT", "COLOR_PICKER_SCHEME_DOT", "COLOR_PICKER_SCHEME_DOT_DARK", "COLOR_PICKER_SCHEME_HYDRO_LIGHT", "COLOR_PICKER_SCHEME_HYDRO", "COLOR_PICKER_SCHEME_HYDRO_DARK", "COLOR_PICKER_SCHEME_COSMONAUT_LIGHT", "COLOR_PICKER_SCHEME_COSMONAUT", "COLOR_PICKER_SCHEME_COSMONAUT_DARK", "COLOR_PICKER_SCHEME_UV_LIGHT", "COLOR_PICKER_SCHEME_UV", "COLOR_PICKER_SCHEME_UV_DARK", "COLOR_PICKER_SCHEME_FG", "COLOR_PICKER_SCHEME_FG2", "COLOR_PICKER_SCHEME_FG3", "COLOR_PICKER_SCHEME_BG", "COLOR_PICKER_SCHEME_BG2", "COLOR_PICKER_SCHEME_BG3", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ColorPickerScheme implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ColorPickerScheme[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ColorPickerScheme> ADAPTER;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_BG;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_BG2;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_BG3;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_CLASSIC_POSITIVE;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_COSMONAUT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_COSMONAUT_DARK;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_COSMONAUT_LIGHT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_DOT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_DOT_DARK;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_DOT_LIGHT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_FG;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_FG2;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_FG3;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_HYDRO;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_HYDRO_DARK;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_HYDRO_LIGHT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_JOULE;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_JOULE_DARK;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_JOULE_LIGHT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_PRIME;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_PRIME_DARK;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_PRIME_LIGHT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_SOL;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_SOL_DARK;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_SOL_LIGHT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_UNSPECIFIED;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_UV;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_UV_DARK;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_UV_LIGHT;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_XRAY;
    public static final ColorPickerScheme COLOR_PICKER_SCHEME_XRAY_DARK;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ ColorPickerScheme[] $values() {
        return new ColorPickerScheme[]{COLOR_PICKER_SCHEME_UNSPECIFIED, COLOR_PICKER_SCHEME_JOULE_LIGHT, COLOR_PICKER_SCHEME_JOULE, COLOR_PICKER_SCHEME_JOULE_DARK, COLOR_PICKER_SCHEME_SOL_LIGHT, COLOR_PICKER_SCHEME_SOL, COLOR_PICKER_SCHEME_SOL_DARK, COLOR_PICKER_SCHEME_CLASSIC_POSITIVE, COLOR_PICKER_SCHEME_XRAY, COLOR_PICKER_SCHEME_XRAY_DARK, COLOR_PICKER_SCHEME_PRIME_LIGHT, COLOR_PICKER_SCHEME_PRIME, COLOR_PICKER_SCHEME_PRIME_DARK, COLOR_PICKER_SCHEME_DOT_LIGHT, COLOR_PICKER_SCHEME_DOT, COLOR_PICKER_SCHEME_DOT_DARK, COLOR_PICKER_SCHEME_HYDRO_LIGHT, COLOR_PICKER_SCHEME_HYDRO, COLOR_PICKER_SCHEME_HYDRO_DARK, COLOR_PICKER_SCHEME_COSMONAUT_LIGHT, COLOR_PICKER_SCHEME_COSMONAUT, COLOR_PICKER_SCHEME_COSMONAUT_DARK, COLOR_PICKER_SCHEME_UV_LIGHT, COLOR_PICKER_SCHEME_UV, COLOR_PICKER_SCHEME_UV_DARK, COLOR_PICKER_SCHEME_FG, COLOR_PICKER_SCHEME_FG2, COLOR_PICKER_SCHEME_FG3, COLOR_PICKER_SCHEME_BG, COLOR_PICKER_SCHEME_BG2, COLOR_PICKER_SCHEME_BG3};
    }

    @JvmStatic
    public static final ColorPickerScheme fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ColorPickerScheme> getEntries() {
        return $ENTRIES;
    }

    private ColorPickerScheme(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ColorPickerScheme colorPickerScheme = new ColorPickerScheme("COLOR_PICKER_SCHEME_UNSPECIFIED", 0, 0);
        COLOR_PICKER_SCHEME_UNSPECIFIED = colorPickerScheme;
        COLOR_PICKER_SCHEME_JOULE_LIGHT = new ColorPickerScheme("COLOR_PICKER_SCHEME_JOULE_LIGHT", 1, 1);
        COLOR_PICKER_SCHEME_JOULE = new ColorPickerScheme("COLOR_PICKER_SCHEME_JOULE", 2, 2);
        COLOR_PICKER_SCHEME_JOULE_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_JOULE_DARK", 3, 3);
        COLOR_PICKER_SCHEME_SOL_LIGHT = new ColorPickerScheme("COLOR_PICKER_SCHEME_SOL_LIGHT", 4, 4);
        COLOR_PICKER_SCHEME_SOL = new ColorPickerScheme("COLOR_PICKER_SCHEME_SOL", 5, 5);
        COLOR_PICKER_SCHEME_SOL_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_SOL_DARK", 6, 6);
        COLOR_PICKER_SCHEME_CLASSIC_POSITIVE = new ColorPickerScheme("COLOR_PICKER_SCHEME_CLASSIC_POSITIVE", 7, 7);
        COLOR_PICKER_SCHEME_XRAY = new ColorPickerScheme("COLOR_PICKER_SCHEME_XRAY", 8, 8);
        COLOR_PICKER_SCHEME_XRAY_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_XRAY_DARK", 9, 9);
        COLOR_PICKER_SCHEME_PRIME_LIGHT = new ColorPickerScheme("COLOR_PICKER_SCHEME_PRIME_LIGHT", 10, 10);
        COLOR_PICKER_SCHEME_PRIME = new ColorPickerScheme("COLOR_PICKER_SCHEME_PRIME", 11, 11);
        COLOR_PICKER_SCHEME_PRIME_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_PRIME_DARK", 12, 12);
        COLOR_PICKER_SCHEME_DOT_LIGHT = new ColorPickerScheme("COLOR_PICKER_SCHEME_DOT_LIGHT", 13, 13);
        COLOR_PICKER_SCHEME_DOT = new ColorPickerScheme("COLOR_PICKER_SCHEME_DOT", 14, 14);
        COLOR_PICKER_SCHEME_DOT_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_DOT_DARK", 15, 15);
        COLOR_PICKER_SCHEME_HYDRO_LIGHT = new ColorPickerScheme("COLOR_PICKER_SCHEME_HYDRO_LIGHT", 16, 16);
        COLOR_PICKER_SCHEME_HYDRO = new ColorPickerScheme("COLOR_PICKER_SCHEME_HYDRO", 17, 17);
        COLOR_PICKER_SCHEME_HYDRO_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_HYDRO_DARK", 18, 18);
        COLOR_PICKER_SCHEME_COSMONAUT_LIGHT = new ColorPickerScheme("COLOR_PICKER_SCHEME_COSMONAUT_LIGHT", 19, 19);
        COLOR_PICKER_SCHEME_COSMONAUT = new ColorPickerScheme("COLOR_PICKER_SCHEME_COSMONAUT", 20, 20);
        COLOR_PICKER_SCHEME_COSMONAUT_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_COSMONAUT_DARK", 21, 21);
        COLOR_PICKER_SCHEME_UV_LIGHT = new ColorPickerScheme("COLOR_PICKER_SCHEME_UV_LIGHT", 22, 22);
        COLOR_PICKER_SCHEME_UV = new ColorPickerScheme("COLOR_PICKER_SCHEME_UV", 23, 23);
        COLOR_PICKER_SCHEME_UV_DARK = new ColorPickerScheme("COLOR_PICKER_SCHEME_UV_DARK", 24, 24);
        COLOR_PICKER_SCHEME_FG = new ColorPickerScheme("COLOR_PICKER_SCHEME_FG", 25, 25);
        COLOR_PICKER_SCHEME_FG2 = new ColorPickerScheme("COLOR_PICKER_SCHEME_FG2", 26, 26);
        COLOR_PICKER_SCHEME_FG3 = new ColorPickerScheme("COLOR_PICKER_SCHEME_FG3", 27, 27);
        COLOR_PICKER_SCHEME_BG = new ColorPickerScheme("COLOR_PICKER_SCHEME_BG", 28, 28);
        COLOR_PICKER_SCHEME_BG2 = new ColorPickerScheme("COLOR_PICKER_SCHEME_BG2", 29, 29);
        COLOR_PICKER_SCHEME_BG3 = new ColorPickerScheme("COLOR_PICKER_SCHEME_BG3", 30, 30);
        ColorPickerScheme[] colorPickerSchemeArr$values = $values();
        $VALUES = colorPickerSchemeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(colorPickerSchemeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ColorPickerScheme.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ColorPickerScheme>(orCreateKotlinClass, syntax, colorPickerScheme) { // from class: hippo.model.v1.ColorPickerScheme$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ColorPickerScheme fromValue(int value) {
                return ColorPickerScheme.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ColorPickerScheme.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/ColorPickerScheme$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/ColorPickerScheme;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ColorPickerScheme fromValue(int value) {
            switch (value) {
                case 0:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_UNSPECIFIED;
                case 1:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_JOULE_LIGHT;
                case 2:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_JOULE;
                case 3:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_JOULE_DARK;
                case 4:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_SOL_LIGHT;
                case 5:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_SOL;
                case 6:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_SOL_DARK;
                case 7:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_CLASSIC_POSITIVE;
                case 8:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_XRAY;
                case 9:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_XRAY_DARK;
                case 10:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_PRIME_LIGHT;
                case 11:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_PRIME;
                case 12:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_PRIME_DARK;
                case 13:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_DOT_LIGHT;
                case 14:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_DOT;
                case 15:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_DOT_DARK;
                case 16:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_HYDRO_LIGHT;
                case 17:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_HYDRO;
                case 18:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_HYDRO_DARK;
                case 19:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_COSMONAUT_LIGHT;
                case 20:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_COSMONAUT;
                case 21:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_COSMONAUT_DARK;
                case 22:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_UV_LIGHT;
                case 23:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_UV;
                case 24:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_UV_DARK;
                case 25:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_FG;
                case 26:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_FG2;
                case 27:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_FG3;
                case 28:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_BG;
                case 29:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_BG2;
                case 30:
                    return ColorPickerScheme.COLOR_PICKER_SCHEME_BG3;
                default:
                    return null;
            }
        }
    }

    public static ColorPickerScheme valueOf(String str) {
        return (ColorPickerScheme) Enum.valueOf(ColorPickerScheme.class, str);
    }

    public static ColorPickerScheme[] values() {
        return (ColorPickerScheme[]) $VALUES.clone();
    }
}
