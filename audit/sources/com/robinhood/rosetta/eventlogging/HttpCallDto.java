package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.HttpCall;
import com.robinhood.rosetta.eventlogging.HttpCallDto;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: HttpCallDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\n)*+,-./012B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0006\u0010\u0010J4\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Surrogate;)V", "outcome", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "request", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "response", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "error", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;)V", "getOutcome", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "getRequest", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "getResponse", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "getError", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OutcomeDto", "RequestDto", "ResponseDto", "ErrorDto", "MethodDto", "ProtocolDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class HttpCallDto implements Dto3<HttpCall>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<HttpCallDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HttpCallDto, HttpCall>> binaryBase64Serializer$delegate;
    private static final HttpCallDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ HttpCallDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HttpCallDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final OutcomeDto getOutcome() {
        return this.surrogate.getOutcome();
    }

    public final RequestDto getRequest() {
        return this.surrogate.getRequest();
    }

    public final ResponseDto getResponse() {
        return this.surrogate.getResponse();
    }

    public final ErrorDto getError() {
        return this.surrogate.getError();
    }

    public /* synthetic */ HttpCallDto(OutcomeDto outcomeDto, RequestDto requestDto, ResponseDto responseDto, ErrorDto errorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OutcomeDto.INSTANCE.getZeroValue() : outcomeDto, (i & 2) != 0 ? null : requestDto, (i & 4) != 0 ? null : responseDto, (i & 8) != 0 ? null : errorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpCallDto(OutcomeDto outcome, RequestDto requestDto, ResponseDto responseDto, ErrorDto errorDto) {
        this(new Surrogate(outcome, requestDto, responseDto, errorDto));
        Intrinsics.checkNotNullParameter(outcome, "outcome");
    }

    public static /* synthetic */ HttpCallDto copy$default(HttpCallDto httpCallDto, OutcomeDto outcomeDto, RequestDto requestDto, ResponseDto responseDto, ErrorDto errorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            outcomeDto = httpCallDto.surrogate.getOutcome();
        }
        if ((i & 2) != 0) {
            requestDto = httpCallDto.surrogate.getRequest();
        }
        if ((i & 4) != 0) {
            responseDto = httpCallDto.surrogate.getResponse();
        }
        if ((i & 8) != 0) {
            errorDto = httpCallDto.surrogate.getError();
        }
        return httpCallDto.copy(outcomeDto, requestDto, responseDto, errorDto);
    }

    public final HttpCallDto copy(OutcomeDto outcome, RequestDto request, ResponseDto response, ErrorDto error) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        return new HttpCallDto(new Surrogate(outcome, request, response, error));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public HttpCall toProto() {
        HttpCall.Outcome outcome = (HttpCall.Outcome) this.surrogate.getOutcome().toProto();
        RequestDto request = this.surrogate.getRequest();
        HttpCall.Request proto = request != null ? request.toProto() : null;
        ResponseDto response = this.surrogate.getResponse();
        HttpCall.Response proto2 = response != null ? response.toProto() : null;
        ErrorDto error = this.surrogate.getError();
        return new HttpCall(outcome, proto, proto2, error != null ? error.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[HttpCallDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof HttpCallDto) && Intrinsics.areEqual(((HttpCallDto) other).surrogate, this.surrogate);
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
    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00063"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Surrogate;", "", "outcome", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "request", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "response", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "error", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOutcome$annotations", "()V", "getOutcome", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "getRequest$annotations", "getRequest", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "getResponse$annotations", "getResponse", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "getError$annotations", "getError", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ErrorDto error;
        private final OutcomeDto outcome;
        private final RequestDto request;
        private final ResponseDto response;

        public Surrogate() {
            this((OutcomeDto) null, (RequestDto) null, (ResponseDto) null, (ErrorDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, OutcomeDto outcomeDto, RequestDto requestDto, ResponseDto responseDto, ErrorDto errorDto, int i, Object obj) {
            if ((i & 1) != 0) {
                outcomeDto = surrogate.outcome;
            }
            if ((i & 2) != 0) {
                requestDto = surrogate.request;
            }
            if ((i & 4) != 0) {
                responseDto = surrogate.response;
            }
            if ((i & 8) != 0) {
                errorDto = surrogate.error;
            }
            return surrogate.copy(outcomeDto, requestDto, responseDto, errorDto);
        }

        @SerialName("error")
        @JsonAnnotations2(names = {"error"})
        public static /* synthetic */ void getError$annotations() {
        }

        @SerialName("outcome")
        @JsonAnnotations2(names = {"outcome"})
        public static /* synthetic */ void getOutcome$annotations() {
        }

        @SerialName("request")
        @JsonAnnotations2(names = {"request"})
        public static /* synthetic */ void getRequest$annotations() {
        }

        @SerialName("response")
        @JsonAnnotations2(names = {"response"})
        public static /* synthetic */ void getResponse$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final OutcomeDto getOutcome() {
            return this.outcome;
        }

        /* renamed from: component2, reason: from getter */
        public final RequestDto getRequest() {
            return this.request;
        }

        /* renamed from: component3, reason: from getter */
        public final ResponseDto getResponse() {
            return this.response;
        }

        /* renamed from: component4, reason: from getter */
        public final ErrorDto getError() {
            return this.error;
        }

        public final Surrogate copy(OutcomeDto outcome, RequestDto request, ResponseDto response, ErrorDto error) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            return new Surrogate(outcome, request, response, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.outcome == surrogate.outcome && Intrinsics.areEqual(this.request, surrogate.request) && Intrinsics.areEqual(this.response, surrogate.response) && Intrinsics.areEqual(this.error, surrogate.error);
        }

        public int hashCode() {
            int iHashCode = this.outcome.hashCode() * 31;
            RequestDto requestDto = this.request;
            int iHashCode2 = (iHashCode + (requestDto == null ? 0 : requestDto.hashCode())) * 31;
            ResponseDto responseDto = this.response;
            int iHashCode3 = (iHashCode2 + (responseDto == null ? 0 : responseDto.hashCode())) * 31;
            ErrorDto errorDto = this.error;
            return iHashCode3 + (errorDto != null ? errorDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(outcome=" + this.outcome + ", request=" + this.request + ", response=" + this.response + ", error=" + this.error + ")";
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return HttpCallDto5.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OutcomeDto outcomeDto, RequestDto requestDto, ResponseDto responseDto, ErrorDto errorDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.outcome = (i & 1) == 0 ? OutcomeDto.INSTANCE.getZeroValue() : outcomeDto;
            if ((i & 2) == 0) {
                this.request = null;
            } else {
                this.request = requestDto;
            }
            if ((i & 4) == 0) {
                this.response = null;
            } else {
                this.response = responseDto;
            }
            if ((i & 8) == 0) {
                this.error = null;
            } else {
                this.error = errorDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.outcome != OutcomeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, OutcomeDto.Serializer.INSTANCE, self.outcome);
            }
            RequestDto requestDto = self.request;
            if (requestDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, RequestDto.Serializer.INSTANCE, requestDto);
            }
            ResponseDto responseDto = self.response;
            if (responseDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ResponseDto.Serializer.INSTANCE, responseDto);
            }
            ErrorDto errorDto = self.error;
            if (errorDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ErrorDto.Serializer.INSTANCE, errorDto);
            }
        }

        public Surrogate(OutcomeDto outcome, RequestDto requestDto, ResponseDto responseDto, ErrorDto errorDto) {
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            this.outcome = outcome;
            this.request = requestDto;
            this.response = responseDto;
            this.error = errorDto;
        }

        public final OutcomeDto getOutcome() {
            return this.outcome;
        }

        public /* synthetic */ Surrogate(OutcomeDto outcomeDto, RequestDto requestDto, ResponseDto responseDto, ErrorDto errorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? OutcomeDto.INSTANCE.getZeroValue() : outcomeDto, (i & 2) != 0 ? null : requestDto, (i & 4) != 0 ? null : responseDto, (i & 8) != 0 ? null : errorDto);
        }

        public final RequestDto getRequest() {
            return this.request;
        }

        public final ResponseDto getResponse() {
            return this.response;
        }

        public final ErrorDto getError() {
            return this.error;
        }
    }

    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<HttpCallDto, HttpCall> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HttpCallDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HttpCallDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HttpCallDto> getBinaryBase64Serializer() {
            return (KSerializer) HttpCallDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HttpCall> getProtoAdapter() {
            return HttpCall.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HttpCallDto getZeroValue() {
            return HttpCallDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HttpCallDto fromProto(HttpCall proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            OutcomeDto outcomeDtoFromProto = OutcomeDto.INSTANCE.fromProto(proto.getOutcome());
            HttpCall.Request request = proto.getRequest();
            DefaultConstructorMarker defaultConstructorMarker = null;
            RequestDto requestDtoFromProto = request != null ? RequestDto.INSTANCE.fromProto(request) : null;
            HttpCall.Response response = proto.getResponse();
            ResponseDto responseDtoFromProto = response != null ? ResponseDto.INSTANCE.fromProto(response) : null;
            HttpCall.Error error = proto.getError();
            return new HttpCallDto(new Surrogate(outcomeDtoFromProto, requestDtoFromProto, responseDtoFromProto, error != null ? ErrorDto.INSTANCE.fromProto(error) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HttpCallDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new HttpCallDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "OUTCOME_UNSPECIFIED", "COMPLETED", "FAILED", "CANCELED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OutcomeDto implements Dto2<HttpCall.Outcome>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OutcomeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OutcomeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OutcomeDto, HttpCall.Outcome>> binaryBase64Serializer$delegate;
        public static final OutcomeDto OUTCOME_UNSPECIFIED = new OUTCOME_UNSPECIFIED("OUTCOME_UNSPECIFIED", 0);
        public static final OutcomeDto COMPLETED = new COMPLETED("COMPLETED", 1);
        public static final OutcomeDto FAILED = new FAILED("FAILED", 2);
        public static final OutcomeDto CANCELED = new CANCELED("CANCELED", 3);

        private static final /* synthetic */ OutcomeDto[] $values() {
            return new OutcomeDto[]{OUTCOME_UNSPECIFIED, COMPLETED, FAILED, CANCELED};
        }

        public /* synthetic */ OutcomeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OutcomeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.OutcomeDto.OUTCOME_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OUTCOME_UNSPECIFIED extends OutcomeDto {
            OUTCOME_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Outcome toProto() {
                return HttpCall.Outcome.OUTCOME_UNSPECIFIED;
            }
        }

        private OutcomeDto(String str, int i) {
        }

        static {
            OutcomeDto[] outcomeDtoArr$values = $values();
            $VALUES = outcomeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(outcomeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$OutcomeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HttpCallDto.OutcomeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.OutcomeDto.COMPLETED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class COMPLETED extends OutcomeDto {
            COMPLETED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Outcome toProto() {
                return HttpCall.Outcome.COMPLETED;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.OutcomeDto.FAILED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FAILED extends OutcomeDto {
            FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Outcome toProto() {
                return HttpCall.Outcome.FAILED;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.OutcomeDto.CANCELED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED extends OutcomeDto {
            CANCELED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Outcome toProto() {
                return HttpCall.Outcome.CANCELED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Outcome;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OutcomeDto, HttpCall.Outcome> {

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HttpCall.Outcome.values().length];
                    try {
                        iArr[HttpCall.Outcome.OUTCOME_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HttpCall.Outcome.COMPLETED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HttpCall.Outcome.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[HttpCall.Outcome.CANCELED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OutcomeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OutcomeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OutcomeDto> getBinaryBase64Serializer() {
                return (KSerializer) OutcomeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HttpCall.Outcome> getProtoAdapter() {
                return HttpCall.Outcome.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OutcomeDto getZeroValue() {
                return OutcomeDto.OUTCOME_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OutcomeDto fromProto(HttpCall.Outcome proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OutcomeDto.OUTCOME_UNSPECIFIED;
                }
                if (i == 2) {
                    return OutcomeDto.COMPLETED;
                }
                if (i == 3) {
                    return OutcomeDto.FAILED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return OutcomeDto.CANCELED;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$OutcomeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OutcomeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OutcomeDto, HttpCall.Outcome> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.HttpCall.Outcome", OutcomeDto.getEntries(), OutcomeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OutcomeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OutcomeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OutcomeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OutcomeDto valueOf(String str) {
            return (OutcomeDto) Enum.valueOf(OutcomeDto.class, str);
        }

        public static OutcomeDto[] values() {
            return (OutcomeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004 !\"#B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Request;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Surrogate;)V", "method", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "url", "", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;Ljava/lang/String;)V", "getMethod", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "getUrl", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RequestDto implements Dto3<HttpCall.Request>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<RequestDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RequestDto, HttpCall.Request>> binaryBase64Serializer$delegate;
        private static final RequestDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ RequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private RequestDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final MethodDto getMethod() {
            return this.surrogate.getMethod();
        }

        public final String getUrl() {
            return this.surrogate.getUrl();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public RequestDto(MethodDto method, String url) {
            this(new Surrogate(method, url));
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
        }

        public /* synthetic */ RequestDto(MethodDto methodDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MethodDto.INSTANCE.getZeroValue() : methodDto, (i & 2) != 0 ? "" : str);
        }

        public static /* synthetic */ RequestDto copy$default(RequestDto requestDto, MethodDto methodDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                methodDto = requestDto.surrogate.getMethod();
            }
            if ((i & 2) != 0) {
                str = requestDto.surrogate.getUrl();
            }
            return requestDto.copy(methodDto, str);
        }

        public final RequestDto copy(MethodDto method, String url) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(url, "url");
            return new RequestDto(new Surrogate(method, url));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public HttpCall.Request toProto() {
            return new HttpCall.Request((HttpCall.Method) this.surrogate.getMethod().toProto(), this.surrogate.getUrl(), null, 4, null);
        }

        public String toString() {
            return "[RequestDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof RequestDto) && Intrinsics.areEqual(((RequestDto) other).surrogate, this.surrogate);
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
        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Surrogate;", "", "method", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "url", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMethod$annotations", "()V", "getMethod", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "getUrl$annotations", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final MethodDto method;
            private final String url;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((MethodDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MethodDto methodDto, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    methodDto = surrogate.method;
                }
                if ((i & 2) != 0) {
                    str = surrogate.url;
                }
                return surrogate.copy(methodDto, str);
            }

            @SerialName("method")
            @JsonAnnotations2(names = {"method"})
            public static /* synthetic */ void getMethod$annotations() {
            }

            @SerialName("url")
            @JsonAnnotations2(names = {"url"})
            public static /* synthetic */ void getUrl$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final MethodDto getMethod() {
                return this.method;
            }

            /* renamed from: component2, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public final Surrogate copy(MethodDto method, String url) {
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(url, "url");
                return new Surrogate(method, url);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.method == surrogate.method && Intrinsics.areEqual(this.url, surrogate.url);
            }

            public int hashCode() {
                return (this.method.hashCode() * 31) + this.url.hashCode();
            }

            public String toString() {
                return "Surrogate(method=" + this.method + ", url=" + this.url + ")";
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return HttpCallDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, MethodDto methodDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
                this.method = (i & 1) == 0 ? MethodDto.INSTANCE.getZeroValue() : methodDto;
                if ((i & 2) == 0) {
                    this.url = "";
                } else {
                    this.url = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.method != MethodDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, MethodDto.Serializer.INSTANCE, self.method);
                }
                if (Intrinsics.areEqual(self.url, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 1, self.url);
            }

            public Surrogate(MethodDto method, String url) {
                Intrinsics.checkNotNullParameter(method, "method");
                Intrinsics.checkNotNullParameter(url, "url");
                this.method = method;
                this.url = url;
            }

            public final MethodDto getMethod() {
                return this.method;
            }

            public /* synthetic */ Surrogate(MethodDto methodDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? MethodDto.INSTANCE.getZeroValue() : methodDto, (i & 2) != 0 ? "" : str);
            }

            public final String getUrl() {
                return this.url;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Request;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<RequestDto, HttpCall.Request> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<RequestDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RequestDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RequestDto> getBinaryBase64Serializer() {
                return (KSerializer) RequestDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HttpCall.Request> getProtoAdapter() {
                return HttpCall.Request.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RequestDto getZeroValue() {
                return RequestDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RequestDto fromProto(HttpCall.Request proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new RequestDto(new Surrogate(MethodDto.INSTANCE.fromProto(proto.getMethod()), proto.getUrl()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$RequestDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HttpCallDto.RequestDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new RequestDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RequestDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.HttpCall.Request", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RequestDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public RequestDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new RequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$RequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4190_6)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.HttpCallDto$RequestDto";
            }
        }
    }

    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005'()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020\u000fH\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0016J\b\u0010&\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Surrogate;)V", "source", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "protocol", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "message", "", "code", "", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;Ljava/lang/String;I)V", "getSource", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "getProtocol", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "getMessage", "()Ljava/lang/String;", "getCode", "()I", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "SourceDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ResponseDto implements Dto3<HttpCall.Response>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ResponseDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ResponseDto, HttpCall.Response>> binaryBase64Serializer$delegate;
        private static final ResponseDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ResponseDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final SourceDto getSource() {
            return this.surrogate.getSource();
        }

        public final ProtocolDto getProtocol() {
            return this.surrogate.getProtocol();
        }

        public final String getMessage() {
            return this.surrogate.getMessage();
        }

        public final int getCode() {
            return this.surrogate.getCode();
        }

        public /* synthetic */ ResponseDto(SourceDto sourceDto, ProtocolDto protocolDto, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i2 & 2) != 0 ? ProtocolDto.INSTANCE.getZeroValue() : protocolDto, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? 0 : i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ResponseDto(SourceDto source, ProtocolDto protocol, String message, int i) {
            this(new Surrogate(source, protocol, message, i));
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public static /* synthetic */ ResponseDto copy$default(ResponseDto responseDto, SourceDto sourceDto, ProtocolDto protocolDto, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sourceDto = responseDto.surrogate.getSource();
            }
            if ((i2 & 2) != 0) {
                protocolDto = responseDto.surrogate.getProtocol();
            }
            if ((i2 & 4) != 0) {
                str = responseDto.surrogate.getMessage();
            }
            if ((i2 & 8) != 0) {
                i = responseDto.surrogate.getCode();
            }
            return responseDto.copy(sourceDto, protocolDto, str, i);
        }

        public final ResponseDto copy(SourceDto source, ProtocolDto protocol, String message, int code) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ResponseDto(new Surrogate(source, protocol, message, code));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public HttpCall.Response toProto() {
            return new HttpCall.Response((HttpCall.Response.Source) this.surrogate.getSource().toProto(), (HttpCall.Protocol) this.surrogate.getProtocol().toProto(), this.surrogate.getMessage(), this.surrogate.getCode(), null, 16, null);
        }

        public String toString() {
            return "[ResponseDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ResponseDto) && Intrinsics.areEqual(((ResponseDto) other).surrogate, this.surrogate);
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
        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000223B>\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b\r\u0010\u000eBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0018\u0010#\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003J@\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0017\b\u0002\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001J%\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001¢\u0006\u0002\b1R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u001cR+\u0010\b\u001a\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Surrogate;", "", "source", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "protocol", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "message", "", "code", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;Ljava/lang/String;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;Ljava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSource$annotations", "()V", "getSource", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "getProtocol$annotations", "getProtocol", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "getMessage$annotations", "getMessage", "()Ljava/lang/String;", "getCode$annotations", "getCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final int code;
            private final String message;
            private final ProtocolDto protocol;
            private final SourceDto source;

            public Surrogate() {
                this((SourceDto) null, (ProtocolDto) null, (String) null, 0, 15, (DefaultConstructorMarker) null);
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, SourceDto sourceDto, ProtocolDto protocolDto, String str, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    sourceDto = surrogate.source;
                }
                if ((i2 & 2) != 0) {
                    protocolDto = surrogate.protocol;
                }
                if ((i2 & 4) != 0) {
                    str = surrogate.message;
                }
                if ((i2 & 8) != 0) {
                    i = surrogate.code;
                }
                return surrogate.copy(sourceDto, protocolDto, str, i);
            }

            @SerialName("code")
            @JsonAnnotations2(names = {"code"})
            public static /* synthetic */ void getCode$annotations() {
            }

            @SerialName("message")
            @JsonAnnotations2(names = {"message"})
            public static /* synthetic */ void getMessage$annotations() {
            }

            @SerialName("protocol")
            @JsonAnnotations2(names = {"protocol"})
            public static /* synthetic */ void getProtocol$annotations() {
            }

            @SerialName("source")
            @JsonAnnotations2(names = {"source"})
            public static /* synthetic */ void getSource$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final SourceDto getSource() {
                return this.source;
            }

            /* renamed from: component2, reason: from getter */
            public final ProtocolDto getProtocol() {
                return this.protocol;
            }

            /* renamed from: component3, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            /* renamed from: component4, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            public final Surrogate copy(SourceDto source, ProtocolDto protocol, String message, int code) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(message, "message");
                return new Surrogate(source, protocol, message, code);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.source == surrogate.source && this.protocol == surrogate.protocol && Intrinsics.areEqual(this.message, surrogate.message) && this.code == surrogate.code;
            }

            public int hashCode() {
                return (((((this.source.hashCode() * 31) + this.protocol.hashCode()) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.code);
            }

            public String toString() {
                return "Surrogate(source=" + this.source + ", protocol=" + this.protocol + ", message=" + this.message + ", code=" + this.code + ")";
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return HttpCallDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, SourceDto sourceDto, ProtocolDto protocolDto, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
                this.source = (i & 1) == 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto;
                if ((i & 2) == 0) {
                    this.protocol = ProtocolDto.INSTANCE.getZeroValue();
                } else {
                    this.protocol = protocolDto;
                }
                if ((i & 4) == 0) {
                    this.message = "";
                } else {
                    this.message = str;
                }
                if ((i & 8) == 0) {
                    this.code = 0;
                } else {
                    this.code = i2;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.source != SourceDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, SourceDto.Serializer.INSTANCE, self.source);
                }
                if (self.protocol != ProtocolDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, ProtocolDto.Serializer.INSTANCE, self.protocol);
                }
                if (!Intrinsics.areEqual(self.message, "")) {
                    output.encodeStringElement(serialDesc, 2, self.message);
                }
                int i = self.code;
                if (i != 0) {
                    output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
                }
            }

            public Surrogate(SourceDto source, ProtocolDto protocol, String message, int i) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(protocol, "protocol");
                Intrinsics.checkNotNullParameter(message, "message");
                this.source = source;
                this.protocol = protocol;
                this.message = message;
                this.code = i;
            }

            public final SourceDto getSource() {
                return this.source;
            }

            public /* synthetic */ Surrogate(SourceDto sourceDto, ProtocolDto protocolDto, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? SourceDto.INSTANCE.getZeroValue() : sourceDto, (i2 & 2) != 0 ? ProtocolDto.INSTANCE.getZeroValue() : protocolDto, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? 0 : i);
            }

            public final ProtocolDto getProtocol() {
                return this.protocol;
            }

            public final String getMessage() {
                return this.message;
            }

            public final int getCode() {
                return this.code;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ResponseDto, HttpCall.Response> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ResponseDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResponseDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ResponseDto> getBinaryBase64Serializer() {
                return (KSerializer) ResponseDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HttpCall.Response> getProtoAdapter() {
                return HttpCall.Response.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResponseDto getZeroValue() {
                return ResponseDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ResponseDto fromProto(HttpCall.Response proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ResponseDto(new Surrogate(SourceDto.INSTANCE.fromProto(proto.getSource()), ProtocolDto.INSTANCE.fromProto(proto.getProtocol()), proto.getMessage(), proto.getCode()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$ResponseDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HttpCallDto.ResponseDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ResponseDto(null, null, null, 0, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE_UNSPECIFIED", "CACHE_ONLY", "NETWORK_ONLY", "CACHE_AND_NETWORK", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class SourceDto implements Dto2<HttpCall.Response.Source>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SourceDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<SourceDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SourceDto, HttpCall.Response.Source>> binaryBase64Serializer$delegate;
            public static final SourceDto SOURCE_UNSPECIFIED = new SOURCE_UNSPECIFIED("SOURCE_UNSPECIFIED", 0);
            public static final SourceDto CACHE_ONLY = new CACHE_ONLY("CACHE_ONLY", 1);
            public static final SourceDto NETWORK_ONLY = new NETWORK_ONLY("NETWORK_ONLY", 2);
            public static final SourceDto CACHE_AND_NETWORK = new CACHE_AND_NETWORK("CACHE_AND_NETWORK", 3);

            private static final /* synthetic */ SourceDto[] $values() {
                return new SourceDto[]{SOURCE_UNSPECIFIED, CACHE_ONLY, NETWORK_ONLY, CACHE_AND_NETWORK};
            }

            public /* synthetic */ SourceDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<SourceDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ResponseDto.SourceDto.SOURCE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class SOURCE_UNSPECIFIED extends SourceDto {
                SOURCE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Response.Source toProto() {
                    return HttpCall.Response.Source.SOURCE_UNSPECIFIED;
                }
            }

            private SourceDto(String str, int i) {
            }

            static {
                SourceDto[] sourceDtoArr$values = $values();
                $VALUES = sourceDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(sourceDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$ResponseDto$SourceDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HttpCallDto.ResponseDto.SourceDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ResponseDto.SourceDto.CACHE_ONLY", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class CACHE_ONLY extends SourceDto {
                CACHE_ONLY(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Response.Source toProto() {
                    return HttpCall.Response.Source.CACHE_ONLY;
                }
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ResponseDto.SourceDto.NETWORK_ONLY", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class NETWORK_ONLY extends SourceDto {
                NETWORK_ONLY(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Response.Source toProto() {
                    return HttpCall.Response.Source.NETWORK_ONLY;
                }
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ResponseDto.SourceDto.CACHE_AND_NETWORK", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class CACHE_AND_NETWORK extends SourceDto {
                CACHE_AND_NETWORK(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Response.Source toProto() {
                    return HttpCall.Response.Source.CACHE_AND_NETWORK;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Response$Source;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<SourceDto, HttpCall.Response.Source> {

                /* compiled from: HttpCallDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[HttpCall.Response.Source.values().length];
                        try {
                            iArr[HttpCall.Response.Source.SOURCE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[HttpCall.Response.Source.CACHE_ONLY.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[HttpCall.Response.Source.NETWORK_ONLY.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[HttpCall.Response.Source.CACHE_AND_NETWORK.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SourceDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SourceDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SourceDto> getBinaryBase64Serializer() {
                    return (KSerializer) SourceDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<HttpCall.Response.Source> getProtoAdapter() {
                    return HttpCall.Response.Source.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SourceDto getZeroValue() {
                    return SourceDto.SOURCE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SourceDto fromProto(HttpCall.Response.Source proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return SourceDto.SOURCE_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return SourceDto.CACHE_ONLY;
                    }
                    if (i == 3) {
                        return SourceDto.NETWORK_ONLY;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return SourceDto.CACHE_AND_NETWORK;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$SourceDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<SourceDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<SourceDto, HttpCall.Response.Source> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.HttpCall.Response.Source", SourceDto.getEntries(), SourceDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public SourceDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (SourceDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SourceDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static SourceDto valueOf(String str) {
                return (SourceDto) Enum.valueOf(SourceDto.class, str);
            }

            public static SourceDto[] values() {
                return (SourceDto[]) $VALUES.clone();
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ResponseDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.HttpCall.Response", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ResponseDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ResponseDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4184_0)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.HttpCallDto$ResponseDto";
            }
        }
    }

    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005 !\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Surrogate;)V", "type", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "message", "", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;Ljava/lang/String;)V", "getType", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "getMessage", "()Ljava/lang/String;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "TypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ErrorDto implements Dto3<HttpCall.Error>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ErrorDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ErrorDto, HttpCall.Error>> binaryBase64Serializer$delegate;
        private static final ErrorDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ErrorDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ErrorDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final TypeDto getType() {
            return this.surrogate.getType();
        }

        public final String getMessage() {
            return this.surrogate.getMessage();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ErrorDto(TypeDto type2, String message) {
            this(new Surrogate(type2, message));
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message, "message");
        }

        public /* synthetic */ ErrorDto(TypeDto typeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 2) != 0 ? "" : str);
        }

        public static /* synthetic */ ErrorDto copy$default(ErrorDto errorDto, TypeDto typeDto, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                typeDto = errorDto.surrogate.getType();
            }
            if ((i & 2) != 0) {
                str = errorDto.surrogate.getMessage();
            }
            return errorDto.copy(typeDto, str);
        }

        public final ErrorDto copy(TypeDto type2, String message) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorDto(new Surrogate(type2, message));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public HttpCall.Error toProto() {
            return new HttpCall.Error((HttpCall.Error.Type) this.surrogate.getType().toProto(), this.surrogate.getMessage(), null, 4, null);
        }

        public String toString() {
            return "[ErrorDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ErrorDto) && Intrinsics.areEqual(((ErrorDto) other).surrogate, this.surrogate);
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
        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Surrogate;", "", "type", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "message", "", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "getMessage$annotations", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String message;
            private final TypeDto type;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((TypeDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, TypeDto typeDto, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    typeDto = surrogate.type;
                }
                if ((i & 2) != 0) {
                    str = surrogate.message;
                }
                return surrogate.copy(typeDto, str);
            }

            @SerialName("message")
            @JsonAnnotations2(names = {"message"})
            public static /* synthetic */ void getMessage$annotations() {
            }

            @SerialName("type")
            @JsonAnnotations2(names = {"type"})
            public static /* synthetic */ void getType$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final TypeDto getType() {
                return this.type;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Surrogate copy(TypeDto type2, String message) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(message, "message");
                return new Surrogate(type2, message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return this.type == surrogate.type && Intrinsics.areEqual(this.message, surrogate.message);
            }

            public int hashCode() {
                return (this.type.hashCode() * 31) + this.message.hashCode();
            }

            public String toString() {
                return "Surrogate(type=" + this.type + ", message=" + this.message + ")";
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return HttpCallDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, TypeDto typeDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
                this.type = (i & 1) == 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto;
                if ((i & 2) == 0) {
                    this.message = "";
                } else {
                    this.message = str;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.type != TypeDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, TypeDto.Serializer.INSTANCE, self.type);
                }
                if (Intrinsics.areEqual(self.message, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 1, self.message);
            }

            public Surrogate(TypeDto type2, String message) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(message, "message");
                this.type = type2;
                this.message = message;
            }

            public final TypeDto getType() {
                return this.type;
            }

            public /* synthetic */ Surrogate(TypeDto typeDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? TypeDto.INSTANCE.getZeroValue() : typeDto, (i & 2) != 0 ? "" : str);
            }

            public final String getMessage() {
                return this.message;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ErrorDto, HttpCall.Error> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ErrorDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ErrorDto> getBinaryBase64Serializer() {
                return (KSerializer) ErrorDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HttpCall.Error> getProtoAdapter() {
                return HttpCall.Error.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorDto getZeroValue() {
                return ErrorDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ErrorDto fromProto(HttpCall.Error proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ErrorDto(new Surrogate(TypeDto.INSTANCE.fromProto(proto.getType()), proto.getMessage()), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$ErrorDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HttpCallDto.ErrorDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ErrorDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "GENERAL_IO", "GENERAL_TIMEOUT", "UNKNOWN_HOST", "CONNECT_FAILURE", "NO_ROUTE_TO_HOST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TypeDto implements Dto2<HttpCall.Error.Type>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<TypeDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TypeDto, HttpCall.Error.Type>> binaryBase64Serializer$delegate;
            public static final TypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
            public static final TypeDto GENERAL_IO = new GENERAL_IO("GENERAL_IO", 1);
            public static final TypeDto GENERAL_TIMEOUT = new GENERAL_TIMEOUT("GENERAL_TIMEOUT", 2);
            public static final TypeDto UNKNOWN_HOST = new UNKNOWN_HOST("UNKNOWN_HOST", 3);
            public static final TypeDto CONNECT_FAILURE = new CONNECT_FAILURE("CONNECT_FAILURE", 4);
            public static final TypeDto NO_ROUTE_TO_HOST = new NO_ROUTE_TO_HOST("NO_ROUTE_TO_HOST", 5);

            private static final /* synthetic */ TypeDto[] $values() {
                return new TypeDto[]{TYPE_UNSPECIFIED, GENERAL_IO, GENERAL_TIMEOUT, UNKNOWN_HOST, CONNECT_FAILURE, NO_ROUTE_TO_HOST};
            }

            public /* synthetic */ TypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<TypeDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ErrorDto.TypeDto.TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class TYPE_UNSPECIFIED extends TypeDto {
                TYPE_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Error.Type toProto() {
                    return HttpCall.Error.Type.TYPE_UNSPECIFIED;
                }
            }

            private TypeDto(String str, int i) {
            }

            static {
                TypeDto[] typeDtoArr$values = $values();
                $VALUES = typeDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(typeDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$ErrorDto$TypeDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HttpCallDto.ErrorDto.TypeDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ErrorDto.TypeDto.GENERAL_IO", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class GENERAL_IO extends TypeDto {
                GENERAL_IO(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Error.Type toProto() {
                    return HttpCall.Error.Type.GENERAL_IO;
                }
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ErrorDto.TypeDto.GENERAL_TIMEOUT", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class GENERAL_TIMEOUT extends TypeDto {
                GENERAL_TIMEOUT(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Error.Type toProto() {
                    return HttpCall.Error.Type.GENERAL_TIMEOUT;
                }
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ErrorDto.TypeDto.UNKNOWN_HOST", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class UNKNOWN_HOST extends TypeDto {
                UNKNOWN_HOST(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Error.Type toProto() {
                    return HttpCall.Error.Type.UNKNOWN_HOST;
                }
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ErrorDto.TypeDto.CONNECT_FAILURE", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class CONNECT_FAILURE extends TypeDto {
                CONNECT_FAILURE(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Error.Type toProto() {
                    return HttpCall.Error.Type.CONNECT_FAILURE;
                }
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ErrorDto.TypeDto.NO_ROUTE_TO_HOST", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class NO_ROUTE_TO_HOST extends TypeDto {
                NO_ROUTE_TO_HOST(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public HttpCall.Error.Type toProto() {
                    return HttpCall.Error.Type.NO_ROUTE_TO_HOST;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Error$Type;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<TypeDto, HttpCall.Error.Type> {

                /* compiled from: HttpCallDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes26.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[HttpCall.Error.Type.values().length];
                        try {
                            iArr[HttpCall.Error.Type.TYPE_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[HttpCall.Error.Type.GENERAL_IO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[HttpCall.Error.Type.GENERAL_TIMEOUT.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[HttpCall.Error.Type.UNKNOWN_HOST.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[HttpCall.Error.Type.CONNECT_FAILURE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[HttpCall.Error.Type.NO_ROUTE_TO_HOST.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TypeDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TypeDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TypeDto> getBinaryBase64Serializer() {
                    return (KSerializer) TypeDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<HttpCall.Error.Type> getProtoAdapter() {
                    return HttpCall.Error.Type.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto getZeroValue() {
                    return TypeDto.TYPE_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(HttpCall.Error.Type proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                        case 1:
                            return TypeDto.TYPE_UNSPECIFIED;
                        case 2:
                            return TypeDto.GENERAL_IO;
                        case 3:
                            return TypeDto.GENERAL_TIMEOUT;
                        case 4:
                            return TypeDto.UNKNOWN_HOST;
                        case 5:
                            return TypeDto.CONNECT_FAILURE;
                        case 6:
                            return TypeDto.NO_ROUTE_TO_HOST;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$TypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public static final class Serializer implements KSerializer<TypeDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<TypeDto, HttpCall.Error.Type> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.HttpCall.Error.Type", TypeDto.getEntries(), TypeDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public TypeDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (TypeDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TypeDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ErrorDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.HttpCall.Error", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ErrorDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ErrorDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ErrorDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ErrorDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "com.robinhood.rosetta.eventlogging.HttpCallDto$ErrorDto";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "METHOD_UNSPECIFIED", "GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD", "CONNECT", "TRACE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MethodDto implements Dto2<HttpCall.Method>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MethodDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MethodDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MethodDto, HttpCall.Method>> binaryBase64Serializer$delegate;
        public static final MethodDto METHOD_UNSPECIFIED = new METHOD_UNSPECIFIED("METHOD_UNSPECIFIED", 0);
        public static final MethodDto GET = new GET("GET", 1);
        public static final MethodDto POST = new POST("POST", 2);
        public static final MethodDto PUT = new PUT("PUT", 3);
        public static final MethodDto PATCH = new PATCH("PATCH", 4);
        public static final MethodDto DELETE = new DELETE("DELETE", 5);
        public static final MethodDto OPTIONS = new OPTIONS("OPTIONS", 6);
        public static final MethodDto HEAD = new HEAD("HEAD", 7);
        public static final MethodDto CONNECT = new CONNECT("CONNECT", 8);
        public static final MethodDto TRACE = new TRACE("TRACE", 9);

        private static final /* synthetic */ MethodDto[] $values() {
            return new MethodDto[]{METHOD_UNSPECIFIED, GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, CONNECT, TRACE};
        }

        public /* synthetic */ MethodDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<MethodDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.METHOD_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class METHOD_UNSPECIFIED extends MethodDto {
            METHOD_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.METHOD_UNSPECIFIED;
            }
        }

        private MethodDto(String str, int i) {
        }

        static {
            MethodDto[] methodDtoArr$values = $values();
            $VALUES = methodDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(methodDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$MethodDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HttpCallDto.MethodDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.GET", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GET extends MethodDto {
            GET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.GET;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.POST", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POST extends MethodDto {
            POST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.POST;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.PUT", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUT extends MethodDto {
            PUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.PUT;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.PATCH", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PATCH extends MethodDto {
            PATCH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.PATCH;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.DELETE", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DELETE extends MethodDto {
            DELETE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.DELETE;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.OPTIONS", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS extends MethodDto {
            OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.OPTIONS;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.HEAD", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HEAD extends MethodDto {
            HEAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.HEAD;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.CONNECT", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECT extends MethodDto {
            CONNECT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.CONNECT;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.MethodDto.TRACE", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRACE extends MethodDto {
            TRACE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Method toProto() {
                return HttpCall.Method.TRACE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Method;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MethodDto, HttpCall.Method> {

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HttpCall.Method.values().length];
                    try {
                        iArr[HttpCall.Method.METHOD_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HttpCall.Method.GET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HttpCall.Method.POST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[HttpCall.Method.PUT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[HttpCall.Method.PATCH.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[HttpCall.Method.DELETE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[HttpCall.Method.OPTIONS.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[HttpCall.Method.HEAD.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[HttpCall.Method.CONNECT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[HttpCall.Method.TRACE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MethodDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MethodDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<MethodDto> getBinaryBase64Serializer() {
                return (KSerializer) MethodDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HttpCall.Method> getProtoAdapter() {
                return HttpCall.Method.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MethodDto getZeroValue() {
                return MethodDto.METHOD_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MethodDto fromProto(HttpCall.Method proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return MethodDto.METHOD_UNSPECIFIED;
                    case 2:
                        return MethodDto.GET;
                    case 3:
                        return MethodDto.POST;
                    case 4:
                        return MethodDto.PUT;
                    case 5:
                        return MethodDto.PATCH;
                    case 6:
                        return MethodDto.DELETE;
                    case 7:
                        return MethodDto.OPTIONS;
                    case 8:
                        return MethodDto.HEAD;
                    case 9:
                        return MethodDto.CONNECT;
                    case 10:
                        return MethodDto.TRACE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MethodDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<MethodDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MethodDto, HttpCall.Method> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.HttpCall.Method", MethodDto.getEntries(), MethodDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public MethodDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (MethodDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, MethodDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static MethodDto valueOf(String str) {
            return (MethodDto) Enum.valueOf(MethodDto.class, str);
        }

        public static MethodDto[] values() {
            return (MethodDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PROTOCOL_UNSPECIFIED", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ProtocolDto implements Dto2<HttpCall.Protocol>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ProtocolDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ProtocolDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ProtocolDto, HttpCall.Protocol>> binaryBase64Serializer$delegate;
        public static final ProtocolDto PROTOCOL_UNSPECIFIED = new PROTOCOL_UNSPECIFIED("PROTOCOL_UNSPECIFIED", 0);
        public static final ProtocolDto HTTP_1_0 = new HTTP_1_0("HTTP_1_0", 1);
        public static final ProtocolDto HTTP_1_1 = new HTTP_1_1("HTTP_1_1", 2);
        public static final ProtocolDto SPDY_3 = new SPDY_3("SPDY_3", 3);
        public static final ProtocolDto HTTP_2 = new HTTP_2("HTTP_2", 4);
        public static final ProtocolDto H2_PRIOR_KNOWLEDGE = new H2_PRIOR_KNOWLEDGE("H2_PRIOR_KNOWLEDGE", 5);
        public static final ProtocolDto QUIC = new QUIC("QUIC", 6);

        private static final /* synthetic */ ProtocolDto[] $values() {
            return new ProtocolDto[]{PROTOCOL_UNSPECIFIED, HTTP_1_0, HTTP_1_1, SPDY_3, HTTP_2, H2_PRIOR_KNOWLEDGE, QUIC};
        }

        public /* synthetic */ ProtocolDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ProtocolDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ProtocolDto.PROTOCOL_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PROTOCOL_UNSPECIFIED extends ProtocolDto {
            PROTOCOL_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Protocol toProto() {
                return HttpCall.Protocol.PROTOCOL_UNSPECIFIED;
            }
        }

        private ProtocolDto(String str, int i) {
        }

        static {
            ProtocolDto[] protocolDtoArr$values = $values();
            $VALUES = protocolDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(protocolDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDto$ProtocolDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HttpCallDto.ProtocolDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ProtocolDto.HTTP_1_0", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HTTP_1_0 extends ProtocolDto {
            HTTP_1_0(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Protocol toProto() {
                return HttpCall.Protocol.HTTP_1_0;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ProtocolDto.HTTP_1_1", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HTTP_1_1 extends ProtocolDto {
            HTTP_1_1(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Protocol toProto() {
                return HttpCall.Protocol.HTTP_1_1;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ProtocolDto.SPDY_3", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SPDY_3 extends ProtocolDto {
            SPDY_3(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Protocol toProto() {
                return HttpCall.Protocol.SPDY_3;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ProtocolDto.HTTP_2", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HTTP_2 extends ProtocolDto {
            HTTP_2(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Protocol toProto() {
                return HttpCall.Protocol.HTTP_2;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ProtocolDto.H2_PRIOR_KNOWLEDGE", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class H2_PRIOR_KNOWLEDGE extends ProtocolDto {
            H2_PRIOR_KNOWLEDGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Protocol toProto() {
                return HttpCall.Protocol.H2_PRIOR_KNOWLEDGE;
            }
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/HttpCallDto.ProtocolDto.QUIC", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QUIC extends ProtocolDto {
            QUIC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public HttpCall.Protocol toProto() {
                return HttpCall.Protocol.QUIC;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCall$Protocol;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ProtocolDto, HttpCall.Protocol> {

            /* compiled from: HttpCallDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[HttpCall.Protocol.values().length];
                    try {
                        iArr[HttpCall.Protocol.PROTOCOL_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[HttpCall.Protocol.HTTP_1_0.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[HttpCall.Protocol.HTTP_1_1.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[HttpCall.Protocol.SPDY_3.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[HttpCall.Protocol.HTTP_2.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[HttpCall.Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[HttpCall.Protocol.QUIC.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ProtocolDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ProtocolDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ProtocolDto> getBinaryBase64Serializer() {
                return (KSerializer) ProtocolDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<HttpCall.Protocol> getProtoAdapter() {
                return HttpCall.Protocol.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtocolDto getZeroValue() {
                return ProtocolDto.PROTOCOL_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtocolDto fromProto(HttpCall.Protocol proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ProtocolDto.PROTOCOL_UNSPECIFIED;
                    case 2:
                        return ProtocolDto.HTTP_1_0;
                    case 3:
                        return ProtocolDto.HTTP_1_1;
                    case 4:
                        return ProtocolDto.SPDY_3;
                    case 5:
                        return ProtocolDto.HTTP_2;
                    case 6:
                        return ProtocolDto.H2_PRIOR_KNOWLEDGE;
                    case 7:
                        return ProtocolDto.QUIC;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: HttpCallDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$ProtocolDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<ProtocolDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ProtocolDto, HttpCall.Protocol> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.HttpCall.Protocol", ProtocolDto.getEntries(), ProtocolDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ProtocolDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ProtocolDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ProtocolDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ProtocolDto valueOf(String str) {
            return (ProtocolDto) Enum.valueOf(ProtocolDto.class, str);
        }

        public static ProtocolDto[] values() {
            return (ProtocolDto[]) $VALUES.clone();
        }
    }

    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<HttpCallDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.HttpCall", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HttpCallDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public HttpCallDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new HttpCallDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: HttpCallDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.HttpCallDto";
        }
    }
}
