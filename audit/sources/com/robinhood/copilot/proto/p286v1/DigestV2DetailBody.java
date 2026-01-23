package com.robinhood.copilot.proto.p286v1;

import com.robinhood.utils.extensions.ResourceTypes;
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

/* compiled from: DigestV2DetailBody.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J:\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestV2DetailBody;", "Lcom/squareup/wire/Message;", "", "title", "", "description", ResourceTypes.STYLE, "Lcom/robinhood/copilot/proto/v1/DigestV2Style;", "source", "Lcom/robinhood/copilot/proto/v1/ArticleSource;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/copilot/proto/v1/DigestV2Style;Lcom/robinhood/copilot/proto/v1/ArticleSource;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getStyle", "()Lcom/robinhood/copilot/proto/v1/DigestV2Style;", "getSource", "()Lcom/robinhood/copilot/proto/v1/ArticleSource;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class DigestV2DetailBody extends Message {

    @JvmField
    public static final ProtoAdapter<DigestV2DetailBody> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.ArticleSource#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ArticleSource source;

    @WireField(adapter = "com.robinhood.copilot.proto.v1.DigestV2Style#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final DigestV2Style style;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public DigestV2DetailBody() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ DigestV2DetailBody(String str, String str2, DigestV2Style digestV2Style, ArticleSource articleSource, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? DigestV2Style.DEFAULT_UNSPECIFIED : digestV2Style, (i & 8) != 0 ? null : articleSource, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m22095newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DigestV2Style getStyle() {
        return this.style;
    }

    public final ArticleSource getSource() {
        return this.source;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigestV2DetailBody(String title, String description, DigestV2Style style, ArticleSource articleSource, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.description = description;
        this.style = style;
        this.source = articleSource;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m22095newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DigestV2DetailBody)) {
            return false;
        }
        DigestV2DetailBody digestV2DetailBody = (DigestV2DetailBody) other;
        return Intrinsics.areEqual(unknownFields(), digestV2DetailBody.unknownFields()) && Intrinsics.areEqual(this.title, digestV2DetailBody.title) && Intrinsics.areEqual(this.description, digestV2DetailBody.description) && this.style == digestV2DetailBody.style && Intrinsics.areEqual(this.source, digestV2DetailBody.source);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.description.hashCode()) * 37) + this.style.hashCode()) * 37;
        ArticleSource articleSource = this.source;
        int iHashCode2 = iHashCode + (articleSource != null ? articleSource.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("style=" + this.style);
        ArticleSource articleSource = this.source;
        if (articleSource != null) {
            arrayList.add("source=" + articleSource);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DigestV2DetailBody{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ DigestV2DetailBody copy$default(DigestV2DetailBody digestV2DetailBody, String str, String str2, DigestV2Style digestV2Style, ArticleSource articleSource, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = digestV2DetailBody.title;
        }
        if ((i & 2) != 0) {
            str2 = digestV2DetailBody.description;
        }
        if ((i & 4) != 0) {
            digestV2Style = digestV2DetailBody.style;
        }
        if ((i & 8) != 0) {
            articleSource = digestV2DetailBody.source;
        }
        if ((i & 16) != 0) {
            byteString = digestV2DetailBody.unknownFields();
        }
        ByteString byteString2 = byteString;
        DigestV2Style digestV2Style2 = digestV2Style;
        return digestV2DetailBody.copy(str, str2, digestV2Style2, articleSource, byteString2);
    }

    public final DigestV2DetailBody copy(String title, String description, DigestV2Style style, ArticleSource source, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DigestV2DetailBody(title, description, style, source, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestV2DetailBody.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DigestV2DetailBody>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.copilot.proto.v1.DigestV2DetailBody$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DigestV2DetailBody value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                if (value.getStyle() != DigestV2Style.DEFAULT_UNSPECIFIED) {
                    size += DigestV2Style.ADAPTER.encodedSizeWithTag(3, value.getStyle());
                }
                return value.getSource() != null ? size + ArticleSource.ADAPTER.encodedSizeWithTag(4, value.getSource()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DigestV2DetailBody value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getStyle() != DigestV2Style.DEFAULT_UNSPECIFIED) {
                    DigestV2Style.ADAPTER.encodeWithTag(writer, 3, (int) value.getStyle());
                }
                if (value.getSource() != null) {
                    ArticleSource.ADAPTER.encodeWithTag(writer, 4, (int) value.getSource());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DigestV2DetailBody value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSource() != null) {
                    ArticleSource.ADAPTER.encodeWithTag(writer, 4, (int) value.getSource());
                }
                if (value.getStyle() != DigestV2Style.DEFAULT_UNSPECIFIED) {
                    DigestV2Style.ADAPTER.encodeWithTag(writer, 3, (int) value.getStyle());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DigestV2DetailBody decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DigestV2Style digestV2Style = DigestV2Style.DEFAULT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ArticleSource articleSourceDecode = null;
                DigestV2Style digestV2StyleDecode = digestV2Style;
                String strDecode2 = strDecode;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DigestV2DetailBody(strDecode2, strDecode, digestV2StyleDecode, articleSourceDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            digestV2StyleDecode = DigestV2Style.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 4) {
                        articleSourceDecode = ArticleSource.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DigestV2DetailBody redact(DigestV2DetailBody value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ArticleSource source = value.getSource();
                return DigestV2DetailBody.copy$default(value, null, null, null, source != null ? ArticleSource.ADAPTER.redact(source) : null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
