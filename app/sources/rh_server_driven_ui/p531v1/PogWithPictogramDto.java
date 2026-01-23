package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
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
import rh_server_driven_ui.p531v1.PictogramDto;
import rh_server_driven_ui.p531v1.PictogramSizeDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: PogWithPictogramDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b,\u0010+R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010-¨\u00062"}, m3636d2 = {"Lrh_server_driven_ui/v1/PogWithPictogramDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/PogWithPictogram;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate;)V", "Lrh_server_driven_ui/v1/PictogramDto;", "pictogram", "Lrh_server_driven_ui/v1/PictogramSizeDto;", "size", "Lrh_server_driven_ui/v1/ThemedColorDto;", "foreground_color_override", "background_color_override", "", "is_disabled", "(Lrh_server_driven_ui/v1/PictogramDto;Lrh_server_driven_ui/v1/PictogramSizeDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Z)V", "toProto", "()Lrh_server_driven_ui/v1/PogWithPictogram;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate;", "getPictogram", "()Lrh_server_driven_ui/v1/PictogramDto;", "getSize", "()Lrh_server_driven_ui/v1/PictogramSizeDto;", "getForeground_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getBackground_color_override", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class PogWithPictogramDto implements Dto3<PogWithPictogram>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PogWithPictogramDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PogWithPictogramDto, PogWithPictogram>> binaryBase64Serializer$delegate;
    private static final PogWithPictogramDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PogWithPictogramDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PogWithPictogramDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final PictogramDto getPictogram() {
        return this.surrogate.getPictogram();
    }

    public final PictogramSizeDto getSize() {
        return this.surrogate.getSize();
    }

    public final ThemedColorDto getForeground_color_override() {
        return this.surrogate.getForeground_color_override();
    }

    public final ThemedColorDto getBackground_color_override() {
        return this.surrogate.getBackground_color_override();
    }

    public final boolean is_disabled() {
        return this.surrogate.getIs_disabled();
    }

    public /* synthetic */ PogWithPictogramDto(PictogramDto pictogramDto, PictogramSizeDto pictogramSizeDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? PictogramDto.INSTANCE.getZeroValue() : pictogramDto, (i & 2) != 0 ? PictogramSizeDto.INSTANCE.getZeroValue() : pictogramSizeDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : themedColorDto2, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PogWithPictogramDto(PictogramDto pictogram, PictogramSizeDto size, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z) {
        this(new Surrogate(pictogram, size, themedColorDto, themedColorDto2, z));
        Intrinsics.checkNotNullParameter(pictogram, "pictogram");
        Intrinsics.checkNotNullParameter(size, "size");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PogWithPictogram toProto() {
        Pictogram pictogram = (Pictogram) this.surrogate.getPictogram().toProto();
        PictogramSize pictogramSize = (PictogramSize) this.surrogate.getSize().toProto();
        ThemedColorDto foreground_color_override = this.surrogate.getForeground_color_override();
        ThemedColor proto = foreground_color_override != null ? foreground_color_override.toProto() : null;
        ThemedColorDto background_color_override = this.surrogate.getBackground_color_override();
        return new PogWithPictogram(pictogram, pictogramSize, proto, background_color_override != null ? background_color_override.toProto() : null, this.surrogate.getIs_disabled(), null, 32, null);
    }

    public String toString() {
        return "[PogWithPictogramDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PogWithPictogramDto) && Intrinsics.areEqual(((PogWithPictogramDto) other).surrogate, this.surrogate);
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
    /* compiled from: PogWithPictogramDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010.R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00102\u0012\u0004\b4\u0010'\u001a\u0004\b\n\u00103¨\u00067"}, m3636d2 = {"Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate;", "", "Lrh_server_driven_ui/v1/PictogramDto;", "pictogram", "Lrh_server_driven_ui/v1/PictogramSizeDto;", "size", "Lrh_server_driven_ui/v1/ThemedColorDto;", "foreground_color_override", "background_color_override", "", "is_disabled", "<init>", "(Lrh_server_driven_ui/v1/PictogramDto;Lrh_server_driven_ui/v1/PictogramSizeDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/PictogramDto;Lrh_server_driven_ui/v1/PictogramSizeDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ThemedColorDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/PictogramDto;", "getPictogram", "()Lrh_server_driven_ui/v1/PictogramDto;", "getPictogram$annotations", "()V", "Lrh_server_driven_ui/v1/PictogramSizeDto;", "getSize", "()Lrh_server_driven_ui/v1/PictogramSizeDto;", "getSize$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getForeground_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getForeground_color_override$annotations", "getBackground_color_override", "getBackground_color_override$annotations", "Z", "()Z", "is_disabled$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto background_color_override;
        private final ThemedColorDto foreground_color_override;
        private final boolean is_disabled;
        private final PictogramDto pictogram;
        private final PictogramSizeDto size;

        public Surrogate() {
            this((PictogramDto) null, (PictogramSizeDto) null, (ThemedColorDto) null, (ThemedColorDto) null, false, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.pictogram == surrogate.pictogram && this.size == surrogate.size && Intrinsics.areEqual(this.foreground_color_override, surrogate.foreground_color_override) && Intrinsics.areEqual(this.background_color_override, surrogate.background_color_override) && this.is_disabled == surrogate.is_disabled;
        }

        public int hashCode() {
            int iHashCode = ((this.pictogram.hashCode() * 31) + this.size.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.foreground_color_override;
            int iHashCode2 = (iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ThemedColorDto themedColorDto2 = this.background_color_override;
            return ((iHashCode2 + (themedColorDto2 != null ? themedColorDto2.hashCode() : 0)) * 31) + Boolean.hashCode(this.is_disabled);
        }

        public String toString() {
            return "Surrogate(pictogram=" + this.pictogram + ", size=" + this.size + ", foreground_color_override=" + this.foreground_color_override + ", background_color_override=" + this.background_color_override + ", is_disabled=" + this.is_disabled + ")";
        }

        /* compiled from: PogWithPictogramDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PogWithPictogramDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, PictogramDto pictogramDto, PictogramSizeDto pictogramSizeDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            this.pictogram = (i & 1) == 0 ? PictogramDto.INSTANCE.getZeroValue() : pictogramDto;
            if ((i & 2) == 0) {
                this.size = PictogramSizeDto.INSTANCE.getZeroValue();
            } else {
                this.size = pictogramSizeDto;
            }
            if ((i & 4) == 0) {
                this.foreground_color_override = null;
            } else {
                this.foreground_color_override = themedColorDto;
            }
            if ((i & 8) == 0) {
                this.background_color_override = null;
            } else {
                this.background_color_override = themedColorDto2;
            }
            if ((i & 16) == 0) {
                this.is_disabled = false;
            } else {
                this.is_disabled = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.pictogram != PictogramDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, PictogramDto.Serializer.INSTANCE, self.pictogram);
            }
            if (self.size != PictogramSizeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, PictogramSizeDto.Serializer.INSTANCE, self.size);
            }
            ThemedColorDto themedColorDto = self.foreground_color_override;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ThemedColorDto themedColorDto2 = self.background_color_override;
            if (themedColorDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ThemedColorDto.Serializer.INSTANCE, themedColorDto2);
            }
            boolean z = self.is_disabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
        }

        public Surrogate(PictogramDto pictogram, PictogramSizeDto size, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z) {
            Intrinsics.checkNotNullParameter(pictogram, "pictogram");
            Intrinsics.checkNotNullParameter(size, "size");
            this.pictogram = pictogram;
            this.size = size;
            this.foreground_color_override = themedColorDto;
            this.background_color_override = themedColorDto2;
            this.is_disabled = z;
        }

        public final PictogramDto getPictogram() {
            return this.pictogram;
        }

        public /* synthetic */ Surrogate(PictogramDto pictogramDto, PictogramSizeDto pictogramSizeDto, ThemedColorDto themedColorDto, ThemedColorDto themedColorDto2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PictogramDto.INSTANCE.getZeroValue() : pictogramDto, (i & 2) != 0 ? PictogramSizeDto.INSTANCE.getZeroValue() : pictogramSizeDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : themedColorDto2, (i & 16) != 0 ? false : z);
        }

        public final PictogramSizeDto getSize() {
            return this.size;
        }

        public final ThemedColorDto getForeground_color_override() {
            return this.foreground_color_override;
        }

        public final ThemedColorDto getBackground_color_override() {
            return this.background_color_override;
        }

        /* renamed from: is_disabled, reason: from getter */
        public final boolean getIs_disabled() {
            return this.is_disabled;
        }
    }

    /* compiled from: PogWithPictogramDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/PogWithPictogramDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "Lrh_server_driven_ui/v1/PogWithPictogram;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/PogWithPictogramDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PogWithPictogramDto, PogWithPictogram> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PogWithPictogramDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PogWithPictogramDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PogWithPictogramDto> getBinaryBase64Serializer() {
            return (KSerializer) PogWithPictogramDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PogWithPictogram> getProtoAdapter() {
            return PogWithPictogram.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PogWithPictogramDto getZeroValue() {
            return PogWithPictogramDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PogWithPictogramDto fromProto(PogWithPictogram proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            PictogramDto pictogramDtoFromProto = PictogramDto.INSTANCE.fromProto(proto.getPictogram());
            PictogramSizeDto pictogramSizeDtoFromProto = PictogramSizeDto.INSTANCE.fromProto(proto.getSize());
            ThemedColor foreground_color_override = proto.getForeground_color_override();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = foreground_color_override != null ? ThemedColorDto.INSTANCE.fromProto(foreground_color_override) : null;
            ThemedColor background_color_override = proto.getBackground_color_override();
            return new PogWithPictogramDto(new Surrogate(pictogramDtoFromProto, pictogramSizeDtoFromProto, themedColorDtoFromProto, background_color_override != null ? ThemedColorDto.INSTANCE.fromProto(background_color_override) : null, proto.getIs_disabled()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.PogWithPictogramDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PogWithPictogramDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PogWithPictogramDto(null, null, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PogWithPictogramDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/PogWithPictogramDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/PogWithPictogramDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<PogWithPictogramDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.PogWithPictogram", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PogWithPictogramDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PogWithPictogramDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PogWithPictogramDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PogWithPictogramDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/PogWithPictogramDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.PogWithPictogramDto";
        }
    }
}
