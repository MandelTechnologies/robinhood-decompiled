package gold.proto.p464v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import gold.proto.p464v1.GoldSageSplashDto;
import gold.proto.p464v1.GoldSageStartApplicationDto;
import gold.proto.p464v1.GoldSageTimelineDto;
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

/* compiled from: GetSageFlowResponseDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lgold/proto/v1/GetSageFlowResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lgold/proto/v1/GetSageFlowResponse;", "Landroid/os/Parcelable;", "Lgold/proto/v1/GetSageFlowResponseDto$Surrogate;", "surrogate", "<init>", "(Lgold/proto/v1/GetSageFlowResponseDto$Surrogate;)V", "Lgold/proto/v1/GoldSageSplashDto;", "splash", "Lgold/proto/v1/GoldSageTimelineDto;", "timeline", "Lgold/proto/v1/GoldSageStartApplicationDto;", "application", "(Lgold/proto/v1/GoldSageSplashDto;Lgold/proto/v1/GoldSageTimelineDto;Lgold/proto/v1/GoldSageStartApplicationDto;)V", "toProto", "()Lgold/proto/v1/GetSageFlowResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lgold/proto/v1/GetSageFlowResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class GetSageFlowResponseDto implements Dto3<GetSageFlowResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetSageFlowResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetSageFlowResponseDto, GetSageFlowResponse>> binaryBase64Serializer$delegate;
    private static final GetSageFlowResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetSageFlowResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetSageFlowResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ GetSageFlowResponseDto(GoldSageSplashDto goldSageSplashDto, GoldSageTimelineDto goldSageTimelineDto, GoldSageStartApplicationDto goldSageStartApplicationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : goldSageSplashDto, (i & 2) != 0 ? null : goldSageTimelineDto, (i & 4) != 0 ? null : goldSageStartApplicationDto);
    }

    public GetSageFlowResponseDto(GoldSageSplashDto goldSageSplashDto, GoldSageTimelineDto goldSageTimelineDto, GoldSageStartApplicationDto goldSageStartApplicationDto) {
        this(new Surrogate(goldSageSplashDto, goldSageTimelineDto, goldSageStartApplicationDto));
    }

    @Override // com.robinhood.idl.Dto
    public GetSageFlowResponse toProto() {
        GoldSageSplashDto splash = this.surrogate.getSplash();
        GoldSageSplash proto = splash != null ? splash.toProto() : null;
        GoldSageTimelineDto timeline = this.surrogate.getTimeline();
        GoldSageTimeline proto2 = timeline != null ? timeline.toProto() : null;
        GoldSageStartApplicationDto application = this.surrogate.getApplication();
        return new GetSageFlowResponse(proto, proto2, application != null ? application.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetSageFlowResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetSageFlowResponseDto) && Intrinsics.areEqual(((GetSageFlowResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetSageFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lgold/proto/v1/GetSageFlowResponseDto$Surrogate;", "", "Lgold/proto/v1/GoldSageSplashDto;", "splash", "Lgold/proto/v1/GoldSageTimelineDto;", "timeline", "Lgold/proto/v1/GoldSageStartApplicationDto;", "application", "<init>", "(Lgold/proto/v1/GoldSageSplashDto;Lgold/proto/v1/GoldSageTimelineDto;Lgold/proto/v1/GoldSageStartApplicationDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgold/proto/v1/GoldSageSplashDto;Lgold/proto/v1/GoldSageTimelineDto;Lgold/proto/v1/GoldSageStartApplicationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$gold_proto_v1_externalRelease", "(Lgold/proto/v1/GetSageFlowResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgold/proto/v1/GoldSageSplashDto;", "getSplash", "()Lgold/proto/v1/GoldSageSplashDto;", "getSplash$annotations", "()V", "Lgold/proto/v1/GoldSageTimelineDto;", "getTimeline", "()Lgold/proto/v1/GoldSageTimelineDto;", "getTimeline$annotations", "Lgold/proto/v1/GoldSageStartApplicationDto;", "getApplication", "()Lgold/proto/v1/GoldSageStartApplicationDto;", "getApplication$annotations", "Companion", "$serializer", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final GoldSageStartApplicationDto application;
        private final GoldSageSplashDto splash;
        private final GoldSageTimelineDto timeline;

        public Surrogate() {
            this((GoldSageSplashDto) null, (GoldSageTimelineDto) null, (GoldSageStartApplicationDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.splash, surrogate.splash) && Intrinsics.areEqual(this.timeline, surrogate.timeline) && Intrinsics.areEqual(this.application, surrogate.application);
        }

        public int hashCode() {
            GoldSageSplashDto goldSageSplashDto = this.splash;
            int iHashCode = (goldSageSplashDto == null ? 0 : goldSageSplashDto.hashCode()) * 31;
            GoldSageTimelineDto goldSageTimelineDto = this.timeline;
            int iHashCode2 = (iHashCode + (goldSageTimelineDto == null ? 0 : goldSageTimelineDto.hashCode())) * 31;
            GoldSageStartApplicationDto goldSageStartApplicationDto = this.application;
            return iHashCode2 + (goldSageStartApplicationDto != null ? goldSageStartApplicationDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(splash=" + this.splash + ", timeline=" + this.timeline + ", application=" + this.application + ")";
        }

        /* compiled from: GetSageFlowResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lgold/proto/v1/GetSageFlowResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgold/proto/v1/GetSageFlowResponseDto$Surrogate;", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetSageFlowResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, GoldSageSplashDto goldSageSplashDto, GoldSageTimelineDto goldSageTimelineDto, GoldSageStartApplicationDto goldSageStartApplicationDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.splash = null;
            } else {
                this.splash = goldSageSplashDto;
            }
            if ((i & 2) == 0) {
                this.timeline = null;
            } else {
                this.timeline = goldSageTimelineDto;
            }
            if ((i & 4) == 0) {
                this.application = null;
            } else {
                this.application = goldSageStartApplicationDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$gold_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            GoldSageSplashDto goldSageSplashDto = self.splash;
            if (goldSageSplashDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, GoldSageSplashDto.Serializer.INSTANCE, goldSageSplashDto);
            }
            GoldSageTimelineDto goldSageTimelineDto = self.timeline;
            if (goldSageTimelineDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, GoldSageTimelineDto.Serializer.INSTANCE, goldSageTimelineDto);
            }
            GoldSageStartApplicationDto goldSageStartApplicationDto = self.application;
            if (goldSageStartApplicationDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, GoldSageStartApplicationDto.Serializer.INSTANCE, goldSageStartApplicationDto);
            }
        }

        public Surrogate(GoldSageSplashDto goldSageSplashDto, GoldSageTimelineDto goldSageTimelineDto, GoldSageStartApplicationDto goldSageStartApplicationDto) {
            this.splash = goldSageSplashDto;
            this.timeline = goldSageTimelineDto;
            this.application = goldSageStartApplicationDto;
        }

        public /* synthetic */ Surrogate(GoldSageSplashDto goldSageSplashDto, GoldSageTimelineDto goldSageTimelineDto, GoldSageStartApplicationDto goldSageStartApplicationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : goldSageSplashDto, (i & 2) != 0 ? null : goldSageTimelineDto, (i & 4) != 0 ? null : goldSageStartApplicationDto);
        }

        public final GoldSageSplashDto getSplash() {
            return this.splash;
        }

        public final GoldSageTimelineDto getTimeline() {
            return this.timeline;
        }

        public final GoldSageStartApplicationDto getApplication() {
            return this.application;
        }
    }

    /* compiled from: GetSageFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold/proto/v1/GetSageFlowResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lgold/proto/v1/GetSageFlowResponseDto;", "Lgold/proto/v1/GetSageFlowResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold/proto/v1/GetSageFlowResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetSageFlowResponseDto, GetSageFlowResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetSageFlowResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetSageFlowResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetSageFlowResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetSageFlowResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetSageFlowResponse> getProtoAdapter() {
            return GetSageFlowResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetSageFlowResponseDto getZeroValue() {
            return GetSageFlowResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetSageFlowResponseDto fromProto(GetSageFlowResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            GoldSageSplash splash = proto.getSplash();
            DefaultConstructorMarker defaultConstructorMarker = null;
            GoldSageSplashDto goldSageSplashDtoFromProto = splash != null ? GoldSageSplashDto.INSTANCE.fromProto(splash) : null;
            GoldSageTimeline timeline = proto.getTimeline();
            GoldSageTimelineDto goldSageTimelineDtoFromProto = timeline != null ? GoldSageTimelineDto.INSTANCE.fromProto(timeline) : null;
            GoldSageStartApplication application = proto.getApplication();
            return new GetSageFlowResponseDto(new Surrogate(goldSageSplashDtoFromProto, goldSageTimelineDtoFromProto, application != null ? GoldSageStartApplicationDto.INSTANCE.fromProto(application) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold.proto.v1.GetSageFlowResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetSageFlowResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetSageFlowResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetSageFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lgold/proto/v1/GetSageFlowResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold/proto/v1/GetSageFlowResponseDto;", "<init>", "()V", "surrogateSerializer", "Lgold/proto/v1/GetSageFlowResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetSageFlowResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/gold.proto.v1.GetSageFlowResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetSageFlowResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetSageFlowResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetSageFlowResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetSageFlowResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lgold/proto/v1/GetSageFlowResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "gold.proto.v1.GetSageFlowResponseDto";
        }
    }
}
