package ventures.trailer.proto.p551v1;

import android.os.Parcel;
import android.os.Parcelable;
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
import ventures.trailer.proto.p551v1.TrailerStateDto;

/* compiled from: TrailerScreenDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\f\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b%\u0010$¨\u0006*"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerScreenDto;", "Lcom/robinhood/idl/MessageDto;", "Lventures/trailer/proto/v1/TrailerScreen;", "Landroid/os/Parcelable;", "Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate;", "surrogate", "<init>", "(Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate;)V", "", "trailer_url", "Lventures/trailer/proto/v1/TrailerStateDto;", "pre_trailer_state", "post_trailer_state", "(Ljava/lang/String;Lventures/trailer/proto/v1/TrailerStateDto;Lventures/trailer/proto/v1/TrailerStateDto;)V", "toProto", "()Lventures/trailer/proto/v1/TrailerScreen;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate;", "getTrailer_url", "getPre_trailer_state", "()Lventures/trailer/proto/v1/TrailerStateDto;", "getPost_trailer_state", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public final class TrailerScreenDto implements Dto3<TrailerScreen>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TrailerScreenDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TrailerScreenDto, TrailerScreen>> binaryBase64Serializer$delegate;
    private static final TrailerScreenDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TrailerScreenDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TrailerScreenDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTrailer_url() {
        return this.surrogate.getTrailer_url();
    }

    public final TrailerStateDto getPre_trailer_state() {
        return this.surrogate.getPre_trailer_state();
    }

    public final TrailerStateDto getPost_trailer_state() {
        return this.surrogate.getPost_trailer_state();
    }

    public /* synthetic */ TrailerScreenDto(String str, TrailerStateDto trailerStateDto, TrailerStateDto trailerStateDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : trailerStateDto, (i & 4) != 0 ? null : trailerStateDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrailerScreenDto(String trailer_url, TrailerStateDto trailerStateDto, TrailerStateDto trailerStateDto2) {
        this(new Surrogate(trailer_url, trailerStateDto, trailerStateDto2));
        Intrinsics.checkNotNullParameter(trailer_url, "trailer_url");
    }

    @Override // com.robinhood.idl.Dto
    public TrailerScreen toProto() {
        String trailer_url = this.surrogate.getTrailer_url();
        TrailerStateDto pre_trailer_state = this.surrogate.getPre_trailer_state();
        TrailerState proto = pre_trailer_state != null ? pre_trailer_state.toProto() : null;
        TrailerStateDto post_trailer_state = this.surrogate.getPost_trailer_state();
        return new TrailerScreen(trailer_url, proto, post_trailer_state != null ? post_trailer_state.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[TrailerScreenDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TrailerScreenDto) && Intrinsics.areEqual(((TrailerScreenDto) other).surrogate, this.surrogate);
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
    /* compiled from: TrailerScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010%¨\u0006+"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate;", "", "", "trailer_url", "Lventures/trailer/proto/v1/TrailerStateDto;", "pre_trailer_state", "post_trailer_state", "<init>", "(Ljava/lang/String;Lventures/trailer/proto/v1/TrailerStateDto;Lventures/trailer/proto/v1/TrailerStateDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lventures/trailer/proto/v1/TrailerStateDto;Lventures/trailer/proto/v1/TrailerStateDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_ventures_proto_v1_externalRelease", "(Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrailer_url", "getTrailer_url$annotations", "()V", "Lventures/trailer/proto/v1/TrailerStateDto;", "getPre_trailer_state", "()Lventures/trailer/proto/v1/TrailerStateDto;", "getPre_trailer_state$annotations", "getPost_trailer_state", "getPost_trailer_state$annotations", "Companion", "$serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TrailerStateDto post_trailer_state;
        private final TrailerStateDto pre_trailer_state;
        private final String trailer_url;

        public Surrogate() {
            this((String) null, (TrailerStateDto) null, (TrailerStateDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.trailer_url, surrogate.trailer_url) && Intrinsics.areEqual(this.pre_trailer_state, surrogate.pre_trailer_state) && Intrinsics.areEqual(this.post_trailer_state, surrogate.post_trailer_state);
        }

        public int hashCode() {
            int iHashCode = this.trailer_url.hashCode() * 31;
            TrailerStateDto trailerStateDto = this.pre_trailer_state;
            int iHashCode2 = (iHashCode + (trailerStateDto == null ? 0 : trailerStateDto.hashCode())) * 31;
            TrailerStateDto trailerStateDto2 = this.post_trailer_state;
            return iHashCode2 + (trailerStateDto2 != null ? trailerStateDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(trailer_url=" + this.trailer_url + ", pre_trailer_state=" + this.pre_trailer_state + ", post_trailer_state=" + this.post_trailer_state + ")";
        }

        /* compiled from: TrailerScreenDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TrailerScreenDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TrailerStateDto trailerStateDto, TrailerStateDto trailerStateDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.trailer_url = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.pre_trailer_state = null;
            } else {
                this.pre_trailer_state = trailerStateDto;
            }
            if ((i & 4) == 0) {
                this.post_trailer_state = null;
            } else {
                this.post_trailer_state = trailerStateDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$microgram_contracts_ventures_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.trailer_url, "")) {
                output.encodeStringElement(serialDesc, 0, self.trailer_url);
            }
            TrailerStateDto trailerStateDto = self.pre_trailer_state;
            if (trailerStateDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TrailerStateDto.Serializer.INSTANCE, trailerStateDto);
            }
            TrailerStateDto trailerStateDto2 = self.post_trailer_state;
            if (trailerStateDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, TrailerStateDto.Serializer.INSTANCE, trailerStateDto2);
            }
        }

        public Surrogate(String trailer_url, TrailerStateDto trailerStateDto, TrailerStateDto trailerStateDto2) {
            Intrinsics.checkNotNullParameter(trailer_url, "trailer_url");
            this.trailer_url = trailer_url;
            this.pre_trailer_state = trailerStateDto;
            this.post_trailer_state = trailerStateDto2;
        }

        public final String getTrailer_url() {
            return this.trailer_url;
        }

        public /* synthetic */ Surrogate(String str, TrailerStateDto trailerStateDto, TrailerStateDto trailerStateDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : trailerStateDto, (i & 4) != 0 ? null : trailerStateDto2);
        }

        public final TrailerStateDto getPre_trailer_state() {
            return this.pre_trailer_state;
        }

        public final TrailerStateDto getPost_trailer_state() {
            return this.post_trailer_state;
        }
    }

    /* compiled from: TrailerScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerScreenDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lventures/trailer/proto/v1/TrailerScreenDto;", "Lventures/trailer/proto/v1/TrailerScreen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lventures/trailer/proto/v1/TrailerScreenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TrailerScreenDto, TrailerScreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TrailerScreenDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailerScreenDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TrailerScreenDto> getBinaryBase64Serializer() {
            return (KSerializer) TrailerScreenDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TrailerScreen> getProtoAdapter() {
            return TrailerScreen.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailerScreenDto getZeroValue() {
            return TrailerScreenDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TrailerScreenDto fromProto(TrailerScreen proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String trailer_url = proto.getTrailer_url();
            TrailerState pre_trailer_state = proto.getPre_trailer_state();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TrailerStateDto trailerStateDtoFromProto = pre_trailer_state != null ? TrailerStateDto.INSTANCE.fromProto(pre_trailer_state) : null;
            TrailerState post_trailer_state = proto.getPost_trailer_state();
            return new TrailerScreenDto(new Surrogate(trailer_url, trailerStateDtoFromProto, post_trailer_state != null ? TrailerStateDto.INSTANCE.fromProto(post_trailer_state) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: ventures.trailer.proto.v1.TrailerScreenDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrailerScreenDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TrailerScreenDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TrailerScreenDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerScreenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lventures/trailer/proto/v1/TrailerScreenDto;", "<init>", "()V", "surrogateSerializer", "Lventures/trailer/proto/v1/TrailerScreenDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TrailerScreenDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ventures.trailer.proto.v1.TrailerScreen", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TrailerScreenDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TrailerScreenDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TrailerScreenDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TrailerScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lventures/trailer/proto/v1/TrailerScreenDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.ventures.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "ventures.trailer.proto.v1.TrailerScreenDto";
        }
    }
}
