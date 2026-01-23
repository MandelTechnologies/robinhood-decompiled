package microgram.contracts.crypto_trading_tax_lots.proto.p486v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
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

/* compiled from: StreamCryptoTradeFeeEstimationAmountResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"!#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006%"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponse;", "Landroid/os/Parcelable;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate;", "surrogate", "<init>", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "fee_ratio", "min_fee_quote_amount", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes14.dex */
public final class StreamCryptoTradeFeeEstimationAmountResponseDto implements Dto3<StreamCryptoTradeFeeEstimationAmountResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamCryptoTradeFeeEstimationAmountResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamCryptoTradeFeeEstimationAmountResponseDto, StreamCryptoTradeFeeEstimationAmountResponse>> binaryBase64Serializer$delegate;
    private static final StreamCryptoTradeFeeEstimationAmountResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamCryptoTradeFeeEstimationAmountResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamCryptoTradeFeeEstimationAmountResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public StreamCryptoTradeFeeEstimationAmountResponseDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
        this(new Surrogate(idlDecimal, idlDecimal2));
    }

    public /* synthetic */ StreamCryptoTradeFeeEstimationAmountResponseDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2);
    }

    @Override // com.robinhood.idl.Dto
    public StreamCryptoTradeFeeEstimationAmountResponse toProto() {
        IdlDecimal fee_ratio = this.surrogate.getFee_ratio();
        String stringValue = fee_ratio != null ? fee_ratio.getStringValue() : null;
        IdlDecimal min_fee_quote_amount = this.surrogate.getMin_fee_quote_amount();
        return new StreamCryptoTradeFeeEstimationAmountResponse(stringValue, min_fee_quote_amount != null ? min_fee_quote_amount.getStringValue() : null, null, 4, null);
    }

    public String toString() {
        return "[StreamCryptoTradeFeeEstimationAmountResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamCryptoTradeFeeEstimationAmountResponseDto) && Intrinsics.areEqual(((StreamCryptoTradeFeeEstimationAmountResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamCryptoTradeFeeEstimationAmountResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B=\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\b\u0010\tB/\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#¨\u0006*"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "fee_ratio", "min_fee_quote_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_trading_tax_lots_proto_v1_externalRelease", "(Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio", "()Lcom/robinhood/idl/IdlDecimal;", "getFee_ratio$annotations", "()V", "getMin_fee_quote_amount", "getMin_fee_quote_amount$annotations", "Companion", "$serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final IdlDecimal fee_ratio;
        private final IdlDecimal min_fee_quote_amount;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((IdlDecimal) null, (IdlDecimal) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.fee_ratio, surrogate.fee_ratio) && Intrinsics.areEqual(this.min_fee_quote_amount, surrogate.min_fee_quote_amount);
        }

        public int hashCode() {
            IdlDecimal idlDecimal = this.fee_ratio;
            int iHashCode = (idlDecimal == null ? 0 : idlDecimal.hashCode()) * 31;
            IdlDecimal idlDecimal2 = this.min_fee_quote_amount;
            return iHashCode + (idlDecimal2 != null ? idlDecimal2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(fee_ratio=" + this.fee_ratio + ", min_fee_quote_amount=" + this.min_fee_quote_amount + ")";
        }

        /* compiled from: StreamCryptoTradeFeeEstimationAmountResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamCryptoTradeFeeEstimationAmountResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.fee_ratio = null;
            } else {
                this.fee_ratio = idlDecimal;
            }
            if ((i & 2) == 0) {
                this.min_fee_quote_amount = null;
            } else {
                this.min_fee_quote_amount = idlDecimal2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_trading_tax_lots_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            IdlDecimal idlDecimal = self.fee_ratio;
            if (idlDecimal != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
            }
            IdlDecimal idlDecimal2 = self.min_fee_quote_amount;
            if (idlDecimal2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, idlDecimal2);
            }
        }

        public Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2) {
            this.fee_ratio = idlDecimal;
            this.min_fee_quote_amount = idlDecimal2;
        }

        public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2);
        }

        public final IdlDecimal getFee_ratio() {
            return this.fee_ratio;
        }

        public final IdlDecimal getMin_fee_quote_amount() {
            return this.min_fee_quote_amount;
        }
    }

    /* compiled from: StreamCryptoTradeFeeEstimationAmountResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamCryptoTradeFeeEstimationAmountResponseDto, StreamCryptoTradeFeeEstimationAmountResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamCryptoTradeFeeEstimationAmountResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoTradeFeeEstimationAmountResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoTradeFeeEstimationAmountResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamCryptoTradeFeeEstimationAmountResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamCryptoTradeFeeEstimationAmountResponse> getProtoAdapter() {
            return StreamCryptoTradeFeeEstimationAmountResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoTradeFeeEstimationAmountResponseDto getZeroValue() {
            return StreamCryptoTradeFeeEstimationAmountResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoTradeFeeEstimationAmountResponseDto fromProto(StreamCryptoTradeFeeEstimationAmountResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String fee_ratio = proto.getFee_ratio();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IdlDecimal idlDecimal = fee_ratio != null ? new IdlDecimal(fee_ratio) : null;
            String min_fee_quote_amount = proto.getMin_fee_quote_amount();
            return new StreamCryptoTradeFeeEstimationAmountResponseDto(new Surrogate(idlDecimal, min_fee_quote_amount != null ? new IdlDecimal(min_fee_quote_amount) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamCryptoTradeFeeEstimationAmountResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamCryptoTradeFeeEstimationAmountResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamCryptoTradeFeeEstimationAmountResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamCryptoTradeFeeEstimationAmountResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto;", "<init>", "()V", "surrogateSerializer", "Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamCryptoTradeFeeEstimationAmountResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamCryptoTradeFeeEstimationAmountResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamCryptoTradeFeeEstimationAmountResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamCryptoTradeFeeEstimationAmountResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamCryptoTradeFeeEstimationAmountResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: StreamCryptoTradeFeeEstimationAmountResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/contracts/crypto_trading_tax_lots/proto/v1/StreamCryptoTradeFeeEstimationAmountResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "microgram.contracts.crypto_trading_tax_lots.proto.v1.StreamCryptoTradeFeeEstimationAmountResponseDto";
        }
    }
}
