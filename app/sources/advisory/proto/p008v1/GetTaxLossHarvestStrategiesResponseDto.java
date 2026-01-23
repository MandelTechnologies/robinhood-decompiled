package advisory.proto.p008v1;

import advisory.proto.p008v1.TaxLossHarvestStrategiesDto;
import advisory.proto.p008v1.TaxLossHarvestStrategiesIntroDto;
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

/* compiled from: GetTaxLossHarvestStrategiesResponseDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponse;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate;)V", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "intro", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "strategies", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;)V", "toProto", "()Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate;", "getIntro", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "getStrategies", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class GetTaxLossHarvestStrategiesResponseDto implements Dto3<GetTaxLossHarvestStrategiesResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetTaxLossHarvestStrategiesResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetTaxLossHarvestStrategiesResponseDto, GetTaxLossHarvestStrategiesResponse>> binaryBase64Serializer$delegate;
    private static final GetTaxLossHarvestStrategiesResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetTaxLossHarvestStrategiesResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetTaxLossHarvestStrategiesResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TaxLossHarvestStrategiesIntroDto getIntro() {
        return this.surrogate.getIntro();
    }

    public final TaxLossHarvestStrategiesDto getStrategies() {
        return this.surrogate.getStrategies();
    }

    public GetTaxLossHarvestStrategiesResponseDto(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestStrategiesDto taxLossHarvestStrategiesDto) {
        this(new Surrogate(taxLossHarvestStrategiesIntroDto, taxLossHarvestStrategiesDto));
    }

    public /* synthetic */ GetTaxLossHarvestStrategiesResponseDto(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestStrategiesDto taxLossHarvestStrategiesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : taxLossHarvestStrategiesIntroDto, (i & 2) != 0 ? null : taxLossHarvestStrategiesDto);
    }

    @Override // com.robinhood.idl.Dto
    public GetTaxLossHarvestStrategiesResponse toProto() {
        TaxLossHarvestStrategiesIntroDto intro = this.surrogate.getIntro();
        TaxLossHarvestStrategiesIntro proto = intro != null ? intro.toProto() : null;
        TaxLossHarvestStrategiesDto strategies = this.surrogate.getStrategies();
        return new GetTaxLossHarvestStrategiesResponse(proto, strategies != null ? strategies.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetTaxLossHarvestStrategiesResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetTaxLossHarvestStrategiesResponseDto) && Intrinsics.areEqual(((GetTaxLossHarvestStrategiesResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetTaxLossHarvestStrategiesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate;", "", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "intro", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "strategies", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILadvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "getIntro", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesIntroDto;", "getIntro$annotations", "()V", "Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "getStrategies", "()Ladvisory/proto/v1/TaxLossHarvestStrategiesDto;", "getStrategies$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TaxLossHarvestStrategiesIntroDto intro;
        private final TaxLossHarvestStrategiesDto strategies;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((TaxLossHarvestStrategiesIntroDto) null, (TaxLossHarvestStrategiesDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.intro, surrogate.intro) && Intrinsics.areEqual(this.strategies, surrogate.strategies);
        }

        public int hashCode() {
            TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto = this.intro;
            int iHashCode = (taxLossHarvestStrategiesIntroDto == null ? 0 : taxLossHarvestStrategiesIntroDto.hashCode()) * 31;
            TaxLossHarvestStrategiesDto taxLossHarvestStrategiesDto = this.strategies;
            return iHashCode + (taxLossHarvestStrategiesDto != null ? taxLossHarvestStrategiesDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(intro=" + this.intro + ", strategies=" + this.strategies + ")";
        }

        /* compiled from: GetTaxLossHarvestStrategiesResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetTaxLossHarvestStrategiesResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestStrategiesDto taxLossHarvestStrategiesDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.intro = null;
            } else {
                this.intro = taxLossHarvestStrategiesIntroDto;
            }
            if ((i & 2) == 0) {
                this.strategies = null;
            } else {
                this.strategies = taxLossHarvestStrategiesDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto = self.intro;
            if (taxLossHarvestStrategiesIntroDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, TaxLossHarvestStrategiesIntroDto.Serializer.INSTANCE, taxLossHarvestStrategiesIntroDto);
            }
            TaxLossHarvestStrategiesDto taxLossHarvestStrategiesDto = self.strategies;
            if (taxLossHarvestStrategiesDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, TaxLossHarvestStrategiesDto.Serializer.INSTANCE, taxLossHarvestStrategiesDto);
            }
        }

        public Surrogate(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestStrategiesDto taxLossHarvestStrategiesDto) {
            this.intro = taxLossHarvestStrategiesIntroDto;
            this.strategies = taxLossHarvestStrategiesDto;
        }

        public /* synthetic */ Surrogate(TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDto, TaxLossHarvestStrategiesDto taxLossHarvestStrategiesDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : taxLossHarvestStrategiesIntroDto, (i & 2) != 0 ? null : taxLossHarvestStrategiesDto);
        }

        public final TaxLossHarvestStrategiesIntroDto getIntro() {
            return this.intro;
        }

        public final TaxLossHarvestStrategiesDto getStrategies() {
            return this.strategies;
        }
    }

    /* compiled from: GetTaxLossHarvestStrategiesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetTaxLossHarvestStrategiesResponseDto, GetTaxLossHarvestStrategiesResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetTaxLossHarvestStrategiesResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxLossHarvestStrategiesResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetTaxLossHarvestStrategiesResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetTaxLossHarvestStrategiesResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetTaxLossHarvestStrategiesResponse> getProtoAdapter() {
            return GetTaxLossHarvestStrategiesResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxLossHarvestStrategiesResponseDto getZeroValue() {
            return GetTaxLossHarvestStrategiesResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetTaxLossHarvestStrategiesResponseDto fromProto(GetTaxLossHarvestStrategiesResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            TaxLossHarvestStrategiesIntro intro = proto.getIntro();
            DefaultConstructorMarker defaultConstructorMarker = null;
            TaxLossHarvestStrategiesIntroDto taxLossHarvestStrategiesIntroDtoFromProto = intro != null ? TaxLossHarvestStrategiesIntroDto.INSTANCE.fromProto(intro) : null;
            TaxLossHarvestStrategies strategies = proto.getStrategies();
            return new GetTaxLossHarvestStrategiesResponseDto(new Surrogate(taxLossHarvestStrategiesIntroDtoFromProto, strategies != null ? TaxLossHarvestStrategiesDto.INSTANCE.fromProto(strategies) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.GetTaxLossHarvestStrategiesResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetTaxLossHarvestStrategiesResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetTaxLossHarvestStrategiesResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetTaxLossHarvestStrategiesResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetTaxLossHarvestStrategiesResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.GetTaxLossHarvestStrategiesResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetTaxLossHarvestStrategiesResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetTaxLossHarvestStrategiesResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetTaxLossHarvestStrategiesResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetTaxLossHarvestStrategiesResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/GetTaxLossHarvestStrategiesResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "advisory.proto.v1.GetTaxLossHarvestStrategiesResponseDto";
        }
    }
}
