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
import com.robinhood.idl.serialization.FloatAsNumberSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rh_server_driven_ui.p531v1.ColorStopDto;
import rh_server_driven_ui.p531v1.GradientChartFillStyleDto;
import rh_server_driven_ui.p531v1.GradientStyleDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.ThemedColorStopsDto;

/* compiled from: GradientChartFillStyleDto.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00046578B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B[\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b-\u0010,R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00069"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/GradientChartFillStyle;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "start_color", "end_color", "", "start_color_opacity", "end_color_opacity", "Lrh_server_driven_ui/v1/GradientStyleDto;", "gradient_style", "", "Lrh_server_driven_ui/v1/ColorStopDto;", "color_stops", "Lrh_server_driven_ui/v1/ThemedColorStopsDto;", "themed_color_stops", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;FFLrh_server_driven_ui/v1/GradientStyleDto;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColorStopsDto;)V", "toProto", "()Lrh_server_driven_ui/v1/GradientChartFillStyle;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate;", "getStart_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getEnd_color", "getStart_color_opacity", "()F", "getEnd_color_opacity", "getGradient_style", "()Lrh_server_driven_ui/v1/GradientStyleDto;", "getThemed_color_stops", "()Lrh_server_driven_ui/v1/ThemedColorStopsDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class GradientChartFillStyleDto implements Dto3<GradientChartFillStyle>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GradientChartFillStyleDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GradientChartFillStyleDto, GradientChartFillStyle>> binaryBase64Serializer$delegate;
    private static final GradientChartFillStyleDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GradientChartFillStyleDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GradientChartFillStyleDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ThemedColorDto getStart_color() {
        return this.surrogate.getStart_color();
    }

    public final ThemedColorDto getEnd_color() {
        return this.surrogate.getEnd_color();
    }

    public final float getStart_color_opacity() {
        return this.surrogate.getStart_color_opacity();
    }

    public final float getEnd_color_opacity() {
        return this.surrogate.getEnd_color_opacity();
    }

    public final GradientStyleDto getGradient_style() {
        return this.surrogate.getGradient_style();
    }

    public final ThemedColorStopsDto getThemed_color_stops() {
        return this.surrogate.getThemed_color_stops();
    }

    public /* synthetic */ GradientChartFillStyleDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, float f, float f2, GradientStyleDto gradientStyleDto, List list, ThemedColorStopsDto themedColorStopsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) != 0 ? GradientStyleDto.INSTANCE.getZeroValue() : gradientStyleDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : themedColorStopsDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientChartFillStyleDto(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, float f, float f2, GradientStyleDto gradient_style, List<ColorStopDto> color_stops, ThemedColorStopsDto themedColorStopsDto) {
        this(new Surrogate(themedColorDto, themedColorDto2, f, f2, gradient_style, color_stops, themedColorStopsDto));
        Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
        Intrinsics.checkNotNullParameter(color_stops, "color_stops");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GradientChartFillStyle toProto() {
        ThemedColorDto start_color = this.surrogate.getStart_color();
        ThemedColor proto = start_color != null ? start_color.toProto() : null;
        ThemedColorDto end_color = this.surrogate.getEnd_color();
        ThemedColor proto2 = end_color != null ? end_color.toProto() : null;
        float start_color_opacity = this.surrogate.getStart_color_opacity();
        float end_color_opacity = this.surrogate.getEnd_color_opacity();
        GradientStyle gradientStyle = (GradientStyle) this.surrogate.getGradient_style().toProto();
        List<ColorStopDto> color_stops = this.surrogate.getColor_stops();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(color_stops, 10));
        Iterator<T> it = color_stops.iterator();
        while (it.hasNext()) {
            arrayList.add(((ColorStopDto) it.next()).toProto());
        }
        ThemedColorStopsDto themed_color_stops = this.surrogate.getThemed_color_stops();
        return new GradientChartFillStyle(proto, proto2, start_color_opacity, end_color_opacity, gradientStyle, arrayList, themed_color_stops != null ? themed_color_stops.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[GradientChartFillStyleDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GradientChartFillStyleDto) && Intrinsics.areEqual(((GradientChartFillStyleDto) other).surrogate, this.surrogate);
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
    /* compiled from: GradientChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0083\b\u0018\u0000 D2\u00020\u0001:\u0002EDBw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bc\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J'\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010-R/\u0010\t\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b5\u0010/\u001a\u0004\b3\u00104R/\u0010\n\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b7\u0010/\u001a\u0004\b6\u00104R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00108\u0012\u0004\b;\u0010/\u001a\u0004\b9\u0010:R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010<\u0012\u0004\b?\u0010/\u001a\u0004\b=\u0010>R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010@\u0012\u0004\bC\u0010/\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ThemedColorDto;", "start_color", "end_color", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/FloatSerializer;", "start_color_opacity", "end_color_opacity", "Lrh_server_driven_ui/v1/GradientStyleDto;", "gradient_style", "", "Lrh_server_driven_ui/v1/ColorStopDto;", "color_stops", "Lrh_server_driven_ui/v1/ThemedColorStopsDto;", "themed_color_stops", "<init>", "(Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;FFLrh_server_driven_ui/v1/GradientStyleDto;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColorStopsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;FFLrh_server_driven_ui/v1/GradientStyleDto;Ljava/util/List;Lrh_server_driven_ui/v1/ThemedColorStopsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getStart_color", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getStart_color$annotations", "()V", "getEnd_color", "getEnd_color$annotations", "F", "getStart_color_opacity", "()F", "getStart_color_opacity$annotations", "getEnd_color_opacity", "getEnd_color_opacity$annotations", "Lrh_server_driven_ui/v1/GradientStyleDto;", "getGradient_style", "()Lrh_server_driven_ui/v1/GradientStyleDto;", "getGradient_style$annotations", "Ljava/util/List;", "getColor_stops", "()Ljava/util/List;", "getColor_stops$annotations", "Lrh_server_driven_ui/v1/ThemedColorStopsDto;", "getThemed_color_stops", "()Lrh_server_driven_ui/v1/ThemedColorStopsDto;", "getThemed_color_stops$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<ColorStopDto> color_stops;
        private final ThemedColorDto end_color;
        private final float end_color_opacity;
        private final GradientStyleDto gradient_style;
        private final ThemedColorDto start_color;
        private final float start_color_opacity;
        private final ThemedColorStopsDto themed_color_stops;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: rh_server_driven_ui.v1.GradientChartFillStyleDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GradientChartFillStyleDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null};

        public Surrogate() {
            this((ThemedColorDto) null, (ThemedColorDto) null, 0.0f, 0.0f, (GradientStyleDto) null, (List) null, (ThemedColorStopsDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(ColorStopDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.start_color, surrogate.start_color) && Intrinsics.areEqual(this.end_color, surrogate.end_color) && Float.compare(this.start_color_opacity, surrogate.start_color_opacity) == 0 && Float.compare(this.end_color_opacity, surrogate.end_color_opacity) == 0 && this.gradient_style == surrogate.gradient_style && Intrinsics.areEqual(this.color_stops, surrogate.color_stops) && Intrinsics.areEqual(this.themed_color_stops, surrogate.themed_color_stops);
        }

        public int hashCode() {
            ThemedColorDto themedColorDto = this.start_color;
            int iHashCode = (themedColorDto == null ? 0 : themedColorDto.hashCode()) * 31;
            ThemedColorDto themedColorDto2 = this.end_color;
            int iHashCode2 = (((((((((iHashCode + (themedColorDto2 == null ? 0 : themedColorDto2.hashCode())) * 31) + Float.hashCode(this.start_color_opacity)) * 31) + Float.hashCode(this.end_color_opacity)) * 31) + this.gradient_style.hashCode()) * 31) + this.color_stops.hashCode()) * 31;
            ThemedColorStopsDto themedColorStopsDto = this.themed_color_stops;
            return iHashCode2 + (themedColorStopsDto != null ? themedColorStopsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(start_color=" + this.start_color + ", end_color=" + this.end_color + ", start_color_opacity=" + this.start_color_opacity + ", end_color_opacity=" + this.end_color_opacity + ", gradient_style=" + this.gradient_style + ", color_stops=" + this.color_stops + ", themed_color_stops=" + this.themed_color_stops + ")";
        }

        /* compiled from: GradientChartFillStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GradientChartFillStyleDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, float f, float f2, GradientStyleDto gradientStyleDto, List list, ThemedColorStopsDto themedColorStopsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.start_color = null;
            } else {
                this.start_color = themedColorDto;
            }
            if ((i & 2) == 0) {
                this.end_color = null;
            } else {
                this.end_color = themedColorDto2;
            }
            if ((i & 4) == 0) {
                this.start_color_opacity = 0.0f;
            } else {
                this.start_color_opacity = f;
            }
            if ((i & 8) == 0) {
                this.end_color_opacity = 0.0f;
            } else {
                this.end_color_opacity = f2;
            }
            if ((i & 16) == 0) {
                this.gradient_style = GradientStyleDto.INSTANCE.getZeroValue();
            } else {
                this.gradient_style = gradientStyleDto;
            }
            if ((i & 32) == 0) {
                this.color_stops = CollectionsKt.emptyList();
            } else {
                this.color_stops = list;
            }
            if ((i & 64) == 0) {
                this.themed_color_stops = null;
            } else {
                this.themed_color_stops = themedColorStopsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            ThemedColorDto themedColorDto = self.start_color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.end_color;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            if (Float.compare(self.start_color_opacity, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 2, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.start_color_opacity));
            }
            if (Float.compare(self.end_color_opacity, 0.0f) != 0) {
                output.encodeSerializableElement(serialDesc, 3, FloatAsNumberSerializer.INSTANCE, Float.valueOf(self.end_color_opacity));
            }
            if (self.gradient_style != GradientStyleDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, GradientStyleDto.Serializer.INSTANCE, self.gradient_style);
            }
            if (!Intrinsics.areEqual(self.color_stops, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 5, lazyArr[5].getValue(), self.color_stops);
            }
            ThemedColorStopsDto themedColorStopsDto = self.themed_color_stops;
            if (themedColorStopsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ThemedColorStopsDto.Serializer.INSTANCE, themedColorStopsDto);
            }
        }

        public Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, float f, float f2, GradientStyleDto gradient_style, List<ColorStopDto> color_stops, ThemedColorStopsDto themedColorStopsDto) {
            Intrinsics.checkNotNullParameter(gradient_style, "gradient_style");
            Intrinsics.checkNotNullParameter(color_stops, "color_stops");
            this.start_color = themedColorDto;
            this.end_color = themedColorDto2;
            this.start_color_opacity = f;
            this.end_color_opacity = f2;
            this.gradient_style = gradient_style;
            this.color_stops = color_stops;
            this.themed_color_stops = themedColorStopsDto;
        }

        public final ThemedColorDto getStart_color() {
            return this.start_color;
        }

        public final ThemedColorDto getEnd_color() {
            return this.end_color;
        }

        public final float getStart_color_opacity() {
            return this.start_color_opacity;
        }

        public final float getEnd_color_opacity() {
            return this.end_color_opacity;
        }

        public final GradientStyleDto getGradient_style() {
            return this.gradient_style;
        }

        public /* synthetic */ Surrogate(ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, float f, float f2, GradientStyleDto gradientStyleDto, List list, ThemedColorStopsDto themedColorStopsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : themedColorDto, (i & 2) != 0 ? null : themedColorDto2, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) != 0 ? GradientStyleDto.INSTANCE.getZeroValue() : gradientStyleDto, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : themedColorStopsDto);
        }

        public final List<ColorStopDto> getColor_stops() {
            return this.color_stops;
        }

        public final ThemedColorStopsDto getThemed_color_stops() {
            return this.themed_color_stops;
        }
    }

    /* compiled from: GradientChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "Lrh_server_driven_ui/v1/GradientChartFillStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GradientChartFillStyleDto, GradientChartFillStyle> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GradientChartFillStyleDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GradientChartFillStyleDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GradientChartFillStyleDto> getBinaryBase64Serializer() {
            return (KSerializer) GradientChartFillStyleDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GradientChartFillStyle> getProtoAdapter() {
            return GradientChartFillStyle.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GradientChartFillStyleDto getZeroValue() {
            return GradientChartFillStyleDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GradientChartFillStyleDto fromProto(GradientChartFillStyle proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ThemedColor start_color = proto.getStart_color();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = start_color != null ? ThemedColorDto.INSTANCE.fromProto(start_color) : null;
            ThemedColor end_color = proto.getEnd_color();
            ThemedColorDto themedColorDtoFromProto2 = end_color != null ? ThemedColorDto.INSTANCE.fromProto(end_color) : null;
            float start_color_opacity = proto.getStart_color_opacity();
            float end_color_opacity = proto.getEnd_color_opacity();
            GradientStyleDto gradientStyleDtoFromProto = GradientStyleDto.INSTANCE.fromProto(proto.getGradient_style());
            List<ColorStop> color_stops = proto.getColor_stops();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(color_stops, 10));
            Iterator<T> it = color_stops.iterator();
            while (it.hasNext()) {
                arrayList.add(ColorStopDto.INSTANCE.fromProto((ColorStop) it.next()));
            }
            ThemedColorStops themed_color_stops = proto.getThemed_color_stops();
            return new GradientChartFillStyleDto(new Surrogate(themedColorDtoFromProto, themedColorDtoFromProto2, start_color_opacity, end_color_opacity, gradientStyleDtoFromProto, arrayList, themed_color_stops != null ? ThemedColorStopsDto.INSTANCE.fromProto(themed_color_stops) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.GradientChartFillStyleDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GradientChartFillStyleDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GradientChartFillStyleDto(null, null, 0.0f, 0.0f, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GradientChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/GradientChartFillStyleDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GradientChartFillStyleDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.GradientChartFillStyle", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GradientChartFillStyleDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GradientChartFillStyleDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GradientChartFillStyleDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GradientChartFillStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/GradientChartFillStyleDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.GradientChartFillStyleDto";
        }
    }
}
