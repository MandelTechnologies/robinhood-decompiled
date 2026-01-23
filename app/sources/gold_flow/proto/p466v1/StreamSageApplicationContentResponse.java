package gold_flow.proto.p466v1;

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

/* compiled from: StreamSageApplicationContentResponse.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\\\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lgold_flow/proto/v1/StreamSageApplicationContentResponse;", "Lcom/squareup/wire/Message;", "", "url", "", "allowed_urls", "", "hosts_to_open_externally", "allowed_urls_to_open_externally", "allowed_urls_to_open_in_app", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getAllowed_urls", "()Ljava/util/List;", "getHosts_to_open_externally", "getAllowed_urls_to_open_externally", "getAllowed_urls_to_open_in_app", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class StreamSageApplicationContentResponse extends Message {

    @JvmField
    public static final ProtoAdapter<StreamSageApplicationContentResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedUrls", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> allowed_urls;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedUrlsToOpenExternally", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<String> allowed_urls_to_open_externally;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedUrlsToOpenInApp", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> allowed_urls_to_open_in_app;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hostsToOpenExternally", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> hosts_to_open_externally;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String url;

    public StreamSageApplicationContentResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28202newBuilder();
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ StreamSageApplicationContentResponse(String str, List list, List list2, List list3, List list4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? CollectionsKt.emptyList() : list4, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSageApplicationContentResponse(String str, List<String> allowed_urls, List<String> hosts_to_open_externally, List<String> allowed_urls_to_open_externally, List<String> allowed_urls_to_open_in_app, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_externally, "allowed_urls_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_in_app, "allowed_urls_to_open_in_app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.url = str;
        this.allowed_urls = Internal.immutableCopyOf("allowed_urls", allowed_urls);
        this.hosts_to_open_externally = Internal.immutableCopyOf("hosts_to_open_externally", hosts_to_open_externally);
        this.allowed_urls_to_open_externally = Internal.immutableCopyOf("allowed_urls_to_open_externally", allowed_urls_to_open_externally);
        this.allowed_urls_to_open_in_app = Internal.immutableCopyOf("allowed_urls_to_open_in_app", allowed_urls_to_open_in_app);
    }

    public final List<String> getAllowed_urls() {
        return this.allowed_urls;
    }

    public final List<String> getHosts_to_open_externally() {
        return this.hosts_to_open_externally;
    }

    public final List<String> getAllowed_urls_to_open_externally() {
        return this.allowed_urls_to_open_externally;
    }

    public final List<String> getAllowed_urls_to_open_in_app() {
        return this.allowed_urls_to_open_in_app;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28202newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof StreamSageApplicationContentResponse)) {
            return false;
        }
        StreamSageApplicationContentResponse streamSageApplicationContentResponse = (StreamSageApplicationContentResponse) other;
        return Intrinsics.areEqual(unknownFields(), streamSageApplicationContentResponse.unknownFields()) && Intrinsics.areEqual(this.url, streamSageApplicationContentResponse.url) && Intrinsics.areEqual(this.allowed_urls, streamSageApplicationContentResponse.allowed_urls) && Intrinsics.areEqual(this.hosts_to_open_externally, streamSageApplicationContentResponse.hosts_to_open_externally) && Intrinsics.areEqual(this.allowed_urls_to_open_externally, streamSageApplicationContentResponse.allowed_urls_to_open_externally) && Intrinsics.areEqual(this.allowed_urls_to_open_in_app, streamSageApplicationContentResponse.allowed_urls_to_open_in_app);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.url;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.allowed_urls.hashCode()) * 37) + this.hosts_to_open_externally.hashCode()) * 37) + this.allowed_urls_to_open_externally.hashCode()) * 37) + this.allowed_urls_to_open_in_app.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.url;
        if (str != null) {
            arrayList.add("url=" + Internal.sanitize(str));
        }
        if (!this.allowed_urls.isEmpty()) {
            arrayList.add("allowed_urls=" + Internal.sanitize(this.allowed_urls));
        }
        if (!this.hosts_to_open_externally.isEmpty()) {
            arrayList.add("hosts_to_open_externally=" + Internal.sanitize(this.hosts_to_open_externally));
        }
        if (!this.allowed_urls_to_open_externally.isEmpty()) {
            arrayList.add("allowed_urls_to_open_externally=" + Internal.sanitize(this.allowed_urls_to_open_externally));
        }
        if (!this.allowed_urls_to_open_in_app.isEmpty()) {
            arrayList.add("allowed_urls_to_open_in_app=" + Internal.sanitize(this.allowed_urls_to_open_in_app));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamSageApplicationContentResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ StreamSageApplicationContentResponse copy$default(StreamSageApplicationContentResponse streamSageApplicationContentResponse, String str, List list, List list2, List list3, List list4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamSageApplicationContentResponse.url;
        }
        if ((i & 2) != 0) {
            list = streamSageApplicationContentResponse.allowed_urls;
        }
        if ((i & 4) != 0) {
            list2 = streamSageApplicationContentResponse.hosts_to_open_externally;
        }
        if ((i & 8) != 0) {
            list3 = streamSageApplicationContentResponse.allowed_urls_to_open_externally;
        }
        if ((i & 16) != 0) {
            list4 = streamSageApplicationContentResponse.allowed_urls_to_open_in_app;
        }
        if ((i & 32) != 0) {
            byteString = streamSageApplicationContentResponse.unknownFields();
        }
        List list5 = list4;
        ByteString byteString2 = byteString;
        return streamSageApplicationContentResponse.copy(str, list, list2, list3, list5, byteString2);
    }

    public final StreamSageApplicationContentResponse copy(String url, List<String> allowed_urls, List<String> hosts_to_open_externally, List<String> allowed_urls_to_open_externally, List<String> allowed_urls_to_open_in_app, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_externally, "allowed_urls_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_in_app, "allowed_urls_to_open_in_app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new StreamSageApplicationContentResponse(url, allowed_urls, hosts_to_open_externally, allowed_urls_to_open_externally, allowed_urls_to_open_in_app, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StreamSageApplicationContentResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<StreamSageApplicationContentResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.StreamSageApplicationContentResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StreamSageApplicationContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(1, value.getUrl()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getAllowed_urls()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getHosts_to_open_externally()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getAllowed_urls_to_open_externally()) + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getAllowed_urls_to_open_in_app());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StreamSageApplicationContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 1, (int) value.getUrl());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getAllowed_urls());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getHosts_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getAllowed_urls_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAllowed_urls_to_open_in_app());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StreamSageApplicationContentResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAllowed_urls_to_open_in_app());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getAllowed_urls_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getHosts_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getAllowed_urls());
                protoAdapter.encodeWithTag(writer, 1, (int) value.getUrl());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public StreamSageApplicationContentResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new StreamSageApplicationContentResponse(strDecode, arrayList, arrayList2, arrayList3, arrayList4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 3) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 4) {
                        arrayList3.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 5) {
                        arrayList4.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StreamSageApplicationContentResponse redact(StreamSageApplicationContentResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return StreamSageApplicationContentResponse.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }
        };
    }
}
