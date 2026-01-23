package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
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
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.CornerRadiusInfoDto;
import rh_server_driven_ui.p531v1.GradientChartFillStyleDto;
import rh_server_driven_ui.p531v1.GradientStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: GradientAnimationChartFillStyleDto.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u000498:;B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\r\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b4\u00103R\u0011\u0010\u0013\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006<"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyle;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate;)V", "", "id", "Lrh_server_driven_ui/v1/ThemedColorDto;", "base_color", "", "base_color_opacity", "Lrh_server_driven_ui/v1/GradientStyleDto;", "gradient_style", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "before_pivot_gradient", "after_pivot_gradient", "speed", "Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "corner_radius_info", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;FLrh_server_driven_ui/v1/GradientStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;FLrh_server_driven_ui/v1/CornerRadiusInfoDto;)V", "toProto", "()Lrh_server_driven_ui/v1/GradientAnimationChartFillStyle;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate;", "getId", "getBase_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBase_color_opacity", "()F", "getGradient_style", "()Lrh_server_driven_ui/v1/GradientStyleDto;", "getBefore_pivot_gradient", "()Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "getAfter_pivot_gradient", "getSpeed", "getCorner_radius_info", "()Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class GradientAnimationChartFillStyleDto implements Dto3<GradientAnimationChartFillStyle>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GradientAnimationChartFillStyleDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GradientAnimationChartFillStyleDto, GradientAnimationChartFillStyle>> binaryBase64Serializer$delegate;
    private static final GradientAnimationChartFillStyleDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GradientAnimationChartFillStyleDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GradientAnimationChartFillStyleDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final ThemedColorDto getBase_color() {
        return this.surrogate.getBase_color();
    }

    public final float getBase_color_opacity() {
        return this.surrogate.getBase_color_opacity();
    }

    public final GradientStyleDto getGradient_style() {
        return this.surrogate.getGradient_style();
    }

    public final GradientChartFillStyleDto getBefore_pivot_gradient() {
        return this.surrogate.getBefore_pivot_gradient();
    }

    public final GradientChartFillStyleDto getAfter_pivot_gradient() {
        return this.surrogate.getAfter_pivot_gradient();
    }

    public final float getSpeed() {
        return this.surrogate.getSpeed();
    }

    public final CornerRadiusInfoDto getCorner_radius_info() {
        return this.surrogate.getCorner_radius_info();
    }

    public /* synthetic */ GradientAnimationChartFillStyleDto(String str, ThemedColorDto themedColorDto, float f, GradientStyleDto gradientStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto2, float f2, CornerRadiusInfoDto cornerRadiusInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? GradientStyleDto.INSTANCE.getZeroValue() : gradientStyleDto, (i & 16) != 0 ? null : gradientChartFillStyleDto, (i & 32) != 0 ? null : gradientChartFillStyleDto2, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? null : cornerRadiusInfoDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientAnimationChartFillStyleDto(String str, ThemedColorDto themedColorDto, float f, GradientStyleDto gradient_style, GradientChartFillStyleDto gradientChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto2, float f2, CornerRadiusInfoDto cornerRadiusInfoDto) {
        this(new Surrogate(str, themedColorDto, f, gradient_style, gradientChartFillStyleDto, gradientChartFillStyleDto2, f2, cornerRadiusInfoDto));
        Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GradientAnimationChartFillStyle toProto() {
        String id = this.surrogate.getId();
        ThemedColorDto base_color = this.surrogate.getBase_color();
        ThemedColor proto = base_color != null ? base_color.toProto() : null;
        float base_color_opacity = this.surrogate.getBase_color_opacity();
        GradientStyle gradientStyle = (GradientStyle) this.surrogate.getGradient_style().toProto();
        GradientChartFillStyleDto before_pivot_gradient = this.surrogate.getBefore_pivot_gradient();
        GradientChartFillStyle proto2 = before_pivot_gradient != null ? before_pivot_gradient.toProto() : null;
        GradientChartFillStyleDto after_pivot_gradient = this.surrogate.getAfter_pivot_gradient();
        GradientChartFillStyle proto3 = after_pivot_gradient != null ? after_pivot_gradient.toProto() : null;
        float speed = this.surrogate.getSpeed();
        CornerRadiusInfoDto corner_radius_info = this.surrogate.getCorner_radius_info();
        return new GradientAnimationChartFillStyle(id, proto, base_color_opacity, gradientStyle, proto2, proto3, speed, corner_radius_info != null ? corner_radius_info.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[GradientAnimationChartFillStyleDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GradientAnimationChartFillStyleDto) && Intrinsics.areEqual(((GradientAnimationChartFillStyleDto) other).surrogate, this.surrogate);
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
    /* compiled from: GradientAnimationChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b!\b\u0083\b\u0018\u0000 G2\u00020\u0001:\u0002HGB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0017\b\u0002\u0010\u0010\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bg\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010;\u0012\u0004\b>\u0010.\u001a\u0004\b<\u0010=R\"\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010;\u0012\u0004\b@\u0010.\u001a\u0004\b?\u0010=R/\u0010\u0010\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u00103\u0012\u0004\bB\u0010.\u001a\u0004\bA\u00105R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010C\u0012\u0004\bF\u0010.\u001a\u0004\bD\u0010E¨\u0006I"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate;", "", "", "id", "Lrh_server_driven_ui/v1/ThemedColorDto;", "base_color", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "base_color_opacity", "Lrh_server_driven_ui/v1/GradientStyleDto;", "gradient_style", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "before_pivot_gradient", "after_pivot_gradient", "speed", "Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "corner_radius_info", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;FLrh_server_driven_ui/v1/GradientStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;FLrh_server_driven_ui/v1/CornerRadiusInfoDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;FLrh_server_driven_ui/v1/GradientStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;Lrh_server_driven_ui/v1/GradientChartFillStyleDto;FLrh_server_driven_ui/v1/CornerRadiusInfoDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getBase_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBase_color$annotations", "F", "getBase_color_opacity", "()F", "getBase_color_opacity$annotations", "Lrh_server_driven_ui/v1/GradientStyleDto;", "getGradient_style", "()Lrh_server_driven_ui/v1/GradientStyleDto;", "getGradient_style$annotations", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "getBefore_pivot_gradient", "()Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "getBefore_pivot_gradient$annotations", "getAfter_pivot_gradient", "getAfter_pivot_gradient$annotations", "getSpeed", "getSpeed$annotations", "Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "getCorner_radius_info", "()Lrh_server_driven_ui/v1/CornerRadiusInfoDto;", "getCorner_radius_info$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GradientChartFillStyleDto after_pivot_gradient;
        private final ThemedColorDto base_color;
        private final float base_color_opacity;
        private final GradientChartFillStyleDto before_pivot_gradient;
        private final CornerRadiusInfoDto corner_radius_info;
        private final GradientStyleDto gradient_style;
        private final String id;
        private final float speed;

        public Surrogate() {
            this((String) null, (ThemedColorDto) null, 0.0f, (GradientStyleDto) null, (GradientChartFillStyleDto) null, (GradientChartFillStyleDto) null, 0.0f, (CornerRadiusInfoDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.base_color, surrogate.base_color) && Float.compare(this.base_color_opacity, surrogate.base_color_opacity) == 0 && this.gradient_style == surrogate.gradient_style && Intrinsics.areEqual(this.before_pivot_gradient, surrogate.before_pivot_gradient) && Intrinsics.areEqual(this.after_pivot_gradient, surrogate.after_pivot_gradient) && Float.compare(this.speed, surrogate.speed) == 0 && Intrinsics.areEqual(this.corner_radius_info, surrogate.corner_radius_info);
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.base_color;
            int iHashCode2 = (((((iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31) + Float.hashCode(this.base_color_opacity)) * 31) + this.gradient_style.hashCode()) * 31;
            GradientChartFillStyleDto gradientChartFillStyleDto = this.before_pivot_gradient;
            int iHashCode3 = (iHashCode2 + (gradientChartFillStyleDto == null ? 0 : gradientChartFillStyleDto.hashCode())) * 31;
            GradientChartFillStyleDto gradientChartFillStyleDto2 = this.after_pivot_gradient;
            int iHashCode4 = (((iHashCode3 + (gradientChartFillStyleDto2 == null ? 0 : gradientChartFillStyleDto2.hashCode())) * 31) + Float.hashCode(this.speed)) * 31;
            CornerRadiusInfoDto cornerRadiusInfoDto = this.corner_radius_info;
            return iHashCode4 + (cornerRadiusInfoDto != null ? cornerRadiusInfoDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", base_color=" + this.base_color + ", base_color_opacity=" + this.base_color_opacity + ", gradient_style=" + this.gradient_style + ", before_pivot_gradient=" + this.before_pivot_gradient + ", after_pivot_gradient=" + this.after_pivot_gradient + ", speed=" + this.speed + ", corner_radius_info=" + this.corner_radius_info + ")";
        }

        /* compiled from: GradientAnimationChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GradientAnimationChartFillStyleDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ThemedColorDto themedColorDto, float f, GradientStyleDto gradientStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto2, float f2, CornerRadiusInfoDto cornerRadiusInfoDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.base_color = null;
            } else {
                this.base_color = themedColorDto;
            }
            if ((i & 4) == 0) {
                this.base_color_opacity = 0.0f;
            } else {
                this.base_color_opacity = f;
            }
            if ((i & 8) == 0) {
                this.gradient_style = GradientStyleDto.INSTANCE.getZeroValue();
            } else {
                this.gradient_style = gradientStyleDto;
            }
            if ((i & 16) == 0) {
                this.before_pivot_gradient = null;
            } else {
                this.before_pivot_gradient = gradientChartFillStyleDto;
            }
            if ((i & 32) == 0) {
                this.after_pivot_gradient = null;
            } else {
                this.after_pivot_gradient = gradientChartFillStyleDto2;
            }
            if ((i & 64) == 0) {
                this.speed = 0.0f;
            } else {
                this.speed = f2;
            }
            if ((i & 128) == 0) {
                this.corner_radius_info = null;
            } else {
                this.corner_radius_info = cornerRadiusInfoDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            ThemedColorDto themedColorDto = self.base_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            if (Float.compare(self.base_color_opacity, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.base_color_opacity));
            }
            if (self.gradient_style != GradientStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, GradientStyleDto.Serializer.INSTANCE, self.gradient_style);
            }
            GradientChartFillStyleDto gradientChartFillStyleDto = self.before_pivot_gradient;
            if (gradientChartFillStyleDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, GradientChartFillStyleDto.Serializer.INSTANCE, gradientChartFillStyleDto);
            }
            GradientChartFillStyleDto gradientChartFillStyleDto2 = self.after_pivot_gradient;
            if (gradientChartFillStyleDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, GradientChartFillStyleDto.Serializer.INSTANCE, gradientChartFillStyleDto2);
            }
            if (Float.compare(self.speed, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 6, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.speed));
            }
            CornerRadiusInfoDto cornerRadiusInfoDto = self.corner_radius_info;
            if (cornerRadiusInfoDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, CornerRadiusInfoDto.Serializer.INSTANCE, cornerRadiusInfoDto);
            }
        }

        public Surrogate(String str, ThemedColorDto themedColorDto, float f, GradientStyleDto gradient_style, GradientChartFillStyleDto gradientChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto2, float f2, CornerRadiusInfoDto cornerRadiusInfoDto) {
            Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
            this.id = str;
            this.base_color = themedColorDto;
            this.base_color_opacity = f;
            this.gradient_style = gradient_style;
            this.before_pivot_gradient = gradientChartFillStyleDto;
            this.after_pivot_gradient = gradientChartFillStyleDto2;
            this.speed = f2;
            this.corner_radius_info = cornerRadiusInfoDto;
        }

        public final String getId() {
            return this.id;
        }

        public final ThemedColorDto getBase_color() {
            return this.base_color;
        }

        public final float getBase_color_opacity() {
            return this.base_color_opacity;
        }

        public final GradientStyleDto getGradient_style() {
            return this.gradient_style;
        }

        public /* synthetic */ Surrogate(String str, ThemedColorDto themedColorDto, float f, GradientStyleDto gradientStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto, GradientChartFillStyleDto gradientChartFillStyleDto2, float f2, CornerRadiusInfoDto cornerRadiusInfoDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? GradientStyleDto.INSTANCE.getZeroValue() : gradientStyleDto, (i & 16) != 0 ? null : gradientChartFillStyleDto, (i & 32) != 0 ? null : gradientChartFillStyleDto2, (i & 64) != 0 ? 0.0f : f2, (i & 128) != 0 ? null : cornerRadiusInfoDto);
        }

        public final GradientChartFillStyleDto getBefore_pivot_gradient() {
            return this.before_pivot_gradient;
        }

        public final GradientChartFillStyleDto getAfter_pivot_gradient() {
            return this.after_pivot_gradient;
        }

        public final float getSpeed() {
            return this.speed;
        }

        public final CornerRadiusInfoDto getCorner_radius_info() {
            return this.corner_radius_info;
        }
    }

    /* compiled from: GradientAnimationChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GradientAnimationChartFillStyleDto, GradientAnimationChartFillStyle> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GradientAnimationChartFillStyleDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GradientAnimationChartFillStyleDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GradientAnimationChartFillStyleDto> getBinaryBase64Serializer() {
            return (KSerializer) GradientAnimationChartFillStyleDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GradientAnimationChartFillStyle> getProtoAdapter() {
            return GradientAnimationChartFillStyle.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GradientAnimationChartFillStyleDto getZeroValue() {
            return GradientAnimationChartFillStyleDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GradientAnimationChartFillStyleDto fromProto(GradientAnimationChartFillStyle proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String id = proto.getId();
            ThemedColor base_color = proto.getBase_color();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = base_color != null ? ThemedColorDto.INSTANCE.fromProto(base_color) : null;
            float base_color_opacity = proto.getBase_color_opacity();
            GradientStyleDto gradientStyleDtoFromProto = GradientStyleDto.INSTANCE.fromProto(proto.getGradient_style());
            GradientChartFillStyle before_pivot_gradient = proto.getBefore_pivot_gradient();
            GradientChartFillStyleDto gradientChartFillStyleDtoFromProto = before_pivot_gradient != null ? GradientChartFillStyleDto.INSTANCE.fromProto(before_pivot_gradient) : null;
            GradientChartFillStyle after_pivot_gradient = proto.getAfter_pivot_gradient();
            GradientChartFillStyleDto gradientChartFillStyleDtoFromProto2 = after_pivot_gradient != null ? GradientChartFillStyleDto.INSTANCE.fromProto(after_pivot_gradient) : null;
            float speed = proto.getSpeed();
            CornerRadiusInfo corner_radius_info = proto.getCorner_radius_info();
            return new GradientAnimationChartFillStyleDto(new Surrogate(id, themedColorDtoFromProto, base_color_opacity, gradientStyleDtoFromProto, gradientChartFillStyleDtoFromProto, gradientChartFillStyleDtoFromProto2, speed, corner_radius_info != null ? CornerRadiusInfoDto.INSTANCE.fromProto(corner_radius_info) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.GradientAnimationChartFillStyleDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GradientAnimationChartFillStyleDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GradientAnimationChartFillStyleDto(null, null, 0.0f, null, null, null, 0.0f, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GradientAnimationChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GradientAnimationChartFillStyleDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.GradientAnimationChartFillStyle", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GradientAnimationChartFillStyleDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GradientAnimationChartFillStyleDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GradientAnimationChartFillStyleDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GradientAnimationChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientAnimationChartFillStyleDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.GradientAnimationChartFillStyleDto";
        }
    }
}
