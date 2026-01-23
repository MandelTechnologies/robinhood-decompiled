package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.GetTransferEligibilityResponse;
import bff_money_movement.service.p019v1.GetTransferEligibilityResponseDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: GetTransferEligibilityResponseDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0012¨\u0006)"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate;)V", "", "is_eligible", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "failure_reason", "", "localized_message", "(ZLbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;Ljava/lang/String;)V", "toProto", "()Lbff_money_movement/service/v1/GetTransferEligibilityResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate;", "()Z", "getLocalized_message", "Companion", "Surrogate", "FailureReasonDto", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetTransferEligibilityResponseDto implements Dto3<GetTransferEligibilityResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTransferEligibilityResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTransferEligibilityResponseDto, GetTransferEligibilityResponse>> binaryBase64Serializer$delegate;
    private static final GetTransferEligibilityResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTransferEligibilityResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTransferEligibilityResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean is_eligible() {
        return this.surrogate.getIs_eligible();
    }

    public final String getLocalized_message() {
        return this.surrogate.getLocalized_message();
    }

    public /* synthetic */ GetTransferEligibilityResponseDto(boolean z, FailureReasonDto failureReasonDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? FailureReasonDto.INSTANCE.getZeroValue() : failureReasonDto, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTransferEligibilityResponseDto(boolean z, FailureReasonDto failure_reason, String str) {
        this(new Surrogate(z, failure_reason, str));
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetTransferEligibilityResponse toProto() {
        return new GetTransferEligibilityResponse(this.surrogate.getIs_eligible(), (GetTransferEligibilityResponse.FailureReason) this.surrogate.getFailure_reason().toProto(), this.surrogate.getLocalized_message(), null, 8, null);
    }

    public String toString() {
        return "[GetTransferEligibilityResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTransferEligibilityResponseDto) && Intrinsics.areEqual(((GetTransferEligibilityResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTransferEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\b\u0083\b\u0018\u0000 *2\u00020\u0001:\u0002+*B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u0003\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b)\u0010\"\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate;", "", "", "is_eligible", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "failure_reason", "", "localized_message", "<init>", "(ZLbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "is_eligible$annotations", "()V", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "getFailure_reason", "()Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "getFailure_reason$annotations", "Ljava/lang/String;", "getLocalized_message", "getLocalized_message$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FailureReasonDto failure_reason;
        private final boolean is_eligible;
        private final String localized_message;

        public Surrogate() {
            this(false, (FailureReasonDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.is_eligible == surrogate.is_eligible && this.failure_reason == surrogate.failure_reason && Intrinsics.areEqual(this.localized_message, surrogate.localized_message);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.is_eligible) * 31) + this.failure_reason.hashCode()) * 31;
            String str = this.localized_message;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Surrogate(is_eligible=" + this.is_eligible + ", failure_reason=" + this.failure_reason + ", localized_message=" + this.localized_message + ")";
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTransferEligibilityResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, FailureReasonDto failureReasonDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.is_eligible = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.failure_reason = FailureReasonDto.INSTANCE.getZeroValue();
            } else {
                this.failure_reason = failureReasonDto;
            }
            if ((i & 4) == 0) {
                this.localized_message = null;
            } else {
                this.localized_message = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.is_eligible;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (self.failure_reason != FailureReasonDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, FailureReasonDto.Serializer.INSTANCE, self.failure_reason);
            }
            String str = self.localized_message;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(boolean z, FailureReasonDto failure_reason, String str) {
            Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
            this.is_eligible = z;
            this.failure_reason = failure_reason;
            this.localized_message = str;
        }

        /* renamed from: is_eligible, reason: from getter */
        public final boolean getIs_eligible() {
            return this.is_eligible;
        }

        public final FailureReasonDto getFailure_reason() {
            return this.failure_reason;
        }

        public /* synthetic */ Surrogate(boolean z, FailureReasonDto failureReasonDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? FailureReasonDto.INSTANCE.getZeroValue() : failureReasonDto, (i & 4) != 0 ? null : str);
        }

        public final String getLocalized_message() {
            return this.localized_message;
        }
    }

    /* compiled from: GetTransferEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetTransferEligibilityResponseDto, GetTransferEligibilityResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTransferEligibilityResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTransferEligibilityResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTransferEligibilityResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTransferEligibilityResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTransferEligibilityResponse> getProtoAdapter() {
            return GetTransferEligibilityResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTransferEligibilityResponseDto getZeroValue() {
            return GetTransferEligibilityResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTransferEligibilityResponseDto fromProto(GetTransferEligibilityResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetTransferEligibilityResponseDto(new Surrogate(proto.getIs_eligible(), FailureReasonDto.INSTANCE.fromProto(proto.getFailure_reason()), proto.getLocalized_message()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetTransferEligibilityResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTransferEligibilityResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetTransferEligibilityResponseDto(false, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetTransferEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0015"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "FAILURE_REASON_UNSPECIFIED", "OTHER", "EXCEEDS_DAILY_AMOUNT_LIMIT", "EXCEEDS_DAILY_COUNT_LIMIT", "BANK_SPECIFIC", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class FailureReasonDto implements Dto2<GetTransferEligibilityResponse.FailureReason>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FailureReasonDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<FailureReasonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<FailureReasonDto, GetTransferEligibilityResponse.FailureReason>> binaryBase64Serializer$delegate;
        public static final FailureReasonDto FAILURE_REASON_UNSPECIFIED = new FAILURE_REASON_UNSPECIFIED("FAILURE_REASON_UNSPECIFIED", 0);
        public static final FailureReasonDto OTHER = new OTHER("OTHER", 1);
        public static final FailureReasonDto EXCEEDS_DAILY_AMOUNT_LIMIT = new EXCEEDS_DAILY_AMOUNT_LIMIT("EXCEEDS_DAILY_AMOUNT_LIMIT", 2);
        public static final FailureReasonDto EXCEEDS_DAILY_COUNT_LIMIT = new EXCEEDS_DAILY_COUNT_LIMIT("EXCEEDS_DAILY_COUNT_LIMIT", 3);
        public static final FailureReasonDto BANK_SPECIFIC = new BANK_SPECIFIC("BANK_SPECIFIC", 4);

        private static final /* synthetic */ FailureReasonDto[] $values() {
            return new FailureReasonDto[]{FAILURE_REASON_UNSPECIFIED, OTHER, EXCEEDS_DAILY_AMOUNT_LIMIT, EXCEEDS_DAILY_COUNT_LIMIT, BANK_SPECIFIC};
        }

        public /* synthetic */ FailureReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<FailureReasonDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private FailureReasonDto(String str, int i) {
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_money_movement/service/v1/GetTransferEligibilityResponseDto.FailureReasonDto.FAILURE_REASON_UNSPECIFIED", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "toProto", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILURE_REASON_UNSPECIFIED extends FailureReasonDto {
            FAILURE_REASON_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetTransferEligibilityResponse.FailureReason toProto() {
                return GetTransferEligibilityResponse.FailureReason.FAILURE_REASON_UNSPECIFIED;
            }
        }

        static {
            FailureReasonDto[] failureReasonDtoArr$values = $values();
            $VALUES = failureReasonDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(failureReasonDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetTransferEligibilityResponseDto$FailureReasonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetTransferEligibilityResponseDto.FailureReasonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_money_movement/service/v1/GetTransferEligibilityResponseDto.FailureReasonDto.OTHER", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "toProto", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OTHER extends FailureReasonDto {
            OTHER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetTransferEligibilityResponse.FailureReason toProto() {
                return GetTransferEligibilityResponse.FailureReason.OTHER;
            }
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_money_movement/service/v1/GetTransferEligibilityResponseDto.FailureReasonDto.EXCEEDS_DAILY_AMOUNT_LIMIT", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "toProto", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXCEEDS_DAILY_AMOUNT_LIMIT extends FailureReasonDto {
            EXCEEDS_DAILY_AMOUNT_LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetTransferEligibilityResponse.FailureReason toProto() {
                return GetTransferEligibilityResponse.FailureReason.EXCEEDS_DAILY_AMOUNT_LIMIT;
            }
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_money_movement/service/v1/GetTransferEligibilityResponseDto.FailureReasonDto.EXCEEDS_DAILY_COUNT_LIMIT", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "toProto", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EXCEEDS_DAILY_COUNT_LIMIT extends FailureReasonDto {
            EXCEEDS_DAILY_COUNT_LIMIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetTransferEligibilityResponse.FailureReason toProto() {
                return GetTransferEligibilityResponse.FailureReason.EXCEEDS_DAILY_COUNT_LIMIT;
            }
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bff_money_movement/service/v1/GetTransferEligibilityResponseDto.FailureReasonDto.BANK_SPECIFIC", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "toProto", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BANK_SPECIFIC extends FailureReasonDto {
            BANK_SPECIFIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public GetTransferEligibilityResponse.FailureReason toProto() {
                return GetTransferEligibilityResponse.FailureReason.BANK_SPECIFIC;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponse$FailureReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<FailureReasonDto, GetTransferEligibilityResponse.FailureReason> {

            /* compiled from: GetTransferEligibilityResponseDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes16.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[GetTransferEligibilityResponse.FailureReason.values().length];
                    try {
                        iArr[GetTransferEligibilityResponse.FailureReason.FAILURE_REASON_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[GetTransferEligibilityResponse.FailureReason.OTHER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[GetTransferEligibilityResponse.FailureReason.EXCEEDS_DAILY_AMOUNT_LIMIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[GetTransferEligibilityResponse.FailureReason.EXCEEDS_DAILY_COUNT_LIMIT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[GetTransferEligibilityResponse.FailureReason.BANK_SPECIFIC.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<FailureReasonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FailureReasonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<FailureReasonDto> getBinaryBase64Serializer() {
                return (KSerializer) FailureReasonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetTransferEligibilityResponse.FailureReason> getProtoAdapter() {
                return GetTransferEligibilityResponse.FailureReason.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FailureReasonDto getZeroValue() {
                return FailureReasonDto.FAILURE_REASON_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public FailureReasonDto fromProto(GetTransferEligibilityResponse.FailureReason proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return FailureReasonDto.FAILURE_REASON_UNSPECIFIED;
                }
                if (i == 2) {
                    return FailureReasonDto.OTHER;
                }
                if (i == 3) {
                    return FailureReasonDto.EXCEEDS_DAILY_AMOUNT_LIMIT;
                }
                if (i == 4) {
                    return FailureReasonDto.EXCEEDS_DAILY_COUNT_LIMIT;
                }
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return FailureReasonDto.BANK_SPECIFIC;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetTransferEligibilityResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$FailureReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public static final class Serializer implements KSerializer<FailureReasonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<FailureReasonDto, GetTransferEligibilityResponse.FailureReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_money_movement.service.v1.GetTransferEligibilityResponse.FailureReason", FailureReasonDto.getEntries(), FailureReasonDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public FailureReasonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (FailureReasonDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, FailureReasonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static FailureReasonDto valueOf(String str) {
            return (FailureReasonDto) Enum.valueOf(FailureReasonDto.class, str);
        }

        public static FailureReasonDto[] values() {
            return (FailureReasonDto[]) $VALUES.clone();
        }
    }

    /* compiled from: GetTransferEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetTransferEligibilityResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetTransferEligibilityResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTransferEligibilityResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTransferEligibilityResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTransferEligibilityResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetTransferEligibilityResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetTransferEligibilityResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetTransferEligibilityResponseDto";
        }
    }
}
