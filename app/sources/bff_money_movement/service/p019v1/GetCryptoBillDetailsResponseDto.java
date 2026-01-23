package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.AlertDto;
import bff_money_movement.service.p019v1.BillErrorDto;
import bff_money_movement.service.p019v1.BillStateDto;
import bff_money_movement.service.p019v1.CryptoMetaDataDto;
import bff_money_movement.service.p019v1.DCFMetaDataDto;
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

/* compiled from: GetCryptoBillDetailsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006+*,-./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u00060"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponse;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate;)V", "Lbff_money_movement/service/v1/BillStateDto;", "state", "Lbff_money_movement/service/v1/AlertDto;", "error_alert", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto;", "interruption_metadata", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto;", "result", "(Lbff_money_movement/service/v1/BillStateDto;Lbff_money_movement/service/v1/AlertDto;Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto;Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto;)V", "toProto", "()Lbff_money_movement/service/v1/GetCryptoBillDetailsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate;", "getInterruption_metadata", "()Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto;", "getResult", "()Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto;", "Companion", "Surrogate", "InterruptionMetadataDto", "ResultDto", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class GetCryptoBillDetailsResponseDto implements Dto3<GetCryptoBillDetailsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetCryptoBillDetailsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetCryptoBillDetailsResponseDto, GetCryptoBillDetailsResponse>> binaryBase64Serializer$delegate;
    private static final GetCryptoBillDetailsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetCryptoBillDetailsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetCryptoBillDetailsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final InterruptionMetadataDto getInterruption_metadata() {
        if (this.surrogate.getDcf_metadata() != null) {
            return new InterruptionMetadataDto.DcfMetadata(this.surrogate.getDcf_metadata());
        }
        return null;
    }

    public final ResultDto getResult() {
        if (this.surrogate.getSuccess() != null) {
            return new ResultDto.Success(this.surrogate.getSuccess());
        }
        if (this.surrogate.getError() != null) {
            return new ResultDto.Error(this.surrogate.getError());
        }
        return null;
    }

    public /* synthetic */ GetCryptoBillDetailsResponseDto(BillStateDto billStateDto, AlertDto alertDto, InterruptionMetadataDto interruptionMetadataDto, ResultDto resultDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BillStateDto.INSTANCE.getZeroValue() : billStateDto, (i & 2) != 0 ? null : alertDto, (i & 4) != 0 ? null : interruptionMetadataDto, (i & 8) != 0 ? null : resultDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetCryptoBillDetailsResponseDto(BillStateDto state, AlertDto alertDto, InterruptionMetadataDto interruptionMetadataDto, ResultDto resultDto) {
        Intrinsics.checkNotNullParameter(state, "state");
        InterruptionMetadataDto.DcfMetadata dcfMetadata = interruptionMetadataDto instanceof InterruptionMetadataDto.DcfMetadata ? (InterruptionMetadataDto.DcfMetadata) interruptionMetadataDto : null;
        DCFMetaDataDto value = dcfMetadata != null ? dcfMetadata.getValue() : null;
        ResultDto.Success success = resultDto instanceof ResultDto.Success ? (ResultDto.Success) resultDto : null;
        CryptoMetaDataDto value2 = success != null ? success.getValue() : null;
        ResultDto.Error error = resultDto instanceof ResultDto.Error ? (ResultDto.Error) resultDto : null;
        this(new Surrogate(state, alertDto, value, value2, error != null ? error.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetCryptoBillDetailsResponse toProto() {
        BillState billState = (BillState) this.surrogate.getState().toProto();
        AlertDto error_alert = this.surrogate.getError_alert();
        Alert proto = error_alert != null ? error_alert.toProto() : null;
        DCFMetaDataDto dcf_metadata = this.surrogate.getDcf_metadata();
        DCFMetaData proto2 = dcf_metadata != null ? dcf_metadata.toProto() : null;
        CryptoMetaDataDto success = this.surrogate.getSuccess();
        CryptoMetaData proto3 = success != null ? success.toProto() : null;
        BillErrorDto error = this.surrogate.getError();
        return new GetCryptoBillDetailsResponse(billState, proto2, proto3, error != null ? (BillError) error.toProto() : null, proto, null, 32, null);
    }

    public String toString() {
        return "[GetCryptoBillDetailsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetCryptoBillDetailsResponseDto) && Intrinsics.areEqual(((GetCryptoBillDetailsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetCryptoBillDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b-\u0010)\u001a\u0004\b+\u0010,R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00102\u0012\u0004\b5\u0010)\u001a\u0004\b3\u00104R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate;", "", "Lbff_money_movement/service/v1/BillStateDto;", "state", "Lbff_money_movement/service/v1/AlertDto;", "error_alert", "Lbff_money_movement/service/v1/DCFMetaDataDto;", "dcf_metadata", "Lbff_money_movement/service/v1/CryptoMetaDataDto;", "success", "Lbff_money_movement/service/v1/BillErrorDto;", "error", "<init>", "(Lbff_money_movement/service/v1/BillStateDto;Lbff_money_movement/service/v1/AlertDto;Lbff_money_movement/service/v1/DCFMetaDataDto;Lbff_money_movement/service/v1/CryptoMetaDataDto;Lbff_money_movement/service/v1/BillErrorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/BillStateDto;Lbff_money_movement/service/v1/AlertDto;Lbff_money_movement/service/v1/DCFMetaDataDto;Lbff_money_movement/service/v1/CryptoMetaDataDto;Lbff_money_movement/service/v1/BillErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/BillStateDto;", "getState", "()Lbff_money_movement/service/v1/BillStateDto;", "getState$annotations", "()V", "Lbff_money_movement/service/v1/AlertDto;", "getError_alert", "()Lbff_money_movement/service/v1/AlertDto;", "getError_alert$annotations", "Lbff_money_movement/service/v1/DCFMetaDataDto;", "getDcf_metadata", "()Lbff_money_movement/service/v1/DCFMetaDataDto;", "getDcf_metadata$annotations", "Lbff_money_movement/service/v1/CryptoMetaDataDto;", "getSuccess", "()Lbff_money_movement/service/v1/CryptoMetaDataDto;", "getSuccess$annotations", "Lbff_money_movement/service/v1/BillErrorDto;", "getError", "()Lbff_money_movement/service/v1/BillErrorDto;", "getError$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DCFMetaDataDto dcf_metadata;
        private final BillErrorDto error;
        private final AlertDto error_alert;
        private final BillStateDto state;
        private final CryptoMetaDataDto success;

        public Surrogate() {
            this((BillStateDto) null, (AlertDto) null, (DCFMetaDataDto) null, (CryptoMetaDataDto) null, (BillErrorDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && Intrinsics.areEqual(this.error_alert, surrogate.error_alert) && Intrinsics.areEqual(this.dcf_metadata, surrogate.dcf_metadata) && Intrinsics.areEqual(this.success, surrogate.success) && this.error == surrogate.error;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            AlertDto alertDto = this.error_alert;
            int iHashCode2 = (iHashCode + (alertDto == null ? 0 : alertDto.hashCode())) * 31;
            DCFMetaDataDto dCFMetaDataDto = this.dcf_metadata;
            int iHashCode3 = (iHashCode2 + (dCFMetaDataDto == null ? 0 : dCFMetaDataDto.hashCode())) * 31;
            CryptoMetaDataDto cryptoMetaDataDto = this.success;
            int iHashCode4 = (iHashCode3 + (cryptoMetaDataDto == null ? 0 : cryptoMetaDataDto.hashCode())) * 31;
            BillErrorDto billErrorDto = this.error;
            return iHashCode4 + (billErrorDto != null ? billErrorDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", error_alert=" + this.error_alert + ", dcf_metadata=" + this.dcf_metadata + ", success=" + this.success + ", error=" + this.error + ")";
        }

        /* compiled from: GetCryptoBillDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetCryptoBillDetailsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, BillStateDto billStateDto, AlertDto alertDto, DCFMetaDataDto dCFMetaDataDto, CryptoMetaDataDto cryptoMetaDataDto, BillErrorDto billErrorDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? BillStateDto.INSTANCE.getZeroValue() : billStateDto;
            if ((i & 2) == 0) {
                this.error_alert = null;
            } else {
                this.error_alert = alertDto;
            }
            if ((i & 4) == 0) {
                this.dcf_metadata = null;
            } else {
                this.dcf_metadata = dCFMetaDataDto;
            }
            if ((i & 8) == 0) {
                this.success = null;
            } else {
                this.success = cryptoMetaDataDto;
            }
            if ((i & 16) == 0) {
                this.error = null;
            } else {
                this.error = billErrorDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != BillStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, BillStateDto.Serializer.INSTANCE, self.state);
            }
            AlertDto alertDto = self.error_alert;
            if (alertDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, AlertDto.Serializer.INSTANCE, alertDto);
            }
            DCFMetaDataDto dCFMetaDataDto = self.dcf_metadata;
            if (dCFMetaDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, DCFMetaDataDto.Serializer.INSTANCE, dCFMetaDataDto);
            }
            CryptoMetaDataDto cryptoMetaDataDto = self.success;
            if (cryptoMetaDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, CryptoMetaDataDto.Serializer.INSTANCE, cryptoMetaDataDto);
            }
            BillErrorDto billErrorDto = self.error;
            if (billErrorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BillErrorDto.Serializer.INSTANCE, billErrorDto);
            }
        }

        public Surrogate(BillStateDto state, AlertDto alertDto, DCFMetaDataDto dCFMetaDataDto, CryptoMetaDataDto cryptoMetaDataDto, BillErrorDto billErrorDto) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
            this.error_alert = alertDto;
            this.dcf_metadata = dCFMetaDataDto;
            this.success = cryptoMetaDataDto;
            this.error = billErrorDto;
        }

        public final BillStateDto getState() {
            return this.state;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(bff_money_movement.service.p019v1.BillStateDto r2, bff_money_movement.service.p019v1.AlertDto r3, bff_money_movement.service.p019v1.DCFMetaDataDto r4, bff_money_movement.service.p019v1.CryptoMetaDataDto r5, bff_money_movement.service.p019v1.BillErrorDto r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto La
                bff_money_movement.service.v1.BillStateDto$Companion r2 = bff_money_movement.service.p019v1.BillStateDto.INSTANCE
                bff_money_movement.service.v1.BillStateDto r2 = r2.getZeroValue()
            La:
                r8 = r7 & 2
                r0 = 0
                if (r8 == 0) goto L10
                r3 = r0
            L10:
                r8 = r7 & 4
                if (r8 == 0) goto L15
                r4 = r0
            L15:
                r8 = r7 & 8
                if (r8 == 0) goto L1a
                r5 = r0
            L1a:
                r7 = r7 & 16
                if (r7 == 0) goto L25
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2b
            L25:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2b:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bff_money_movement.service.p019v1.GetCryptoBillDetailsResponseDto.Surrogate.<init>(bff_money_movement.service.v1.BillStateDto, bff_money_movement.service.v1.AlertDto, bff_money_movement.service.v1.DCFMetaDataDto, bff_money_movement.service.v1.CryptoMetaDataDto, bff_money_movement.service.v1.BillErrorDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final AlertDto getError_alert() {
            return this.error_alert;
        }

        public final DCFMetaDataDto getDcf_metadata() {
            return this.dcf_metadata;
        }

        public final CryptoMetaDataDto getSuccess() {
            return this.success;
        }

        public final BillErrorDto getError() {
            return this.error;
        }
    }

    /* compiled from: GetCryptoBillDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetCryptoBillDetailsResponseDto, GetCryptoBillDetailsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetCryptoBillDetailsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoBillDetailsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetCryptoBillDetailsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetCryptoBillDetailsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetCryptoBillDetailsResponse> getProtoAdapter() {
            return GetCryptoBillDetailsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoBillDetailsResponseDto getZeroValue() {
            return GetCryptoBillDetailsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetCryptoBillDetailsResponseDto fromProto(GetCryptoBillDetailsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            BillStateDto billStateDtoFromProto = BillStateDto.INSTANCE.fromProto(proto.getState());
            Alert error_alert = proto.getError_alert();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AlertDto alertDtoFromProto = error_alert != null ? AlertDto.INSTANCE.fromProto(error_alert) : null;
            DCFMetaData dcf_metadata = proto.getDcf_metadata();
            DCFMetaDataDto dCFMetaDataDtoFromProto = dcf_metadata != null ? DCFMetaDataDto.INSTANCE.fromProto(dcf_metadata) : null;
            CryptoMetaData success = proto.getSuccess();
            CryptoMetaDataDto cryptoMetaDataDtoFromProto = success != null ? CryptoMetaDataDto.INSTANCE.fromProto(success) : null;
            BillError error = proto.getError();
            return new GetCryptoBillDetailsResponseDto(new Surrogate(billStateDtoFromProto, alertDtoFromProto, dCFMetaDataDtoFromProto, cryptoMetaDataDtoFromProto, error != null ? BillErrorDto.INSTANCE.fromProto(error) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetCryptoBillDetailsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetCryptoBillDetailsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetCryptoBillDetailsResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetCryptoBillDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "DcfMetadata", "Companion", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto$DcfMetadata;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class InterruptionMetadataDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ InterruptionMetadataDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private InterruptionMetadataDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: GetCryptoBillDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto$DcfMetadata;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto;", "Lbff_money_movement/service/v1/DCFMetaDataDto;", "value", "<init>", "(Lbff_money_movement/service/v1/DCFMetaDataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/DCFMetaDataDto;", "getValue", "()Lbff_money_movement/service/v1/DCFMetaDataDto;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DcfMetadata extends InterruptionMetadataDto {
            private final DCFMetaDataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DcfMetadata) && Intrinsics.areEqual(this.value, ((DcfMetadata) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "DcfMetadata(value=" + this.value + ")";
            }

            public final DCFMetaDataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DcfMetadata(DCFMetaDataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetCryptoBillDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$InterruptionMetadataDto;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<InterruptionMetadataDto, GetCryptoBillDetailsResponse> {
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
            public ProtoAdapter<GetCryptoBillDetailsResponse> getProtoAdapter() {
                return GetCryptoBillDetailsResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InterruptionMetadataDto fromProto(GetCryptoBillDetailsResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getDcf_metadata() != null) {
                    return new DcfMetadata(DCFMetaDataDto.INSTANCE.fromProto(proto.getDcf_metadata()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetCryptoBillDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Success", "Error", "Companion", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto$Error;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto$Success;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ResultDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ResultDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ResultDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: GetCryptoBillDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto$Success;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto;", "Lbff_money_movement/service/v1/CryptoMetaDataDto;", "value", "<init>", "(Lbff_money_movement/service/v1/CryptoMetaDataDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/CryptoMetaDataDto;", "getValue", "()Lbff_money_movement/service/v1/CryptoMetaDataDto;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends ResultDto {
            private final CryptoMetaDataDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Success(value=" + this.value + ")";
            }

            public final CryptoMetaDataDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(CryptoMetaDataDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetCryptoBillDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto$Error;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto;", "Lbff_money_movement/service/v1/BillErrorDto;", "value", "<init>", "(Lbff_money_movement/service/v1/BillErrorDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/BillErrorDto;", "getValue", "()Lbff_money_movement/service/v1/BillErrorDto;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends ResultDto {
            private final BillErrorDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.value == ((Error) other).value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Error(value=" + this.value + ")";
            }

            public final BillErrorDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(BillErrorDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetCryptoBillDetailsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$ResultDto;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ResultDto, GetCryptoBillDetailsResponse> {
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
            public ProtoAdapter<GetCryptoBillDetailsResponse> getProtoAdapter() {
                return GetCryptoBillDetailsResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResultDto fromProto(GetCryptoBillDetailsResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSuccess() != null) {
                    return new Success(CryptoMetaDataDto.INSTANCE.fromProto(proto.getSuccess()));
                }
                if (proto.getError() != null) {
                    return new Error(BillErrorDto.INSTANCE.fromProto(proto.getError()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetCryptoBillDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetCryptoBillDetailsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetCryptoBillDetailsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetCryptoBillDetailsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetCryptoBillDetailsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetCryptoBillDetailsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetCryptoBillDetailsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetCryptoBillDetailsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetCryptoBillDetailsResponseDto";
        }
    }
}
