package microgram.p507ui.sdui;

import com.robinhood.android.account.p060ui.AccountNavigationViewState;
import com.robinhood.iso.countrycode.CountryCode;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bu\b\u0087\u0081\u0002\u0018\u0000 w2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001wB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bv¨\u0006x"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiColor;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCENT", "ANDROS", "ASTRO", CountryCode.COUNTRY_CODE_BG, "BG2", "BG3", "BIOME", "BIOME_DARK", "BIOME_LIGHT", "BLOOM", "C1", "C10", "C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C2", "C20", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "CC_CREAM", "CC_DUSK", "CC_GOLD_ACCENT", "CC_GOLD_BG", "CC_GOLD_BG2", "CC_GOLD_BG3", "CC_GOLD_FG", "CC_GOLD_FG2", "CC_GOLD_FG3", "CC_MIDNIGHT", "CC_PEACH", "CC_ROUGE", "CC_SILVER_ACCENT", "CC_SILVER_BG", "CC_SILVER_BG2", "CC_SILVER_BG3", "CC_SILVER_FG", "CC_SILVER_FG2", "CC_SILVER_FG3", "CC_SUNSET", "CLONE", "CLONE_DARK", "CLONE_LIGHT", "COSMONAUT", "COSMONAUT_DARK", "COSMONAUT_LIGHT", "DOT", "DOT_DARK", "DOT_LIGHT", "DROID", "DROID_DARK", "DROID_LIGHT", "EXOS", "FG", "FG2", "FG3", "FLARE", "GAIA", "HYDRO", "HYDRO_DARK", "HYDRO_LIGHT", "ION", "IRIS", "IRIS_DARK", "IRIS_LIGHT", "JADE", "JET", "JOULE", "JOULE_DARK", "JOULE_LIGHT", "LUMEN", "LUMEN_DARK", "LUMEN_LIGHT", "MILLENIUM", "MILLENIUM_DARK", "MILLENIUM_LIGHT", "MINERAL", "MOON", "MORPH", "NEGATIVE", "NEPTUNE", "NOVA", "POSITIVE", "PRIME", "PRIME_DARK", "PRIME_LIGHT", "RESIN", "RESIN_DARK", "RESIN_LIGHT", "RUBY", "SOL", "SOL_DARK", "SOL_LIGHT", "STRATOS", "SYNTH", "UNKNOWN", "UV", "UV_DARK", "UV_LIGHT", "X_RAY", "X_RAY_DARK", "X_RAY_LIGHT", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiColor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiColor[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("accent")
    public static final SduiColor ACCENT = new SduiColor("ACCENT", 0, "accent");

    @SerialName("andros")
    public static final SduiColor ANDROS = new SduiColor("ANDROS", 1, "andros");

    @SerialName("astro")
    public static final SduiColor ASTRO = new SduiColor("ASTRO", 2, "astro");

    /* renamed from: BG */
    @SerialName("bg")
    public static final SduiColor f7092BG = new SduiColor(CountryCode.COUNTRY_CODE_BG, 3, "bg");

    @SerialName("bg2")
    public static final SduiColor BG2 = new SduiColor("BG2", 4, "bg2");

    @SerialName("bg3")
    public static final SduiColor BG3 = new SduiColor("BG3", 5, "bg3");

    @SerialName("biome")
    public static final SduiColor BIOME = new SduiColor("BIOME", 6, "biome");

    @SerialName("biome-dark")
    public static final SduiColor BIOME_DARK = new SduiColor("BIOME_DARK", 7, "biome-dark");

    @SerialName("biome-light")
    public static final SduiColor BIOME_LIGHT = new SduiColor("BIOME_LIGHT", 8, "biome-light");

    @SerialName("bloom")
    public static final SduiColor BLOOM = new SduiColor("BLOOM", 9, "bloom");

    /* renamed from: C1 */
    @SerialName("c1")
    public static final SduiColor f7093C1 = new SduiColor("C1", 10, "c1");

    @SerialName("c10")
    public static final SduiColor C10 = new SduiColor("C10", 11, "c10");

    @SerialName("c11")
    public static final SduiColor C11 = new SduiColor("C11", 12, "c11");

    @SerialName("c12")
    public static final SduiColor C12 = new SduiColor("C12", 13, "c12");

    @SerialName("c13")
    public static final SduiColor C13 = new SduiColor("C13", 14, "c13");

    @SerialName("c14")
    public static final SduiColor C14 = new SduiColor("C14", 15, "c14");

    @SerialName("c15")
    public static final SduiColor C15 = new SduiColor("C15", 16, "c15");

    @SerialName("c16")
    public static final SduiColor C16 = new SduiColor("C16", 17, "c16");

    @SerialName("c17")
    public static final SduiColor C17 = new SduiColor("C17", 18, "c17");

    @SerialName("c18")
    public static final SduiColor C18 = new SduiColor("C18", 19, "c18");

    @SerialName("c19")
    public static final SduiColor C19 = new SduiColor("C19", 20, "c19");

    /* renamed from: C2 */
    @SerialName("c2")
    public static final SduiColor f7094C2 = new SduiColor("C2", 21, "c2");

    @SerialName("c20")
    public static final SduiColor C20 = new SduiColor("C20", 22, "c20");

    /* renamed from: C3 */
    @SerialName("c3")
    public static final SduiColor f7095C3 = new SduiColor("C3", 23, "c3");

    /* renamed from: C4 */
    @SerialName("c4")
    public static final SduiColor f7096C4 = new SduiColor("C4", 24, "c4");

    /* renamed from: C5 */
    @SerialName("c5")
    public static final SduiColor f7097C5 = new SduiColor("C5", 25, "c5");

    /* renamed from: C6 */
    @SerialName("c6")
    public static final SduiColor f7098C6 = new SduiColor("C6", 26, "c6");

    /* renamed from: C7 */
    @SerialName("c7")
    public static final SduiColor f7099C7 = new SduiColor("C7", 27, "c7");

    /* renamed from: C8 */
    @SerialName("c8")
    public static final SduiColor f7100C8 = new SduiColor("C8", 28, "c8");

    /* renamed from: C9 */
    @SerialName("c9")
    public static final SduiColor f7101C9 = new SduiColor("C9", 29, "c9");

    @SerialName("cc-cream")
    public static final SduiColor CC_CREAM = new SduiColor("CC_CREAM", 30, "cc-cream");

    @SerialName("cc-dusk")
    public static final SduiColor CC_DUSK = new SduiColor("CC_DUSK", 31, "cc-dusk");

    @SerialName("cc-gold-accent")
    public static final SduiColor CC_GOLD_ACCENT = new SduiColor("CC_GOLD_ACCENT", 32, "cc-gold-accent");

    @SerialName("cc-gold-bg")
    public static final SduiColor CC_GOLD_BG = new SduiColor("CC_GOLD_BG", 33, "cc-gold-bg");

    @SerialName("cc-gold-bg2")
    public static final SduiColor CC_GOLD_BG2 = new SduiColor("CC_GOLD_BG2", 34, "cc-gold-bg2");

    @SerialName("cc-gold-bg3")
    public static final SduiColor CC_GOLD_BG3 = new SduiColor("CC_GOLD_BG3", 35, "cc-gold-bg3");

    @SerialName("cc-gold-fg")
    public static final SduiColor CC_GOLD_FG = new SduiColor("CC_GOLD_FG", 36, "cc-gold-fg");

    @SerialName("cc-gold-fg2")
    public static final SduiColor CC_GOLD_FG2 = new SduiColor("CC_GOLD_FG2", 37, "cc-gold-fg2");

    @SerialName("cc-gold-fg3")
    public static final SduiColor CC_GOLD_FG3 = new SduiColor("CC_GOLD_FG3", 38, "cc-gold-fg3");

    @SerialName("cc-midnight")
    public static final SduiColor CC_MIDNIGHT = new SduiColor("CC_MIDNIGHT", 39, "cc-midnight");

    @SerialName("cc-peach")
    public static final SduiColor CC_PEACH = new SduiColor("CC_PEACH", 40, "cc-peach");

    @SerialName("cc-rouge")
    public static final SduiColor CC_ROUGE = new SduiColor("CC_ROUGE", 41, "cc-rouge");

    @SerialName("cc-silver-accent")
    public static final SduiColor CC_SILVER_ACCENT = new SduiColor("CC_SILVER_ACCENT", 42, "cc-silver-accent");

    @SerialName("cc-silver-bg")
    public static final SduiColor CC_SILVER_BG = new SduiColor("CC_SILVER_BG", 43, "cc-silver-bg");

    @SerialName("cc-silver-bg2")
    public static final SduiColor CC_SILVER_BG2 = new SduiColor("CC_SILVER_BG2", 44, "cc-silver-bg2");

    @SerialName("cc-silver-bg3")
    public static final SduiColor CC_SILVER_BG3 = new SduiColor("CC_SILVER_BG3", 45, "cc-silver-bg3");

    @SerialName("cc-silver-fg")
    public static final SduiColor CC_SILVER_FG = new SduiColor("CC_SILVER_FG", 46, "cc-silver-fg");

    @SerialName("cc-silver-fg2")
    public static final SduiColor CC_SILVER_FG2 = new SduiColor("CC_SILVER_FG2", 47, "cc-silver-fg2");

    @SerialName("cc-silver-fg3")
    public static final SduiColor CC_SILVER_FG3 = new SduiColor("CC_SILVER_FG3", 48, "cc-silver-fg3");

    @SerialName("cc-sunset")
    public static final SduiColor CC_SUNSET = new SduiColor("CC_SUNSET", 49, "cc-sunset");

    @SerialName("clone")
    public static final SduiColor CLONE = new SduiColor("CLONE", 50, "clone");

    @SerialName("clone-dark")
    public static final SduiColor CLONE_DARK = new SduiColor("CLONE_DARK", 51, "clone-dark");

    @SerialName("clone-light")
    public static final SduiColor CLONE_LIGHT = new SduiColor("CLONE_LIGHT", 52, "clone-light");

    @SerialName("cosmonaut")
    public static final SduiColor COSMONAUT = new SduiColor("COSMONAUT", 53, "cosmonaut");

    @SerialName("cosmonaut-dark")
    public static final SduiColor COSMONAUT_DARK = new SduiColor("COSMONAUT_DARK", 54, "cosmonaut-dark");

    @SerialName("cosmonaut-light")
    public static final SduiColor COSMONAUT_LIGHT = new SduiColor("COSMONAUT_LIGHT", 55, "cosmonaut-light");

    @SerialName("dot")
    public static final SduiColor DOT = new SduiColor("DOT", 56, "dot");

    @SerialName("dot-dark")
    public static final SduiColor DOT_DARK = new SduiColor("DOT_DARK", 57, "dot-dark");

    @SerialName("dot-light")
    public static final SduiColor DOT_LIGHT = new SduiColor("DOT_LIGHT", 58, "dot-light");

    @SerialName("droid")
    public static final SduiColor DROID = new SduiColor("DROID", 59, "droid");

    @SerialName("droid-dark")
    public static final SduiColor DROID_DARK = new SduiColor("DROID_DARK", 60, "droid-dark");

    @SerialName("droid-light")
    public static final SduiColor DROID_LIGHT = new SduiColor("DROID_LIGHT", 61, "droid-light");

    @SerialName("exos")
    public static final SduiColor EXOS = new SduiColor("EXOS", 62, "exos");

    /* renamed from: FG */
    @SerialName("fg")
    public static final SduiColor f7102FG = new SduiColor("FG", 63, "fg");

    @SerialName("fg2")
    public static final SduiColor FG2 = new SduiColor("FG2", 64, "fg2");

    @SerialName("fg3")
    public static final SduiColor FG3 = new SduiColor("FG3", 65, "fg3");

    @SerialName("flare")
    public static final SduiColor FLARE = new SduiColor("FLARE", 66, "flare");

    @SerialName("gaia")
    public static final SduiColor GAIA = new SduiColor("GAIA", 67, "gaia");

    @SerialName("hydro")
    public static final SduiColor HYDRO = new SduiColor("HYDRO", 68, "hydro");

    @SerialName("hydro-dark")
    public static final SduiColor HYDRO_DARK = new SduiColor("HYDRO_DARK", 69, "hydro-dark");

    @SerialName("hydro-light")
    public static final SduiColor HYDRO_LIGHT = new SduiColor("HYDRO_LIGHT", 70, "hydro-light");

    @SerialName("ion")
    public static final SduiColor ION = new SduiColor("ION", 71, "ion");

    @SerialName("iris")
    public static final SduiColor IRIS = new SduiColor("IRIS", 72, "iris");

    @SerialName("iris-dark")
    public static final SduiColor IRIS_DARK = new SduiColor("IRIS_DARK", 73, "iris-dark");

    @SerialName("iris-light")
    public static final SduiColor IRIS_LIGHT = new SduiColor("IRIS_LIGHT", 74, "iris-light");

    @SerialName("jade")
    public static final SduiColor JADE = new SduiColor("JADE", 75, "jade");

    @SerialName("jet")
    public static final SduiColor JET = new SduiColor("JET", 76, "jet");

    @SerialName("joule")
    public static final SduiColor JOULE = new SduiColor("JOULE", 77, "joule");

    @SerialName("joule-dark")
    public static final SduiColor JOULE_DARK = new SduiColor("JOULE_DARK", 78, "joule-dark");

    @SerialName("joule-light")
    public static final SduiColor JOULE_LIGHT = new SduiColor("JOULE_LIGHT", 79, "joule-light");

    @SerialName("lumen")
    public static final SduiColor LUMEN = new SduiColor("LUMEN", 80, "lumen");

    @SerialName("lumen-dark")
    public static final SduiColor LUMEN_DARK = new SduiColor("LUMEN_DARK", 81, "lumen-dark");

    @SerialName("lumen-light")
    public static final SduiColor LUMEN_LIGHT = new SduiColor("LUMEN_LIGHT", 82, "lumen-light");

    @SerialName("millenium")
    public static final SduiColor MILLENIUM = new SduiColor("MILLENIUM", 83, "millenium");

    @SerialName("millenium-dark")
    public static final SduiColor MILLENIUM_DARK = new SduiColor("MILLENIUM_DARK", 84, "millenium-dark");

    @SerialName("millenium-light")
    public static final SduiColor MILLENIUM_LIGHT = new SduiColor("MILLENIUM_LIGHT", 85, "millenium-light");

    @SerialName("mineral")
    public static final SduiColor MINERAL = new SduiColor("MINERAL", 86, "mineral");

    @SerialName("moon")
    public static final SduiColor MOON = new SduiColor("MOON", 87, "moon");

    @SerialName("morph")
    public static final SduiColor MORPH = new SduiColor("MORPH", 88, "morph");

    @SerialName("negative")
    public static final SduiColor NEGATIVE = new SduiColor("NEGATIVE", 89, "negative");

    @SerialName("neptune")
    public static final SduiColor NEPTUNE = new SduiColor("NEPTUNE", 90, "neptune");

    @SerialName("nova")
    public static final SduiColor NOVA = new SduiColor("NOVA", 91, "nova");

    @SerialName(AccountNavigationViewState.LOG_OUT_TEXT_COLOR)
    public static final SduiColor POSITIVE = new SduiColor("POSITIVE", 92, AccountNavigationViewState.LOG_OUT_TEXT_COLOR);

    @SerialName("prime")
    public static final SduiColor PRIME = new SduiColor("PRIME", 93, "prime");

    @SerialName("prime-dark")
    public static final SduiColor PRIME_DARK = new SduiColor("PRIME_DARK", 94, "prime-dark");

    @SerialName("prime-light")
    public static final SduiColor PRIME_LIGHT = new SduiColor("PRIME_LIGHT", 95, "prime-light");

    @SerialName("resin")
    public static final SduiColor RESIN = new SduiColor("RESIN", 96, "resin");

    @SerialName("resin-dark")
    public static final SduiColor RESIN_DARK = new SduiColor("RESIN_DARK", 97, "resin-dark");

    @SerialName("resin-light")
    public static final SduiColor RESIN_LIGHT = new SduiColor("RESIN_LIGHT", 98, "resin-light");

    @SerialName("ruby")
    public static final SduiColor RUBY = new SduiColor("RUBY", 99, "ruby");

    @SerialName("sol")
    public static final SduiColor SOL = new SduiColor("SOL", 100, "sol");

    @SerialName("sol-dark")
    public static final SduiColor SOL_DARK = new SduiColor("SOL_DARK", 101, "sol-dark");

    @SerialName("sol-light")
    public static final SduiColor SOL_LIGHT = new SduiColor("SOL_LIGHT", 102, "sol-light");

    @SerialName("stratos")
    public static final SduiColor STRATOS = new SduiColor("STRATOS", 103, "stratos");

    @SerialName("synth")
    public static final SduiColor SYNTH = new SduiColor("SYNTH", 104, "synth");

    @SerialName("unknown")
    public static final SduiColor UNKNOWN = new SduiColor("UNKNOWN", 105, "unknown");

    /* renamed from: UV */
    @SerialName("uv")
    public static final SduiColor f7103UV = new SduiColor("UV", 106, "uv");

    @SerialName("uv-dark")
    public static final SduiColor UV_DARK = new SduiColor("UV_DARK", 107, "uv-dark");

    @SerialName("uv-light")
    public static final SduiColor UV_LIGHT = new SduiColor("UV_LIGHT", 108, "uv-light");

    @SerialName("x-ray")
    public static final SduiColor X_RAY = new SduiColor("X_RAY", 109, "x-ray");

    @SerialName("x-ray-dark")
    public static final SduiColor X_RAY_DARK = new SduiColor("X_RAY_DARK", 110, "x-ray-dark");

    @SerialName("x-ray-light")
    public static final SduiColor X_RAY_LIGHT = new SduiColor("X_RAY_LIGHT", 111, "x-ray-light");

    private static final /* synthetic */ SduiColor[] $values() {
        return new SduiColor[]{ACCENT, ANDROS, ASTRO, f7092BG, BG2, BG3, BIOME, BIOME_DARK, BIOME_LIGHT, BLOOM, f7093C1, C10, C11, C12, C13, C14, C15, C16, C17, C18, C19, f7094C2, C20, f7095C3, f7096C4, f7097C5, f7098C6, f7099C7, f7100C8, f7101C9, CC_CREAM, CC_DUSK, CC_GOLD_ACCENT, CC_GOLD_BG, CC_GOLD_BG2, CC_GOLD_BG3, CC_GOLD_FG, CC_GOLD_FG2, CC_GOLD_FG3, CC_MIDNIGHT, CC_PEACH, CC_ROUGE, CC_SILVER_ACCENT, CC_SILVER_BG, CC_SILVER_BG2, CC_SILVER_BG3, CC_SILVER_FG, CC_SILVER_FG2, CC_SILVER_FG3, CC_SUNSET, CLONE, CLONE_DARK, CLONE_LIGHT, COSMONAUT, COSMONAUT_DARK, COSMONAUT_LIGHT, DOT, DOT_DARK, DOT_LIGHT, DROID, DROID_DARK, DROID_LIGHT, EXOS, f7102FG, FG2, FG3, FLARE, GAIA, HYDRO, HYDRO_DARK, HYDRO_LIGHT, ION, IRIS, IRIS_DARK, IRIS_LIGHT, JADE, JET, JOULE, JOULE_DARK, JOULE_LIGHT, LUMEN, LUMEN_DARK, LUMEN_LIGHT, MILLENIUM, MILLENIUM_DARK, MILLENIUM_LIGHT, MINERAL, MOON, MORPH, NEGATIVE, NEPTUNE, NOVA, POSITIVE, PRIME, PRIME_DARK, PRIME_LIGHT, RESIN, RESIN_DARK, RESIN_LIGHT, RUBY, SOL, SOL_DARK, SOL_LIGHT, STRATOS, SYNTH, UNKNOWN, f7103UV, UV_DARK, UV_LIGHT, X_RAY, X_RAY_DARK, X_RAY_LIGHT};
    }

    public static EnumEntries<SduiColor> getEntries() {
        return $ENTRIES;
    }

    public static SduiColor valueOf(String str) {
        return (SduiColor) Enum.valueOf(SduiColor.class, str);
    }

    public static SduiColor[] values() {
        return (SduiColor[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiColor$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiColor;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiColor.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiColor> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiColor(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiColor[] sduiColorArr$values = $values();
        $VALUES = sduiColorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiColorArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiColor.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiColor", SduiColor.values(), new String[]{"accent", "andros", "astro", "bg", "bg2", "bg3", "biome", "biome-dark", "biome-light", "bloom", "c1", "c10", "c11", "c12", "c13", "c14", "c15", "c16", "c17", "c18", "c19", "c2", "c20", "c3", "c4", "c5", "c6", "c7", "c8", "c9", "cc-cream", "cc-dusk", "cc-gold-accent", "cc-gold-bg", "cc-gold-bg2", "cc-gold-bg3", "cc-gold-fg", "cc-gold-fg2", "cc-gold-fg3", "cc-midnight", "cc-peach", "cc-rouge", "cc-silver-accent", "cc-silver-bg", "cc-silver-bg2", "cc-silver-bg3", "cc-silver-fg", "cc-silver-fg2", "cc-silver-fg3", "cc-sunset", "clone", "clone-dark", "clone-light", "cosmonaut", "cosmonaut-dark", "cosmonaut-light", "dot", "dot-dark", "dot-light", "droid", "droid-dark", "droid-light", "exos", "fg", "fg2", "fg3", "flare", "gaia", "hydro", "hydro-dark", "hydro-light", "ion", "iris", "iris-dark", "iris-light", "jade", "jet", "joule", "joule-dark", "joule-light", "lumen", "lumen-dark", "lumen-light", "millenium", "millenium-dark", "millenium-light", "mineral", "moon", "morph", "negative", "neptune", "nova", AccountNavigationViewState.LOG_OUT_TEXT_COLOR, "prime", "prime-dark", "prime-light", "resin", "resin-dark", "resin-light", "ruby", "sol", "sol-dark", "sol-light", "stratos", "synth", "unknown", "uv", "uv-dark", "uv-light", "x-ray", "x-ray-dark", "x-ray-light"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
            }
        });
    }
}
