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
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.ValuePropContentDto;
import rh_server_driven_ui.p531v1.ValuePropWithIconAlignmentDto;

/* compiled from: ValuePropWithIconDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/ValuePropWithIcon;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate;)V", "Lrh_server_driven_ui/v1/ValuePropContentDto;", "content", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ThemedColorDto;", "icon_color_override", "Lrh_server_driven_ui/v1/ValuePropWithIconAlignmentDto;", "alignment", "(Lrh_server_driven_ui/v1/ValuePropContentDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ValuePropWithIconAlignmentDto;)V", "toProto", "()Lrh_server_driven_ui/v1/ValuePropWithIcon;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate;", "getContent", "()Lrh_server_driven_ui/v1/ValuePropContentDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class ValuePropWithIconDto implements Dto3<ValuePropWithIcon>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValuePropWithIconDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValuePropWithIconDto, ValuePropWithIcon>> binaryBase64Serializer$delegate;
    private static final ValuePropWithIconDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValuePropWithIconDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValuePropWithIconDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ValuePropContentDto getContent() {
        return this.surrogate.getContent();
    }

    public final IconDto getIcon() {
        return this.surrogate.getIcon();
    }

    public final ThemedColorDto getIcon_color_override() {
        return this.surrogate.getIcon_color_override();
    }

    public /* synthetic */ ValuePropWithIconDto(ValuePropContentDto valuePropContentDto, IconDto iconDto, ThemedColorDto themedColorDto, ValuePropWithIconAlignmentDto valuePropWithIconAlignmentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : valuePropContentDto, (i & 2) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : valuePropWithIconAlignmentDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValuePropWithIconDto(ValuePropContentDto valuePropContentDto, IconDto icon, ThemedColorDto themedColorDto, ValuePropWithIconAlignmentDto valuePropWithIconAlignmentDto) {
        this(new Surrogate(valuePropContentDto, icon, themedColorDto, valuePropWithIconAlignmentDto));
        Intrinsics.checkNotNullParameter(icon, "icon");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ValuePropWithIcon toProto() {
        ValuePropContentDto content = this.surrogate.getContent();
        ValuePropContent proto = content != null ? content.toProto() : null;
        Icon icon = (Icon) this.surrogate.getIcon().toProto();
        ThemedColorDto icon_color_override = this.surrogate.getIcon_color_override();
        ThemedColor proto2 = icon_color_override != null ? icon_color_override.toProto() : null;
        ValuePropWithIconAlignmentDto alignment = this.surrogate.getAlignment();
        return new ValuePropWithIcon(proto, icon, proto2, alignment != null ? (ValuePropWithIconAlignment) alignment.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[ValuePropWithIconDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValuePropWithIconDto) && Intrinsics.areEqual(((ValuePropWithIconDto) other).surrogate, this.surrogate);
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
    /* compiled from: ValuePropWithIconDto.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate;", "", "Lrh_server_driven_ui/v1/ValuePropContentDto;", "content", "Lrh_server_driven_ui/v1/IconDto;", "icon", "Lrh_server_driven_ui/v1/ThemedColorDto;", "icon_color_override", "Lrh_server_driven_ui/v1/ValuePropWithIconAlignmentDto;", "alignment", "<init>", "(Lrh_server_driven_ui/v1/ValuePropContentDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ValuePropWithIconAlignmentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/ValuePropContentDto;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/ThemedColorDto;Lrh_server_driven_ui/v1/ValuePropWithIconAlignmentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/ValuePropContentDto;", "getContent", "()Lrh_server_driven_ui/v1/ValuePropContentDto;", "getContent$annotations", "()V", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "Lrh_server_driven_ui/v1/ThemedColorDto;", "getIcon_color_override", "()Lrh_server_driven_ui/v1/ThemedColorDto;", "getIcon_color_override$annotations", "Lrh_server_driven_ui/v1/ValuePropWithIconAlignmentDto;", "getAlignment", "()Lrh_server_driven_ui/v1/ValuePropWithIconAlignmentDto;", "getAlignment$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ValuePropWithIconAlignmentDto alignment;
        private final ValuePropContentDto content;
        private final IconDto icon;
        private final ThemedColorDto icon_color_override;

        public Surrogate() {
            this((ValuePropContentDto) null, (IconDto) null, (ThemedColorDto) null, (ValuePropWithIconAlignmentDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.content, surrogate.content) && this.icon == surrogate.icon && Intrinsics.areEqual(this.icon_color_override, surrogate.icon_color_override) && this.alignment == surrogate.alignment;
        }

        public int hashCode() {
            ValuePropContentDto valuePropContentDto = this.content;
            int iHashCode = (((valuePropContentDto == null ? 0 : valuePropContentDto.hashCode()) * 31) + this.icon.hashCode()) * 31;
            ThemedColorDto themedColorDto = this.icon_color_override;
            int iHashCode2 = (iHashCode + (themedColorDto == null ? 0 : themedColorDto.hashCode())) * 31;
            ValuePropWithIconAlignmentDto valuePropWithIconAlignmentDto = this.alignment;
            return iHashCode2 + (valuePropWithIconAlignmentDto != null ? valuePropWithIconAlignmentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(content=" + this.content + ", icon=" + this.icon + ", icon_color_override=" + this.icon_color_override + ", alignment=" + this.alignment + ")";
        }

        /* compiled from: ValuePropWithIconDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValuePropWithIconDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ValuePropContentDto valuePropContentDto, IconDto iconDto, ThemedColorDto themedColorDto, ValuePropWithIconAlignmentDto valuePropWithIconAlignmentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.content = null;
            } else {
                this.content = valuePropContentDto;
            }
            if ((i & 2) == 0) {
                this.icon = IconDto.INSTANCE.getZeroValue();
            } else {
                this.icon = iconDto;
            }
            if ((i & 4) == 0) {
                this.icon_color_override = null;
            } else {
                this.icon_color_override = themedColorDto;
            }
            if ((i & 8) == 0) {
                this.alignment = null;
            } else {
                this.alignment = valuePropWithIconAlignmentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ValuePropContentDto valuePropContentDto = self.content;
            if (valuePropContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ValuePropContentDto.Serializer.INSTANCE, valuePropContentDto);
            }
            if (self.icon != IconDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, IconDto.Serializer.INSTANCE, self.icon);
            }
            ThemedColorDto themedColorDto = self.icon_color_override;
            if (themedColorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ThemedColorDto.Serializer.INSTANCE, themedColorDto);
            }
            ValuePropWithIconAlignmentDto valuePropWithIconAlignmentDto = self.alignment;
            if (valuePropWithIconAlignmentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ValuePropWithIconAlignmentDto.Serializer.INSTANCE, valuePropWithIconAlignmentDto);
            }
        }

        public Surrogate(ValuePropContentDto valuePropContentDto, IconDto icon, ThemedColorDto themedColorDto, ValuePropWithIconAlignmentDto valuePropWithIconAlignmentDto) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.content = valuePropContentDto;
            this.icon = icon;
            this.icon_color_override = themedColorDto;
            this.alignment = valuePropWithIconAlignmentDto;
        }

        public final ValuePropContentDto getContent() {
            return this.content;
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public /* synthetic */ Surrogate(ValuePropContentDto valuePropContentDto, IconDto iconDto, ThemedColorDto themedColorDto, ValuePropWithIconAlignmentDto valuePropWithIconAlignmentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : valuePropContentDto, (i & 2) != 0 ? IconDto.INSTANCE.getZeroValue() : iconDto, (i & 4) != 0 ? null : themedColorDto, (i & 8) != 0 ? null : valuePropWithIconAlignmentDto);
        }

        public final ThemedColorDto getIcon_color_override() {
            return this.icon_color_override;
        }

        public final ValuePropWithIconAlignmentDto getAlignment() {
            return this.alignment;
        }
    }

    /* compiled from: ValuePropWithIconDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithIconDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "Lrh_server_driven_ui/v1/ValuePropWithIcon;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ValuePropWithIconDto, ValuePropWithIcon> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValuePropWithIconDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValuePropWithIconDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValuePropWithIconDto> getBinaryBase64Serializer() {
            return (KSerializer) ValuePropWithIconDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValuePropWithIcon> getProtoAdapter() {
            return ValuePropWithIcon.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValuePropWithIconDto getZeroValue() {
            return ValuePropWithIconDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValuePropWithIconDto fromProto(ValuePropWithIcon proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ValuePropContent content = proto.getContent();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ValuePropContentDto valuePropContentDtoFromProto = content != null ? ValuePropContentDto.INSTANCE.fromProto(content) : null;
            IconDto iconDtoFromProto = IconDto.INSTANCE.fromProto(proto.getIcon());
            ThemedColor icon_color_override = proto.getIcon_color_override();
            ThemedColorDto themedColorDtoFromProto = icon_color_override != null ? ThemedColorDto.INSTANCE.fromProto(icon_color_override) : null;
            ValuePropWithIconAlignment alignment = proto.getAlignment();
            return new ValuePropWithIconDto(new Surrogate(valuePropContentDtoFromProto, iconDtoFromProto, themedColorDtoFromProto, alignment != null ? ValuePropWithIconAlignmentDto.INSTANCE.fromProto(alignment) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.ValuePropWithIconDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValuePropWithIconDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ValuePropWithIconDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValuePropWithIconDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithIconDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/ValuePropWithIconDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<ValuePropWithIconDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.ValuePropWithIcon", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValuePropWithIconDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValuePropWithIconDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValuePropWithIconDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ValuePropWithIconDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/ValuePropWithIconDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.ValuePropWithIconDto";
        }
    }
}
