package advisory.proto.p008v1;

import advisory.proto.p008v1.AdvisoryInsightContentViewModelAudioMuxDto;
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

/* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006)"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudio;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate;)V", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto;", "audio", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto;)V", "toProto", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudio;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "getMux", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "mux", "Companion", "Surrogate", "AudioDto", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class AdvisoryInsightContentViewModelAudioDto implements Dto3<AdvisoryInsightContentViewModelAudio>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AdvisoryInsightContentViewModelAudioDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AdvisoryInsightContentViewModelAudioDto, AdvisoryInsightContentViewModelAudio>> binaryBase64Serializer$delegate;
    private static final AdvisoryInsightContentViewModelAudioDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AdvisoryInsightContentViewModelAudioDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AdvisoryInsightContentViewModelAudioDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final AdvisoryInsightContentViewModelAudioMuxDto getMux() {
        return this.surrogate.getMux();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AdvisoryInsightContentViewModelAudioDto(AudioDto audioDto) {
        AudioDto.Mux mux = audioDto instanceof AudioDto.Mux ? (AudioDto.Mux) audioDto : null;
        this(new Surrogate(mux != null ? mux.getValue() : null));
    }

    public /* synthetic */ AdvisoryInsightContentViewModelAudioDto(AudioDto audioDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : audioDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AdvisoryInsightContentViewModelAudio toProto() {
        AdvisoryInsightContentViewModelAudioMuxDto mux = this.surrogate.getMux();
        return new AdvisoryInsightContentViewModelAudio(mux != null ? mux.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[AdvisoryInsightContentViewModelAudioDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AdvisoryInsightContentViewModelAudioDto) && Intrinsics.areEqual(((AdvisoryInsightContentViewModelAudioDto) other).surrogate, this.surrogate);
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
    /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate;", "", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "mux", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "getMux", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "getMux$annotations", "()V", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AdvisoryInsightContentViewModelAudioMuxDto mux;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((AdvisoryInsightContentViewModelAudioMuxDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.mux, ((Surrogate) other).mux);
        }

        public int hashCode() {
            AdvisoryInsightContentViewModelAudioMuxDto advisoryInsightContentViewModelAudioMuxDto = this.mux;
            if (advisoryInsightContentViewModelAudioMuxDto == null) {
                return 0;
            }
            return advisoryInsightContentViewModelAudioMuxDto.hashCode();
        }

        public String toString() {
            return "Surrogate(mux=" + this.mux + ")";
        }

        /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AdvisoryInsightContentViewModelAudioDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, AdvisoryInsightContentViewModelAudioMuxDto advisoryInsightContentViewModelAudioMuxDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.mux = null;
            } else {
                this.mux = advisoryInsightContentViewModelAudioMuxDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            AdvisoryInsightContentViewModelAudioMuxDto advisoryInsightContentViewModelAudioMuxDto = self.mux;
            if (advisoryInsightContentViewModelAudioMuxDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, AdvisoryInsightContentViewModelAudioMuxDto.Serializer.INSTANCE, advisoryInsightContentViewModelAudioMuxDto);
            }
        }

        public Surrogate(AdvisoryInsightContentViewModelAudioMuxDto advisoryInsightContentViewModelAudioMuxDto) {
            this.mux = advisoryInsightContentViewModelAudioMuxDto;
        }

        public /* synthetic */ Surrogate(AdvisoryInsightContentViewModelAudioMuxDto advisoryInsightContentViewModelAudioMuxDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : advisoryInsightContentViewModelAudioMuxDto);
        }

        public final AdvisoryInsightContentViewModelAudioMuxDto getMux() {
            return this.mux;
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudio;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AdvisoryInsightContentViewModelAudioDto, AdvisoryInsightContentViewModelAudio> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AdvisoryInsightContentViewModelAudioDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelAudioDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AdvisoryInsightContentViewModelAudioDto> getBinaryBase64Serializer() {
            return (KSerializer) AdvisoryInsightContentViewModelAudioDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AdvisoryInsightContentViewModelAudio> getProtoAdapter() {
            return AdvisoryInsightContentViewModelAudio.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelAudioDto getZeroValue() {
            return AdvisoryInsightContentViewModelAudioDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AdvisoryInsightContentViewModelAudioDto fromProto(AdvisoryInsightContentViewModelAudio proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            AdvisoryInsightContentViewModelAudioMux mux = proto.getMux();
            return new AdvisoryInsightContentViewModelAudioDto(new Surrogate(mux != null ? AdvisoryInsightContentViewModelAudioMuxDto.INSTANCE.fromProto(mux) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.AdvisoryInsightContentViewModelAudioDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvisoryInsightContentViewModelAudioDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AdvisoryInsightContentViewModelAudioDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Mux", "Companion", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto$Mux;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class AudioDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AudioDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AudioDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto$Mux;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "value", "<init>", "(Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "getValue", "()Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioMuxDto;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Mux extends AudioDto {
            private final AdvisoryInsightContentViewModelAudioMuxDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Mux) && Intrinsics.areEqual(this.value, ((Mux) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Mux(value=" + this.value + ")";
            }

            public final AdvisoryInsightContentViewModelAudioMuxDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Mux(AdvisoryInsightContentViewModelAudioMuxDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$AudioDto;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudio;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes23.dex */
        public static final class Companion implements Dto4.Creator<AudioDto, AdvisoryInsightContentViewModelAudio> {
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
            public ProtoAdapter<AdvisoryInsightContentViewModelAudio> getProtoAdapter() {
                return AdvisoryInsightContentViewModelAudio.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AudioDto fromProto(AdvisoryInsightContentViewModelAudio proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getMux() != null) {
                    return new Mux(AdvisoryInsightContentViewModelAudioMuxDto.INSTANCE.fromProto(proto.getMux()));
                }
                return null;
            }
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<AdvisoryInsightContentViewModelAudioDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.AdvisoryInsightContentViewModelAudio", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AdvisoryInsightContentViewModelAudioDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AdvisoryInsightContentViewModelAudioDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AdvisoryInsightContentViewModelAudioDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AdvisoryInsightContentViewModelAudioDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/AdvisoryInsightContentViewModelAudioDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "advisory.proto.v1.AdvisoryInsightContentViewModelAudioDto";
        }
    }
}
