package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.bidask.BidAskDetails3;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.IdlDecimalSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsRequest;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsRequestDto;
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

/* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005\"!#$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "order_side", "", "currency_pair_id", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;Ljava/lang/String;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate;", "Companion", "Surrogate", "OrderSideDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class CalculateCryptoMarketOrderPillsRequestDto implements Dto3<CalculateCryptoMarketOrderPillsRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CalculateCryptoMarketOrderPillsRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CalculateCryptoMarketOrderPillsRequestDto, CalculateCryptoMarketOrderPillsRequest>> binaryBase64Serializer$delegate;
    private static final CalculateCryptoMarketOrderPillsRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CalculateCryptoMarketOrderPillsRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CalculateCryptoMarketOrderPillsRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalculateCryptoMarketOrderPillsRequestDto(OrderSideDto orderSideDto, String currency_pair_id) {
        this(new Surrogate(orderSideDto, currency_pair_id));
        Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
    }

    public /* synthetic */ CalculateCryptoMarketOrderPillsRequestDto(OrderSideDto orderSideDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orderSideDto, (i & 2) != 0 ? "" : str);
    }

    @Override // com.robinhood.idl.Dto
    public CalculateCryptoMarketOrderPillsRequest toProto() {
        OrderSideDto order_side = this.surrogate.getOrder_side();
        return new CalculateCryptoMarketOrderPillsRequest(order_side != null ? order_side.toProto() : null, this.surrogate.getCurrency_pair_id(), null, 4, null);
    }

    public String toString() {
        return "[CalculateCryptoMarketOrderPillsRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CalculateCryptoMarketOrderPillsRequestDto) && Intrinsics.areEqual(((CalculateCryptoMarketOrderPillsRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b%\u0010\"\u001a\u0004\b$\u0010\u0017¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "order_side", "", "currency_pair_id", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "getOrder_side", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "getOrder_side$annotations", "()V", "Ljava/lang/String;", "getCurrency_pair_id", "getCurrency_pair_id$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String currency_pair_id;
        private final OrderSideDto order_side;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((OrderSideDto) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.order_side, surrogate.order_side) && Intrinsics.areEqual(this.currency_pair_id, surrogate.currency_pair_id);
        }

        public int hashCode() {
            OrderSideDto orderSideDto = this.order_side;
            return ((orderSideDto == null ? 0 : orderSideDto.hashCode()) * 31) + this.currency_pair_id.hashCode();
        }

        public String toString() {
            return "Surrogate(order_side=" + this.order_side + ", currency_pair_id=" + this.currency_pair_id + ")";
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CalculateCryptoMarketOrderPillsRequestDto7.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, OrderSideDto orderSideDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.order_side = (i & 1) == 0 ? null : orderSideDto;
            if ((i & 2) == 0) {
                this.currency_pair_id = "";
            } else {
                this.currency_pair_id = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            OrderSideDto orderSideDto = self.order_side;
            if (orderSideDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, OrderSideDto.Serializer.INSTANCE, orderSideDto);
            }
            if (Intrinsics.areEqual(self.currency_pair_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 1, self.currency_pair_id);
        }

        public Surrogate(OrderSideDto orderSideDto, String currency_pair_id) {
            Intrinsics.checkNotNullParameter(currency_pair_id, "currency_pair_id");
            this.order_side = orderSideDto;
            this.currency_pair_id = currency_pair_id;
        }

        public final OrderSideDto getOrder_side() {
            return this.order_side;
        }

        public final String getCurrency_pair_id() {
            return this.currency_pair_id;
        }

        public /* synthetic */ Surrogate(OrderSideDto orderSideDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : orderSideDto, (i & 2) != 0 ? "" : str);
        }
    }

    /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CalculateCryptoMarketOrderPillsRequestDto, CalculateCryptoMarketOrderPillsRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CalculateCryptoMarketOrderPillsRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CalculateCryptoMarketOrderPillsRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CalculateCryptoMarketOrderPillsRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) CalculateCryptoMarketOrderPillsRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CalculateCryptoMarketOrderPillsRequest> getProtoAdapter() {
            return CalculateCryptoMarketOrderPillsRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CalculateCryptoMarketOrderPillsRequestDto getZeroValue() {
            return CalculateCryptoMarketOrderPillsRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CalculateCryptoMarketOrderPillsRequestDto fromProto(CalculateCryptoMarketOrderPillsRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            CalculateCryptoMarketOrderPillsRequest.OrderSide order_side = proto.getOrder_side();
            return new CalculateCryptoMarketOrderPillsRequestDto(new Surrogate(order_side != null ? OrderSideDto.INSTANCE.fromProto(order_side) : null, proto.getCurrency_pair_id()), (DefaultConstructorMarker) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CalculateCryptoMarketOrderPillsRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CalculateCryptoMarketOrderPillsRequestDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\t! \"#$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006)"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate;", "Companion", "Surrogate", "TypeDto", "BuyDto", "SellDto", "TokenizedStockBuyDto", "TokenizedStockSellDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OrderSideDto implements Dto3<CalculateCryptoMarketOrderPillsRequest.OrderSide>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<OrderSideDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OrderSideDto, CalculateCryptoMarketOrderPillsRequest.OrderSide>> binaryBase64Serializer$delegate;
        private static final OrderSideDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ OrderSideDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private OrderSideDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public OrderSideDto(TypeDto typeDto) {
            TypeDto.Buy buy = typeDto instanceof TypeDto.Buy ? (TypeDto.Buy) typeDto : null;
            BuyDto value = buy != null ? buy.getValue() : null;
            TypeDto.Sell sell = typeDto instanceof TypeDto.Sell ? (TypeDto.Sell) typeDto : null;
            SellDto value2 = sell != null ? sell.getValue() : null;
            TypeDto.TokenizedStockBuy tokenizedStockBuy = typeDto instanceof TypeDto.TokenizedStockBuy ? (TypeDto.TokenizedStockBuy) typeDto : null;
            TokenizedStockBuyDto value3 = tokenizedStockBuy != null ? tokenizedStockBuy.getValue() : null;
            TypeDto.TokenizedStockSell tokenizedStockSell = typeDto instanceof TypeDto.TokenizedStockSell ? (TypeDto.TokenizedStockSell) typeDto : null;
            this(new Surrogate(value, value2, value3, tokenizedStockSell != null ? tokenizedStockSell.getValue() : null));
        }

        public /* synthetic */ OrderSideDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : typeDto);
        }

        @Override // com.robinhood.idl.Dto
        public CalculateCryptoMarketOrderPillsRequest.OrderSide toProto() {
            BuyDto buy = this.surrogate.getBuy();
            CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy proto = buy != null ? buy.toProto() : null;
            SellDto sell = this.surrogate.getSell();
            CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell proto2 = sell != null ? sell.toProto() : null;
            TokenizedStockBuyDto tokenized_stock_buy = this.surrogate.getTokenized_stock_buy();
            CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy proto3 = tokenized_stock_buy != null ? tokenized_stock_buy.toProto() : null;
            TokenizedStockSellDto tokenized_stock_sell = this.surrogate.getTokenized_stock_sell();
            return new CalculateCryptoMarketOrderPillsRequest.OrderSide(proto, proto2, proto3, tokenized_stock_sell != null ? tokenized_stock_sell.toProto() : null, null, 16, null);
        }

        public String toString() {
            return "[OrderSideDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof OrderSideDto) && Intrinsics.areEqual(((OrderSideDto) other).surrogate, this.surrogate);
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
        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010'\u001a\u0004\b1\u00102¨\u00066"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "buy", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "sell", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "tokenized_stock_buy", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "tokenized_stock_sell", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "getBuy", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "getBuy$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "getSell", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "getSell$annotations", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "getTokenized_stock_buy", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "getTokenized_stock_buy$annotations", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "getTokenized_stock_sell", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "getTokenized_stock_sell$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BuyDto buy;
            private final SellDto sell;
            private final TokenizedStockBuyDto tokenized_stock_buy;
            private final TokenizedStockSellDto tokenized_stock_sell;

            public Surrogate() {
                this((BuyDto) null, (SellDto) null, (TokenizedStockBuyDto) null, (TokenizedStockSellDto) null, 15, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.buy, surrogate.buy) && Intrinsics.areEqual(this.sell, surrogate.sell) && Intrinsics.areEqual(this.tokenized_stock_buy, surrogate.tokenized_stock_buy) && Intrinsics.areEqual(this.tokenized_stock_sell, surrogate.tokenized_stock_sell);
            }

            public int hashCode() {
                BuyDto buyDto = this.buy;
                int iHashCode = (buyDto == null ? 0 : buyDto.hashCode()) * 31;
                SellDto sellDto = this.sell;
                int iHashCode2 = (iHashCode + (sellDto == null ? 0 : sellDto.hashCode())) * 31;
                TokenizedStockBuyDto tokenizedStockBuyDto = this.tokenized_stock_buy;
                int iHashCode3 = (iHashCode2 + (tokenizedStockBuyDto == null ? 0 : tokenizedStockBuyDto.hashCode())) * 31;
                TokenizedStockSellDto tokenizedStockSellDto = this.tokenized_stock_sell;
                return iHashCode3 + (tokenizedStockSellDto != null ? tokenizedStockSellDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(buy=" + this.buy + ", sell=" + this.sell + ", tokenized_stock_buy=" + this.tokenized_stock_buy + ", tokenized_stock_sell=" + this.tokenized_stock_sell + ")";
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CalculateCryptoMarketOrderPillsRequestDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, BuyDto buyDto, SellDto sellDto, TokenizedStockBuyDto tokenizedStockBuyDto, TokenizedStockSellDto tokenizedStockSellDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.buy = null;
                } else {
                    this.buy = buyDto;
                }
                if ((i & 2) == 0) {
                    this.sell = null;
                } else {
                    this.sell = sellDto;
                }
                if ((i & 4) == 0) {
                    this.tokenized_stock_buy = null;
                } else {
                    this.tokenized_stock_buy = tokenizedStockBuyDto;
                }
                if ((i & 8) == 0) {
                    this.tokenized_stock_sell = null;
                } else {
                    this.tokenized_stock_sell = tokenizedStockSellDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                BuyDto buyDto = self.buy;
                if (buyDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, BuyDto.Serializer.INSTANCE, buyDto);
                }
                SellDto sellDto = self.sell;
                if (sellDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, SellDto.Serializer.INSTANCE, sellDto);
                }
                TokenizedStockBuyDto tokenizedStockBuyDto = self.tokenized_stock_buy;
                if (tokenizedStockBuyDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, TokenizedStockBuyDto.Serializer.INSTANCE, tokenizedStockBuyDto);
                }
                TokenizedStockSellDto tokenizedStockSellDto = self.tokenized_stock_sell;
                if (tokenizedStockSellDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, TokenizedStockSellDto.Serializer.INSTANCE, tokenizedStockSellDto);
                }
            }

            public Surrogate(BuyDto buyDto, SellDto sellDto, TokenizedStockBuyDto tokenizedStockBuyDto, TokenizedStockSellDto tokenizedStockSellDto) {
                this.buy = buyDto;
                this.sell = sellDto;
                this.tokenized_stock_buy = tokenizedStockBuyDto;
                this.tokenized_stock_sell = tokenizedStockSellDto;
            }

            public /* synthetic */ Surrogate(BuyDto buyDto, SellDto sellDto, TokenizedStockBuyDto tokenizedStockBuyDto, TokenizedStockSellDto tokenizedStockSellDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : buyDto, (i & 2) != 0 ? null : sellDto, (i & 4) != 0 ? null : tokenizedStockBuyDto, (i & 8) != 0 ? null : tokenizedStockSellDto);
            }

            public final BuyDto getBuy() {
                return this.buy;
            }

            public final SellDto getSell() {
                return this.sell;
            }

            public final TokenizedStockBuyDto getTokenized_stock_buy() {
                return this.tokenized_stock_buy;
            }

            public final TokenizedStockSellDto getTokenized_stock_sell() {
                return this.tokenized_stock_sell;
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<OrderSideDto, CalculateCryptoMarketOrderPillsRequest.OrderSide> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OrderSideDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderSideDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OrderSideDto> getBinaryBase64Serializer() {
                return (KSerializer) OrderSideDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CalculateCryptoMarketOrderPillsRequest.OrderSide> getProtoAdapter() {
                return CalculateCryptoMarketOrderPillsRequest.OrderSide.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto getZeroValue() {
                return OrderSideDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OrderSideDto fromProto(CalculateCryptoMarketOrderPillsRequest.OrderSide proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy buy = proto.getBuy();
                DefaultConstructorMarker defaultConstructorMarker = null;
                BuyDto buyDtoFromProto = buy != null ? BuyDto.INSTANCE.fromProto(buy) : null;
                CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell sell = proto.getSell();
                SellDto sellDtoFromProto = sell != null ? SellDto.INSTANCE.fromProto(sell) : null;
                CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy tokenized_stock_buy = proto.getTokenized_stock_buy();
                TokenizedStockBuyDto tokenizedStockBuyDtoFromProto = tokenized_stock_buy != null ? TokenizedStockBuyDto.INSTANCE.fromProto(tokenized_stock_buy) : null;
                CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell tokenized_stock_sell = proto.getTokenized_stock_sell();
                return new OrderSideDto(new Surrogate(buyDtoFromProto, sellDtoFromProto, tokenizedStockBuyDtoFromProto, tokenized_stock_sell != null ? TokenizedStockSellDto.INSTANCE.fromProto(tokenized_stock_sell) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new OrderSideDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Buy", "Sell", "TokenizedStockBuy", "TokenizedStockSell", "Companion", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$Buy;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$Sell;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$TokenizedStockBuy;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$TokenizedStockSell;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @RhGenerated
        public static abstract class TypeDto implements Dto4 {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TypeDto() {
            }

            @Override // com.robinhood.idl.Dto
            public Void toProto() {
                return Dto4.DefaultImpls.toProto(this);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$Buy;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Buy extends TypeDto {
                private final BuyDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Buy) && Intrinsics.areEqual(this.value, ((Buy) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Buy(value=" + this.value + ")";
                }

                public final BuyDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Buy(BuyDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$Sell;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Sell extends TypeDto {
                private final SellDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Sell) && Intrinsics.areEqual(this.value, ((Sell) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Sell(value=" + this.value + ")";
                }

                public final SellDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Sell(SellDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$TokenizedStockBuy;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class TokenizedStockBuy extends TypeDto {
                private final TokenizedStockBuyDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TokenizedStockBuy) && Intrinsics.areEqual(this.value, ((TokenizedStockBuy) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TokenizedStockBuy(value=" + this.value + ")";
                }

                public final TokenizedStockBuyDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TokenizedStockBuy(TokenizedStockBuyDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$TokenizedStockSell;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class TokenizedStockSell extends TypeDto {
                private final TokenizedStockSellDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TokenizedStockSell) && Intrinsics.areEqual(this.value, ((TokenizedStockSell) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TokenizedStockSell(value=" + this.value + ")";
                }

                public final TokenizedStockSellDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TokenizedStockSell(TokenizedStockSellDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<TypeDto, CalculateCryptoMarketOrderPillsRequest.OrderSide> {
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
                public ProtoAdapter<CalculateCryptoMarketOrderPillsRequest.OrderSide> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsRequest.OrderSide.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(CalculateCryptoMarketOrderPillsRequest.OrderSide proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getBuy() != null) {
                        return new Buy(BuyDto.INSTANCE.fromProto(proto.getBuy()));
                    }
                    if (proto.getSell() != null) {
                        return new Sell(SellDto.INSTANCE.fromProto(proto.getSell()));
                    }
                    if (proto.getTokenized_stock_buy() != null) {
                        return new TokenizedStockBuy(TokenizedStockBuyDto.INSTANCE.fromProto(proto.getTokenized_stock_buy()));
                    }
                    if (proto.getTokenized_stock_sell() != null) {
                        return new TokenizedStockSell(TokenizedStockSellDto.INSTANCE.fromProto(proto.getTokenized_stock_sell()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\"!#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006%"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "buying_power", "max_order_size", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class BuyDto implements Dto3<CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<BuyDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<BuyDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy>> binaryBase64Serializer$delegate;
            private static final BuyDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ BuyDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private BuyDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public BuyDto(IdlDecimal buying_power, IdlDecimal max_order_size) {
                this(new Surrogate(buying_power, max_order_size));
                Intrinsics.checkNotNullParameter(buying_power, "buying_power");
                Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
            }

            public /* synthetic */ BuyDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2);
            }

            @Override // com.robinhood.idl.Dto
            public CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy toProto() {
                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy(this.surrogate.getBuying_power().getStringValue(), this.surrogate.getMax_order_size().getStringValue(), null, 4, null);
            }

            public String toString() {
                return "[BuyDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof BuyDto) && Intrinsics.areEqual(((BuyDto) other).surrogate, this.surrogate);
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
            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B9\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\b\u0010\tB/\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010#¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "buying_power", "max_order_size", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getBuying_power", "()Lcom/robinhood/idl/IdlDecimal;", "getBuying_power$annotations", "()V", "getMax_order_size", "getMax_order_size$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal buying_power;
                private final IdlDecimal max_order_size;

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
                    return Intrinsics.areEqual(this.buying_power, surrogate.buying_power) && Intrinsics.areEqual(this.max_order_size, surrogate.max_order_size);
                }

                public int hashCode() {
                    return (this.buying_power.hashCode() * 31) + this.max_order_size.hashCode();
                }

                public String toString() {
                    return "Surrogate(buying_power=" + this.buying_power + ", max_order_size=" + this.max_order_size + ")";
                }

                /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return CalculateCryptoMarketOrderPillsRequestDto2.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, SerializationConstructorMarker serializationConstructorMarker) {
                    this.buying_power = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                    if ((i & 2) == 0) {
                        this.max_order_size = new IdlDecimal("");
                    } else {
                        this.max_order_size = idlDecimal2;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.buying_power, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.buying_power);
                    }
                    if (Intrinsics.areEqual(self.max_order_size, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.max_order_size);
                }

                public Surrogate(IdlDecimal buying_power, IdlDecimal max_order_size) {
                    Intrinsics.checkNotNullParameter(buying_power, "buying_power");
                    Intrinsics.checkNotNullParameter(max_order_size, "max_order_size");
                    this.buying_power = buying_power;
                    this.max_order_size = max_order_size;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2);
                }

                public final IdlDecimal getBuying_power() {
                    return this.buying_power;
                }

                public final IdlDecimal getMax_order_size() {
                    return this.max_order_size;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Buy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<BuyDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<BuyDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BuyDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BuyDto> getBinaryBase64Serializer() {
                    return (KSerializer) BuyDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BuyDto getZeroValue() {
                    return BuyDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BuyDto fromProto(CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new BuyDto(new Surrogate(new IdlDecimal(proto.getBuying_power()), new IdlDecimal(proto.getMax_order_size())), (DefaultConstructorMarker) null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.BuyDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new BuyDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<BuyDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest.OrderSide.Buy", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, BuyDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public BuyDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new BuyDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4184_0)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$BuyDto";
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "quantity_available", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class SellDto implements Dto3<CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<SellDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SellDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell>> binaryBase64Serializer$delegate;
            private static final SellDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ SellDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SellDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public /* synthetic */ SellDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public SellDto(IdlDecimal quantity_available, IdlDecimal ask_price, IdlDecimal bid_price) {
                this(new Surrogate(quantity_available, ask_price, bid_price));
                Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                Intrinsics.checkNotNullParameter(bid_price, "bid_price");
            }

            @Override // com.robinhood.idl.Dto
            public CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell toProto() {
                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell(this.surrogate.getQuantity_available().getStringValue(), this.surrogate.getAsk_price().getStringValue(), this.surrogate.getBid_price().getStringValue(), null, 8, null);
            }

            public String toString() {
                return "[SellDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof SellDto) && Intrinsics.areEqual(((SellDto) other).surrogate, this.surrogate);
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
            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+BR\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R/\u0010\u0007\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R/\u0010\b\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$¨\u0006-"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "quantity_available", BidAskDetails3.ASK_PRICE, BidAskDetails3.BID_PRICE, "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getQuantity_available", "()Lcom/robinhood/idl/IdlDecimal;", "getQuantity_available$annotations", "()V", "getAsk_price", "getAsk_price$annotations", "getBid_price", "getBid_price$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal ask_price;
                private final IdlDecimal bid_price;
                private final IdlDecimal quantity_available;

                public Surrogate() {
                    this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.quantity_available, surrogate.quantity_available) && Intrinsics.areEqual(this.ask_price, surrogate.ask_price) && Intrinsics.areEqual(this.bid_price, surrogate.bid_price);
                }

                public int hashCode() {
                    return (((this.quantity_available.hashCode() * 31) + this.ask_price.hashCode()) * 31) + this.bid_price.hashCode();
                }

                public String toString() {
                    return "Surrogate(quantity_available=" + this.quantity_available + ", ask_price=" + this.ask_price + ", bid_price=" + this.bid_price + ")";
                }

                /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return CalculateCryptoMarketOrderPillsRequestDto3.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
                    this.quantity_available = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                    if ((i & 2) == 0) {
                        this.ask_price = new IdlDecimal("");
                    } else {
                        this.ask_price = idlDecimal2;
                    }
                    if ((i & 4) == 0) {
                        this.bid_price = new IdlDecimal("");
                    } else {
                        this.bid_price = idlDecimal3;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.quantity_available, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.quantity_available);
                    }
                    if (!Intrinsics.areEqual(self.ask_price, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, self.ask_price);
                    }
                    if (Intrinsics.areEqual(self.bid_price, new IdlDecimal(""))) {
                        return;
                    }
                    output.encodeSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, self.bid_price);
                }

                public Surrogate(IdlDecimal quantity_available, IdlDecimal ask_price, IdlDecimal bid_price) {
                    Intrinsics.checkNotNullParameter(quantity_available, "quantity_available");
                    Intrinsics.checkNotNullParameter(ask_price, "ask_price");
                    Intrinsics.checkNotNullParameter(bid_price, "bid_price");
                    this.quantity_available = quantity_available;
                    this.ask_price = ask_price;
                    this.bid_price = bid_price;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? new IdlDecimal("") : idlDecimal2, (i & 4) != 0 ? new IdlDecimal("") : idlDecimal3);
                }

                public final IdlDecimal getQuantity_available() {
                    return this.quantity_available;
                }

                public final IdlDecimal getAsk_price() {
                    return this.ask_price;
                }

                public final IdlDecimal getBid_price() {
                    return this.bid_price;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$Sell;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<SellDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SellDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SellDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SellDto> getBinaryBase64Serializer() {
                    return (KSerializer) SellDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SellDto getZeroValue() {
                    return SellDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SellDto fromProto(CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new SellDto(new Surrogate(new IdlDecimal(proto.getQuantity_available()), new IdlDecimal(proto.getAsk_price()), new IdlDecimal(proto.getBid_price())), null);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.SellDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new SellDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<SellDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest.OrderSide.Sell", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SellDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public SellDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new SellDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4186_2)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$SellDto";
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!¨\u0006&"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "buying_power", "max_order_size", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TokenizedStockBuyDto implements Dto3<CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<TokenizedStockBuyDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TokenizedStockBuyDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy>> binaryBase64Serializer$delegate;
            private static final TokenizedStockBuyDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ TokenizedStockBuyDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TokenizedStockBuyDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public /* synthetic */ TokenizedStockBuyDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2, (i & 4) != 0 ? null : idlDecimal3);
            }

            public TokenizedStockBuyDto(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3) {
                this(new Surrogate(idlDecimal, idlDecimal2, idlDecimal3));
            }

            @Override // com.robinhood.idl.Dto
            public CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy toProto() {
                IdlDecimal buying_power = this.surrogate.getBuying_power();
                String stringValue = buying_power != null ? buying_power.getStringValue() : null;
                IdlDecimal max_order_size = this.surrogate.getMax_order_size();
                String stringValue2 = max_order_size != null ? max_order_size.getStringValue() : null;
                IdlDecimal price = this.surrogate.getPrice();
                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy(stringValue, stringValue2, price != null ? price.getStringValue() : null, null, 8, null);
            }

            public String toString() {
                return "[TokenizedStockBuyDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof TokenizedStockBuyDto) && Intrinsics.areEqual(((TokenizedStockBuyDto) other).surrogate, this.surrogate);
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
            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002,+BX\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\u0019\b\u0002\u0010\b\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R1\u0010\u0007\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$R1\u0010\b\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010$¨\u0006-"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "buying_power", "max_order_size", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "<init>", "(Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getBuying_power", "()Lcom/robinhood/idl/IdlDecimal;", "getBuying_power$annotations", "()V", "getMax_order_size", "getMax_order_size$annotations", "getPrice", "getPrice$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal buying_power;
                private final IdlDecimal max_order_size;
                private final IdlDecimal price;

                public Surrogate() {
                    this((IdlDecimal) null, (IdlDecimal) null, (IdlDecimal) null, 7, (DefaultConstructorMarker) null);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.buying_power, surrogate.buying_power) && Intrinsics.areEqual(this.max_order_size, surrogate.max_order_size) && Intrinsics.areEqual(this.price, surrogate.price);
                }

                public int hashCode() {
                    IdlDecimal idlDecimal = this.buying_power;
                    int iHashCode = (idlDecimal == null ? 0 : idlDecimal.hashCode()) * 31;
                    IdlDecimal idlDecimal2 = this.max_order_size;
                    int iHashCode2 = (iHashCode + (idlDecimal2 == null ? 0 : idlDecimal2.hashCode())) * 31;
                    IdlDecimal idlDecimal3 = this.price;
                    return iHashCode2 + (idlDecimal3 != null ? idlDecimal3.hashCode() : 0);
                }

                public String toString() {
                    return "Surrogate(buying_power=" + this.buying_power + ", max_order_size=" + this.max_order_size + ", price=" + this.price + ")";
                }

                /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return CalculateCryptoMarketOrderPillsRequestDto5.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.buying_power = null;
                    } else {
                        this.buying_power = idlDecimal;
                    }
                    if ((i & 2) == 0) {
                        this.max_order_size = null;
                    } else {
                        this.max_order_size = idlDecimal2;
                    }
                    if ((i & 4) == 0) {
                        this.price = null;
                    } else {
                        this.price = idlDecimal3;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    IdlDecimal idlDecimal = self.buying_power;
                    if (idlDecimal != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                    }
                    IdlDecimal idlDecimal2 = self.max_order_size;
                    if (idlDecimal2 != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, IdlDecimalSerializer.INSTANCE, idlDecimal2);
                    }
                    IdlDecimal idlDecimal3 = self.price;
                    if (idlDecimal3 != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, IdlDecimalSerializer.INSTANCE, idlDecimal3);
                    }
                }

                public Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3) {
                    this.buying_power = idlDecimal;
                    this.max_order_size = idlDecimal2;
                    this.price = idlDecimal3;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, IdlDecimal idlDecimal2, IdlDecimal idlDecimal3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal, (i & 2) != 0 ? null : idlDecimal2, (i & 4) != 0 ? null : idlDecimal3);
                }

                public final IdlDecimal getBuying_power() {
                    return this.buying_power;
                }

                public final IdlDecimal getMax_order_size() {
                    return this.max_order_size;
                }

                public final IdlDecimal getPrice() {
                    return this.price;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockBuy;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<TokenizedStockBuyDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TokenizedStockBuyDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TokenizedStockBuyDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TokenizedStockBuyDto> getBinaryBase64Serializer() {
                    return (KSerializer) TokenizedStockBuyDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TokenizedStockBuyDto getZeroValue() {
                    return TokenizedStockBuyDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TokenizedStockBuyDto fromProto(CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String buying_power = proto.getBuying_power();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    IdlDecimal idlDecimal = buying_power != null ? new IdlDecimal(buying_power) : null;
                    String max_order_size = proto.getMax_order_size();
                    IdlDecimal idlDecimal2 = max_order_size != null ? new IdlDecimal(max_order_size) : null;
                    String price = proto.getPrice();
                    return new TokenizedStockBuyDto(new Surrogate(idlDecimal, idlDecimal2, price != null ? new IdlDecimal(price) : null), defaultConstructorMarker);
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.TokenizedStockBuyDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new TokenizedStockBuyDto(null, null, null, 7, null);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<TokenizedStockBuyDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockBuy", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TokenizedStockBuyDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public TokenizedStockBuyDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new TokenizedStockBuyDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockBuyDto";
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004! \"#B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006$"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "selling_power", "(Lcom/robinhood/idl/IdlDecimal;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class TokenizedStockSellDto implements Dto3<CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<TokenizedStockSellDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<TokenizedStockSellDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell>> binaryBase64Serializer$delegate;
            private static final TokenizedStockSellDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ TokenizedStockSellDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private TokenizedStockSellDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public TokenizedStockSellDto(IdlDecimal idlDecimal) {
                this(new Surrogate(idlDecimal));
            }

            public /* synthetic */ TokenizedStockSellDto(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : idlDecimal);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell toProto() {
                IdlDecimal selling_power = this.surrogate.getSelling_power();
                return new CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell(selling_power != null ? selling_power.getStringValue() : null, null, 2, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[TokenizedStockSellDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof TokenizedStockSellDto) && Intrinsics.areEqual(((TokenizedStockSellDto) other).surrogate, this.surrogate);
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
            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\"\u0012\u0019\b\u0002\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR1\u0010\u0006\u001a\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "selling_power", "<init>", "(Lcom/robinhood/idl/IdlDecimal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getSelling_power", "()Lcom/robinhood/idl/IdlDecimal;", "getSelling_power$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal selling_power;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Surrogate) && Intrinsics.areEqual(this.selling_power, ((Surrogate) other).selling_power);
                }

                public int hashCode() {
                    IdlDecimal idlDecimal = this.selling_power;
                    if (idlDecimal == null) {
                        return 0;
                    }
                    return idlDecimal.hashCode();
                }

                public String toString() {
                    return "Surrogate(selling_power=" + this.selling_power + ")";
                }

                /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return CalculateCryptoMarketOrderPillsRequestDto6.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.selling_power = null;
                    } else {
                        this.selling_power = idlDecimal;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    IdlDecimal idlDecimal = self.selling_power;
                    if (idlDecimal != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, idlDecimal);
                    }
                }

                public Surrogate(IdlDecimal idlDecimal) {
                    this.selling_power = idlDecimal;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : idlDecimal);
                }

                public final IdlDecimal getSelling_power() {
                    return this.selling_power;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequest$OrderSide$TokenizedStockSell;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements Dto3.Creator<TokenizedStockSellDto, CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<TokenizedStockSellDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TokenizedStockSellDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<TokenizedStockSellDto> getBinaryBase64Serializer() {
                    return (KSerializer) TokenizedStockSellDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TokenizedStockSellDto getZeroValue() {
                    return TokenizedStockSellDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TokenizedStockSellDto fromProto(CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    String selling_power = proto.getSelling_power();
                    return new TokenizedStockSellDto(new Surrogate(selling_power != null ? new IdlDecimal(selling_power) : null), null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsRequestDto.OrderSideDto.TokenizedStockSellDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new TokenizedStockSellDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<TokenizedStockSellDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest.OrderSide.TokenizedStockSell", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, TokenizedStockSellDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public TokenizedStockSellDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new TokenizedStockSellDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4191_7)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$TokenizedStockSellDto";
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<OrderSideDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest.OrderSide", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OrderSideDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public OrderSideDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new OrderSideDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4185_1)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto$OrderSideDto";
            }
        }
    }

    /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CalculateCryptoMarketOrderPillsRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CalculateCryptoMarketOrderPillsRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CalculateCryptoMarketOrderPillsRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CalculateCryptoMarketOrderPillsRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: CalculateCryptoMarketOrderPillsRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsRequestDto";
        }
    }
}
