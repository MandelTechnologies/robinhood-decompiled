package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BlockchainNetworkDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001f B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "BLOCKCHAIN_NETWORK_UNSPECIFIED", "ETHEREUM_ROPSTEN", "ETHEREUM_MAINNET", "POLYGON_POS_MUMBAI", "POLYGON_POS_MAINNET", "ETHEREUM_GOERLI", "BITCOIN_MAINNET", "DOGECOIN_MAINNET", "ARBITRUM_MAINNET", "OPTIMISM_MAINNET", "SOLANA_MAINNET", "BASE_MAINNET", "BNB_CHAIN_MAINNET", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public abstract class BlockchainNetworkDto implements Dto2<BlockchainNetwork>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlockchainNetworkDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<BlockchainNetworkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BlockchainNetworkDto, BlockchainNetwork>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final BlockchainNetworkDto BLOCKCHAIN_NETWORK_UNSPECIFIED = new BlockchainNetworkDto("BLOCKCHAIN_NETWORK_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.BLOCKCHAIN_NETWORK_UNSPECIFIED
        {
            String str = "BLOCKCHAIN_NETWORK_UNSPECIFIED";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED;
        }
    };
    public static final BlockchainNetworkDto ETHEREUM_ROPSTEN = new BlockchainNetworkDto("ETHEREUM_ROPSTEN", 1) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.ETHEREUM_ROPSTEN
        {
            String str = "ETHEREUM_ROPSTEN";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.ETHEREUM_ROPSTEN;
        }
    };
    public static final BlockchainNetworkDto ETHEREUM_MAINNET = new BlockchainNetworkDto("ETHEREUM_MAINNET", 2) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.ETHEREUM_MAINNET
        {
            String str = "ETHEREUM_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.ETHEREUM_MAINNET;
        }
    };
    public static final BlockchainNetworkDto POLYGON_POS_MUMBAI = new BlockchainNetworkDto("POLYGON_POS_MUMBAI", 3) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.POLYGON_POS_MUMBAI
        {
            String str = "POLYGON_POS_MUMBAI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.POLYGON_POS_MUMBAI;
        }
    };
    public static final BlockchainNetworkDto POLYGON_POS_MAINNET = new BlockchainNetworkDto("POLYGON_POS_MAINNET", 4) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.POLYGON_POS_MAINNET
        {
            String str = "POLYGON_POS_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.POLYGON_POS_MAINNET;
        }
    };
    public static final BlockchainNetworkDto ETHEREUM_GOERLI = new BlockchainNetworkDto("ETHEREUM_GOERLI", 5) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.ETHEREUM_GOERLI
        {
            String str = "ETHEREUM_GOERLI";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.ETHEREUM_GOERLI;
        }
    };
    public static final BlockchainNetworkDto BITCOIN_MAINNET = new BlockchainNetworkDto("BITCOIN_MAINNET", 6) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.BITCOIN_MAINNET
        {
            String str = "BITCOIN_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.BITCOIN_MAINNET;
        }
    };
    public static final BlockchainNetworkDto DOGECOIN_MAINNET = new BlockchainNetworkDto("DOGECOIN_MAINNET", 7) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.DOGECOIN_MAINNET
        {
            String str = "DOGECOIN_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.DOGECOIN_MAINNET;
        }
    };
    public static final BlockchainNetworkDto ARBITRUM_MAINNET = new BlockchainNetworkDto("ARBITRUM_MAINNET", 8) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.ARBITRUM_MAINNET
        {
            String str = "ARBITRUM_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.ARBITRUM_MAINNET;
        }
    };
    public static final BlockchainNetworkDto OPTIMISM_MAINNET = new BlockchainNetworkDto("OPTIMISM_MAINNET", 9) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.OPTIMISM_MAINNET
        {
            String str = "OPTIMISM_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.OPTIMISM_MAINNET;
        }
    };
    public static final BlockchainNetworkDto SOLANA_MAINNET = new BlockchainNetworkDto("SOLANA_MAINNET", 10) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.SOLANA_MAINNET
        {
            String str = "SOLANA_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.SOLANA_MAINNET;
        }
    };
    public static final BlockchainNetworkDto BASE_MAINNET = new BlockchainNetworkDto("BASE_MAINNET", 11) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.BASE_MAINNET
        {
            String str = "BASE_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.BASE_MAINNET;
        }
    };
    public static final BlockchainNetworkDto BNB_CHAIN_MAINNET = new BlockchainNetworkDto("BNB_CHAIN_MAINNET", 12) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto.BNB_CHAIN_MAINNET
        {
            String str = "BNB_CHAIN_MAINNET";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public BlockchainNetwork toProto() {
            return BlockchainNetwork.BNB_CHAIN_MAINNET;
        }
    };

    private static final /* synthetic */ BlockchainNetworkDto[] $values() {
        return new BlockchainNetworkDto[]{BLOCKCHAIN_NETWORK_UNSPECIFIED, ETHEREUM_ROPSTEN, ETHEREUM_MAINNET, POLYGON_POS_MUMBAI, POLYGON_POS_MAINNET, ETHEREUM_GOERLI, BITCOIN_MAINNET, DOGECOIN_MAINNET, ARBITRUM_MAINNET, OPTIMISM_MAINNET, SOLANA_MAINNET, BASE_MAINNET, BNB_CHAIN_MAINNET};
    }

    public /* synthetic */ BlockchainNetworkDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<BlockchainNetworkDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BlockchainNetworkDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        BlockchainNetworkDto[] blockchainNetworkDtoArr$values = $values();
        $VALUES = blockchainNetworkDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(blockchainNetworkDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetworkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BlockchainNetworkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: BlockchainNetworkDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<BlockchainNetworkDto, BlockchainNetwork> {

        /* compiled from: BlockchainNetworkDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BlockchainNetwork.values().length];
                try {
                    iArr[BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BlockchainNetwork.ETHEREUM_ROPSTEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BlockchainNetwork.ETHEREUM_MAINNET.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BlockchainNetwork.POLYGON_POS_MUMBAI.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BlockchainNetwork.POLYGON_POS_MAINNET.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[BlockchainNetwork.ETHEREUM_GOERLI.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[BlockchainNetwork.BITCOIN_MAINNET.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[BlockchainNetwork.DOGECOIN_MAINNET.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[BlockchainNetwork.ARBITRUM_MAINNET.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[BlockchainNetwork.OPTIMISM_MAINNET.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[BlockchainNetwork.SOLANA_MAINNET.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[BlockchainNetwork.BASE_MAINNET.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[BlockchainNetwork.BNB_CHAIN_MAINNET.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BlockchainNetworkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BlockchainNetworkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BlockchainNetworkDto> getBinaryBase64Serializer() {
            return (KSerializer) BlockchainNetworkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BlockchainNetwork> getProtoAdapter() {
            return BlockchainNetwork.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BlockchainNetworkDto getZeroValue() {
            return BlockchainNetworkDto.BLOCKCHAIN_NETWORK_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BlockchainNetworkDto fromProto(BlockchainNetwork proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return BlockchainNetworkDto.BLOCKCHAIN_NETWORK_UNSPECIFIED;
                case 2:
                    return BlockchainNetworkDto.ETHEREUM_ROPSTEN;
                case 3:
                    return BlockchainNetworkDto.ETHEREUM_MAINNET;
                case 4:
                    return BlockchainNetworkDto.POLYGON_POS_MUMBAI;
                case 5:
                    return BlockchainNetworkDto.POLYGON_POS_MAINNET;
                case 6:
                    return BlockchainNetworkDto.ETHEREUM_GOERLI;
                case 7:
                    return BlockchainNetworkDto.BITCOIN_MAINNET;
                case 8:
                    return BlockchainNetworkDto.DOGECOIN_MAINNET;
                case 9:
                    return BlockchainNetworkDto.ARBITRUM_MAINNET;
                case 10:
                    return BlockchainNetworkDto.OPTIMISM_MAINNET;
                case 11:
                    return BlockchainNetworkDto.SOLANA_MAINNET;
                case 12:
                    return BlockchainNetworkDto.BASE_MAINNET;
                case 13:
                    return BlockchainNetworkDto.BNB_CHAIN_MAINNET;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BlockchainNetworkDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetworkDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<BlockchainNetworkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<BlockchainNetworkDto, BlockchainNetwork> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.BlockchainNetwork", BlockchainNetworkDto.getEntries(), BlockchainNetworkDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public BlockchainNetworkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (BlockchainNetworkDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BlockchainNetworkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static BlockchainNetworkDto valueOf(String str) {
        return (BlockchainNetworkDto) Enum.valueOf(BlockchainNetworkDto.class, str);
    }

    public static BlockchainNetworkDto[] values() {
        return (BlockchainNetworkDto[]) $VALUES.clone();
    }
}
