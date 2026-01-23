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

/* compiled from: GetAvailableAccountTypesResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBA\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J@\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Laccounts/onboarding/proto/v1/GetAvailableAccountTypesResponse;", "Lcom/squareup/wire/Message;", "", "rows", "", "Laccounts/onboarding/proto/v1/AvailableAccountRow;", "title", "", "subtitle", "promotional_subtitle", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getPromotional_subtitle", "getRows", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "account_onboarding.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class GetAvailableAccountTypesResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetAvailableAccountTypesResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "promotionalSubtitle", schemaIndex = 3, tag = 8)
    private final String promotional_subtitle;

    @WireField(adapter = "accounts.onboarding.proto.v1.AvailableAccountRow#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<AvailableAccountRow> rows;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String title;

    public GetAvailableAccountTypesResponse() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m4347newBuilder();
    }

    public /* synthetic */ GetAvailableAccountTypesResponse(List list, String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getPromotional_subtitle() {
        return this.promotional_subtitle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAvailableAccountTypesResponse(List<AvailableAccountRow> rows, String title, String subtitle, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.subtitle = subtitle;
        this.promotional_subtitle = str;
        this.rows = Internal.immutableCopyOf("rows", rows);
    }

    public final List<AvailableAccountRow> getRows() {
        return this.rows;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m4347newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetAvailableAccountTypesResponse)) {
            return false;
        }
        GetAvailableAccountTypesResponse getAvailableAccountTypesResponse = (GetAvailableAccountTypesResponse) other;
        return Intrinsics.areEqual(unknownFields(), getAvailableAccountTypesResponse.unknownFields()) && Intrinsics.areEqual(this.rows, getAvailableAccountTypesResponse.rows) && Intrinsics.areEqual(this.title, getAvailableAccountTypesResponse.title) && Intrinsics.areEqual(this.subtitle, getAvailableAccountTypesResponse.subtitle) && Intrinsics.areEqual(this.promotional_subtitle, getAvailableAccountTypesResponse.promotional_subtitle);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.rows.hashCode()) * 37) + this.title.hashCode()) * 37) + this.subtitle.hashCode()) * 37;
        String str = this.promotional_subtitle;
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
        arrayList.add("subtitle=" + Internal.sanitize(this.subtitle));
        String str = this.promotional_subtitle;
        if (str != null) {
            arrayList.add("promotional_subtitle=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetAvailableAccountTypesResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetAvailableAccountTypesResponse copy$default(GetAvailableAccountTypesResponse getAvailableAccountTypesResponse, List list, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getAvailableAccountTypesResponse.rows;
        }
        if ((i & 2) != 0) {
            str = getAvailableAccountTypesResponse.title;
        }
        if ((i & 4) != 0) {
            str2 = getAvailableAccountTypesResponse.subtitle;
        }
        if ((i & 8) != 0) {
            str3 = getAvailableAccountTypesResponse.promotional_subtitle;
        }
        if ((i & 16) != 0) {
            byteString = getAvailableAccountTypesResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return getAvailableAccountTypesResponse.copy(list, str, str4, str3, byteString2);
    }

    public final GetAvailableAccountTypesResponse copy(List<AvailableAccountRow> rows, String title, String subtitle, String promotional_subtitle, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetAvailableAccountTypesResponse(rows, title, subtitle, promotional_subtitle, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetAvailableAccountTypesResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetAvailableAccountTypesResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: accounts.onboarding.proto.v1.GetAvailableAccountTypesResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetAvailableAccountTypesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + AvailableAccountRow.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getRows());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getSubtitle());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(8, value.getPromotional_subtitle());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetAvailableAccountTypesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                AvailableAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getPromotional_subtitle());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetAvailableAccountTypesResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getPromotional_subtitle());
                if (!Intrinsics.areEqual(value.getSubtitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getSubtitle());
                }
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getTitle());
                }
                AvailableAccountRow.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getRows());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetAvailableAccountTypesResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = null;
                String strDecode3 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetAvailableAccountTypesResponse(arrayList, strDecode, strDecode3, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(AvailableAccountRow.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 8) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetAvailableAccountTypesResponse redact(GetAvailableAccountTypesResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetAvailableAccountTypesResponse.copy$default(value, Internal.m26823redactElements(value.getRows(), AvailableAccountRow.ADAPTER), null, null, null, ByteString.EMPTY, 14, null);
            }
        };
    }
}
