package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ColorDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\bt\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u007f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0003\u007f\u0080\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020}H\u0016J\b\u0010~\u001a\u00020}H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bw¨\u0006\u0081\u0001"}, m3636d2 = {"Lrh_server_driven_ui/v1/ColorDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/Color;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "COLOR_UNSPECIFIED", "COLOR_ACCENT", "COLOR_POSITIVE", "COLOR_NEGATIVE", "COLOR_FG", "COLOR_FG2", "COLOR_FG3", "COLOR_BG", "COLOR_BG2", "COLOR_BG3", "COLOR_JET", "COLOR_NOVA", "COLOR_MINERAL", "COLOR_ANDROS", "COLOR_ION", "COLOR_JADE", "COLOR_STRATOS", "COLOR_EXOS", "COLOR_RUBY", "COLOR_GAIA", "COLOR_JOULE_LIGHT", "COLOR_JOULE", "COLOR_JOULE_DARK", "COLOR_SOL_LIGHT", "COLOR_SOL", "COLOR_SOL_DARK", "COLOR_LUMEN_LIGHT", "COLOR_LUMEN", "COLOR_LUMEN_DARK", "COLOR_X_RAY_LIGHT", "COLOR_X_RAY", "COLOR_X_RAY_DARK", "COLOR_PRIME_LIGHT", "COLOR_PRIME", "COLOR_PRIME_DARK", "COLOR_BIOME_LIGHT", "COLOR_BIOME", "COLOR_BIOME_DARK", "COLOR_DOT_LIGHT", "COLOR_DOT", "COLOR_DOT_DARK", "COLOR_HYDRO_LIGHT", "COLOR_HYDRO", "COLOR_HYDRO_DARK", "COLOR_COSMONAUT_LIGHT", "COLOR_COSMONAUT", "COLOR_COSMONAUT_DARK", "COLOR_UV_LIGHT", "COLOR_UV", "COLOR_UV_DARK", "COLOR_IRIS_LIGHT", "COLOR_IRIS", "COLOR_IRIS_DARK", "COLOR_MILLENIUM_LIGHT", "COLOR_MILLENIUM", "COLOR_MILLENIUM_DARK", "COLOR_RESIN_LIGHT", "COLOR_RESIN", "COLOR_RESIN_DARK", "COLOR_DROID_LIGHT", "COLOR_DROID", "COLOR_DROID_DARK", "COLOR_CLONE_LIGHT", "COLOR_CLONE", "COLOR_CLONE_DARK", "COLOR_BLOOM", "COLOR_FLARE", "COLOR_MORPH", "COLOR_MOON", "COLOR_ASTRO", "COLOR_NEPTUNE", "COLOR_SYNTH", "COLOR_C1", "COLOR_C2", "COLOR_C3", "COLOR_C4", "COLOR_C5", "COLOR_C6", "COLOR_C7", "COLOR_C8", "COLOR_C9", "COLOR_C10", "COLOR_C11", "COLOR_C12", "COLOR_C13", "COLOR_C14", "COLOR_C15", "COLOR_C16", "COLOR_C17", "COLOR_C18", "COLOR_C19", "COLOR_C20", "COLOR_CC_CREAM", "COLOR_CC_DUSK", "COLOR_CC_ROUGE", "COLOR_CC_PEACH", "COLOR_CC_SUNSET", "COLOR_CC_MIDNIGHT", "COLOR_CC_GOLD_ACCENT", "COLOR_CC_GOLD_FG", "COLOR_CC_GOLD_FG2", "COLOR_CC_GOLD_FG3", "COLOR_CC_GOLD_BG", "COLOR_CC_GOLD_BG2", "COLOR_CC_GOLD_BG3", "COLOR_CC_SILVER_ACCENT", "COLOR_CC_SILVER_FG", "COLOR_CC_SILVER_FG2", "COLOR_CC_SILVER_FG3", "COLOR_CC_SILVER_BG", "COLOR_CC_SILVER_BG2", "COLOR_CC_SILVER_BG3", "COLOR_NEON", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class ColorDto implements Dto2<Color>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ColorDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ColorDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ColorDto, Color>> binaryBase64Serializer$delegate;
    public static final ColorDto COLOR_UNSPECIFIED = new ColorDto("COLOR_UNSPECIFIED", 0) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_UNSPECIFIED;
        }
    };
    public static final ColorDto COLOR_ACCENT = new ColorDto("COLOR_ACCENT", 1) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_ACCENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_ACCENT;
        }
    };
    public static final ColorDto COLOR_POSITIVE = new ColorDto("COLOR_POSITIVE", 2) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_POSITIVE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_POSITIVE;
        }
    };
    public static final ColorDto COLOR_NEGATIVE = new ColorDto("COLOR_NEGATIVE", 3) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_NEGATIVE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_NEGATIVE;
        }
    };
    public static final ColorDto COLOR_FG = new ColorDto("COLOR_FG", 4) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_FG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_FG;
        }
    };
    public static final ColorDto COLOR_FG2 = new ColorDto("COLOR_FG2", 5) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_FG2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_FG2;
        }
    };
    public static final ColorDto COLOR_FG3 = new ColorDto("COLOR_FG3", 6) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_FG3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_FG3;
        }
    };
    public static final ColorDto COLOR_BG = new ColorDto("COLOR_BG", 7) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_BG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_BG;
        }
    };
    public static final ColorDto COLOR_BG2 = new ColorDto("COLOR_BG2", 8) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_BG2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_BG2;
        }
    };
    public static final ColorDto COLOR_BG3 = new ColorDto("COLOR_BG3", 9) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_BG3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_BG3;
        }
    };
    public static final ColorDto COLOR_JET = new ColorDto("COLOR_JET", 10) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_JET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_JET;
        }
    };
    public static final ColorDto COLOR_NOVA = new ColorDto("COLOR_NOVA", 11) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_NOVA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_NOVA;
        }
    };
    public static final ColorDto COLOR_MINERAL = new ColorDto("COLOR_MINERAL", 12) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_MINERAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_MINERAL;
        }
    };
    public static final ColorDto COLOR_ANDROS = new ColorDto("COLOR_ANDROS", 13) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_ANDROS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_ANDROS;
        }
    };
    public static final ColorDto COLOR_ION = new ColorDto("COLOR_ION", 14) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_ION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_ION;
        }
    };
    public static final ColorDto COLOR_JADE = new ColorDto("COLOR_JADE", 15) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_JADE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_JADE;
        }
    };
    public static final ColorDto COLOR_STRATOS = new ColorDto("COLOR_STRATOS", 16) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_STRATOS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_STRATOS;
        }
    };
    public static final ColorDto COLOR_EXOS = new ColorDto("COLOR_EXOS", 17) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_EXOS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_EXOS;
        }
    };
    public static final ColorDto COLOR_RUBY = new ColorDto("COLOR_RUBY", 18) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_RUBY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_RUBY;
        }
    };
    public static final ColorDto COLOR_GAIA = new ColorDto("COLOR_GAIA", 19) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_GAIA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_GAIA;
        }
    };
    public static final ColorDto COLOR_JOULE_LIGHT = new ColorDto("COLOR_JOULE_LIGHT", 20) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_JOULE_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_JOULE_LIGHT;
        }
    };
    public static final ColorDto COLOR_JOULE = new ColorDto("COLOR_JOULE", 21) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_JOULE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_JOULE;
        }
    };
    public static final ColorDto COLOR_JOULE_DARK = new ColorDto("COLOR_JOULE_DARK", 22) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_JOULE_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_JOULE_DARK;
        }
    };
    public static final ColorDto COLOR_SOL_LIGHT = new ColorDto("COLOR_SOL_LIGHT", 23) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_SOL_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_SOL_LIGHT;
        }
    };
    public static final ColorDto COLOR_SOL = new ColorDto("COLOR_SOL", 24) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_SOL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_SOL;
        }
    };
    public static final ColorDto COLOR_SOL_DARK = new ColorDto("COLOR_SOL_DARK", 25) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_SOL_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_SOL_DARK;
        }
    };
    public static final ColorDto COLOR_LUMEN_LIGHT = new ColorDto("COLOR_LUMEN_LIGHT", 26) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_LUMEN_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_LUMEN_LIGHT;
        }
    };
    public static final ColorDto COLOR_LUMEN = new ColorDto("COLOR_LUMEN", 27) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_LUMEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_LUMEN;
        }
    };
    public static final ColorDto COLOR_LUMEN_DARK = new ColorDto("COLOR_LUMEN_DARK", 28) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_LUMEN_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_LUMEN_DARK;
        }
    };
    public static final ColorDto COLOR_X_RAY_LIGHT = new ColorDto("COLOR_X_RAY_LIGHT", 29) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_X_RAY_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_X_RAY_LIGHT;
        }
    };
    public static final ColorDto COLOR_X_RAY = new ColorDto("COLOR_X_RAY", 30) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_X_RAY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_X_RAY;
        }
    };
    public static final ColorDto COLOR_X_RAY_DARK = new ColorDto("COLOR_X_RAY_DARK", 31) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_X_RAY_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_X_RAY_DARK;
        }
    };
    public static final ColorDto COLOR_PRIME_LIGHT = new ColorDto("COLOR_PRIME_LIGHT", 32) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_PRIME_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_PRIME_LIGHT;
        }
    };
    public static final ColorDto COLOR_PRIME = new ColorDto("COLOR_PRIME", 33) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_PRIME
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_PRIME;
        }
    };
    public static final ColorDto COLOR_PRIME_DARK = new ColorDto("COLOR_PRIME_DARK", 34) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_PRIME_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_PRIME_DARK;
        }
    };
    public static final ColorDto COLOR_BIOME_LIGHT = new ColorDto("COLOR_BIOME_LIGHT", 35) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_BIOME_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_BIOME_LIGHT;
        }
    };
    public static final ColorDto COLOR_BIOME = new ColorDto("COLOR_BIOME", 36) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_BIOME
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_BIOME;
        }
    };
    public static final ColorDto COLOR_BIOME_DARK = new ColorDto("COLOR_BIOME_DARK", 37) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_BIOME_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_BIOME_DARK;
        }
    };
    public static final ColorDto COLOR_DOT_LIGHT = new ColorDto("COLOR_DOT_LIGHT", 38) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_DOT_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_DOT_LIGHT;
        }
    };
    public static final ColorDto COLOR_DOT = new ColorDto("COLOR_DOT", 39) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_DOT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_DOT;
        }
    };
    public static final ColorDto COLOR_DOT_DARK = new ColorDto("COLOR_DOT_DARK", 40) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_DOT_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_DOT_DARK;
        }
    };
    public static final ColorDto COLOR_HYDRO_LIGHT = new ColorDto("COLOR_HYDRO_LIGHT", 41) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_HYDRO_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_HYDRO_LIGHT;
        }
    };
    public static final ColorDto COLOR_HYDRO = new ColorDto("COLOR_HYDRO", 42) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_HYDRO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_HYDRO;
        }
    };
    public static final ColorDto COLOR_HYDRO_DARK = new ColorDto("COLOR_HYDRO_DARK", 43) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_HYDRO_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_HYDRO_DARK;
        }
    };
    public static final ColorDto COLOR_COSMONAUT_LIGHT = new ColorDto("COLOR_COSMONAUT_LIGHT", 44) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_COSMONAUT_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_COSMONAUT_LIGHT;
        }
    };
    public static final ColorDto COLOR_COSMONAUT = new ColorDto("COLOR_COSMONAUT", 45) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_COSMONAUT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_COSMONAUT;
        }
    };
    public static final ColorDto COLOR_COSMONAUT_DARK = new ColorDto("COLOR_COSMONAUT_DARK", 46) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_COSMONAUT_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_COSMONAUT_DARK;
        }
    };
    public static final ColorDto COLOR_UV_LIGHT = new ColorDto("COLOR_UV_LIGHT", 47) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_UV_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_UV_LIGHT;
        }
    };
    public static final ColorDto COLOR_UV = new ColorDto("COLOR_UV", 48) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_UV
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_UV;
        }
    };
    public static final ColorDto COLOR_UV_DARK = new ColorDto("COLOR_UV_DARK", 49) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_UV_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_UV_DARK;
        }
    };
    public static final ColorDto COLOR_IRIS_LIGHT = new ColorDto("COLOR_IRIS_LIGHT", 50) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_IRIS_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_IRIS_LIGHT;
        }
    };
    public static final ColorDto COLOR_IRIS = new ColorDto("COLOR_IRIS", 51) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_IRIS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_IRIS;
        }
    };
    public static final ColorDto COLOR_IRIS_DARK = new ColorDto("COLOR_IRIS_DARK", 52) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_IRIS_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_IRIS_DARK;
        }
    };
    public static final ColorDto COLOR_MILLENIUM_LIGHT = new ColorDto("COLOR_MILLENIUM_LIGHT", 53) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_MILLENIUM_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_MILLENIUM_LIGHT;
        }
    };
    public static final ColorDto COLOR_MILLENIUM = new ColorDto("COLOR_MILLENIUM", 54) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_MILLENIUM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_MILLENIUM;
        }
    };
    public static final ColorDto COLOR_MILLENIUM_DARK = new ColorDto("COLOR_MILLENIUM_DARK", 55) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_MILLENIUM_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_MILLENIUM_DARK;
        }
    };
    public static final ColorDto COLOR_RESIN_LIGHT = new ColorDto("COLOR_RESIN_LIGHT", 56) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_RESIN_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_RESIN_LIGHT;
        }
    };
    public static final ColorDto COLOR_RESIN = new ColorDto("COLOR_RESIN", 57) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_RESIN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_RESIN;
        }
    };
    public static final ColorDto COLOR_RESIN_DARK = new ColorDto("COLOR_RESIN_DARK", 58) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_RESIN_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_RESIN_DARK;
        }
    };
    public static final ColorDto COLOR_DROID_LIGHT = new ColorDto("COLOR_DROID_LIGHT", 59) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_DROID_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_DROID_LIGHT;
        }
    };
    public static final ColorDto COLOR_DROID = new ColorDto("COLOR_DROID", 60) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_DROID
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_DROID;
        }
    };
    public static final ColorDto COLOR_DROID_DARK = new ColorDto("COLOR_DROID_DARK", 61) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_DROID_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_DROID_DARK;
        }
    };
    public static final ColorDto COLOR_CLONE_LIGHT = new ColorDto("COLOR_CLONE_LIGHT", 62) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CLONE_LIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CLONE_LIGHT;
        }
    };
    public static final ColorDto COLOR_CLONE = new ColorDto("COLOR_CLONE", 63) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CLONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CLONE;
        }
    };
    public static final ColorDto COLOR_CLONE_DARK = new ColorDto("COLOR_CLONE_DARK", 64) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CLONE_DARK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CLONE_DARK;
        }
    };
    public static final ColorDto COLOR_BLOOM = new ColorDto("COLOR_BLOOM", 65) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_BLOOM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_BLOOM;
        }
    };
    public static final ColorDto COLOR_FLARE = new ColorDto("COLOR_FLARE", 66) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_FLARE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_FLARE;
        }
    };
    public static final ColorDto COLOR_MORPH = new ColorDto("COLOR_MORPH", 67) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_MORPH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_MORPH;
        }
    };
    public static final ColorDto COLOR_MOON = new ColorDto("COLOR_MOON", 68) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_MOON
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_MOON;
        }
    };
    public static final ColorDto COLOR_ASTRO = new ColorDto("COLOR_ASTRO", 69) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_ASTRO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_ASTRO;
        }
    };
    public static final ColorDto COLOR_NEPTUNE = new ColorDto("COLOR_NEPTUNE", 70) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_NEPTUNE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_NEPTUNE;
        }
    };
    public static final ColorDto COLOR_SYNTH = new ColorDto("COLOR_SYNTH", 71) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_SYNTH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_SYNTH;
        }
    };
    public static final ColorDto COLOR_C1 = new ColorDto("COLOR_C1", 72) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C1
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C1;
        }
    };
    public static final ColorDto COLOR_C2 = new ColorDto("COLOR_C2", 73) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C2;
        }
    };
    public static final ColorDto COLOR_C3 = new ColorDto("COLOR_C3", 74) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C3;
        }
    };
    public static final ColorDto COLOR_C4 = new ColorDto("COLOR_C4", 75) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C4
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C4;
        }
    };
    public static final ColorDto COLOR_C5 = new ColorDto("COLOR_C5", 76) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C5
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C5;
        }
    };
    public static final ColorDto COLOR_C6 = new ColorDto("COLOR_C6", 77) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C6
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C6;
        }
    };
    public static final ColorDto COLOR_C7 = new ColorDto("COLOR_C7", 78) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C7
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C7;
        }
    };
    public static final ColorDto COLOR_C8 = new ColorDto("COLOR_C8", 79) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C8
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C8;
        }
    };
    public static final ColorDto COLOR_C9 = new ColorDto("COLOR_C9", 80) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C9
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C9;
        }
    };
    public static final ColorDto COLOR_C10 = new ColorDto("COLOR_C10", 81) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C10
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C10;
        }
    };
    public static final ColorDto COLOR_C11 = new ColorDto("COLOR_C11", 82) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C11
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C11;
        }
    };
    public static final ColorDto COLOR_C12 = new ColorDto("COLOR_C12", 83) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C12
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C12;
        }
    };
    public static final ColorDto COLOR_C13 = new ColorDto("COLOR_C13", 84) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C13
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C13;
        }
    };
    public static final ColorDto COLOR_C14 = new ColorDto("COLOR_C14", 85) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C14
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C14;
        }
    };
    public static final ColorDto COLOR_C15 = new ColorDto("COLOR_C15", 86) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C15
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C15;
        }
    };
    public static final ColorDto COLOR_C16 = new ColorDto("COLOR_C16", 87) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C16
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C16;
        }
    };
    public static final ColorDto COLOR_C17 = new ColorDto("COLOR_C17", 88) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C17
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C17;
        }
    };
    public static final ColorDto COLOR_C18 = new ColorDto("COLOR_C18", 89) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C18
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C18;
        }
    };
    public static final ColorDto COLOR_C19 = new ColorDto("COLOR_C19", 90) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C19
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C19;
        }
    };
    public static final ColorDto COLOR_C20 = new ColorDto("COLOR_C20", 91) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_C20
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_C20;
        }
    };
    public static final ColorDto COLOR_CC_CREAM = new ColorDto("COLOR_CC_CREAM", 92) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_CREAM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_CREAM;
        }
    };
    public static final ColorDto COLOR_CC_DUSK = new ColorDto("COLOR_CC_DUSK", 93) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_DUSK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_DUSK;
        }
    };
    public static final ColorDto COLOR_CC_ROUGE = new ColorDto("COLOR_CC_ROUGE", 94) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_ROUGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_ROUGE;
        }
    };
    public static final ColorDto COLOR_CC_PEACH = new ColorDto("COLOR_CC_PEACH", 95) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_PEACH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_PEACH;
        }
    };
    public static final ColorDto COLOR_CC_SUNSET = new ColorDto("COLOR_CC_SUNSET", 96) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SUNSET
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SUNSET;
        }
    };
    public static final ColorDto COLOR_CC_MIDNIGHT = new ColorDto("COLOR_CC_MIDNIGHT", 97) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_MIDNIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_MIDNIGHT;
        }
    };
    public static final ColorDto COLOR_CC_GOLD_ACCENT = new ColorDto("COLOR_CC_GOLD_ACCENT", 98) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_GOLD_ACCENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_GOLD_ACCENT;
        }
    };
    public static final ColorDto COLOR_CC_GOLD_FG = new ColorDto("COLOR_CC_GOLD_FG", 99) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_GOLD_FG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_GOLD_FG;
        }
    };
    public static final ColorDto COLOR_CC_GOLD_FG2 = new ColorDto("COLOR_CC_GOLD_FG2", 100) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_GOLD_FG2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_GOLD_FG2;
        }
    };
    public static final ColorDto COLOR_CC_GOLD_FG3 = new ColorDto("COLOR_CC_GOLD_FG3", 101) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_GOLD_FG3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_GOLD_FG3;
        }
    };
    public static final ColorDto COLOR_CC_GOLD_BG = new ColorDto("COLOR_CC_GOLD_BG", 102) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_GOLD_BG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_GOLD_BG;
        }
    };
    public static final ColorDto COLOR_CC_GOLD_BG2 = new ColorDto("COLOR_CC_GOLD_BG2", 103) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_GOLD_BG2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_GOLD_BG2;
        }
    };
    public static final ColorDto COLOR_CC_GOLD_BG3 = new ColorDto("COLOR_CC_GOLD_BG3", 104) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_GOLD_BG3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_GOLD_BG3;
        }
    };
    public static final ColorDto COLOR_CC_SILVER_ACCENT = new ColorDto("COLOR_CC_SILVER_ACCENT", 105) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SILVER_ACCENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SILVER_ACCENT;
        }
    };
    public static final ColorDto COLOR_CC_SILVER_FG = new ColorDto("COLOR_CC_SILVER_FG", 106) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SILVER_FG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SILVER_FG;
        }
    };
    public static final ColorDto COLOR_CC_SILVER_FG2 = new ColorDto("COLOR_CC_SILVER_FG2", 107) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SILVER_FG2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SILVER_FG2;
        }
    };
    public static final ColorDto COLOR_CC_SILVER_FG3 = new ColorDto("COLOR_CC_SILVER_FG3", 108) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SILVER_FG3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SILVER_FG3;
        }
    };
    public static final ColorDto COLOR_CC_SILVER_BG = new ColorDto("COLOR_CC_SILVER_BG", 109) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SILVER_BG
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SILVER_BG;
        }
    };
    public static final ColorDto COLOR_CC_SILVER_BG2 = new ColorDto("COLOR_CC_SILVER_BG2", 110) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SILVER_BG2
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SILVER_BG2;
        }
    };
    public static final ColorDto COLOR_CC_SILVER_BG3 = new ColorDto("COLOR_CC_SILVER_BG3", 111) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_CC_SILVER_BG3
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_CC_SILVER_BG3;
        }
    };
    public static final ColorDto COLOR_NEON = new ColorDto("COLOR_NEON", 112) { // from class: rh_server_driven_ui.v1.ColorDto.COLOR_NEON
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Color toProto() {
            return Color.COLOR_NEON;
        }
    };

    private static final /* synthetic */ ColorDto[] $values() {
        return new ColorDto[]{COLOR_UNSPECIFIED, COLOR_ACCENT, COLOR_POSITIVE, COLOR_NEGATIVE, COLOR_FG, COLOR_FG2, COLOR_FG3, COLOR_BG, COLOR_BG2, COLOR_BG3, COLOR_JET, COLOR_NOVA, COLOR_MINERAL, COLOR_ANDROS, COLOR_ION, COLOR_JADE, COLOR_STRATOS, COLOR_EXOS, COLOR_RUBY, COLOR_GAIA, COLOR_JOULE_LIGHT, COLOR_JOULE, COLOR_JOULE_DARK, COLOR_SOL_LIGHT, COLOR_SOL, COLOR_SOL_DARK, COLOR_LUMEN_LIGHT, COLOR_LUMEN, COLOR_LUMEN_DARK, COLOR_X_RAY_LIGHT, COLOR_X_RAY, COLOR_X_RAY_DARK, COLOR_PRIME_LIGHT, COLOR_PRIME, COLOR_PRIME_DARK, COLOR_BIOME_LIGHT, COLOR_BIOME, COLOR_BIOME_DARK, COLOR_DOT_LIGHT, COLOR_DOT, COLOR_DOT_DARK, COLOR_HYDRO_LIGHT, COLOR_HYDRO, COLOR_HYDRO_DARK, COLOR_COSMONAUT_LIGHT, COLOR_COSMONAUT, COLOR_COSMONAUT_DARK, COLOR_UV_LIGHT, COLOR_UV, COLOR_UV_DARK, COLOR_IRIS_LIGHT, COLOR_IRIS, COLOR_IRIS_DARK, COLOR_MILLENIUM_LIGHT, COLOR_MILLENIUM, COLOR_MILLENIUM_DARK, COLOR_RESIN_LIGHT, COLOR_RESIN, COLOR_RESIN_DARK, COLOR_DROID_LIGHT, COLOR_DROID, COLOR_DROID_DARK, COLOR_CLONE_LIGHT, COLOR_CLONE, COLOR_CLONE_DARK, COLOR_BLOOM, COLOR_FLARE, COLOR_MORPH, COLOR_MOON, COLOR_ASTRO, COLOR_NEPTUNE, COLOR_SYNTH, COLOR_C1, COLOR_C2, COLOR_C3, COLOR_C4, COLOR_C5, COLOR_C6, COLOR_C7, COLOR_C8, COLOR_C9, COLOR_C10, COLOR_C11, COLOR_C12, COLOR_C13, COLOR_C14, COLOR_C15, COLOR_C16, COLOR_C17, COLOR_C18, COLOR_C19, COLOR_C20, COLOR_CC_CREAM, COLOR_CC_DUSK, COLOR_CC_ROUGE, COLOR_CC_PEACH, COLOR_CC_SUNSET, COLOR_CC_MIDNIGHT, COLOR_CC_GOLD_ACCENT, COLOR_CC_GOLD_FG, COLOR_CC_GOLD_FG2, COLOR_CC_GOLD_FG3, COLOR_CC_GOLD_BG, COLOR_CC_GOLD_BG2, COLOR_CC_GOLD_BG3, COLOR_CC_SILVER_ACCENT, COLOR_CC_SILVER_FG, COLOR_CC_SILVER_FG2, COLOR_CC_SILVER_FG3, COLOR_CC_SILVER_BG, COLOR_CC_SILVER_BG2, COLOR_CC_SILVER_BG3, COLOR_NEON};
    }

    public /* synthetic */ ColorDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ColorDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ColorDto(String str, int i) {
    }

    static {
        ColorDto[] colorDtoArr$values = $values();
        $VALUES = colorDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(colorDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ColorDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ColorDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ColorDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ColorDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/ColorDto;", "Lrh_server_driven_ui/v1/Color;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ColorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ColorDto, Color> {

        /* compiled from: ColorDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Color.values().length];
                try {
                    iArr[Color.COLOR_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Color.COLOR_ACCENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Color.COLOR_POSITIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Color.COLOR_NEGATIVE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Color.COLOR_FG.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Color.COLOR_FG2.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Color.COLOR_FG3.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Color.COLOR_BG.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Color.COLOR_BG2.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Color.COLOR_BG3.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Color.COLOR_JET.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Color.COLOR_NOVA.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[Color.COLOR_MINERAL.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[Color.COLOR_ANDROS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[Color.COLOR_ION.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[Color.COLOR_JADE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[Color.COLOR_STRATOS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[Color.COLOR_EXOS.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[Color.COLOR_RUBY.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[Color.COLOR_GAIA.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[Color.COLOR_JOULE_LIGHT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[Color.COLOR_JOULE.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[Color.COLOR_JOULE_DARK.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[Color.COLOR_SOL_LIGHT.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[Color.COLOR_SOL.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[Color.COLOR_SOL_DARK.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[Color.COLOR_LUMEN_LIGHT.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[Color.COLOR_LUMEN.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[Color.COLOR_LUMEN_DARK.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[Color.COLOR_X_RAY_LIGHT.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[Color.COLOR_X_RAY.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[Color.COLOR_X_RAY_DARK.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[Color.COLOR_PRIME_LIGHT.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[Color.COLOR_PRIME.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[Color.COLOR_PRIME_DARK.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[Color.COLOR_BIOME_LIGHT.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[Color.COLOR_BIOME.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[Color.COLOR_BIOME_DARK.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[Color.COLOR_DOT_LIGHT.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[Color.COLOR_DOT.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[Color.COLOR_DOT_DARK.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[Color.COLOR_HYDRO_LIGHT.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[Color.COLOR_HYDRO.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[Color.COLOR_HYDRO_DARK.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[Color.COLOR_COSMONAUT_LIGHT.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[Color.COLOR_COSMONAUT.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[Color.COLOR_COSMONAUT_DARK.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[Color.COLOR_UV_LIGHT.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[Color.COLOR_UV.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[Color.COLOR_UV_DARK.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[Color.COLOR_IRIS_LIGHT.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[Color.COLOR_IRIS.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[Color.COLOR_IRIS_DARK.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[Color.COLOR_MILLENIUM_LIGHT.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[Color.COLOR_MILLENIUM.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[Color.COLOR_MILLENIUM_DARK.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[Color.COLOR_RESIN_LIGHT.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[Color.COLOR_RESIN.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[Color.COLOR_RESIN_DARK.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[Color.COLOR_DROID_LIGHT.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[Color.COLOR_DROID.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[Color.COLOR_DROID_DARK.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[Color.COLOR_CLONE_LIGHT.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                try {
                    iArr[Color.COLOR_CLONE.ordinal()] = 64;
                } catch (NoSuchFieldError unused64) {
                }
                try {
                    iArr[Color.COLOR_CLONE_DARK.ordinal()] = 65;
                } catch (NoSuchFieldError unused65) {
                }
                try {
                    iArr[Color.COLOR_BLOOM.ordinal()] = 66;
                } catch (NoSuchFieldError unused66) {
                }
                try {
                    iArr[Color.COLOR_FLARE.ordinal()] = 67;
                } catch (NoSuchFieldError unused67) {
                }
                try {
                    iArr[Color.COLOR_MORPH.ordinal()] = 68;
                } catch (NoSuchFieldError unused68) {
                }
                try {
                    iArr[Color.COLOR_MOON.ordinal()] = 69;
                } catch (NoSuchFieldError unused69) {
                }
                try {
                    iArr[Color.COLOR_ASTRO.ordinal()] = 70;
                } catch (NoSuchFieldError unused70) {
                }
                try {
                    iArr[Color.COLOR_NEPTUNE.ordinal()] = 71;
                } catch (NoSuchFieldError unused71) {
                }
                try {
                    iArr[Color.COLOR_SYNTH.ordinal()] = 72;
                } catch (NoSuchFieldError unused72) {
                }
                try {
                    iArr[Color.COLOR_C1.ordinal()] = 73;
                } catch (NoSuchFieldError unused73) {
                }
                try {
                    iArr[Color.COLOR_C2.ordinal()] = 74;
                } catch (NoSuchFieldError unused74) {
                }
                try {
                    iArr[Color.COLOR_C3.ordinal()] = 75;
                } catch (NoSuchFieldError unused75) {
                }
                try {
                    iArr[Color.COLOR_C4.ordinal()] = 76;
                } catch (NoSuchFieldError unused76) {
                }
                try {
                    iArr[Color.COLOR_C5.ordinal()] = 77;
                } catch (NoSuchFieldError unused77) {
                }
                try {
                    iArr[Color.COLOR_C6.ordinal()] = 78;
                } catch (NoSuchFieldError unused78) {
                }
                try {
                    iArr[Color.COLOR_C7.ordinal()] = 79;
                } catch (NoSuchFieldError unused79) {
                }
                try {
                    iArr[Color.COLOR_C8.ordinal()] = 80;
                } catch (NoSuchFieldError unused80) {
                }
                try {
                    iArr[Color.COLOR_C9.ordinal()] = 81;
                } catch (NoSuchFieldError unused81) {
                }
                try {
                    iArr[Color.COLOR_C10.ordinal()] = 82;
                } catch (NoSuchFieldError unused82) {
                }
                try {
                    iArr[Color.COLOR_C11.ordinal()] = 83;
                } catch (NoSuchFieldError unused83) {
                }
                try {
                    iArr[Color.COLOR_C12.ordinal()] = 84;
                } catch (NoSuchFieldError unused84) {
                }
                try {
                    iArr[Color.COLOR_C13.ordinal()] = 85;
                } catch (NoSuchFieldError unused85) {
                }
                try {
                    iArr[Color.COLOR_C14.ordinal()] = 86;
                } catch (NoSuchFieldError unused86) {
                }
                try {
                    iArr[Color.COLOR_C15.ordinal()] = 87;
                } catch (NoSuchFieldError unused87) {
                }
                try {
                    iArr[Color.COLOR_C16.ordinal()] = 88;
                } catch (NoSuchFieldError unused88) {
                }
                try {
                    iArr[Color.COLOR_C17.ordinal()] = 89;
                } catch (NoSuchFieldError unused89) {
                }
                try {
                    iArr[Color.COLOR_C18.ordinal()] = 90;
                } catch (NoSuchFieldError unused90) {
                }
                try {
                    iArr[Color.COLOR_C19.ordinal()] = 91;
                } catch (NoSuchFieldError unused91) {
                }
                try {
                    iArr[Color.COLOR_C20.ordinal()] = 92;
                } catch (NoSuchFieldError unused92) {
                }
                try {
                    iArr[Color.COLOR_CC_CREAM.ordinal()] = 93;
                } catch (NoSuchFieldError unused93) {
                }
                try {
                    iArr[Color.COLOR_CC_DUSK.ordinal()] = 94;
                } catch (NoSuchFieldError unused94) {
                }
                try {
                    iArr[Color.COLOR_CC_ROUGE.ordinal()] = 95;
                } catch (NoSuchFieldError unused95) {
                }
                try {
                    iArr[Color.COLOR_CC_PEACH.ordinal()] = 96;
                } catch (NoSuchFieldError unused96) {
                }
                try {
                    iArr[Color.COLOR_CC_SUNSET.ordinal()] = 97;
                } catch (NoSuchFieldError unused97) {
                }
                try {
                    iArr[Color.COLOR_CC_MIDNIGHT.ordinal()] = 98;
                } catch (NoSuchFieldError unused98) {
                }
                try {
                    iArr[Color.COLOR_CC_GOLD_ACCENT.ordinal()] = 99;
                } catch (NoSuchFieldError unused99) {
                }
                try {
                    iArr[Color.COLOR_CC_GOLD_FG.ordinal()] = 100;
                } catch (NoSuchFieldError unused100) {
                }
                try {
                    iArr[Color.COLOR_CC_GOLD_FG2.ordinal()] = 101;
                } catch (NoSuchFieldError unused101) {
                }
                try {
                    iArr[Color.COLOR_CC_GOLD_FG3.ordinal()] = 102;
                } catch (NoSuchFieldError unused102) {
                }
                try {
                    iArr[Color.COLOR_CC_GOLD_BG.ordinal()] = 103;
                } catch (NoSuchFieldError unused103) {
                }
                try {
                    iArr[Color.COLOR_CC_GOLD_BG2.ordinal()] = 104;
                } catch (NoSuchFieldError unused104) {
                }
                try {
                    iArr[Color.COLOR_CC_GOLD_BG3.ordinal()] = 105;
                } catch (NoSuchFieldError unused105) {
                }
                try {
                    iArr[Color.COLOR_CC_SILVER_ACCENT.ordinal()] = 106;
                } catch (NoSuchFieldError unused106) {
                }
                try {
                    iArr[Color.COLOR_CC_SILVER_FG.ordinal()] = 107;
                } catch (NoSuchFieldError unused107) {
                }
                try {
                    iArr[Color.COLOR_CC_SILVER_FG2.ordinal()] = 108;
                } catch (NoSuchFieldError unused108) {
                }
                try {
                    iArr[Color.COLOR_CC_SILVER_FG3.ordinal()] = 109;
                } catch (NoSuchFieldError unused109) {
                }
                try {
                    iArr[Color.COLOR_CC_SILVER_BG.ordinal()] = 110;
                } catch (NoSuchFieldError unused110) {
                }
                try {
                    iArr[Color.COLOR_CC_SILVER_BG2.ordinal()] = 111;
                } catch (NoSuchFieldError unused111) {
                }
                try {
                    iArr[Color.COLOR_CC_SILVER_BG3.ordinal()] = 112;
                } catch (NoSuchFieldError unused112) {
                }
                try {
                    iArr[Color.COLOR_NEON.ordinal()] = 113;
                } catch (NoSuchFieldError unused113) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ColorDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ColorDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ColorDto> getBinaryBase64Serializer() {
            return (KSerializer) ColorDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Color> getProtoAdapter() {
            return Color.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ColorDto getZeroValue() {
            return ColorDto.COLOR_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ColorDto fromProto(Color proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ColorDto.COLOR_UNSPECIFIED;
                case 2:
                    return ColorDto.COLOR_ACCENT;
                case 3:
                    return ColorDto.COLOR_POSITIVE;
                case 4:
                    return ColorDto.COLOR_NEGATIVE;
                case 5:
                    return ColorDto.COLOR_FG;
                case 6:
                    return ColorDto.COLOR_FG2;
                case 7:
                    return ColorDto.COLOR_FG3;
                case 8:
                    return ColorDto.COLOR_BG;
                case 9:
                    return ColorDto.COLOR_BG2;
                case 10:
                    return ColorDto.COLOR_BG3;
                case 11:
                    return ColorDto.COLOR_JET;
                case 12:
                    return ColorDto.COLOR_NOVA;
                case 13:
                    return ColorDto.COLOR_MINERAL;
                case 14:
                    return ColorDto.COLOR_ANDROS;
                case 15:
                    return ColorDto.COLOR_ION;
                case 16:
                    return ColorDto.COLOR_JADE;
                case 17:
                    return ColorDto.COLOR_STRATOS;
                case 18:
                    return ColorDto.COLOR_EXOS;
                case 19:
                    return ColorDto.COLOR_RUBY;
                case 20:
                    return ColorDto.COLOR_GAIA;
                case 21:
                    return ColorDto.COLOR_JOULE_LIGHT;
                case 22:
                    return ColorDto.COLOR_JOULE;
                case 23:
                    return ColorDto.COLOR_JOULE_DARK;
                case 24:
                    return ColorDto.COLOR_SOL_LIGHT;
                case 25:
                    return ColorDto.COLOR_SOL;
                case 26:
                    return ColorDto.COLOR_SOL_DARK;
                case 27:
                    return ColorDto.COLOR_LUMEN_LIGHT;
                case 28:
                    return ColorDto.COLOR_LUMEN;
                case 29:
                    return ColorDto.COLOR_LUMEN_DARK;
                case 30:
                    return ColorDto.COLOR_X_RAY_LIGHT;
                case 31:
                    return ColorDto.COLOR_X_RAY;
                case 32:
                    return ColorDto.COLOR_X_RAY_DARK;
                case 33:
                    return ColorDto.COLOR_PRIME_LIGHT;
                case 34:
                    return ColorDto.COLOR_PRIME;
                case 35:
                    return ColorDto.COLOR_PRIME_DARK;
                case 36:
                    return ColorDto.COLOR_BIOME_LIGHT;
                case 37:
                    return ColorDto.COLOR_BIOME;
                case 38:
                    return ColorDto.COLOR_BIOME_DARK;
                case 39:
                    return ColorDto.COLOR_DOT_LIGHT;
                case 40:
                    return ColorDto.COLOR_DOT;
                case 41:
                    return ColorDto.COLOR_DOT_DARK;
                case 42:
                    return ColorDto.COLOR_HYDRO_LIGHT;
                case 43:
                    return ColorDto.COLOR_HYDRO;
                case 44:
                    return ColorDto.COLOR_HYDRO_DARK;
                case 45:
                    return ColorDto.COLOR_COSMONAUT_LIGHT;
                case 46:
                    return ColorDto.COLOR_COSMONAUT;
                case 47:
                    return ColorDto.COLOR_COSMONAUT_DARK;
                case 48:
                    return ColorDto.COLOR_UV_LIGHT;
                case 49:
                    return ColorDto.COLOR_UV;
                case 50:
                    return ColorDto.COLOR_UV_DARK;
                case 51:
                    return ColorDto.COLOR_IRIS_LIGHT;
                case 52:
                    return ColorDto.COLOR_IRIS;
                case 53:
                    return ColorDto.COLOR_IRIS_DARK;
                case 54:
                    return ColorDto.COLOR_MILLENIUM_LIGHT;
                case 55:
                    return ColorDto.COLOR_MILLENIUM;
                case 56:
                    return ColorDto.COLOR_MILLENIUM_DARK;
                case 57:
                    return ColorDto.COLOR_RESIN_LIGHT;
                case 58:
                    return ColorDto.COLOR_RESIN;
                case 59:
                    return ColorDto.COLOR_RESIN_DARK;
                case 60:
                    return ColorDto.COLOR_DROID_LIGHT;
                case 61:
                    return ColorDto.COLOR_DROID;
                case 62:
                    return ColorDto.COLOR_DROID_DARK;
                case 63:
                    return ColorDto.COLOR_CLONE_LIGHT;
                case 64:
                    return ColorDto.COLOR_CLONE;
                case 65:
                    return ColorDto.COLOR_CLONE_DARK;
                case 66:
                    return ColorDto.COLOR_BLOOM;
                case 67:
                    return ColorDto.COLOR_FLARE;
                case SDK_ASSET_ICON_HOME_VALUE:
                    return ColorDto.COLOR_MORPH;
                case 69:
                    return ColorDto.COLOR_MOON;
                case 70:
                    return ColorDto.COLOR_ASTRO;
                case SDK_ASSET_ICON_GUIDE_VALUE:
                    return ColorDto.COLOR_NEPTUNE;
                case SDK_ASSET_ICON_GLOBE_VALUE:
                    return ColorDto.COLOR_SYNTH;
                case 73:
                    return ColorDto.COLOR_C1;
                case 74:
                    return ColorDto.COLOR_C2;
                case 75:
                    return ColorDto.COLOR_C3;
                case 76:
                    return ColorDto.COLOR_C4;
                case 77:
                    return ColorDto.COLOR_C5;
                case 78:
                    return ColorDto.COLOR_C6;
                case 79:
                    return ColorDto.COLOR_C7;
                case 80:
                    return ColorDto.COLOR_C8;
                case 81:
                    return ColorDto.COLOR_C9;
                case 82:
                    return ColorDto.COLOR_C10;
                case 83:
                    return ColorDto.COLOR_C11;
                case 84:
                    return ColorDto.COLOR_C12;
                case 85:
                    return ColorDto.COLOR_C13;
                case 86:
                    return ColorDto.COLOR_C14;
                case 87:
                    return ColorDto.COLOR_C15;
                case 88:
                    return ColorDto.COLOR_C16;
                case 89:
                    return ColorDto.COLOR_C17;
                case 90:
                    return ColorDto.COLOR_C18;
                case 91:
                    return ColorDto.COLOR_C19;
                case 92:
                    return ColorDto.COLOR_C20;
                case 93:
                    return ColorDto.COLOR_CC_CREAM;
                case 94:
                    return ColorDto.COLOR_CC_DUSK;
                case 95:
                    return ColorDto.COLOR_CC_ROUGE;
                case 96:
                    return ColorDto.COLOR_CC_PEACH;
                case 97:
                    return ColorDto.COLOR_CC_SUNSET;
                case 98:
                    return ColorDto.COLOR_CC_MIDNIGHT;
                case 99:
                    return ColorDto.COLOR_CC_GOLD_ACCENT;
                case 100:
                    return ColorDto.COLOR_CC_GOLD_FG;
                case 101:
                    return ColorDto.COLOR_CC_GOLD_FG2;
                case 102:
                    return ColorDto.COLOR_CC_GOLD_FG3;
                case 103:
                    return ColorDto.COLOR_CC_GOLD_BG;
                case 104:
                    return ColorDto.COLOR_CC_GOLD_BG2;
                case 105:
                    return ColorDto.COLOR_CC_GOLD_BG3;
                case 106:
                    return ColorDto.COLOR_CC_SILVER_ACCENT;
                case 107:
                    return ColorDto.COLOR_CC_SILVER_FG;
                case 108:
                    return ColorDto.COLOR_CC_SILVER_FG2;
                case 109:
                    return ColorDto.COLOR_CC_SILVER_FG3;
                case 110:
                    return ColorDto.COLOR_CC_SILVER_BG;
                case 111:
                    return ColorDto.COLOR_CC_SILVER_BG2;
                case 112:
                    return ColorDto.COLOR_CC_SILVER_BG3;
                case 113:
                    return ColorDto.COLOR_NEON;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ColorDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/ColorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ColorDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<ColorDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ColorDto, Color> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.Color", ColorDto.getEntries(), ColorDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ColorDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ColorDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ColorDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ColorDto valueOf(String str) {
        return (ColorDto) Enum.valueOf(ColorDto.class, str);
    }

    public static ColorDto[] values() {
        return (ColorDto[]) $VALUES.clone();
    }
}
