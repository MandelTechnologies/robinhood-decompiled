package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BlockchainNetwork.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BLOCKCHAIN_NETWORK_UNSPECIFIED", "ETHEREUM_ROPSTEN", "ETHEREUM_MAINNET", "POLYGON_POS_MUMBAI", "POLYGON_POS_MAINNET", "ETHEREUM_GOERLI", "BITCOIN_MAINNET", "DOGECOIN_MAINNET", "ARBITRUM_MAINNET", "OPTIMISM_MAINNET", "SOLANA_MAINNET", "BASE_MAINNET", "BNB_CHAIN_MAINNET", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class BlockchainNetwork implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlockchainNetwork[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BlockchainNetwork> ADAPTER;
    public static final BlockchainNetwork ARBITRUM_MAINNET;
    public static final BlockchainNetwork BASE_MAINNET;
    public static final BlockchainNetwork BITCOIN_MAINNET;
    public static final BlockchainNetwork BLOCKCHAIN_NETWORK_UNSPECIFIED;
    public static final BlockchainNetwork BNB_CHAIN_MAINNET;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BlockchainNetwork DOGECOIN_MAINNET;
    public static final BlockchainNetwork ETHEREUM_GOERLI;
    public static final BlockchainNetwork ETHEREUM_MAINNET;
    public static final BlockchainNetwork ETHEREUM_ROPSTEN;
    public static final BlockchainNetwork OPTIMISM_MAINNET;
    public static final BlockchainNetwork POLYGON_POS_MAINNET;
    public static final BlockchainNetwork POLYGON_POS_MUMBAI;
    public static final BlockchainNetwork SOLANA_MAINNET;
    private final int value;

    private static final /* synthetic */ BlockchainNetwork[] $values() {
        return new BlockchainNetwork[]{BLOCKCHAIN_NETWORK_UNSPECIFIED, ETHEREUM_ROPSTEN, ETHEREUM_MAINNET, POLYGON_POS_MUMBAI, POLYGON_POS_MAINNET, ETHEREUM_GOERLI, BITCOIN_MAINNET, DOGECOIN_MAINNET, ARBITRUM_MAINNET, OPTIMISM_MAINNET, SOLANA_MAINNET, BASE_MAINNET, BNB_CHAIN_MAINNET};
    }

    @JvmStatic
    public static final BlockchainNetwork fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BlockchainNetwork> getEntries() {
        return $ENTRIES;
    }

    private BlockchainNetwork(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BlockchainNetwork blockchainNetwork = new BlockchainNetwork("BLOCKCHAIN_NETWORK_UNSPECIFIED", 0, 0);
        BLOCKCHAIN_NETWORK_UNSPECIFIED = blockchainNetwork;
        ETHEREUM_ROPSTEN = new BlockchainNetwork("ETHEREUM_ROPSTEN", 1, 1);
        ETHEREUM_MAINNET = new BlockchainNetwork("ETHEREUM_MAINNET", 2, 2);
        POLYGON_POS_MUMBAI = new BlockchainNetwork("POLYGON_POS_MUMBAI", 3, 3);
        POLYGON_POS_MAINNET = new BlockchainNetwork("POLYGON_POS_MAINNET", 4, 4);
        ETHEREUM_GOERLI = new BlockchainNetwork("ETHEREUM_GOERLI", 5, 5);
        BITCOIN_MAINNET = new BlockchainNetwork("BITCOIN_MAINNET", 6, 6);
        DOGECOIN_MAINNET = new BlockchainNetwork("DOGECOIN_MAINNET", 7, 7);
        ARBITRUM_MAINNET = new BlockchainNetwork("ARBITRUM_MAINNET", 8, 8);
        OPTIMISM_MAINNET = new BlockchainNetwork("OPTIMISM_MAINNET", 9, 9);
        SOLANA_MAINNET = new BlockchainNetwork("SOLANA_MAINNET", 10, 10);
        BASE_MAINNET = new BlockchainNetwork("BASE_MAINNET", 11, 11);
        BNB_CHAIN_MAINNET = new BlockchainNetwork("BNB_CHAIN_MAINNET", 12, 12);
        BlockchainNetwork[] blockchainNetworkArr$values = $values();
        $VALUES = blockchainNetworkArr$values;
        $ENTRIES = EnumEntries2.enumEntries(blockchainNetworkArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BlockchainNetwork.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BlockchainNetwork>(orCreateKotlinClass, syntax, blockchainNetwork) { // from class: com.robinhood.rosetta.eventlogging.BlockchainNetwork$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BlockchainNetwork fromValue(int value) {
                return BlockchainNetwork.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BlockchainNetwork.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BlockchainNetwork fromValue(int value) {
            switch (value) {
                case 0:
                    return BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED;
                case 1:
                    return BlockchainNetwork.ETHEREUM_ROPSTEN;
                case 2:
                    return BlockchainNetwork.ETHEREUM_MAINNET;
                case 3:
                    return BlockchainNetwork.POLYGON_POS_MUMBAI;
                case 4:
                    return BlockchainNetwork.POLYGON_POS_MAINNET;
                case 5:
                    return BlockchainNetwork.ETHEREUM_GOERLI;
                case 6:
                    return BlockchainNetwork.BITCOIN_MAINNET;
                case 7:
                    return BlockchainNetwork.DOGECOIN_MAINNET;
                case 8:
                    return BlockchainNetwork.ARBITRUM_MAINNET;
                case 9:
                    return BlockchainNetwork.OPTIMISM_MAINNET;
                case 10:
                    return BlockchainNetwork.SOLANA_MAINNET;
                case 11:
                    return BlockchainNetwork.BASE_MAINNET;
                case 12:
                    return BlockchainNetwork.BNB_CHAIN_MAINNET;
                default:
                    return null;
            }
        }
    }

    public static BlockchainNetwork valueOf(String str) {
        return (BlockchainNetwork) Enum.valueOf(BlockchainNetwork.class, str);
    }

    public static BlockchainNetwork[] values() {
        return (BlockchainNetwork[]) $VALUES.clone();
    }
}
