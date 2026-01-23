package microgram.contracts.margin.margin_call.proto.p496v1;

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
import microgram.contracts.margin.margin_call.proto.p496v1.MaintenanceCallDataDto;

/* compiled from: GetMaintenanceCallDataResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate;)V", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "maintenance_call_data", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;)V", "toProto", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate;", "getMaintenance_call_data", "()Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class GetMaintenanceCallDataResponseDto implements Dto3<GetMaintenanceCallDataResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMaintenanceCallDataResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMaintenanceCallDataResponseDto, GetMaintenanceCallDataResponse>> binaryBase64Serializer$delegate;
    private static final GetMaintenanceCallDataResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMaintenanceCallDataResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMaintenanceCallDataResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MaintenanceCallDataDto getMaintenance_call_data() {
        return this.surrogate.getMaintenance_call_data();
    }

    public GetMaintenanceCallDataResponseDto(MaintenanceCallDataDto maintenanceCallDataDto) {
        this(new Surrogate(maintenanceCallDataDto));
    }

    public /* synthetic */ GetMaintenanceCallDataResponseDto(MaintenanceCallDataDto maintenanceCallDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : maintenanceCallDataDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetMaintenanceCallDataResponse toProto() {
        MaintenanceCallDataDto maintenance_call_data = this.surrogate.getMaintenance_call_data();
        return new GetMaintenanceCallDataResponse(maintenance_call_data != null ? maintenance_call_data.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[GetMaintenanceCallDataResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMaintenanceCallDataResponseDto) && Intrinsics.areEqual(((GetMaintenanceCallDataResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMaintenanceCallDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate;", "", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "maintenance_call_data", "<init>", "(Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease", "(Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "getMaintenance_call_data", "()Lmicrogram/contracts/margin/margin_call/proto/v1/MaintenanceCallDataDto;", "getMaintenance_call_data$annotations", "()V", "Companion", "$serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final MaintenanceCallDataDto maintenance_call_data;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((MaintenanceCallDataDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.maintenance_call_data, ((Surrogate) other).maintenance_call_data);
        }

        public int hashCode() {
            MaintenanceCallDataDto maintenanceCallDataDto = this.maintenance_call_data;
            if (maintenanceCallDataDto == null) {
                return 0;
            }
            return maintenanceCallDataDto.hashCode();
        }

        public String toString() {
            return "Surrogate(maintenance_call_data=" + this.maintenance_call_data + ")";
        }

        /* compiled from: GetMaintenanceCallDataResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMaintenanceCallDataResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MaintenanceCallDataDto maintenanceCallDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.maintenance_call_data = null;
            } else {
                this.maintenance_call_data = maintenanceCallDataDto;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_margin_margin_call_proto_v1_externalRelease */
        public static final /* synthetic */ void m3764xd30f103b(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            MaintenanceCallDataDto maintenanceCallDataDto = self.maintenance_call_data;
            if (maintenanceCallDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, MaintenanceCallDataDto.Serializer.INSTANCE, maintenanceCallDataDto);
            }
        }

        public Surrogate(MaintenanceCallDataDto maintenanceCallDataDto) {
            this.maintenance_call_data = maintenanceCallDataDto;
        }

        public /* synthetic */ Surrogate(MaintenanceCallDataDto maintenanceCallDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : maintenanceCallDataDto);
        }

        public final MaintenanceCallDataDto getMaintenance_call_data() {
            return this.maintenance_call_data;
        }
    }

    /* compiled from: GetMaintenanceCallDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetMaintenanceCallDataResponseDto, GetMaintenanceCallDataResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMaintenanceCallDataResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMaintenanceCallDataResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMaintenanceCallDataResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMaintenanceCallDataResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMaintenanceCallDataResponse> getProtoAdapter() {
            return GetMaintenanceCallDataResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMaintenanceCallDataResponseDto getZeroValue() {
            return GetMaintenanceCallDataResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMaintenanceCallDataResponseDto fromProto(GetMaintenanceCallDataResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            MaintenanceCallData maintenance_call_data = proto.getMaintenance_call_data();
            return new GetMaintenanceCallDataResponseDto(new Surrogate(maintenance_call_data != null ? MaintenanceCallDataDto.INSTANCE.fromProto(maintenance_call_data) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallDataResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMaintenanceCallDataResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetMaintenanceCallDataResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMaintenanceCallDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetMaintenanceCallDataResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallDataResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMaintenanceCallDataResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMaintenanceCallDataResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMaintenanceCallDataResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetMaintenanceCallDataResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/margin/margin_call/proto/v1/GetMaintenanceCallDataResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.margin.margin_call.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "microgram.contracts.margin.margin_call.proto.v1.GetMaintenanceCallDataResponseDto";
        }
    }
}
