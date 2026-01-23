package rosetta.blockchain.p533v1;

import com.robinhood.android.educationtour.EducationTourScreenNames;
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
import rosetta.blockchain.p533v1.PolygonProofOfStakeChain;

/* compiled from: PolygonProofOfStakeChain.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lrosetta/blockchain/v1/PolygonProofOfStakeChain;", "Lcom/squareup/wire/Message;", "", "network", "Lrosetta/blockchain/v1/PolygonProofOfStakeChain$Network;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrosetta/blockchain/v1/PolygonProofOfStakeChain$Network;Lokio/ByteString;)V", "getNetwork", "()Lrosetta/blockchain/v1/PolygonProofOfStakeChain$Network;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Network", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class PolygonProofOfStakeChain extends Message {

    @JvmField
    public static final ProtoAdapter<PolygonProofOfStakeChain> ADAPTER;

    @WireField(adapter = "rosetta.blockchain.v1.PolygonProofOfStakeChain$Network#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Network network;

    /* JADX WARN: Multi-variable type inference failed */
    public PolygonProofOfStakeChain() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29880newBuilder();
    }

    public final Network getNetwork() {
        return this.network;
    }

    public /* synthetic */ PolygonProofOfStakeChain(Network network, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Network.UNSPECIFIED : network, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonProofOfStakeChain(Network network, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.network = network;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29880newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PolygonProofOfStakeChain)) {
            return false;
        }
        PolygonProofOfStakeChain polygonProofOfStakeChain = (PolygonProofOfStakeChain) other;
        return Intrinsics.areEqual(unknownFields(), polygonProofOfStakeChain.unknownFields()) && this.network == polygonProofOfStakeChain.network;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.network.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("network=" + this.network);
        return CollectionsKt.joinToString$default(arrayList, ", ", "PolygonProofOfStakeChain{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PolygonProofOfStakeChain copy$default(PolygonProofOfStakeChain polygonProofOfStakeChain, Network network, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            network = polygonProofOfStakeChain.network;
        }
        if ((i & 2) != 0) {
            byteString = polygonProofOfStakeChain.unknownFields();
        }
        return polygonProofOfStakeChain.copy(network, byteString);
    }

    public final PolygonProofOfStakeChain copy(Network network, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PolygonProofOfStakeChain(network, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PolygonProofOfStakeChain.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PolygonProofOfStakeChain>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rosetta.blockchain.v1.PolygonProofOfStakeChain$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PolygonProofOfStakeChain value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getNetwork() != PolygonProofOfStakeChain.Network.UNSPECIFIED ? size + PolygonProofOfStakeChain.Network.ADAPTER.encodedSizeWithTag(1, value.getNetwork()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PolygonProofOfStakeChain value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getNetwork() != PolygonProofOfStakeChain.Network.UNSPECIFIED) {
                    PolygonProofOfStakeChain.Network.ADAPTER.encodeWithTag(writer, 1, (int) value.getNetwork());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PolygonProofOfStakeChain value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNetwork() != PolygonProofOfStakeChain.Network.UNSPECIFIED) {
                    PolygonProofOfStakeChain.Network.ADAPTER.encodeWithTag(writer, 1, (int) value.getNetwork());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PolygonProofOfStakeChain decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                PolygonProofOfStakeChain.Network networkDecode = PolygonProofOfStakeChain.Network.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PolygonProofOfStakeChain(networkDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            networkDecode = PolygonProofOfStakeChain.Network.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PolygonProofOfStakeChain redact(PolygonProofOfStakeChain value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return PolygonProofOfStakeChain.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PolygonProofOfStakeChain.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lrosetta/blockchain/v1/PolygonProofOfStakeChain$Network;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "MAINNET", "MUMBAI", "Companion", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Network implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Network[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Network> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Network MAINNET;
        public static final Network MUMBAI;
        public static final Network UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ Network[] $values() {
            return new Network[]{UNSPECIFIED, MAINNET, MUMBAI};
        }

        @JvmStatic
        public static final Network fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Network> getEntries() {
            return $ENTRIES;
        }

        private Network(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Network network = new Network(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = network;
            MAINNET = new Network("MAINNET", 1, 1);
            MUMBAI = new Network("MUMBAI", 2, 2);
            Network[] networkArr$values = $values();
            $VALUES = networkArr$values;
            $ENTRIES = EnumEntries2.enumEntries(networkArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Network.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Network>(orCreateKotlinClass, syntax, network) { // from class: rosetta.blockchain.v1.PolygonProofOfStakeChain$Network$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PolygonProofOfStakeChain.Network fromValue(int value) {
                    return PolygonProofOfStakeChain.Network.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PolygonProofOfStakeChain.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/blockchain/v1/PolygonProofOfStakeChain$Network$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/blockchain/v1/PolygonProofOfStakeChain$Network;", "fromValue", "value", "", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Network fromValue(int value) {
                if (value == 0) {
                    return Network.UNSPECIFIED;
                }
                if (value == 1) {
                    return Network.MAINNET;
                }
                if (value != 2) {
                    return null;
                }
                return Network.MUMBAI;
            }
        }

        public static Network valueOf(String str) {
            return (Network) Enum.valueOf(Network.class, str);
        }

        public static Network[] values() {
            return (Network[]) $VALUES.clone();
        }
    }
}
