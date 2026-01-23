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
/* compiled from: Color.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\bw\b\u0086\u0081\u0002\u0018\u0000 z2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001zB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\by¨\u0006{"}, m3636d2 = {"Lrh_server_driven_ui/v1/Color;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "COLOR_UNSPECIFIED", "COLOR_ACCENT", "COLOR_POSITIVE", "COLOR_NEGATIVE", "COLOR_FG", "COLOR_FG2", "COLOR_FG3", "COLOR_BG", "COLOR_BG2", "COLOR_BG3", "COLOR_JET", "COLOR_NOVA", "COLOR_MINERAL", "COLOR_ANDROS", "COLOR_ION", "COLOR_JADE", "COLOR_STRATOS", "COLOR_EXOS", "COLOR_RUBY", "COLOR_GAIA", "COLOR_JOULE_LIGHT", "COLOR_JOULE", "COLOR_JOULE_DARK", "COLOR_SOL_LIGHT", "COLOR_SOL", "COLOR_SOL_DARK", "COLOR_LUMEN_LIGHT", "COLOR_LUMEN", "COLOR_LUMEN_DARK", "COLOR_X_RAY_LIGHT", "COLOR_X_RAY", "COLOR_X_RAY_DARK", "COLOR_PRIME_LIGHT", "COLOR_PRIME", "COLOR_PRIME_DARK", "COLOR_BIOME_LIGHT", "COLOR_BIOME", "COLOR_BIOME_DARK", "COLOR_DOT_LIGHT", "COLOR_DOT", "COLOR_DOT_DARK", "COLOR_HYDRO_LIGHT", "COLOR_HYDRO", "COLOR_HYDRO_DARK", "COLOR_COSMONAUT_LIGHT", "COLOR_COSMONAUT", "COLOR_COSMONAUT_DARK", "COLOR_UV_LIGHT", "COLOR_UV", "COLOR_UV_DARK", "COLOR_IRIS_LIGHT", "COLOR_IRIS", "COLOR_IRIS_DARK", "COLOR_MILLENIUM_LIGHT", "COLOR_MILLENIUM", "COLOR_MILLENIUM_DARK", "COLOR_RESIN_LIGHT", "COLOR_RESIN", "COLOR_RESIN_DARK", "COLOR_DROID_LIGHT", "COLOR_DROID", "COLOR_DROID_DARK", "COLOR_CLONE_LIGHT", "COLOR_CLONE", "COLOR_CLONE_DARK", "COLOR_BLOOM", "COLOR_FLARE", "COLOR_MORPH", "COLOR_MOON", "COLOR_ASTRO", "COLOR_NEPTUNE", "COLOR_SYNTH", "COLOR_C1", "COLOR_C2", "COLOR_C3", "COLOR_C4", "COLOR_C5", "COLOR_C6", "COLOR_C7", "COLOR_C8", "COLOR_C9", "COLOR_C10", "COLOR_C11", "COLOR_C12", "COLOR_C13", "COLOR_C14", "COLOR_C15", "COLOR_C16", "COLOR_C17", "COLOR_C18", "COLOR_C19", "COLOR_C20", "COLOR_CC_CREAM", "COLOR_CC_DUSK", "COLOR_CC_ROUGE", "COLOR_CC_PEACH", "COLOR_CC_SUNSET", "COLOR_CC_MIDNIGHT", "COLOR_CC_GOLD_ACCENT", "COLOR_CC_GOLD_FG", "COLOR_CC_GOLD_FG2", "COLOR_CC_GOLD_FG3", "COLOR_CC_GOLD_BG", "COLOR_CC_GOLD_BG2", "COLOR_CC_GOLD_BG3", "COLOR_CC_SILVER_ACCENT", "COLOR_CC_SILVER_FG", "COLOR_CC_SILVER_FG2", "COLOR_CC_SILVER_FG3", "COLOR_CC_SILVER_BG", "COLOR_CC_SILVER_BG2", "COLOR_CC_SILVER_BG3", "COLOR_NEON", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Color implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Color[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Color> ADAPTER;
    public static final Color COLOR_ACCENT;
    public static final Color COLOR_ANDROS;
    public static final Color COLOR_ASTRO;
    public static final Color COLOR_BG;
    public static final Color COLOR_BG2;
    public static final Color COLOR_BG3;
    public static final Color COLOR_BIOME;
    public static final Color COLOR_BIOME_DARK;
    public static final Color COLOR_BIOME_LIGHT;
    public static final Color COLOR_BLOOM;
    public static final Color COLOR_C1;
    public static final Color COLOR_C10;
    public static final Color COLOR_C11;
    public static final Color COLOR_C12;
    public static final Color COLOR_C13;
    public static final Color COLOR_C14;
    public static final Color COLOR_C15;
    public static final Color COLOR_C16;
    public static final Color COLOR_C17;
    public static final Color COLOR_C18;
    public static final Color COLOR_C19;
    public static final Color COLOR_C2;
    public static final Color COLOR_C20;
    public static final Color COLOR_C3;
    public static final Color COLOR_C4;
    public static final Color COLOR_C5;
    public static final Color COLOR_C6;
    public static final Color COLOR_C7;
    public static final Color COLOR_C8;
    public static final Color COLOR_C9;
    public static final Color COLOR_CC_CREAM;
    public static final Color COLOR_CC_DUSK;
    public static final Color COLOR_CC_GOLD_ACCENT;
    public static final Color COLOR_CC_GOLD_BG;
    public static final Color COLOR_CC_GOLD_BG2;
    public static final Color COLOR_CC_GOLD_BG3;
    public static final Color COLOR_CC_GOLD_FG;
    public static final Color COLOR_CC_GOLD_FG2;
    public static final Color COLOR_CC_GOLD_FG3;
    public static final Color COLOR_CC_MIDNIGHT;
    public static final Color COLOR_CC_PEACH;
    public static final Color COLOR_CC_ROUGE;
    public static final Color COLOR_CC_SILVER_ACCENT;
    public static final Color COLOR_CC_SILVER_BG;
    public static final Color COLOR_CC_SILVER_BG2;
    public static final Color COLOR_CC_SILVER_BG3;
    public static final Color COLOR_CC_SILVER_FG;
    public static final Color COLOR_CC_SILVER_FG2;
    public static final Color COLOR_CC_SILVER_FG3;
    public static final Color COLOR_CC_SUNSET;
    public static final Color COLOR_CLONE;
    public static final Color COLOR_CLONE_DARK;
    public static final Color COLOR_CLONE_LIGHT;
    public static final Color COLOR_COSMONAUT;
    public static final Color COLOR_COSMONAUT_DARK;
    public static final Color COLOR_COSMONAUT_LIGHT;
    public static final Color COLOR_DOT;
    public static final Color COLOR_DOT_DARK;
    public static final Color COLOR_DOT_LIGHT;
    public static final Color COLOR_DROID;
    public static final Color COLOR_DROID_DARK;
    public static final Color COLOR_DROID_LIGHT;
    public static final Color COLOR_EXOS;
    public static final Color COLOR_FG;
    public static final Color COLOR_FG2;
    public static final Color COLOR_FG3;
    public static final Color COLOR_FLARE;
    public static final Color COLOR_GAIA;
    public static final Color COLOR_HYDRO;
    public static final Color COLOR_HYDRO_DARK;
    public static final Color COLOR_HYDRO_LIGHT;
    public static final Color COLOR_ION;
    public static final Color COLOR_IRIS;
    public static final Color COLOR_IRIS_DARK;
    public static final Color COLOR_IRIS_LIGHT;
    public static final Color COLOR_JADE;
    public static final Color COLOR_JET;
    public static final Color COLOR_JOULE;
    public static final Color COLOR_JOULE_DARK;
    public static final Color COLOR_JOULE_LIGHT;
    public static final Color COLOR_LUMEN;
    public static final Color COLOR_LUMEN_DARK;
    public static final Color COLOR_LUMEN_LIGHT;
    public static final Color COLOR_MILLENIUM;
    public static final Color COLOR_MILLENIUM_DARK;
    public static final Color COLOR_MILLENIUM_LIGHT;
    public static final Color COLOR_MINERAL;
    public static final Color COLOR_MOON;
    public static final Color COLOR_MORPH;
    public static final Color COLOR_NEGATIVE;
    public static final Color COLOR_NEON;
    public static final Color COLOR_NEPTUNE;
    public static final Color COLOR_NOVA;
    public static final Color COLOR_POSITIVE;
    public static final Color COLOR_PRIME;
    public static final Color COLOR_PRIME_DARK;
    public static final Color COLOR_PRIME_LIGHT;
    public static final Color COLOR_RESIN;
    public static final Color COLOR_RESIN_DARK;
    public static final Color COLOR_RESIN_LIGHT;
    public static final Color COLOR_RUBY;
    public static final Color COLOR_SOL;
    public static final Color COLOR_SOL_DARK;
    public static final Color COLOR_SOL_LIGHT;
    public static final Color COLOR_STRATOS;
    public static final Color COLOR_SYNTH;
    public static final Color COLOR_UNSPECIFIED;
    public static final Color COLOR_UV;
    public static final Color COLOR_UV_DARK;
    public static final Color COLOR_UV_LIGHT;
    public static final Color COLOR_X_RAY;
    public static final Color COLOR_X_RAY_DARK;
    public static final Color COLOR_X_RAY_LIGHT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ Color[] $values() {
        return new Color[]{COLOR_UNSPECIFIED, COLOR_ACCENT, COLOR_POSITIVE, COLOR_NEGATIVE, COLOR_FG, COLOR_FG2, COLOR_FG3, COLOR_BG, COLOR_BG2, COLOR_BG3, COLOR_JET, COLOR_NOVA, COLOR_MINERAL, COLOR_ANDROS, COLOR_ION, COLOR_JADE, COLOR_STRATOS, COLOR_EXOS, COLOR_RUBY, COLOR_GAIA, COLOR_JOULE_LIGHT, COLOR_JOULE, COLOR_JOULE_DARK, COLOR_SOL_LIGHT, COLOR_SOL, COLOR_SOL_DARK, COLOR_LUMEN_LIGHT, COLOR_LUMEN, COLOR_LUMEN_DARK, COLOR_X_RAY_LIGHT, COLOR_X_RAY, COLOR_X_RAY_DARK, COLOR_PRIME_LIGHT, COLOR_PRIME, COLOR_PRIME_DARK, COLOR_BIOME_LIGHT, COLOR_BIOME, COLOR_BIOME_DARK, COLOR_DOT_LIGHT, COLOR_DOT, COLOR_DOT_DARK, COLOR_HYDRO_LIGHT, COLOR_HYDRO, COLOR_HYDRO_DARK, COLOR_COSMONAUT_LIGHT, COLOR_COSMONAUT, COLOR_COSMONAUT_DARK, COLOR_UV_LIGHT, COLOR_UV, COLOR_UV_DARK, COLOR_IRIS_LIGHT, COLOR_IRIS, COLOR_IRIS_DARK, COLOR_MILLENIUM_LIGHT, COLOR_MILLENIUM, COLOR_MILLENIUM_DARK, COLOR_RESIN_LIGHT, COLOR_RESIN, COLOR_RESIN_DARK, COLOR_DROID_LIGHT, COLOR_DROID, COLOR_DROID_DARK, COLOR_CLONE_LIGHT, COLOR_CLONE, COLOR_CLONE_DARK, COLOR_BLOOM, COLOR_FLARE, COLOR_MORPH, COLOR_MOON, COLOR_ASTRO, COLOR_NEPTUNE, COLOR_SYNTH, COLOR_C1, COLOR_C2, COLOR_C3, COLOR_C4, COLOR_C5, COLOR_C6, COLOR_C7, COLOR_C8, COLOR_C9, COLOR_C10, COLOR_C11, COLOR_C12, COLOR_C13, COLOR_C14, COLOR_C15, COLOR_C16, COLOR_C17, COLOR_C18, COLOR_C19, COLOR_C20, COLOR_CC_CREAM, COLOR_CC_DUSK, COLOR_CC_ROUGE, COLOR_CC_PEACH, COLOR_CC_SUNSET, COLOR_CC_MIDNIGHT, COLOR_CC_GOLD_ACCENT, COLOR_CC_GOLD_FG, COLOR_CC_GOLD_FG2, COLOR_CC_GOLD_FG3, COLOR_CC_GOLD_BG, COLOR_CC_GOLD_BG2, COLOR_CC_GOLD_BG3, COLOR_CC_SILVER_ACCENT, COLOR_CC_SILVER_FG, COLOR_CC_SILVER_FG2, COLOR_CC_SILVER_FG3, COLOR_CC_SILVER_BG, COLOR_CC_SILVER_BG2, COLOR_CC_SILVER_BG3, COLOR_NEON};
    }

    @JvmStatic
    public static final Color fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Color> getEntries() {
        return $ENTRIES;
    }

    private Color(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Color color = new Color("COLOR_UNSPECIFIED", 0, 0);
        COLOR_UNSPECIFIED = color;
        COLOR_ACCENT = new Color("COLOR_ACCENT", 1, 1);
        COLOR_POSITIVE = new Color("COLOR_POSITIVE", 2, 2);
        COLOR_NEGATIVE = new Color("COLOR_NEGATIVE", 3, 3);
        COLOR_FG = new Color("COLOR_FG", 4, 4);
        COLOR_FG2 = new Color("COLOR_FG2", 5, 5);
        COLOR_FG3 = new Color("COLOR_FG3", 6, 6);
        COLOR_BG = new Color("COLOR_BG", 7, 7);
        COLOR_BG2 = new Color("COLOR_BG2", 8, 8);
        COLOR_BG3 = new Color("COLOR_BG3", 9, 9);
        COLOR_JET = new Color("COLOR_JET", 10, 10);
        COLOR_NOVA = new Color("COLOR_NOVA", 11, 11);
        COLOR_MINERAL = new Color("COLOR_MINERAL", 12, 12);
        COLOR_ANDROS = new Color("COLOR_ANDROS", 13, 13);
        COLOR_ION = new Color("COLOR_ION", 14, 14);
        COLOR_JADE = new Color("COLOR_JADE", 15, 15);
        COLOR_STRATOS = new Color("COLOR_STRATOS", 16, 16);
        COLOR_EXOS = new Color("COLOR_EXOS", 17, 17);
        COLOR_RUBY = new Color("COLOR_RUBY", 18, 18);
        COLOR_GAIA = new Color("COLOR_GAIA", 19, 19);
        COLOR_JOULE_LIGHT = new Color("COLOR_JOULE_LIGHT", 20, 20);
        COLOR_JOULE = new Color("COLOR_JOULE", 21, 21);
        COLOR_JOULE_DARK = new Color("COLOR_JOULE_DARK", 22, 22);
        COLOR_SOL_LIGHT = new Color("COLOR_SOL_LIGHT", 23, 23);
        COLOR_SOL = new Color("COLOR_SOL", 24, 24);
        COLOR_SOL_DARK = new Color("COLOR_SOL_DARK", 25, 25);
        COLOR_LUMEN_LIGHT = new Color("COLOR_LUMEN_LIGHT", 26, 26);
        COLOR_LUMEN = new Color("COLOR_LUMEN", 27, 27);
        COLOR_LUMEN_DARK = new Color("COLOR_LUMEN_DARK", 28, 28);
        COLOR_X_RAY_LIGHT = new Color("COLOR_X_RAY_LIGHT", 29, 29);
        COLOR_X_RAY = new Color("COLOR_X_RAY", 30, 30);
        COLOR_X_RAY_DARK = new Color("COLOR_X_RAY_DARK", 31, 31);
        COLOR_PRIME_LIGHT = new Color("COLOR_PRIME_LIGHT", 32, 32);
        COLOR_PRIME = new Color("COLOR_PRIME", 33, 33);
        COLOR_PRIME_DARK = new Color("COLOR_PRIME_DARK", 34, 34);
        COLOR_BIOME_LIGHT = new Color("COLOR_BIOME_LIGHT", 35, 35);
        COLOR_BIOME = new Color("COLOR_BIOME", 36, 36);
        COLOR_BIOME_DARK = new Color("COLOR_BIOME_DARK", 37, 37);
        COLOR_DOT_LIGHT = new Color("COLOR_DOT_LIGHT", 38, 38);
        COLOR_DOT = new Color("COLOR_DOT", 39, 39);
        COLOR_DOT_DARK = new Color("COLOR_DOT_DARK", 40, 40);
        COLOR_HYDRO_LIGHT = new Color("COLOR_HYDRO_LIGHT", 41, 41);
        COLOR_HYDRO = new Color("COLOR_HYDRO", 42, 42);
        COLOR_HYDRO_DARK = new Color("COLOR_HYDRO_DARK", 43, 43);
        COLOR_COSMONAUT_LIGHT = new Color("COLOR_COSMONAUT_LIGHT", 44, 44);
        COLOR_COSMONAUT = new Color("COLOR_COSMONAUT", 45, 45);
        COLOR_COSMONAUT_DARK = new Color("COLOR_COSMONAUT_DARK", 46, 46);
        COLOR_UV_LIGHT = new Color("COLOR_UV_LIGHT", 47, 47);
        COLOR_UV = new Color("COLOR_UV", 48, 48);
        COLOR_UV_DARK = new Color("COLOR_UV_DARK", 49, 49);
        COLOR_IRIS_LIGHT = new Color("COLOR_IRIS_LIGHT", 50, 50);
        COLOR_IRIS = new Color("COLOR_IRIS", 51, 51);
        COLOR_IRIS_DARK = new Color("COLOR_IRIS_DARK", 52, 52);
        COLOR_MILLENIUM_LIGHT = new Color("COLOR_MILLENIUM_LIGHT", 53, 53);
        COLOR_MILLENIUM = new Color("COLOR_MILLENIUM", 54, 54);
        COLOR_MILLENIUM_DARK = new Color("COLOR_MILLENIUM_DARK", 55, 55);
        COLOR_RESIN_LIGHT = new Color("COLOR_RESIN_LIGHT", 56, 56);
        COLOR_RESIN = new Color("COLOR_RESIN", 57, 57);
        COLOR_RESIN_DARK = new Color("COLOR_RESIN_DARK", 58, 58);
        COLOR_DROID_LIGHT = new Color("COLOR_DROID_LIGHT", 59, 59);
        COLOR_DROID = new Color("COLOR_DROID", 60, 60);
        COLOR_DROID_DARK = new Color("COLOR_DROID_DARK", 61, 61);
        COLOR_CLONE_LIGHT = new Color("COLOR_CLONE_LIGHT", 62, 62);
        COLOR_CLONE = new Color("COLOR_CLONE", 63, 63);
        COLOR_CLONE_DARK = new Color("COLOR_CLONE_DARK", 64, 64);
        COLOR_BLOOM = new Color("COLOR_BLOOM", 65, 65);
        COLOR_FLARE = new Color("COLOR_FLARE", 66, 66);
        COLOR_MORPH = new Color("COLOR_MORPH", 67, 67);
        COLOR_MOON = new Color("COLOR_MOON", 68, 68);
        COLOR_ASTRO = new Color("COLOR_ASTRO", 69, 69);
        COLOR_NEPTUNE = new Color("COLOR_NEPTUNE", 70, 70);
        COLOR_SYNTH = new Color("COLOR_SYNTH", 71, 71);
        COLOR_C1 = new Color("COLOR_C1", 72, 72);
        COLOR_C2 = new Color("COLOR_C2", 73, 73);
        COLOR_C3 = new Color("COLOR_C3", 74, 74);
        COLOR_C4 = new Color("COLOR_C4", 75, 75);
        COLOR_C5 = new Color("COLOR_C5", 76, 76);
        COLOR_C6 = new Color("COLOR_C6", 77, 77);
        COLOR_C7 = new Color("COLOR_C7", 78, 78);
        COLOR_C8 = new Color("COLOR_C8", 79, 79);
        COLOR_C9 = new Color("COLOR_C9", 80, 80);
        COLOR_C10 = new Color("COLOR_C10", 81, 81);
        COLOR_C11 = new Color("COLOR_C11", 82, 82);
        COLOR_C12 = new Color("COLOR_C12", 83, 83);
        COLOR_C13 = new Color("COLOR_C13", 84, 84);
        COLOR_C14 = new Color("COLOR_C14", 85, 85);
        COLOR_C15 = new Color("COLOR_C15", 86, 86);
        COLOR_C16 = new Color("COLOR_C16", 87, 87);
        COLOR_C17 = new Color("COLOR_C17", 88, 88);
        COLOR_C18 = new Color("COLOR_C18", 89, 89);
        COLOR_C19 = new Color("COLOR_C19", 90, 90);
        COLOR_C20 = new Color("COLOR_C20", 91, 91);
        COLOR_CC_CREAM = new Color("COLOR_CC_CREAM", 92, 92);
        COLOR_CC_DUSK = new Color("COLOR_CC_DUSK", 93, 93);
        COLOR_CC_ROUGE = new Color("COLOR_CC_ROUGE", 94, 94);
        COLOR_CC_PEACH = new Color("COLOR_CC_PEACH", 95, 95);
        COLOR_CC_SUNSET = new Color("COLOR_CC_SUNSET", 96, 96);
        COLOR_CC_MIDNIGHT = new Color("COLOR_CC_MIDNIGHT", 97, 97);
        COLOR_CC_GOLD_ACCENT = new Color("COLOR_CC_GOLD_ACCENT", 98, 98);
        COLOR_CC_GOLD_FG = new Color("COLOR_CC_GOLD_FG", 99, 99);
        COLOR_CC_GOLD_FG2 = new Color("COLOR_CC_GOLD_FG2", 100, 100);
        COLOR_CC_GOLD_FG3 = new Color("COLOR_CC_GOLD_FG3", 101, 101);
        COLOR_CC_GOLD_BG = new Color("COLOR_CC_GOLD_BG", 102, 102);
        COLOR_CC_GOLD_BG2 = new Color("COLOR_CC_GOLD_BG2", 103, 103);
        COLOR_CC_GOLD_BG3 = new Color("COLOR_CC_GOLD_BG3", 104, 104);
        COLOR_CC_SILVER_ACCENT = new Color("COLOR_CC_SILVER_ACCENT", 105, 105);
        COLOR_CC_SILVER_FG = new Color("COLOR_CC_SILVER_FG", 106, 106);
        COLOR_CC_SILVER_FG2 = new Color("COLOR_CC_SILVER_FG2", 107, 107);
        COLOR_CC_SILVER_FG3 = new Color("COLOR_CC_SILVER_FG3", 108, 108);
        COLOR_CC_SILVER_BG = new Color("COLOR_CC_SILVER_BG", 109, 109);
        COLOR_CC_SILVER_BG2 = new Color("COLOR_CC_SILVER_BG2", 110, 110);
        COLOR_CC_SILVER_BG3 = new Color("COLOR_CC_SILVER_BG3", 111, 111);
        COLOR_NEON = new Color("COLOR_NEON", 112, 112);
        Color[] colorArr$values = $values();
        $VALUES = colorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(colorArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Color.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Color>(orCreateKotlinClass, syntax, color) { // from class: rh_server_driven_ui.v1.Color$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Color fromValue(int value) {
                return Color.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Color.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/Color$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/Color;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Color fromValue(int value) {
            switch (value) {
                case 0:
                    return Color.COLOR_UNSPECIFIED;
                case 1:
                    return Color.COLOR_ACCENT;
                case 2:
                    return Color.COLOR_POSITIVE;
                case 3:
                    return Color.COLOR_NEGATIVE;
                case 4:
                    return Color.COLOR_FG;
                case 5:
                    return Color.COLOR_FG2;
                case 6:
                    return Color.COLOR_FG3;
                case 7:
                    return Color.COLOR_BG;
                case 8:
                    return Color.COLOR_BG2;
                case 9:
                    return Color.COLOR_BG3;
                case 10:
                    return Color.COLOR_JET;
                case 11:
                    return Color.COLOR_NOVA;
                case 12:
                    return Color.COLOR_MINERAL;
                case 13:
                    return Color.COLOR_ANDROS;
                case 14:
                    return Color.COLOR_ION;
                case 15:
                    return Color.COLOR_JADE;
                case 16:
                    return Color.COLOR_STRATOS;
                case 17:
                    return Color.COLOR_EXOS;
                case 18:
                    return Color.COLOR_RUBY;
                case 19:
                    return Color.COLOR_GAIA;
                case 20:
                    return Color.COLOR_JOULE_LIGHT;
                case 21:
                    return Color.COLOR_JOULE;
                case 22:
                    return Color.COLOR_JOULE_DARK;
                case 23:
                    return Color.COLOR_SOL_LIGHT;
                case 24:
                    return Color.COLOR_SOL;
                case 25:
                    return Color.COLOR_SOL_DARK;
                case 26:
                    return Color.COLOR_LUMEN_LIGHT;
                case 27:
                    return Color.COLOR_LUMEN;
                case 28:
                    return Color.COLOR_LUMEN_DARK;
                case 29:
                    return Color.COLOR_X_RAY_LIGHT;
                case 30:
                    return Color.COLOR_X_RAY;
                case 31:
                    return Color.COLOR_X_RAY_DARK;
                case 32:
                    return Color.COLOR_PRIME_LIGHT;
                case 33:
                    return Color.COLOR_PRIME;
                case 34:
                    return Color.COLOR_PRIME_DARK;
                case 35:
                    return Color.COLOR_BIOME_LIGHT;
                case 36:
                    return Color.COLOR_BIOME;
                case 37:
                    return Color.COLOR_BIOME_DARK;
                case 38:
                    return Color.COLOR_DOT_LIGHT;
                case 39:
                    return Color.COLOR_DOT;
                case 40:
                    return Color.COLOR_DOT_DARK;
                case 41:
                    return Color.COLOR_HYDRO_LIGHT;
                case 42:
                    return Color.COLOR_HYDRO;
                case 43:
                    return Color.COLOR_HYDRO_DARK;
                case 44:
                    return Color.COLOR_COSMONAUT_LIGHT;
                case 45:
                    return Color.COLOR_COSMONAUT;
                case 46:
                    return Color.COLOR_COSMONAUT_DARK;
                case 47:
                    return Color.COLOR_UV_LIGHT;
                case 48:
                    return Color.COLOR_UV;
                case 49:
                    return Color.COLOR_UV_DARK;
                case 50:
                    return Color.COLOR_IRIS_LIGHT;
                case 51:
                    return Color.COLOR_IRIS;
                case 52:
                    return Color.COLOR_IRIS_DARK;
                case 53:
                    return Color.COLOR_MILLENIUM_LIGHT;
                case 54:
                    return Color.COLOR_MILLENIUM;
                case 55:
                    return Color.COLOR_MILLENIUM_DARK;
                case 56:
                    return Color.COLOR_RESIN_LIGHT;
                case 57:
                    return Color.COLOR_RESIN;
                case 58:
                    return Color.COLOR_RESIN_DARK;
                case 59:
                    return Color.COLOR_DROID_LIGHT;
                case 60:
                    return Color.COLOR_DROID;
                case 61:
                    return Color.COLOR_DROID_DARK;
                case 62:
                    return Color.COLOR_CLONE_LIGHT;
                case 63:
                    return Color.COLOR_CLONE;
                case 64:
                    return Color.COLOR_CLONE_DARK;
                case 65:
                    return Color.COLOR_BLOOM;
                case 66:
                    return Color.COLOR_FLARE;
                case 67:
                    return Color.COLOR_MORPH;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return Color.COLOR_MOON;
                case 69:
                    return Color.COLOR_ASTRO;
                case 70:
                    return Color.COLOR_NEPTUNE;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return Color.COLOR_SYNTH;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return Color.COLOR_C1;
                case 73:
                    return Color.COLOR_C2;
                case 74:
                    return Color.COLOR_C3;
                case 75:
                    return Color.COLOR_C4;
                case 76:
                    return Color.COLOR_C5;
                case 77:
                    return Color.COLOR_C6;
                case 78:
                    return Color.COLOR_C7;
                case 79:
                    return Color.COLOR_C8;
                case 80:
                    return Color.COLOR_C9;
                case 81:
                    return Color.COLOR_C10;
                case 82:
                    return Color.COLOR_C11;
                case 83:
                    return Color.COLOR_C12;
                case 84:
                    return Color.COLOR_C13;
                case 85:
                    return Color.COLOR_C14;
                case 86:
                    return Color.COLOR_C15;
                case 87:
                    return Color.COLOR_C16;
                case 88:
                    return Color.COLOR_C17;
                case 89:
                    return Color.COLOR_C18;
                case 90:
                    return Color.COLOR_C19;
                case 91:
                    return Color.COLOR_C20;
                case 92:
                    return Color.COLOR_CC_CREAM;
                case 93:
                    return Color.COLOR_CC_DUSK;
                case 94:
                    return Color.COLOR_CC_ROUGE;
                case 95:
                    return Color.COLOR_CC_PEACH;
                case 96:
                    return Color.COLOR_CC_SUNSET;
                case 97:
                    return Color.COLOR_CC_MIDNIGHT;
                case 98:
                    return Color.COLOR_CC_GOLD_ACCENT;
                case 99:
                    return Color.COLOR_CC_GOLD_FG;
                case 100:
                    return Color.COLOR_CC_GOLD_FG2;
                case 101:
                    return Color.COLOR_CC_GOLD_FG3;
                case 102:
                    return Color.COLOR_CC_GOLD_BG;
                case 103:
                    return Color.COLOR_CC_GOLD_BG2;
                case 104:
                    return Color.COLOR_CC_GOLD_BG3;
                case 105:
                    return Color.COLOR_CC_SILVER_ACCENT;
                case 106:
                    return Color.COLOR_CC_SILVER_FG;
                case 107:
                    return Color.COLOR_CC_SILVER_FG2;
                case 108:
                    return Color.COLOR_CC_SILVER_FG3;
                case 109:
                    return Color.COLOR_CC_SILVER_BG;
                case 110:
                    return Color.COLOR_CC_SILVER_BG2;
                case 111:
                    return Color.COLOR_CC_SILVER_BG3;
                case 112:
                    return Color.COLOR_NEON;
                default:
                    return null;
            }
        }
    }

    public static Color valueOf(String str) {
        return (Color) Enum.valueOf(Color.class, str);
    }

    public static Color[] values() {
        return (Color[]) $VALUES.clone();
    }
}
