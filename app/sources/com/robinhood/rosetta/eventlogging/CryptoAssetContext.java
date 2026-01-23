package com.robinhood.rosetta.eventlogging;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: CryptoAssetContext.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006!"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "Lcom/squareup/wire/Message;", "", "contract_address", "", "blockchain_network", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "asset_type", "Lcom/robinhood/rosetta/eventlogging/AssetType;", "symbol", "owner_address", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;Lcom/robinhood/rosetta/eventlogging/AssetType;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getContract_address", "()Ljava/lang/String;", "getBlockchain_network", "()Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "getAsset_type", "()Lcom/robinhood/rosetta/eventlogging/AssetType;", "getSymbol", "getOwner_address", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoAssetContext extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoAssetContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.AssetType#ADAPTER", jsonName = "assetType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AssetType asset_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.BlockchainNetwork#ADAPTER", jsonName = "blockchainNetwork", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final BlockchainNetwork blockchain_network;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ownerAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String owner_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String symbol;

    public CryptoAssetContext() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ CryptoAssetContext(String str, BlockchainNetwork blockchainNetwork, AssetType assetType, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED : blockchainNetwork, (i & 4) != 0 ? AssetType.ASSET_TYPE_UNSPECIFIED : assetType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24148newBuilder();
    }

    public final String getContract_address() {
        return this.contract_address;
    }

    public final BlockchainNetwork getBlockchain_network() {
        return this.blockchain_network;
    }

    public final AssetType getAsset_type() {
        return this.asset_type;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getOwner_address() {
        return this.owner_address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAssetContext(String contract_address, BlockchainNetwork blockchain_network, AssetType asset_type, String symbol, String owner_address, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(owner_address, "owner_address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_address = contract_address;
        this.blockchain_network = blockchain_network;
        this.asset_type = asset_type;
        this.symbol = symbol;
        this.owner_address = owner_address;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24148newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoAssetContext)) {
            return false;
        }
        CryptoAssetContext cryptoAssetContext = (CryptoAssetContext) other;
        return Intrinsics.areEqual(unknownFields(), cryptoAssetContext.unknownFields()) && Intrinsics.areEqual(this.contract_address, cryptoAssetContext.contract_address) && this.blockchain_network == cryptoAssetContext.blockchain_network && this.asset_type == cryptoAssetContext.asset_type && Intrinsics.areEqual(this.symbol, cryptoAssetContext.symbol) && Intrinsics.areEqual(this.owner_address, cryptoAssetContext.owner_address);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.contract_address.hashCode()) * 37) + this.blockchain_network.hashCode()) * 37) + this.asset_type.hashCode()) * 37) + this.symbol.hashCode()) * 37) + this.owner_address.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_address=" + Internal.sanitize(this.contract_address));
        arrayList.add("blockchain_network=" + this.blockchain_network);
        arrayList.add("asset_type=" + this.asset_type);
        arrayList.add("symbol=" + Internal.sanitize(this.symbol));
        arrayList.add("owner_address=" + Internal.sanitize(this.owner_address));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoAssetContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoAssetContext copy$default(CryptoAssetContext cryptoAssetContext, String str, BlockchainNetwork blockchainNetwork, AssetType assetType, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoAssetContext.contract_address;
        }
        if ((i & 2) != 0) {
            blockchainNetwork = cryptoAssetContext.blockchain_network;
        }
        if ((i & 4) != 0) {
            assetType = cryptoAssetContext.asset_type;
        }
        if ((i & 8) != 0) {
            str2 = cryptoAssetContext.symbol;
        }
        if ((i & 16) != 0) {
            str3 = cryptoAssetContext.owner_address;
        }
        if ((i & 32) != 0) {
            byteString = cryptoAssetContext.unknownFields();
        }
        String str4 = str3;
        ByteString byteString2 = byteString;
        return cryptoAssetContext.copy(str, blockchainNetwork, assetType, str2, str4, byteString2);
    }

    public final CryptoAssetContext copy(String contract_address, BlockchainNetwork blockchain_network, AssetType asset_type, String symbol, String owner_address, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(asset_type, "asset_type");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(owner_address, "owner_address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoAssetContext(contract_address, blockchain_network, asset_type, symbol, owner_address, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoAssetContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoAssetContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoAssetContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoAssetContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_address(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_address());
                }
                if (value.getBlockchain_network() != BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED) {
                    size += BlockchainNetwork.ADAPTER.encodedSizeWithTag(2, value.getBlockchain_network());
                }
                if (value.getAsset_type() != AssetType.ASSET_TYPE_UNSPECIFIED) {
                    size += AssetType.ADAPTER.encodedSizeWithTag(3, value.getAsset_type());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSymbol());
                }
                return !Intrinsics.areEqual(value.getOwner_address(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(5, value.getOwner_address()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoAssetContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_address());
                }
                if (value.getBlockchain_network() != BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED) {
                    BlockchainNetwork.ADAPTER.encodeWithTag(writer, 2, (int) value.getBlockchain_network());
                }
                if (value.getAsset_type() != AssetType.ASSET_TYPE_UNSPECIFIED) {
                    AssetType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsset_type());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (!Intrinsics.areEqual(value.getOwner_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOwner_address());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoAssetContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getOwner_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOwner_address());
                }
                if (!Intrinsics.areEqual(value.getSymbol(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSymbol());
                }
                if (value.getAsset_type() != AssetType.ASSET_TYPE_UNSPECIFIED) {
                    AssetType.ADAPTER.encodeWithTag(writer, 3, (int) value.getAsset_type());
                }
                if (value.getBlockchain_network() != BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED) {
                    BlockchainNetwork.ADAPTER.encodeWithTag(writer, 2, (int) value.getBlockchain_network());
                }
                if (Intrinsics.areEqual(value.getContract_address(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_address());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoAssetContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                BlockchainNetwork blockchainNetworkDecode = BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED;
                AssetType assetType = AssetType.ASSET_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                AssetType assetTypeDecode = assetType;
                while (true) {
                    BlockchainNetwork blockchainNetwork = blockchainNetworkDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CryptoAssetContext(strDecode, blockchainNetwork, assetTypeDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            try {
                                blockchainNetworkDecode = BlockchainNetwork.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        } else if (iNextTag == 3) {
                            try {
                                assetTypeDecode = AssetType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        } else if (iNextTag == 4) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoAssetContext redact(CryptoAssetContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoAssetContext.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
