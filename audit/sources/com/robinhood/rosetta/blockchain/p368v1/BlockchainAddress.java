package com.robinhood.rosetta.blockchain.p368v1;

import com.google.android.libraries.places.api.model.PlaceTypes;
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
import rosetta.blockchain.p533v1.AddressType;
import rosetta.blockchain.p533v1.Blockchain;

/* compiled from: BlockchainAddress.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J0\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/blockchain/v1/BlockchainAddress;", "Lcom/squareup/wire/Message;", "", "blockchain", "Lrosetta/blockchain/v1/Blockchain;", "address_type", "Lrosetta/blockchain/v1/AddressType;", PlaceTypes.ADDRESS, "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/blockchain/v1/Blockchain;Lrosetta/blockchain/v1/AddressType;Ljava/lang/String;Lokio/ByteString;)V", "getBlockchain", "()Lrosetta/blockchain/v1/Blockchain;", "getAddress_type", "()Lrosetta/blockchain/v1/AddressType;", "getAddress", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class BlockchainAddress extends Message {

    @JvmField
    public static final ProtoAdapter<BlockchainAddress> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final String address;

    @WireField(adapter = "rosetta.blockchain.v1.AddressType#ADAPTER", jsonName = "addressType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
    private final AddressType address_type;

    @WireField(adapter = "rosetta.blockchain.v1.Blockchain#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 4)
    private final Blockchain blockchain;

    public BlockchainAddress() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m23945newBuilder();
    }

    public final Blockchain getBlockchain() {
        return this.blockchain;
    }

    public final AddressType getAddress_type() {
        return this.address_type;
    }

    public /* synthetic */ BlockchainAddress(Blockchain blockchain, AddressType addressType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : blockchain, (i & 2) != 0 ? AddressType.ADDRESS_TYPE_UNSPECIFIED : addressType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getAddress() {
        return this.address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockchainAddress(Blockchain blockchain, AddressType address_type, String address, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(address_type, "address_type");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.blockchain = blockchain;
        this.address_type = address_type;
        this.address = address;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m23945newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof BlockchainAddress)) {
            return false;
        }
        BlockchainAddress blockchainAddress = (BlockchainAddress) other;
        return Intrinsics.areEqual(unknownFields(), blockchainAddress.unknownFields()) && Intrinsics.areEqual(this.blockchain, blockchainAddress.blockchain) && this.address_type == blockchainAddress.address_type && Intrinsics.areEqual(this.address, blockchainAddress.address);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Blockchain blockchain = this.blockchain;
        int iHashCode2 = ((((iHashCode + (blockchain != null ? blockchain.hashCode() : 0)) * 37) + this.address_type.hashCode()) * 37) + this.address.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Blockchain blockchain = this.blockchain;
        if (blockchain != null) {
            arrayList.add("blockchain=" + blockchain);
        }
        arrayList.add("address_type=" + this.address_type);
        arrayList.add("address=" + Internal.sanitize(this.address));
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockchainAddress{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ BlockchainAddress copy$default(BlockchainAddress blockchainAddress, Blockchain blockchain, AddressType addressType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            blockchain = blockchainAddress.blockchain;
        }
        if ((i & 2) != 0) {
            addressType = blockchainAddress.address_type;
        }
        if ((i & 4) != 0) {
            str = blockchainAddress.address;
        }
        if ((i & 8) != 0) {
            byteString = blockchainAddress.unknownFields();
        }
        return blockchainAddress.copy(blockchain, addressType, str, byteString);
    }

    public final BlockchainAddress copy(Blockchain blockchain, AddressType address_type, String address, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(address_type, "address_type");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new BlockchainAddress(blockchain, address_type, address, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BlockchainAddress.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<BlockchainAddress>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.blockchain.v1.BlockchainAddress$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(BlockchainAddress value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getBlockchain() != null) {
                    size += Blockchain.ADAPTER.encodedSizeWithTag(4, value.getBlockchain());
                }
                if (value.getAddress_type() != AddressType.ADDRESS_TYPE_UNSPECIFIED) {
                    size += AddressType.ADAPTER.encodedSizeWithTag(1, value.getAddress_type());
                }
                return !Intrinsics.areEqual(value.getAddress(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAddress()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, BlockchainAddress value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getBlockchain() != null) {
                    Blockchain.ADAPTER.encodeWithTag(writer, 4, (int) value.getBlockchain());
                }
                if (value.getAddress_type() != AddressType.ADDRESS_TYPE_UNSPECIFIED) {
                    AddressType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAddress_type());
                }
                if (!Intrinsics.areEqual(value.getAddress(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAddress());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, BlockchainAddress value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getAddress(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAddress());
                }
                if (value.getAddress_type() != AddressType.ADDRESS_TYPE_UNSPECIFIED) {
                    AddressType.ADAPTER.encodeWithTag(writer, 1, (int) value.getAddress_type());
                }
                if (value.getBlockchain() != null) {
                    Blockchain.ADAPTER.encodeWithTag(writer, 4, (int) value.getBlockchain());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public BlockchainAddress decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                AddressType addressTypeDecode = AddressType.ADDRESS_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Blockchain blockchainDecode = null;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new BlockchainAddress(blockchainDecode, addressTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            addressTypeDecode = AddressType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        blockchainDecode = Blockchain.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public BlockchainAddress redact(BlockchainAddress value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Blockchain blockchain = value.getBlockchain();
                return BlockchainAddress.copy$default(value, blockchain != null ? Blockchain.ADAPTER.redact(blockchain) : null, null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
