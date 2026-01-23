package advisory.proto.p008v1;

import advisory.proto.p008v1.ManagementStyleSelectionImageContentDto;
import advisory.proto.p008v1.ManagementStyleSelectionListContentDto;
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

/* compiled from: ManagementStyleSelectionLayoutDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/ManagementStyleSelectionLayout;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate;)V", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto;", "layout_content", "(Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto;)V", "toProto", "()Ladvisory/proto/v1/ManagementStyleSelectionLayout;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate;", "getLayout_content", "()Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto;", "Companion", "Surrogate", "LayoutContentDto", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class ManagementStyleSelectionLayoutDto implements Dto3<ManagementStyleSelectionLayout>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ManagementStyleSelectionLayoutDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ManagementStyleSelectionLayoutDto, ManagementStyleSelectionLayout>> binaryBase64Serializer$delegate;
    private static final ManagementStyleSelectionLayoutDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ManagementStyleSelectionLayoutDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ManagementStyleSelectionLayoutDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final LayoutContentDto getLayout_content() {
        if (this.surrogate.getImage_content() != null) {
            return new LayoutContentDto.ImageContent(this.surrogate.getImage_content());
        }
        if (this.surrogate.getList_content() != null) {
            return new LayoutContentDto.ListContent(this.surrogate.getList_content());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ManagementStyleSelectionLayoutDto(LayoutContentDto layoutContentDto) {
        LayoutContentDto.ImageContent imageContent = layoutContentDto instanceof LayoutContentDto.ImageContent ? (LayoutContentDto.ImageContent) layoutContentDto : null;
        ManagementStyleSelectionImageContentDto value = imageContent != null ? imageContent.getValue() : null;
        LayoutContentDto.ListContent listContent = layoutContentDto instanceof LayoutContentDto.ListContent ? (LayoutContentDto.ListContent) layoutContentDto : null;
        this(new Surrogate(value, listContent != null ? listContent.getValue() : null));
    }

    public /* synthetic */ ManagementStyleSelectionLayoutDto(LayoutContentDto layoutContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : layoutContentDto);
    }

    @Override // com.robinhood.idl.Dto
    public ManagementStyleSelectionLayout toProto() {
        ManagementStyleSelectionImageContentDto image_content = this.surrogate.getImage_content();
        ManagementStyleSelectionImageContent proto = image_content != null ? image_content.toProto() : null;
        ManagementStyleSelectionListContentDto list_content = this.surrogate.getList_content();
        return new ManagementStyleSelectionLayout(proto, list_content != null ? list_content.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[ManagementStyleSelectionLayoutDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ManagementStyleSelectionLayoutDto) && Intrinsics.areEqual(((ManagementStyleSelectionLayoutDto) other).surrogate, this.surrogate);
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
    /* compiled from: ManagementStyleSelectionLayoutDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate;", "", "Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;", "image_content", "Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;", "list_content", "<init>", "(Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/ManagementStyleSelectionImageContentDto;Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;", "getImage_content", "()Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;", "getImage_content$annotations", "()V", "Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;", "getList_content", "()Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;", "getList_content$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ManagementStyleSelectionImageContentDto image_content;
        private final ManagementStyleSelectionListContentDto list_content;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ManagementStyleSelectionImageContentDto) null, (ManagementStyleSelectionListContentDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.image_content, surrogate.image_content) && Intrinsics.areEqual(this.list_content, surrogate.list_content);
        }

        public int hashCode() {
            ManagementStyleSelectionImageContentDto managementStyleSelectionImageContentDto = this.image_content;
            int iHashCode = (managementStyleSelectionImageContentDto == null ? 0 : managementStyleSelectionImageContentDto.hashCode()) * 31;
            ManagementStyleSelectionListContentDto managementStyleSelectionListContentDto = this.list_content;
            return iHashCode + (managementStyleSelectionListContentDto != null ? managementStyleSelectionListContentDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(image_content=" + this.image_content + ", list_content=" + this.list_content + ")";
        }

        /* compiled from: ManagementStyleSelectionLayoutDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ManagementStyleSelectionLayoutDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ManagementStyleSelectionImageContentDto managementStyleSelectionImageContentDto, ManagementStyleSelectionListContentDto managementStyleSelectionListContentDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.image_content = null;
            } else {
                this.image_content = managementStyleSelectionImageContentDto;
            }
            if ((i & 2) == 0) {
                this.list_content = null;
            } else {
                this.list_content = managementStyleSelectionListContentDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ManagementStyleSelectionImageContentDto managementStyleSelectionImageContentDto = self.image_content;
            if (managementStyleSelectionImageContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ManagementStyleSelectionImageContentDto.Serializer.INSTANCE, managementStyleSelectionImageContentDto);
            }
            ManagementStyleSelectionListContentDto managementStyleSelectionListContentDto = self.list_content;
            if (managementStyleSelectionListContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ManagementStyleSelectionListContentDto.Serializer.INSTANCE, managementStyleSelectionListContentDto);
            }
        }

        public Surrogate(ManagementStyleSelectionImageContentDto managementStyleSelectionImageContentDto, ManagementStyleSelectionListContentDto managementStyleSelectionListContentDto) {
            this.image_content = managementStyleSelectionImageContentDto;
            this.list_content = managementStyleSelectionListContentDto;
        }

        public /* synthetic */ Surrogate(ManagementStyleSelectionImageContentDto managementStyleSelectionImageContentDto, ManagementStyleSelectionListContentDto managementStyleSelectionListContentDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : managementStyleSelectionImageContentDto, (i & 2) != 0 ? null : managementStyleSelectionListContentDto);
        }

        public final ManagementStyleSelectionImageContentDto getImage_content() {
            return this.image_content;
        }

        public final ManagementStyleSelectionListContentDto getList_content() {
            return this.list_content;
        }
    }

    /* compiled from: ManagementStyleSelectionLayoutDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "Ladvisory/proto/v1/ManagementStyleSelectionLayout;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ManagementStyleSelectionLayoutDto, ManagementStyleSelectionLayout> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ManagementStyleSelectionLayoutDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManagementStyleSelectionLayoutDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ManagementStyleSelectionLayoutDto> getBinaryBase64Serializer() {
            return (KSerializer) ManagementStyleSelectionLayoutDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ManagementStyleSelectionLayout> getProtoAdapter() {
            return ManagementStyleSelectionLayout.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManagementStyleSelectionLayoutDto getZeroValue() {
            return ManagementStyleSelectionLayoutDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ManagementStyleSelectionLayoutDto fromProto(ManagementStyleSelectionLayout proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ManagementStyleSelectionImageContent image_content = proto.getImage_content();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ManagementStyleSelectionImageContentDto managementStyleSelectionImageContentDtoFromProto = image_content != null ? ManagementStyleSelectionImageContentDto.INSTANCE.fromProto(image_content) : null;
            ManagementStyleSelectionListContent list_content = proto.getList_content();
            return new ManagementStyleSelectionLayoutDto(new Surrogate(managementStyleSelectionImageContentDtoFromProto, list_content != null ? ManagementStyleSelectionListContentDto.INSTANCE.fromProto(list_content) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.ManagementStyleSelectionLayoutDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManagementStyleSelectionLayoutDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ManagementStyleSelectionLayoutDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ManagementStyleSelectionLayoutDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ImageContent", "ListContent", "Companion", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto$ImageContent;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto$ListContent;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class LayoutContentDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ LayoutContentDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LayoutContentDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ManagementStyleSelectionLayoutDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto$ImageContent;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto;", "Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;", "value", "<init>", "(Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;", "getValue", "()Ladvisory/proto/v1/ManagementStyleSelectionImageContentDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ImageContent extends LayoutContentDto {
            private final ManagementStyleSelectionImageContentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ImageContent) && Intrinsics.areEqual(this.value, ((ImageContent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ImageContent(value=" + this.value + ")";
            }

            public final ManagementStyleSelectionImageContentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageContent(ManagementStyleSelectionImageContentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ManagementStyleSelectionLayoutDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto$ListContent;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto;", "Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;", "value", "<init>", "(Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;", "getValue", "()Ladvisory/proto/v1/ManagementStyleSelectionListContentDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ListContent extends LayoutContentDto {
            private final ManagementStyleSelectionListContentDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ListContent) && Intrinsics.areEqual(this.value, ((ListContent) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ListContent(value=" + this.value + ")";
            }

            public final ManagementStyleSelectionListContentDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListContent(ManagementStyleSelectionListContentDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ManagementStyleSelectionLayoutDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$LayoutContentDto;", "Ladvisory/proto/v1/ManagementStyleSelectionLayout;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<LayoutContentDto, ManagementStyleSelectionLayout> {
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
            public ProtoAdapter<ManagementStyleSelectionLayout> getProtoAdapter() {
                return ManagementStyleSelectionLayout.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LayoutContentDto fromProto(ManagementStyleSelectionLayout proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getImage_content() != null) {
                    return new ImageContent(ManagementStyleSelectionImageContentDto.INSTANCE.fromProto(proto.getImage_content()));
                }
                if (proto.getList_content() != null) {
                    return new ListContent(ManagementStyleSelectionListContentDto.INSTANCE.fromProto(proto.getList_content()));
                }
                return null;
            }
        }
    }

    /* compiled from: ManagementStyleSelectionLayoutDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ManagementStyleSelectionLayoutDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.ManagementStyleSelectionLayout", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ManagementStyleSelectionLayoutDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ManagementStyleSelectionLayoutDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ManagementStyleSelectionLayoutDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ManagementStyleSelectionLayoutDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/ManagementStyleSelectionLayoutDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "advisory.proto.v1.ManagementStyleSelectionLayoutDto";
        }
    }
}
