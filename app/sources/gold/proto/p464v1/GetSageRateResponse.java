package gold.proto.p464v1;

import com.plaid.internal.EnumC7081g;
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

/* compiled from: GetSageRateResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 Bg\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0017\u001a\u00020\u0002H\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016Jf\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006!"}, m3636d2 = {"Lgold/proto/v1/GetSageRateResponse;", "Lcom/squareup/wire/Message;", "", "url", "", "cta_text", "allowed_urls", "", "hosts_to_open_externally", "allowed_urls_to_open_externally", "allowed_urls_to_open_in_app", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lokio/ByteString;)V", "getUrl", "()Ljava/lang/String;", "getCta_text", "getAllowed_urls", "()Ljava/util/List;", "getHosts_to_open_externally", "getAllowed_urls_to_open_externally", "getAllowed_urls_to_open_in_app", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "gold.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetSageRateResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetSageRateResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedUrls", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> allowed_urls;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedUrlsToOpenExternally", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    private final List<String> allowed_urls_to_open_externally;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedUrlsToOpenInApp", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<String> allowed_urls_to_open_in_app;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaText", schemaIndex = 1, tag = 2)
    private final String cta_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "hostsToOpenExternally", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<String> hosts_to_open_externally;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String url;

    public GetSageRateResponse() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28126newBuilder();
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ GetSageRateResponse(String str, String str2, List list, List list2, List list3, List list4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? CollectionsKt.emptyList() : list3, (i & 32) != 0 ? CollectionsKt.emptyList() : list4, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getCta_text() {
        return this.cta_text;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSageRateResponse(String url, String str, List<String> allowed_urls, List<String> hosts_to_open_externally, List<String> allowed_urls_to_open_externally, List<String> allowed_urls_to_open_in_app, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_externally, "allowed_urls_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_in_app, "allowed_urls_to_open_in_app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.url = url;
        this.cta_text = str;
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
    public /* synthetic */ Void m28126newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetSageRateResponse)) {
            return false;
        }
        GetSageRateResponse getSageRateResponse = (GetSageRateResponse) other;
        return Intrinsics.areEqual(unknownFields(), getSageRateResponse.unknownFields()) && Intrinsics.areEqual(this.url, getSageRateResponse.url) && Intrinsics.areEqual(this.cta_text, getSageRateResponse.cta_text) && Intrinsics.areEqual(this.allowed_urls, getSageRateResponse.allowed_urls) && Intrinsics.areEqual(this.hosts_to_open_externally, getSageRateResponse.hosts_to_open_externally) && Intrinsics.areEqual(this.allowed_urls_to_open_externally, getSageRateResponse.allowed_urls_to_open_externally) && Intrinsics.areEqual(this.allowed_urls_to_open_in_app, getSageRateResponse.allowed_urls_to_open_in_app);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37;
        String str = this.cta_text;
        int iHashCode2 = ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.allowed_urls.hashCode()) * 37) + this.hosts_to_open_externally.hashCode()) * 37) + this.allowed_urls_to_open_externally.hashCode()) * 37) + this.allowed_urls_to_open_in_app.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("url=" + Internal.sanitize(this.url));
        String str = this.cta_text;
        if (str != null) {
            arrayList.add("cta_text=" + Internal.sanitize(str));
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSageRateResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetSageRateResponse copy$default(GetSageRateResponse getSageRateResponse, String str, String str2, List list, List list2, List list3, List list4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSageRateResponse.url;
        }
        if ((i & 2) != 0) {
            str2 = getSageRateResponse.cta_text;
        }
        if ((i & 4) != 0) {
            list = getSageRateResponse.allowed_urls;
        }
        if ((i & 8) != 0) {
            list2 = getSageRateResponse.hosts_to_open_externally;
        }
        if ((i & 16) != 0) {
            list3 = getSageRateResponse.allowed_urls_to_open_externally;
        }
        if ((i & 32) != 0) {
            list4 = getSageRateResponse.allowed_urls_to_open_in_app;
        }
        if ((i & 64) != 0) {
            byteString = getSageRateResponse.unknownFields();
        }
        List list5 = list4;
        ByteString byteString2 = byteString;
        List list6 = list3;
        List list7 = list;
        return getSageRateResponse.copy(str, str2, list7, list2, list6, list5, byteString2);
    }

    public final GetSageRateResponse copy(String url, String cta_text, List<String> allowed_urls, List<String> hosts_to_open_externally, List<String> allowed_urls_to_open_externally, List<String> allowed_urls_to_open_in_app, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(allowed_urls, "allowed_urls");
        Intrinsics.checkNotNullParameter(hosts_to_open_externally, "hosts_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_externally, "allowed_urls_to_open_externally");
        Intrinsics.checkNotNullParameter(allowed_urls_to_open_in_app, "allowed_urls_to_open_in_app");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetSageRateResponse(url, cta_text, allowed_urls, hosts_to_open_externally, allowed_urls_to_open_externally, allowed_urls_to_open_in_app, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetSageRateResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetSageRateResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold.proto.v1.GetSageRateResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetSageRateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUrl());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                return size + protoAdapter.encodedSizeWithTag(2, value.getCta_text()) + protoAdapter.asRepeated().encodedSizeWithTag(3, value.getAllowed_urls()) + protoAdapter.asRepeated().encodedSizeWithTag(4, value.getHosts_to_open_externally()) + protoAdapter.asRepeated().encodedSizeWithTag(5, value.getAllowed_urls_to_open_externally()) + protoAdapter.asRepeated().encodedSizeWithTag(6, value.getAllowed_urls_to_open_in_app());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetSageRateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUrl(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUrl());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCta_text());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getAllowed_urls());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getHosts_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAllowed_urls_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getAllowed_urls_to_open_in_app());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetSageRateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 6, (int) value.getAllowed_urls_to_open_in_app());
                protoAdapter.asRepeated().encodeWithTag(writer, 5, (int) value.getAllowed_urls_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 4, (int) value.getHosts_to_open_externally());
                protoAdapter.asRepeated().encodeWithTag(writer, 3, (int) value.getAllowed_urls());
                protoAdapter.encodeWithTag(writer, 2, (int) value.getCta_text());
                if (Intrinsics.areEqual(value.getUrl(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getUrl());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetSageRateResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 4:
                                arrayList2.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 5:
                                arrayList3.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 6:
                                arrayList4.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new GetSageRateResponse(strDecode, strDecode2, arrayList, arrayList2, arrayList3, arrayList4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetSageRateResponse redact(GetSageRateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetSageRateResponse.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }
}
