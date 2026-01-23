package contracts.crypto.trade.proto.p431v1;

import android.os.Parcel;
import android.os.Parcelable;
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
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsResponse;
import contracts.crypto.trade.proto.p431v1.CalculateCryptoMarketOrderPillsResponseDto;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005$#%&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate;)V", "", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "trade_buttons", "(Ljava/util/List;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate;", "getTrade_buttons", "()Ljava/util/List;", "Companion", "Surrogate", "TradeButtonDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CalculateCryptoMarketOrderPillsResponseDto implements Dto3<CalculateCryptoMarketOrderPillsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CalculateCryptoMarketOrderPillsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CalculateCryptoMarketOrderPillsResponseDto, CalculateCryptoMarketOrderPillsResponse>> binaryBase64Serializer$delegate;
    private static final CalculateCryptoMarketOrderPillsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CalculateCryptoMarketOrderPillsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CalculateCryptoMarketOrderPillsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<TradeButtonDto> getTrade_buttons() {
        return this.surrogate.getTrade_buttons();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CalculateCryptoMarketOrderPillsResponseDto(List<TradeButtonDto> trade_buttons) {
        this(new Surrogate(trade_buttons));
        Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
    }

    public /* synthetic */ CalculateCryptoMarketOrderPillsResponseDto(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<TradeButtonDto>) ((i & 1) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CalculateCryptoMarketOrderPillsResponse toProto() {
        List<TradeButtonDto> trade_buttons = this.surrogate.getTrade_buttons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(trade_buttons, 10));
        Iterator<T> it = trade_buttons.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeButtonDto) it.next()).toProto());
        }
        return new CalculateCryptoMarketOrderPillsResponse(arrayList, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[CalculateCryptoMarketOrderPillsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CalculateCryptoMarketOrderPillsResponseDto) && Intrinsics.areEqual(((CalculateCryptoMarketOrderPillsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate;", "", "", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "trade_buttons", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTrade_buttons", "()Ljava/util/List;", "getTrade_buttons$annotations", "()V", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<TradeButtonDto> trade_buttons;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CalculateCryptoMarketOrderPillsResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(TradeButtonDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && Intrinsics.areEqual(this.trade_buttons, ((Surrogate) other).trade_buttons);
        }

        public int hashCode() {
            return this.trade_buttons.hashCode();
        }

        public String toString() {
            return "Surrogate(trade_buttons=" + this.trade_buttons + ")";
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CalculateCryptoMarketOrderPillsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.trade_buttons = CollectionsKt.emptyList();
            } else {
                this.trade_buttons = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (Intrinsics.areEqual(self.trade_buttons, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.trade_buttons);
        }

        public Surrogate(List<TradeButtonDto> trade_buttons) {
            Intrinsics.checkNotNullParameter(trade_buttons, "trade_buttons");
            this.trade_buttons = trade_buttons;
        }

        public final List<TradeButtonDto> getTrade_buttons() {
            return this.trade_buttons;
        }

        public /* synthetic */ Surrogate(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<CalculateCryptoMarketOrderPillsResponseDto, CalculateCryptoMarketOrderPillsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CalculateCryptoMarketOrderPillsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CalculateCryptoMarketOrderPillsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CalculateCryptoMarketOrderPillsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) CalculateCryptoMarketOrderPillsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CalculateCryptoMarketOrderPillsResponse> getProtoAdapter() {
            return CalculateCryptoMarketOrderPillsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CalculateCryptoMarketOrderPillsResponseDto getZeroValue() {
            return CalculateCryptoMarketOrderPillsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CalculateCryptoMarketOrderPillsResponseDto fromProto(CalculateCryptoMarketOrderPillsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<CalculateCryptoMarketOrderPillsResponse.TradeButton> trade_buttons = proto.getTrade_buttons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(trade_buttons, 10));
            Iterator<T> it = trade_buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(TradeButtonDto.INSTANCE.fromProto((CalculateCryptoMarketOrderPillsResponse.TradeButton) it.next()));
            }
            return new CalculateCryptoMarketOrderPillsResponseDto(new Surrogate(arrayList), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CalculateCryptoMarketOrderPillsResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new CalculateCryptoMarketOrderPillsResponseDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b#\"$%&'()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006*"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate;)V", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;", "type", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate;", "getType", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "QuoteAmountDto", "SellAllDto", "BuyAllDto", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class TradeButtonDto implements Dto3<CalculateCryptoMarketOrderPillsResponse.TradeButton>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<TradeButtonDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<TradeButtonDto, CalculateCryptoMarketOrderPillsResponse.TradeButton>> binaryBase64Serializer$delegate;
        private static final TradeButtonDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ TradeButtonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private TradeButtonDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final TypeDto getType() {
            if (this.surrogate.getQuote_amount() != null) {
                return new TypeDto.QuoteAmount(this.surrogate.getQuote_amount());
            }
            if (this.surrogate.getSell_all() != null) {
                return new TypeDto.SellAll(this.surrogate.getSell_all());
            }
            if (this.surrogate.getBuy_all() != null) {
                return new TypeDto.BuyAll(this.surrogate.getBuy_all());
            }
            return null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TradeButtonDto(TypeDto typeDto) {
            TypeDto.QuoteAmount quoteAmount = typeDto instanceof TypeDto.QuoteAmount ? (TypeDto.QuoteAmount) typeDto : null;
            QuoteAmountDto value = quoteAmount != null ? quoteAmount.getValue() : null;
            TypeDto.SellAll sellAll = typeDto instanceof TypeDto.SellAll ? (TypeDto.SellAll) typeDto : null;
            SellAllDto value2 = sellAll != null ? sellAll.getValue() : null;
            TypeDto.BuyAll buyAll = typeDto instanceof TypeDto.BuyAll ? (TypeDto.BuyAll) typeDto : null;
            this(new Surrogate(value, value2, buyAll != null ? buyAll.getValue() : null));
        }

        public /* synthetic */ TradeButtonDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : typeDto);
        }

        @Override // com.robinhood.idl.Dto
        public CalculateCryptoMarketOrderPillsResponse.TradeButton toProto() {
            QuoteAmountDto quote_amount = this.surrogate.getQuote_amount();
            CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount proto = quote_amount != null ? quote_amount.toProto() : null;
            SellAllDto sell_all = this.surrogate.getSell_all();
            CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll proto2 = sell_all != null ? sell_all.toProto() : null;
            BuyAllDto buy_all = this.surrogate.getBuy_all();
            return new CalculateCryptoMarketOrderPillsResponse.TradeButton(proto, proto2, buy_all != null ? buy_all.toProto() : null, null, 8, null);
        }

        public String toString() {
            return "[TradeButtonDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof TradeButtonDto) && Intrinsics.areEqual(((TradeButtonDto) other).surrogate, this.surrogate);
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
        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate;", "", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "quote_amount", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "sell_all", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "buy_all", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "getQuote_amount", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "getQuote_amount$annotations", "()V", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "getSell_all", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "getSell_all$annotations", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "getBuy_all", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "getBuy_all$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final BuyAllDto buy_all;
            private final QuoteAmountDto quote_amount;
            private final SellAllDto sell_all;

            public Surrogate() {
                this((QuoteAmountDto) null, (SellAllDto) null, (BuyAllDto) null, 7, (DefaultConstructorMarker) null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.quote_amount, surrogate.quote_amount) && Intrinsics.areEqual(this.sell_all, surrogate.sell_all) && Intrinsics.areEqual(this.buy_all, surrogate.buy_all);
            }

            public int hashCode() {
                QuoteAmountDto quoteAmountDto = this.quote_amount;
                int iHashCode = (quoteAmountDto == null ? 0 : quoteAmountDto.hashCode()) * 31;
                SellAllDto sellAllDto = this.sell_all;
                int iHashCode2 = (iHashCode + (sellAllDto == null ? 0 : sellAllDto.hashCode())) * 31;
                BuyAllDto buyAllDto = this.buy_all;
                return iHashCode2 + (buyAllDto != null ? buyAllDto.hashCode() : 0);
            }

            public String toString() {
                return "Surrogate(quote_amount=" + this.quote_amount + ", sell_all=" + this.sell_all + ", buy_all=" + this.buy_all + ")";
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return CalculateCryptoMarketOrderPillsResponseDto5.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, QuoteAmountDto quoteAmountDto, SellAllDto sellAllDto, BuyAllDto buyAllDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.quote_amount = null;
                } else {
                    this.quote_amount = quoteAmountDto;
                }
                if ((i & 2) == 0) {
                    this.sell_all = null;
                } else {
                    this.sell_all = sellAllDto;
                }
                if ((i & 4) == 0) {
                    this.buy_all = null;
                } else {
                    this.buy_all = buyAllDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                QuoteAmountDto quoteAmountDto = self.quote_amount;
                if (quoteAmountDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, QuoteAmountDto.Serializer.INSTANCE, quoteAmountDto);
                }
                SellAllDto sellAllDto = self.sell_all;
                if (sellAllDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, SellAllDto.Serializer.INSTANCE, sellAllDto);
                }
                BuyAllDto buyAllDto = self.buy_all;
                if (buyAllDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, BuyAllDto.Serializer.INSTANCE, buyAllDto);
                }
            }

            public Surrogate(QuoteAmountDto quoteAmountDto, SellAllDto sellAllDto, BuyAllDto buyAllDto) {
                this.quote_amount = quoteAmountDto;
                this.sell_all = sellAllDto;
                this.buy_all = buyAllDto;
            }

            public /* synthetic */ Surrogate(QuoteAmountDto quoteAmountDto, SellAllDto sellAllDto, BuyAllDto buyAllDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : quoteAmountDto, (i & 2) != 0 ? null : sellAllDto, (i & 4) != 0 ? null : buyAllDto);
            }

            public final QuoteAmountDto getQuote_amount() {
                return this.quote_amount;
            }

            public final SellAllDto getSell_all() {
                return this.sell_all;
            }

            public final BuyAllDto getBuy_all() {
                return this.buy_all;
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<TradeButtonDto, CalculateCryptoMarketOrderPillsResponse.TradeButton> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<TradeButtonDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TradeButtonDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<TradeButtonDto> getBinaryBase64Serializer() {
                return (KSerializer) TradeButtonDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CalculateCryptoMarketOrderPillsResponse.TradeButton> getProtoAdapter() {
                return CalculateCryptoMarketOrderPillsResponse.TradeButton.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TradeButtonDto getZeroValue() {
                return TradeButtonDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TradeButtonDto fromProto(CalculateCryptoMarketOrderPillsResponse.TradeButton proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount quote_amount = proto.getQuote_amount();
                DefaultConstructorMarker defaultConstructorMarker = null;
                QuoteAmountDto quoteAmountDtoFromProto = quote_amount != null ? QuoteAmountDto.INSTANCE.fromProto(quote_amount) : null;
                CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll sell_all = proto.getSell_all();
                SellAllDto sellAllDtoFromProto = sell_all != null ? SellAllDto.INSTANCE.fromProto(sell_all) : null;
                CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll buy_all = proto.getBuy_all();
                return new TradeButtonDto(new Surrogate(quoteAmountDtoFromProto, sellAllDtoFromProto, buy_all != null ? BuyAllDto.INSTANCE.fromProto(buy_all) : null), defaultConstructorMarker);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new TradeButtonDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "QuoteAmount", "SellAll", "BuyAll", "Companion", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto$BuyAll;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto$QuoteAmount;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto$SellAll;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
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

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto$QuoteAmount;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class QuoteAmount extends TypeDto {
                private final QuoteAmountDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof QuoteAmount) && Intrinsics.areEqual(this.value, ((QuoteAmount) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "QuoteAmount(value=" + this.value + ")";
                }

                public final QuoteAmountDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public QuoteAmount(QuoteAmountDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto$SellAll;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class SellAll extends TypeDto {
                private final SellAllDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SellAll) && Intrinsics.areEqual(this.value, ((SellAll) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "SellAll(value=" + this.value + ")";
                }

                public final SellAllDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SellAll(SellAllDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto$BuyAll;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "value", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "getValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class BuyAll extends TypeDto {
                private final BuyAllDto value;

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof BuyAll) && Intrinsics.areEqual(this.value, ((BuyAll) other).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "BuyAll(value=" + this.value + ")";
                }

                public final BuyAllDto getValue() {
                    return this.value;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BuyAll(BuyAllDto value) {
                    super(null);
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$TypeDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto4.Creator<TypeDto, CalculateCryptoMarketOrderPillsResponse.TradeButton> {
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
                public ProtoAdapter<CalculateCryptoMarketOrderPillsResponse.TradeButton> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsResponse.TradeButton.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public TypeDto fromProto(CalculateCryptoMarketOrderPillsResponse.TradeButton proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    if (proto.getQuote_amount() != null) {
                        return new QuoteAmount(QuoteAmountDto.INSTANCE.fromProto(proto.getQuote_amount()));
                    }
                    if (proto.getSell_all() != null) {
                        return new SellAll(SellAllDto.INSTANCE.fromProto(proto.getSell_all()));
                    }
                    if (proto.getBuy_all() != null) {
                        return new BuyAll(BuyAllDto.INSTANCE.fromProto(proto.getBuy_all()));
                    }
                    return null;
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%$&'B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b#\u0010\u0010¨\u0006("}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate;)V", "Lcom/robinhood/idl/IdlDecimal;", "amount", "", "formatted_amount", "(Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate;", "getAmount", "()Lcom/robinhood/idl/IdlDecimal;", "getFormatted_amount", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class QuoteAmountDto implements Dto3<CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<QuoteAmountDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<QuoteAmountDto, CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount>> binaryBase64Serializer$delegate;
            private static final QuoteAmountDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ QuoteAmountDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private QuoteAmountDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public final IdlDecimal getAmount() {
                return this.surrogate.getAmount();
            }

            public final String getFormatted_amount() {
                return this.surrogate.getFormatted_amount();
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public QuoteAmountDto(IdlDecimal amount, String formatted_amount) {
                this(new Surrogate(amount, formatted_amount));
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(formatted_amount, "formatted_amount");
            }

            public /* synthetic */ QuoteAmountDto(IdlDecimal idlDecimal, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? "" : str);
            }

            @Override // com.robinhood.idl.Dto
            public CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount toProto() {
                return new CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount(this.surrogate.getAmount().getStringValue(), this.surrogate.getFormatted_amount(), null, 4, null);
            }

            public String toString() {
                return "[QuoteAmountDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof QuoteAmountDto) && Intrinsics.areEqual(((QuoteAmountDto) other).surrogate, this.surrogate);
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
            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B*\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R/\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\t0\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate;", "", "Lcom/robinhood/idl/IdlDecimal;", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/IdlDecimalSerializer;", "amount", "", "formatted_amount", "<init>", "(Lcom/robinhood/idl/IdlDecimal;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/robinhood/idl/IdlDecimal;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_crypto_trade_proto_v1_externalRelease", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/idl/IdlDecimal;", "getAmount", "()Lcom/robinhood/idl/IdlDecimal;", "getAmount$annotations", "()V", "Ljava/lang/String;", "getFormatted_amount", "getFormatted_amount$annotations", "Companion", "$serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final IdlDecimal amount;
                private final String formatted_amount;

                /* JADX WARN: Multi-variable type inference failed */
                public Surrogate() {
                    this((IdlDecimal) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Surrogate)) {
                        return false;
                    }
                    Surrogate surrogate = (Surrogate) other;
                    return Intrinsics.areEqual(this.amount, surrogate.amount) && Intrinsics.areEqual(this.formatted_amount, surrogate.formatted_amount);
                }

                public int hashCode() {
                    return (this.amount.hashCode() * 31) + this.formatted_amount.hashCode();
                }

                public String toString() {
                    return "Surrogate(amount=" + this.amount + ", formatted_amount=" + this.formatted_amount + ")";
                }

                /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
                @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Companion {
                    private Companion() {
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Surrogate> serializer() {
                        return CalculateCryptoMarketOrderPillsResponseDto4.INSTANCE;
                    }
                }

                public /* synthetic */ Surrogate(int i, IdlDecimal idlDecimal, String str, SerializationConstructorMarker serializationConstructorMarker) {
                    this.amount = (i & 1) == 0 ? new IdlDecimal("") : idlDecimal;
                    if ((i & 2) == 0) {
                        this.formatted_amount = "";
                    } else {
                        this.formatted_amount = str;
                    }
                }

                @JvmStatic
                public static final /* synthetic */ void write$Self$contracts_crypto_trade_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                    if (!Intrinsics.areEqual(self.amount, new IdlDecimal(""))) {
                        output.encodeSerializableElement(serialDesc, 0, IdlDecimalSerializer.INSTANCE, self.amount);
                    }
                    if (Intrinsics.areEqual(self.formatted_amount, "")) {
                        return;
                    }
                    output.encodeStringElement(serialDesc, 1, self.formatted_amount);
                }

                public Surrogate(IdlDecimal amount, String formatted_amount) {
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(formatted_amount, "formatted_amount");
                    this.amount = amount;
                    this.formatted_amount = formatted_amount;
                }

                public /* synthetic */ Surrogate(IdlDecimal idlDecimal, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? new IdlDecimal("") : idlDecimal, (i & 2) != 0 ? "" : str);
                }

                public final IdlDecimal getAmount() {
                    return this.amount;
                }

                public final String getFormatted_amount() {
                    return this.formatted_amount;
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$QuoteAmount;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<QuoteAmountDto, CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<QuoteAmountDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<QuoteAmountDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<QuoteAmountDto> getBinaryBase64Serializer() {
                    return (KSerializer) QuoteAmountDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public QuoteAmountDto getZeroValue() {
                    return QuoteAmountDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public QuoteAmountDto fromProto(CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new QuoteAmountDto(new Surrogate(new IdlDecimal(proto.getAmount()), proto.getFormatted_amount()), (DefaultConstructorMarker) null);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.QuoteAmountDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new QuoteAmountDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<QuoteAmountDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse.TradeButton.QuoteAmount", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, QuoteAmountDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public QuoteAmountDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new QuoteAmountDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4193_9)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$QuoteAmountDto";
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class SellAllDto implements Dto3<CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<SellAllDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SellAllDto, CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll>> binaryBase64Serializer$delegate;
            private static final SellAllDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ SellAllDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SellAllDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public SellAllDto() {
                this(Surrogate.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll toProto() {
                return new CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll(null, 1, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[SellAllDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof SellAllDto) && Intrinsics.areEqual(((SellAllDto) other).surrogate, this.surrogate);
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
            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                public static final Surrogate INSTANCE = new Surrogate();
                private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.SellAllDto.Surrogate._init_$_anonymous_();
                    }
                });

                public boolean equals(Object other) {
                    return this == other || (other instanceof Surrogate);
                }

                public int hashCode() {
                    return -2068884253;
                }

                public String toString() {
                    return "Surrogate";
                }

                private Surrogate() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                    return new ObjectSerializer("contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.SellAllDto.Surrogate", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return $cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Surrogate> serializer() {
                    return get$cachedSerializer();
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$SellAll;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<SellAllDto, CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<SellAllDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SellAllDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SellAllDto> getBinaryBase64Serializer() {
                    return (KSerializer) SellAllDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SellAllDto getZeroValue() {
                    return SellAllDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SellAllDto fromProto(CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new SellAllDto();
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.SellAllDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new SellAllDto();
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<SellAllDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse.TradeButton.SellAll", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SellAllDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public SellAllDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new SellAllDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4192_8)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$SellAllDto";
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004\u001f\u001e !B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\""}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll;", "Landroid/os/Parcelable;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Surrogate;)V", "()V", "toProto", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class BuyAllDto implements Dto3<CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll>, Parcelable {

            @JvmField
            public static final Parcelable.Creator<BuyAllDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<BuyAllDto, CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll>> binaryBase64Serializer$delegate;
            private static final BuyAllDto zeroValue;
            private final Surrogate surrogate;

            public /* synthetic */ BuyAllDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
                this(surrogate);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private BuyAllDto(Surrogate surrogate) {
                this.surrogate = surrogate;
            }

            public BuyAllDto() {
                this(Surrogate.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.robinhood.idl.Dto
            public CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll toProto() {
                return new CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll(null, 1, 0 == true ? 1 : 0);
            }

            public String toString() {
                return "[BuyAllDto]:" + toProto();
            }

            public boolean equals(Object other) {
                if (other != this) {
                    return (other instanceof BuyAllDto) && Intrinsics.areEqual(((BuyAllDto) other).surrogate, this.surrogate);
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
            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\nJ\t\u0010\u000b\u001a\u00020\fHÖ\u0001¨\u0006\r"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Surrogate;", "", "<init>", "()V", "equals", "", "other", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            @Serializable
            static final /* data */ class Surrogate {
                public static final Surrogate INSTANCE = new Surrogate();
                private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Surrogate$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.BuyAllDto.Surrogate._init_$_anonymous_();
                    }
                });

                public boolean equals(Object other) {
                    return this == other || (other instanceof Surrogate);
                }

                public int hashCode() {
                    return -2141078875;
                }

                public String toString() {
                    return "Surrogate";
                }

                private Surrogate() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ KSerializer _init_$_anonymous_() {
                    return new ObjectSerializer("contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.BuyAllDto.Surrogate", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer get$cachedSerializer() {
                    return $cachedSerializer$delegate.getValue();
                }

                public final KSerializer<Surrogate> serializer() {
                    return get$cachedSerializer();
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponse$TradeButton$BuyAll;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto3.Creator<BuyAllDto, CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<BuyAllDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BuyAllDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<BuyAllDto> getBinaryBase64Serializer() {
                    return (KSerializer) BuyAllDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll> getProtoAdapter() {
                    return CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BuyAllDto getZeroValue() {
                    return BuyAllDto.zeroValue;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public BuyAllDto fromProto(CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    return new BuyAllDto();
                }
            }

            static {
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CalculateCryptoMarketOrderPillsResponseDto.TradeButtonDto.BuyAllDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                zeroValue = new BuyAllDto();
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<BuyAllDto> {
                public static final Serializer INSTANCE = new Serializer();
                private static final SerialDescriptor descriptor;
                private static final KSerializer<Surrogate> surrogateSerializer;

                private Serializer() {
                }

                static {
                    KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                    surrogateSerializer = kSerializerSerializer;
                    descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse.TradeButton.BuyAll", kSerializerSerializer.getDescriptor());
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, BuyAllDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
                }

                @Override // kotlinx.serialization.KSerializer2
                public BuyAllDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return new BuyAllDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
                }
            }

            /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class MultibindingModule {
                public static final MultibindingModule INSTANCE = new MultibindingModule();

                private MultibindingModule() {
                }

                @MultibindingShard(number = MultibindingShard.Number.f4190_6)
                public final String provideIntoMap() {
                    return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$BuyAllDto";
                }
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<TradeButtonDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse.TradeButton", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, TradeButtonDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public TradeButtonDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new TradeButtonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4186_2)
            public final String provideIntoMap() {
                return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto$TradeButtonDto";
            }
        }
    }

    /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CalculateCryptoMarketOrderPillsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CalculateCryptoMarketOrderPillsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CalculateCryptoMarketOrderPillsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CalculateCryptoMarketOrderPillsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CalculateCryptoMarketOrderPillsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/crypto/trade/proto/v1/CalculateCryptoMarketOrderPillsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.crypto.trade.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "contracts.crypto.trade.proto.v1.CalculateCryptoMarketOrderPillsResponseDto";
        }
    }
}
