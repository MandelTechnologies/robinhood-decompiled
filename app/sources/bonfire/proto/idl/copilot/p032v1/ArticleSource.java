package bonfire.proto.idl.copilot.p032v1;

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
import p479j$.time.Instant;

/* compiled from: ArticleSource.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BO\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b$\u0010\u001a¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/ArticleSource;", "Lcom/squareup/wire/Message;", "", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "published_at", "", "publisher", "title", "url", "icon_url", "Lokio/ByteString;", "unknownFields", "<init>", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lj$/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lbonfire/proto/idl/copilot/v1/ArticleSource;", "Lj$/time/Instant;", "getPublished_at", "()Lj$/time/Instant;", "Ljava/lang/String;", "getPublisher", "getTitle", "getUrl", "getIcon_url", "Companion", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class ArticleSource extends Message {

    @JvmField
    public static final ProtoAdapter<ArticleSource> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "iconUrl", schemaIndex = 4, tag = 5)
    private final String icon_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INSTANT", jsonName = "publishedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Instant published_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String publisher;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String url;

    public ArticleSource() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ ArticleSource(Instant instant, String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instant, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8845newBuilder();
    }

    public final Instant getPublished_at() {
        return this.published_at;
    }

    public final String getPublisher() {
        return this.publisher;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleSource(Instant instant, String publisher, String title, String str, String str2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.published_at = instant;
        this.publisher = publisher;
        this.title = title;
        this.url = str;
        this.icon_url = str2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8845newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ArticleSource)) {
            return false;
        }
        ArticleSource articleSource = (ArticleSource) other;
        return Intrinsics.areEqual(unknownFields(), articleSource.unknownFields()) && Intrinsics.areEqual(this.published_at, articleSource.published_at) && Intrinsics.areEqual(this.publisher, articleSource.publisher) && Intrinsics.areEqual(this.title, articleSource.title) && Intrinsics.areEqual(this.url, articleSource.url) && Intrinsics.areEqual(this.icon_url, articleSource.icon_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Instant instant = this.published_at;
        int iHashCode2 = (((((iHashCode + (instant != null ? instant.hashCode() : 0)) * 37) + this.publisher.hashCode()) * 37) + this.title.hashCode()) * 37;
        String str = this.url;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.icon_url;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Instant instant = this.published_at;
        if (instant != null) {
            arrayList.add("published_at=" + instant);
        }
        arrayList.add("publisher=" + Internal.sanitize(this.publisher));
        arrayList.add("title=" + Internal.sanitize(this.title));
        String str = this.url;
        if (str != null) {
            arrayList.add("url=" + Internal.sanitize(str));
        }
        String str2 = this.icon_url;
        if (str2 != null) {
            arrayList.add("icon_url=" + Internal.sanitize(str2));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArticleSource{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ArticleSource copy$default(ArticleSource articleSource, Instant instant, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            instant = articleSource.published_at;
        }
        if ((i & 2) != 0) {
            str = articleSource.publisher;
        }
        if ((i & 4) != 0) {
            str2 = articleSource.title;
        }
        if ((i & 8) != 0) {
            str3 = articleSource.url;
        }
        if ((i & 16) != 0) {
            str4 = articleSource.icon_url;
        }
        if ((i & 32) != 0) {
            byteString = articleSource.unknownFields();
        }
        String str5 = str4;
        ByteString byteString2 = byteString;
        return articleSource.copy(instant, str, str2, str3, str5, byteString2);
    }

    public final ArticleSource copy(Instant published_at, String publisher, String title, String url, String icon_url, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ArticleSource(published_at, publisher, title, url, icon_url, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ArticleSource.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ArticleSource>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.copilot.v1.ArticleSource$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ArticleSource value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getPublished_at() != null) {
                    size += ProtoAdapter.INSTANT.encodedSizeWithTag(1, value.getPublished_at());
                }
                if (!Intrinsics.areEqual(value.getPublisher(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPublisher());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(4, value.getUrl()) + protoAdapter.encodedSizeWithTag(5, value.getIcon_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ArticleSource value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getPublished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getPublished_at());
                }
                if (!Intrinsics.areEqual(value.getPublisher(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPublisher());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getUrl());
                protoAdapter.encodeWithTag(writer, 5, (int) value.getIcon_url());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ArticleSource value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 5, (int) value.getIcon_url());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getUrl());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getPublisher(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPublisher());
                }
                if (value.getPublished_at() != null) {
                    ProtoAdapter.INSTANT.encodeWithTag(writer, 1, (int) value.getPublished_at());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ArticleSource redact(ArticleSource value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Instant published_at = value.getPublished_at();
                return ArticleSource.copy$default(value, published_at != null ? ProtoAdapter.INSTANT.redact(published_at) : null, null, null, null, null, ByteString.EMPTY, 30, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ArticleSource decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Instant instantDecode = null;
                String strDecode = null;
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ArticleSource(instantDecode, strDecode2, strDecode3, strDecode4, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        instantDecode = ProtoAdapter.INSTANT.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
