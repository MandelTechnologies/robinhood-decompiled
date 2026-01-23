package rosetta.blockchain.p533v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
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
import rosetta.blockchain.p533v1.EthereumChainDto;
import rosetta.blockchain.p533v1.PolygonProofOfStakeChainDto;

/* compiled from: BlockchainDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005! \"#$B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006%"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto;", "Lcom/robinhood/idl/MessageDto;", "Lrosetta/blockchain/v1/Blockchain;", "Landroid/os/Parcelable;", "Lrosetta/blockchain/v1/BlockchainDto$Surrogate;", "surrogate", "<init>", "(Lrosetta/blockchain/v1/BlockchainDto$Surrogate;)V", "Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto;", "blockchain", "(Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto;)V", "toProto", "()Lrosetta/blockchain/v1/Blockchain;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrosetta/blockchain/v1/BlockchainDto$Surrogate;", "Companion", "Surrogate", "BlockchainDto", "Serializer", "MultibindingModule", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class BlockchainDto implements Dto3<Blockchain>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BlockchainDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BlockchainDto, Blockchain>> binaryBase64Serializer$delegate;
    private static final BlockchainDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BlockchainDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BlockchainDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BlockchainDto(AbstractC50836BlockchainDto abstractC50836BlockchainDto) {
        AbstractC50836BlockchainDto.EthereumChain ethereumChain = abstractC50836BlockchainDto instanceof AbstractC50836BlockchainDto.EthereumChain ? (AbstractC50836BlockchainDto.EthereumChain) abstractC50836BlockchainDto : null;
        EthereumChainDto value = ethereumChain != null ? ethereumChain.getValue() : null;
        AbstractC50836BlockchainDto.PolygonPosChain polygonPosChain = abstractC50836BlockchainDto instanceof AbstractC50836BlockchainDto.PolygonPosChain ? (AbstractC50836BlockchainDto.PolygonPosChain) abstractC50836BlockchainDto : null;
        this(new Surrogate(value, polygonPosChain != null ? polygonPosChain.getValue() : null));
    }

    public /* synthetic */ BlockchainDto(AbstractC50836BlockchainDto abstractC50836BlockchainDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : abstractC50836BlockchainDto);
    }

    @Override // com.robinhood.idl.Dto
    public Blockchain toProto() {
        EthereumChainDto ethereum_chain = this.surrogate.getEthereum_chain();
        EthereumChain proto = ethereum_chain != null ? ethereum_chain.toProto() : null;
        PolygonProofOfStakeChainDto polygon_pos_chain = this.surrogate.getPolygon_pos_chain();
        return new Blockchain(proto, polygon_pos_chain != null ? polygon_pos_chain.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[rosetta.blockchain.v1.BlockchainDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BlockchainDto) && Intrinsics.areEqual(((BlockchainDto) other).surrogate, this.surrogate);
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
    /* compiled from: BlockchainDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$Surrogate;", "", "Lrosetta/blockchain/v1/EthereumChainDto;", "ethereum_chain", "Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;", "polygon_pos_chain", "<init>", "(Lrosetta/blockchain/v1/EthereumChainDto;Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/blockchain/v1/EthereumChainDto;Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$rosetta_blockchain_v1_externalRelease", "(Lrosetta/blockchain/v1/BlockchainDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/blockchain/v1/EthereumChainDto;", "getEthereum_chain", "()Lrosetta/blockchain/v1/EthereumChainDto;", "getEthereum_chain$annotations", "()V", "Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;", "getPolygon_pos_chain", "()Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;", "getPolygon_pos_chain$annotations", "Companion", "$serializer", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EthereumChainDto ethereum_chain;
        private final PolygonProofOfStakeChainDto polygon_pos_chain;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((EthereumChainDto) null, (PolygonProofOfStakeChainDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.ethereum_chain, surrogate.ethereum_chain) && Intrinsics.areEqual(this.polygon_pos_chain, surrogate.polygon_pos_chain);
        }

        public int hashCode() {
            EthereumChainDto ethereumChainDto = this.ethereum_chain;
            int iHashCode = (ethereumChainDto == null ? 0 : ethereumChainDto.hashCode()) * 31;
            PolygonProofOfStakeChainDto polygonProofOfStakeChainDto = this.polygon_pos_chain;
            return iHashCode + (polygonProofOfStakeChainDto != null ? polygonProofOfStakeChainDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(ethereum_chain=" + this.ethereum_chain + ", polygon_pos_chain=" + this.polygon_pos_chain + ")";
        }

        /* compiled from: BlockchainDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrosetta/blockchain/v1/BlockchainDto$Surrogate;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BlockchainDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EthereumChainDto ethereumChainDto, PolygonProofOfStakeChainDto polygonProofOfStakeChainDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.ethereum_chain = null;
            } else {
                this.ethereum_chain = ethereumChainDto;
            }
            if ((i & 2) == 0) {
                this.polygon_pos_chain = null;
            } else {
                this.polygon_pos_chain = polygonProofOfStakeChainDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_blockchain_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EthereumChainDto ethereumChainDto = self.ethereum_chain;
            if (ethereumChainDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EthereumChainDto.Serializer.INSTANCE, ethereumChainDto);
            }
            PolygonProofOfStakeChainDto polygonProofOfStakeChainDto = self.polygon_pos_chain;
            if (polygonProofOfStakeChainDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, PolygonProofOfStakeChainDto.Serializer.INSTANCE, polygonProofOfStakeChainDto);
            }
        }

        public Surrogate(EthereumChainDto ethereumChainDto, PolygonProofOfStakeChainDto polygonProofOfStakeChainDto) {
            this.ethereum_chain = ethereumChainDto;
            this.polygon_pos_chain = polygonProofOfStakeChainDto;
        }

        public /* synthetic */ Surrogate(EthereumChainDto ethereumChainDto, PolygonProofOfStakeChainDto polygonProofOfStakeChainDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : ethereumChainDto, (i & 2) != 0 ? null : polygonProofOfStakeChainDto);
        }

        public final EthereumChainDto getEthereum_chain() {
            return this.ethereum_chain;
        }

        public final PolygonProofOfStakeChainDto getPolygon_pos_chain() {
            return this.polygon_pos_chain;
        }
    }

    /* compiled from: BlockchainDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrosetta/blockchain/v1/BlockchainDto;", "Lrosetta/blockchain/v1/Blockchain;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/blockchain/v1/BlockchainDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BlockchainDto, Blockchain> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BlockchainDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BlockchainDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BlockchainDto> getBinaryBase64Serializer() {
            return (KSerializer) BlockchainDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Blockchain> getProtoAdapter() {
            return Blockchain.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BlockchainDto getZeroValue() {
            return BlockchainDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BlockchainDto fromProto(Blockchain proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            EthereumChain ethereum_chain = proto.getEthereum_chain();
            DefaultConstructorMarker defaultConstructorMarker = null;
            EthereumChainDto ethereumChainDtoFromProto = ethereum_chain != null ? EthereumChainDto.INSTANCE.fromProto(ethereum_chain) : null;
            PolygonProofOfStakeChain polygon_pos_chain = proto.getPolygon_pos_chain();
            return new BlockchainDto(new Surrogate(ethereumChainDtoFromProto, polygon_pos_chain != null ? PolygonProofOfStakeChainDto.INSTANCE.fromProto(polygon_pos_chain) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.blockchain.v1.BlockchainDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlockchainDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BlockchainDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BlockchainDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "EthereumChain", "PolygonPosChain", "Companion", "Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto$EthereumChain;", "Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto$PolygonPosChain;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    /* renamed from: rosetta.blockchain.v1.BlockchainDto$BlockchainDto, reason: collision with other inner class name */
    public static abstract class AbstractC50836BlockchainDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ AbstractC50836BlockchainDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC50836BlockchainDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: BlockchainDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto$EthereumChain;", "Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto;", "Lrosetta/blockchain/v1/EthereumChainDto;", "value", "<init>", "(Lrosetta/blockchain/v1/EthereumChainDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/blockchain/v1/EthereumChainDto;", "getValue", "()Lrosetta/blockchain/v1/EthereumChainDto;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: rosetta.blockchain.v1.BlockchainDto$BlockchainDto$EthereumChain, reason: from toString */
        public static final /* data */ class EthereumChain extends AbstractC50836BlockchainDto {
            private final EthereumChainDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof EthereumChain) && Intrinsics.areEqual(this.value, ((EthereumChain) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "EthereumChain(value=" + this.value + ")";
            }

            public final EthereumChainDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EthereumChain(EthereumChainDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BlockchainDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto$PolygonPosChain;", "Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto;", "Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;", "value", "<init>", "(Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;", "getValue", "()Lrosetta/blockchain/v1/PolygonProofOfStakeChainDto;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: rosetta.blockchain.v1.BlockchainDto$BlockchainDto$PolygonPosChain, reason: from toString */
        public static final /* data */ class PolygonPosChain extends AbstractC50836BlockchainDto {
            private final PolygonProofOfStakeChainDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PolygonPosChain) && Intrinsics.areEqual(this.value, ((PolygonPosChain) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PolygonPosChain(value=" + this.value + ")";
            }

            public final PolygonProofOfStakeChainDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PolygonPosChain(PolygonProofOfStakeChainDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: BlockchainDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lrosetta/blockchain/v1/BlockchainDto$BlockchainDto;", "Lrosetta/blockchain/v1/Blockchain;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: rosetta.blockchain.v1.BlockchainDto$BlockchainDto$Companion, reason: from kotlin metadata */
        /* loaded from: classes25.dex */
        public static final class Companion implements Dto4.Creator<AbstractC50836BlockchainDto, Blockchain> {
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
            public ProtoAdapter<Blockchain> getProtoAdapter() {
                return Blockchain.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public AbstractC50836BlockchainDto fromProto(Blockchain proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getEthereum_chain() != null) {
                    return new EthereumChain(EthereumChainDto.INSTANCE.fromProto(proto.getEthereum_chain()));
                }
                if (proto.getPolygon_pos_chain() != null) {
                    return new PolygonPosChain(PolygonProofOfStakeChainDto.INSTANCE.fromProto(proto.getPolygon_pos_chain()));
                }
                return null;
            }
        }
    }

    /* compiled from: BlockchainDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/blockchain/v1/BlockchainDto;", "<init>", "()V", "surrogateSerializer", "Lrosetta/blockchain/v1/BlockchainDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<BlockchainDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.blockchain.v1.Blockchain", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BlockchainDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BlockchainDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BlockchainDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BlockchainDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrosetta/blockchain/v1/BlockchainDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "rosetta.blockchain.v1.BlockchainDto";
        }
    }
}
