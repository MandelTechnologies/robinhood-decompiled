package microgram.contracts.isa_transfer_funds.proto.p495v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: StreamPersonalInfoResponseDto.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate;)V", "", "full_name", GovernmentIdNfcScan.dateOfBirthName, "national_insurance_number", PlaceTypes.ADDRESS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.isa_transfer_funds.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class StreamPersonalInfoResponseDto implements Dto3<StreamPersonalInfoResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamPersonalInfoResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamPersonalInfoResponseDto, StreamPersonalInfoResponse>> binaryBase64Serializer$delegate;
    private static final StreamPersonalInfoResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamPersonalInfoResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamPersonalInfoResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamPersonalInfoResponseDto(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamPersonalInfoResponseDto(String full_name, String date_of_birth, String national_insurance_number, String address) {
        this(new Surrogate(full_name, date_of_birth, national_insurance_number, address));
        Intrinsics.checkNotNullParameter(full_name, "full_name");
        Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
        Intrinsics.checkNotNullParameter(national_insurance_number, "national_insurance_number");
        Intrinsics.checkNotNullParameter(address, "address");
    }

    @Override // com.robinhood.idl.Dto
    public StreamPersonalInfoResponse toProto() {
        return new StreamPersonalInfoResponse(this.surrogate.getFull_name(), this.surrogate.getDate_of_birth(), this.surrogate.getNational_insurance_number(), this.surrogate.getAddress(), null, 16, null);
    }

    public String toString() {
        return "[StreamPersonalInfoResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamPersonalInfoResponseDto) && Intrinsics.areEqual(((StreamPersonalInfoResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamPersonalInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001f\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\u0018R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b(\u0010\"\u001a\u0004\b'\u0010\u0018¨\u0006+"}, m3636d2 = {"Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate;", "", "", "full_name", GovernmentIdNfcScan.dateOfBirthName, "national_insurance_number", PlaceTypes.ADDRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_isa_transfer_funds_proto_v1_externalRelease", "(Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFull_name", "getFull_name$annotations", "()V", "getDate_of_birth", "getDate_of_birth$annotations", "getNational_insurance_number", "getNational_insurance_number$annotations", "getAddress", "getAddress$annotations", "Companion", "$serializer", "microgram.contracts.isa_transfer_funds.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String address;
        private final String date_of_birth;
        private final String full_name;
        private final String national_insurance_number;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.full_name, surrogate.full_name) && Intrinsics.areEqual(this.date_of_birth, surrogate.date_of_birth) && Intrinsics.areEqual(this.national_insurance_number, surrogate.national_insurance_number) && Intrinsics.areEqual(this.address, surrogate.address);
        }

        public int hashCode() {
            return (((((this.full_name.hashCode() * 31) + this.date_of_birth.hashCode()) * 31) + this.national_insurance_number.hashCode()) * 31) + this.address.hashCode();
        }

        public String toString() {
            return "Surrogate(full_name=" + this.full_name + ", date_of_birth=" + this.date_of_birth + ", national_insurance_number=" + this.national_insurance_number + ", address=" + this.address + ")";
        }

        /* compiled from: StreamPersonalInfoResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate;", "microgram.contracts.isa_transfer_funds.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamPersonalInfoResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.full_name = "";
            } else {
                this.full_name = str;
            }
            if ((i & 2) == 0) {
                this.date_of_birth = "";
            } else {
                this.date_of_birth = str2;
            }
            if ((i & 4) == 0) {
                this.national_insurance_number = "";
            } else {
                this.national_insurance_number = str3;
            }
            if ((i & 8) == 0) {
                this.address = "";
            } else {
                this.address = str4;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_isa_transfer_funds_proto_v1_externalRelease */
        public static final /* synthetic */ void m3762xd2f4d837(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.full_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.full_name);
            }
            if (!Intrinsics.areEqual(self.date_of_birth, "")) {
                output.encodeStringElement(serialDesc, 1, self.date_of_birth);
            }
            if (!Intrinsics.areEqual(self.national_insurance_number, "")) {
                output.encodeStringElement(serialDesc, 2, self.national_insurance_number);
            }
            if (Intrinsics.areEqual(self.address, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.address);
        }

        public Surrogate(String full_name, String date_of_birth, String national_insurance_number, String address) {
            Intrinsics.checkNotNullParameter(full_name, "full_name");
            Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
            Intrinsics.checkNotNullParameter(national_insurance_number, "national_insurance_number");
            Intrinsics.checkNotNullParameter(address, "address");
            this.full_name = full_name;
            this.date_of_birth = date_of_birth;
            this.national_insurance_number = national_insurance_number;
            this.address = address;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        public final String getFull_name() {
            return this.full_name;
        }

        public final String getDate_of_birth() {
            return this.date_of_birth;
        }

        public final String getNational_insurance_number() {
            return this.national_insurance_number;
        }

        public final String getAddress() {
            return this.address;
        }
    }

    /* compiled from: StreamPersonalInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.isa_transfer_funds.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<StreamPersonalInfoResponseDto, StreamPersonalInfoResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamPersonalInfoResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamPersonalInfoResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamPersonalInfoResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamPersonalInfoResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamPersonalInfoResponse> getProtoAdapter() {
            return StreamPersonalInfoResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamPersonalInfoResponseDto getZeroValue() {
            return StreamPersonalInfoResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamPersonalInfoResponseDto fromProto(StreamPersonalInfoResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new StreamPersonalInfoResponseDto(new Surrogate(proto.getFull_name(), proto.getDate_of_birth(), proto.getNational_insurance_number(), proto.getAddress()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.isa_transfer_funds.proto.v1.StreamPersonalInfoResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamPersonalInfoResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamPersonalInfoResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamPersonalInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.isa_transfer_funds.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamPersonalInfoResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.isa_transfer_funds.proto.v1.StreamPersonalInfoResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamPersonalInfoResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamPersonalInfoResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamPersonalInfoResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamPersonalInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/isa_transfer_funds/proto/v1/StreamPersonalInfoResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.isa_transfer_funds.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "microgram.contracts.isa_transfer_funds.proto.v1.StreamPersonalInfoResponseDto";
        }
    }
}
