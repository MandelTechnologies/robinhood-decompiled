package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.AgreementStatusDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAgreementResponseDto;
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

/* compiled from: GetAgreementResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Lbff_money_movement/service/v1/GetAgreementResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetAgreementResponse;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate;)V", "Lbff_money_movement/service/v1/AgreementStatusDto;", "agreement_status", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "agreement_response", "(Lbff_money_movement/service/v1/AgreementStatusDto;Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;)V", "toProto", "()Lbff_money_movement/service/v1/GetAgreementResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate;", "getAgreement_status", "()Lbff_money_movement/service/v1/AgreementStatusDto;", "getAgreement_response", "()Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetAgreementResponseDto implements Dto3<GetAgreementResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetAgreementResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetAgreementResponseDto, GetAgreementResponse>> binaryBase64Serializer$delegate;
    private static final GetAgreementResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetAgreementResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetAgreementResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AgreementStatusDto getAgreement_status() {
        return this.surrogate.getAgreement_status();
    }

    public final InvestmentsTrackerGetAgreementResponseDto getAgreement_response() {
        return this.surrogate.getAgreement_response();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetAgreementResponseDto(AgreementStatusDto agreement_status, InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto) {
        this(new Surrogate(agreement_status, investmentsTrackerGetAgreementResponseDto));
        Intrinsics.checkNotNullParameter(agreement_status, "agreement_status");
    }

    public /* synthetic */ GetAgreementResponseDto(AgreementStatusDto agreementStatusDto, InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AgreementStatusDto.INSTANCE.getZeroValue() : agreementStatusDto, (i & 2) != 0 ? null : investmentsTrackerGetAgreementResponseDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetAgreementResponse toProto() {
        AgreementStatus agreementStatus = (AgreementStatus) this.surrogate.getAgreement_status().toProto();
        InvestmentsTrackerGetAgreementResponseDto agreement_response = this.surrogate.getAgreement_response();
        return new GetAgreementResponse(agreementStatus, agreement_response != null ? agreement_response.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetAgreementResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetAgreementResponseDto) && Intrinsics.areEqual(((GetAgreementResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetAgreementResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate;", "", "Lbff_money_movement/service/v1/AgreementStatusDto;", "agreement_status", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "agreement_response", "<init>", "(Lbff_money_movement/service/v1/AgreementStatusDto;Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/AgreementStatusDto;Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/AgreementStatusDto;", "getAgreement_status", "()Lbff_money_movement/service/v1/AgreementStatusDto;", "getAgreement_status$annotations", "()V", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "getAgreement_response", "()Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "getAgreement_response$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final InvestmentsTrackerGetAgreementResponseDto agreement_response;
        private final AgreementStatusDto agreement_status;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((AgreementStatusDto) null, (InvestmentsTrackerGetAgreementResponseDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.agreement_status == surrogate.agreement_status && Intrinsics.areEqual(this.agreement_response, surrogate.agreement_response);
        }

        public int hashCode() {
            int iHashCode = this.agreement_status.hashCode() * 31;
            InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto = this.agreement_response;
            return iHashCode + (investmentsTrackerGetAgreementResponseDto == null ? 0 : investmentsTrackerGetAgreementResponseDto.hashCode());
        }

        public String toString() {
            return "Surrogate(agreement_status=" + this.agreement_status + ", agreement_response=" + this.agreement_response + ")";
        }

        /* compiled from: GetAgreementResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetAgreementResponseDto3.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AgreementStatusDto agreementStatusDto, InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.agreement_status = (i & 1) == 0 ? AgreementStatusDto.INSTANCE.getZeroValue() : agreementStatusDto;
            if ((i & 2) == 0) {
                this.agreement_response = null;
            } else {
                this.agreement_response = investmentsTrackerGetAgreementResponseDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.agreement_status != AgreementStatusDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, AgreementStatusDto.Serializer.INSTANCE, self.agreement_status);
            }
            InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto = self.agreement_response;
            if (investmentsTrackerGetAgreementResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, InvestmentsTrackerGetAgreementResponseDto.Serializer.INSTANCE, investmentsTrackerGetAgreementResponseDto);
            }
        }

        public Surrogate(AgreementStatusDto agreement_status, InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto) {
            Intrinsics.checkNotNullParameter(agreement_status, "agreement_status");
            this.agreement_status = agreement_status;
            this.agreement_response = investmentsTrackerGetAgreementResponseDto;
        }

        public final AgreementStatusDto getAgreement_status() {
            return this.agreement_status;
        }

        public /* synthetic */ Surrogate(AgreementStatusDto agreementStatusDto, InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? AgreementStatusDto.INSTANCE.getZeroValue() : agreementStatusDto, (i & 2) != 0 ? null : investmentsTrackerGetAgreementResponseDto);
        }

        public final InvestmentsTrackerGetAgreementResponseDto getAgreement_response() {
            return this.agreement_response;
        }
    }

    /* compiled from: GetAgreementResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetAgreementResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetAgreementResponseDto;", "Lbff_money_movement/service/v1/GetAgreementResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetAgreementResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetAgreementResponseDto, GetAgreementResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetAgreementResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAgreementResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetAgreementResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetAgreementResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetAgreementResponse> getProtoAdapter() {
            return GetAgreementResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAgreementResponseDto getZeroValue() {
            return GetAgreementResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetAgreementResponseDto fromProto(GetAgreementResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AgreementStatusDto agreementStatusDtoFromProto = AgreementStatusDto.INSTANCE.fromProto(proto.getAgreement_status());
            InvestmentsTrackerGetAgreementResponse agreement_response = proto.getAgreement_response();
            return new GetAgreementResponseDto(new Surrogate(agreementStatusDtoFromProto, agreement_response != null ? InvestmentsTrackerGetAgreementResponseDto.INSTANCE.fromProto(agreement_response) : null), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetAgreementResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetAgreementResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetAgreementResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetAgreementResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetAgreementResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetAgreementResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetAgreementResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetAgreementResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetAgreementResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetAgreementResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetAgreementResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetAgreementResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetAgreementResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetAgreementResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetAgreementResponseDto";
        }
    }
}
