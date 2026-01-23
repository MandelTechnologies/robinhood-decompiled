package microgram.contracts.instrument_service.proto.p493v1;

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
import rosetta.instrument.IPOAccessStatus;
import rosetta.instrument.IPOAccessStatusDto;
import rosetta.instrument.IssuerType;
import rosetta.instrument.IssuerTypeDto;

/* compiled from: StreamInstrumentResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate;)V", "Lrosetta/instrument/IssuerTypeDto;", "issuer_type", "Lrosetta/instrument/IPOAccessStatusDto;", "ipo_access_status", "", "instrument_id", "symbol", "(Lrosetta/instrument/IssuerTypeDto;Lrosetta/instrument/IPOAccessStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "instrument_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class StreamInstrumentResponseDto implements Dto3<StreamInstrumentResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamInstrumentResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamInstrumentResponseDto, StreamInstrumentResponse>> binaryBase64Serializer$delegate;
    private static final StreamInstrumentResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamInstrumentResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamInstrumentResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ StreamInstrumentResponseDto(IssuerTypeDto issuerTypeDto, IPOAccessStatusDto iPOAccessStatusDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : issuerTypeDto, (i & 2) != 0 ? null : iPOAccessStatusDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamInstrumentResponseDto(IssuerTypeDto issuerTypeDto, IPOAccessStatusDto iPOAccessStatusDto, String instrument_id, String symbol) {
        this(new Surrogate(issuerTypeDto, iPOAccessStatusDto, instrument_id, symbol));
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamInstrumentResponse toProto() {
        IssuerTypeDto issuer_type = this.surrogate.getIssuer_type();
        IssuerType issuerType = issuer_type != null ? (IssuerType) issuer_type.toProto() : null;
        IPOAccessStatusDto ipo_access_status = this.surrogate.getIpo_access_status();
        return new StreamInstrumentResponse(issuerType, ipo_access_status != null ? (IPOAccessStatus) ipo_access_status.toProto() : null, this.surrogate.getInstrument_id(), this.surrogate.getSymbol(), null, 16, null);
    }

    public String toString() {
        return "[StreamInstrumentResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamInstrumentResponseDto) && Intrinsics.areEqual(((StreamInstrumentResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamInstrumentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001aR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b.\u0010%\u001a\u0004\b-\u0010\u001a¨\u00061"}, m3636d2 = {"Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate;", "", "Lrosetta/instrument/IssuerTypeDto;", "issuer_type", "Lrosetta/instrument/IPOAccessStatusDto;", "ipo_access_status", "", "instrument_id", "symbol", "<init>", "(Lrosetta/instrument/IssuerTypeDto;Lrosetta/instrument/IPOAccessStatusDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/instrument/IssuerTypeDto;Lrosetta/instrument/IPOAccessStatusDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$instrument_service_proto_v1_externalRelease", "(Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/instrument/IssuerTypeDto;", "getIssuer_type", "()Lrosetta/instrument/IssuerTypeDto;", "getIssuer_type$annotations", "()V", "Lrosetta/instrument/IPOAccessStatusDto;", "getIpo_access_status", "()Lrosetta/instrument/IPOAccessStatusDto;", "getIpo_access_status$annotations", "Ljava/lang/String;", "getInstrument_id", "getInstrument_id$annotations", "getSymbol", "getSymbol$annotations", "Companion", "$serializer", "instrument_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String instrument_id;
        private final IPOAccessStatusDto ipo_access_status;
        private final IssuerTypeDto issuer_type;
        private final String symbol;

        public Surrogate() {
            this((IssuerTypeDto) null, (IPOAccessStatusDto) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.issuer_type == surrogate.issuer_type && this.ipo_access_status == surrogate.ipo_access_status && Intrinsics.areEqual(this.instrument_id, surrogate.instrument_id) && Intrinsics.areEqual(this.symbol, surrogate.symbol);
        }

        public int hashCode() {
            IssuerTypeDto issuerTypeDto = this.issuer_type;
            int iHashCode = (issuerTypeDto == null ? 0 : issuerTypeDto.hashCode()) * 31;
            IPOAccessStatusDto iPOAccessStatusDto = this.ipo_access_status;
            return ((((iHashCode + (iPOAccessStatusDto != null ? iPOAccessStatusDto.hashCode() : 0)) * 31) + this.instrument_id.hashCode()) * 31) + this.symbol.hashCode();
        }

        public String toString() {
            return "Surrogate(issuer_type=" + this.issuer_type + ", ipo_access_status=" + this.ipo_access_status + ", instrument_id=" + this.instrument_id + ", symbol=" + this.symbol + ")";
        }

        /* compiled from: StreamInstrumentResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate;", "instrument_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamInstrumentResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IssuerTypeDto issuerTypeDto, IPOAccessStatusDto iPOAccessStatusDto, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.issuer_type = null;
            } else {
                this.issuer_type = issuerTypeDto;
            }
            if ((i & 2) == 0) {
                this.ipo_access_status = null;
            } else {
                this.ipo_access_status = iPOAccessStatusDto;
            }
            if ((i & 4) == 0) {
                this.instrument_id = "";
            } else {
                this.instrument_id = str;
            }
            if ((i & 8) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$instrument_service_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            IssuerTypeDto issuerTypeDto = self.issuer_type;
            if (issuerTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IssuerTypeDto.Serializer.INSTANCE, issuerTypeDto);
            }
            IPOAccessStatusDto iPOAccessStatusDto = self.ipo_access_status;
            if (iPOAccessStatusDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IPOAccessStatusDto.Serializer.INSTANCE, iPOAccessStatusDto);
            }
            if (!Intrinsics.areEqual(self.instrument_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.instrument_id);
            }
            if (Intrinsics.areEqual(self.symbol, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.symbol);
        }

        public Surrogate(IssuerTypeDto issuerTypeDto, IPOAccessStatusDto iPOAccessStatusDto, String instrument_id, String symbol) {
            Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            this.issuer_type = issuerTypeDto;
            this.ipo_access_status = iPOAccessStatusDto;
            this.instrument_id = instrument_id;
            this.symbol = symbol;
        }

        public /* synthetic */ Surrogate(IssuerTypeDto issuerTypeDto, IPOAccessStatusDto iPOAccessStatusDto, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : issuerTypeDto, (i & 2) != 0 ? null : iPOAccessStatusDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
        }

        public final IssuerTypeDto getIssuer_type() {
            return this.issuer_type;
        }

        public final IPOAccessStatusDto getIpo_access_status() {
            return this.ipo_access_status;
        }

        public final String getInstrument_id() {
            return this.instrument_id;
        }

        public final String getSymbol() {
            return this.symbol;
        }
    }

    /* compiled from: StreamInstrumentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto;", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "instrument_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamInstrumentResponseDto, StreamInstrumentResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamInstrumentResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamInstrumentResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamInstrumentResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamInstrumentResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamInstrumentResponse> getProtoAdapter() {
            return StreamInstrumentResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamInstrumentResponseDto getZeroValue() {
            return StreamInstrumentResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamInstrumentResponseDto fromProto(StreamInstrumentResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            IssuerType issuer_type = proto.getIssuer_type();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IssuerTypeDto issuerTypeDtoFromProto = issuer_type != null ? IssuerTypeDto.INSTANCE.fromProto(issuer_type) : null;
            IPOAccessStatus ipo_access_status = proto.getIpo_access_status();
            return new StreamInstrumentResponseDto(new Surrogate(issuerTypeDtoFromProto, ipo_access_status != null ? IPOAccessStatusDto.INSTANCE.fromProto(ipo_access_status) : null, proto.getInstrument_id(), proto.getSymbol()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.instrument_service.proto.v1.StreamInstrumentResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamInstrumentResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamInstrumentResponseDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamInstrumentResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "instrument_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamInstrumentResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.instrument_service.proto.v1.StreamInstrumentResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamInstrumentResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamInstrumentResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamInstrumentResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamInstrumentResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/instrument_service/proto/v1/StreamInstrumentResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "instrument_service.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "microgram.contracts.instrument_service.proto.v1.StreamInstrumentResponseDto";
        }
    }
}
