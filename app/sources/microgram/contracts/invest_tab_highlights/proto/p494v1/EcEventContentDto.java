package microgram.contracts.invest_tab_highlights.proto.p494v1;

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
import microgram.contracts.invest_tab_highlights.proto.p494v1.ContractContentDto;

/* compiled from: EcEventContentDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004(')*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013¨\u0006+"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContent;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate;)V", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "left_contract", "right_contract", "", "status", "", "is_live", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;Ljava/lang/String;Z)V", "toProto", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContent;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate;", "getLeft_contract", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "getRight_contract", "getStatus", "Companion", "Surrogate", "Serializer", "MultibindingModule", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class EcEventContentDto implements Dto3<EcEventContent>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<EcEventContentDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<EcEventContentDto, EcEventContent>> binaryBase64Serializer$delegate;
    private static final EcEventContentDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ EcEventContentDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private EcEventContentDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ContractContentDto getLeft_contract() {
        return this.surrogate.getLeft_contract();
    }

    public final ContractContentDto getRight_contract() {
        return this.surrogate.getRight_contract();
    }

    public final String getStatus() {
        return this.surrogate.getStatus();
    }

    public /* synthetic */ EcEventContentDto(ContractContentDto contractContentDto, ContractContentDto contractContentDto2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : contractContentDto, (i & 2) != 0 ? null : contractContentDto2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcEventContentDto(ContractContentDto contractContentDto, ContractContentDto contractContentDto2, String status, boolean z) {
        this(new Surrogate(contractContentDto, contractContentDto2, status, z));
        Intrinsics.checkNotNullParameter(status, "status");
    }

    @Override // com.robinhood.idl.Dto
    public EcEventContent toProto() {
        ContractContentDto left_contract = this.surrogate.getLeft_contract();
        ContractContent proto = left_contract != null ? left_contract.toProto() : null;
        ContractContentDto right_contract = this.surrogate.getRight_contract();
        return new EcEventContent(proto, right_contract != null ? right_contract.toProto() : null, this.surrogate.getStatus(), this.surrogate.getIs_live(), null, 16, null);
    }

    public String toString() {
        return "[EcEventContentDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof EcEventContentDto) && Intrinsics.areEqual(((EcEventContentDto) other).surrogate, this.surrogate);
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
    /* compiled from: EcEventContentDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010$\u001a\u0004\b(\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b,\u0010$\u001a\u0004\b\b\u0010+¨\u0006/"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate;", "", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "left_contract", "right_contract", "", "status", "", "is_live", "<init>", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease", "(Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "getLeft_contract", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/ContractContentDto;", "getLeft_contract$annotations", "()V", "getRight_contract", "getRight_contract$annotations", "Ljava/lang/String;", "getStatus", "getStatus$annotations", "Z", "()Z", "is_live$annotations", "Companion", "$serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean is_live;
        private final ContractContentDto left_contract;
        private final ContractContentDto right_contract;
        private final String status;

        public Surrogate() {
            this((ContractContentDto) null, (ContractContentDto) null, (String) null, false, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.left_contract, surrogate.left_contract) && Intrinsics.areEqual(this.right_contract, surrogate.right_contract) && Intrinsics.areEqual(this.status, surrogate.status) && this.is_live == surrogate.is_live;
        }

        public int hashCode() {
            ContractContentDto contractContentDto = this.left_contract;
            int iHashCode = (contractContentDto == null ? 0 : contractContentDto.hashCode()) * 31;
            ContractContentDto contractContentDto2 = this.right_contract;
            return ((((iHashCode + (contractContentDto2 != null ? contractContentDto2.hashCode() : 0)) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.is_live);
        }

        public String toString() {
            return "Surrogate(left_contract=" + this.left_contract + ", right_contract=" + this.right_contract + ", status=" + this.status + ", is_live=" + this.is_live + ")";
        }

        /* compiled from: EcEventContentDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return EcEventContentDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ContractContentDto contractContentDto, ContractContentDto contractContentDto2, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.left_contract = null;
            } else {
                this.left_contract = contractContentDto;
            }
            if ((i & 2) == 0) {
                this.right_contract = null;
            } else {
                this.right_contract = contractContentDto2;
            }
            if ((i & 4) == 0) {
                this.status = "";
            } else {
                this.status = str;
            }
            if ((i & 8) == 0) {
                this.is_live = false;
            } else {
                this.is_live = z;
            }
        }

        @JvmStatic
        /* renamed from: write$Self$microgram_contracts_invest_tab_highlights_proto_v1_externalRelease */
        public static final /* synthetic */ void m3752x47065b30(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ContractContentDto contractContentDto = self.left_contract;
            if (contractContentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ContractContentDto.Serializer.INSTANCE, contractContentDto);
            }
            ContractContentDto contractContentDto2 = self.right_contract;
            if (contractContentDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ContractContentDto.Serializer.INSTANCE, contractContentDto2);
            }
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 2, self.status);
            }
            boolean z = self.is_live;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
        }

        public Surrogate(ContractContentDto contractContentDto, ContractContentDto contractContentDto2, String status, boolean z) {
            Intrinsics.checkNotNullParameter(status, "status");
            this.left_contract = contractContentDto;
            this.right_contract = contractContentDto2;
            this.status = status;
            this.is_live = z;
        }

        public final ContractContentDto getLeft_contract() {
            return this.left_contract;
        }

        public final ContractContentDto getRight_contract() {
            return this.right_contract;
        }

        public final String getStatus() {
            return this.status;
        }

        public /* synthetic */ Surrogate(ContractContentDto contractContentDto, ContractContentDto contractContentDto2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : contractContentDto, (i & 2) != 0 ? null : contractContentDto2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z);
        }

        /* renamed from: is_live, reason: from getter */
        public final boolean getIs_live() {
            return this.is_live;
        }
    }

    /* compiled from: EcEventContentDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContent;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<EcEventContentDto, EcEventContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EcEventContentDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EcEventContentDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<EcEventContentDto> getBinaryBase64Serializer() {
            return (KSerializer) EcEventContentDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<EcEventContent> getProtoAdapter() {
            return EcEventContent.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EcEventContentDto getZeroValue() {
            return EcEventContentDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public EcEventContentDto fromProto(EcEventContent proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ContractContent left_contract = proto.getLeft_contract();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ContractContentDto contractContentDtoFromProto = left_contract != null ? ContractContentDto.INSTANCE.fromProto(left_contract) : null;
            ContractContent right_contract = proto.getRight_contract();
            return new EcEventContentDto(new Surrogate(contractContentDtoFromProto, right_contract != null ? ContractContentDto.INSTANCE.fromProto(right_contract) : null, proto.getStatus(), proto.getIs_live()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.invest_tab_highlights.proto.v1.EcEventContentDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EcEventContentDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new EcEventContentDto(null, null, null, false, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: EcEventContentDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<EcEventContentDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.invest_tab_highlights.proto.v1.EcEventContent", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, EcEventContentDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public EcEventContentDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new EcEventContentDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: EcEventContentDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/invest_tab_highlights/proto/v1/EcEventContentDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "microgram.contracts.invest_tab_highlights.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "microgram.contracts.invest_tab_highlights.proto.v1.EcEventContentDto";
        }
    }
}
