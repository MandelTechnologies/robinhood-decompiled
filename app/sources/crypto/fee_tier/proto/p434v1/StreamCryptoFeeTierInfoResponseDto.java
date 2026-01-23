package crypto.fee_tier.proto.p434v1;

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
import crypto.fee_tier.proto.p434v1.StreamCryptoFeeTierInfoErrorResponseDto;
import crypto.fee_tier.proto.p434v1.StreamCryptoFeeTierInfoSuccessResponseDto;
import crypto.fee_tier.proto.p434v1.StreamCryptoFeeTierInfoSuccessResponseV2Dto;
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

/* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponse;", "Landroid/os/Parcelable;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate;", "surrogate", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate;)V", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto;", "response", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto;)V", "toProto", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate;", "Companion", "Surrogate", "ResponseDto", "Serializer", "MultibindingModule", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class StreamCryptoFeeTierInfoResponseDto implements Dto3<StreamCryptoFeeTierInfoResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamCryptoFeeTierInfoResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamCryptoFeeTierInfoResponseDto, StreamCryptoFeeTierInfoResponse>> binaryBase64Serializer$delegate;
    private static final StreamCryptoFeeTierInfoResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamCryptoFeeTierInfoResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamCryptoFeeTierInfoResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StreamCryptoFeeTierInfoResponseDto(ResponseDto responseDto) {
        ResponseDto.Success success = responseDto instanceof ResponseDto.Success ? (ResponseDto.Success) responseDto : null;
        StreamCryptoFeeTierInfoSuccessResponseDto value = success != null ? success.getValue() : null;
        ResponseDto.Error error = responseDto instanceof ResponseDto.Error ? (ResponseDto.Error) responseDto : null;
        StreamCryptoFeeTierInfoErrorResponseDto value2 = error != null ? error.getValue() : null;
        ResponseDto.SuccessV2 successV2 = responseDto instanceof ResponseDto.SuccessV2 ? (ResponseDto.SuccessV2) responseDto : null;
        this(new Surrogate(value, value2, successV2 != null ? successV2.getValue() : null));
    }

    public /* synthetic */ StreamCryptoFeeTierInfoResponseDto(ResponseDto responseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : responseDto);
    }

    @Override // com.robinhood.idl.Dto
    public StreamCryptoFeeTierInfoResponse toProto() {
        StreamCryptoFeeTierInfoSuccessResponseDto success = this.surrogate.getSuccess();
        StreamCryptoFeeTierInfoSuccessResponse proto = success != null ? success.toProto() : null;
        StreamCryptoFeeTierInfoErrorResponseDto error = this.surrogate.getError();
        StreamCryptoFeeTierInfoErrorResponse proto2 = error != null ? error.toProto() : null;
        StreamCryptoFeeTierInfoSuccessResponseV2Dto success_v2 = this.surrogate.getSuccess_v2();
        return new StreamCryptoFeeTierInfoResponse(proto, proto2, success_v2 != null ? success_v2.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[StreamCryptoFeeTierInfoResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamCryptoFeeTierInfoResponseDto) && Intrinsics.areEqual(((StreamCryptoFeeTierInfoResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate;", "", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "success", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;", "error", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;", "success_v2", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_fee_tier_proto_v1_externalRelease", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "getSuccess", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "getSuccess$annotations", "()V", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;", "getError", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;", "getError$annotations", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;", "getSuccess_v2", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;", "getSuccess_v2$annotations", "Companion", "$serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final StreamCryptoFeeTierInfoErrorResponseDto error;
        private final StreamCryptoFeeTierInfoSuccessResponseDto success;
        private final StreamCryptoFeeTierInfoSuccessResponseV2Dto success_v2;

        public Surrogate() {
            this((StreamCryptoFeeTierInfoSuccessResponseDto) null, (StreamCryptoFeeTierInfoErrorResponseDto) null, (StreamCryptoFeeTierInfoSuccessResponseV2Dto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.success, surrogate.success) && Intrinsics.areEqual(this.error, surrogate.error) && Intrinsics.areEqual(this.success_v2, surrogate.success_v2);
        }

        public int hashCode() {
            StreamCryptoFeeTierInfoSuccessResponseDto streamCryptoFeeTierInfoSuccessResponseDto = this.success;
            int iHashCode = (streamCryptoFeeTierInfoSuccessResponseDto == null ? 0 : streamCryptoFeeTierInfoSuccessResponseDto.hashCode()) * 31;
            StreamCryptoFeeTierInfoErrorResponseDto streamCryptoFeeTierInfoErrorResponseDto = this.error;
            int iHashCode2 = (iHashCode + (streamCryptoFeeTierInfoErrorResponseDto == null ? 0 : streamCryptoFeeTierInfoErrorResponseDto.hashCode())) * 31;
            StreamCryptoFeeTierInfoSuccessResponseV2Dto streamCryptoFeeTierInfoSuccessResponseV2Dto = this.success_v2;
            return iHashCode2 + (streamCryptoFeeTierInfoSuccessResponseV2Dto != null ? streamCryptoFeeTierInfoSuccessResponseV2Dto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(success=" + this.success + ", error=" + this.error + ", success_v2=" + this.success_v2 + ")";
        }

        /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamCryptoFeeTierInfoResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, StreamCryptoFeeTierInfoSuccessResponseDto streamCryptoFeeTierInfoSuccessResponseDto, StreamCryptoFeeTierInfoErrorResponseDto streamCryptoFeeTierInfoErrorResponseDto, StreamCryptoFeeTierInfoSuccessResponseV2Dto streamCryptoFeeTierInfoSuccessResponseV2Dto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.success = null;
            } else {
                this.success = streamCryptoFeeTierInfoSuccessResponseDto;
            }
            if ((i & 2) == 0) {
                this.error = null;
            } else {
                this.error = streamCryptoFeeTierInfoErrorResponseDto;
            }
            if ((i & 4) == 0) {
                this.success_v2 = null;
            } else {
                this.success_v2 = streamCryptoFeeTierInfoSuccessResponseV2Dto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_fee_tier_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            StreamCryptoFeeTierInfoSuccessResponseDto streamCryptoFeeTierInfoSuccessResponseDto = self.success;
            if (streamCryptoFeeTierInfoSuccessResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StreamCryptoFeeTierInfoSuccessResponseDto.Serializer.INSTANCE, streamCryptoFeeTierInfoSuccessResponseDto);
            }
            StreamCryptoFeeTierInfoErrorResponseDto streamCryptoFeeTierInfoErrorResponseDto = self.error;
            if (streamCryptoFeeTierInfoErrorResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StreamCryptoFeeTierInfoErrorResponseDto.Serializer.INSTANCE, streamCryptoFeeTierInfoErrorResponseDto);
            }
            StreamCryptoFeeTierInfoSuccessResponseV2Dto streamCryptoFeeTierInfoSuccessResponseV2Dto = self.success_v2;
            if (streamCryptoFeeTierInfoSuccessResponseV2Dto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StreamCryptoFeeTierInfoSuccessResponseV2Dto.Serializer.INSTANCE, streamCryptoFeeTierInfoSuccessResponseV2Dto);
            }
        }

        public Surrogate(StreamCryptoFeeTierInfoSuccessResponseDto streamCryptoFeeTierInfoSuccessResponseDto, StreamCryptoFeeTierInfoErrorResponseDto streamCryptoFeeTierInfoErrorResponseDto, StreamCryptoFeeTierInfoSuccessResponseV2Dto streamCryptoFeeTierInfoSuccessResponseV2Dto) {
            this.success = streamCryptoFeeTierInfoSuccessResponseDto;
            this.error = streamCryptoFeeTierInfoErrorResponseDto;
            this.success_v2 = streamCryptoFeeTierInfoSuccessResponseV2Dto;
        }

        public /* synthetic */ Surrogate(StreamCryptoFeeTierInfoSuccessResponseDto streamCryptoFeeTierInfoSuccessResponseDto, StreamCryptoFeeTierInfoErrorResponseDto streamCryptoFeeTierInfoErrorResponseDto, StreamCryptoFeeTierInfoSuccessResponseV2Dto streamCryptoFeeTierInfoSuccessResponseV2Dto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : streamCryptoFeeTierInfoSuccessResponseDto, (i & 2) != 0 ? null : streamCryptoFeeTierInfoErrorResponseDto, (i & 4) != 0 ? null : streamCryptoFeeTierInfoSuccessResponseV2Dto);
        }

        public final StreamCryptoFeeTierInfoSuccessResponseDto getSuccess() {
            return this.success;
        }

        public final StreamCryptoFeeTierInfoErrorResponseDto getError() {
            return this.error;
        }

        public final StreamCryptoFeeTierInfoSuccessResponseV2Dto getSuccess_v2() {
            return this.success_v2;
        }
    }

    /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamCryptoFeeTierInfoResponseDto, StreamCryptoFeeTierInfoResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamCryptoFeeTierInfoResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoFeeTierInfoResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoFeeTierInfoResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamCryptoFeeTierInfoResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamCryptoFeeTierInfoResponse> getProtoAdapter() {
            return StreamCryptoFeeTierInfoResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoFeeTierInfoResponseDto getZeroValue() {
            return StreamCryptoFeeTierInfoResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoFeeTierInfoResponseDto fromProto(StreamCryptoFeeTierInfoResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StreamCryptoFeeTierInfoSuccessResponse success = proto.getSuccess();
            DefaultConstructorMarker defaultConstructorMarker = null;
            StreamCryptoFeeTierInfoSuccessResponseDto streamCryptoFeeTierInfoSuccessResponseDtoFromProto = success != null ? StreamCryptoFeeTierInfoSuccessResponseDto.INSTANCE.fromProto(success) : null;
            StreamCryptoFeeTierInfoErrorResponse error = proto.getError();
            StreamCryptoFeeTierInfoErrorResponseDto streamCryptoFeeTierInfoErrorResponseDtoFromProto = error != null ? StreamCryptoFeeTierInfoErrorResponseDto.INSTANCE.fromProto(error) : null;
            StreamCryptoFeeTierInfoSuccessResponseV2 success_v2 = proto.getSuccess_v2();
            return new StreamCryptoFeeTierInfoResponseDto(new Surrogate(streamCryptoFeeTierInfoSuccessResponseDtoFromProto, streamCryptoFeeTierInfoErrorResponseDtoFromProto, success_v2 != null ? StreamCryptoFeeTierInfoSuccessResponseV2Dto.INSTANCE.fromProto(success_v2) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamCryptoFeeTierInfoResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamCryptoFeeTierInfoResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Success", "Error", "SuccessV2", "Companion", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto$Error;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto$Success;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto$SuccessV2;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class ResponseDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ ResponseDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ResponseDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto$Success;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "value", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "getValue", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseDto;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends ResponseDto {
            private final StreamCryptoFeeTierInfoSuccessResponseDto value;

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

            public final StreamCryptoFeeTierInfoSuccessResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(StreamCryptoFeeTierInfoSuccessResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto$Error;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;", "value", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;", "getValue", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoErrorResponseDto;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error extends ResponseDto {
            private final StreamCryptoFeeTierInfoErrorResponseDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.value, ((Error) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Error(value=" + this.value + ")";
            }

            public final StreamCryptoFeeTierInfoErrorResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(StreamCryptoFeeTierInfoErrorResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto$SuccessV2;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;", "value", "<init>", "(Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;", "getValue", "()Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoSuccessResponseV2Dto;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SuccessV2 extends ResponseDto {
            private final StreamCryptoFeeTierInfoSuccessResponseV2Dto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SuccessV2) && Intrinsics.areEqual(this.value, ((SuccessV2) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SuccessV2(value=" + this.value + ")";
            }

            public final StreamCryptoFeeTierInfoSuccessResponseV2Dto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessV2(StreamCryptoFeeTierInfoSuccessResponseV2Dto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$ResponseDto;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<ResponseDto, StreamCryptoFeeTierInfoResponse> {
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
            public ProtoAdapter<StreamCryptoFeeTierInfoResponse> getProtoAdapter() {
                return StreamCryptoFeeTierInfoResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResponseDto fromProto(StreamCryptoFeeTierInfoResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSuccess() != null) {
                    return new Success(StreamCryptoFeeTierInfoSuccessResponseDto.INSTANCE.fromProto(proto.getSuccess()));
                }
                if (proto.getError() != null) {
                    return new Error(StreamCryptoFeeTierInfoErrorResponseDto.INSTANCE.fromProto(proto.getError()));
                }
                if (proto.getSuccess_v2() != null) {
                    return new SuccessV2(StreamCryptoFeeTierInfoSuccessResponseV2Dto.INSTANCE.fromProto(proto.getSuccess_v2()));
                }
                return null;
            }
        }
    }

    /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamCryptoFeeTierInfoResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamCryptoFeeTierInfoResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamCryptoFeeTierInfoResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamCryptoFeeTierInfoResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamCryptoFeeTierInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/StreamCryptoFeeTierInfoResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "crypto.fee_tier.proto.v1.StreamCryptoFeeTierInfoResponseDto";
        }
    }
}
