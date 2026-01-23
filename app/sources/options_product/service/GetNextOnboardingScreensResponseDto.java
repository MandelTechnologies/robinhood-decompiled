package options_product.service;

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
import options_product.service.OnboardingErrorResponseDto;
import options_product.service.OnboardingScreenListResponseDto;

/* compiled from: GetNextOnboardingScreensResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Loptions_product/service/GetNextOnboardingScreensResponse;", "Landroid/os/Parcelable;", "Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate;", "surrogate", "<init>", "(Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate;)V", "Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto;", "response", "(Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto;)V", "toProto", "()Loptions_product/service/GetNextOnboardingScreensResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate;", "getResponse", "()Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto;", "Companion", "Surrogate", "ResponseDto", "Serializer", "MultibindingModule", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetNextOnboardingScreensResponseDto implements Dto3<GetNextOnboardingScreensResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetNextOnboardingScreensResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetNextOnboardingScreensResponseDto, GetNextOnboardingScreensResponse>> binaryBase64Serializer$delegate;
    private static final GetNextOnboardingScreensResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetNextOnboardingScreensResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetNextOnboardingScreensResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ResponseDto getResponse() {
        if (this.surrogate.getScreen_response() != null) {
            return new ResponseDto.ScreenResponse(this.surrogate.getScreen_response());
        }
        if (this.surrogate.getError_response() != null) {
            return new ResponseDto.ErrorResponse(this.surrogate.getError_response());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetNextOnboardingScreensResponseDto(ResponseDto responseDto) {
        ResponseDto.ScreenResponse screenResponse = responseDto instanceof ResponseDto.ScreenResponse ? (ResponseDto.ScreenResponse) responseDto : null;
        OnboardingScreenListResponseDto value = screenResponse != null ? screenResponse.getValue() : null;
        ResponseDto.ErrorResponse errorResponse = responseDto instanceof ResponseDto.ErrorResponse ? (ResponseDto.ErrorResponse) responseDto : null;
        this(new Surrogate(value, errorResponse != null ? errorResponse.getValue() : null));
    }

    public /* synthetic */ GetNextOnboardingScreensResponseDto(ResponseDto responseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : responseDto);
    }

    @Override // com.robinhood.idl.Dto
    public GetNextOnboardingScreensResponse toProto() {
        OnboardingScreenListResponseDto screen_response = this.surrogate.getScreen_response();
        OnboardingScreenListResponse proto = screen_response != null ? screen_response.toProto() : null;
        OnboardingErrorResponseDto error_response = this.surrogate.getError_response();
        return new GetNextOnboardingScreensResponse(proto, error_response != null ? error_response.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetNextOnboardingScreensResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetNextOnboardingScreensResponseDto) && Intrinsics.areEqual(((GetNextOnboardingScreensResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetNextOnboardingScreensResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate;", "", "Loptions_product/service/OnboardingScreenListResponseDto;", "screen_response", "Loptions_product/service/OnboardingErrorResponseDto;", "error_response", "<init>", "(Loptions_product/service/OnboardingScreenListResponseDto;Loptions_product/service/OnboardingErrorResponseDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILoptions_product/service/OnboardingScreenListResponseDto;Loptions_product/service/OnboardingErrorResponseDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$options_product_service_v1_onboarding_externalRelease", "(Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/OnboardingScreenListResponseDto;", "getScreen_response", "()Loptions_product/service/OnboardingScreenListResponseDto;", "getScreen_response$annotations", "()V", "Loptions_product/service/OnboardingErrorResponseDto;", "getError_response", "()Loptions_product/service/OnboardingErrorResponseDto;", "getError_response$annotations", "Companion", "$serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OnboardingErrorResponseDto error_response;
        private final OnboardingScreenListResponseDto screen_response;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((OnboardingScreenListResponseDto) null, (OnboardingErrorResponseDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.screen_response, surrogate.screen_response) && Intrinsics.areEqual(this.error_response, surrogate.error_response);
        }

        public int hashCode() {
            OnboardingScreenListResponseDto onboardingScreenListResponseDto = this.screen_response;
            int iHashCode = (onboardingScreenListResponseDto == null ? 0 : onboardingScreenListResponseDto.hashCode()) * 31;
            OnboardingErrorResponseDto onboardingErrorResponseDto = this.error_response;
            return iHashCode + (onboardingErrorResponseDto != null ? onboardingErrorResponseDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(screen_response=" + this.screen_response + ", error_response=" + this.error_response + ")";
        }

        /* compiled from: GetNextOnboardingScreensResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetNextOnboardingScreensResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OnboardingScreenListResponseDto onboardingScreenListResponseDto, OnboardingErrorResponseDto onboardingErrorResponseDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.screen_response = null;
            } else {
                this.screen_response = onboardingScreenListResponseDto;
            }
            if ((i & 2) == 0) {
                this.error_response = null;
            } else {
                this.error_response = onboardingErrorResponseDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$options_product_service_v1_onboarding_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            OnboardingScreenListResponseDto onboardingScreenListResponseDto = self.screen_response;
            if (onboardingScreenListResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, OnboardingScreenListResponseDto.Serializer.INSTANCE, onboardingScreenListResponseDto);
            }
            OnboardingErrorResponseDto onboardingErrorResponseDto = self.error_response;
            if (onboardingErrorResponseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, OnboardingErrorResponseDto.Serializer.INSTANCE, onboardingErrorResponseDto);
            }
        }

        public Surrogate(OnboardingScreenListResponseDto onboardingScreenListResponseDto, OnboardingErrorResponseDto onboardingErrorResponseDto) {
            this.screen_response = onboardingScreenListResponseDto;
            this.error_response = onboardingErrorResponseDto;
        }

        public /* synthetic */ Surrogate(OnboardingScreenListResponseDto onboardingScreenListResponseDto, OnboardingErrorResponseDto onboardingErrorResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : onboardingScreenListResponseDto, (i & 2) != 0 ? null : onboardingErrorResponseDto);
        }

        public final OnboardingScreenListResponseDto getScreen_response() {
            return this.screen_response;
        }

        public final OnboardingErrorResponseDto getError_response() {
            return this.error_response;
        }
    }

    /* compiled from: GetNextOnboardingScreensResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Loptions_product/service/GetNextOnboardingScreensResponseDto;", "Loptions_product/service/GetNextOnboardingScreensResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Loptions_product/service/GetNextOnboardingScreensResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetNextOnboardingScreensResponseDto, GetNextOnboardingScreensResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNextOnboardingScreensResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNextOnboardingScreensResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNextOnboardingScreensResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetNextOnboardingScreensResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetNextOnboardingScreensResponse> getProtoAdapter() {
            return GetNextOnboardingScreensResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNextOnboardingScreensResponseDto getZeroValue() {
            return GetNextOnboardingScreensResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNextOnboardingScreensResponseDto fromProto(GetNextOnboardingScreensResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            OnboardingScreenListResponse screen_response = proto.getScreen_response();
            DefaultConstructorMarker defaultConstructorMarker = null;
            OnboardingScreenListResponseDto onboardingScreenListResponseDtoFromProto = screen_response != null ? OnboardingScreenListResponseDto.INSTANCE.fromProto(screen_response) : null;
            OnboardingErrorResponse error_response = proto.getError_response();
            return new GetNextOnboardingScreensResponseDto(new Surrogate(onboardingScreenListResponseDtoFromProto, error_response != null ? OnboardingErrorResponseDto.INSTANCE.fromProto(error_response) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: options_product.service.GetNextOnboardingScreensResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNextOnboardingScreensResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetNextOnboardingScreensResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetNextOnboardingScreensResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ScreenResponse", "ErrorResponse", "Companion", "Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto$ErrorResponse;", "Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto$ScreenResponse;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

        /* compiled from: GetNextOnboardingScreensResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto$ScreenResponse;", "Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto;", "Loptions_product/service/OnboardingScreenListResponseDto;", "value", "<init>", "(Loptions_product/service/OnboardingScreenListResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/OnboardingScreenListResponseDto;", "getValue", "()Loptions_product/service/OnboardingScreenListResponseDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ScreenResponse extends ResponseDto {
            private final OnboardingScreenListResponseDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ScreenResponse) && Intrinsics.areEqual(this.value, ((ScreenResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ScreenResponse(value=" + this.value + ")";
            }

            public final OnboardingScreenListResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenResponse(OnboardingScreenListResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetNextOnboardingScreensResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto$ErrorResponse;", "Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto;", "Loptions_product/service/OnboardingErrorResponseDto;", "value", "<init>", "(Loptions_product/service/OnboardingErrorResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Loptions_product/service/OnboardingErrorResponseDto;", "getValue", "()Loptions_product/service/OnboardingErrorResponseDto;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ErrorResponse extends ResponseDto {
            private final OnboardingErrorResponseDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ErrorResponse) && Intrinsics.areEqual(this.value, ((ErrorResponse) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ErrorResponse(value=" + this.value + ")";
            }

            public final OnboardingErrorResponseDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorResponse(OnboardingErrorResponseDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetNextOnboardingScreensResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Loptions_product/service/GetNextOnboardingScreensResponseDto$ResponseDto;", "Loptions_product/service/GetNextOnboardingScreensResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Companion implements Dto4.Creator<ResponseDto, GetNextOnboardingScreensResponse> {
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
            public ProtoAdapter<GetNextOnboardingScreensResponse> getProtoAdapter() {
                return GetNextOnboardingScreensResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResponseDto fromProto(GetNextOnboardingScreensResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getScreen_response() != null) {
                    return new ScreenResponse(OnboardingScreenListResponseDto.INSTANCE.fromProto(proto.getScreen_response()));
                }
                if (proto.getError_response() != null) {
                    return new ErrorResponse(OnboardingErrorResponseDto.INSTANCE.fromProto(proto.getError_response()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetNextOnboardingScreensResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Loptions_product/service/GetNextOnboardingScreensResponseDto;", "<init>", "()V", "surrogateSerializer", "Loptions_product/service/GetNextOnboardingScreensResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<GetNextOnboardingScreensResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/options_product.service.GetNextOnboardingScreensResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetNextOnboardingScreensResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetNextOnboardingScreensResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetNextOnboardingScreensResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetNextOnboardingScreensResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "options_product.service.GetNextOnboardingScreensResponseDto";
        }
    }
}
