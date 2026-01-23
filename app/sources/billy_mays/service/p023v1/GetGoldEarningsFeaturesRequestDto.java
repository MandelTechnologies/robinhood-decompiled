package billy_mays.service.p023v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.CreateTransferAccount;
import bff_money_movement.service.p019v1.CreateTransferAccountDto;
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

/* compiled from: GetGoldEarningsFeaturesRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010\"¨\u0006("}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequest;", "Landroid/os/Parcelable;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate;", "surrogate", "<init>", "(Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate;)V", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "source", "sink", "(Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;)V", "toProto", "()Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSink", "Companion", "Surrogate", "Serializer", "MultibindingModule", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class GetGoldEarningsFeaturesRequestDto implements Dto3<GetGoldEarningsFeaturesRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetGoldEarningsFeaturesRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetGoldEarningsFeaturesRequestDto, GetGoldEarningsFeaturesRequest>> binaryBase64Serializer$delegate;
    private static final GetGoldEarningsFeaturesRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetGoldEarningsFeaturesRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetGoldEarningsFeaturesRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final CreateTransferAccountDto getSource() {
        return this.surrogate.getSource();
    }

    public final CreateTransferAccountDto getSink() {
        return this.surrogate.getSink();
    }

    public GetGoldEarningsFeaturesRequestDto(CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2) {
        this(new Surrogate(createTransferAccountDto, createTransferAccountDto2));
    }

    public /* synthetic */ GetGoldEarningsFeaturesRequestDto(CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : createTransferAccountDto, (i & 2) != 0 ? null : createTransferAccountDto2);
    }

    @Override // com.robinhood.idl.Dto
    public GetGoldEarningsFeaturesRequest toProto() {
        CreateTransferAccountDto source = this.surrogate.getSource();
        CreateTransferAccount proto = source != null ? source.toProto() : null;
        CreateTransferAccountDto sink = this.surrogate.getSink();
        return new GetGoldEarningsFeaturesRequest(proto, sink != null ? sink.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[GetGoldEarningsFeaturesRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetGoldEarningsFeaturesRequestDto) && Intrinsics.areEqual(((GetGoldEarningsFeaturesRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetGoldEarningsFeaturesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 ¨\u0006'"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate;", "", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "source", "sink", "<init>", "(Lbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILbff_money_movement/service/v1/CreateTransferAccountDto;Lbff_money_movement/service/v1/CreateTransferAccountDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$billy_mays_service_v1_externalRelease", "(Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSource", "()Lbff_money_movement/service/v1/CreateTransferAccountDto;", "getSource$annotations", "()V", "getSink", "getSink$annotations", "Companion", "$serializer", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CreateTransferAccountDto sink;
        private final CreateTransferAccountDto source;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((CreateTransferAccountDto) null, (CreateTransferAccountDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.source, surrogate.source) && Intrinsics.areEqual(this.sink, surrogate.sink);
        }

        public int hashCode() {
            CreateTransferAccountDto createTransferAccountDto = this.source;
            int iHashCode = (createTransferAccountDto == null ? 0 : createTransferAccountDto.hashCode()) * 31;
            CreateTransferAccountDto createTransferAccountDto2 = this.sink;
            return iHashCode + (createTransferAccountDto2 != null ? createTransferAccountDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(source=" + this.source + ", sink=" + this.sink + ")";
        }

        /* compiled from: GetGoldEarningsFeaturesRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate;", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetGoldEarningsFeaturesRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.source = null;
            } else {
                this.source = createTransferAccountDto;
            }
            if ((i & 2) == 0) {
                this.sink = null;
            } else {
                this.sink = createTransferAccountDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$billy_mays_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CreateTransferAccountDto createTransferAccountDto = self.source;
            if (createTransferAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CreateTransferAccountDto.Serializer.INSTANCE, createTransferAccountDto);
            }
            CreateTransferAccountDto createTransferAccountDto2 = self.sink;
            if (createTransferAccountDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, CreateTransferAccountDto.Serializer.INSTANCE, createTransferAccountDto2);
            }
        }

        public Surrogate(CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2) {
            this.source = createTransferAccountDto;
            this.sink = createTransferAccountDto2;
        }

        public /* synthetic */ Surrogate(CreateTransferAccountDto createTransferAccountDto, CreateTransferAccountDto createTransferAccountDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : createTransferAccountDto, (i & 2) != 0 ? null : createTransferAccountDto2);
        }

        public final CreateTransferAccountDto getSource() {
            return this.source;
        }

        public final CreateTransferAccountDto getSink() {
            return this.sink;
        }
    }

    /* compiled from: GetGoldEarningsFeaturesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetGoldEarningsFeaturesRequestDto, GetGoldEarningsFeaturesRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetGoldEarningsFeaturesRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetGoldEarningsFeaturesRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetGoldEarningsFeaturesRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetGoldEarningsFeaturesRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetGoldEarningsFeaturesRequest> getProtoAdapter() {
            return GetGoldEarningsFeaturesRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetGoldEarningsFeaturesRequestDto getZeroValue() {
            return GetGoldEarningsFeaturesRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetGoldEarningsFeaturesRequestDto fromProto(GetGoldEarningsFeaturesRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CreateTransferAccount source = proto.getSource();
            DefaultConstructorMarker defaultConstructorMarker = null;
            CreateTransferAccountDto createTransferAccountDtoFromProto = source != null ? CreateTransferAccountDto.INSTANCE.fromProto(source) : null;
            CreateTransferAccount sink = proto.getSink();
            return new GetGoldEarningsFeaturesRequestDto(new Surrogate(createTransferAccountDtoFromProto, sink != null ? CreateTransferAccountDto.INSTANCE.fromProto(sink) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: billy_mays.service.v1.GetGoldEarningsFeaturesRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetGoldEarningsFeaturesRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetGoldEarningsFeaturesRequestDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetGoldEarningsFeaturesRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto;", "<init>", "()V", "surrogateSerializer", "Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetGoldEarningsFeaturesRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/billy_mays.service.v1.GetGoldEarningsFeaturesRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetGoldEarningsFeaturesRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetGoldEarningsFeaturesRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetGoldEarningsFeaturesRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: GetGoldEarningsFeaturesRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbilly_mays/service/v1/GetGoldEarningsFeaturesRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "billy_mays.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "billy_mays.service.v1.GetGoldEarningsFeaturesRequestDto";
        }
    }
}
