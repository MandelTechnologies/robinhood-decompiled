package bonfire_crypto.proto.p042v1.crypto_migrations.p043v1;

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

/* compiled from: CryptoMigrationsResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J4\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsResponse;", "Lcom/squareup/wire/Message;", "", "results", "", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationResult;", "next", "", "prev", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getNext", "()Ljava/lang/String;", "getPrev", "getResults", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CryptoMigrationsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoMigrationsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String next;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String prev;

    @WireField(adapter = "bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationResult#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<CryptoMigrationResult> results;

    public CryptoMigrationsResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9074newBuilder();
    }

    public /* synthetic */ CryptoMigrationsResponse(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getNext() {
        return this.next;
    }

    public final String getPrev() {
        return this.prev;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoMigrationsResponse(List<CryptoMigrationResult> results, String next, String prev, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.next = next;
        this.prev = prev;
        this.results = Internal.immutableCopyOf("results", results);
    }

    public final List<CryptoMigrationResult> getResults() {
        return this.results;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9074newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoMigrationsResponse)) {
            return false;
        }
        CryptoMigrationsResponse cryptoMigrationsResponse = (CryptoMigrationsResponse) other;
        return Intrinsics.areEqual(unknownFields(), cryptoMigrationsResponse.unknownFields()) && Intrinsics.areEqual(this.results, cryptoMigrationsResponse.results) && Intrinsics.areEqual(this.next, cryptoMigrationsResponse.next) && Intrinsics.areEqual(this.prev, cryptoMigrationsResponse.prev);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.results.hashCode()) * 37) + this.next.hashCode()) * 37) + this.prev.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.results.isEmpty()) {
            arrayList.add("results=" + this.results);
        }
        arrayList.add("next=" + Internal.sanitize(this.next));
        arrayList.add("prev=" + Internal.sanitize(this.prev));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoMigrationsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoMigrationsResponse copy$default(CryptoMigrationsResponse cryptoMigrationsResponse, List list, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoMigrationsResponse.results;
        }
        if ((i & 2) != 0) {
            str = cryptoMigrationsResponse.next;
        }
        if ((i & 4) != 0) {
            str2 = cryptoMigrationsResponse.prev;
        }
        if ((i & 8) != 0) {
            byteString = cryptoMigrationsResponse.unknownFields();
        }
        return cryptoMigrationsResponse.copy(list, str, str2, byteString);
    }

    public final CryptoMigrationsResponse copy(List<CryptoMigrationResult> results, String next, String prev, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(next, "next");
        Intrinsics.checkNotNullParameter(prev, "prev");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoMigrationsResponse(results, next, prev, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoMigrationsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoMigrationsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoMigrationsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + CryptoMigrationResult.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getResults());
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNext());
                }
                return !Intrinsics.areEqual(value.getPrev(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPrev()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoMigrationsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                CryptoMigrationResult.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext());
                }
                if (!Intrinsics.areEqual(value.getPrev(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrev());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoMigrationsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getPrev(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPrev());
                }
                if (!Intrinsics.areEqual(value.getNext(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNext());
                }
                CryptoMigrationResult.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getResults());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoMigrationsResponse(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(CryptoMigrationResult.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationsResponse redact(CryptoMigrationsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoMigrationsResponse.copy$default(value, Internal.m26823redactElements(value.getResults(), CryptoMigrationResult.ADAPTER), null, null, ByteString.EMPTY, 6, null);
            }
        };
    }
}
