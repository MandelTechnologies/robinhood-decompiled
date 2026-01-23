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
import rh_server_driven_ui.p531v1.OpacityReduceBackgroundWithBorderDto;
import rh_server_driven_ui.p531v1.SolidColorBackgroundDto;
import rh_server_driven_ui.p531v1.UnspecifiedDto;

/* compiled from: MarginTieredHighlightRowStyleDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate;)V", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "highlight_row_style", "(Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;)V", "toProto", "()Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate;", "getHighlight_row_style", "()Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "Companion", "Surrogate", "HighlightRowStyleDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class MarginTieredHighlightRowStyleDto implements Dto3<MarginTieredHighlightRowStyle>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MarginTieredHighlightRowStyleDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MarginTieredHighlightRowStyleDto, MarginTieredHighlightRowStyle>> binaryBase64Serializer$delegate;
    private static final MarginTieredHighlightRowStyleDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MarginTieredHighlightRowStyleDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MarginTieredHighlightRowStyleDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final HighlightRowStyleDto getHighlight_row_style() {
        if (this.surrogate.getUnspecified() != null) {
            return new HighlightRowStyleDto.Unspecified(this.surrogate.getUnspecified());
        }
        if (this.surrogate.getSolid_color_background() != null) {
            return new HighlightRowStyleDto.SolidColorBackground(this.surrogate.getSolid_color_background());
        }
        if (this.surrogate.getOpacity_reduced_background_with_border() != null) {
            return new HighlightRowStyleDto.OpacityReducedBackgroundWithBorder(this.surrogate.getOpacity_reduced_background_with_border());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MarginTieredHighlightRowStyleDto(HighlightRowStyleDto highlightRowStyleDto) {
        HighlightRowStyleDto.Unspecified unspecified = highlightRowStyleDto instanceof HighlightRowStyleDto.Unspecified ? (HighlightRowStyleDto.Unspecified) highlightRowStyleDto : null;
        UnspecifiedDto value = unspecified != null ? unspecified.getValue() : null;
        HighlightRowStyleDto.SolidColorBackground solidColorBackground = highlightRowStyleDto instanceof HighlightRowStyleDto.SolidColorBackground ? (HighlightRowStyleDto.SolidColorBackground) highlightRowStyleDto : null;
        SolidColorBackgroundDto value2 = solidColorBackground != null ? solidColorBackground.getValue() : null;
        HighlightRowStyleDto.OpacityReducedBackgroundWithBorder opacityReducedBackgroundWithBorder = highlightRowStyleDto instanceof HighlightRowStyleDto.OpacityReducedBackgroundWithBorder ? (HighlightRowStyleDto.OpacityReducedBackgroundWithBorder) highlightRowStyleDto : null;
        this(new Surrogate(value, value2, opacityReducedBackgroundWithBorder != null ? opacityReducedBackgroundWithBorder.getValue() : null));
    }

    public /* synthetic */ MarginTieredHighlightRowStyleDto(HighlightRowStyleDto highlightRowStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : highlightRowStyleDto);
    }

    @Override // com.robinhood.idl.Dto
    public MarginTieredHighlightRowStyle toProto() {
        UnspecifiedDto unspecified = this.surrogate.getUnspecified();
        Unspecified proto = unspecified != null ? unspecified.toProto() : null;
        SolidColorBackgroundDto solid_color_background = this.surrogate.getSolid_color_background();
        SolidColorBackground proto2 = solid_color_background != null ? solid_color_background.toProto() : null;
        OpacityReduceBackgroundWithBorderDto opacity_reduced_background_with_border = this.surrogate.getOpacity_reduced_background_with_border();
        return new MarginTieredHighlightRowStyle(proto, proto2, opacity_reduced_background_with_border != null ? opacity_reduced_background_with_border.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[MarginTieredHighlightRowStyleDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MarginTieredHighlightRowStyleDto) && Intrinsics.areEqual(((MarginTieredHighlightRowStyleDto) other).surrogate, this.surrogate);
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
    /* compiled from: MarginTieredHighlightRowStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate;", "", "Lrh_server_driven_ui/v1/UnspecifiedDto;", "unspecified", "Lrh_server_driven_ui/v1/SolidColorBackgroundDto;", "solid_color_background", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "opacity_reduced_background_with_border", "<init>", "(Lrh_server_driven_ui/v1/UnspecifiedDto;Lrh_server_driven_ui/v1/SolidColorBackgroundDto;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/UnspecifiedDto;Lrh_server_driven_ui/v1/SolidColorBackgroundDto;Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UnspecifiedDto;", "getUnspecified", "()Lrh_server_driven_ui/v1/UnspecifiedDto;", "getUnspecified$annotations", "()V", "Lrh_server_driven_ui/v1/SolidColorBackgroundDto;", "getSolid_color_background", "()Lrh_server_driven_ui/v1/SolidColorBackgroundDto;", "getSolid_color_background$annotations", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "getOpacity_reduced_background_with_border", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "getOpacity_reduced_background_with_border$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OpacityReduceBackgroundWithBorderDto opacity_reduced_background_with_border;
        private final SolidColorBackgroundDto solid_color_background;
        private final UnspecifiedDto unspecified;

        public Surrogate() {
            this((UnspecifiedDto) null, (SolidColorBackgroundDto) null, (OpacityReduceBackgroundWithBorderDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.unspecified, surrogate.unspecified) && Intrinsics.areEqual(this.solid_color_background, surrogate.solid_color_background) && Intrinsics.areEqual(this.opacity_reduced_background_with_border, surrogate.opacity_reduced_background_with_border);
        }

        public int hashCode() {
            UnspecifiedDto unspecifiedDto = this.unspecified;
            int iHashCode = (unspecifiedDto == null ? 0 : unspecifiedDto.hashCode()) * 31;
            SolidColorBackgroundDto solidColorBackgroundDto = this.solid_color_background;
            int iHashCode2 = (iHashCode + (solidColorBackgroundDto == null ? 0 : solidColorBackgroundDto.hashCode())) * 31;
            OpacityReduceBackgroundWithBorderDto opacityReduceBackgroundWithBorderDto = this.opacity_reduced_background_with_border;
            return iHashCode2 + (opacityReduceBackgroundWithBorderDto != null ? opacityReduceBackgroundWithBorderDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(unspecified=" + this.unspecified + ", solid_color_background=" + this.solid_color_background + ", opacity_reduced_background_with_border=" + this.opacity_reduced_background_with_border + ")";
        }

        /* compiled from: MarginTieredHighlightRowStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MarginTieredHighlightRowStyleDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UnspecifiedDto unspecifiedDto, SolidColorBackgroundDto solidColorBackgroundDto, OpacityReduceBackgroundWithBorderDto opacityReduceBackgroundWithBorderDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.unspecified = null;
            } else {
                this.unspecified = unspecifiedDto;
            }
            if ((i & 2) == 0) {
                this.solid_color_background = null;
            } else {
                this.solid_color_background = solidColorBackgroundDto;
            }
            if ((i & 4) == 0) {
                this.opacity_reduced_background_with_border = null;
            } else {
                this.opacity_reduced_background_with_border = opacityReduceBackgroundWithBorderDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UnspecifiedDto unspecifiedDto = self.unspecified;
            if (unspecifiedDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UnspecifiedDto.Serializer.INSTANCE, unspecifiedDto);
            }
            SolidColorBackgroundDto solidColorBackgroundDto = self.solid_color_background;
            if (solidColorBackgroundDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, SolidColorBackgroundDto.Serializer.INSTANCE, solidColorBackgroundDto);
            }
            OpacityReduceBackgroundWithBorderDto opacityReduceBackgroundWithBorderDto = self.opacity_reduced_background_with_border;
            if (opacityReduceBackgroundWithBorderDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, OpacityReduceBackgroundWithBorderDto.Serializer.INSTANCE, opacityReduceBackgroundWithBorderDto);
            }
        }

        public Surrogate(UnspecifiedDto unspecifiedDto, SolidColorBackgroundDto solidColorBackgroundDto, OpacityReduceBackgroundWithBorderDto opacityReduceBackgroundWithBorderDto) {
            this.unspecified = unspecifiedDto;
            this.solid_color_background = solidColorBackgroundDto;
            this.opacity_reduced_background_with_border = opacityReduceBackgroundWithBorderDto;
        }

        public /* synthetic */ Surrogate(UnspecifiedDto unspecifiedDto, SolidColorBackgroundDto solidColorBackgroundDto, OpacityReduceBackgroundWithBorderDto opacityReduceBackgroundWithBorderDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : unspecifiedDto, (i & 2) != 0 ? null : solidColorBackgroundDto, (i & 4) != 0 ? null : opacityReduceBackgroundWithBorderDto);
        }

        public final UnspecifiedDto getUnspecified() {
            return this.unspecified;
        }

        public final SolidColorBackgroundDto getSolid_color_background() {
            return this.solid_color_background;
        }

        public final OpacityReduceBackgroundWithBorderDto getOpacity_reduced_background_with_border() {
            return this.opacity_reduced_background_with_border;
        }
    }

    /* compiled from: MarginTieredHighlightRowStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MarginTieredHighlightRowStyleDto, MarginTieredHighlightRowStyle> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MarginTieredHighlightRowStyleDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTieredHighlightRowStyleDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MarginTieredHighlightRowStyleDto> getBinaryBase64Serializer() {
            return (KSerializer) MarginTieredHighlightRowStyleDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MarginTieredHighlightRowStyle> getProtoAdapter() {
            return MarginTieredHighlightRowStyle.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTieredHighlightRowStyleDto getZeroValue() {
            return MarginTieredHighlightRowStyleDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MarginTieredHighlightRowStyleDto fromProto(MarginTieredHighlightRowStyle proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Unspecified unspecified = proto.getUnspecified();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UnspecifiedDto unspecifiedDtoFromProto = unspecified != null ? UnspecifiedDto.INSTANCE.fromProto(unspecified) : null;
            SolidColorBackground solid_color_background = proto.getSolid_color_background();
            SolidColorBackgroundDto solidColorBackgroundDtoFromProto = solid_color_background != null ? SolidColorBackgroundDto.INSTANCE.fromProto(solid_color_background) : null;
            OpacityReduceBackgroundWithBorder opacity_reduced_background_with_border = proto.getOpacity_reduced_background_with_border();
            return new MarginTieredHighlightRowStyleDto(new Surrogate(unspecifiedDtoFromProto, solidColorBackgroundDtoFromProto, opacity_reduced_background_with_border != null ? OpacityReduceBackgroundWithBorderDto.INSTANCE.fromProto(opacity_reduced_background_with_border) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.MarginTieredHighlightRowStyleDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginTieredHighlightRowStyleDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MarginTieredHighlightRowStyleDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MarginTieredHighlightRowStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Unspecified", "SolidColorBackground", "OpacityReducedBackgroundWithBorder", "Companion", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto$OpacityReducedBackgroundWithBorder;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto$SolidColorBackground;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto$Unspecified;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class HighlightRowStyleDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ HighlightRowStyleDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private HighlightRowStyleDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: MarginTieredHighlightRowStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto$Unspecified;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "Lrh_server_driven_ui/v1/UnspecifiedDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/UnspecifiedDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UnspecifiedDto;", "getValue", "()Lrh_server_driven_ui/v1/UnspecifiedDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Unspecified extends HighlightRowStyleDto {
            private final UnspecifiedDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unspecified) && Intrinsics.areEqual(this.value, ((Unspecified) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Unspecified(value=" + this.value + ")";
            }

            public final UnspecifiedDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unspecified(UnspecifiedDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MarginTieredHighlightRowStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto$SolidColorBackground;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "Lrh_server_driven_ui/v1/SolidColorBackgroundDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/SolidColorBackgroundDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/SolidColorBackgroundDto;", "getValue", "()Lrh_server_driven_ui/v1/SolidColorBackgroundDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SolidColorBackground extends HighlightRowStyleDto {
            private final SolidColorBackgroundDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SolidColorBackground) && Intrinsics.areEqual(this.value, ((SolidColorBackground) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SolidColorBackground(value=" + this.value + ")";
            }

            public final SolidColorBackgroundDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SolidColorBackground(SolidColorBackgroundDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MarginTieredHighlightRowStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto$OpacityReducedBackgroundWithBorder;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "value", "<init>", "(Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "getValue", "()Lrh_server_driven_ui/v1/OpacityReduceBackgroundWithBorderDto;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class OpacityReducedBackgroundWithBorder extends HighlightRowStyleDto {
            private final OpacityReduceBackgroundWithBorderDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpacityReducedBackgroundWithBorder) && Intrinsics.areEqual(this.value, ((OpacityReducedBackgroundWithBorder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "OpacityReducedBackgroundWithBorder(value=" + this.value + ")";
            }

            public final OpacityReduceBackgroundWithBorderDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpacityReducedBackgroundWithBorder(OpacityReduceBackgroundWithBorderDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: MarginTieredHighlightRowStyleDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$HighlightRowStyleDto;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyle;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<HighlightRowStyleDto, MarginTieredHighlightRowStyle> {
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
            public ProtoAdapter<MarginTieredHighlightRowStyle> getProtoAdapter() {
                return MarginTieredHighlightRowStyle.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public HighlightRowStyleDto fromProto(MarginTieredHighlightRowStyle proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getUnspecified() != null) {
                    return new Unspecified(UnspecifiedDto.INSTANCE.fromProto(proto.getUnspecified()));
                }
                if (proto.getSolid_color_background() != null) {
                    return new SolidColorBackground(SolidColorBackgroundDto.INSTANCE.fromProto(proto.getSolid_color_background()));
                }
                if (proto.getOpacity_reduced_background_with_border() != null) {
                    return new OpacityReducedBackgroundWithBorder(OpacityReduceBackgroundWithBorderDto.INSTANCE.fromProto(proto.getOpacity_reduced_background_with_border()));
                }
                return null;
            }
        }
    }

    /* compiled from: MarginTieredHighlightRowStyleDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MarginTieredHighlightRowStyleDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.MarginTieredHighlightRowStyle", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MarginTieredHighlightRowStyleDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MarginTieredHighlightRowStyleDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MarginTieredHighlightRowStyleDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MarginTieredHighlightRowStyleDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/MarginTieredHighlightRowStyleDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.MarginTieredHighlightRowStyleDto";
        }
    }
}
