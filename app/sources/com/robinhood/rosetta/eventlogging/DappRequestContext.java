package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.DappRequestContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: DappRequestContext.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003456B\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010,\u001a\u00020\u0002H\u0017J\u0013\u0010-\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010/H\u0096\u0002J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0004H\u0016J\u008a\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010'R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContext;", "Lcom/squareup/wire/Message;", "", "dapp_name", "", "dapp_url", "contract_address", "transaction_hash", "transaction_token_id", "Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "network_fee", "", "rh_fee", "token_balance_displayed", "contract_type", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "is_connected", "", "blockchain_network", "Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "request_origin", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;DDDLcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;ZLcom/robinhood/rosetta/eventlogging/BlockchainNetwork;Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;Lokio/ByteString;)V", "getDapp_name", "()Ljava/lang/String;", "getDapp_url", "getContract_address", "getTransaction_hash", "getTransaction_token_id", "()Lcom/robinhood/rosetta/eventlogging/CryptoAssetContext;", "getNetwork_fee", "()D", "getRh_fee", "getToken_balance_displayed", "getContract_type", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "()Z", "getBlockchain_network", "()Lcom/robinhood/rosetta/eventlogging/BlockchainNetwork;", "getRequest_origin", "()Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "ContractType", "RequestOrigin", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class DappRequestContext extends Message {

    @JvmField
    public static final ProtoAdapter<DappRequestContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.BlockchainNetwork#ADAPTER", jsonName = "blockchainNetwork", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final BlockchainNetwork blockchain_network;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String contract_address;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DappRequestContext$ContractType#ADAPTER", jsonName = "contractType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final ContractType contract_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dappName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String dapp_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dappUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String dapp_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isConnected", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean is_connected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "networkFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final double network_fee;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.DappRequestContext$RequestOrigin#ADAPTER", jsonName = "requestOrigin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final RequestOrigin request_origin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "rhFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final double rh_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "tokenBalanceDisplayed", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final double token_balance_displayed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transactionHash", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String transaction_hash;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoAssetContext#ADAPTER", jsonName = "transactionTokenId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final CryptoAssetContext transaction_token_id;

    public DappRequestContext() {
        this(null, null, null, null, null, 0.0d, 0.0d, 0.0d, null, false, null, null, null, 8191, null);
    }

    public /* synthetic */ DappRequestContext(String str, String str2, String str3, String str4, CryptoAssetContext cryptoAssetContext, double d, double d2, double d3, ContractType contractType, boolean z, BlockchainNetwork blockchainNetwork, RequestOrigin requestOrigin, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : cryptoAssetContext, (i & 32) != 0 ? 0.0d : d, (i & 64) != 0 ? 0.0d : d2, (i & 128) == 0 ? d3 : 0.0d, (i & 256) != 0 ? ContractType.CONTRACT_UNSPECIFIED : contractType, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED : blockchainNetwork, (i & 2048) != 0 ? RequestOrigin.ORIGIN_UNSPECIFIED : requestOrigin, (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24180newBuilder();
    }

    public final String getDapp_name() {
        return this.dapp_name;
    }

    public final String getDapp_url() {
        return this.dapp_url;
    }

    public final String getContract_address() {
        return this.contract_address;
    }

    public final String getTransaction_hash() {
        return this.transaction_hash;
    }

    public final CryptoAssetContext getTransaction_token_id() {
        return this.transaction_token_id;
    }

    public final double getNetwork_fee() {
        return this.network_fee;
    }

    public final double getRh_fee() {
        return this.rh_fee;
    }

    public final double getToken_balance_displayed() {
        return this.token_balance_displayed;
    }

    public final ContractType getContract_type() {
        return this.contract_type;
    }

    /* renamed from: is_connected, reason: from getter */
    public final boolean getIs_connected() {
        return this.is_connected;
    }

    public final BlockchainNetwork getBlockchain_network() {
        return this.blockchain_network;
    }

    public final RequestOrigin getRequest_origin() {
        return this.request_origin;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappRequestContext(String dapp_name, String dapp_url, String contract_address, String transaction_hash, CryptoAssetContext cryptoAssetContext, double d, double d2, double d3, ContractType contract_type, boolean z, BlockchainNetwork blockchain_network, RequestOrigin request_origin, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(request_origin, "request_origin");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.dapp_name = dapp_name;
        this.dapp_url = dapp_url;
        this.contract_address = contract_address;
        this.transaction_hash = transaction_hash;
        this.transaction_token_id = cryptoAssetContext;
        this.network_fee = d;
        this.rh_fee = d2;
        this.token_balance_displayed = d3;
        this.contract_type = contract_type;
        this.is_connected = z;
        this.blockchain_network = blockchain_network;
        this.request_origin = request_origin;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24180newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DappRequestContext)) {
            return false;
        }
        DappRequestContext dappRequestContext = (DappRequestContext) other;
        return Intrinsics.areEqual(unknownFields(), dappRequestContext.unknownFields()) && Intrinsics.areEqual(this.dapp_name, dappRequestContext.dapp_name) && Intrinsics.areEqual(this.dapp_url, dappRequestContext.dapp_url) && Intrinsics.areEqual(this.contract_address, dappRequestContext.contract_address) && Intrinsics.areEqual(this.transaction_hash, dappRequestContext.transaction_hash) && Intrinsics.areEqual(this.transaction_token_id, dappRequestContext.transaction_token_id) && this.network_fee == dappRequestContext.network_fee && this.rh_fee == dappRequestContext.rh_fee && this.token_balance_displayed == dappRequestContext.token_balance_displayed && this.contract_type == dappRequestContext.contract_type && this.is_connected == dappRequestContext.is_connected && this.blockchain_network == dappRequestContext.blockchain_network && this.request_origin == dappRequestContext.request_origin;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.dapp_name.hashCode()) * 37) + this.dapp_url.hashCode()) * 37) + this.contract_address.hashCode()) * 37) + this.transaction_hash.hashCode()) * 37;
        CryptoAssetContext cryptoAssetContext = this.transaction_token_id;
        int iHashCode2 = ((((((((((((((iHashCode + (cryptoAssetContext != null ? cryptoAssetContext.hashCode() : 0)) * 37) + Double.hashCode(this.network_fee)) * 37) + Double.hashCode(this.rh_fee)) * 37) + Double.hashCode(this.token_balance_displayed)) * 37) + this.contract_type.hashCode()) * 37) + java.lang.Boolean.hashCode(this.is_connected)) * 37) + this.blockchain_network.hashCode()) * 37) + this.request_origin.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dapp_name=" + Internal.sanitize(this.dapp_name));
        arrayList.add("dapp_url=" + Internal.sanitize(this.dapp_url));
        arrayList.add("contract_address=" + Internal.sanitize(this.contract_address));
        arrayList.add("transaction_hash=" + Internal.sanitize(this.transaction_hash));
        CryptoAssetContext cryptoAssetContext = this.transaction_token_id;
        if (cryptoAssetContext != null) {
            arrayList.add("transaction_token_id=" + cryptoAssetContext);
        }
        arrayList.add("network_fee=" + this.network_fee);
        arrayList.add("rh_fee=" + this.rh_fee);
        arrayList.add("token_balance_displayed=" + this.token_balance_displayed);
        arrayList.add("contract_type=" + this.contract_type);
        arrayList.add("is_connected=" + this.is_connected);
        arrayList.add("blockchain_network=" + this.blockchain_network);
        arrayList.add("request_origin=" + this.request_origin);
        return CollectionsKt.joinToString$default(arrayList, ", ", "DappRequestContext{", "}", 0, null, null, 56, null);
    }

    public final DappRequestContext copy(String dapp_name, String dapp_url, String contract_address, String transaction_hash, CryptoAssetContext transaction_token_id, double network_fee, double rh_fee, double token_balance_displayed, ContractType contract_type, boolean is_connected, BlockchainNetwork blockchain_network, RequestOrigin request_origin, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(dapp_name, "dapp_name");
        Intrinsics.checkNotNullParameter(dapp_url, "dapp_url");
        Intrinsics.checkNotNullParameter(contract_address, "contract_address");
        Intrinsics.checkNotNullParameter(transaction_hash, "transaction_hash");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        Intrinsics.checkNotNullParameter(blockchain_network, "blockchain_network");
        Intrinsics.checkNotNullParameter(request_origin, "request_origin");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DappRequestContext(dapp_name, dapp_url, contract_address, transaction_hash, transaction_token_id, network_fee, rh_fee, token_balance_displayed, contract_type, is_connected, blockchain_network, request_origin, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DappRequestContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DappRequestContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.DappRequestContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DappRequestContext value) {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getDapp_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDapp_name());
                }
                if (!Intrinsics.areEqual(value.getDapp_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDapp_url());
                }
                if (!Intrinsics.areEqual(value.getContract_address(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getContract_address());
                }
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTransaction_hash());
                }
                if (value.getTransaction_token_id() != null) {
                    size += CryptoAssetContext.ADAPTER.encodedSizeWithTag(5, value.getTransaction_token_id());
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(6, Double.valueOf(value.getNetwork_fee()));
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(7, Double.valueOf(value.getRh_fee()));
                }
                if (!Double.valueOf(value.getToken_balance_displayed()).equals(dValueOf)) {
                    size += ProtoAdapter.DOUBLE.encodedSizeWithTag(8, Double.valueOf(value.getToken_balance_displayed()));
                }
                if (value.getContract_type() != DappRequestContext.ContractType.CONTRACT_UNSPECIFIED) {
                    size += DappRequestContext.ContractType.ADAPTER.encodedSizeWithTag(9, value.getContract_type());
                }
                if (value.getIs_connected()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, java.lang.Boolean.valueOf(value.getIs_connected()));
                }
                if (value.getBlockchain_network() != BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED) {
                    size += BlockchainNetwork.ADAPTER.encodedSizeWithTag(11, value.getBlockchain_network());
                }
                return value.getRequest_origin() != DappRequestContext.RequestOrigin.ORIGIN_UNSPECIFIED ? size + DappRequestContext.RequestOrigin.ADAPTER.encodedSizeWithTag(12, value.getRequest_origin()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DappRequestContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getDapp_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDapp_name());
                }
                if (!Intrinsics.areEqual(value.getDapp_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDapp_url());
                }
                if (!Intrinsics.areEqual(value.getContract_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getContract_address());
                }
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTransaction_hash());
                }
                if (value.getTransaction_token_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getTransaction_token_id());
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getNetwork_fee()));
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getRh_fee()));
                }
                if (!Double.valueOf(value.getToken_balance_displayed()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getToken_balance_displayed()));
                }
                if (value.getContract_type() != DappRequestContext.ContractType.CONTRACT_UNSPECIFIED) {
                    DappRequestContext.ContractType.ADAPTER.encodeWithTag(writer, 9, (int) value.getContract_type());
                }
                if (value.getIs_connected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getIs_connected()));
                }
                if (value.getBlockchain_network() != BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED) {
                    BlockchainNetwork.ADAPTER.encodeWithTag(writer, 11, (int) value.getBlockchain_network());
                }
                if (value.getRequest_origin() != DappRequestContext.RequestOrigin.ORIGIN_UNSPECIFIED) {
                    DappRequestContext.RequestOrigin.ADAPTER.encodeWithTag(writer, 12, (int) value.getRequest_origin());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DappRequestContext value) throws IOException {
                Double dValueOf = Double.valueOf(0.0d);
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRequest_origin() != DappRequestContext.RequestOrigin.ORIGIN_UNSPECIFIED) {
                    DappRequestContext.RequestOrigin.ADAPTER.encodeWithTag(writer, 12, (int) value.getRequest_origin());
                }
                if (value.getBlockchain_network() != BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED) {
                    BlockchainNetwork.ADAPTER.encodeWithTag(writer, 11, (int) value.getBlockchain_network());
                }
                if (value.getIs_connected()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) java.lang.Boolean.valueOf(value.getIs_connected()));
                }
                if (value.getContract_type() != DappRequestContext.ContractType.CONTRACT_UNSPECIFIED) {
                    DappRequestContext.ContractType.ADAPTER.encodeWithTag(writer, 9, (int) value.getContract_type());
                }
                if (!Double.valueOf(value.getToken_balance_displayed()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 8, (int) Double.valueOf(value.getToken_balance_displayed()));
                }
                if (!Double.valueOf(value.getRh_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 7, (int) Double.valueOf(value.getRh_fee()));
                }
                if (!Double.valueOf(value.getNetwork_fee()).equals(dValueOf)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 6, (int) Double.valueOf(value.getNetwork_fee()));
                }
                if (value.getTransaction_token_id() != null) {
                    CryptoAssetContext.ADAPTER.encodeWithTag(writer, 5, (int) value.getTransaction_token_id());
                }
                if (!Intrinsics.areEqual(value.getTransaction_hash(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getTransaction_hash());
                }
                if (!Intrinsics.areEqual(value.getContract_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getContract_address());
                }
                if (!Intrinsics.areEqual(value.getDapp_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDapp_url());
                }
                if (Intrinsics.areEqual(value.getDapp_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDapp_name());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DappRequestContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DappRequestContext.ContractType contractTypeDecode = DappRequestContext.ContractType.CONTRACT_UNSPECIFIED;
                BlockchainNetwork blockchainNetwork = BlockchainNetwork.BLOCKCHAIN_NETWORK_UNSPECIFIED;
                DappRequestContext.RequestOrigin requestOrigin = DappRequestContext.RequestOrigin.ORIGIN_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                CryptoAssetContext cryptoAssetContextDecode = null;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = 0.0d;
                double dDoubleValue3 = 0.0d;
                boolean zBooleanValue = false;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                DappRequestContext.RequestOrigin requestOriginDecode = requestOrigin;
                BlockchainNetwork blockchainNetworkDecode = blockchainNetwork;
                while (true) {
                    DappRequestContext.ContractType contractType = contractTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 3:
                                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 4:
                                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    cryptoAssetContextDecode = CryptoAssetContext.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 7:
                                    dDoubleValue2 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 8:
                                    dDoubleValue3 = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                                    break;
                                case 9:
                                    try {
                                        contractTypeDecode = DappRequestContext.ContractType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 10:
                                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                    break;
                                case 11:
                                    try {
                                        blockchainNetworkDecode = BlockchainNetwork.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 12:
                                    try {
                                        requestOriginDecode = DappRequestContext.RequestOrigin.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new DappRequestContext(strDecode, strDecode2, strDecode3, strDecode4, cryptoAssetContextDecode, dDoubleValue, dDoubleValue2, dDoubleValue3, contractType, zBooleanValue, blockchainNetworkDecode, requestOriginDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DappRequestContext redact(DappRequestContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoAssetContext transaction_token_id = value.getTransaction_token_id();
                return value.copy((4079 & 1) != 0 ? value.dapp_name : null, (4079 & 2) != 0 ? value.dapp_url : null, (4079 & 4) != 0 ? value.contract_address : null, (4079 & 8) != 0 ? value.transaction_hash : null, (4079 & 16) != 0 ? value.transaction_token_id : transaction_token_id != null ? CryptoAssetContext.ADAPTER.redact(transaction_token_id) : null, (4079 & 32) != 0 ? value.network_fee : 0.0d, (4079 & 64) != 0 ? value.rh_fee : 0.0d, (4079 & 128) != 0 ? value.token_balance_displayed : 0.0d, (4079 & 256) != 0 ? value.contract_type : null, (4079 & 512) != 0 ? value.is_connected : false, (4079 & 1024) != 0 ? value.blockchain_network : null, (4079 & 2048) != 0 ? value.request_origin : null, (4079 & 4096) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappRequestContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTRACT_UNSPECIFIED", "MESSAGE_SIGNATURE", "DAPP_CONNECTION", "TOKEN_APPROVAL", "TRANSFER", "SMART_CONTRACT_OTHER", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ContractType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ContractType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<ContractType> ADAPTER;
        public static final ContractType CONTRACT_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final ContractType DAPP_CONNECTION;
        public static final ContractType MESSAGE_SIGNATURE;
        public static final ContractType SMART_CONTRACT_OTHER;
        public static final ContractType TOKEN_APPROVAL;
        public static final ContractType TRANSFER;
        private final int value;

        private static final /* synthetic */ ContractType[] $values() {
            return new ContractType[]{CONTRACT_UNSPECIFIED, MESSAGE_SIGNATURE, DAPP_CONNECTION, TOKEN_APPROVAL, TRANSFER, SMART_CONTRACT_OTHER};
        }

        @JvmStatic
        public static final ContractType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<ContractType> getEntries() {
            return $ENTRIES;
        }

        private ContractType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final ContractType contractType = new ContractType("CONTRACT_UNSPECIFIED", 0, 0);
            CONTRACT_UNSPECIFIED = contractType;
            MESSAGE_SIGNATURE = new ContractType("MESSAGE_SIGNATURE", 1, 1);
            DAPP_CONNECTION = new ContractType("DAPP_CONNECTION", 2, 2);
            TOKEN_APPROVAL = new ContractType("TOKEN_APPROVAL", 3, 3);
            TRANSFER = new ContractType("TRANSFER", 4, 4);
            SMART_CONTRACT_OTHER = new ContractType("SMART_CONTRACT_OTHER", 5, 5);
            ContractType[] contractTypeArr$values = $values();
            $VALUES = contractTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(contractTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<ContractType>(orCreateKotlinClass, syntax, contractType) { // from class: com.robinhood.rosetta.eventlogging.DappRequestContext$ContractType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DappRequestContext.ContractType fromValue(int value) {
                    return DappRequestContext.ContractType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DappRequestContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$ContractType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ContractType fromValue(int value) {
                if (value == 0) {
                    return ContractType.CONTRACT_UNSPECIFIED;
                }
                if (value == 1) {
                    return ContractType.MESSAGE_SIGNATURE;
                }
                if (value == 2) {
                    return ContractType.DAPP_CONNECTION;
                }
                if (value == 3) {
                    return ContractType.TOKEN_APPROVAL;
                }
                if (value == 4) {
                    return ContractType.TRANSFER;
                }
                if (value != 5) {
                    return null;
                }
                return ContractType.SMART_CONTRACT_OTHER;
            }
        }

        public static ContractType valueOf(String str) {
            return (ContractType) Enum.valueOf(ContractType.class, str);
        }

        public static ContractType[] values() {
            return (ContractType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DappRequestContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ORIGIN_UNSPECIFIED", "DAPP_BROWSER", "WALLETCONNECT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RequestOrigin implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RequestOrigin[] $VALUES;

        @JvmField
        public static final ProtoAdapter<RequestOrigin> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final RequestOrigin DAPP_BROWSER;
        public static final RequestOrigin ORIGIN_UNSPECIFIED;
        public static final RequestOrigin WALLETCONNECT;
        private final int value;

        private static final /* synthetic */ RequestOrigin[] $values() {
            return new RequestOrigin[]{ORIGIN_UNSPECIFIED, DAPP_BROWSER, WALLETCONNECT};
        }

        @JvmStatic
        public static final RequestOrigin fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<RequestOrigin> getEntries() {
            return $ENTRIES;
        }

        private RequestOrigin(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final RequestOrigin requestOrigin = new RequestOrigin("ORIGIN_UNSPECIFIED", 0, 0);
            ORIGIN_UNSPECIFIED = requestOrigin;
            DAPP_BROWSER = new RequestOrigin("DAPP_BROWSER", 1, 1);
            WALLETCONNECT = new RequestOrigin("WALLETCONNECT", 2, 2);
            RequestOrigin[] requestOriginArr$values = $values();
            $VALUES = requestOriginArr$values;
            $ENTRIES = EnumEntries2.enumEntries(requestOriginArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RequestOrigin.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<RequestOrigin>(orCreateKotlinClass, syntax, requestOrigin) { // from class: com.robinhood.rosetta.eventlogging.DappRequestContext$RequestOrigin$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public DappRequestContext.RequestOrigin fromValue(int value) {
                    return DappRequestContext.RequestOrigin.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: DappRequestContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/DappRequestContext$RequestOrigin;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final RequestOrigin fromValue(int value) {
                if (value == 0) {
                    return RequestOrigin.ORIGIN_UNSPECIFIED;
                }
                if (value == 1) {
                    return RequestOrigin.DAPP_BROWSER;
                }
                if (value != 2) {
                    return null;
                }
                return RequestOrigin.WALLETCONNECT;
            }
        }

        public static RequestOrigin valueOf(String str) {
            return (RequestOrigin) Enum.valueOf(RequestOrigin.class, str);
        }

        public static RequestOrigin[] values() {
            return (RequestOrigin[]) $VALUES.clone();
        }
    }
}
