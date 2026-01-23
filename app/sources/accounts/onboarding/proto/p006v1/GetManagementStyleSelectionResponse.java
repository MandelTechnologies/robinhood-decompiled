package accounts.onboarding.proto.p006v1;

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

/* compiled from: GetManagementStyleSelectionResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBA\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J@\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Laccounts/onboarding/proto/v1/GetManagementStyleSelectionResponse;", "Lcom/squareup/wire/Message;", "", "rows", "", "Laccounts/onboarding/proto/v1/ManagementStyleRow;", "title", "", "footer_disclosure_markdown", "subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getFooter_disclosure_markdown", "getSubtitle", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetManagementStyleSelectionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetManagementStyleSelectionResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "footerDisclosureMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String footer_disclosure_markdown;

    @WireField(adapter = "accounts.onboarding.proto.v1.ManagementStyleRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<ManagementStyleRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GetManagementStyleSelectionResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4351newBuilder();
    }

    public /* synthetic */ GetManagementStyleSelectionResponse(List list, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getFooter_disclosure_markdown() {
        return this.footer_disclosure_markdown;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetManagementStyleSelectionResponse(List<ManagementStyleRow> rows, String title, String footer_disclosure_markdown, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(footer_disclosure_markdown, "footer_disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.footer_disclosure_markdown = footer_disclosure_markdown;
        this.subtitle = str;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<ManagementStyleRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4351newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetManagementStyleSelectionResponse)) {
            return false;
        }
        GetManagementStyleSelectionResponse getManagementStyleSelectionResponse = (GetManagementStyleSelectionResponse) other;
        return Intrinsics.areEqual(unknownFields(), getManagementStyleSelectionResponse.unknownFields()) && Intrinsics.areEqual(this.rows, getManagementStyleSelectionResponse.rows) && Intrinsics.areEqual(this.title, getManagementStyleSelectionResponse.title) && Intrinsics.areEqual(this.footer_disclosure_markdown, getManagementStyleSelectionResponse.footer_disclosure_markdown) && Intrinsics.areEqual(this.subtitle, getManagementStyleSelectionResponse.subtitle);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.rows.hashCode()) * 37) + this.title.hashCode()) * 37) + this.footer_disclosure_markdown.hashCode()) * 37;
        String str = this.subtitle;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.rows.isEmpty()) {
            arrayList.add("rows=" + this.rows);
        }
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("footer_disclosure_markdown=" + Internal.sanitize(this.footer_disclosure_markdown));
        String str = this.subtitle;
        if (str != null) {
            arrayList.add("subtitle=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetManagementStyleSelectionResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetManagementStyleSelectionResponse copy$default(GetManagementStyleSelectionResponse getManagementStyleSelectionResponse, List list, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getManagementStyleSelectionResponse.rows;
        }
        if ((i & 2) != 0) {
            str = getManagementStyleSelectionResponse.title;
        }
        if ((i & 4) != 0) {
            str2 = getManagementStyleSelectionResponse.footer_disclosure_markdown;
        }
        if ((i & 8) != 0) {
            str3 = getManagementStyleSelectionResponse.subtitle;
        }
        if ((i & 16) != 0) {
            byteString = getManagementStyleSelectionResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return getManagementStyleSelectionResponse.copy(list, str, str4, str3, byteString2);
    }

    public final GetManagementStyleSelectionResponse copy(List<ManagementStyleRow> rows, String title, String footer_disclosure_markdown, String subtitle, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(footer_disclosure_markdown, "footer_disclosure_markdown");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetManagementStyleSelectionResponse(rows, title, footer_disclosure_markdown, subtitle, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetManagementStyleSelectionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetManagementStyleSelectionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: accounts.onboarding.proto.v1.GetManagementStyleSelectionResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetManagementStyleSelectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + ManagementStyleRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getRows());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getFooter_disclosure_markdown(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getFooter_disclosure_markdown());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getSubtitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetManagementStyleSelectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ManagementStyleRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getFooter_disclosure_markdown(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getFooter_disclosure_markdown());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getSubtitle());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetManagementStyleSelectionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getSubtitle());
                if (!Intrinsics.areEqual(value.getFooter_disclosure_markdown(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getFooter_disclosure_markdown());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                ManagementStyleRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetManagementStyleSelectionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetManagementStyleSelectionResponse(arrayList, strDecode, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(ManagementStyleRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetManagementStyleSelectionResponse redact(GetManagementStyleSelectionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetManagementStyleSelectionResponse.copy$default(value, Internal.m26823redactElements(value.getRows(), ManagementStyleRow.ADAPTER), null, null, null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
