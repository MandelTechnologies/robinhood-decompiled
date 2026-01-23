package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.HttpCallDto;
import com.robinhood.rosetta.eventlogging.HttpCallMeasurementsDto;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: HttpCallDataDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Surrogate;)V", "call", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "measurements", "Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurementsDto;", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto;Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurementsDto;)V", "getCall", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "getMeasurements", "()Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurementsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class HttpCallDataDto implements Dto3<HttpCallData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<HttpCallDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HttpCallDataDto, HttpCallData>> binaryBase64Serializer$delegate;
    private static final HttpCallDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ HttpCallDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HttpCallDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final HttpCallDto getCall() {
        return this.surrogate.getCall();
    }

    public final HttpCallMeasurementsDto getMeasurements() {
        return this.surrogate.getMeasurements();
    }

    public HttpCallDataDto(HttpCallDto httpCallDto, HttpCallMeasurementsDto httpCallMeasurementsDto) {
        this(new Surrogate(httpCallDto, httpCallMeasurementsDto));
    }

    public /* synthetic */ HttpCallDataDto(HttpCallDto httpCallDto, HttpCallMeasurementsDto httpCallMeasurementsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : httpCallDto, (i & 2) != 0 ? null : httpCallMeasurementsDto);
    }

    public static /* synthetic */ HttpCallDataDto copy$default(HttpCallDataDto httpCallDataDto, HttpCallDto httpCallDto, HttpCallMeasurementsDto httpCallMeasurementsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            httpCallDto = httpCallDataDto.surrogate.getCall();
        }
        if ((i & 2) != 0) {
            httpCallMeasurementsDto = httpCallDataDto.surrogate.getMeasurements();
        }
        return httpCallDataDto.copy(httpCallDto, httpCallMeasurementsDto);
    }

    public final HttpCallDataDto copy(HttpCallDto call, HttpCallMeasurementsDto measurements) {
        return new HttpCallDataDto(new Surrogate(call, measurements));
    }

    @Override // com.robinhood.idl.Dto
    public HttpCallData toProto() {
        HttpCallDto call = this.surrogate.getCall();
        HttpCall proto = call != null ? call.toProto() : null;
        HttpCallMeasurementsDto measurements = this.surrogate.getMeasurements();
        return new HttpCallData(proto, measurements != null ? measurements.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[HttpCallDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof HttpCallDataDto) && Intrinsics.areEqual(((HttpCallDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: HttpCallDataDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Surrogate;", "", "call", "Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "measurements", "Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurementsDto;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/HttpCallDto;Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurementsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/HttpCallDto;Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurementsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCall$annotations", "()V", "getCall", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDto;", "getMeasurements$annotations", "getMeasurements", "()Lcom/robinhood/rosetta/eventlogging/HttpCallMeasurementsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final HttpCallDto call;
        private final HttpCallMeasurementsDto measurements;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((HttpCallDto) null, (HttpCallMeasurementsDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, HttpCallDto httpCallDto, HttpCallMeasurementsDto httpCallMeasurementsDto, int i, Object obj) {
            if ((i & 1) != 0) {
                httpCallDto = surrogate.call;
            }
            if ((i & 2) != 0) {
                httpCallMeasurementsDto = surrogate.measurements;
            }
            return surrogate.copy(httpCallDto, httpCallMeasurementsDto);
        }

        @SerialName("call")
        @JsonAnnotations2(names = {"call"})
        public static /* synthetic */ void getCall$annotations() {
        }

        @SerialName("measurements")
        @JsonAnnotations2(names = {"measurements"})
        public static /* synthetic */ void getMeasurements$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final HttpCallDto getCall() {
            return this.call;
        }

        /* renamed from: component2, reason: from getter */
        public final HttpCallMeasurementsDto getMeasurements() {
            return this.measurements;
        }

        public final Surrogate copy(HttpCallDto call, HttpCallMeasurementsDto measurements) {
            return new Surrogate(call, measurements);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.call, surrogate.call) && Intrinsics.areEqual(this.measurements, surrogate.measurements);
        }

        public int hashCode() {
            HttpCallDto httpCallDto = this.call;
            int iHashCode = (httpCallDto == null ? 0 : httpCallDto.hashCode()) * 31;
            HttpCallMeasurementsDto httpCallMeasurementsDto = this.measurements;
            return iHashCode + (httpCallMeasurementsDto != null ? httpCallMeasurementsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(call=" + this.call + ", measurements=" + this.measurements + ")";
        }

        /* compiled from: HttpCallDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return HttpCallDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, HttpCallDto httpCallDto, HttpCallMeasurementsDto httpCallMeasurementsDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.call = null;
            } else {
                this.call = httpCallDto;
            }
            if ((i & 2) == 0) {
                this.measurements = null;
            } else {
                this.measurements = httpCallMeasurementsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            HttpCallDto httpCallDto = self.call;
            if (httpCallDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, HttpCallDto.Serializer.INSTANCE, httpCallDto);
            }
            HttpCallMeasurementsDto httpCallMeasurementsDto = self.measurements;
            if (httpCallMeasurementsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, HttpCallMeasurementsDto.Serializer.INSTANCE, httpCallMeasurementsDto);
            }
        }

        public Surrogate(HttpCallDto httpCallDto, HttpCallMeasurementsDto httpCallMeasurementsDto) {
            this.call = httpCallDto;
            this.measurements = httpCallMeasurementsDto;
        }

        public /* synthetic */ Surrogate(HttpCallDto httpCallDto, HttpCallMeasurementsDto httpCallMeasurementsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : httpCallDto, (i & 2) != 0 ? null : httpCallMeasurementsDto);
        }

        public final HttpCallDto getCall() {
            return this.call;
        }

        public final HttpCallMeasurementsDto getMeasurements() {
            return this.measurements;
        }
    }

    /* compiled from: HttpCallDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "Lcom/robinhood/rosetta/eventlogging/HttpCallData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<HttpCallDataDto, HttpCallData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HttpCallDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HttpCallDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HttpCallDataDto> getBinaryBase64Serializer() {
            return (KSerializer) HttpCallDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HttpCallData> getProtoAdapter() {
            return HttpCallData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HttpCallDataDto getZeroValue() {
            return HttpCallDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HttpCallDataDto fromProto(HttpCallData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            HttpCall call = proto.getCall();
            DefaultConstructorMarker defaultConstructorMarker = null;
            HttpCallDto httpCallDtoFromProto = call != null ? HttpCallDto.INSTANCE.fromProto(call) : null;
            HttpCallMeasurements measurements = proto.getMeasurements();
            return new HttpCallDataDto(new Surrogate(httpCallDtoFromProto, measurements != null ? HttpCallMeasurementsDto.INSTANCE.fromProto(measurements) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.HttpCallDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HttpCallDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new HttpCallDataDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HttpCallDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<HttpCallDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.HttpCallData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HttpCallDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public HttpCallDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new HttpCallDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: HttpCallDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/HttpCallDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.HttpCallDataDto";
        }
    }
}
