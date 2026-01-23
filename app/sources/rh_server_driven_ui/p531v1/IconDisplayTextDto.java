package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.LinearGradientColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: IconDisplayTextDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDisplayTextDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/IconDisplayText;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate;)V", "", "value", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/LinearGradientColorDto;", "gradient_color", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/LinearGradientColorDto;)V", "toProto", "()Lrh_server_driven_ui/v1/IconDisplayText;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class IconDisplayTextDto implements Dto3<IconDisplayText>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<IconDisplayTextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<IconDisplayTextDto, IconDisplayText>> binaryBase64Serializer$delegate;
    private static final IconDisplayTextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ IconDisplayTextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private IconDisplayTextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ IconDisplayTextDto(String str, ThemedColorDto themedColorDto, IconDto iconDto, LinearGradientColorDto linearGradientColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : linearGradientColorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconDisplayTextDto(String value, ThemedColorDto themedColorDto, IconDto iconDto, LinearGradientColorDto linearGradientColorDto) {
        this(new Surrogate(value, themedColorDto, iconDto, linearGradientColorDto));
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public IconDisplayText toProto() {
        String value = this.surrogate.getValue();
        ThemedColorDto color = this.surrogate.getColor();
        ThemedColor proto = color != null ? color.toProto() : null;
        IconDto icon = this.surrogate.getIcon();
        Icon icon2 = icon != null ? (Icon) icon.toProto() : null;
        LinearGradientColorDto gradient_color = this.surrogate.getGradient_color();
        return new IconDisplayText(value, proto, icon2, gradient_color != null ? gradient_color.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[IconDisplayTextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof IconDisplayTextDto) && Intrinsics.areEqual(((IconDisplayTextDto) other).surrogate, this.surrogate);
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
    /* compiled from: IconDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate;", "", "", "value", "Lrh_server_driven_ui/v1/ThemedColorDto;", ResourceTypes.COLOR, "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/LinearGradientColorDto;", "gradient_color", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/LinearGradientColorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/LinearGradientColorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getValue$annotations", "()V", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getColor$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "Lrh_server_driven_ui/v1/LinearGradientColorDto;", "getGradient_color", "()Lrh_server_driven_ui/v1/LinearGradientColorDto;", "getGradient_color$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ThemedColorDto color;
        private final LinearGradientColorDto gradient_color;
        private final IconDto icon;
        private final String value;

        public Surrogate() {
            this((String) null, (ThemedColorDto) null, (IconDto) null, (LinearGradientColorDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.value, surrogate.value) && Intrinsics.areEqual(this.color, surrogate.color) && this.icon == surrogate.icon && Intrinsics.areEqual(this.gradient_color, surrogate.gradient_color);
        }

        public int hashCode() {
            int iHashCode = this.value.hashCode() * 31;
            ThemedColorDto themedColorDto = this.color;
            int iHashCode2 = (iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            IconDto iconDto = this.icon;
            int iHashCode3 = (iHashCode2 + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
            LinearGradientColorDto linearGradientColorDto = this.gradient_color;
            return iHashCode3 + (linearGradientColorDto != null ? linearGradientColorDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(value=" + this.value + ", color=" + this.color + ", icon=" + this.icon + ", gradient_color=" + this.gradient_color + ")";
        }

        /* compiled from: IconDisplayTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return IconDisplayTextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, ThemedColorDto themedColorDto, IconDto iconDto, LinearGradientColorDto linearGradientColorDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.value = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.color = null;
            } else {
                this.color = themedColorDto;
            }
            if ((i & 4) == 0) {
                this.icon = null;
            } else {
                this.icon = iconDto;
            }
            if ((i & 8) == 0) {
                this.gradient_color = null;
            } else {
                this.gradient_color = linearGradientColorDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.value, "")) {
                output.encodeStringElement(serialDesc, 0, self.value);
            }
            ThemedColorDto themedColorDto = self.color;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            IconDto iconDto = self.icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IconDto.Serializer.INSTANCE, iconDto);
            }
            LinearGradientColorDto linearGradientColorDto = self.gradient_color;
            if (linearGradientColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, LinearGradientColorDto.Serializer.INSTANCE, linearGradientColorDto);
            }
        }

        public Surrogate(String value, ThemedColorDto themedColorDto, IconDto iconDto, LinearGradientColorDto linearGradientColorDto) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.color = themedColorDto;
            this.icon = iconDto;
            this.gradient_color = linearGradientColorDto;
        }

        public final String getValue() {
            return this.value;
        }

        public /* synthetic */ Surrogate(String str, ThemedColorDto themedColorDto, IconDto iconDto, LinearGradientColorDto linearGradientColorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : themedColorDto, (i & 4) != 0 ? null : iconDto, (i & 8) != 0 ? null : linearGradientColorDto);
        }

        public final ThemedColorDto getColor() {
            return this.color;
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public final LinearGradientColorDto getGradient_color() {
            return this.gradient_color;
        }
    }

    /* compiled from: IconDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDisplayTextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/IconDisplayTextDto;", "Lrh_server_driven_ui/v1/IconDisplayText;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/IconDisplayTextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<IconDisplayTextDto, IconDisplayText> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IconDisplayTextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconDisplayTextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<IconDisplayTextDto> getBinaryBase64Serializer() {
            return (KSerializer) IconDisplayTextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<IconDisplayText> getProtoAdapter() {
            return IconDisplayText.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconDisplayTextDto getZeroValue() {
            return IconDisplayTextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public IconDisplayTextDto fromProto(IconDisplayText proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String value = proto.getValue();
            ThemedColor color = proto.getColor();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ThemedColorDto themedColorDtoFromProto = color != null ? ThemedColorDto.INSTANCE.fromProto(color) : null;
            Icon icon = proto.getIcon();
            IconDto iconDtoFromProto = icon != null ? IconDto.INSTANCE.fromProto(icon) : null;
            LinearGradientColor gradient_color = proto.getGradient_color();
            return new IconDisplayTextDto(new Surrogate(value, themedColorDtoFromProto, iconDtoFromProto, gradient_color != null ? LinearGradientColorDto.INSTANCE.fromProto(gradient_color) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.IconDisplayTextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IconDisplayTextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new IconDisplayTextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: IconDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDisplayTextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/IconDisplayTextDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/IconDisplayTextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<IconDisplayTextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.IconDisplayText", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, IconDisplayTextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public IconDisplayTextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new IconDisplayTextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: IconDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/IconDisplayTextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.IconDisplayTextDto";
        }
    }
}
