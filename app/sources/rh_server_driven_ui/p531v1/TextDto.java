package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.FontDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextAlignmentDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: TextDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BY\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b2\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/Text;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TextDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TextDto$Surrogate;)V", "Lrh_server_driven_ui/v1/RenderableTextDto;", "text", "Lrh_server_driven_ui/v1/TextStyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/TextAlignmentDto;", "alignment", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "link_color_override", "Lrh_server_driven_ui/v1/FontDto;", "font", "", "number_of_lines", "(Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/TextAlignmentDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/FontDto;Ljava/lang/Integer;)V", "toProto", "()Lrh_server_driven_ui/v1/Text;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TextDto$Surrogate;", "getText", "()Lrh_server_driven_ui/v1/RenderableTextDto;", "getStyle", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getAlignment", "()Lrh_server_driven_ui/v1/TextAlignmentDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getLink_color_override", "getFont", "()Lrh_server_driven_ui/v1/FontDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TextDto implements Dto3<Text>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TextDto, Text>> binaryBase64Serializer$delegate;
    private static final TextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final RenderableTextDto getText() {
        return this.surrogate.getText();
    }

    public final TextStyleDto getStyle() {
        return this.surrogate.getStyle();
    }

    public final TextAlignmentDto getAlignment() {
        return this.surrogate.getAlignment();
    }

    public final ThemedColorDto getColor() {
        return this.surrogate.getColor();
    }

    public final ThemedColorDto getLink_color_override() {
        return this.surrogate.getLink_color_override();
    }

    public final FontDto getFont() {
        return this.surrogate.getFont();
    }

    public /* synthetic */ TextDto(RenderableTextDto renderableTextDto, TextStyleDto textStyleDto, TextAlignmentDto textAlignmentDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, FontDto fontDto, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : renderableTextDto, (i & 2) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 4) != 0 ? TextAlignmentDto.INSTANCE.getZeroValue() : textAlignmentDto, (i & 8) != 0 ? null : themedColorDto, (i & 16) != 0 ? null : themedColorDto2, (i & 32) != 0 ? null : fontDto, (i & 64) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextDto(RenderableTextDto renderableTextDto, TextStyleDto style, TextAlignmentDto alignment, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, FontDto fontDto, Integer num) {
        this(new Surrogate(renderableTextDto, style, alignment, themedColorDto, themedColorDto2, fontDto, num));
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public Text toProto() {
        RenderableTextDto text = this.surrogate.getText();
        RenderableText proto = text != null ? text.toProto() : null;
        TextStyle textStyle = (TextStyle) this.surrogate.getStyle().toProto();
        TextAlignment textAlignment = (TextAlignment) this.surrogate.getAlignment().toProto();
        ThemedColorDto color = this.surrogate.getColor();
        ThemedColor proto2 = color != null ? color.toProto() : null;
        ThemedColorDto link_color_override = this.surrogate.getLink_color_override();
        ThemedColor proto3 = link_color_override != null ? link_color_override.toProto() : null;
        FontDto font = this.surrogate.getFont();
        return new Text(proto, textStyle, textAlignment, proto2, proto3, font != null ? (Font) font.toProto() : null, this.surrogate.getNumber_of_lines(), null, 128, null);
    }

    public String toString() {
        return "[TextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TextDto) && Intrinsics.areEqual(((TextDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDto.kt */
    @Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002FEBf\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0019\b\u0002\u0010\u0011\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u0012\u0010\u0013Ba\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b<\u0010.\u001a\u0004\b;\u00109R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R1\u0010\u0011\u001a\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010A\u0012\u0004\bD\u0010.\u001a\u0004\bB\u0010C¨\u0006G"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextDto$Surrogate;", "", "Lrh_server_driven_ui/v1/RenderableTextDto;", "text", "Lrh_server_driven_ui/v1/TextStyleDto;", ResourceTypes.STYLE, "Lrh_server_driven_ui/v1/TextAlignmentDto;", "alignment", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "link_color_override", "Lrh_server_driven_ui/v1/FontDto;", "font", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "number_of_lines", "<init>", "(Lrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/TextAlignmentDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/FontDto;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/RenderableTextDto;Lrh_server_driven_ui/v1/TextStyleDto;Lrh_server_driven_ui/v1/TextAlignmentDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/FontDto;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/RenderableTextDto;", "getText", "()Lrh_server_driven_ui/v1/RenderableTextDto;", "getText$annotations", "()V", "Lrh_server_driven_ui/v1/TextStyleDto;", "getStyle", "()Lrh_server_driven_ui/v1/TextStyleDto;", "getStyle$annotations", "Lrh_server_driven_ui/v1/TextAlignmentDto;", "getAlignment", "()Lrh_server_driven_ui/v1/TextAlignmentDto;", "getAlignment$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor$annotations", "getLink_color_override", "getLink_color_override$annotations", "Lrh_server_driven_ui/v1/FontDto;", "getFont", "()Lrh_server_driven_ui/v1/FontDto;", "getFont$annotations", "Ljava/lang/Integer;", "getNumber_of_lines", "()Ljava/lang/Integer;", "getNumber_of_lines$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TextAlignmentDto alignment;
        private final ThemedColorDto color;
        private final FontDto font;
        private final ThemedColorDto link_color_override;
        private final Integer number_of_lines;
        private final TextStyleDto style;
        private final RenderableTextDto text;

        public Surrogate() {
            this((RenderableTextDto) null, (TextStyleDto) null, (TextAlignmentDto) null, (ThemedColorDto) null, (ThemedColorDto) null, (FontDto) null, (Integer) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.text, surrogate.text) && this.style == surrogate.style && this.alignment == surrogate.alignment && Intrinsics.areEqual(this.color, surrogate.color) && Intrinsics.areEqual(this.link_color_override, surrogate.link_color_override) && this.font == surrogate.font && Intrinsics.areEqual(this.number_of_lines, surrogate.number_of_lines);
        }

        public int hashCode() {
            RenderableTextDto renderableTextDto = this.text;
            int iHashCode = (((((renderableTextDto == null ? 0 : renderableTextDto.hashCode()) * 31) + this.style.hashCode()) * 31) + this.alignment.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.color;
            int iHashCode2 = (iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.link_color_override;
            int iHashCode3 = (iHashCode2 + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31;
            FontDto fontDto = this.font;
            int iHashCode4 = (iHashCode3 + (fontDto == null ? 0 : fontDto.hashCode())) * 31;
            Integer num = this.number_of_lines;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(text=" + this.text + ", style=" + this.style + ", alignment=" + this.alignment + ", color=" + this.color + ", link_color_override=" + this.link_color_override + ", font=" + this.font + ", number_of_lines=" + this.number_of_lines + ")";
        }

        /* compiled from: TextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, RenderableTextDto renderableTextDto, TextStyleDto textStyleDto, TextAlignmentDto textAlignmentDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, FontDto fontDto, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.text = null;
            } else {
                this.text = renderableTextDto;
            }
            if ((i & 2) == 0) {
                this.style = TextStyleDto.INSTANCE.getZeroValue();
            } else {
                this.style = textStyleDto;
            }
            if ((i & 4) == 0) {
                this.alignment = TextAlignmentDto.INSTANCE.getZeroValue();
            } else {
                this.alignment = textAlignmentDto;
            }
            if ((i & 8) == 0) {
                this.color = null;
            } else {
                this.color = themedColorDto;
            }
            if ((i & 16) == 0) {
                this.link_color_override = null;
            } else {
                this.link_color_override = themedColorDto2;
            }
            if ((i & 32) == 0) {
                this.font = null;
            } else {
                this.font = fontDto;
            }
            if ((i & 64) == 0) {
                this.number_of_lines = null;
            } else {
                this.number_of_lines = num;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            RenderableTextDto renderableTextDto = self.text;
            if (renderableTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, RenderableTextDto.Serializer.INSTANCE, renderableTextDto);
            }
            if (self.style != TextStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TextStyleDto.Serializer.INSTANCE, self.style);
            }
            if (self.alignment != TextAlignmentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, TextAlignmentDto.Serializer.INSTANCE, self.alignment);
            }
            ThemedColorDto themedColorDto = self.color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.link_color_override;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            FontDto fontDto = self.font;
            if (fontDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, FontDto.Serializer.INSTANCE, fontDto);
            }
            Integer num = self.number_of_lines;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, num);
            }
        }

        public Surrogate(RenderableTextDto renderableTextDto, TextStyleDto style, TextAlignmentDto alignment, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, FontDto fontDto, Integer num) {
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.text = renderableTextDto;
            this.style = style;
            this.alignment = alignment;
            this.color = themedColorDto;
            this.link_color_override = themedColorDto2;
            this.font = fontDto;
            this.number_of_lines = num;
        }

        public final RenderableTextDto getText() {
            return this.text;
        }

        public final TextStyleDto getStyle() {
            return this.style;
        }

        public /* synthetic */ Surrogate(RenderableTextDto renderableTextDto, TextStyleDto textStyleDto, TextAlignmentDto textAlignmentDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, FontDto fontDto, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : renderableTextDto, (i & 2) != 0 ? TextStyleDto.INSTANCE.getZeroValue() : textStyleDto, (i & 4) != 0 ? TextAlignmentDto.INSTANCE.getZeroValue() : textAlignmentDto, (i & 8) != 0 ? null : themedColorDto, (i & 16) != 0 ? null : themedColorDto2, (i & 32) != 0 ? null : fontDto, (i & 64) != 0 ? null : num);
        }

        public final TextAlignmentDto getAlignment() {
            return this.alignment;
        }

        public final ThemedColorDto getColor() {
            return this.color;
        }

        public final ThemedColorDto getLink_color_override() {
            return this.link_color_override;
        }

        public final FontDto getFont() {
            return this.font;
        }

        public final Integer getNumber_of_lines() {
            return this.number_of_lines;
        }
    }

    /* compiled from: TextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TextDto;", "Lrh_server_driven_ui/v1/Text;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TextDto, Text> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TextDto> getBinaryBase64Serializer() {
            return (KSerializer) TextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Text> getProtoAdapter() {
            return Text.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextDto getZeroValue() {
            return TextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TextDto fromProto(Text proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            RenderableText text = proto.getText();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RenderableTextDto renderableTextDtoFromProto = text != null ? RenderableTextDto.INSTANCE.fromProto(text) : null;
            TextStyleDto textStyleDtoFromProto = TextStyleDto.INSTANCE.fromProto(proto.getStyle());
            TextAlignmentDto textAlignmentDtoFromProto = TextAlignmentDto.INSTANCE.fromProto(proto.getAlignment());
            ThemedColor color = proto.getColor();
            ThemedColorDto themedColorDtoFromProto = color != null ? ThemedColorDto.INSTANCE.fromProto(color) : null;
            ThemedColor link_color_override = proto.getLink_color_override();
            ThemedColorDto themedColorDtoFromProto2 = link_color_override != null ? ThemedColorDto.INSTANCE.fromProto(link_color_override) : null;
            Font font = proto.getFont();
            return new TextDto(new Surrogate(renderableTextDtoFromProto, textStyleDtoFromProto, textAlignmentDtoFromProto, themedColorDtoFromProto, themedColorDtoFromProto2, font != null ? FontDto.INSTANCE.fromProto(font) : null, proto.getNumber_of_lines()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TextDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TextDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<TextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.Text", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TextDto";
        }
    }
}
