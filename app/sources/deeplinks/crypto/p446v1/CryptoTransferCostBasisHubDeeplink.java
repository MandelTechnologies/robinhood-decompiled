package deeplinks.crypto.p446v1;

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

/* compiled from: CryptoTransferCostBasisHubDeeplink.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J4\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Ldeeplinks/crypto/v1/CryptoTransferCostBasisHubDeeplink;", "Lcom/squareup/wire/Message;", "", "currency_pair_id", "", "account_id", "entry_point_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getCurrency_pair_id", "()Ljava/lang/String;", "getAccount_id", "getEntry_point_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "deeplinks.crypto_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CryptoTransferCostBasisHubDeeplink extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoTransferCostBasisHubDeeplink> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String currency_pair_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String entry_point_identifier;

    public CryptoTransferCostBasisHubDeeplink() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27937newBuilder();
    }

    public final String getCurrency_pair_id() {
        return this.currency_pair_id;
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getEntry_point_identifier() {
        return this.entry_point_identifier;
    }

    public /* synthetic */ CryptoTransferCostBasisHubDeeplink(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoTransferCostBasisHubDeeplink(String str, String str2, String str3, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.currency_pair_id = str;
        this.account_id = str2;
        this.entry_point_identifier = str3;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27937newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoTransferCostBasisHubDeeplink)) {
            return false;
        }
        CryptoTransferCostBasisHubDeeplink cryptoTransferCostBasisHubDeeplink = (CryptoTransferCostBasisHubDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), cryptoTransferCostBasisHubDeeplink.unknownFields()) && Intrinsics.areEqual(this.currency_pair_id, cryptoTransferCostBasisHubDeeplink.currency_pair_id) && Intrinsics.areEqual(this.account_id, cryptoTransferCostBasisHubDeeplink.account_id) && Intrinsics.areEqual(this.entry_point_identifier, cryptoTransferCostBasisHubDeeplink.entry_point_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.currency_pair_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.account_id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.entry_point_identifier;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.currency_pair_id;
        if (str != null) {
            arrayList.add("currency_pair_id=" + Internal.sanitize(str));
        }
        String str2 = this.account_id;
        if (str2 != null) {
            arrayList.add("account_id=" + Internal.sanitize(str2));
        }
        String str3 = this.entry_point_identifier;
        if (str3 != null) {
            arrayList.add("entry_point_identifier=" + Internal.sanitize(str3));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoTransferCostBasisHubDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoTransferCostBasisHubDeeplink copy$default(CryptoTransferCostBasisHubDeeplink cryptoTransferCostBasisHubDeeplink, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoTransferCostBasisHubDeeplink.currency_pair_id;
        }
        if ((i & 2) != 0) {
            str2 = cryptoTransferCostBasisHubDeeplink.account_id;
        }
        if ((i & 4) != 0) {
            str3 = cryptoTransferCostBasisHubDeeplink.entry_point_identifier;
        }
        if ((i & 8) != 0) {
            byteString = cryptoTransferCostBasisHubDeeplink.unknownFields();
        }
        return cryptoTransferCostBasisHubDeeplink.copy(str, str2, str3, byteString);
    }

    public final CryptoTransferCostBasisHubDeeplink copy(String currency_pair_id, String account_id, String entry_point_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoTransferCostBasisHubDeeplink(currency_pair_id, account_id, entry_point_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoTransferCostBasisHubDeeplink.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoTransferCostBasisHubDeeplink>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: deeplinks.crypto.v1.CryptoTransferCostBasisHubDeeplink$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoTransferCostBasisHubDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getCurrency_pair_id()) + protoAdapter.encodedSizeWithTag(2, value.getAccount_id()) + protoAdapter.encodedSizeWithTag(3, value.getEntry_point_identifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoTransferCostBasisHubDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_id());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEntry_point_identifier());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoTransferCostBasisHubDeeplink value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEntry_point_identifier());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getAccount_id());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getCurrency_pair_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTransferCostBasisHubDeeplink redact(CryptoTransferCostBasisHubDeeplink value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoTransferCostBasisHubDeeplink.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoTransferCostBasisHubDeeplink decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                String strDecode2 = null;
                String strDecode3 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoTransferCostBasisHubDeeplink(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
