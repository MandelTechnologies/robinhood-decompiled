package rosetta.blockchain.p533v1;

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

/* compiled from: Blockchain.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lrosetta/blockchain/v1/Blockchain;", "Lcom/squareup/wire/Message;", "", "ethereum_chain", "Lrosetta/blockchain/v1/EthereumChain;", "polygon_pos_chain", "Lrosetta/blockchain/v1/PolygonProofOfStakeChain;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/blockchain/v1/EthereumChain;Lrosetta/blockchain/v1/PolygonProofOfStakeChain;Lokio/ByteString;)V", "getEthereum_chain", "()Lrosetta/blockchain/v1/EthereumChain;", "getPolygon_pos_chain", "()Lrosetta/blockchain/v1/PolygonProofOfStakeChain;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Blockchain extends Message {

    @JvmField
    public static final ProtoAdapter<Blockchain> ADAPTER;

    @WireField(adapter = "rosetta.blockchain.v1.EthereumChain#ADAPTER", jsonName = "ethereumChain", oneofName = "blockchain", schemaIndex = 0, tag = 1)
    private final EthereumChain ethereum_chain;

    @WireField(adapter = "rosetta.blockchain.v1.PolygonProofOfStakeChain#ADAPTER", jsonName = "polygonPosChain", oneofName = "blockchain", schemaIndex = 1, tag = 2)
    private final PolygonProofOfStakeChain polygon_pos_chain;

    public Blockchain() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29877newBuilder();
    }

    public final EthereumChain getEthereum_chain() {
        return this.ethereum_chain;
    }

    public final PolygonProofOfStakeChain getPolygon_pos_chain() {
        return this.polygon_pos_chain;
    }

    public /* synthetic */ Blockchain(EthereumChain ethereumChain, PolygonProofOfStakeChain polygonProofOfStakeChain, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ethereumChain, (i & 2) != 0 ? null : polygonProofOfStakeChain, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Blockchain(EthereumChain ethereumChain, PolygonProofOfStakeChain polygonProofOfStakeChain, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.ethereum_chain = ethereumChain;
        this.polygon_pos_chain = polygonProofOfStakeChain;
        if (Internal.countNonNull(ethereumChain, polygonProofOfStakeChain) > 1) {
            throw new IllegalArgumentException("At most one of ethereum_chain, polygon_pos_chain may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29877newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Blockchain)) {
            return false;
        }
        Blockchain blockchain = (Blockchain) other;
        return Intrinsics.areEqual(unknownFields(), blockchain.unknownFields()) && Intrinsics.areEqual(this.ethereum_chain, blockchain.ethereum_chain) && Intrinsics.areEqual(this.polygon_pos_chain, blockchain.polygon_pos_chain);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        EthereumChain ethereumChain = this.ethereum_chain;
        int iHashCode2 = (iHashCode + (ethereumChain != null ? ethereumChain.hashCode() : 0)) * 37;
        PolygonProofOfStakeChain polygonProofOfStakeChain = this.polygon_pos_chain;
        int iHashCode3 = iHashCode2 + (polygonProofOfStakeChain != null ? polygonProofOfStakeChain.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        EthereumChain ethereumChain = this.ethereum_chain;
        if (ethereumChain != null) {
            arrayList.add("ethereum_chain=" + ethereumChain);
        }
        PolygonProofOfStakeChain polygonProofOfStakeChain = this.polygon_pos_chain;
        if (polygonProofOfStakeChain != null) {
            arrayList.add("polygon_pos_chain=" + polygonProofOfStakeChain);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Blockchain{", "}", 0, null, null, 56, null);
    }

    public final Blockchain copy(EthereumChain ethereum_chain, PolygonProofOfStakeChain polygon_pos_chain, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Blockchain(ethereum_chain, polygon_pos_chain, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Blockchain.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Blockchain>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.blockchain.v1.Blockchain$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Blockchain value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + EthereumChain.ADAPTER.encodedSizeWithTag(1, value.getEthereum_chain()) + PolygonProofOfStakeChain.ADAPTER.encodedSizeWithTag(2, value.getPolygon_pos_chain());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Blockchain value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                EthereumChain.ADAPTER.encodeWithTag(writer, 1, (int) value.getEthereum_chain());
                PolygonProofOfStakeChain.ADAPTER.encodeWithTag(writer, 2, (int) value.getPolygon_pos_chain());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Blockchain value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PolygonProofOfStakeChain.ADAPTER.encodeWithTag(writer, 2, (int) value.getPolygon_pos_chain());
                EthereumChain.ADAPTER.encodeWithTag(writer, 1, (int) value.getEthereum_chain());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Blockchain redact(Blockchain value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EthereumChain ethereum_chain = value.getEthereum_chain();
                EthereumChain ethereumChainRedact = ethereum_chain != null ? EthereumChain.ADAPTER.redact(ethereum_chain) : null;
                PolygonProofOfStakeChain polygon_pos_chain = value.getPolygon_pos_chain();
                return value.copy(ethereumChainRedact, polygon_pos_chain != null ? PolygonProofOfStakeChain.ADAPTER.redact(polygon_pos_chain) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Blockchain decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                EthereumChain ethereumChainDecode = null;
                PolygonProofOfStakeChain polygonProofOfStakeChainDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Blockchain(ethereumChainDecode, polygonProofOfStakeChainDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        ethereumChainDecode = EthereumChain.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        polygonProofOfStakeChainDecode = PolygonProofOfStakeChain.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
