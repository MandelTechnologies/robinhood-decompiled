package bff_retirement.service.p020v1;

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

/* compiled from: CapitalizeWebViewAllowedUrlsResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B1\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016J0\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lbff_retirement/service/v1/CapitalizeWebViewAllowedUrlsResponse;", "Lcom/squareup/wire/Message;", "", "allowed_urls", "", "", "hosts_to_open_externally", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getAllowed_urls", "()Ljava/util/List;", "getHosts_to_open_externally", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_retirement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class CapitalizeWebViewAllowedUrlsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CapitalizeWebViewAllowedUrlsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedUrls", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> allowed_urls;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hostsToOpenExternally", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> hosts_to_open_externally;

    public CapitalizeWebViewAllowedUrlsResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8530newBuilder();
    }

    public /* synthetic */ CapitalizeWebViewAllowedUrlsResponse(List list, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapitalizeWebViewAllowedUrlsResponse(List<String> allowed_urls, List<String> hosts_to_open_externally, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.allowed_urls = Internal.immutableCopyOf("allowed_urls", allowed_urls);
        this.hosts_to_open_externally = Internal.immutableCopyOf("hosts_to_open_externally", hosts_to_open_externally);
    }

    public final List<String> getAllowed_urls() {
        return this.allowed_urls;
    }

    public final List<String> getHosts_to_open_externally() {
        return this.hosts_to_open_externally;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8530newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CapitalizeWebViewAllowedUrlsResponse)) {
            return false;
        }
        CapitalizeWebViewAllowedUrlsResponse capitalizeWebViewAllowedUrlsResponse = (CapitalizeWebViewAllowedUrlsResponse) other;
        return Intrinsics.areEqual(unknownFields(), capitalizeWebViewAllowedUrlsResponse.unknownFields()) && Intrinsics.areEqual(this.allowed_urls, capitalizeWebViewAllowedUrlsResponse.allowed_urls) && Intrinsics.areEqual(this.hosts_to_open_externally, capitalizeWebViewAllowedUrlsResponse.hosts_to_open_externally);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.allowed_urls.hashCode()) * 37) + this.hosts_to_open_externally.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.allowed_urls.isEmpty()) {
            arrayList.add("allowed_urls=" + Internal.sanitize(this.allowed_urls));
        }
        if (!this.hosts_to_open_externally.isEmpty()) {
            arrayList.add("hosts_to_open_externally=" + Internal.sanitize(this.hosts_to_open_externally));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CapitalizeWebViewAllowedUrlsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CapitalizeWebViewAllowedUrlsResponse copy$default(CapitalizeWebViewAllowedUrlsResponse capitalizeWebViewAllowedUrlsResponse, List list, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = capitalizeWebViewAllowedUrlsResponse.allowed_urls;
        }
        if ((i & 2) != 0) {
            list2 = capitalizeWebViewAllowedUrlsResponse.hosts_to_open_externally;
        }
        if ((i & 4) != 0) {
            byteString = capitalizeWebViewAllowedUrlsResponse.unknownFields();
        }
        return capitalizeWebViewAllowedUrlsResponse.copy(list, list2, byteString);
    }

    public final CapitalizeWebViewAllowedUrlsResponse copy(List<String> allowed_urls, List<String> hosts_to_open_externally, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CapitalizeWebViewAllowedUrlsResponse(allowed_urls, hosts_to_open_externally, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CapitalizeWebViewAllowedUrlsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CapitalizeWebViewAllowedUrlsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_retirement.service.v1.CapitalizeWebViewAllowedUrlsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CapitalizeWebViewAllowedUrlsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getAllowed_urls()) + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getHosts_to_open_externally());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CapitalizeWebViewAllowedUrlsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getAllowed_urls());
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getHosts_to_open_externally());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CapitalizeWebViewAllowedUrlsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getHosts_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getAllowed_urls());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CapitalizeWebViewAllowedUrlsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CapitalizeWebViewAllowedUrlsResponse(arrayList, arrayList2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag == 2) {
                        arrayList2.add(ProtoAdapter.STRING.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CapitalizeWebViewAllowedUrlsResponse redact(CapitalizeWebViewAllowedUrlsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CapitalizeWebViewAllowedUrlsResponse.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
