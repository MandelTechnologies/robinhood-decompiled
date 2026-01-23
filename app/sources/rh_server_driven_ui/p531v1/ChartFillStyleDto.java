package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import rh_server_driven_ui.p531v1.DotChartFillStyleDto;
import rh_server_driven_ui.p531v1.DottedChartFillStyleDto;
import rh_server_driven_ui.p531v1.GradientAnimationChartFillStyleDto;
import rh_server_driven_ui.p531v1.GradientChartFillStyleDto;
import rh_server_driven_ui.p531v1.RoundedSolidChartFillStyleDto;
import rh_server_driven_ui.p531v1.SolidChartFillStyleDto;

/* compiled from: ChartFillStyleDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005)(*+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010'\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006-"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ChartFillStyle;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "style_details", "(Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;)V", "copy", "(Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;)Lrh_server_driven_ui/v1/ChartFillStyleDto;", "toProto", "()Lrh_server_driven_ui/v1/ChartFillStyle;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate;", "getStyle_details", "()Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "getRounded_solid_color", "()Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "rounded_solid_color", "Companion", "Surrogate", "StyleDetailsDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class ChartFillStyleDto implements Dto3<ChartFillStyle>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ChartFillStyleDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ChartFillStyleDto, ChartFillStyle>> binaryBase64Serializer$delegate;
    private static final ChartFillStyleDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ChartFillStyleDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ChartFillStyleDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final StyleDetailsDto getStyle_details() {
        if (this.surrogate.getDotted() != null) {
            return new StyleDetailsDto.Dotted(this.surrogate.getDotted());
        }
        if (this.surrogate.getSolid_color() != null) {
            return new StyleDetailsDto.SolidColor(this.surrogate.getSolid_color());
        }
        if (this.surrogate.getGradient() != null) {
            return new StyleDetailsDto.Gradient(this.surrogate.getGradient());
        }
        if (this.surrogate.getGradient_animation() != null) {
            return new StyleDetailsDto.GradientAnimation(this.surrogate.getGradient_animation());
        }
        if (this.surrogate.getRounded_solid_color() != null) {
            return new StyleDetailsDto.RoundedSolidColor(this.surrogate.getRounded_solid_color());
        }
        if (this.surrogate.getDot() != null) {
            return new StyleDetailsDto.Dot(this.surrogate.getDot());
        }
        return null;
    }

    public final RoundedSolidChartFillStyleDto getRounded_solid_color() {
        return this.surrogate.getRounded_solid_color();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChartFillStyleDto(StyleDetailsDto styleDetailsDto) {
        StyleDetailsDto.Dotted dotted = styleDetailsDto instanceof StyleDetailsDto.Dotted ? (StyleDetailsDto.Dotted) styleDetailsDto : null;
        DottedChartFillStyleDto value = dotted != null ? dotted.getValue() : null;
        StyleDetailsDto.SolidColor solidColor = styleDetailsDto instanceof StyleDetailsDto.SolidColor ? (StyleDetailsDto.SolidColor) styleDetailsDto : null;
        SolidChartFillStyleDto value2 = solidColor != null ? solidColor.getValue() : null;
        StyleDetailsDto.Gradient gradient = styleDetailsDto instanceof StyleDetailsDto.Gradient ? (StyleDetailsDto.Gradient) styleDetailsDto : null;
        GradientChartFillStyleDto value3 = gradient != null ? gradient.getValue() : null;
        StyleDetailsDto.GradientAnimation gradientAnimation = styleDetailsDto instanceof StyleDetailsDto.GradientAnimation ? (StyleDetailsDto.GradientAnimation) styleDetailsDto : null;
        GradientAnimationChartFillStyleDto value4 = gradientAnimation != null ? gradientAnimation.getValue() : null;
        StyleDetailsDto.RoundedSolidColor roundedSolidColor = styleDetailsDto instanceof StyleDetailsDto.RoundedSolidColor ? (StyleDetailsDto.RoundedSolidColor) styleDetailsDto : null;
        RoundedSolidChartFillStyleDto value5 = roundedSolidColor != null ? roundedSolidColor.getValue() : null;
        StyleDetailsDto.Dot dot = styleDetailsDto instanceof StyleDetailsDto.Dot ? (StyleDetailsDto.Dot) styleDetailsDto : null;
        this(new Surrogate(value, value2, value3, value4, value5, dot != null ? dot.getValue() : null));
    }

    public /* synthetic */ ChartFillStyleDto(StyleDetailsDto styleDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : styleDetailsDto);
    }

    public final ChartFillStyleDto copy(StyleDetailsDto style_details) {
        StyleDetailsDto.Dotted dotted = style_details instanceof StyleDetailsDto.Dotted ? (StyleDetailsDto.Dotted) style_details : null;
        DottedChartFillStyleDto value = dotted != null ? dotted.getValue() : null;
        StyleDetailsDto.SolidColor solidColor = style_details instanceof StyleDetailsDto.SolidColor ? (StyleDetailsDto.SolidColor) style_details : null;
        SolidChartFillStyleDto value2 = solidColor != null ? solidColor.getValue() : null;
        StyleDetailsDto.Gradient gradient = style_details instanceof StyleDetailsDto.Gradient ? (StyleDetailsDto.Gradient) style_details : null;
        GradientChartFillStyleDto value3 = gradient != null ? gradient.getValue() : null;
        StyleDetailsDto.GradientAnimation gradientAnimation = style_details instanceof StyleDetailsDto.GradientAnimation ? (StyleDetailsDto.GradientAnimation) style_details : null;
        GradientAnimationChartFillStyleDto value4 = gradientAnimation != null ? gradientAnimation.getValue() : null;
        StyleDetailsDto.RoundedSolidColor roundedSolidColor = style_details instanceof StyleDetailsDto.RoundedSolidColor ? (StyleDetailsDto.RoundedSolidColor) style_details : null;
        RoundedSolidChartFillStyleDto value5 = roundedSolidColor != null ? roundedSolidColor.getValue() : null;
        StyleDetailsDto.Dot dot = style_details instanceof StyleDetailsDto.Dot ? (StyleDetailsDto.Dot) style_details : null;
        return new ChartFillStyleDto(new Surrogate(value, value2, value3, value4, value5, dot != null ? dot.getValue() : null));
    }

    @Override // com.robinhood.idl.Dto
    public ChartFillStyle toProto() {
        DottedChartFillStyleDto dotted = this.surrogate.getDotted();
        DottedChartFillStyle proto = dotted != null ? dotted.toProto() : null;
        SolidChartFillStyleDto solid_color = this.surrogate.getSolid_color();
        SolidChartFillStyle proto2 = solid_color != null ? solid_color.toProto() : null;
        GradientChartFillStyleDto gradient = this.surrogate.getGradient();
        GradientChartFillStyle proto3 = gradient != null ? gradient.toProto() : null;
        GradientAnimationChartFillStyleDto gradient_animation = this.surrogate.getGradient_animation();
        GradientAnimationChartFillStyle proto4 = gradient_animation != null ? gradient_animation.toProto() : null;
        RoundedSolidChartFillStyleDto rounded_solid_color = this.surrogate.getRounded_solid_color();
        RoundedSolidChartFillStyle proto5 = rounded_solid_color != null ? rounded_solid_color.toProto() : null;
        DotChartFillStyleDto dot = this.surrogate.getDot();
        return new ChartFillStyle(proto, proto2, proto3, proto4, proto5, dot != null ? dot.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[ChartFillStyleDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ChartFillStyleDto) && Intrinsics.areEqual(((ChartFillStyleDto) other).surrogate, this.surrogate);
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
    /* compiled from: ChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002A@BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b/\u0010+\u001a\u0004\b-\u0010.R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b3\u0010+\u001a\u0004\b1\u00102R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b7\u0010+\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b;\u0010+\u001a\u0004\b9\u0010:R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b?\u0010+\u001a\u0004\b=\u0010>¨\u0006B"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate;", "", "Lrh_server_driven_ui/v1/DottedChartFillStyleDto;", "dotted", "Lrh_server_driven_ui/v1/SolidChartFillStyleDto;", "solid_color", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "gradient", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "gradient_animation", "Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "rounded_solid_color", "Lrh_server_driven_ui/v1/DotChartFillStyleDto;", "dot", "<init>", "(Lrh_server_driven_ui/v1/DottedChartFillStyleDto;Lrh_server_driven_ui/v1/SolidChartFillStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;Lrh_server_driven_ui/v1/DotChartFillStyleDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/DottedChartFillStyleDto;Lrh_server_driven_ui/v1/SolidChartFillStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;Lrh_server_driven_ui/v1/DotChartFillStyleDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DottedChartFillStyleDto;", "getDotted", "()Lrh_server_driven_ui/v1/DottedChartFillStyleDto;", "getDotted$annotations", "()V", "Lrh_server_driven_ui/v1/SolidChartFillStyleDto;", "getSolid_color", "()Lrh_server_driven_ui/v1/SolidChartFillStyleDto;", "getSolid_color$annotations", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "getGradient", "()Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "getGradient$annotations", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "getGradient_animation", "()Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "getGradient_animation$annotations", "Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "getRounded_solid_color", "()Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "getRounded_solid_color$annotations", "Lrh_server_driven_ui/v1/DotChartFillStyleDto;", "getDot", "()Lrh_server_driven_ui/v1/DotChartFillStyleDto;", "getDot$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DotChartFillStyleDto dot;
        private final DottedChartFillStyleDto dotted;
        private final GradientChartFillStyleDto gradient;
        private final GradientAnimationChartFillStyleDto gradient_animation;
        private final RoundedSolidChartFillStyleDto rounded_solid_color;
        private final SolidChartFillStyleDto solid_color;

        public Surrogate() {
            this((DottedChartFillStyleDto) null, (SolidChartFillStyleDto) null, (GradientChartFillStyleDto) null, (GradientAnimationChartFillStyleDto) null, (RoundedSolidChartFillStyleDto) null, (DotChartFillStyleDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.dotted, surrogate.dotted) && Intrinsics.areEqual(this.solid_color, surrogate.solid_color) && Intrinsics.areEqual(this.gradient, surrogate.gradient) && Intrinsics.areEqual(this.gradient_animation, surrogate.gradient_animation) && Intrinsics.areEqual(this.rounded_solid_color, surrogate.rounded_solid_color) && Intrinsics.areEqual(this.dot, surrogate.dot);
        }

        public int hashCode() {
            DottedChartFillStyleDto dottedChartFillStyleDto = this.dotted;
            int iHashCode = (dottedChartFillStyleDto == null ? 0 : dottedChartFillStyleDto.hashCode()) * 31;
            SolidChartFillStyleDto solidChartFillStyleDto = this.solid_color;
            int iHashCode2 = (iHashCode + (solidChartFillStyleDto == null ? 0 : solidChartFillStyleDto.hashCode())) * 31;
            GradientChartFillStyleDto gradientChartFillStyleDto = this.gradient;
            int iHashCode3 = (iHashCode2 + (gradientChartFillStyleDto == null ? 0 : gradientChartFillStyleDto.hashCode())) * 31;
            GradientAnimationChartFillStyleDto gradientAnimationChartFillStyleDto = this.gradient_animation;
            int iHashCode4 = (iHashCode3 + (gradientAnimationChartFillStyleDto == null ? 0 : gradientAnimationChartFillStyleDto.hashCode())) * 31;
            RoundedSolidChartFillStyleDto roundedSolidChartFillStyleDto = this.rounded_solid_color;
            int iHashCode5 = (iHashCode4 + (roundedSolidChartFillStyleDto == null ? 0 : roundedSolidChartFillStyleDto.hashCode())) * 31;
            DotChartFillStyleDto dotChartFillStyleDto = this.dot;
            return iHashCode5 + (dotChartFillStyleDto != null ? dotChartFillStyleDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(dotted=" + this.dotted + ", solid_color=" + this.solid_color + ", gradient=" + this.gradient + ", gradient_animation=" + this.gradient_animation + ", rounded_solid_color=" + this.rounded_solid_color + ", dot=" + this.dot + ")";
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ChartFillStyleDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, DottedChartFillStyleDto dottedChartFillStyleDto, SolidChartFillStyleDto solidChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto, GradientAnimationChartFillStyleDto gradientAnimationChartFillStyleDto, RoundedSolidChartFillStyleDto roundedSolidChartFillStyleDto, DotChartFillStyleDto dotChartFillStyleDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.dotted = null;
            } else {
                this.dotted = dottedChartFillStyleDto;
            }
            if ((i & 2) == 0) {
                this.solid_color = null;
            } else {
                this.solid_color = solidChartFillStyleDto;
            }
            if ((i & 4) == 0) {
                this.gradient = null;
            } else {
                this.gradient = gradientChartFillStyleDto;
            }
            if ((i & 8) == 0) {
                this.gradient_animation = null;
            } else {
                this.gradient_animation = gradientAnimationChartFillStyleDto;
            }
            if ((i & 16) == 0) {
                this.rounded_solid_color = null;
            } else {
                this.rounded_solid_color = roundedSolidChartFillStyleDto;
            }
            if ((i & 32) == 0) {
                this.dot = null;
            } else {
                this.dot = dotChartFillStyleDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            DottedChartFillStyleDto dottedChartFillStyleDto = self.dotted;
            if (dottedChartFillStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, DottedChartFillStyleDto.Serializer.INSTANCE, dottedChartFillStyleDto);
            }
            SolidChartFillStyleDto solidChartFillStyleDto = self.solid_color;
            if (solidChartFillStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SolidChartFillStyleDto.Serializer.INSTANCE, solidChartFillStyleDto);
            }
            GradientChartFillStyleDto gradientChartFillStyleDto = self.gradient;
            if (gradientChartFillStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, GradientChartFillStyleDto.Serializer.INSTANCE, gradientChartFillStyleDto);
            }
            GradientAnimationChartFillStyleDto gradientAnimationChartFillStyleDto = self.gradient_animation;
            if (gradientAnimationChartFillStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, GradientAnimationChartFillStyleDto.Serializer.INSTANCE, gradientAnimationChartFillStyleDto);
            }
            RoundedSolidChartFillStyleDto roundedSolidChartFillStyleDto = self.rounded_solid_color;
            if (roundedSolidChartFillStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, RoundedSolidChartFillStyleDto.Serializer.INSTANCE, roundedSolidChartFillStyleDto);
            }
            DotChartFillStyleDto dotChartFillStyleDto = self.dot;
            if (dotChartFillStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, DotChartFillStyleDto.Serializer.INSTANCE, dotChartFillStyleDto);
            }
        }

        public Surrogate(DottedChartFillStyleDto dottedChartFillStyleDto, SolidChartFillStyleDto solidChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto, GradientAnimationChartFillStyleDto gradientAnimationChartFillStyleDto, RoundedSolidChartFillStyleDto roundedSolidChartFillStyleDto, DotChartFillStyleDto dotChartFillStyleDto) {
            this.dotted = dottedChartFillStyleDto;
            this.solid_color = solidChartFillStyleDto;
            this.gradient = gradientChartFillStyleDto;
            this.gradient_animation = gradientAnimationChartFillStyleDto;
            this.rounded_solid_color = roundedSolidChartFillStyleDto;
            this.dot = dotChartFillStyleDto;
        }

        public /* synthetic */ Surrogate(DottedChartFillStyleDto dottedChartFillStyleDto, SolidChartFillStyleDto solidChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto, GradientAnimationChartFillStyleDto gradientAnimationChartFillStyleDto, RoundedSolidChartFillStyleDto roundedSolidChartFillStyleDto, DotChartFillStyleDto dotChartFillStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : dottedChartFillStyleDto, (i & 2) != 0 ? null : solidChartFillStyleDto, (i & 4) != 0 ? null : gradientChartFillStyleDto, (i & 8) != 0 ? null : gradientAnimationChartFillStyleDto, (i & 16) != 0 ? null : roundedSolidChartFillStyleDto, (i & 32) != 0 ? null : dotChartFillStyleDto);
        }

        public final DottedChartFillStyleDto getDotted() {
            return this.dotted;
        }

        public final SolidChartFillStyleDto getSolid_color() {
            return this.solid_color;
        }

        public final GradientChartFillStyleDto getGradient() {
            return this.gradient;
        }

        public final GradientAnimationChartFillStyleDto getGradient_animation() {
            return this.gradient_animation;
        }

        public final RoundedSolidChartFillStyleDto getRounded_solid_color() {
            return this.rounded_solid_color;
        }

        public final DotChartFillStyleDto getDot() {
            return this.dot;
        }
    }

    /* compiled from: ChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ChartFillStyleDto;", "Lrh_server_driven_ui/v1/ChartFillStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ChartFillStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ChartFillStyleDto, ChartFillStyle> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ChartFillStyleDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartFillStyleDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ChartFillStyleDto> getBinaryBase64Serializer() {
            return (KSerializer) ChartFillStyleDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ChartFillStyle> getProtoAdapter() {
            return ChartFillStyle.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartFillStyleDto getZeroValue() {
            return ChartFillStyleDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ChartFillStyleDto fromProto(ChartFillStyle proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            DottedChartFillStyle dotted = proto.getDotted();
            DefaultConstructorMarker defaultConstructorMarker = null;
            DottedChartFillStyleDto dottedChartFillStyleDtoFromProto = dotted != null ? DottedChartFillStyleDto.INSTANCE.fromProto(dotted) : null;
            SolidChartFillStyle solid_color = proto.getSolid_color();
            SolidChartFillStyleDto solidChartFillStyleDtoFromProto = solid_color != null ? SolidChartFillStyleDto.INSTANCE.fromProto(solid_color) : null;
            GradientChartFillStyle gradient = proto.getGradient();
            GradientChartFillStyleDto gradientChartFillStyleDtoFromProto = gradient != null ? GradientChartFillStyleDto.INSTANCE.fromProto(gradient) : null;
            GradientAnimationChartFillStyle gradient_animation = proto.getGradient_animation();
            GradientAnimationChartFillStyleDto gradientAnimationChartFillStyleDtoFromProto = gradient_animation != null ? GradientAnimationChartFillStyleDto.INSTANCE.fromProto(gradient_animation) : null;
            RoundedSolidChartFillStyle rounded_solid_color = proto.getRounded_solid_color();
            RoundedSolidChartFillStyleDto roundedSolidChartFillStyleDtoFromProto = rounded_solid_color != null ? RoundedSolidChartFillStyleDto.INSTANCE.fromProto(rounded_solid_color) : null;
            DotChartFillStyle dot = proto.getDot();
            return new ChartFillStyleDto(new Surrogate(dottedChartFillStyleDtoFromProto, solidChartFillStyleDtoFromProto, gradientChartFillStyleDtoFromProto, gradientAnimationChartFillStyleDtoFromProto, roundedSolidChartFillStyleDtoFromProto, dot != null ? DotChartFillStyleDto.INSTANCE.fromProto(dot) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ChartFillStyleDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChartFillStyleDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ChartFillStyleDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Dotted", "SolidColor", "Gradient", "GradientAnimation", "RoundedSolidColor", "Dot", "Companion", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Dot;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Dotted;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Gradient;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$GradientAnimation;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$RoundedSolidColor;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$SolidColor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class StyleDetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ StyleDetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StyleDetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Dotted;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/DottedChartFillStyleDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/DottedChartFillStyleDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DottedChartFillStyleDto;", "getValue", "()Lrh_server_driven_ui/v1/DottedChartFillStyleDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Dotted extends StyleDetailsDto {
            private final DottedChartFillStyleDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Dotted) && Intrinsics.areEqual(this.value, ((Dotted) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Dotted(value=" + this.value + ")";
            }

            public final DottedChartFillStyleDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dotted(DottedChartFillStyleDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$SolidColor;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/SolidChartFillStyleDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/SolidChartFillStyleDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/SolidChartFillStyleDto;", "getValue", "()Lrh_server_driven_ui/v1/SolidChartFillStyleDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SolidColor extends StyleDetailsDto {
            private final SolidChartFillStyleDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SolidColor) && Intrinsics.areEqual(this.value, ((SolidColor) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SolidColor(value=" + this.value + ")";
            }

            public final SolidChartFillStyleDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SolidColor(SolidChartFillStyleDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Gradient;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/GradientChartFillStyleDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "getValue", "()Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Gradient extends StyleDetailsDto {
            private final GradientChartFillStyleDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Gradient) && Intrinsics.areEqual(this.value, ((Gradient) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Gradient(value=" + this.value + ")";
            }

            public final GradientChartFillStyleDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Gradient(GradientChartFillStyleDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$GradientAnimation;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "getValue", "()Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GradientAnimation extends StyleDetailsDto {
            private final GradientAnimationChartFillStyleDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GradientAnimation) && Intrinsics.areEqual(this.value, ((GradientAnimation) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GradientAnimation(value=" + this.value + ")";
            }

            public final GradientAnimationChartFillStyleDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GradientAnimation(GradientAnimationChartFillStyleDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$RoundedSolidColor;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "getValue", "()Lrh_server_driven_ui/v1/RoundedSolidChartFillStyleDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class RoundedSolidColor extends StyleDetailsDto {
            private final RoundedSolidChartFillStyleDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof RoundedSolidColor) && Intrinsics.areEqual(this.value, ((RoundedSolidColor) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "RoundedSolidColor(value=" + this.value + ")";
            }

            public final RoundedSolidChartFillStyleDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RoundedSolidColor(RoundedSolidChartFillStyleDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Dot;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/DotChartFillStyleDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/DotChartFillStyleDto;)V", "copy", "(Lrh_server_driven_ui/v1/DotChartFillStyleDto;)Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Dot;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/DotChartFillStyleDto;", "getValue", "()Lrh_server_driven_ui/v1/DotChartFillStyleDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Dot extends StyleDetailsDto {
            private final DotChartFillStyleDto value;

            public final Dot copy(DotChartFillStyleDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Dot(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Dot) && Intrinsics.areEqual(this.value, ((Dot) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Dot(value=" + this.value + ")";
            }

            public final DotChartFillStyleDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dot(DotChartFillStyleDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/ChartFillStyleDto$StyleDetailsDto;", "Lrh_server_driven_ui/v1/ChartFillStyle;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<StyleDetailsDto, ChartFillStyle> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ChartFillStyle> getProtoAdapter() {
                return ChartFillStyle.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StyleDetailsDto fromProto(ChartFillStyle proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getDotted() != null) {
                    return new Dotted(DottedChartFillStyleDto.INSTANCE.fromProto(proto.getDotted()));
                }
                if (proto.getSolid_color() != null) {
                    return new SolidColor(SolidChartFillStyleDto.INSTANCE.fromProto(proto.getSolid_color()));
                }
                if (proto.getGradient() != null) {
                    return new Gradient(GradientChartFillStyleDto.INSTANCE.fromProto(proto.getGradient()));
                }
                if (proto.getGradient_animation() != null) {
                    return new GradientAnimation(GradientAnimationChartFillStyleDto.INSTANCE.fromProto(proto.getGradient_animation()));
                }
                if (proto.getRounded_solid_color() != null) {
                    return new RoundedSolidColor(RoundedSolidChartFillStyleDto.INSTANCE.fromProto(proto.getRounded_solid_color()));
                }
                if (proto.getDot() != null) {
                    return new Dot(DotChartFillStyleDto.INSTANCE.fromProto(proto.getDot()));
                }
                return null;
            }
        }
    }

    /* compiled from: ChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ChartFillStyleDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ChartFillStyleDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ChartFillStyleDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ChartFillStyle", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ChartFillStyleDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ChartFillStyleDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ChartFillStyleDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ChartFillStyleDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ChartFillStyleDto";
        }
    }
}
