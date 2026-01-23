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
import rh_server_driven_ui.p531v1.NavigationRow;

/* compiled from: CryptoMigrationsDetailAssetsResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailAssetsResponse;", "Lcom/squareup/wire/Message;", "", "id", "", "title", "subtitle", "assets", "", "Lrh_server_driven_ui/v1/NavigationRow;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getAssets", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire_crypto.proto.v1.crypto_migrations_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CryptoMigrationsDetailAssetsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoMigrationsDetailAssetsResponse> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.NavigationRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<NavigationRow> assets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public CryptoMigrationsDetailAssetsResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ CryptoMigrationsDetailAssetsResponse(String str, String str2, String str3, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m9067newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoMigrationsDetailAssetsResponse(String id, String title, String subtitle, List<NavigationRow> assets, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.assets = Internal.immutableCopyOf("assets", assets);
    }

    public final List<NavigationRow> getAssets() {
        return this.assets;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m9067newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoMigrationsDetailAssetsResponse)) {
            return false;
        }
        CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse = (CryptoMigrationsDetailAssetsResponse) other;
        return Intrinsics.areEqual(unknownFields(), cryptoMigrationsDetailAssetsResponse.unknownFields()) && Intrinsics.areEqual(this.id, cryptoMigrationsDetailAssetsResponse.id) && Intrinsics.areEqual(this.title, cryptoMigrationsDetailAssetsResponse.title) && Intrinsics.areEqual(this.subtitle, cryptoMigrationsDetailAssetsResponse.subtitle) && Intrinsics.areEqual(this.assets, cryptoMigrationsDetailAssetsResponse.assets);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37) + this.assets.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        if (!this.assets.isEmpty()) {
            arrayList.add("assets=" + this.assets);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoMigrationsDetailAssetsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoMigrationsDetailAssetsResponse copy$default(CryptoMigrationsDetailAssetsResponse cryptoMigrationsDetailAssetsResponse, String str, String str2, String str3, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoMigrationsDetailAssetsResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = cryptoMigrationsDetailAssetsResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = cryptoMigrationsDetailAssetsResponse.subtitle;
        }
        if ((i & 8) != 0) {
            list = cryptoMigrationsDetailAssetsResponse.assets;
        }
        if ((i & 16) != 0) {
            byteString = cryptoMigrationsDetailAssetsResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return cryptoMigrationsDetailAssetsResponse.copy(str, str2, str4, list, byteString2);
    }

    public final CryptoMigrationsDetailAssetsResponse copy(String id, String title, String subtitle, List<NavigationRow> assets, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoMigrationsDetailAssetsResponse(id, title, subtitle, assets, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoMigrationsDetailAssetsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoMigrationsDetailAssetsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire_crypto.proto.v1.crypto_migrations.v1.CryptoMigrationsDetailAssetsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoMigrationsDetailAssetsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                return size + NavigationRow.ADAPTER.asRepeated().encodedSizeWithTag(4, value.getAssets());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoMigrationsDetailAssetsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                NavigationRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAssets());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoMigrationsDetailAssetsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                NavigationRow.ADAPTER.asRepeated().encodeWithTag(writer, 4, (int) value.getAssets());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationsDetailAssetsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoMigrationsDetailAssetsResponse(strDecode, strDecode2, strDecode3, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        arrayList.add(NavigationRow.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoMigrationsDetailAssetsResponse redact(CryptoMigrationsDetailAssetsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoMigrationsDetailAssetsResponse.copy$default(value, null, null, null, Internal.m26823redactElements(value.getAssets(), NavigationRow.ADAPTER), ByteString.EMPTY, 7, null);
            }
        };
    }
}
