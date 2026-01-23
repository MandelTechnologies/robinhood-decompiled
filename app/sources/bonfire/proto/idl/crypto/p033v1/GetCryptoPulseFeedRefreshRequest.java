package bonfire.proto.idl.crypto.p033v1;

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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetCryptoPulseFeedRefreshRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoPulseFeedRefreshRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "currency_pair_ids", "", "include_digest", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getInclude_digest", "()Z", "getCurrency_pair_ids", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCryptoPulseFeedRefreshRequest extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoPulseFeedRefreshRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currencyPairIds", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> currency_pair_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "includeDigest", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean include_digest;

    public GetCryptoPulseFeedRefreshRequest() {
        this(null, null, false, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8908newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public /* synthetic */ GetCryptoPulseFeedRefreshRequest(String str, List list, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getInclude_digest() {
        return this.include_digest;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoPulseFeedRefreshRequest(String account_id, List<String> currency_pair_ids, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(currency_pair_ids, "currency_pair_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.include_digest = z;
        this.currency_pair_ids = Internal.immutableCopyOf("currency_pair_ids", currency_pair_ids);
    }

    public final List<String> getCurrency_pair_ids() {
        return this.currency_pair_ids;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8908newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoPulseFeedRefreshRequest)) {
            return false;
        }
        GetCryptoPulseFeedRefreshRequest getCryptoPulseFeedRefreshRequest = (GetCryptoPulseFeedRefreshRequest) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoPulseFeedRefreshRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, getCryptoPulseFeedRefreshRequest.account_id) && Intrinsics.areEqual(this.currency_pair_ids, getCryptoPulseFeedRefreshRequest.currency_pair_ids) && this.include_digest == getCryptoPulseFeedRefreshRequest.include_digest;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.currency_pair_ids.hashCode()) * 37) + Boolean.hashCode(this.include_digest);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        if (!this.currency_pair_ids.isEmpty()) {
            arrayList.add("currency_pair_ids=" + Internal.sanitize(this.currency_pair_ids));
        }
        arrayList.add("include_digest=" + this.include_digest);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoPulseFeedRefreshRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCryptoPulseFeedRefreshRequest copy$default(GetCryptoPulseFeedRefreshRequest getCryptoPulseFeedRefreshRequest, String str, List list, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getCryptoPulseFeedRefreshRequest.account_id;
        }
        if ((i & 2) != 0) {
            list = getCryptoPulseFeedRefreshRequest.currency_pair_ids;
        }
        if ((i & 4) != 0) {
            z = getCryptoPulseFeedRefreshRequest.include_digest;
        }
        if ((i & 8) != 0) {
            byteString = getCryptoPulseFeedRefreshRequest.unknownFields();
        }
        return getCryptoPulseFeedRefreshRequest.copy(str, list, z, byteString);
    }

    public final GetCryptoPulseFeedRefreshRequest copy(String account_id, List<String> currency_pair_ids, boolean include_digest, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(currency_pair_ids, "currency_pair_ids");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoPulseFeedRefreshRequest(account_id, currency_pair_ids, include_digest, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoPulseFeedRefreshRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoPulseFeedRefreshRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoPulseFeedRefreshRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoPulseFeedRefreshRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                int iEncodedSizeWithTag = size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.getCurrency_pair_ids());
                return value.getInclude_digest() ? iEncodedSizeWithTag + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getInclude_digest())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoPulseFeedRefreshRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, (int) value.getCurrency_pair_ids());
                if (value.getInclude_digest()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getInclude_digest()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoPulseFeedRefreshRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getInclude_digest()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getInclude_digest()));
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getCurrency_pair_ids());
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulseFeedRefreshRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoPulseFeedRefreshRequest(strDecode, arrayList, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoPulseFeedRefreshRequest redact(GetCryptoPulseFeedRefreshRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCryptoPulseFeedRefreshRequest.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }
        };
    }
}
