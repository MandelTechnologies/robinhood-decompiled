package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.BillingAccount;
import bff_money_movement.service.p019v1.BillingAccountDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.newsfeed.model.Content;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.robinhood.rosetta.common.Date;
import com.robinhood.rosetta.common.DateDto;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresRequest;
import contracts.crypto.trade.proto.p431v1.StreamCryptoDisclosuresRequestDto;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
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
import rosetta.nummus.CurrencyPair;
import rosetta.nummus.CurrencyPairDto;

/* compiled from: StreamCryptoDisclosuresRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006! \"#$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto;", "location", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate;", "Companion", "Surrogate", "LocationDto", "CryptoTradingDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class StreamCryptoDisclosuresRequestDto implements Dto3<StreamCryptoDisclosuresRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<StreamCryptoDisclosuresRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StreamCryptoDisclosuresRequestDto, StreamCryptoDisclosuresRequest>> binaryBase64Serializer$delegate;
    private static final StreamCryptoDisclosuresRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ StreamCryptoDisclosuresRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StreamCryptoDisclosuresRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StreamCryptoDisclosuresRequestDto(LocationDto locationDto) {
        LocationDto.CryptoTrading cryptoTrading = locationDto instanceof LocationDto.CryptoTrading ? (LocationDto.CryptoTrading) locationDto : null;
        this(new Surrogate(cryptoTrading != null ? cryptoTrading.getValue() : null));
    }

    public /* synthetic */ StreamCryptoDisclosuresRequestDto(LocationDto locationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : locationDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public StreamCryptoDisclosuresRequest toProto() {
        CryptoTradingDto crypto_trading = this.surrogate.getCrypto_trading();
        return new StreamCryptoDisclosuresRequest(crypto_trading != null ? crypto_trading.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[StreamCryptoDisclosuresRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof StreamCryptoDisclosuresRequestDto) && Intrinsics.areEqual(((StreamCryptoDisclosuresRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "crypto_trading", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "getCrypto_trading", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "getCrypto_trading$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final CryptoTradingDto crypto_trading;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((CryptoTradingDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.crypto_trading, ((Surrogate) other).crypto_trading);
        }

        public int hashCode() {
            CryptoTradingDto cryptoTradingDto = this.crypto_trading;
            if (cryptoTradingDto == null) {
                return 0;
            }
            return cryptoTradingDto.hashCode();
        }

        public String toString() {
            return "Surrogate(crypto_trading=" + this.crypto_trading + ")";
        }

        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return StreamCryptoDisclosuresRequestDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, CryptoTradingDto cryptoTradingDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.crypto_trading = null;
            } else {
                this.crypto_trading = cryptoTradingDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            CryptoTradingDto cryptoTradingDto = self.crypto_trading;
            if (cryptoTradingDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, CryptoTradingDto.Serializer.INSTANCE, cryptoTradingDto);
            }
        }

        public Surrogate(CryptoTradingDto cryptoTradingDto) {
            this.crypto_trading = cryptoTradingDto;
        }

        public /* synthetic */ Surrogate(CryptoTradingDto cryptoTradingDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cryptoTradingDto);
        }

        public final CryptoTradingDto getCrypto_trading() {
            return this.crypto_trading;
        }
    }

    /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<StreamCryptoDisclosuresRequestDto, StreamCryptoDisclosuresRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StreamCryptoDisclosuresRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoDisclosuresRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StreamCryptoDisclosuresRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) StreamCryptoDisclosuresRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StreamCryptoDisclosuresRequest> getProtoAdapter() {
            return StreamCryptoDisclosuresRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoDisclosuresRequestDto getZeroValue() {
            return StreamCryptoDisclosuresRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StreamCryptoDisclosuresRequestDto fromProto(StreamCryptoDisclosuresRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StreamCryptoDisclosuresRequest.CryptoTrading crypto_trading = proto.getCrypto_trading();
            return new StreamCryptoDisclosuresRequestDto(new Surrogate(crypto_trading != null ? CryptoTradingDto.INSTANCE.fromProto(crypto_trading) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StreamCryptoDisclosuresRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new StreamCryptoDisclosuresRequestDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0006¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "CryptoTrading", "Companion", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto$CryptoTrading;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class LocationDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ LocationDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LocationDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto$CryptoTrading;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class CryptoTrading extends LocationDto {
            private final CryptoTradingDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CryptoTrading) && Intrinsics.areEqual(this.value, ((CryptoTrading) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "CryptoTrading(value=" + this.value + ")";
            }

            public final CryptoTradingDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CryptoTrading(CryptoTradingDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$LocationDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<LocationDto, StreamCryptoDisclosuresRequest> {
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
            public ProtoAdapter<StreamCryptoDisclosuresRequest> getProtoAdapter() {
                return StreamCryptoDisclosuresRequest.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public LocationDto fromProto(StreamCryptoDisclosuresRequest proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getCrypto_trading() != null) {
                    return new CryptoTrading(CryptoTradingDto.INSTANCE.fromProto(proto.getCrypto_trading()));
                }
                return null;
            }
        }
    }

    /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006&%'()*B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$¨\u0006+"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate;)V", "Lrosetta/nummus/CurrencyPairDto;", Content.MarketIndicator.CRYPTO_TYPE, "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "recurring_info", "Lbff_money_movement/service/v1/BillingAccountDto;", "payment_method", "", "is_replacing_order", "(Lrosetta/nummus/CurrencyPairDto;Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;Lbff_money_movement/service/v1/BillingAccountDto;Z)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading;", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate;", "Companion", "Surrogate", "InvestmentFrequencyDto", "RecurringInfoDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CryptoTradingDto implements Dto3<StreamCryptoDisclosuresRequest.CryptoTrading>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<CryptoTradingDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CryptoTradingDto, StreamCryptoDisclosuresRequest.CryptoTrading>> binaryBase64Serializer$delegate;
        private static final CryptoTradingDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ CryptoTradingDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CryptoTradingDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public /* synthetic */ CryptoTradingDto(CurrencyPairDto currencyPairDto, RecurringInfoDto recurringInfoDto, BillingAccountDto billingAccountDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : currencyPairDto, (i & 2) != 0 ? null : recurringInfoDto, (i & 4) != 0 ? null : billingAccountDto, (i & 8) != 0 ? false : z);
        }

        public CryptoTradingDto(CurrencyPairDto currencyPairDto, RecurringInfoDto recurringInfoDto, BillingAccountDto billingAccountDto, boolean z) {
            this(new Surrogate(currencyPairDto, recurringInfoDto, billingAccountDto, z));
        }

        @Override // com.robinhood.idl.Dto
        public StreamCryptoDisclosuresRequest.CryptoTrading toProto() {
            CurrencyPairDto currency_pair = this.surrogate.getCurrency_pair();
            CurrencyPair proto = currency_pair != null ? currency_pair.toProto() : null;
            RecurringInfoDto recurring_info = this.surrogate.getRecurring_info();
            StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo proto2 = recurring_info != null ? recurring_info.toProto() : null;
            BillingAccountDto payment_method = this.surrogate.getPayment_method();
            return new StreamCryptoDisclosuresRequest.CryptoTrading(proto, proto2, payment_method != null ? payment_method.toProto() : null, this.surrogate.getIs_replacing_order(), null, 16, null);
        }

        public String toString() {
            return "[CryptoTradingDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof CryptoTradingDto) && Intrinsics.areEqual(((CryptoTradingDto) other).surrogate, this.surrogate);
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
        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b*\u0010&\u001a\u0004\b(\u0010)R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010/\u0012\u0004\b1\u0010&\u001a\u0004\b\t\u00100¨\u00064"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate;", "", "Lrosetta/nummus/CurrencyPairDto;", Content.MarketIndicator.CRYPTO_TYPE, "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "recurring_info", "Lbff_money_movement/service/v1/BillingAccountDto;", "payment_method", "", "is_replacing_order", "<init>", "(Lrosetta/nummus/CurrencyPairDto;Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;Lbff_money_movement/service/v1/BillingAccountDto;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/nummus/CurrencyPairDto;Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;Lbff_money_movement/service/v1/BillingAccountDto;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/nummus/CurrencyPairDto;", "getCurrency_pair", "()Lrosetta/nummus/CurrencyPairDto;", "getCurrency_pair$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "getRecurring_info", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "getRecurring_info$annotations", "Lbff_money_movement/service/v1/BillingAccountDto;", "getPayment_method", "()Lbff_money_movement/service/v1/BillingAccountDto;", "getPayment_method$annotations", "Z", "()Z", "is_replacing_order$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final CurrencyPairDto currency_pair;
            private final boolean is_replacing_order;
            private final BillingAccountDto payment_method;
            private final RecurringInfoDto recurring_info;

            public Surrogate() {
                this((CurrencyPairDto) null, (RecurringInfoDto) null, (BillingAccountDto) null, false, 15, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.currency_pair, surrogate.currency_pair) && Intrinsics.areEqual(this.recurring_info, surrogate.recurring_info) && Intrinsics.areEqual(this.payment_method, surrogate.payment_method) && this.is_replacing_order == surrogate.is_replacing_order;
            }

            public int hashCode() {
                CurrencyPairDto currencyPairDto = this.currency_pair;
                int iHashCode = (currencyPairDto == null ? 0 : currencyPairDto.hashCode()) * 31;
                RecurringInfoDto recurringInfoDto = this.recurring_info;
                int iHashCode2 = (iHashCode + (recurringInfoDto == null ? 0 : recurringInfoDto.hashCode())) * 31;
                BillingAccountDto billingAccountDto = this.payment_method;
                return ((iHashCode2 + (billingAccountDto != null ? billingAccountDto.hashCode() : 0)) * 31) + Boolean.hashCode(this.is_replacing_order);
            }

            public String toString() {
                return "Surrogate(currency_pair=" + this.currency_pair + ", recurring_info=" + this.recurring_info + ", payment_method=" + this.payment_method + ", is_replacing_order=" + this.is_replacing_order + ")";
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return StreamCryptoDisclosuresRequestDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, CurrencyPairDto currencyPairDto, RecurringInfoDto recurringInfoDto, BillingAccountDto billingAccountDto, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.currency_pair = null;
                } else {
                    this.currency_pair = currencyPairDto;
                }
                if ((i & 2) == 0) {
                    this.recurring_info = null;
                } else {
                    this.recurring_info = recurringInfoDto;
                }
                if ((i & 4) == 0) {
                    this.payment_method = null;
                } else {
                    this.payment_method = billingAccountDto;
                }
                if ((i & 8) == 0) {
                    this.is_replacing_order = false;
                } else {
                    this.is_replacing_order = z;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                CurrencyPairDto currencyPairDto = self.currency_pair;
                if (currencyPairDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, CurrencyPairDto.Serializer.INSTANCE, currencyPairDto);
                }
                RecurringInfoDto recurringInfoDto = self.recurring_info;
                if (recurringInfoDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, RecurringInfoDto.Serializer.INSTANCE, recurringInfoDto);
                }
                BillingAccountDto billingAccountDto = self.payment_method;
                if (billingAccountDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, BillingAccountDto.Serializer.INSTANCE, billingAccountDto);
                }
                boolean z = self.is_replacing_order;
                if (z) {
                    output.encodeBooleanElement(serialDesc, 3, z);
                }
            }

            public Surrogate(CurrencyPairDto currencyPairDto, RecurringInfoDto recurringInfoDto, BillingAccountDto billingAccountDto, boolean z) {
                this.currency_pair = currencyPairDto;
                this.recurring_info = recurringInfoDto;
                this.payment_method = billingAccountDto;
                this.is_replacing_order = z;
            }

            public /* synthetic */ Surrogate(CurrencyPairDto currencyPairDto, RecurringInfoDto recurringInfoDto, BillingAccountDto billingAccountDto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : currencyPairDto, (i & 2) != 0 ? null : recurringInfoDto, (i & 4) != 0 ? null : billingAccountDto, (i & 8) != 0 ? false : z);
            }

            public final CurrencyPairDto getCurrency_pair() {
                return this.currency_pair;
            }

            public final RecurringInfoDto getRecurring_info() {
                return this.recurring_info;
            }

            public final BillingAccountDto getPayment_method() {
                return this.payment_method;
            }

            /* renamed from: is_replacing_order, reason: from getter */
            public final boolean getIs_replacing_order() {
                return this.is_replacing_order;
            }
        }

        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<CryptoTradingDto, StreamCryptoDisclosuresRequest.CryptoTrading> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CryptoTradingDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoTradingDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CryptoTradingDto> getBinaryBase64Serializer() {
                return (KSerializer) CryptoTradingDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<StreamCryptoDisclosuresRequest.CryptoTrading> getProtoAdapter() {
                return StreamCryptoDisclosuresRequest.CryptoTrading.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoTradingDto getZeroValue() {
                return CryptoTradingDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CryptoTradingDto fromProto(StreamCryptoDisclosuresRequest.CryptoTrading proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                CurrencyPair currency_pair = proto.getCurrency_pair();
                DefaultConstructorMarker defaultConstructorMarker = null;
                CurrencyPairDto currencyPairDtoFromProto = currency_pair != null ? CurrencyPairDto.INSTANCE.fromProto(currency_pair) : null;
                StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo recurring_info = proto.getRecurring_info();
                RecurringInfoDto recurringInfoDtoFromProto = recurring_info != null ? RecurringInfoDto.INSTANCE.fromProto(recurring_info) : null;
                BillingAccount payment_method = proto.getPayment_method();
                return new CryptoTradingDto(new Surrogate(currencyPairDtoFromProto, recurringInfoDtoFromProto, payment_method != null ? BillingAccountDto.INSTANCE.fromProto(payment_method) : null, proto.getIs_replacing_order()), defaultConstructorMarker);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequestDto$CryptoTradingDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return StreamCryptoDisclosuresRequestDto.CryptoTradingDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new CryptoTradingDto(null, null, null, false, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "Lcom/robinhood/idl/EnumDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "INVESTMENT_FREQUENCY_UNSPECIFIED", "DAILY", "WEEKLY", "BIWEEKLY", "MONTHLY", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class InvestmentFrequencyDto implements Dto2<StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ InvestmentFrequencyDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<InvestmentFrequencyDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<InvestmentFrequencyDto, StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency>> binaryBase64Serializer$delegate;
            private final String json_value;
            public static final InvestmentFrequencyDto INVESTMENT_FREQUENCY_UNSPECIFIED = new INVESTMENT_FREQUENCY_UNSPECIFIED("INVESTMENT_FREQUENCY_UNSPECIFIED", 0);
            public static final InvestmentFrequencyDto DAILY = new DAILY("DAILY", 1);
            public static final InvestmentFrequencyDto WEEKLY = new WEEKLY("WEEKLY", 2);
            public static final InvestmentFrequencyDto BIWEEKLY = new BIWEEKLY("BIWEEKLY", 3);
            public static final InvestmentFrequencyDto MONTHLY = new MONTHLY("MONTHLY", 4);

            private static final /* synthetic */ InvestmentFrequencyDto[] $values() {
                return new InvestmentFrequencyDto[]{INVESTMENT_FREQUENCY_UNSPECIFIED, DAILY, WEEKLY, BIWEEKLY, MONTHLY};
            }

            public /* synthetic */ InvestmentFrequencyDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, str2);
            }

            public static EnumEntries<InvestmentFrequencyDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private InvestmentFrequencyDto(String str, int i, String str2) {
                this.json_value = str2;
            }

            public final String getJson_value() {
                return this.json_value;
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.INVESTMENT_FREQUENCY_UNSPECIFIED", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class INVESTMENT_FREQUENCY_UNSPECIFIED extends InvestmentFrequencyDto {
                INVESTMENT_FREQUENCY_UNSPECIFIED(String str, int i) {
                    super(str, i, "", null);
                }

                @Override // com.robinhood.idl.Dto
                public StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency toProto() {
                    return StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED;
                }
            }

            static {
                InvestmentFrequencyDto[] investmentFrequencyDtoArr$values = $values();
                $VALUES = investmentFrequencyDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(investmentFrequencyDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.DAILY", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class DAILY extends InvestmentFrequencyDto {
                DAILY(String str, int i) {
                    super(str, i, "daily", null);
                }

                @Override // com.robinhood.idl.Dto
                public StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency toProto() {
                    return StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.DAILY;
                }
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.WEEKLY", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class WEEKLY extends InvestmentFrequencyDto {
                WEEKLY(String str, int i) {
                    super(str, i, "weekly", null);
                }

                @Override // com.robinhood.idl.Dto
                public StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency toProto() {
                    return StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.WEEKLY;
                }
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.BIWEEKLY", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class BIWEEKLY extends InvestmentFrequencyDto {
                BIWEEKLY(String str, int i) {
                    super(str, i, "biweekly", null);
                }

                @Override // com.robinhood.idl.Dto
                public StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency toProto() {
                    return StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.BIWEEKLY;
                }
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"contracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto.CryptoTradingDto.InvestmentFrequencyDto.MONTHLY", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "toProto", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class MONTHLY extends InvestmentFrequencyDto {
                MONTHLY(String str, int i) {
                    super(str, i, "monthly", null);
                }

                @Override // com.robinhood.idl.Dto
                public StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency toProto() {
                    return StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.MONTHLY;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$InvestmentFrequency;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<InvestmentFrequencyDto, StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency> {

                /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.values().length];
                        try {
                            iArr[StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.INVESTMENT_FREQUENCY_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.DAILY.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.WEEKLY.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.BIWEEKLY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.MONTHLY.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<InvestmentFrequencyDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InvestmentFrequencyDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<InvestmentFrequencyDto> getBinaryBase64Serializer() {
                    return (KSerializer) InvestmentFrequencyDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency> getProtoAdapter() {
                    return StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InvestmentFrequencyDto getZeroValue() {
                    return InvestmentFrequencyDto.INVESTMENT_FREQUENCY_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public InvestmentFrequencyDto fromProto(StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return InvestmentFrequencyDto.INVESTMENT_FREQUENCY_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return InvestmentFrequencyDto.DAILY;
                    }
                    if (i == 3) {
                        return InvestmentFrequencyDto.WEEKLY;
                    }
                    if (i == 4) {
                        return InvestmentFrequencyDto.BIWEEKLY;
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return InvestmentFrequencyDto.MONTHLY;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<InvestmentFrequencyDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<InvestmentFrequencyDto, StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency", InvestmentFrequencyDto.getEntries(), InvestmentFrequencyDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public InvestmentFrequencyDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (InvestmentFrequencyDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, InvestmentFrequencyDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static InvestmentFrequencyDto valueOf(String str) {
                return (InvestmentFrequencyDto) Enum.valueOf(InvestmentFrequencyDto.class, str);
            }

            public static InvestmentFrequencyDto[] values() {
                return (InvestmentFrequencyDto[]) $VALUES.clone();
            }
        }

        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "frequency", "Lcom/robinhood/rosetta/common/DateDto;", "start_date", "Lcom/robinhood/idl/IdlDecimal;", "quote_amount", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class RecurringInfoDto implements Dto3<StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<RecurringInfoDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<RecurringInfoDto, StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo>> binaryBase64Serializer$delegate;
            private static final RecurringInfoDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ RecurringInfoDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private RecurringInfoDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public /* synthetic */ RecurringInfoDto(InvestmentFrequencyDto investmentFrequencyDto, DateDto dateDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? InvestmentFrequencyDto.INSTANCE.getZeroValue() : investmentFrequencyDto, (i & 2) != 0 ? null : dateDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public RecurringInfoDto(InvestmentFrequencyDto frequency, DateDto dateDto, IdlDecimal quote_amount) {
                this(new Surrogate(frequency, dateDto, quote_amount));
                Intrinsics.checkNotNullParameter(frequency, "frequency");
                Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo toProto() {
                StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency investmentFrequency = (StreamCryptoDisclosuresRequest.CryptoTrading.InvestmentFrequency) this.surrogate.getFrequency().toProto();
                DateDto start_date = this.surrogate.getStart_date();
                return new StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo(investmentFrequency, start_date != null ? start_date.toProto() : null, this.surrogate.getQuote_amount().getStringValue(), null, 8, null);
            }

            public String toString() {
                return "[RecurringInfoDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof RecurringInfoDto) && Intrinsics.areEqual(((RecurringInfoDto) other).surrogate, this.surrogate);
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
            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000221B6\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t¢\u0006\u0004\b\u000b\u0010\fB9\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b,\u0010(\u001a\u0004\b*\u0010+R/\u0010\n\u001a\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\t0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u0010(\u001a\u0004\b.\u0010/¨\u00063"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "frequency", "Lcom/robinhood/rosetta/common/DateDto;", "start_date", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quote_amount", "<init>", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;Lcom/robinhood/rosetta/common/DateDto;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "getFrequency", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$InvestmentFrequencyDto;", "getFrequency$annotations", "()V", "Lcom/robinhood/rosetta/common/DateDto;", "getStart_date", "()Lcom/robinhood/rosetta/common/DateDto;", "getStart_date$annotations", "Lcom/robinhood/idl/IdlDecimal;", "getQuote_amount", "()Lcom/robinhood/idl/IdlDecimal;", "getQuote_amount$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final InvestmentFrequencyDto frequency;
                private final IdlDecimal quote_amount;
                private final DateDto start_date;

                public Surrogate() {
                    this((InvestmentFrequencyDto) null, (DateDto) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return this.frequency == surrogate.frequency && Intrinsics.areEqual(this.start_date, surrogate.start_date) && Intrinsics.areEqual(this.quote_amount, surrogate.quote_amount);
                }

                public int hashCode() {
                    int iHashCode = this.frequency.hashCode() * 31;
                    DateDto dateDto = this.start_date;
                    return ((iHashCode + (dateDto == null ? 0 : dateDto.hashCode())) * 31) + this.quote_amount.hashCode();
                }

                public String toString() {
                    return "Surrogate(frequency=" + this.frequency + ", start_date=" + this.start_date + ", quote_amount=" + this.quote_amount + ")";
                }

                /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return StreamCryptoDisclosuresRequestDto2.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, InvestmentFrequencyDto investmentFrequencyDto, DateDto dateDto, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    this.frequency = (i & 1) == 0 ? InvestmentFrequencyDto.INSTANCE.getZeroValue() : investmentFrequencyDto;
                    if ((i & 2) == 0) {
                        this.start_date = null;
                    } else {
                        this.start_date = dateDto;
                    }
                    if ((i & 4) == 0) {
                        this.quote_amount = new IdlDecimal("");
                    } else {
                        this.quote_amount = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (self.frequency != InvestmentFrequencyDto.INSTANCE.getZeroValue()) {
                        output.encodeSerializableElement(serialDesc, 0, InvestmentFrequencyDto.Serializer.INSTANCE, self.frequency);
                    }
                    DateDto dateDto = self.start_date;
                    if (dateDto != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, DateDto.Serializer.INSTANCE, dateDto);
                    }
                    if (Intrinsics.areEqual(self.quote_amount, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.quote_amount);
                }

                public Surrogate(InvestmentFrequencyDto frequency, DateDto dateDto, IdlDecimal quote_amount) {
                    Intrinsics.checkNotNullParameter(frequency, "frequency");
                    Intrinsics.checkNotNullParameter(quote_amount, "quote_amount");
                    this.frequency = frequency;
                    this.start_date = dateDto;
                    this.quote_amount = quote_amount;
                }

                public final InvestmentFrequencyDto getFrequency() {
                    return this.frequency;
                }

                public /* synthetic */ Surrogate(InvestmentFrequencyDto investmentFrequencyDto, DateDto dateDto, IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? InvestmentFrequencyDto.INSTANCE.getZeroValue() : investmentFrequencyDto, (i & 2) != 0 ? null : dateDto, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal);
                }

                public final DateDto getStart_date() {
                    return this.start_date;
                }

                public final IdlDecimal getQuote_amount() {
                    return this.quote_amount;
                }
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequest$CryptoTrading$RecurringInfo;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<RecurringInfoDto, StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<RecurringInfoDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<RecurringInfoDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<RecurringInfoDto> getBinaryBase64Serializer() {
                    return (KSerializer) RecurringInfoDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo> getProtoAdapter() {
                    return StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public RecurringInfoDto getZeroValue() {
                    return RecurringInfoDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public RecurringInfoDto fromProto(StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    InvestmentFrequencyDto investmentFrequencyDtoFromProto = InvestmentFrequencyDto.INSTANCE.fromProto(proto.getFrequency());
                    Date start_date = proto.getStart_date();
                    return new RecurringInfoDto(new Surrogate(investmentFrequencyDtoFromProto, start_date != null ? DateDto.INSTANCE.fromProto(start_date) : null, new IdlDecimal(proto.getQuote_amount())), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StreamCryptoDisclosuresRequestDto.CryptoTradingDto.RecurringInfoDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new RecurringInfoDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<RecurringInfoDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest.CryptoTrading.RecurringInfo", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, RecurringInfoDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public RecurringInfoDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new RecurringInfoDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequestDto$CryptoTradingDto$RecurringInfoDto";
                }
            }
        }

        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CryptoTradingDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest.CryptoTrading", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CryptoTradingDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public CryptoTradingDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new CryptoTradingDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$CryptoTradingDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4192_8)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequestDto$CryptoTradingDto";
            }
        }
    }

    /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StreamCryptoDisclosuresRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StreamCryptoDisclosuresRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public StreamCryptoDisclosuresRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new StreamCryptoDisclosuresRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: StreamCryptoDisclosuresRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/StreamCryptoDisclosuresRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.StreamCryptoDisclosuresRequestDto";
        }
    }
}
