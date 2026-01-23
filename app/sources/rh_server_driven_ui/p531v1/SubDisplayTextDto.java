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
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.DisplayTextDto;
import rh_server_driven_ui.p531v1.IconDisplayTextDto;
import rh_server_driven_ui.p531v1.IconDto;

/* compiled from: SubDisplayTextDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006)"}, m3636d2 = {"Lrh_server_driven_ui/v1/SubDisplayTextDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/SubDisplayText;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate;)V", "Lrh_server_driven_ui/v1/IconDisplayTextDto;", "main", "", "string_format", "Lrh_server_driven_ui/v1/DisplayTextDto;", "description", "Lrh_server_driven_ui/v1/IconDto;", "trailing_icon", "(Lrh_server_driven_ui/v1/IconDisplayTextDto;Ljava/lang/String;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/IconDto;)V", "toProto", "()Lrh_server_driven_ui/v1/SubDisplayText;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class SubDisplayTextDto implements Dto3<SubDisplayText>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SubDisplayTextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SubDisplayTextDto, SubDisplayText>> binaryBase64Serializer$delegate;
    private static final SubDisplayTextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SubDisplayTextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SubDisplayTextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ SubDisplayTextDto(IconDisplayTextDto iconDisplayTextDto, String str, DisplayTextDto displayTextDto, IconDto iconDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iconDisplayTextDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : displayTextDto, (i & 8) != 0 ? null : iconDto);
    }

    public SubDisplayTextDto(IconDisplayTextDto iconDisplayTextDto, String str, DisplayTextDto displayTextDto, IconDto iconDto) {
        this(new Surrogate(iconDisplayTextDto, str, displayTextDto, iconDto));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public SubDisplayText toProto() {
        IconDisplayTextDto main = this.surrogate.getMain();
        IconDisplayText proto = main != null ? main.toProto() : null;
        String string_format = this.surrogate.getString_format();
        DisplayTextDto description = this.surrogate.getDescription();
        DisplayText proto2 = description != null ? description.toProto() : null;
        IconDto trailing_icon = this.surrogate.getTrailing_icon();
        return new SubDisplayText(proto, string_format, proto2, trailing_icon != null ? (Icon) trailing_icon.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[SubDisplayTextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SubDisplayTextDto) && Intrinsics.areEqual(((SubDisplayTextDto) other).surrogate, this.surrogate);
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
    /* compiled from: SubDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate;", "", "Lrh_server_driven_ui/v1/IconDisplayTextDto;", "main", "", "string_format", "Lrh_server_driven_ui/v1/DisplayTextDto;", "description", "Lrh_server_driven_ui/v1/IconDto;", "trailing_icon", "<init>", "(Lrh_server_driven_ui/v1/IconDisplayTextDto;Ljava/lang/String;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/IconDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/IconDisplayTextDto;Ljava/lang/String;Lrh_server_driven_ui/v1/DisplayTextDto;Lrh_server_driven_ui/v1/IconDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/IconDisplayTextDto;", "getMain", "()Lrh_server_driven_ui/v1/IconDisplayTextDto;", "getMain$annotations", "()V", "Ljava/lang/String;", "getString_format", "getString_format$annotations", "Lrh_server_driven_ui/v1/DisplayTextDto;", "getDescription", "()Lrh_server_driven_ui/v1/DisplayTextDto;", "getDescription$annotations", "Lrh_server_driven_ui/v1/IconDto;", "getTrailing_icon", "()Lrh_server_driven_ui/v1/IconDto;", "getTrailing_icon$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DisplayTextDto description;
        private final IconDisplayTextDto main;
        private final String string_format;
        private final IconDto trailing_icon;

        public Surrogate() {
            this((IconDisplayTextDto) null, (String) null, (DisplayTextDto) null, (IconDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.main, surrogate.main) && Intrinsics.areEqual(this.string_format, surrogate.string_format) && Intrinsics.areEqual(this.description, surrogate.description) && this.trailing_icon == surrogate.trailing_icon;
        }

        public int hashCode() {
            IconDisplayTextDto iconDisplayTextDto = this.main;
            int iHashCode = (iconDisplayTextDto == null ? 0 : iconDisplayTextDto.hashCode()) * 31;
            String str = this.string_format;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DisplayTextDto displayTextDto = this.description;
            int iHashCode3 = (iHashCode2 + (displayTextDto == null ? 0 : displayTextDto.hashCode())) * 31;
            IconDto iconDto = this.trailing_icon;
            return iHashCode3 + (iconDto != null ? iconDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(main=" + this.main + ", string_format=" + this.string_format + ", description=" + this.description + ", trailing_icon=" + this.trailing_icon + ")";
        }

        /* compiled from: SubDisplayTextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SubDisplayTextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IconDisplayTextDto iconDisplayTextDto, String str, DisplayTextDto displayTextDto, IconDto iconDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.main = null;
            } else {
                this.main = iconDisplayTextDto;
            }
            if ((i & 2) == 0) {
                this.string_format = null;
            } else {
                this.string_format = str;
            }
            if ((i & 4) == 0) {
                this.description = null;
            } else {
                this.description = displayTextDto;
            }
            if ((i & 8) == 0) {
                this.trailing_icon = null;
            } else {
                this.trailing_icon = iconDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            IconDisplayTextDto iconDisplayTextDto = self.main;
            if (iconDisplayTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IconDisplayTextDto.Serializer.INSTANCE, iconDisplayTextDto);
            }
            String str = self.string_format;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            DisplayTextDto displayTextDto = self.description;
            if (displayTextDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DisplayTextDto.Serializer.INSTANCE, displayTextDto);
            }
            IconDto iconDto = self.trailing_icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, IconDto.Serializer.INSTANCE, iconDto);
            }
        }

        public Surrogate(IconDisplayTextDto iconDisplayTextDto, String str, DisplayTextDto displayTextDto, IconDto iconDto) {
            this.main = iconDisplayTextDto;
            this.string_format = str;
            this.description = displayTextDto;
            this.trailing_icon = iconDto;
        }

        public /* synthetic */ Surrogate(IconDisplayTextDto iconDisplayTextDto, String str, DisplayTextDto displayTextDto, IconDto iconDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : iconDisplayTextDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : displayTextDto, (i & 8) != 0 ? null : iconDto);
        }

        public final IconDisplayTextDto getMain() {
            return this.main;
        }

        public final String getString_format() {
            return this.string_format;
        }

        public final DisplayTextDto getDescription() {
            return this.description;
        }

        public final IconDto getTrailing_icon() {
            return this.trailing_icon;
        }
    }

    /* compiled from: SubDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/SubDisplayTextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/SubDisplayTextDto;", "Lrh_server_driven_ui/v1/SubDisplayText;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/SubDisplayTextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SubDisplayTextDto, SubDisplayText> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SubDisplayTextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubDisplayTextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SubDisplayTextDto> getBinaryBase64Serializer() {
            return (KSerializer) SubDisplayTextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SubDisplayText> getProtoAdapter() {
            return SubDisplayText.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubDisplayTextDto getZeroValue() {
            return SubDisplayTextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SubDisplayTextDto fromProto(SubDisplayText proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IconDisplayText main = proto.getMain();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IconDisplayTextDto iconDisplayTextDtoFromProto = main != null ? IconDisplayTextDto.INSTANCE.fromProto(main) : null;
            String string_format = proto.getString_format();
            DisplayText description = proto.getDescription();
            DisplayTextDto displayTextDtoFromProto = description != null ? DisplayTextDto.INSTANCE.fromProto(description) : null;
            Icon trailing_icon = proto.getTrailing_icon();
            return new SubDisplayTextDto(new Surrogate(iconDisplayTextDtoFromProto, string_format, displayTextDtoFromProto, trailing_icon != null ? IconDto.INSTANCE.fromProto(trailing_icon) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.SubDisplayTextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubDisplayTextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new SubDisplayTextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SubDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/SubDisplayTextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/SubDisplayTextDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/SubDisplayTextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SubDisplayTextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.SubDisplayText", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SubDisplayTextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SubDisplayTextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SubDisplayTextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: SubDisplayTextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/SubDisplayTextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.SubDisplayTextDto";
        }
    }
}
