package advisory.update_investor_profile.proto.p009v1;

import advisory.update_investor_profile.proto.p009v1.UpdateInvestorProfilePageDto;
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

/* compiled from: GetAllocationFlowResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponse;", "Landroid/os/Parcelable;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate;)V", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePageDto;", "page", "(Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePageDto;)V", "toProto", "()Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes4.dex */
public final class GetAllocationFlowResponseDto implements Dto3<GetAllocationFlowResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAllocationFlowResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAllocationFlowResponseDto, GetAllocationFlowResponse>> binaryBase64Serializer$delegate;
    private static final GetAllocationFlowResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAllocationFlowResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAllocationFlowResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public GetAllocationFlowResponseDto(UpdateInvestorProfilePageDto updateInvestorProfilePageDto) {
        this(new Surrogate(updateInvestorProfilePageDto));
    }

    public /* synthetic */ GetAllocationFlowResponseDto(UpdateInvestorProfilePageDto updateInvestorProfilePageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : updateInvestorProfilePageDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAllocationFlowResponse toProto() {
        UpdateInvestorProfilePageDto page = this.surrogate.getPage();
        return new GetAllocationFlowResponse(page != null ? page.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[GetAllocationFlowResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAllocationFlowResponseDto) && Intrinsics.areEqual(((GetAllocationFlowResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAllocationFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate;", "", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePageDto;", "page", "<init>", "(Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePageDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePageDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_update_investor_profile_proto_v1_externalRelease", "(Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePageDto;", "getPage", "()Ladvisory/update_investor_profile/proto/v1/UpdateInvestorProfilePageDto;", "getPage$annotations", "()V", "Companion", "$serializer", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UpdateInvestorProfilePageDto page;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((UpdateInvestorProfilePageDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.page, ((Surrogate) other).page);
        }

        public int hashCode() {
            UpdateInvestorProfilePageDto updateInvestorProfilePageDto = this.page;
            if (updateInvestorProfilePageDto == null) {
                return 0;
            }
            return updateInvestorProfilePageDto.hashCode();
        }

        public String toString() {
            return "Surrogate(page=" + this.page + ")";
        }

        /* compiled from: GetAllocationFlowResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate;", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAllocationFlowResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UpdateInvestorProfilePageDto updateInvestorProfilePageDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.page = null;
            } else {
                this.page = updateInvestorProfilePageDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$advisory_update_investor_profile_proto_v1_externalRelease */
        public static final /* synthetic */ void m3x24e7e549(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UpdateInvestorProfilePageDto updateInvestorProfilePageDto = self.page;
            if (updateInvestorProfilePageDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UpdateInvestorProfilePageDto.Serializer.INSTANCE, updateInvestorProfilePageDto);
            }
        }

        public Surrogate(UpdateInvestorProfilePageDto updateInvestorProfilePageDto) {
            this.page = updateInvestorProfilePageDto;
        }

        public /* synthetic */ Surrogate(UpdateInvestorProfilePageDto updateInvestorProfilePageDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : updateInvestorProfilePageDto);
        }

        public final UpdateInvestorProfilePageDto getPage() {
            return this.page;
        }
    }

    /* compiled from: GetAllocationFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAllocationFlowResponseDto, GetAllocationFlowResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAllocationFlowResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAllocationFlowResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAllocationFlowResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAllocationFlowResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAllocationFlowResponse> getProtoAdapter() {
            return GetAllocationFlowResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAllocationFlowResponseDto getZeroValue() {
            return GetAllocationFlowResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAllocationFlowResponseDto fromProto(GetAllocationFlowResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UpdateInvestorProfilePage page = proto.getPage();
            return new GetAllocationFlowResponseDto(new Surrogate(page != null ? UpdateInvestorProfilePageDto.INSTANCE.fromProto(page) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.update_investor_profile.proto.v1.GetAllocationFlowResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAllocationFlowResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAllocationFlowResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAllocationFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAllocationFlowResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.update_investor_profile.proto.v1.GetAllocationFlowResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAllocationFlowResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAllocationFlowResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAllocationFlowResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAllocationFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/update_investor_profile/proto/v1/GetAllocationFlowResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory_update_investor_profile.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "advisory.update_investor_profile.proto.v1.GetAllocationFlowResponseDto";
        }
    }
}
