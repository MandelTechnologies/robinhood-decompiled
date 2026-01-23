package bonfire.proto.idl.acats.p027v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.acats.p027v1.AcatsTransferHubBottomSheetDetailsDto;
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

/* compiled from: GetAcatsTransferHubBottomSheetResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate;)V", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "bottom_sheet_details", "(Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;)V", "toProto", "()Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate;", "getBottom_sheet_details", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetAcatsTransferHubBottomSheetResponseDto implements Dto3<GetAcatsTransferHubBottomSheetResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAcatsTransferHubBottomSheetResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAcatsTransferHubBottomSheetResponseDto, GetAcatsTransferHubBottomSheetResponse>> binaryBase64Serializer$delegate;
    private static final GetAcatsTransferHubBottomSheetResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAcatsTransferHubBottomSheetResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAcatsTransferHubBottomSheetResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AcatsTransferHubBottomSheetDetailsDto getBottom_sheet_details() {
        return this.surrogate.getBottom_sheet_details();
    }

    public GetAcatsTransferHubBottomSheetResponseDto(AcatsTransferHubBottomSheetDetailsDto acatsTransferHubBottomSheetDetailsDto) {
        this(new Surrogate(acatsTransferHubBottomSheetDetailsDto));
    }

    public /* synthetic */ GetAcatsTransferHubBottomSheetResponseDto(AcatsTransferHubBottomSheetDetailsDto acatsTransferHubBottomSheetDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : acatsTransferHubBottomSheetDetailsDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAcatsTransferHubBottomSheetResponse toProto() {
        AcatsTransferHubBottomSheetDetailsDto bottom_sheet_details = this.surrogate.getBottom_sheet_details();
        return new GetAcatsTransferHubBottomSheetResponse(bottom_sheet_details != null ? bottom_sheet_details.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[GetAcatsTransferHubBottomSheetResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAcatsTransferHubBottomSheetResponseDto) && Intrinsics.areEqual(((GetAcatsTransferHubBottomSheetResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAcatsTransferHubBottomSheetResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate;", "", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "bottom_sheet_details", "<init>", "(Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_acats_v1_externalRelease", "(Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "getBottom_sheet_details", "()Lbonfire/proto/idl/acats/v1/AcatsTransferHubBottomSheetDetailsDto;", "getBottom_sheet_details$annotations", "()V", "Companion", "$serializer", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AcatsTransferHubBottomSheetDetailsDto bottom_sheet_details;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((AcatsTransferHubBottomSheetDetailsDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.bottom_sheet_details, ((Surrogate) other).bottom_sheet_details);
        }

        public int hashCode() {
            AcatsTransferHubBottomSheetDetailsDto acatsTransferHubBottomSheetDetailsDto = this.bottom_sheet_details;
            if (acatsTransferHubBottomSheetDetailsDto == null) {
                return 0;
            }
            return acatsTransferHubBottomSheetDetailsDto.hashCode();
        }

        public String toString() {
            return "Surrogate(bottom_sheet_details=" + this.bottom_sheet_details + ")";
        }

        /* compiled from: GetAcatsTransferHubBottomSheetResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate;", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAcatsTransferHubBottomSheetResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AcatsTransferHubBottomSheetDetailsDto acatsTransferHubBottomSheetDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.bottom_sheet_details = null;
            } else {
                this.bottom_sheet_details = acatsTransferHubBottomSheetDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_acats_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            AcatsTransferHubBottomSheetDetailsDto acatsTransferHubBottomSheetDetailsDto = self.bottom_sheet_details;
            if (acatsTransferHubBottomSheetDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, AcatsTransferHubBottomSheetDetailsDto.Serializer.INSTANCE, acatsTransferHubBottomSheetDetailsDto);
            }
        }

        public Surrogate(AcatsTransferHubBottomSheetDetailsDto acatsTransferHubBottomSheetDetailsDto) {
            this.bottom_sheet_details = acatsTransferHubBottomSheetDetailsDto;
        }

        public /* synthetic */ Surrogate(AcatsTransferHubBottomSheetDetailsDto acatsTransferHubBottomSheetDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : acatsTransferHubBottomSheetDetailsDto);
        }

        public final AcatsTransferHubBottomSheetDetailsDto getBottom_sheet_details() {
            return this.bottom_sheet_details;
        }
    }

    /* compiled from: GetAcatsTransferHubBottomSheetResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAcatsTransferHubBottomSheetResponseDto, GetAcatsTransferHubBottomSheetResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAcatsTransferHubBottomSheetResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAcatsTransferHubBottomSheetResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAcatsTransferHubBottomSheetResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAcatsTransferHubBottomSheetResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAcatsTransferHubBottomSheetResponse> getProtoAdapter() {
            return GetAcatsTransferHubBottomSheetResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAcatsTransferHubBottomSheetResponseDto getZeroValue() {
            return GetAcatsTransferHubBottomSheetResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAcatsTransferHubBottomSheetResponseDto fromProto(GetAcatsTransferHubBottomSheetResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AcatsTransferHubBottomSheetDetails bottom_sheet_details = proto.getBottom_sheet_details();
            return new GetAcatsTransferHubBottomSheetResponseDto(new Surrogate(bottom_sheet_details != null ? AcatsTransferHubBottomSheetDetailsDto.INSTANCE.fromProto(bottom_sheet_details) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.acats.v1.GetAcatsTransferHubBottomSheetResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAcatsTransferHubBottomSheetResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAcatsTransferHubBottomSheetResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAcatsTransferHubBottomSheetResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAcatsTransferHubBottomSheetResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.acats.v1.GetAcatsTransferHubBottomSheetResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAcatsTransferHubBottomSheetResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAcatsTransferHubBottomSheetResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAcatsTransferHubBottomSheetResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetAcatsTransferHubBottomSheetResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/acats/v1/GetAcatsTransferHubBottomSheetResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.acats.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.acats.v1.GetAcatsTransferHubBottomSheetResponseDto";
        }
    }
}
