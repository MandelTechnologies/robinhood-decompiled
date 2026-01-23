package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.Constants;
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

/* compiled from: URLComponents.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/URLComponents;", "Lcom/squareup/wire/Message;", "", "root_url", "", Constants.REFERRER, "query_params", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getRoot_url", "()Ljava/lang/String;", "getReferrer", "getQuery_params", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class URLComponents extends Message {

    @JvmField
    public static final ProtoAdapter<URLComponents> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "queryParams", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String query_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String referrer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rootUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String root_url;

    public URLComponents() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ URLComponents(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24595newBuilder();
    }

    public final String getRoot_url() {
        return this.root_url;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final String getQuery_params() {
        return this.query_params;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLComponents(String root_url, String referrer, String query_params, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(root_url, "root_url");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(query_params, "query_params");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.root_url = root_url;
        this.referrer = referrer;
        this.query_params = query_params;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24595newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof URLComponents)) {
            return false;
        }
        URLComponents uRLComponents = (URLComponents) other;
        return Intrinsics.areEqual(unknownFields(), uRLComponents.unknownFields()) && Intrinsics.areEqual(this.root_url, uRLComponents.root_url) && Intrinsics.areEqual(this.referrer, uRLComponents.referrer) && Intrinsics.areEqual(this.query_params, uRLComponents.query_params);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.root_url.hashCode()) * 37) + this.referrer.hashCode()) * 37) + this.query_params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("root_url=" + Internal.sanitize(this.root_url));
        arrayList.add("referrer=" + Internal.sanitize(this.referrer));
        arrayList.add("query_params=" + Internal.sanitize(this.query_params));
        return CollectionsKt.joinToString$default(arrayList, ", ", "URLComponents{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ URLComponents copy$default(URLComponents uRLComponents, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uRLComponents.root_url;
        }
        if ((i & 2) != 0) {
            str2 = uRLComponents.referrer;
        }
        if ((i & 4) != 0) {
            str3 = uRLComponents.query_params;
        }
        if ((i & 8) != 0) {
            byteString = uRLComponents.unknownFields();
        }
        return uRLComponents.copy(str, str2, str3, byteString);
    }

    public final URLComponents copy(String root_url, String referrer, String query_params, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(root_url, "root_url");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(query_params, "query_params");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new URLComponents(root_url, referrer, query_params, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(URLComponents.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<URLComponents>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.URLComponents$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(URLComponents value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRoot_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRoot_url());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getReferrer());
                }
                return !Intrinsics.areEqual(value.getQuery_params(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getQuery_params()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, URLComponents value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRoot_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRoot_url());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReferrer());
                }
                if (!Intrinsics.areEqual(value.getQuery_params(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuery_params());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, URLComponents value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getQuery_params(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getQuery_params());
                }
                if (!Intrinsics.areEqual(value.getReferrer(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReferrer());
                }
                if (Intrinsics.areEqual(value.getRoot_url(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRoot_url());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public URLComponents redact(URLComponents value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return URLComponents.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public URLComponents decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new URLComponents(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
