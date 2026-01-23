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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: Data.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0097\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010*\u001a\u00020\u0002H\u0017J\u0013\u0010+\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010-H\u0096\u0002J\b\u0010.\u001a\u00020\u0014H\u0016J\b\u0010/\u001a\u00020\u0004H\u0016J\u0096\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u00062"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/Data;", "Lcom/squareup/wire/Message;", "", "source", "", "title", "published_at", "url", "source_uri", "feedback", "Lbonfire/proto/idl/crypto/v1/Feedback;", "media", "Lbonfire/proto/idl/crypto/v1/Media;", "preview_media", "preview_text", "is_embedded", "", "logo_hex_code", "authors", "popularity", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/Feedback;Lbonfire/proto/idl/crypto/v1/Media;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "getSource", "()Ljava/lang/String;", "getTitle", "getPublished_at", "getUrl", "getSource_uri", "getFeedback", "()Lbonfire/proto/idl/crypto/v1/Feedback;", "getMedia", "()Lbonfire/proto/idl/crypto/v1/Media;", "getPreview_media", "getPreview_text", "()Z", "getLogo_hex_code", "getAuthors", "getPopularity", "()I", "newBuilder", "equals", "other", "", "hashCode", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Data extends Message {

    @JvmField
    public static final ProtoAdapter<Data> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String authors;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.Feedback#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Feedback feedback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEmbedded", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final boolean is_embedded;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "logoHexCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String logo_hex_code;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.Media#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Media media;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 13)
    private final int popularity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previewMedia", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String preview_media;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previewText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String preview_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publishedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String published_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceUri", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String source_uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String url;

    public Data() {
        this(null, null, null, null, null, null, null, null, null, false, null, null, 0, null, 16383, null);
    }

    public /* synthetic */ Data(String str, String str2, String str3, String str4, String str5, Feedback feedback, Media media, String str6, String str7, boolean z, String str8, String str9, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? null : feedback, (i2 & 64) == 0 ? media : null, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? false : z, (i2 & 1024) != 0 ? "" : str8, (i2 & 2048) == 0 ? str9 : "", (i2 & 4096) == 0 ? i : 0, (i2 & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8900newBuilder();
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPublished_at() {
        return this.published_at;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getSource_uri() {
        return this.source_uri;
    }

    public final Feedback getFeedback() {
        return this.feedback;
    }

    public final Media getMedia() {
        return this.media;
    }

    public final String getPreview_media() {
        return this.preview_media;
    }

    public final String getPreview_text() {
        return this.preview_text;
    }

    /* renamed from: is_embedded, reason: from getter */
    public final boolean getIs_embedded() {
        return this.is_embedded;
    }

    public final String getLogo_hex_code() {
        return this.logo_hex_code;
    }

    public final String getAuthors() {
        return this.authors;
    }

    public final int getPopularity() {
        return this.popularity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Data(String source, String title, String published_at, String url, String source_uri, Feedback feedback, Media media, String preview_media, String preview_text, boolean z, String logo_hex_code, String authors, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(published_at, "published_at");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(source_uri, "source_uri");
        Intrinsics.checkNotNullParameter(preview_media, "preview_media");
        Intrinsics.checkNotNullParameter(preview_text, "preview_text");
        Intrinsics.checkNotNullParameter(logo_hex_code, "logo_hex_code");
        Intrinsics.checkNotNullParameter(authors, "authors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source = source;
        this.title = title;
        this.published_at = published_at;
        this.url = url;
        this.source_uri = source_uri;
        this.feedback = feedback;
        this.media = media;
        this.preview_media = preview_media;
        this.preview_text = preview_text;
        this.is_embedded = z;
        this.logo_hex_code = logo_hex_code;
        this.authors = authors;
        this.popularity = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8900newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return Intrinsics.areEqual(unknownFields(), data.unknownFields()) && Intrinsics.areEqual(this.source, data.source) && Intrinsics.areEqual(this.title, data.title) && Intrinsics.areEqual(this.published_at, data.published_at) && Intrinsics.areEqual(this.url, data.url) && Intrinsics.areEqual(this.source_uri, data.source_uri) && Intrinsics.areEqual(this.feedback, data.feedback) && Intrinsics.areEqual(this.media, data.media) && Intrinsics.areEqual(this.preview_media, data.preview_media) && Intrinsics.areEqual(this.preview_text, data.preview_text) && this.is_embedded == data.is_embedded && Intrinsics.areEqual(this.logo_hex_code, data.logo_hex_code) && Intrinsics.areEqual(this.authors, data.authors) && this.popularity == data.popularity;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + this.source.hashCode()) * 37) + this.title.hashCode()) * 37) + this.published_at.hashCode()) * 37) + this.url.hashCode()) * 37) + this.source_uri.hashCode()) * 37;
        Feedback feedback = this.feedback;
        int iHashCode2 = (iHashCode + (feedback != null ? feedback.hashCode() : 0)) * 37;
        Media media = this.media;
        int iHashCode3 = ((((((((((((iHashCode2 + (media != null ? media.hashCode() : 0)) * 37) + this.preview_media.hashCode()) * 37) + this.preview_text.hashCode()) * 37) + Boolean.hashCode(this.is_embedded)) * 37) + this.logo_hex_code.hashCode()) * 37) + this.authors.hashCode()) * 37) + Integer.hashCode(this.popularity);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source=" + Internal.sanitize(this.source));
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("published_at=" + Internal.sanitize(this.published_at));
        arrayList.add("url=" + Internal.sanitize(this.url));
        arrayList.add("source_uri=" + Internal.sanitize(this.source_uri));
        Feedback feedback = this.feedback;
        if (feedback != null) {
            arrayList.add("feedback=" + feedback);
        }
        Media media = this.media;
        if (media != null) {
            arrayList.add("media=" + media);
        }
        arrayList.add("preview_media=" + Internal.sanitize(this.preview_media));
        arrayList.add("preview_text=" + Internal.sanitize(this.preview_text));
        arrayList.add("is_embedded=" + this.is_embedded);
        arrayList.add("logo_hex_code=" + Internal.sanitize(this.logo_hex_code));
        arrayList.add("authors=" + Internal.sanitize(this.authors));
        arrayList.add("popularity=" + this.popularity);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Data{", "}", 0, null, null, 56, null);
    }

    public final Data copy(String source, String title, String published_at, String url, String source_uri, Feedback feedback, Media media, String preview_media, String preview_text, boolean is_embedded, String logo_hex_code, String authors, int popularity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(published_at, "published_at");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(source_uri, "source_uri");
        Intrinsics.checkNotNullParameter(preview_media, "preview_media");
        Intrinsics.checkNotNullParameter(preview_text, "preview_text");
        Intrinsics.checkNotNullParameter(logo_hex_code, "logo_hex_code");
        Intrinsics.checkNotNullParameter(authors, "authors");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Data(source, title, published_at, url, source_uri, feedback, media, preview_media, preview_text, is_embedded, logo_hex_code, authors, popularity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Data.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Data>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.Data$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Data value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSource());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getPublished_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPublished_at());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getSource_uri(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getSource_uri());
                }
                if (value.getFeedback() != null) {
                    size += Feedback.ADAPTER.encodedSizeWithTag(6, value.getFeedback());
                }
                if (value.getMedia() != null) {
                    size += Media.ADAPTER.encodedSizeWithTag(7, value.getMedia());
                }
                if (!Intrinsics.areEqual(value.getPreview_media(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPreview_media());
                }
                if (!Intrinsics.areEqual(value.getPreview_text(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getPreview_text());
                }
                if (value.getIs_embedded()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(10, Boolean.valueOf(value.getIs_embedded()));
                }
                if (!Intrinsics.areEqual(value.getLogo_hex_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getLogo_hex_code());
                }
                if (!Intrinsics.areEqual(value.getAuthors(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getAuthors());
                }
                return value.getPopularity() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(13, Integer.valueOf(value.getPopularity())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Data value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getSource(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSource());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getPublished_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPublished_at());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getSource_uri(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource_uri());
                }
                if (value.getFeedback() != null) {
                    Feedback.ADAPTER.encodeWithTag(writer, 6, (int) value.getFeedback());
                }
                if (value.getMedia() != null) {
                    Media.ADAPTER.encodeWithTag(writer, 7, (int) value.getMedia());
                }
                if (!Intrinsics.areEqual(value.getPreview_media(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPreview_media());
                }
                if (!Intrinsics.areEqual(value.getPreview_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getPreview_text());
                }
                if (value.getIs_embedded()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_embedded()));
                }
                if (!Intrinsics.areEqual(value.getLogo_hex_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getLogo_hex_code());
                }
                if (!Intrinsics.areEqual(value.getAuthors(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAuthors());
                }
                if (value.getPopularity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getPopularity()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Data value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getPopularity() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 13, (int) Integer.valueOf(value.getPopularity()));
                }
                if (!Intrinsics.areEqual(value.getAuthors(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getAuthors());
                }
                if (!Intrinsics.areEqual(value.getLogo_hex_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getLogo_hex_code());
                }
                if (value.getIs_embedded()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 10, (int) Boolean.valueOf(value.getIs_embedded()));
                }
                if (!Intrinsics.areEqual(value.getPreview_text(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getPreview_text());
                }
                if (!Intrinsics.areEqual(value.getPreview_media(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPreview_media());
                }
                if (value.getMedia() != null) {
                    Media.ADAPTER.encodeWithTag(writer, 7, (int) value.getMedia());
                }
                if (value.getFeedback() != null) {
                    Feedback.ADAPTER.encodeWithTag(writer, 6, (int) value.getFeedback());
                }
                if (!Intrinsics.areEqual(value.getSource_uri(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getSource_uri());
                }
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUrl());
                }
                if (!Intrinsics.areEqual(value.getPublished_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPublished_at());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (Intrinsics.areEqual(value.getSource(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSource());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Data redact(Data value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Feedback feedback = value.getFeedback();
                Feedback feedbackRedact = feedback != null ? Feedback.ADAPTER.redact(feedback) : null;
                Media media = value.getMedia();
                return value.copy((8095 & 1) != 0 ? value.source : null, (8095 & 2) != 0 ? value.title : null, (8095 & 4) != 0 ? value.published_at : null, (8095 & 8) != 0 ? value.url : null, (8095 & 16) != 0 ? value.source_uri : null, (8095 & 32) != 0 ? value.feedback : feedbackRedact, (8095 & 64) != 0 ? value.media : media != null ? Media.ADAPTER.redact(media) : null, (8095 & 128) != 0 ? value.preview_media : null, (8095 & 256) != 0 ? value.preview_text : null, (8095 & 512) != 0 ? value.is_embedded : false, (8095 & 1024) != 0 ? value.logo_hex_code : null, (8095 & 2048) != 0 ? value.authors : null, (8095 & 4096) != 0 ? value.popularity : 0, (8095 & 8192) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Data decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                Feedback feedbackDecode = null;
                Media mediaDecode = null;
                boolean zBooleanValue = false;
                int iIntValue = 0;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                feedbackDecode = Feedback.ADAPTER.decode(reader);
                                break;
                            case 7:
                                mediaDecode = Media.ADAPTER.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 11:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 13:
                                iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new Data(strDecode, strDecode8, strDecode9, strDecode2, strDecode3, feedbackDecode, mediaDecode, strDecode4, strDecode5, zBooleanValue, strDecode6, strDecode7, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
