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
import com.robinhood.idl.serialization.UnsignedIntAsNumberSerializer;
import com.robinhood.idl.serialization.UnsignedLongAsStringSerializer;
import com.robinhood.rosetta.eventlogging.NetworkErrorData;
import com.robinhood.rosetta.eventlogging.NetworkErrorDataDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: NetworkErrorDataDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006+,-./0B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0012J8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u000fH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000fH\u0016J\b\u0010*\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Surrogate;)V", "request_method", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "request_url", "", "request_duration_ms", "", "response_status_code", "", "type", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;Ljava/lang/String;JILcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;)V", "getRequest_method", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "getRequest_url", "()Ljava/lang/String;", "getRequest_duration_ms", "()J", "getResponse_status_code", "()I", "getType", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "MethodDto", "NetworkErrorTypeDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NetworkErrorDataDto implements Dto3<NetworkErrorData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NetworkErrorDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NetworkErrorDataDto, NetworkErrorData>> binaryBase64Serializer$delegate;
    private static final NetworkErrorDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NetworkErrorDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NetworkErrorDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MethodDto getRequest_method() {
        return this.surrogate.getRequest_method();
    }

    public final String getRequest_url() {
        return this.surrogate.getRequest_url();
    }

    public final long getRequest_duration_ms() {
        return this.surrogate.getRequest_duration_ms();
    }

    public final int getResponse_status_code() {
        return this.surrogate.getResponse_status_code();
    }

    public final NetworkErrorTypeDto getType() {
        return this.surrogate.getType();
    }

    public /* synthetic */ NetworkErrorDataDto(MethodDto methodDto, String str, long j, int i, NetworkErrorTypeDto networkErrorTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? MethodDto.INSTANCE.getZeroValue() : methodDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? NetworkErrorTypeDto.INSTANCE.getZeroValue() : networkErrorTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NetworkErrorDataDto(MethodDto request_method, String request_url, long j, int i, NetworkErrorTypeDto type2) {
        this(new Surrogate(request_method, request_url, j, i, type2));
        Intrinsics.checkNotNullParameter(request_method, "request_method");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(type2, "type");
    }

    public static /* synthetic */ NetworkErrorDataDto copy$default(NetworkErrorDataDto networkErrorDataDto, MethodDto methodDto, String str, long j, int i, NetworkErrorTypeDto networkErrorTypeDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            methodDto = networkErrorDataDto.surrogate.getRequest_method();
        }
        if ((i2 & 2) != 0) {
            str = networkErrorDataDto.surrogate.getRequest_url();
        }
        if ((i2 & 4) != 0) {
            j = networkErrorDataDto.surrogate.getRequest_duration_ms();
        }
        if ((i2 & 8) != 0) {
            i = networkErrorDataDto.surrogate.getResponse_status_code();
        }
        if ((i2 & 16) != 0) {
            networkErrorTypeDto = networkErrorDataDto.surrogate.getType();
        }
        long j2 = j;
        return networkErrorDataDto.copy(methodDto, str, j2, i, networkErrorTypeDto);
    }

    public final NetworkErrorDataDto copy(MethodDto request_method, String request_url, long request_duration_ms, int response_status_code, NetworkErrorTypeDto type2) {
        Intrinsics.checkNotNullParameter(request_method, "request_method");
        Intrinsics.checkNotNullParameter(request_url, "request_url");
        Intrinsics.checkNotNullParameter(type2, "type");
        return new NetworkErrorDataDto(new Surrogate(request_method, request_url, request_duration_ms, response_status_code, type2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NetworkErrorData toProto() {
        return new NetworkErrorData((NetworkErrorData.Method) this.surrogate.getRequest_method().toProto(), this.surrogate.getRequest_url(), this.surrogate.getRequest_duration_ms(), this.surrogate.getResponse_status_code(), (NetworkErrorData.NetworkErrorType) this.surrogate.getType().toProto(), null, 32, null);
    }

    public String toString() {
        return "[NetworkErrorDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NetworkErrorDataDto) && Intrinsics.areEqual(((NetworkErrorDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: NetworkErrorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011BI\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u0018\u0010(\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u0018\u0010)\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003JY\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u0017\b\u0002\u0010\u000b\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\fHÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR+\u0010\u000b\u001a\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010%¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Surrogate;", "", "request_method", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "request_url", "", "request_duration_ms", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/UInt64Serializer;", "response_status_code", "", "Lcom/robinhood/idl/serialization/UInt32Serializer;", "type", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;Ljava/lang/String;JILcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;Ljava/lang/String;JILcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRequest_method$annotations", "()V", "getRequest_method", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "getRequest_url$annotations", "getRequest_url", "()Ljava/lang/String;", "getRequest_duration_ms$annotations", "getRequest_duration_ms", "()J", "getResponse_status_code$annotations", "getResponse_status_code", "()I", "getType$annotations", "getType", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long request_duration_ms;
        private final MethodDto request_method;
        private final String request_url;
        private final int response_status_code;
        private final NetworkErrorTypeDto type;

        public Surrogate() {
            this((MethodDto) null, (String) null, 0L, 0, (NetworkErrorTypeDto) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MethodDto methodDto, String str, long j, int i, NetworkErrorTypeDto networkErrorTypeDto, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                methodDto = surrogate.request_method;
            }
            if ((i2 & 2) != 0) {
                str = surrogate.request_url;
            }
            if ((i2 & 4) != 0) {
                j = surrogate.request_duration_ms;
            }
            if ((i2 & 8) != 0) {
                i = surrogate.response_status_code;
            }
            if ((i2 & 16) != 0) {
                networkErrorTypeDto = surrogate.type;
            }
            long j2 = j;
            return surrogate.copy(methodDto, str, j2, i, networkErrorTypeDto);
        }

        @SerialName("requestDurationMs")
        @JsonAnnotations2(names = {"request_duration_ms"})
        public static /* synthetic */ void getRequest_duration_ms$annotations() {
        }

        @SerialName("requestMethod")
        @JsonAnnotations2(names = {"request_method"})
        public static /* synthetic */ void getRequest_method$annotations() {
        }

        @SerialName("requestUrl")
        @JsonAnnotations2(names = {"request_url"})
        public static /* synthetic */ void getRequest_url$annotations() {
        }

        @SerialName("responseStatusCode")
        @JsonAnnotations2(names = {"response_status_code"})
        public static /* synthetic */ void getResponse_status_code$annotations() {
        }

        @SerialName("type")
        @JsonAnnotations2(names = {"type"})
        public static /* synthetic */ void getType$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MethodDto getRequest_method() {
            return this.request_method;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRequest_url() {
            return this.request_url;
        }

        /* renamed from: component3, reason: from getter */
        public final long getRequest_duration_ms() {
            return this.request_duration_ms;
        }

        /* renamed from: component4, reason: from getter */
        public final int getResponse_status_code() {
            return this.response_status_code;
        }

        /* renamed from: component5, reason: from getter */
        public final NetworkErrorTypeDto getType() {
            return this.type;
        }

        public final Surrogate copy(MethodDto request_method, String request_url, long request_duration_ms, int response_status_code, NetworkErrorTypeDto type2) {
            Intrinsics.checkNotNullParameter(request_method, "request_method");
            Intrinsics.checkNotNullParameter(request_url, "request_url");
            Intrinsics.checkNotNullParameter(type2, "type");
            return new Surrogate(request_method, request_url, request_duration_ms, response_status_code, type2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.request_method == surrogate.request_method && Intrinsics.areEqual(this.request_url, surrogate.request_url) && this.request_duration_ms == surrogate.request_duration_ms && this.response_status_code == surrogate.response_status_code && this.type == surrogate.type;
        }

        public int hashCode() {
            return (((((((this.request_method.hashCode() * 31) + this.request_url.hashCode()) * 31) + Long.hashCode(this.request_duration_ms)) * 31) + Integer.hashCode(this.response_status_code)) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Surrogate(request_method=" + this.request_method + ", request_url=" + this.request_url + ", request_duration_ms=" + this.request_duration_ms + ", response_status_code=" + this.response_status_code + ", type=" + this.type + ")";
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NetworkErrorDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MethodDto methodDto, String str, long j, int i2, NetworkErrorTypeDto networkErrorTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.request_method = (i & 1) == 0 ? MethodDto.INSTANCE.getZeroValue() : methodDto;
            if ((i & 2) == 0) {
                this.request_url = "";
            } else {
                this.request_url = str;
            }
            if ((i & 4) == 0) {
                this.request_duration_ms = 0L;
            } else {
                this.request_duration_ms = j;
            }
            if ((i & 8) == 0) {
                this.response_status_code = 0;
            } else {
                this.response_status_code = i2;
            }
            if ((i & 16) == 0) {
                this.type = NetworkErrorTypeDto.INSTANCE.getZeroValue();
            } else {
                this.type = networkErrorTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.request_method != MethodDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MethodDto.Serializer.INSTANCE, self.request_method);
            }
            if (!Intrinsics.areEqual(self.request_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.request_url);
            }
            long j = self.request_duration_ms;
            if (j != 0) {
                output.encodeSerializableElement(serialDesc, 2, UnsignedLongAsStringSerializer.INSTANCE, Long.valueOf(j));
            }
            int i = self.response_status_code;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 3, UnsignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            if (self.type != NetworkErrorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, NetworkErrorTypeDto.Serializer.INSTANCE, self.type);
            }
        }

        public Surrogate(MethodDto request_method, String request_url, long j, int i, NetworkErrorTypeDto type2) {
            Intrinsics.checkNotNullParameter(request_method, "request_method");
            Intrinsics.checkNotNullParameter(request_url, "request_url");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.request_method = request_method;
            this.request_url = request_url;
            this.request_duration_ms = j;
            this.response_status_code = i;
            this.type = type2;
        }

        public final MethodDto getRequest_method() {
            return this.request_method;
        }

        public /* synthetic */ Surrogate(MethodDto methodDto, String str, long j, int i, NetworkErrorTypeDto networkErrorTypeDto, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? MethodDto.INSTANCE.getZeroValue() : methodDto, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? NetworkErrorTypeDto.INSTANCE.getZeroValue() : networkErrorTypeDto);
        }

        public final String getRequest_url() {
            return this.request_url;
        }

        public final long getRequest_duration_ms() {
            return this.request_duration_ms;
        }

        public final int getResponse_status_code() {
            return this.response_status_code;
        }

        public final NetworkErrorTypeDto getType() {
            return this.type;
        }
    }

    /* compiled from: NetworkErrorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NetworkErrorDataDto, NetworkErrorData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NetworkErrorDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NetworkErrorDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NetworkErrorDataDto> getBinaryBase64Serializer() {
            return (KSerializer) NetworkErrorDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NetworkErrorData> getProtoAdapter() {
            return NetworkErrorData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NetworkErrorDataDto getZeroValue() {
            return NetworkErrorDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NetworkErrorDataDto fromProto(NetworkErrorData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NetworkErrorDataDto(new Surrogate(MethodDto.INSTANCE.fromProto(proto.getRequest_method()), proto.getRequest_url(), proto.getRequest_duration_ms(), proto.getResponse_status_code(), NetworkErrorTypeDto.INSTANCE.fromProto(proto.getType())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NetworkErrorDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkErrorDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NetworkErrorDataDto(null, null, 0L, 0, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkErrorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "METHOD_UNSPECIFIED", "GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD", "CONNECT", "TRACE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class MethodDto implements Dto2<NetworkErrorData.Method>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MethodDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<MethodDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<MethodDto, NetworkErrorData.Method>> binaryBase64Serializer$delegate;
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

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.METHOD_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class METHOD_UNSPECIFIED extends MethodDto {
            METHOD_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.METHOD_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NetworkErrorDataDto$MethodDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkErrorDataDto.MethodDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.GET", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class GET extends MethodDto {
            GET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.GET;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.POST", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POST extends MethodDto {
            POST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.POST;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.PUT", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUT extends MethodDto {
            PUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.PUT;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.PATCH", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PATCH extends MethodDto {
            PATCH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.PATCH;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.DELETE", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DELETE extends MethodDto {
            DELETE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.DELETE;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.OPTIONS", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class OPTIONS extends MethodDto {
            OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.OPTIONS;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.HEAD", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class HEAD extends MethodDto {
            HEAD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.HEAD;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.CONNECT", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CONNECT extends MethodDto {
            CONNECT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.CONNECT;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.MethodDto.TRACE", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TRACE extends MethodDto {
            TRACE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.Method toProto() {
                return NetworkErrorData.Method.TRACE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$Method;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<MethodDto, NetworkErrorData.Method> {

            /* compiled from: NetworkErrorDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NetworkErrorData.Method.values().length];
                    try {
                        iArr[NetworkErrorData.Method.METHOD_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.GET.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.POST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.PUT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.PATCH.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.DELETE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.OPTIONS.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.HEAD.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.CONNECT.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[NetworkErrorData.Method.TRACE.ordinal()] = 10;
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
            public ProtoAdapter<NetworkErrorData.Method> getProtoAdapter() {
                return NetworkErrorData.Method.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MethodDto getZeroValue() {
                return MethodDto.METHOD_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public MethodDto fromProto(NetworkErrorData.Method proto) {
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

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MethodDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<MethodDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<MethodDto, NetworkErrorData.Method> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NetworkErrorData.Method", MethodDto.getEntries(), MethodDto.INSTANCE.getZeroValue());

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
    /* compiled from: NetworkErrorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NETWORK_ERROR_TYPE_UNSPECIFIED", "NON_2XX_RESPONSE", "TIMEOUT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class NetworkErrorTypeDto implements Dto2<NetworkErrorData.NetworkErrorType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ NetworkErrorTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<NetworkErrorTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final NetworkErrorTypeDto NETWORK_ERROR_TYPE_UNSPECIFIED = new NETWORK_ERROR_TYPE_UNSPECIFIED("NETWORK_ERROR_TYPE_UNSPECIFIED", 0);
        public static final NetworkErrorTypeDto NON_2XX_RESPONSE = new NON_2XX_RESPONSE("NON_2XX_RESPONSE", 1);
        public static final NetworkErrorTypeDto TIMEOUT = new TIMEOUT("TIMEOUT", 2);
        private static final Lazy<BinaryBase64DtoSerializer<NetworkErrorTypeDto, NetworkErrorData.NetworkErrorType>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ NetworkErrorTypeDto[] $values() {
            return new NetworkErrorTypeDto[]{NETWORK_ERROR_TYPE_UNSPECIFIED, NON_2XX_RESPONSE, TIMEOUT};
        }

        public /* synthetic */ NetworkErrorTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<NetworkErrorTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.NetworkErrorTypeDto.NETWORK_ERROR_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NETWORK_ERROR_TYPE_UNSPECIFIED extends NetworkErrorTypeDto {
            NETWORK_ERROR_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.NetworkErrorType toProto() {
                return NetworkErrorData.NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED;
            }
        }

        private NetworkErrorTypeDto(String str, int i) {
        }

        static {
            NetworkErrorTypeDto[] networkErrorTypeDtoArr$values = $values();
            $VALUES = networkErrorTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(networkErrorTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NetworkErrorDataDto$NetworkErrorTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkErrorDataDto.NetworkErrorTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.NetworkErrorTypeDto.NON_2XX_RESPONSE", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NON_2XX_RESPONSE extends NetworkErrorTypeDto {
            NON_2XX_RESPONSE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.NetworkErrorType toProto() {
                return NetworkErrorData.NetworkErrorType.NON_2XX_RESPONSE;
            }
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NetworkErrorDataDto.NetworkErrorTypeDto.TIMEOUT", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TIMEOUT extends NetworkErrorTypeDto {
            TIMEOUT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NetworkErrorData.NetworkErrorType toProto() {
                return NetworkErrorData.NetworkErrorType.TIMEOUT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorData$NetworkErrorType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<NetworkErrorTypeDto, NetworkErrorData.NetworkErrorType> {

            /* compiled from: NetworkErrorDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NetworkErrorData.NetworkErrorType.values().length];
                    try {
                        iArr[NetworkErrorData.NetworkErrorType.NETWORK_ERROR_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NetworkErrorData.NetworkErrorType.NON_2XX_RESPONSE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NetworkErrorData.NetworkErrorType.TIMEOUT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<NetworkErrorTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NetworkErrorTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<NetworkErrorTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) NetworkErrorTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NetworkErrorData.NetworkErrorType> getProtoAdapter() {
                return NetworkErrorData.NetworkErrorType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NetworkErrorTypeDto getZeroValue() {
                return NetworkErrorTypeDto.NETWORK_ERROR_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public NetworkErrorTypeDto fromProto(NetworkErrorData.NetworkErrorType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return NetworkErrorTypeDto.NETWORK_ERROR_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return NetworkErrorTypeDto.NON_2XX_RESPONSE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return NetworkErrorTypeDto.TIMEOUT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NetworkErrorDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$NetworkErrorTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<NetworkErrorTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<NetworkErrorTypeDto, NetworkErrorData.NetworkErrorType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NetworkErrorData.NetworkErrorType", NetworkErrorTypeDto.getEntries(), NetworkErrorTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public NetworkErrorTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (NetworkErrorTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, NetworkErrorTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static NetworkErrorTypeDto valueOf(String str) {
            return (NetworkErrorTypeDto) Enum.valueOf(NetworkErrorTypeDto.class, str);
        }

        public static NetworkErrorTypeDto[] values() {
            return (NetworkErrorTypeDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NetworkErrorDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NetworkErrorDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NetworkErrorData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NetworkErrorDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NetworkErrorDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NetworkErrorDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NetworkErrorDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NetworkErrorDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NetworkErrorDataDto";
        }
    }
}
